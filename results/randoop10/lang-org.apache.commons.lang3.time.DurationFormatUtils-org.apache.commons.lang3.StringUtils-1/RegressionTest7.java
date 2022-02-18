import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", "HI!                          ...", 10);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "0 days 0 hours 0 minutes 0 seco");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("44444444444444444444444444444444444444 HI!", strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("canada", "\u671d\u9c9c\u6587");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\uc911\uad6d\uc5b4\uc911\uad6d)!ih!ih!ih!ih!ih!i", 0, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        java.time.ZoneId zoneId16 = timeZone13.toZoneId();
        java.util.TimeZone timeZone17 = java.util.TimeZone.getTimeZone(zoneId16);
        boolean boolean18 = timeZone17.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone17);
        java.util.TimeZone timeZone21 = java.util.TimeZone.getTimeZone("HI!");
        boolean boolean22 = timeZone17.hasSameRules(timeZone21);
        java.util.Locale locale24 = java.util.Locale.ROOT;
        java.util.Locale locale27 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.lang.String str28 = locale24.getDisplayCountry(locale27);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.upperCase("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", locale24);
        java.lang.String str30 = locale24.getScript();
        java.lang.String str31 = locale24.getISO3Country();
        java.lang.String str32 = timeZone17.getDisplayName(locale24);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals(locale27.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str29, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Greenwich Mean Time" + "'", str32, "Greenwich Mean Time");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Heure de Greenwich", "P0Y0M0DT0H0M0.041S", 100);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Heure de Greenwich" + "'", str4, "Heure de Greenwich");
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("'4P4'4yyyy4'4Y4'4M4'4M4'4d4'4DT4'4H4'4H4'4m4'4M4'4s4.4S4'4S", "Rf");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'4P4'4yyyy4'4Y4'4M4'4M4'4d4'4DT4'4H4'4H4'4m4'4M4'4s4.4S4'4S" + "'", str2, "'4P4'4yyyy4'4Y4'4M4'4M4'4d4'4DT4'4H4'4H4'4m4'4M4'4s4.4S4'4S");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        java.lang.String[] strArray2 = java.util.TimeZone.getAvailableIDs((int) '#');
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("\u4e2d\u6587", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("00DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.09015", "P0Y0M0DT0H0M0.121S", 30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00DT00P0Y0M0DT0H0M0.121S.09015" + "'", str3, "00DT00P0Y0M0DT0H0M0.121S.09015");
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.lang.String str3 = locale0.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale0.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese" + "'", str2, "Chinese");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CHN" + "'", str3, "CHN");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder5.setLanguage("und");
        java.util.Locale.Builder builder8 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("      0e-de      ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:       0e-de       [at index 0]");
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
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAYchinois");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("P0Y0M0DT0H0M0.000S", 4, 18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "M0DT0H0M0.000S" + "'", str3, "M0DT0H0M0.000S");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("99.00:00:0", "can");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("zh", "zh_TW");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        java.util.Locale locale2 = new java.util.Locale("44444444444444444444444444444444444444 HI!", "zh_CNzhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz");
        java.lang.String str3 = locale2.getDisplayName();
        org.junit.Assert.assertEquals(locale2.toString(), "44444444444444444444444444444444444444 hi!_ZH_CNZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444 hi! (ZH_CNZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZ)" + "'", str3, "44444444444444444444444444444444444444 hi! (ZH_CNZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZ)");
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ih");
        boolean boolean3 = languageRange1.equals((java.lang.Object) "!i0");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale2);
        java.lang.String str4 = locale0.getDisplayVariant(locale2);
        java.lang.String str5 = locale0.getDisplayVariant();
        java.util.Set<java.lang.Character> charSet6 = locale0.getExtensionKeys();
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charSet6);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("");
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone6);
        boolean boolean8 = timeZone6.observesDaylightTime();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("");
        java.lang.String str15 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone14);
        boolean boolean16 = timeZone6.hasSameRules(timeZone14);
        boolean boolean17 = timeZone0.hasSameRules(timeZone6);
        boolean boolean18 = timeZone0.observesDaylightTime();
        boolean boolean19 = timeZone0.observesDaylightTime();
        int int21 = timeZone0.getOffset((long) '4');
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("ih", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihih" + "'", str2, "ihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihih");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("eng", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "engeng" + "'", str2, "engeng");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
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
        int int20 = timeZone6.getRawOffset();
        boolean boolean21 = timeZone6.observesDaylightTime();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = timeZone6.getOffset(13, 98, 13, (int) 'a', 70, 57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zoneId19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.Locale locale6 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        java.util.Collection<java.util.Locale> localeCollection7 = null;
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList9 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection7, filteringMode8);
        java.util.Locale locale12 = new java.util.Locale("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECON", "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap17);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList18, '#');
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode8.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList9);
        org.junit.Assert.assertEquals(locale12.toString(), "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon_'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                                                     !I0", (java.lang.CharSequence) "0:00:00.100");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ZH_TW", "               zh               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("P0Y0M0DT0H0M0.020S", "                                         ", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("########chinese (china)#########", "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########chinese (china)#########" + "'", str2, "########chinese (china)#########");
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("undundun_0 DAYS 0 HOURS 0 MINUTES 0 SECONDSundundund", "                                 P-1Y11M30DT23H59M59.947S0DT0H0M0.090S!P0Y0M0DT0H0M0.090S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "undundun_0 DAYS 0 HOURS 0 MINUTES 0 SECONDSundundund" + "'", str2, "undundun_0 DAYS 0 HOURS 0 MINUTES 0 SECONDSundundund");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\u6cd5\u6587\u6cd5\u56fd))", (java.lang.CharSequence) "P-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("P-1Y11M30DT23H59M59.999");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty(" #####################################################################################################################  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################################################################################################################" + "'", str1, "#####################################################################################################################");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("               zh               ", "deHI!44444444444444444444444444444", "P0Y0M0DT0H0M0.041S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               zh               " + "'", str3, "               zh               ");
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        int int2 = timeZone1.getRawOffset();
        java.lang.String str3 = timeZone1.getID();
        int int4 = timeZone1.getRawOffset();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone("");
        java.lang.String str12 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone11);
        boolean boolean13 = timeZone11.observesDaylightTime();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone("");
        java.lang.String str20 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone19);
        boolean boolean21 = timeZone11.hasSameRules(timeZone19);
        boolean boolean22 = timeZone5.hasSameRules(timeZone11);
        boolean boolean23 = timeZone5.observesDaylightTime();
        java.time.ZoneId zoneId24 = timeZone5.toZoneId();
        boolean boolean25 = timeZone1.hasSameRules(timeZone5);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = timeZone1.getOffset(47, 23, 120, 9, 100, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GMT" + "'", str3, "GMT");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u4e2d\u6587" + "'", str20, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zoneId24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0:00:00.096", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        java.util.Locale locale3 = new java.util.Locale("                                                                                                                                                                                                                                                                                                                              p0y0m0dt0h0m0.090s", "anglais(Canada)", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        org.junit.Assert.assertEquals(locale3.toString(), "                                                                                                                                                                                                                                                                                                                              p0y0m0dt0h0m0.090s_ANGLAIS(CANADA)_'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("WWWWWWWWWW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "WWWWWWWWWW" + "'", str1, "WWWWWWWWWW");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "P0Y0M0DT0H0M0.041S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\u4e2d\u6587!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ip0y0m0dt0h0m0.090s", "UN00UNUN_0 day32 0 0our32 0 0inute032 0 econdUN000UNUN", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097");
        java.util.Locale locale3 = new java.util.Locale("");
        java.util.Locale locale5 = new java.util.Locale("\u4e2d\u6587");
        java.lang.String str6 = locale3.getDisplayScript(locale5);
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("P0Y0M0DT0H0M0.034S");
        java.lang.String str9 = locale5.getDisplayName(locale8);
        java.lang.String str10 = locale5.getDisplayScript();
        java.lang.String str11 = locale1.getDisplayCountry(locale5);
        boolean boolean12 = locale5.hasExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u6587" + "'", str9, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("Engli0h (Unite0 120tate0)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Engli0h (Unite0 120tate0)" + "'", str1, "Engli0h (Unite0 120tate0)");
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("xChinesischxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0M0DT0H0M0.001S", "!IH");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih", 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", strArray3, strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str7, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!ih" + "'", str8, "!ih");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "!ih" + "'", str9, "!ih");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!ih" + "'", str11, "!ih");
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((-1L), true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("de_zh_tw (P0Y0-10DT07430-10.0343", "Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\347\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("p0y0m0dt0h0m0.090s", "P0Y0M0DT0H0M0.023S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("fR", "                                                                                                                     !I0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                                                                                                                                          44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ZH_TW", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                          44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ZH_TW" + "'", str2, "                                                                                                                                                                                                                          44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ZH_TW");
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\uc911\uad6d\uc5b4\uc911\uad6d\uc911\uad6d\uc5b4\uc911\uad6d\uc911\uad6d\uc5b4\uc911\uad6d\uc911\uad6d\uc5b4\uc911\uad6d\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale locale6 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("p000000t00000.0230");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: p000000t00000.0230 [at index 0]");
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
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("0:00:00.089", "p0y0m0dt0h0m0.020s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihih", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 42);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.042S" + "'", str1, "P0Y0M0DT0H0M0.042S");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("Chinese (China)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese (China)" + "'", str1, "Chinese (China)");
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("   tChinesisch (China)", (-1), "4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   tChinesisch (China)" + "'", str3, "   tChinesisch (China)");
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        java.util.Locale locale2 = new java.util.Locale("", "P0Y0M0DT0H0M0.010S");
        java.lang.String str3 = locale2.getCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "_P0Y0M0DT0H0M0.010S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str3, "P0Y0M0DT0H0M0.010S");
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("");
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone6);
        boolean boolean8 = timeZone6.observesDaylightTime();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("");
        java.lang.String str15 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone14);
        boolean boolean16 = timeZone6.hasSameRules(timeZone14);
        boolean boolean17 = timeZone0.hasSameRules(timeZone6);
        boolean boolean18 = timeZone6.observesDaylightTime();
        java.util.TimeZone timeZone20 = java.util.TimeZone.getTimeZone("");
        int int21 = timeZone20.getRawOffset();
        int int22 = timeZone20.getRawOffset();
        timeZone20.setID("0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
        java.util.TimeZone timeZone26 = java.util.TimeZone.getTimeZone("");
        int int27 = timeZone26.getRawOffset();
        java.lang.String str28 = timeZone26.getID();
        java.time.ZoneId zoneId29 = timeZone26.toZoneId();
        boolean boolean30 = timeZone20.hasSameRules(timeZone26);
        boolean boolean31 = timeZone26.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone26);
        boolean boolean33 = timeZone6.hasSameRules(timeZone26);
        java.time.ZoneId zoneId34 = timeZone26.toZoneId();
        java.util.TimeZone timeZone35 = java.util.TimeZone.getTimeZone(zoneId34);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "GMT" + "'", str28, "GMT");
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(zoneId34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("p000000t00000.0230");
        java.lang.Class<?> wildcardClass2 = timeZone1.getClass();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0 DAYS 0 HOURS 0 MINUTES 0 SECOND", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 DAYS..." + "'", str2, "0 DAYS...");
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("HI!44444444444444444444444444444", "gmt");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("H!ih!ih!ih!ih!ih!ih!iP0Y0-10DT07430-10.1213599678", "ihihtestestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm'ss's'");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!ih!ih!ih!ih!ih!ih!iP0Y0-10DT07430-10.1213599678" + "'", str2, "H!ih!ih!ih!ih!ih!ih!iP0Y0-10DT07430-10.1213599678");
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setExtension(' ', "p0y0m0dt0h0m0.090s");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "dnu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "dnu" + "'", str1, "dnu");
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H" + "'", str1, "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H");
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Locale.Category category5 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category5, locale6);
        java.lang.String str8 = locale6.getLanguage();
        java.lang.String str9 = locale4.getDisplayScript(locale6);
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale13 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.lang.String str15 = locale13.getDisplayName(locale14);
        java.lang.String str16 = locale4.getDisplayScript(locale14);
        java.lang.String str17 = locale4.getScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en" + "'", str8, "en");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals(locale13.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str15, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ZH_TW", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44" + "'", str2, "44");
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "#######p0y0m0dt0h0m0.000s#######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######p0y0m0dt0h0m0.000s#######" + "'", str1, "#######p0y0m0dt0h0m0.000s#######");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "           HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap16 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap16);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, '4');
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category7.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuu" + "'", str2, "...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuu");
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.052S" + "'", str1, "P0Y0M0DT0H0M0.052S");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "P0Y0-10DT07430-10.1213599678", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "P0Y0-10DT07430-10.1213599678" + "'", charSequence2, "P0Y0-10DT07430-10.1213599678");
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444440 DAYS 0 HOURS 0 MINUTES 0 SECO");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Germany##############################################################################################################", "fran\347\uc911\uad6d\uc5b4\uc911\uad6d)", "               zh               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Germany##############################################################################################################" + "'", str3, "Germany##############################################################################################################");
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "...ch0eure0eGr...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("ANGLAIS (CANADA)");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "GBP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("       p0y0m0dt0h0m0.041s       ", "xxxxxxxxxxxxxxxxxxxxxxxxxxchinaxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       p0y0m0dt0h0m0.041s       " + "'", str2, "       p0y0m0dt0h0m0.041s       ");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097", (int) (short) 10, "!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097" + "'", str3, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.Category category3 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category3, locale4);
        java.util.Set<java.lang.String> strSet6 = locale4.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "P00-1Y11M30DT23H59M59.991S");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, 'u');
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("Chine0e", "STESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'NGLISH (uNITED kINGDOM)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 31, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
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
        timeZone6.setID("P0Y0M0DT0H0M0.010S");
        timeZone6.setID("P-1Y11M30DT23H59M59.989S");
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zoneId19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GMT" + "'", str20, "GMT");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "GMT" + "'", str24, "GMT");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u4e2d\u6587" + "'", str33, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u4e2d\u6587" + "'", str41, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(zoneId45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("");
        java.lang.String str10 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone9);
        boolean boolean11 = timeZone9.observesDaylightTime();
        java.util.TimeZone timeZone17 = java.util.TimeZone.getTimeZone("");
        java.lang.String str18 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone17);
        boolean boolean19 = timeZone9.hasSameRules(timeZone17);
        int int21 = timeZone17.getOffset((long) (short) 10);
        java.lang.String str22 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 318, (long) (byte) 100, "fr4n\347\uc911\uad6d\uc5b4\uc911\uad6d)", true, timeZone17);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u6587" + "'", str10, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u6587" + "'", str18, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "fr4n\347\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str22, "fr4n\347\uc911\uad6d\uc5b4\uc911\uad6d)");
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        java.util.Locale locale1 = java.util.Locale.ROOT;
        java.util.Locale locale4 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.lang.String str5 = locale1.getDisplayCountry(locale4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", locale1);
        java.lang.String str7 = locale1.getISO3Language();
        java.lang.String str8 = locale1.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale4.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str6, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("M0DT0H0M0.000S", "ihihtestestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm'ss's'");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO(0L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str1, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", "0:00:00.120");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S" + "'", str2, "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("fR", "0:00:00.000", 41);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("un0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "un0" + "'", str1, "un0");
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int6 = timeZone5.getRawOffset();
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 41, (long) 52, "tes", false, timeZone5);
        timeZone5.setRawOffset(104);
        boolean boolean10 = timeZone5.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "te0" + "'", str7, "te0");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder5.setLanguage("und");
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getScript();
        java.util.Locale.Builder builder11 = builder7.setLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setScript("0I!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 0I! [at index 0]");
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
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinesisch (China)", "      0e-de      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("stestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", '#');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("FRA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FRA" + "'", str1, "FRA");
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("#######P0Y0M0DT0H0M0.000S#######", "P0Y0M0DT0H0M0.015S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize(charSequence0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 335, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("zh-CN", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444zh_tw");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0I!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("P0Y0M0DT0H0M0.001S", (java.lang.Object[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("4P404Y404M404DT404H404M404.40904Shi4P404Y404M404DT404H404M404.40904S4!4P404Y404M404DT404H404M404.40904S4", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0I!" + "'", str4, "0I!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        java.util.Locale locale2 = new java.util.Locale("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                        ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale2.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for                 P0Y0M0DT0H0M0.090SHIP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                        ");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's_                P0Y0M0DT0H0M0.090SHIP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                        ");
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("p0y0m0dt0h0m0.041s", "I!", "EN-GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p0y0m0dt0h0m0.041s" + "'", str3, "p0y0m0dt0h0m0.041s");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        java.util.Locale locale2 = new java.util.Locale("p-1Y11M30DT23H59M59.975S", "ih");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.Class<?> wildcardClass4 = locale2.getClass();
        org.junit.Assert.assertEquals(locale2.toString(), "p-1y11m30dt23h59m59.975s_IH");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int10 = timeZone9.getRawOffset();
        java.lang.String str11 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y0M0DT0H0M0.023S", false, timeZone9);
        java.lang.String str12 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) 'x', "CAN", true, timeZone9);
        java.lang.String str13 = timeZone9.getID();
        java.lang.Object obj14 = timeZone9.clone();
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y000DT00000.0230" + "'", str11, "P0Y000DT00000.0230");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CAN" + "'", str12, "CAN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GMT" + "'", str13, "GMT");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        int int2 = timeZone1.getRawOffset();
        int int3 = timeZone1.getRawOffset();
        timeZone1.setID("0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("99.00:00:0");
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.util.Locale locale11 = locale10.stripExtensions();
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale10);
        java.util.Locale.Builder builder13 = builder8.setLocale(locale10);
        java.lang.String str14 = locale7.getDisplayLanguage(locale10);
        java.lang.String str15 = locale7.getDisplayScript();
        java.lang.String str16 = timeZone1.getDisplayName(locale7);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "99.00:00:0" + "'", str12, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GMT+00:00" + "'", str16, "GMT+00:00");
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                 P0Y0M0DT0H0M0.121S", "'P'yyyy''''d''''m''s.''");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 P0Y0M0DT0H0M0.121S" + "'", str2, "                 P0Y0M0DT0H0M0.121S");
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
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
            java.lang.String str20 = timeZone10.getDisplayName(false, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GMT" + "'", str12, "GMT");
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 24);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.024" + "'", str1, "0:00:00.024");
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("44P0Y0-10DT07430-10.034359               ZH_TW (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               44P0Y0-10DT07430-10.0343599", "can");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!HI", "Chinese", 9);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int3 = timeZone1.getOffset((long) 153);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int3 = timeZone1.getOffset((long) (byte) 0);
        java.util.TimeZone.setDefault(timeZone1);
        timeZone1.setRawOffset((int) (byte) 10);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("P0Y0M0DT0H0M0.090S0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 ho", "4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444zh_tw");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone13.observesDaylightTime();
        java.util.TimeZone timeZone21 = java.util.TimeZone.getTimeZone("");
        java.lang.String str22 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone21);
        boolean boolean23 = timeZone13.hasSameRules(timeZone21);
        java.time.ZoneId zoneId24 = timeZone21.toZoneId();
        timeZone21.setID("\u4e2d\u6587!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!ih!ih!...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        java.lang.String str27 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) 96, "p0y000dt00000.0230", true, timeZone21);
        int int28 = timeZone21.getRawOffset();
        java.lang.String str29 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) 'a', "Germany", true, timeZone21);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u4e2d\u6587" + "'", str22, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(zoneId24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "p000000t00000.0230" + "'", str27, "p000000t00000.0230");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Ger0an0" + "'", str29, "Ger0an0");
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("P00-1Y11M30DT23H59M59.991S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P00-1Y11M30DT23H59M59.991S" + "'", str1, "P00-1Y11M30DT23H59M59.991S");
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("zh_44444444444444444444444444444zh_", 5, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_44444444444444444444444444444zh_" + "'", str3, "zh_44444444444444444444444444444zh_");
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("zho", "\u4e2d\u6587_                                                                                                    ", 224);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "H0M0.090SHIP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("de-DE", "####################################################################################################################", "P0Y0M0DT0H0M0.068S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "de-DE" + "'", str3, "de-DE");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("United Kingdom", "                4P404Y404M404DT404H404M404.40904Shi4P404Y404M404DT404H404M404.40904S4!4P404Y404M404DT404H404M404.40904S4                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "United Kingdom" + "'", str2, "United Kingdom");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                     ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.lang.String str4 = locale0.getExtension('u');
        java.util.Locale locale5 = locale0.stripExtensions();
        java.lang.String str6 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TW" + "'", str6, "TW");
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("     4444444444444444444444444444444444444444444444444444      ", "I!", "P0Y000DT00000.00120");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("fR", "Greenwich Mean Time", "44444444444444444444444444444444444444           HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fR" + "'", str3, "fR");
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clear();
        java.util.Locale.Builder builder9 = builder3.setLanguageTag("tes");
        java.util.Locale locale10 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder3.setLanguage("\u6cd5\u6587\u6cd5\u56fd))");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: !ih (P0Y0M0DT0H0M0.034S,?? (??)) [at index 0]");
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
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "tes");
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clear();
        java.util.Locale.Builder builder9 = builder3.setLanguageTag("tes");
        java.util.Locale locale10 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder3.setUnicodeLocaleKeyword("P0Y0-10DT07430-10.1213599678", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: P0Y0-10DT07430-10.1213599678 [at index 0]");
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
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "tes");
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("00DT00P0Y0M0DT0H0M0.121S.09015", "                                                P0Y0M0DT0H0M0.090SHIP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00DT00P0Y0M0DT0H0M0.121S.09015" + "'", str2, "00DT00P0Y0M0DT0H0M0.121S.09015");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.lang.String str9 = locale8.getDisplayVariant();
        java.lang.String str10 = locale8.getVariant();
        java.util.Locale.Builder builder11 = builder6.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder6.setExtension(' ', "!i");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
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
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                zh" + "'", str1, "                zh");
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "P-1Y11030DT23059059.99914");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P-1Y11030DT23059059.99914" + "'", str1, "P-1Y11030DT23059059.99914");
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00          0I!          0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:", (java.lang.CharSequence) "EN-GB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("P0Y0-10DT07430-10.0343599900", (int) (byte) 0, 17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0-10DT07430-10" + "'", str3, "P0Y0-10DT07430-10");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.addUnicodeLocaleAttribute("Heure de Greenwich");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Heure de Greenwich [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "0 days 0 hours 0 minutes 0 seconds                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00                                                                  " + "'", str2, "0 0a000 0 hour 0 0inute00 0 econ00                                                                  ");
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
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
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Locale[] localeArray26 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList27 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList27, localeArray26);
        java.util.Locale locale29 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.util.Locale>) localeList27);
        java.util.Collection<java.lang.String> strCollection30 = null;
        java.util.Locale.FilteringMode filteringMode31 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, strCollection30, filteringMode31);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap34 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.parse("en", strMap34);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Locale[] localeArray39 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList40 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList40, localeArray39);
        java.util.Locale locale42 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.util.Locale>) localeList40);
        java.util.Locale locale43 = java.util.Locale.PRC;
        java.util.Locale locale45 = java.util.Locale.GERMANY;
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale45);
        java.lang.String str47 = locale43.getDisplayVariant(locale45);
        java.util.Locale locale48 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet49 = locale48.getUnicodeLocaleKeys();
        java.util.Locale locale50 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet51 = locale50.getUnicodeLocaleKeys();
        java.util.Locale locale52 = java.util.Locale.CHINESE;
        java.lang.String str53 = locale50.getDisplayName(locale52);
        java.util.Locale locale54 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray55 = new java.util.Locale[] { locale43, locale48, locale50, locale54 };
        java.util.ArrayList<java.util.Locale> localeList56 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList56, localeArray55);
        java.util.Locale locale58 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.util.Locale>) localeList56);
        java.util.Locale.FilteringMode filteringMode59 = null;
        java.util.List<java.util.Locale> localeList60 = java.util.Locale.filter(languageRangeList35, (java.util.Collection<java.util.Locale>) localeList56, filteringMode59);
        java.util.Locale locale61 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet62 = locale61.getUnicodeLocaleKeys();
        java.util.Locale locale63 = java.util.Locale.CHINESE;
        java.lang.String str64 = locale61.getDisplayName(locale63);
        java.lang.String str65 = locale63.getLanguage();
        java.util.Set<java.lang.String> strSet66 = locale63.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray67 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList68 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList68, languageRangeArray67);
        java.util.Locale[] localeArray70 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList71 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList71, localeArray70);
        java.util.Locale locale73 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList68, (java.util.Collection<java.util.Locale>) localeList71);
        java.util.Collection<java.lang.String> strCollection74 = null;
        java.util.Locale.FilteringMode filteringMode75 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList76 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList68, strCollection74, filteringMode75);
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags(languageRangeList35, (java.util.Collection<java.lang.String>) strSet66, filteringMode75);
        java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection30, filteringMode75);
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
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(locale29);
        org.junit.Assert.assertTrue("'" + filteringMode31 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode31.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(languageRangeList35);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(localeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(locale42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str53, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(locale58);
        org.junit.Assert.assertNotNull(localeList60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str64, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "zh" + "'", str65, "zh");
        org.junit.Assert.assertNotNull(strSet66);
        org.junit.Assert.assertNotNull(languageRangeArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(localeArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(locale73);
        org.junit.Assert.assertTrue("'" + filteringMode75 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode75.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(strList78);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("p0y0m0dt0h0m0.090s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "44p0y0m0dt0h0m0.090s4444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("United Kingdom", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        java.util.Locale locale2 = new java.util.Locale("ihihtestestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm'ss's'", "P0Y0M0DT0H0M0.031S");
        org.junit.Assert.assertEquals(locale2.toString(), "ihihtestestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm'ss's'_P0Y0M0DT0H0M0.031S");
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("en-GB", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-GB" + "'", str2, "en-GB");
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0danaC:danaC00danaC:danaC00danaC.danaC097", 70, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0danaC:danaC00danaC:danaC00danaC.danaC097xxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str3, "0danaC:danaC00danaC:danaC00danaC.danaC097xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                          " + "'", str2, "                                          ");
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        char[] charArray10 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("zh", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\u4e2d\u6587!ih!ih!i                                                                                              ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 41 + "'", int12 == 41);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale.Builder builder7 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder4.addUnicodeLocaleAttribute("\u683c\u6797\u5a01\u6cbb\u6642\u9593");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                                           ?????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("ENGLISH (UNITED STATES)", "p-1Y11M30DT23H59M59.975S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("               zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               ", "          0I!          ", 17);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en" + "'", str1, "en");
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("P0Y0-10DT07430-10.0343599900I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0-10DT07430-10.0343599900I!" + "'", str1, "P0Y0-10DT07430-10.0343599900I!");
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("p0y0m0dt0h0m0.041s");
        boolean boolean2 = locale1.hasExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              " + "'", str2, "                              ");
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("de_DE", "0 days 0 hours 0 minutes 0 seconds                                                                  ", "\u671d\u9c9c\u6587", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "de_DE" + "'", str4, "de_DE");
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                  ", "0 days 0 hours 0 minutes 0 seconds                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                              !I0                                      P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", "                                                                                                                     !I0", "           HI!", 9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                    HI!                                      P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S" + "'", str4, "                    HI!                                      P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S");
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.Locale locale6 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        java.util.Collection<java.util.Locale> localeCollection7 = null;
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList9 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection7, filteringMode8);
        java.util.Locale locale12 = new java.util.Locale("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECON", "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap15);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, '#');
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode8.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList9);
        org.junit.Assert.assertEquals(locale12.toString(), "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon_'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("CN", "\uc5b4\uad6d\uc911\uad6d\uc911(");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CN" + "'", str2, "CN");
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("!i0", 14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!i0" + "'", str2, "!i0");
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0P0Y0M0DT0H0M0.020S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=_0days0hours0minutes0seconds_0days0hours0minutes0seconds_0days0p0y0m0dt0h0m0.020s");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        java.util.Locale locale2 = new java.util.Locale("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "EN-GB");
        java.lang.Object obj3 = locale2.clone();
        org.junit.Assert.assertEquals(locale2.toString(), "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu_EN-GB");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu_EN-GB");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu_EN-GB");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu_EN-GB");
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("HI!444444444444444444...", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!444444444444444444..." + "'", str2, "HI!444444444444444444...");
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "P0Y0M0DT0H0M0.100S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                        ", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                        " + "'", str3, "                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                        ");
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "... 0 SECOND)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "ENG                                                                                                                     ", (java.lang.CharSequence) "0 DAYS 0 HOURS 0 MINUTES 0 SECO");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", "P0Y0M0DT0H0M0.153S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "p0y0m0dt0h0m0.090s", (java.lang.CharSequence) "P-1Y11M30DT23H59M59.96S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                hi!                                                 ", "00DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.090153");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                hi!                                                 " + "'", str2, "                                                hi!                                                 ");
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("P0Y0M0DT0H0M0.153S", "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("fr", "0:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:uNITED STATES");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("P-1Y11M30DT23H59M59.999S", "0e-0:00:00.017");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2, "P-1Y11M30DT23H59M59.999S");
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 4);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.004S" + "'", str1, "P0Y0M0DT0H0M0.004S");
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("zh_CNzhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz", "\uad6d\uc911\uc5b4\uad6d\uc911sia\347narf)anihc( esenihc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_CNzhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz" + "'", str2, "zh_CNzhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz");
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444444444444444444444444444444444 hi! (ZH_CNZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZ)", 42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.Locale locale6 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        java.util.Collection<java.util.Locale> localeCollection7 = null;
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList9 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection7, filteringMode8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale[] localeArray13 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList14 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList14, localeArray13);
        java.util.Locale locale16 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList14);
        java.util.Locale locale17 = java.util.Locale.PRC;
        java.util.Locale locale19 = java.util.Locale.GERMANY;
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale19);
        java.lang.String str21 = locale17.getDisplayVariant(locale19);
        java.util.Locale.Category category22 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale23 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category22, locale23);
        java.util.Set<java.lang.String> strSet25 = locale23.getUnicodeLocaleKeys();
        java.util.Locale locale26 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleKeys();
        java.util.Locale locale28 = java.util.Locale.CHINA;
        java.util.Locale locale29 = locale28.stripExtensions();
        java.lang.String str30 = locale28.getDisplayLanguage();
        java.util.Locale locale31 = java.util.Locale.CHINA;
        java.util.Locale locale32 = locale31.stripExtensions();
        java.util.Locale locale33 = java.util.Locale.FRANCE;
        java.util.Locale locale34 = java.util.Locale.TAIWAN;
        java.util.Locale locale35 = java.util.Locale.getDefault();
        java.lang.String str36 = locale35.getDisplayVariant();
        java.util.Locale locale37 = java.util.Locale.CHINA;
        java.util.Locale locale38 = locale37.stripExtensions();
        java.lang.String str39 = locale37.getDisplayLanguage();
        java.util.Locale locale40 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet41 = locale40.getUnicodeLocaleKeys();
        java.util.Locale locale42 = java.util.Locale.CHINESE;
        java.lang.String str43 = locale40.getDisplayName(locale42);
        java.lang.String str44 = locale42.getCountry();
        java.util.Locale[] localeArray45 = new java.util.Locale[] { locale19, locale23, locale26, locale28, locale31, locale33, locale34, locale35, locale37, locale42 };
        java.util.ArrayList<java.util.Locale> localeList46 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList46, localeArray45);
        java.util.Locale.FilteringMode filteringMode48 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList49 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList46, filteringMode48);
        java.util.List<java.util.Locale> localeList50 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList46);
        java.util.Locale.LanguageRange[] languageRangeArray51 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList52 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52, languageRangeArray51);
        java.util.Locale[] localeArray54 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList55 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList55, localeArray54);
        java.util.Locale locale57 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, (java.util.Collection<java.util.Locale>) localeList55);
        java.util.Locale locale58 = java.util.Locale.PRC;
        java.util.Locale locale60 = java.util.Locale.GERMANY;
        java.lang.String str61 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale60);
        java.lang.String str62 = locale58.getDisplayVariant(locale60);
        java.util.Locale locale63 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet64 = locale63.getUnicodeLocaleKeys();
        java.util.Locale locale65 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet66 = locale65.getUnicodeLocaleKeys();
        java.util.Locale locale67 = java.util.Locale.CHINESE;
        java.lang.String str68 = locale65.getDisplayName(locale67);
        java.util.Locale locale69 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray70 = new java.util.Locale[] { locale58, locale63, locale65, locale69 };
        java.util.ArrayList<java.util.Locale> localeList71 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList71, localeArray70);
        java.util.Locale locale73 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, (java.util.Collection<java.util.Locale>) localeList71);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap74 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList75 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, strMap74);
        java.util.Locale locale76 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet77 = locale76.getUnicodeLocaleKeys();
        java.util.Locale locale78 = java.util.Locale.CHINESE;
        java.lang.String str79 = locale76.getDisplayName(locale78);
        java.lang.String str80 = locale78.getLanguage();
        java.util.Set<java.lang.String> strSet81 = locale78.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList82 = java.util.Locale.filterTags(languageRangeList75, (java.util.Collection<java.lang.String>) strSet81);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap83 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList84 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList75, strMap83);
        java.util.Locale.LanguageRange[] languageRangeArray85 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList86 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList86, languageRangeArray85);
        java.util.Locale.Category category88 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale89 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category88, locale89);
        java.util.Set<java.lang.String> strSet91 = locale89.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList92 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList86, (java.util.Collection<java.lang.String>) strSet91);
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags(languageRangeList75, (java.util.Collection<java.lang.String>) strList92);
        java.util.Collection<java.util.Locale> localeCollection94 = null;
        java.util.List<java.util.Locale> localeList95 = java.util.Locale.filter(languageRangeList75, localeCollection94);
        java.util.List<java.util.Locale> localeList96 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList95);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode8.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category22.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Chinese" + "'", str30, "Chinese");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
// flaky:         org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Chinese" + "'", str39, "Chinese");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str43, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(localeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + filteringMode48 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode48.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList49);
        org.junit.Assert.assertNotNull(localeList50);
        org.junit.Assert.assertNotNull(languageRangeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(localeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(locale57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str68, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(locale73);
        org.junit.Assert.assertNotNull(languageRangeList75);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet77);
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str79, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "zh" + "'", str80, "zh");
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(languageRangeList84);
        org.junit.Assert.assertNotNull(languageRangeArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + category88 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category88.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale89);
// flaky:         org.junit.Assert.assertEquals(locale89.toString(), "");
        org.junit.Assert.assertNotNull(strSet91);
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertNotNull(strList93);
        org.junit.Assert.assertNotNull(localeList95);
        org.junit.Assert.assertNotNull(localeList96);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("fran\347\uc911\uad6d\uc5b4\uc911\uad6d)", "!ih", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.lang.String str4 = locale2.getLanguage();
        java.util.Set<java.lang.String> strSet5 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale2.getISO3Country();
        java.lang.String str7 = locale2.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("########chinese (china)#########", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######..." + "'", str2, "#######...");
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
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
        boolean boolean13 = timeZone7.observesDaylightTime();
        java.util.TimeZone timeZone23 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int24 = timeZone23.getRawOffset();
        java.lang.String str25 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y0M0DT0H0M0.023S", false, timeZone23);
        java.lang.String str26 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) 'x', "CAN", true, timeZone23);
        java.time.ZoneId zoneId27 = timeZone23.toZoneId();
        int int29 = timeZone23.getOffset((long) (short) 100);
        boolean boolean30 = timeZone7.hasSameRules(timeZone23);
        java.util.Locale locale33 = java.util.Locale.ROOT;
        java.util.Locale locale36 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.lang.String str37 = locale33.getDisplayCountry(locale36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = timeZone23.getDisplayName(false, 24, locale33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 24");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GMT" + "'", str9, "GMT");
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky:         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "P0Y000DT00000.0230" + "'", str25, "P0Y000DT00000.0230");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "CAN" + "'", str26, "CAN");
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals(locale36.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                     !i0", "en-GB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih", 'a');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih ", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterType("P0Y0M0DT0H0M0.023S");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444de_DE4444444444444444444444444444444444444444444444444444444444", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!ih" + "'", str6, "!ih");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setUnicodeLocaleKeyword("_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0P0Y0M0DT0H0M0.020S", "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: _0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0P0Y0M0DT0H0M0.020S [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        char[] charArray15 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!IH", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0 seconds", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!44444444444444444444444444444", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "CHN", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "English (United States)", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "fR", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "P0Y0M0DT0H0M0.090S", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("China", 119, 24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "China" + "'", str3, "China");
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("        zh", (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder11 = builder9.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setVariant("\uad6d\uc911\uc5b4\uad6d\uc911sia\347narf)anihc( esenihc");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: )??????( ????????siac?narf)anihc( esenihc [at index 0]");
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
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
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
            java.util.Locale.Builder builder13 = builder11.setLanguageTag("!ih!ih!...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: !ih!ih!... [at index 0]");
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
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("44444444444444444444444444444444444444           HI!", 104, 89);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444           HI!" + "'", str3, "44444444444444444444444444444444444444           HI!");
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("0 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a00", 21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a00" + "'", str2, "0 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a00");
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444zh_tw");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ZH_TW", "44444444444444444444444444444444444444 HI!", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" und ", 14, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " und          " + "'", str3, " und          ");
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        int int2 = timeZone1.getRawOffset();
        java.lang.String str3 = timeZone1.getID();
        boolean boolean4 = timeZone1.observesDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GMT" + "'", str3, "GMT");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "Cine0e");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("#####################################################################################################################", "0I!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################################################################################################################" + "'", str2, "#####################################################################################################################");
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Locale.Category category5 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category5, locale6);
        java.lang.String str8 = locale6.getLanguage();
        java.lang.String str9 = locale4.getDisplayScript(locale6);
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale13);
        java.lang.String str15 = locale11.getDisplayVariant(locale13);
        java.util.Locale locale16 = locale11.stripExtensions();
        java.util.Locale.setDefault(category0, locale16);
        java.util.Locale locale21 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Locale.setDefault(category0, locale21);
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.util.Locale locale25 = locale24.stripExtensions();
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale24);
        boolean boolean27 = locale24.hasExtensions();
        java.util.Set<java.lang.String> strSet28 = locale24.getUnicodeLocaleKeys();
        java.util.Locale.Category category29 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale30 = java.util.Locale.UK;
        java.util.Locale.setDefault(category29, locale30);
        java.lang.String str32 = locale30.getVariant();
        java.lang.String str33 = locale30.toLanguageTag();
        java.util.Set<java.lang.Character> charSet34 = locale30.getExtensionKeys();
        java.lang.String str35 = locale24.getDisplayCountry(locale30);
        java.util.Locale locale36 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale37 = locale36.stripExtensions();
        java.util.Set<java.lang.String> strSet38 = locale36.getUnicodeLocaleKeys();
        java.lang.String str39 = locale24.getDisplayScript(locale36);
        java.util.Locale.setDefault(category0, locale24);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en" + "'", str8, "en");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "99.00:00:0" + "'", str26, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertTrue("'" + category29 + "' != '" + java.util.Locale.Category.FORMAT + "'", category29.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "en-GB" + "'", str33, "en-GB");
        org.junit.Assert.assertNotNull(charSet34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "China" + "'", str35, "China");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "   TE0    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("CA", "FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CA" + "'", str2, "CA");
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("fR", "       p0y0m0dt0h0m0.041s       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                 ng", "OUhS 0 MI", "                                               Canada                                               ", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                 ng" + "'", str4, "                 ng");
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'" + "'", str2, "testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\uc911\uad6d\uc5b4\uc911\uad6d)!ih!ih!ih!ih!ih!i", "ihihtestestestestestestP0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaChinese (China)aaaaaaaaaaaaa", 52, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuaaaaaaaaaaaaaChinese (China)aaaaaaaaaaaaa" + "'", str3, "uuuuuuuuuuuaaaaaaaaaaaaaChinese (China)aaaaaaaaaaaaa");
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "   ...M0.001S    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   ...M0.001S    " + "'", str1, "   ...M0.001S    ");
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.Locale locale6 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        java.util.Collection<java.util.Locale> localeCollection7 = null;
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList9 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection7, filteringMode8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap12);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList13, 'x');
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale locale18 = java.util.Locale.CHINA;
        java.util.Locale locale19 = locale18.stripExtensions();
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale18);
        java.util.Locale.Builder builder21 = builder16.setLocale(locale18);
        java.lang.String str22 = locale18.getDisplayCountry();
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale locale24 = builder23.build();
        java.util.Locale locale25 = builder23.build();
        java.util.Locale.Builder builder26 = builder23.clear();
        java.util.Locale.Builder builder27 = builder26.clearExtensions();
        java.util.Locale locale28 = builder26.build();
        java.lang.String str29 = locale18.getDisplayVariant(locale28);
        java.lang.String str30 = locale18.getISO3Language();
        java.util.Set<java.lang.String> strSet31 = locale18.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Locale[] localeArray35 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList36 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList36, localeArray35);
        java.util.Locale locale38 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.util.Locale>) localeList36);
        java.util.Locale locale39 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str40 = locale39.getISO3Language();
        java.util.Set<java.lang.String> strSet41 = locale39.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray42 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList43 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43, languageRangeArray42);
        java.util.Locale[] localeArray45 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList46 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList46, localeArray45);
        java.util.Locale locale48 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, (java.util.Collection<java.util.Locale>) localeList46);
        java.util.Collection<java.util.Locale> localeCollection49 = null;
        java.util.Locale.FilteringMode filteringMode50 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList51 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, localeCollection49, filteringMode50);
        java.util.List<java.lang.String> strList52 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strSet41, filteringMode50);
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags(languageRangeList13, (java.util.Collection<java.lang.String>) strSet31, filteringMode50);
        java.util.Locale locale55 = java.util.Locale.CHINA;
        java.util.Locale locale56 = locale55.stripExtensions();
        java.lang.String str57 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale55);
        boolean boolean58 = locale55.hasExtensions();
        java.util.Set<java.lang.String> strSet59 = locale55.getUnicodeLocaleKeys();
        java.util.Locale.Category category60 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale61 = java.util.Locale.UK;
        java.util.Locale.setDefault(category60, locale61);
        java.lang.String str63 = locale61.getVariant();
        java.lang.String str64 = locale61.toLanguageTag();
        java.util.Set<java.lang.Character> charSet65 = locale61.getExtensionKeys();
        java.lang.String str66 = locale55.getDisplayCountry(locale61);
        java.util.Locale locale67 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale68 = locale67.stripExtensions();
        java.util.Set<java.lang.String> strSet69 = locale67.getUnicodeLocaleKeys();
        java.lang.String str70 = locale55.getDisplayScript(locale67);
        java.util.Set<java.lang.String> strSet71 = locale55.getUnicodeLocaleKeys();
        java.lang.String str72 = java.util.Locale.lookupTag(languageRangeList13, (java.util.Collection<java.lang.String>) strSet71);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode8.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList9);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "99.00:00:0" + "'", str20, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u4e2d\u56fd" + "'", str22, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zho" + "'", str30, "zho");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(locale38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "fra" + "'", str40, "fra");
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(languageRangeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(localeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(locale48);
        org.junit.Assert.assertTrue("'" + filteringMode50 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode50.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList51);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "99.00:00:0" + "'", str57, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertTrue("'" + category60 + "' != '" + java.util.Locale.Category.FORMAT + "'", category60.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "en-GB" + "'", str64, "en-GB");
        org.junit.Assert.assertNotNull(charSet65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "China" + "'", str66, "China");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertNull(str72);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale locale1 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = java.util.Locale.lookupTag(languageRangeList0, (java.util.Collection<java.lang.String>) strSet3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\u4e2d\u6587\u4e2d\u56fd)", "P0Y0-10DT07430-10.0343599900", (-1), 24);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P0Y0-10DT07430-10.0343599900" + "'", str4, "P0Y0-10DT07430-10.0343599900");
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("               ZH_TW (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               ", "canada");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!44444444444444444444444444444", '#');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "HI!");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("english (nited states)", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazh_TWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("'P'yyyy''''d''''m''s.''", strArray7, strArray10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "'P'yyyy''''d''''m''s.''" + "'", str11, "'P'yyyy''''d''''m''s.''");
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("!i0", "\u6cd5\u6587\u6cd5\u56fd)", 70);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!i0" + "'", str3, "!i0");
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                          44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ZH_TW", "tes)aenglish (united st", 335);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi!", "fran\347ais");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("#######P0Y0M0DT0H0M0.000S#######", "                                ...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
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
        java.lang.String str16 = locale0.getDisplayScript();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("#####################################################################################################################", "deHI!44444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo xh yi yo za zh zu", (int) (short) 100, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 93 + "'", int3 == 93);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih", "HI!");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 30, 8);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("P-1Y11M30DT23H59M59.964S", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("44");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.lang.String str3 = locale0.getISO3Country();
        java.lang.String str4 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587" + "'", str2, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CHN" + "'", str3, "CHN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("P-1Y11-130DT2374359-159.9903599985", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("\uad6d\uc911\uc5b4\uad6d\uc911sia\347narf)anihc( esenihc", "000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        java.util.Locale locale2 = new java.util.Locale("ihihtestestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm'ss's'", "");
        java.lang.String str3 = locale2.getISO3Country();
        org.junit.Assert.assertEquals(locale2.toString(), "ihihtestestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm'ss's'");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "FRA", "                                                                                                                     !I0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("_0 day10 0 0our10 0 0inute10 0 econd_0 day 0 0our10 0 0inute10 0 econd_0 day 0 0our10 0 0inute10 0 econd_0 daychinois", "                                 P-1Y11M30DT23H59M59.947S0DT0H0M0.090S!P0Y0M0DT0H0M0.090S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_0 day10 0 0our10 0 0inute10 0 econd_0 day 0 0our10 0 0inute10 0 econd_0 day 0 0our10 0 0inute10 0 econd_0 daychinois" + "'", str2, "_0 day10 0 0our10 0 0inute10 0 econd_0 day 0 0our10 0 0inute10 0 econd_0 day 0 0our10 0 0inute10 0 econd_0 daychinois");
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("p0y0m0dt0h0m0.032s", "Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\347\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11M30DT23H59M59.990S", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11M30DT23H59M59.990S" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11M30DT23H59M59.990S");
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fra" + "'", str1, "fra");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("France");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Franc" + "'", str1, "Franc");
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                 0 DAYS 0 HOURS 0 MINUTES 0 SECOND                                  ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("anglais (Canada)", 1, 224);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anglais (Canada)" + "'", str3, "anglais (Canada)");
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("t00", "          0I!          ", "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("P0Y0M0DT0H0M0.023S", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "anglais (Canada)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.023S" + "'", str3, "P0Y0M0DT0H0M0.023S");
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("     4444444444444444444444444444444444444444444444444444      ", "ihihtestestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm'ss's'", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("P-1Y11M30DT23H59M59.998S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P-1Y11M30DT23H59M59.998" + "'", str1, "P-1Y11M30DT23H59M59.998");
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale3.getDisplayLanguage(locale4);
        java.lang.String str6 = locale1.getDisplayLanguage(locale4);
        java.lang.String str7 = locale4.getISO3Language();
        java.util.Locale locale10 = new java.util.Locale("!I0", "P0Y0M0DT0H0M0.034S");
        java.lang.String str11 = locale4.getDisplayVariant(locale10);
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale locale13 = builder12.build();
        java.util.Locale locale14 = builder12.build();
        java.util.Locale.Builder builder15 = builder12.clear();
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        java.util.Locale.Builder builder17 = builder16.clear();
        java.util.Locale locale18 = builder17.build();
        java.lang.String str19 = locale4.getDisplayScript(locale18);
        java.lang.String str20 = locale18.getScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587" + "'", str5, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zho" + "'", str7, "zho");
        org.junit.Assert.assertEquals(locale10.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("P0Y0M0DT0H0M0.001S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=p0y0m0dt0h0m0.001s");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("OUhS 0 MI", "0:00:00.100", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!", "zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!" + "'", str2, "eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!");
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11M30DT23H59M59.990S", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11M30DT23H59M59.990S" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11M30DT23H59M59.990S");
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!", '4');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("4444444444444444444444444444444444444444444444444444", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'u');
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("United Kingdom", strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', 18, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder5.setLanguage("und");
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getScript();
        java.util.Locale.Builder builder11 = builder7.setLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setVariant("ihihtestestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm'ss's'");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ihihtestestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm'ss's' [at index 0]");
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
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("");
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone6);
        boolean boolean8 = timeZone6.observesDaylightTime();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("");
        java.lang.String str15 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone14);
        boolean boolean16 = timeZone6.hasSameRules(timeZone14);
        boolean boolean17 = timeZone0.hasSameRules(timeZone6);
        boolean boolean18 = timeZone6.observesDaylightTime();
        int int19 = timeZone6.getRawOffset();
        boolean boolean20 = timeZone6.observesDaylightTime();
        timeZone6.setID("########Chinese (China)#########");
        timeZone6.setRawOffset(13);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        java.util.Locale locale1 = new java.util.Locale("P0Y0-10DT07430-10");
        org.junit.Assert.assertEquals(locale1.toString(), "p0y0-10dt07430-10");
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.090S", ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        java.lang.String[] strArray7 = java.util.TimeZone.getAvailableIDs((int) 'u');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444zh_tw ECOND", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y0M0DT0H0M0.090S" + "'", str5, "P0Y0M0DT0H0M0.090S");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444zh_tw ECOND" + "'", str8, "_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444zh_tw ECOND");
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        java.time.ZoneId zoneId16 = timeZone13.toZoneId();
        java.util.TimeZone timeZone17 = java.util.TimeZone.getTimeZone(zoneId16);
        boolean boolean18 = timeZone17.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone17);
        int int20 = timeZone17.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("undundun_0 DAYS 0 HOURS 0 MINUTES 0 SECONDSundundund", " und ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " und " + "'", str2, " und ");
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Engli0h (Unite0 120tate0)", "ng");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Engli0h (Unite0 120tate0)" + "'", str2, "Engli0h (Unite0 120tate0)");
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S", "0 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("CAN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CAN" + "'", str1, "CAN");
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "de" + "'", str1, "de");
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "p0y0m0dt0h0m0.041s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("p0y0m0dt0h0m0.034s", "0e_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAY4 0 0OUR4 0 0INUTE04 0 ECOND)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p0y0m0dt0h0m0.034s" + "'", str2, "p0y0m0dt0h0m0.034s");
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("", "0:00:00.017", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Greenwich Mean Time", "_0 DAY25 0 0OUR25 0 0INUTE0025 0 ECOND_0 DAY 0 0OUR25 0 0INUTE0025 0 ECOND_0 DAY 0P0Y000DT00000.02025");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0 DAYS...", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 DAYS..." + "'", str2, "0 DAYS...");
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "00DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.09015", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaap0y0m0dt0h0m0.034saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("dnu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "dnu" + "'", str1, "dnu");
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("HI!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("\uc911\uad6d\uc5b4\uc911\uad6d)!ih!ih!ih!ih!ih!i", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d)!ih!ih!ih!ih!ih!i" + "'", str2, "\uc911\uad6d\uc5b4\uc911\uad6d)!ih!ih!ih!ih!ih!i");
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECON", "Korean", "p0y000dt00000.0230");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, 100L, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("China");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale locale6 = new java.util.Locale("zh_TW", "P0Y0-10DT07430-10.0343599900", "0 DAYS 0 HOURS 0 MINUTES 0 SECOND");
        java.lang.String str7 = locale6.getDisplayName();
        java.util.Locale locale8 = locale6.stripExtensions();
        java.lang.String str9 = locale1.getDisplayVariant(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale6.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for P0Y0-10DT07430-10.0343599900");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "china");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_tw_P0Y0-10DT07430-10.0343599900_0 DAYS 0 HOURS 0 MINUTES 0 SECOND");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)" + "'", str7, "zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_tw_P0Y0-10DT07430-10.0343599900_0 DAYS 0 HOURS 0 MINUTES 0 SECOND");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAYchinois", 2, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAYchinois" + "'", str3, "_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAYchinois");
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4" + "'", str3, "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("               ZH_TW (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               ", "p0y0m0dt0h0m0.034s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "danaC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str1, "\u6cd5\u6587\u6cd5\u56fd)");
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...ch0eure 0e Gr...", "   ...M0.001S    ", 41);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        char[] charArray14 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!IH", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0 seconds", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!44444444444444444444444444444", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "CHN", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "P0Y0M0DT0H0M0.023S", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0:00:00.097", charArray14);
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
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("tes", "HI!                                                                                              ", 153);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        java.util.Locale locale1 = new java.util.Locale("ih");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "ih");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        int int2 = timeZone1.getRawOffset();
        java.lang.String str3 = timeZone1.getID();
        int int4 = timeZone1.getRawOffset();
        int int5 = timeZone1.getRawOffset();
        int int7 = timeZone1.getOffset(100L);
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = timeZone1.getDisplayName(true, (int) (short) 0, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GMT" + "'", str3, "GMT");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...", 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!HI", "                                                                                                                     !i0_ZHO", "                                                                                                                                                                                                                                                                                                                              p0y0m0dt0h0m0.090s");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!HI" + "'", str3, "eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!HI");
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s", "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s" + "'", str2, "p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s");
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale7);
        java.util.Locale.Builder builder10 = builder5.setLocale(locale7);
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder12 = builder10.setLocale(locale11);
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        java.util.Locale locale15 = builder13.build();
        java.util.Locale locale16 = null;
        java.lang.String str17 = locale15.getDisplayVariant(locale16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "99.00:00:0" + "'", str9, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) 'a');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("HI!44444444444444444444444444444", strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("", "", 100);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("4444444444444444444444444444444444444444444444444444", strArray5, strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4444444444444444444444444444444444444444444444444444" + "'", str11, "4444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("tes");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "tes" + "'", str1, "tes");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ZH_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                     !i0_ZHO", "                                                                                                                                                                                                                          44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ZH_TW", "                                 0 DAYS 0 HOURS 0 MINUTES 0 SECOND                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                     !i0_ZHO" + "'", str3, "                                                                                                                     !i0_ZHO");
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getLanguage();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.setDefault(locale4);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Locale locale7 = java.util.Locale.PRC;
        java.lang.String str8 = locale6.getDisplayLanguage(locale7);
        java.lang.String str9 = locale4.getDisplayLanguage(locale7);
        java.lang.String str10 = locale7.getISO3Language();
        java.util.Locale locale13 = new java.util.Locale("!I0", "P0Y0M0DT0H0M0.034S");
        java.lang.String str14 = locale7.getDisplayVariant(locale13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.lowerCase("\u6cd5\u6587\u6cd5\u56fd)", locale13);
        java.lang.String str16 = locale13.getScript();
        java.lang.String str17 = locale0.getDisplayName(locale13);
        java.lang.String str18 = locale13.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u6587" + "'", str8, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zho" + "'", str10, "zho");
        org.junit.Assert.assertEquals(locale13.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str15, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("99.00:00:0");
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale5);
        java.lang.String str8 = locale2.getDisplayVariant(locale5);
        java.util.Set<java.lang.String> strSet9 = locale5.getUnicodeLocaleKeys();
        java.util.Locale locale13 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet14 = locale13.getExtensionKeys();
        java.lang.String str15 = locale13.getLanguage();
        java.util.Locale locale16 = locale13.stripExtensions();
        java.lang.String str17 = locale5.getDisplayVariant(locale16);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.lowerCase("_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", locale16);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "99.00:00:0" + "'", str7, "99.00:00:0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "!ih" + "'", str15, "!ih");
        org.junit.Assert.assertNotNull(locale16);
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_0 days 0 hours 0 minutes 0 seconds" + "'", str18, "_0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                      hi!                                                 ", "zh_TW");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444444444444P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S444444444444444444444444", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        java.util.Locale locale3 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        java.lang.String str5 = locale3.getLanguage();
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale7);
        boolean boolean10 = locale7.hasExtensions();
        java.util.Set<java.lang.String> strSet11 = locale7.getUnicodeLocaleKeys();
        java.lang.String str12 = locale3.getDisplayCountry(locale7);
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category13, locale14);
        java.lang.String str16 = locale7.getDisplayScript(locale14);
        java.lang.String str17 = locale14.getISO3Country();
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale locale19 = builder18.build();
        java.util.Locale.setDefault(locale19);
        java.util.Locale locale21 = java.util.Locale.CHINA;
        java.util.Locale locale22 = java.util.Locale.PRC;
        java.lang.String str23 = locale21.getDisplayLanguage(locale22);
        java.lang.String str24 = locale19.getDisplayLanguage(locale22);
        java.lang.String str25 = locale22.getISO3Language();
        java.util.Locale locale28 = new java.util.Locale("!I0", "P0Y0M0DT0H0M0.034S");
        java.lang.String str29 = locale22.getDisplayVariant(locale28);
        java.util.Locale.Builder builder30 = new java.util.Locale.Builder();
        java.util.Locale locale31 = builder30.build();
        java.util.Locale locale32 = builder30.build();
        java.util.Locale.Builder builder33 = builder30.clear();
        java.util.Locale.Builder builder34 = builder33.clearExtensions();
        java.util.Locale.Builder builder35 = builder34.clear();
        java.util.Locale locale36 = builder35.build();
        java.lang.String str37 = locale22.getDisplayScript(locale36);
        java.lang.String str38 = locale22.getDisplayScript();
        java.lang.String str39 = locale14.getDisplayScript(locale22);
        java.util.Locale locale40 = locale22.stripExtensions();
        java.util.Set<java.lang.String> strSet41 = locale40.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet42 = locale40.getUnicodeLocaleKeys();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!ih" + "'", str5, "!ih");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "99.00:00:0" + "'", str9, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str12, "P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CAN" + "'", str17, "CAN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e2d\u6587" + "'", str23, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zho" + "'", str25, "zho");
        org.junit.Assert.assertEquals(locale28.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(strSet42);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "Chinesisch                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "chinesisch                                                                                          " + "'", str1, "chinesisch                                                                                          ");
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        java.util.Locale.Builder builder10 = builder7.setExtension('x', "");
        java.util.Locale.Builder builder12 = builder10.setLanguageTag("en");
        java.util.Locale.Builder builder13 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder10.setLanguageTag("HI!44444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: HI!44444444444444444444444444444 [at index 0]");
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
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 23, "                                ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                ..." + "'", str2, "                                ...");
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "     ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("stestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'nglish (United Kingdom)");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\u683c\u6797\u5a01\u6cbb\u6642\u9593", (int) (byte) -1, "       p0y0m0dt0h0m0.041s       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u683c\u6797\u5a01\u6cbb\u6642\u9593" + "'", str3, "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("tes)aenglish (united st", 31, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tes)aenglish (united st44444444" + "'", str3, "tes)aenglish (united st44444444");
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "cancancancancancancancancancancancancancancancancancancancancancancancancancancancancancancan0:00:00.089");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("       P0Y0M0DT0H0M0.041S       ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("GB");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        int int17 = timeZone13.getOffset((long) (short) 10);
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone("");
        int int20 = timeZone19.getRawOffset();
        int int21 = timeZone19.getRawOffset();
        int int23 = timeZone19.getOffset(1L);
        boolean boolean24 = timeZone13.hasSameRules(timeZone19);
        int int25 = timeZone19.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.090S", ' ');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterType("P0Y0-10DT07430-10.0343599900");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", strArray3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        timeZone13.setID("zh");
        int int18 = timeZone13.getRawOffset();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone25 = java.util.TimeZone.getTimeZone("");
        java.lang.String str26 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone25);
        boolean boolean27 = timeZone25.observesDaylightTime();
        java.util.TimeZone timeZone33 = java.util.TimeZone.getTimeZone("");
        java.lang.String str34 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone33);
        boolean boolean35 = timeZone25.hasSameRules(timeZone33);
        boolean boolean36 = timeZone19.hasSameRules(timeZone25);
        boolean boolean37 = timeZone13.hasSameRules(timeZone25);
        int int39 = timeZone25.getOffset(0L);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u6587" + "'", str26, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u4e2d\u6587" + "'", str34, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "     ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     ..." + "'", str1, "     ...");
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "0danaC:danaC00danaC:danaC00danaC.danaC097xxxxxxxxxxxxxxxxxxxxxxxxxxxxx", (java.lang.CharSequence) "P0Y0-10DT07430-10.0343599900");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("P0Y0M0DT0H0M0.014S", 104, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.014Sxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str3, "P0Y0M0DT0H0M0.014Sxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Chinese (China)FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)", "                4P404Y404M404DT404H404M404.40904Shi4P404Y404M404DT404H404M404.40904S4!4P404Y404M404DT404H404M404.40904S4                        ", "0e-0:00:00.017");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinese (China)FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str3, "Chinese (China)FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)");
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ZH_TW", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "0                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("english (nited states)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "english (nited states)" + "'", str1, "english (nited states)");
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("x", "0:00:00.023");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\347\uc911\uad6d\uc5b4\uc911\uad6d)", 32, "...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\347\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str3, "Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\347\uc911\uad6d\uc5b4\uc911\uad6d)");
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale1.getDisplayCountry(locale3);
        java.util.Locale locale6 = new java.util.Locale("0:00:00.99");
        java.lang.String str7 = locale1.getDisplayCountry(locale6);
        java.lang.String str8 = locale1.getDisplayScript();
        boolean boolean10 = locale1.equals((java.lang.Object) "\uc911\uad6d\uc5b4\uc911\uad6d)!ih!ih!ih!ih!ih!i");
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals(locale6.toString(), "0:00:00.99");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("0 seconds");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=0 seconds");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        int int17 = timeZone13.getOffset((long) (short) 10);
        int int18 = timeZone13.getRawOffset();
        timeZone13.setID("OURS 0 MI");
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet24 = locale23.getUnicodeLocaleKeys();
        java.util.Locale locale25 = java.util.Locale.CHINESE;
        java.lang.String str26 = locale23.getDisplayName(locale25);
        java.lang.String str27 = locale25.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = timeZone13.getDisplayName(true, 52, locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str26, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                                                 P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "P0Y0M0DT0H0M0.99S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Chinese (China)FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("OUhS 0 MI", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("               zh               ", "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                                                 ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("           HI!", strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 4 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale3 = new java.util.Locale("\u4e2d\u6587");
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("P0Y0M0DT0H0M0.034S");
        java.lang.String str7 = locale3.getDisplayName(locale6);
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleAttributes();
        java.lang.String str9 = locale6.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale3 = new java.util.Locale("\u4e2d\u6587");
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("P0Y0M0DT0H0M0.034S");
        java.lang.String str7 = locale3.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.lang.String str10 = locale8.getExtension('a');
        java.lang.String str11 = locale6.getDisplayName(locale8);
        java.util.Set<java.lang.String> strSet12 = locale8.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0e-DE", 'x');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...INUTES 0 SECOND)", "", (int) 'u');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("\uc911\uad6d\uc5b4\uc911\uad6d)", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("       p0y0m0dt0h0m0.041s       ", "0                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("eng", "M0DT0H0M0.000S", 104, 57);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "engM0DT0H0M0.000S" + "'", str4, "engM0DT0H0M0.000S");
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("ng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'x', "P-1Y11M30DT23H59M59.998S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11030DT23059059.998120" + "'", str2, "P-1Y11030DT23059059.998120");
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
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
        java.util.Locale locale27 = java.util.Locale.CHINESE;
        java.lang.String str28 = locale25.getDisplayName(locale27);
        java.lang.String str29 = locale27.getLanguage();
        java.util.Set<java.lang.String> strSet30 = locale27.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags(languageRangeList24, (java.util.Collection<java.lang.String>) strSet30);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList24, strMap32);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap34 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList33, strMap34);
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList35, '4');
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
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str28, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zh" + "'", str29, "zh");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(languageRangeList33);
        org.junit.Assert.assertNotNull(languageRangeList35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("gmt");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GMT" + "'", str1, "GMT");
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("P0Y0M0DT0H0M0.015S", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H" + "'", str2, "P0Y0M0DT0H");
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0 days 0 hours", "44");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("44444444444444444444444444444444444444 HI!", 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("...ch0eure0eGr...", "4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("########Chinese (China)#########", 19);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########Chinese (Ch" + "'", str2, "########Chinese (Ch");
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) 'a');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("HI!44444444444444444444444444444", '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!", strArray4, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "FR");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaa...", "p0y0m0dt0h0m0.041s                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaa...");
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("zh_tw", "eng", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("dnu", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "dnu" + "'", str2, "dnu");
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!44444444444444444444444444444", '#');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "HI!");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("", "United States", (int) (short) 10);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("Greenwich Mean Time", strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("P0Y0-10DT07430-10.0343599900", strArray5, strArray10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P0Y0-10DT07430-10.0343599900" + "'", str13, "P0Y0-10DT07430-10.0343599900");
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("w");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "p-1Y11M30DT23H59M59.975S", (java.lang.CharSequence) "Unite30 887tate86399");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("P0Y0M0DT0H0M0.090S0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 ho", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.090S0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 ho" + "'", str2, "P0Y0M0DT0H0M0.090S0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 ho");
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("UN00UNUN_0_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0P0Y0M0DT0H0M0.020S", "                                                                                                                        ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("P0Y0M0DT0H0M0.014S", 96, 17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0...." + "'", str3, "P0Y0M0DT0H0M0....");
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("P0Y0-10DT07430-10.0343599900I!", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0343599900I!" + "'", str3, "P0Y0-10DT07430-10.0343599900I!");
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("HI!                                                                                              ", "Chinese(China)", "ANGLAIS (CANADA)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!                                                                                              " + "'", str3, "HI!                                                                                              ");
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        int int6 = timeZone5.getRawOffset();
        java.lang.String str7 = timeZone5.getID();
        java.time.ZoneId zoneId8 = timeZone5.toZoneId();
        java.lang.String str9 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 1L, "\u6cd5\u6587\u6cd5\u56fd)", false, timeZone5);
        java.lang.String str10 = timeZone5.getID();
        java.lang.String str11 = timeZone5.getID();
        boolean boolean12 = timeZone5.observesDaylightTime();
        int int13 = timeZone5.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GMT" + "'", str7, "GMT");
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str9, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GMT" + "'", str10, "GMT");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GMT" + "'", str11, "GMT");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.034Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.034Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.034Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("44444444444444444444444444444444444444           HI!", "de-DE", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.lang.String str2 = locale0.getDisplayLanguage(locale1);
        java.lang.String str3 = locale0.getDisplayScript();
        java.util.Set<java.lang.Character> charSet4 = locale0.getExtensionKeys();
        java.lang.String str5 = locale0.getDisplayScript();
        java.lang.String str6 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587" + "'", str2, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CHN" + "'", str6, "CHN");
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) '#', "Heure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de Greenwich");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich" + "'", str3, "0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich");
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("German (Germany)", "44P0Y0-10DT07430-10.034359990044");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "German (Germany)" + "'", str2, "German (Germany)");
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("en-GB");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale7 = builder5.build();
        java.util.Locale.Builder builder9 = builder5.removeUnicodeLocaleAttribute("chinois");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder5.setVariant("P-1Y11M30DT23H59M59.964S");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: P-1Y11M30DT23H59M59.964S [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("en-GB");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setLanguage("\u4e2d\u6587!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!ih!ih!...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ??!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!ih!ih!...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        char[] charArray11 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "de-DE", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("p0y0m0dt0h0m0.041s", 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("chinois", "gmt");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) 'a');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("HI!44444444444444444444444444444", '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!", strArray6, strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concatWith("\u4e2d\u6587", (java.lang.Object[]) strArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny("JA", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 70, 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.930S" + "'", str2, "P-1Y11M30DT23H59M59.930S");
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("p0y0m0dt0h0m0.020s", "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p0y0m0dt0h0m0.020s" + "'", str2, "p0y0m0dt0h0m0.020s");
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("        zh", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clear();
        java.util.Locale.Builder builder9 = builder3.setLanguageTag("tes");
        java.util.Locale locale10 = builder3.build();
        java.util.Locale.Builder builder11 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder11.setUnicodeLocaleKeyword("S469.95M95H32TD03M11Y1-P", "P0Y0-10DT07430-10.0343599900");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: S469.95M95H32TD03M11Y1-P [at index 0]");
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
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "tes");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("... 0 SECOND)", "fr4n\347\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!ih#######", 98, "CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih#######CACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACA" + "'", str3, "!ih#######CACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACACA");
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.100" + "'", str1, "0:00:00.100");
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("p0y0m0dt0h0m0.041s                              ", "#######p0y0m0dt0h0m0.000s#######");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                 P-1Y11M30DT23H59M59.947S0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuu", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx...chHeure de Gr...xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("ihihtestestestestestestP0Y0M0DT0H0M0.034S", (int) (byte) 0, 23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ihihtestestestestestest" + "'", str3, "ihihtestestestestestest");
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("UN00UNUN_0 day32 0 0our32 0 0inute032 0 econdUN000UNUN", "de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UN00UNUN_0 day32 0 0our32 0 0inute032 0 econdUN000UNUN" + "'", str2, "UN00UNUN_0 day32 0 0our32 0 0inute032 0 econdUN000UNUN");
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Locale.Category category5 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category5, locale6);
        java.lang.String str8 = locale6.getLanguage();
        java.lang.String str9 = locale4.getDisplayScript(locale6);
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale13 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.lang.String str15 = locale13.getDisplayName(locale14);
        java.lang.String str16 = locale4.getDisplayScript(locale14);
        java.util.Locale locale18 = new java.util.Locale("English (United States)");
        java.util.Locale locale21 = new java.util.Locale("                                                                                                                     !I0", "zho");
        java.lang.String str22 = locale18.getDisplayCountry(locale21);
        java.util.Locale locale23 = locale21.stripExtensions();
        java.lang.String str24 = locale23.toLanguageTag();
        java.lang.String str25 = locale14.getDisplayLanguage(locale23);
        java.lang.String str26 = locale14.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en" + "'", str8, "en");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals(locale13.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str15, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals(locale18.toString(), "english (united states)");
        org.junit.Assert.assertEquals(locale21.toString(), "                                                                                                                     !i0_ZHO");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "                                                                                                                     !i0_ZHO");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "und" + "'", str24, "und");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Chinese" + "'", str25, "Chinese");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zh" + "'", str26, "zh");
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("deuuuuuuuuuuuuuuuu", "Uen-CAUUUUUUUUUUUUUUUUUUUUUUU0:00:00.097UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0                      ", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("P0Y0M0DT0H0M0.042S", 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4", "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                                                 ", "0320.000000I!                                                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                                     ...", "                4P404Y404M404DT404H404M404.40904Shi4P404Y404M404DT404H404M404.40904S4!4P404Y404M404DT404H404M404.40904S4                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
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
        java.util.TimeZone timeZone20 = java.util.TimeZone.getTimeZone(zoneId19);
        boolean boolean21 = timeZone20.observesDaylightTime();
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale locale23 = builder22.build();
        java.util.Locale locale24 = builder22.build();
        java.util.Locale.Builder builder25 = builder22.clear();
        java.util.Locale.Builder builder26 = builder25.clearExtensions();
        java.util.Locale locale27 = builder25.build();
        java.util.Locale.Builder builder28 = builder25.clearExtensions();
        java.util.Locale.Builder builder29 = builder28.clear();
        java.util.Locale locale30 = java.util.Locale.CHINA;
        java.lang.String str31 = locale30.getDisplayVariant();
        java.lang.String str32 = locale30.getVariant();
        java.util.Locale.Builder builder33 = builder28.setLocale(locale30);
        java.lang.String str34 = timeZone20.getDisplayName(locale30);
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
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4" + "'", str34, "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("P-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989S", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=p-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989sp-1y11m30dt23h59m59.989s");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                     ZH_TW                      ", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("en-GB");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setRegion("M0DT0H0M0.000S");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: M0DT0H0M0.000S [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        java.util.Locale locale3 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        java.lang.String str5 = locale3.getLanguage();
        java.util.Locale locale6 = locale3.stripExtensions();
        java.lang.String str7 = locale3.getDisplayName();
        java.lang.String str8 = locale3.getLanguage();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!ih" + "'", str5, "!ih");
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd))" + "'", str7, "\u6cd5\u6587\u6cd5\u56fd))");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!ih" + "'", str8, "!ih");
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u4e2d\u6587");
        java.lang.String str2 = locale1.toLanguageTag();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder5.setLanguage("und");
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getScript();
        java.util.Locale.Builder builder11 = builder7.setLocale(locale9);
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale locale13 = builder11.build();
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
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'Engli0h (Unite0 120tate0)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.lang.String str4 = locale2.getLanguage();
        java.util.Set<java.lang.String> strSet5 = locale2.getUnicodeLocaleAttributes();
        java.util.Locale locale9 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        java.lang.String str11 = locale9.getLanguage();
        java.util.Set<java.lang.String> strSet12 = locale9.getUnicodeLocaleAttributes();
        java.lang.String str13 = locale2.getDisplayScript(locale9);
        java.lang.String str14 = locale2.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertNotNull(strSet5);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!ih" + "'", str11, "!ih");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chinese" + "'", str14, "Chinese");
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale.Category category6 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category6, locale7);
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.lang.String str10 = locale7.getDisplayCountry(locale9);
        java.lang.String str11 = locale5.getDisplayVariant(locale7);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
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
        java.util.Locale locale19 = new java.util.Locale("");
        java.util.Locale locale21 = new java.util.Locale("\u4e2d\u6587");
        java.lang.String str22 = locale19.getDisplayScript(locale21);
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("P0Y0M0DT0H0M0.034S");
        java.lang.String str25 = locale21.getDisplayName(locale24);
        java.lang.String str26 = timeZone10.getDisplayName(locale21);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GMT" + "'", str12, "GMT");
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals(locale21.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u4e2d\u6587" + "'", str25, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Greenwich Mean Time" + "'", str26, "Greenwich Mean Time");
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
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
            java.util.Locale.Builder builder13 = builder9.setVariant("0 days 0 hours 0 minutes 0 seco");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 0 days 0 hours 0 minutes 0 seco [at index 0]");
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
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                P0Y000DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.090153");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                p0y000dt00000.090153hip0y000dt00000.090153!p0y000dt00000.090153" + "'", str1, "                                                p0y000dt00000.090153hip0y000dt00000.090153!p0y000dt00000.090153");
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("0 DAYS 0 HOURS 0 MINUTES 0 SECO", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        int int17 = timeZone13.getOffset((long) (short) 10);
        java.time.ZoneId zoneId18 = timeZone13.toZoneId();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone(zoneId18);
        java.util.Locale locale22 = new java.util.Locale("!I0", "P0Y0M0DT0H0M0.034S");
        java.lang.String str23 = locale22.getCountry();
        java.util.Locale.setDefault(locale22);
        java.lang.String str25 = locale22.getDisplayName();
        java.lang.String str26 = timeZone19.getDisplayName(locale22);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals(locale22.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str23, "P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "!i0 (P0Y0M0DT0H0M0.034S)" + "'", str25, "!i0 (P0Y0M0DT0H0M0.034S)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Greenwich Mean Time" + "'", str26, "Greenwich Mean Time");
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("P0Y000DT00000.00120", "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00120" + "'", str2, "P0Y000DT00000.00120");
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.Locale locale6 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        java.util.Collection<java.util.Locale> localeCollection7 = null;
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList9 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection7, filteringMode8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale[] localeArray13 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList14 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList14, localeArray13);
        java.util.Locale locale16 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList14);
        java.util.Locale.Category category17 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category17, locale18);
        java.util.Set<java.lang.String> strSet20 = locale18.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strSet20);
        java.util.Locale.FilteringMode filteringMode22 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet20, filteringMode22);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Locale[] localeArray27 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList28 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList28, localeArray27);
        java.util.Locale locale30 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.util.Locale>) localeList28);
        java.util.Locale locale31 = java.util.Locale.PRC;
        java.util.Locale locale33 = java.util.Locale.GERMANY;
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale33);
        java.lang.String str35 = locale31.getDisplayVariant(locale33);
        java.util.Locale locale36 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet37 = locale36.getUnicodeLocaleKeys();
        java.util.Locale locale38 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleKeys();
        java.util.Locale locale40 = java.util.Locale.CHINESE;
        java.lang.String str41 = locale38.getDisplayName(locale40);
        java.util.Locale locale42 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray43 = new java.util.Locale[] { locale31, locale36, locale38, locale42 };
        java.util.ArrayList<java.util.Locale> localeList44 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList44, localeArray43);
        java.util.Locale locale46 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.util.Locale>) localeList44);
        java.util.List<java.util.Locale> localeList47 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList44);
        java.util.Locale locale48 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet49 = locale48.getUnicodeLocaleKeys();
        java.util.Locale locale50 = java.util.Locale.CHINESE;
        java.lang.String str51 = locale48.getDisplayName(locale50);
        java.lang.String str52 = locale50.getLanguage();
        java.util.Set<java.lang.String> strSet53 = locale50.getUnicodeLocaleAttributes();
        java.lang.String str54 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet53);
        java.lang.String str56 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, 'u');
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode8.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertTrue("'" + category17 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category17.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + filteringMode22 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode22.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(locale30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str41, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(locale46);
        org.junit.Assert.assertNotNull(localeList47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str51, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "zh" + "'", str52, "zh");
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("Chine");
        java.util.Locale.Builder builder6 = builder0.setLanguage("Chinese");
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.setLanguage("aaaaaaaaaaaaaChinese (China)aaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: aaaaaaaaaaaaaChinese (China)aaaaaaaaaaaaa [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("en_GB", "!i", "c#n");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("");
        int int10 = timeZone9.getRawOffset();
        java.lang.String str11 = timeZone9.getID();
        java.time.ZoneId zoneId12 = timeZone9.toZoneId();
        java.lang.String str13 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 1L, "\u6cd5\u6587\u6cd5\u56fd)", false, timeZone9);
        timeZone9.setRawOffset((int) 'a');
        java.lang.String str16 = timeZone9.getID();
        java.lang.String str17 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 318, (long) 4, "H0M0.090SHIP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", true, timeZone9);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GMT" + "'", str11, "GMT");
        org.junit.Assert.assertNotNull(zoneId12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str13, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GMT" + "'", str16, "GMT");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7430-10.0903599686743IP0Y0-10DT07430-10.0903599686!P0Y0-10DT07430-10.0903599686" + "'", str17, "7430-10.0903599686743IP0Y0-10DT07430-10.0903599686!P0Y0-10DT07430-10.0903599686");
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("gmt", 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        java.util.Locale locale2 = new java.util.Locale("P-1Y11-130DT2374359-159.9903599985", "");
        org.junit.Assert.assertEquals(locale2.toString(), "p-1y11-130dt2374359-159.9903599985");
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("0:00:00.120");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "021.00:00:0" + "'", str1, "021.00:00:0");
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        java.util.Locale locale2 = new java.util.Locale("zh_TW", "Chinese (China)");
        java.lang.String str3 = locale2.getVariant();
        boolean boolean4 = locale2.hasExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "zh_tw_CHINESE (CHINA)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\uad6d\uc911\uc5b4\uad6d\uc911sia\347narf)anihc( esenihc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("P-1Y11M30DT23H59M59.964S", "zh_TW0 seconds", 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "english (nited states)", (java.lang.CharSequence) "0et");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("_0 days 0 hours 0 minutes 0 seconds", "ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_0 days 0 hours 0 minutes 0 seconds" + "'", str2, "_0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        java.time.ZoneId zoneId16 = timeZone13.toZoneId();
        java.util.TimeZone timeZone17 = java.util.TimeZone.getTimeZone(zoneId16);
        boolean boolean18 = timeZone17.observesDaylightTime();
        int int19 = timeZone17.getRawOffset();
        int int21 = timeZone17.getOffset((long) 24);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertNotNull(timeZone17);
// flaky:         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("");
        java.lang.String str10 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone9);
        boolean boolean11 = timeZone9.observesDaylightTime();
        java.util.TimeZone timeZone17 = java.util.TimeZone.getTimeZone("");
        java.lang.String str18 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone17);
        boolean boolean19 = timeZone9.hasSameRules(timeZone17);
        int int21 = timeZone17.getOffset((long) (short) 10);
        int int22 = timeZone17.getRawOffset();
        java.lang.String str23 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 5, (long) (short) 100, " und ", false, timeZone17);
        timeZone17.setID("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!IHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u6587" + "'", str10, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u6587" + "'", str18, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " un0 " + "'", str23, " un0 ");
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("P0Y0M0DT0H0M0.023S", "...chHeure de Gr...", 335);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                        ", "'uPu'uyyyyu'uYu'uMu'uMu'udu'uDTu'uHu'uHu'umu'uMu'usu.uSu'uS");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        timeZone1.setRawOffset(98);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 23, (long) 336, "4P404Y404M404DT404H404M404.40904Shi4P404Y404M404DT404H404M404.40904S4!4P404Y404M404DT404H404M404.40904S4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4P404Y4040404DT40404040404.40904313hi4P404Y4040404DT40404040404.409043134!4P404Y4040404DT40404040404.409043134" + "'", str3, "4P404Y4040404DT40404040404.40904313hi4P404Y4040404DT40404040404.409043134!4P404Y4040404DT40404040404.409043134");
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                    ", "p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("un00unun_0 DAY32 0 0OUR32 0 0INUTE032 0 ECONDun000unun", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "un00unun_0 DAY32 0 0OUR32 0 0INUTE032 0 ECONDun000unun" + "'", str2, "un00unun_0 DAY32 0 0OUR32 0 0INUTE032 0 ECONDun000unun");
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44P0Y0-10DT07430-10.034359               ZH_TW (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               44P0Y0-10DT07430-10.0343599", "44444444444444444444444444444444444444 hi! (ZH_CNZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZ)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        int int2 = timeZone1.getRawOffset();
        java.lang.String str3 = timeZone1.getID();
        java.time.ZoneId zoneId4 = timeZone1.toZoneId();
        java.util.TimeZone timeZone5 = null;
        boolean boolean6 = timeZone1.hasSameRules(timeZone5);
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
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0P0Y0M0DT0H0M0.020S", "0 0a000 0 hour 0 0inute00 0 econ00                                                                  ", 15);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", 57);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        java.util.Locale locale3 = new java.util.Locale("", "P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", "I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for P0Y0M0DT0H0M0.090SHIP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "_P0Y0M0DT0H0M0.090SHIP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S_I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!");
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        java.util.Locale locale1 = new java.util.Locale("0:00:00.99");
        java.util.Locale locale2 = java.util.Locale.ROOT;
        java.util.Locale locale5 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.lang.String str6 = locale2.getDisplayCountry(locale5);
        java.lang.String str7 = locale1.getDisplayScript(locale2);
        java.lang.String str8 = locale1.getVariant();
        java.lang.String str9 = locale1.getDisplayCountry();
        java.util.Set<java.lang.String> strSet10 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale1.toString(), "0:00:00.99");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "zh_44444444444444444444444444444zh_", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.Locale locale6 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "0 DAYS 0 HOURS 0 MINUTES 0 SECOND");
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.util.Locale[] localeArray12 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList13 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList13, localeArray12);
        java.util.Locale locale15 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.util.Locale>) localeList13);
        java.util.Collection<java.util.Locale> localeCollection16 = null;
        java.util.Locale.FilteringMode filteringMode17 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, localeCollection16, filteringMode17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, strMap19);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap21 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList22 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, strMap21);
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("\u4e2d\u6587");
        java.lang.String str25 = locale24.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet26 = locale24.getUnicodeLocaleAttributes();
        java.lang.String str27 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strSet26);
        java.lang.String str28 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet26);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertTrue("'" + filteringMode17 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode17.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList18);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(languageRangeList22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("P-1Y11M30DT23H59M59.96S", 2, "P0Y0M0DT0H0M0.097S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11M30DT23H59M59.96S" + "'", str3, "P-1Y11M30DT23H59M59.96S");
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("fr", "P0Y0M0DT0H0M0.041S", 57);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr" + "'", str3, "fr");
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        char[] charArray9 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "P0Y0M0DT0H0M0.034S", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("0:00:00.120", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#####################################################################################################################", "Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (int) (short) -1);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("... 0 SECOND)", 41, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaa... 0 SECOND)aaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaa... 0 SECOND)aaaaaaaaaaaaaa");
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "HI!                                                                                              ", (int) '4');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "zh_TW");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) 'a');
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny("HI!44444444444444444444444444444", strArray14);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.split("", "", 100);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("4444444444444444444444444444444444444444444444444444", strArray14, strArray19);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.concatWith("0 seconds", (java.lang.Object[]) strArray14);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("                                                hi!                                                 ", strArray7, strArray14);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.concatWith("uuuuuuuuuuuuuzh_CN", (java.lang.Object[]) strArray7);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4444444444444444444444444444444444444444444444444444" + "'", str20, "4444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                                hi!                                                 " + "'", str22, "                                                hi!                                                 ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0M0DT0H0M0.001S");
        java.lang.String str2 = timeZone1.getID();
        boolean boolean3 = timeZone1.observesDaylightTime();
        int int4 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GMT" + "'", str2, "GMT");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0 DAYS 0 HOURS 0 MINUTES 0 SECOND", "P0Y0M0DT0H0M0.019S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("########Chinese (China)#########", 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        char[] charArray17 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!IH", charArray17);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", charArray17);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0 seconds", charArray17);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!44444444444444444444444444444", charArray17);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "CHN", charArray17);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "English (United States)", charArray17);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "fR", charArray17);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsAny("zh", charArray17);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "fran\347\uc911\uad6d\uc5b4\uc911\uad6d)", charArray17);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsAny("p-1Y11M30DT23H59M59.975S", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaTE0abTE0aeTE0afTE0akTE0amTE0anTE0arTE0asTE0avTE0ayTE0azTE0baTE0beTE0bgTE0bhTE0biTE0bmTE0bnTE0boTE0brTE0bsTE0caTE0ceTE0chTE0coTE0crTE0csTE0cuTE0cvTE0cyTE0daTE0deTE0dvTE0dzTE0eeTE0elTE0enTE0eoTE0esTE0etTE0euTE0faTE0ffTE0fiTE0fjTE0foTE0frTE0fyTE0gaTE0gdTE0glTE0gnTE0guTE0gvTE0haTE0heTE0hiTE0hoTE0hrTE0htTE0huTE0hyTE0hzTE0iaTE0idTE0ieTE0igTE0iiTE0ikTE0inTE0ioTE0isTE0itTE0iuTE0iwTE0jaTE0jiTE0jvTE0kaTE0kgTE0kiTE0kjTE0kkTE0klTE0kmTE0knTE0koTE0krTE0ksTE0kuTE0kvTE0kwTE0kyTE0laTE0lbTE0lgTE0liTE0lnTE0loTE0ltTE0luTE0lvTE0mgTE0mhTE0miTE0mkTE0mlTE0mnTE0moTE0mrTE0msTE0mtTE0myTE0naTE0nbTE0ndTE0neTE0ngTE0nlTE0nnTE0noTE0nrTE0nvTE0nyTE0ocTE0ojTE0omTE0orTE0osTE0paTE0piTE0plTE0psTE0ptTE0quTE0rmTE0rnTE0roTE0ruTE0rwTE0saTE0scTE0sdTE0seTE0sgTE0siTE0skTE0slTE0smTE0snTE0soTE0sqTE0srTE0ssTE0stTE0suTE0svTE0swTE0taTE0teTE0tgTE0thTE0tiTE0tkTE0tlTE0tnTE0toTE0trTE0tsTE0ttTE0twTE0tyTE0ugTE0ukTE0urTE0uzTE0veTE0viTE0voTE0waTE0woTE0xhTE0yiTE0yoTE0zaTE0zhTE0zu", "I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "de_dede_dede_dedeng", (java.lang.CharSequence) "p0y0m0dt0h0m0.090s");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "de_dede_dede_dedeng" + "'", charSequence2, "de_dede_dede_dedeng");
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str2, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        java.lang.String str2 = timeZone1.getID();
        int int3 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GMT" + "'", str2, "GMT");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale3.getDisplayLanguage(locale4);
        java.lang.String str6 = locale1.getDisplayLanguage(locale4);
        java.lang.String str7 = locale4.getISO3Language();
        java.util.Locale locale10 = new java.util.Locale("!I0", "P0Y0M0DT0H0M0.034S");
        java.lang.String str11 = locale4.getDisplayVariant(locale10);
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale locale13 = builder12.build();
        java.util.Locale locale14 = builder12.build();
        java.util.Locale.Builder builder15 = builder12.clear();
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        java.util.Locale.Builder builder17 = builder16.clear();
        java.util.Locale locale18 = builder17.build();
        java.lang.String str19 = locale4.getDisplayScript(locale18);
        java.lang.String str20 = locale4.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587" + "'", str5, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zho" + "'", str7, "zho");
        org.junit.Assert.assertEquals(locale10.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Chinese (China)" + "'", str20, "Chinese (China)");
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "P-1Y11M30DT23H59M59.999S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 21, (long) 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2, "P0Y0M0DT0H0M0.011S");
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("               zh              ", 17, 335);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "              " + "'", str3, "              ");
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y0M0DT0H0M0.121S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.121-1" + "'", str2, "P0Y000DT00000.121-1");
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.lang.String str4 = locale2.getLanguage();
        java.util.Set<java.lang.String> strSet5 = locale2.getUnicodeLocaleAttributes();
        java.util.Locale locale9 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        java.lang.String str11 = locale9.getLanguage();
        java.util.Set<java.lang.String> strSet12 = locale9.getUnicodeLocaleAttributes();
        java.lang.String str13 = locale2.getDisplayScript(locale9);
        java.util.Set<java.lang.String> strSet14 = locale2.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertNotNull(strSet5);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!ih" + "'", str11, "!ih");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.lang.String str2 = locale0.getVariant();
        java.util.Locale.setDefault(locale0);
        boolean boolean4 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                     !i0_ZHO", "P-1Y11M30DT23H59M59.990S", "Chinese");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\u6cd5\u6587\u6cd5\u56fd)", "de_DE", 48);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\uc77c\ubcf8\uc5b4", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("I!Chine0ich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!", "de", "chinesisch                                                                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!Chinh0ich (China)I!Chinhich (China)I!Chinhich (China)I!Chinhich (China)I!Chinhich (China)I!Chinhich (China)I!Chinhich (China)I!Chinhich (China)I!Chinhich (China)I!" + "'", str3, "I!Chinh0ich (China)I!Chinhich (China)I!Chinhich (China)I!Chinhich (China)I!Chinhich (China)I!Chinhich (China)I!Chinhich (China)I!Chinhich (China)I!Chinhich (China)I!");
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("0:00:00.002");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.002" + "'", str1, "0:00:00.002");
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("0:00:00.096", "                                         ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.096" + "'", str3, "0:00:00.096");
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAYchinois", "            0:00:00.000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAYchinois" + "'", str2, "_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAYchinois");
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("P-1Y11M30DT23H59M59.979S", "_0 DAY25 0 0OUR25 0 0INUTE0025 0 ECOND_0 DAY 0 0OUR25 0 0INUTE0025 0 ECOND_0 DAY 0P0Y000DT00000.02025", "P0Y0-10DT07430-10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11M30DT23H59M59.979S" + "'", str3, "P-1Y11M30DT23H59M59.979S");
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("gmt", locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GMT" + "'", str2, "GMT");
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        java.lang.Iterable<java.util.Locale.LanguageRange> languageRangeIterable0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(languageRangeIterable0, "Chinese(China)");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444zh_tw");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444zh_tw" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444zh_tw");
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("TE0", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!IHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", '#');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) 'a');
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("HI!44444444444444444444444444444", strArray10);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("", "", 100);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("4444444444444444444444444444444444444444444444444444", strArray10, strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("United States", strArray4, strArray15);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.concatWith("\u4e2d\u6587", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4444444444444444444444444444444444444444444444444444" + "'", str16, "4444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "United States" + "'", str17, "United States");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'" + "'", str18, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("dnu", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              dnu" + "'", str2, "                                                                                              dnu");
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "English (United States)", (java.lang.CharSequence) "                                                P0Y000DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.090153");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int10 = timeZone9.getRawOffset();
        java.lang.String str11 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y0M0DT0H0M0.023S", false, timeZone9);
        java.lang.String str12 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) 'x', "CAN", true, timeZone9);
        java.lang.String str13 = timeZone9.getID();
        timeZone9.setID("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y000DT00000.0230" + "'", str11, "P0Y000DT00000.0230");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CAN" + "'", str12, "CAN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GMT" + "'", str13, "GMT");
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                     !i0", 100, "Uen-CAUUUUUUUUUUUUUUUUUUUUUUU0:00:00.097UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                     !i0" + "'", str3, "                                                                                                                     !i0");
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "P0Y0M0DT0H0M0.010S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        java.util.Locale locale3 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Locale locale7 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.lang.String str9 = locale7.getLanguage();
        java.util.Set<java.lang.String> strSet10 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str11 = locale3.getDisplayScript(locale7);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih", 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15, 'a', 0, 0);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray15);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.stripAll(strArray20, "ENG");
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny("zh_44444444444444444444444444444zh_", strArray20);
        boolean boolean24 = locale3.equals((java.lang.Object) strArray20);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "!ih" + "'", str9, "!ih");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("UN00UNUN_0 day32 0 0our32 0 0inute032 0 econdUN000UNUN", "chinesisch                                                                                          ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int2 = timeZone1.getRawOffset();
        int int3 = timeZone1.getRawOffset();
        timeZone1.setID("!ih");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = timeZone1.getDisplayName(false, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.Locale locale6 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        java.util.Collection<java.util.Locale> localeCollection7 = null;
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList9 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection7, filteringMode8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList13, strMap14);
        java.util.Locale locale19 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet20 = locale19.getExtensionKeys();
        java.lang.String str21 = locale19.getLanguage();
        java.util.Set<java.lang.String> strSet22 = locale19.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode23 = null;
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags(languageRangeList13, (java.util.Collection<java.lang.String>) strSet22, filteringMode23);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode8.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList9);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeList15);
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "!ih" + "'", str21, "!ih");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("0:00:00.003", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!ih!ih!...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("_0 days 0 hours 0 minutes 0 seconds", " un0 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_0 days 0 hours 0 minutes 0 seconds" + "'", str2, "_0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        java.util.Locale locale1 = new java.util.Locale("44444444444444444444444444444444444444 HI!");
        org.junit.Assert.assertEquals(locale1.toString(), "44444444444444444444444444444444444444 hi!");
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        int int17 = timeZone13.getOffset((long) (-1));
        boolean boolean18 = timeZone13.observesDaylightTime();
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("UN00UNUN_0_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0P0Y0M0DT0H0M0.020S", "                                 0 DAY0 0 0OUR0 0 0INUTE00 0 ECOND                                  ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("fran\347ais", "                                                hi!                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale2);
        java.lang.String str4 = locale0.getDisplayVariant(locale2);
        java.lang.Object obj5 = locale2.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "de_DE");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "de_DE");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "de_DE");
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("   te0    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "te0" + "'", str1, "te0");
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("99.00:00:0");
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale4);
        java.lang.String str7 = locale1.getDisplayVariant(locale4);
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category8, locale9);
        java.util.Set<java.lang.String> strSet11 = locale9.getUnicodeLocaleKeys();
        java.util.Locale locale13 = new java.util.Locale("");
        java.util.Locale locale15 = new java.util.Locale("\u4e2d\u6587");
        java.lang.String str16 = locale13.getDisplayScript(locale15);
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("P0Y0M0DT0H0M0.034S");
        java.lang.String str19 = locale15.getDisplayName(locale18);
        java.lang.String str20 = locale9.getDisplayScript(locale15);
        java.util.Locale locale23 = new java.util.Locale("0:00:00.000", "zh_TW");
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale locale25 = builder24.build();
        java.util.Locale.setDefault(locale25);
        java.util.Locale locale27 = java.util.Locale.CHINA;
        java.util.Locale locale28 = java.util.Locale.PRC;
        java.lang.String str29 = locale27.getDisplayLanguage(locale28);
        java.lang.String str30 = locale25.getDisplayLanguage(locale28);
        java.lang.String str31 = locale23.getDisplayVariant(locale28);
        java.lang.String str32 = locale15.getDisplayVariant(locale28);
        java.util.Locale locale34 = java.util.Locale.GERMANY;
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale34);
        java.lang.String str36 = locale28.getDisplayName(locale34);
        java.lang.String str37 = locale1.getDisplayCountry(locale28);
        java.lang.String str38 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "99.00:00:0" + "'", str6, "99.00:00:0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals(locale15.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u4e2d\u6587" + "'", str19, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale23.toString(), "0:00:00.000_ZH_TW");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u4e2d\u6587" + "'", str29, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Chinesisch (China)" + "'", str36, "Chinesisch (China)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("FRA", "de_DE", "                                                                                              dnu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FRA" + "'", str3, "FRA");
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a" + "'", str1, "000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a");
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 119);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.119" + "'", str1, "0:00:00.119");
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuu", 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...ch0eure0eGr...uuuuuuuuuuuuuzh_CN" + "'", str3, "...ch0eure0eGr...uuuuuuuuuuuuuzh_CN");
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.lang.String str9 = locale8.getDisplayVariant();
        java.lang.String str10 = locale8.getISO3Language();
        java.util.Locale.Builder builder11 = builder7.setLocale(locale8);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zho" + "'", str10, "zho");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\u4e2d\u6587!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!ih!ih!...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "\u4e2d\u6587\u4e2d\u56fd)");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("EN-GB", 'x');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0P0Y0M0DT0H0M0.020S");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray9);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "Cine0e");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-GB" + "'", str10, "-GB");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!ih!ih!...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str13, "\u4e2d\u6587!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!ih!ih!...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("xxxxxxxxxxxxxxxxxxxxxxxxxxchinaxxxxxxxxxxxxxxxxxxxxxxxxxx", "GBP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.util.Locale locale5 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet6 = locale5.getExtensionKeys();
        java.lang.String str7 = locale5.getLanguage();
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.util.Locale locale10 = locale9.stripExtensions();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale9);
        boolean boolean12 = locale9.hasExtensions();
        java.util.Set<java.lang.String> strSet13 = locale9.getUnicodeLocaleKeys();
        java.lang.String str14 = locale5.getDisplayCountry(locale9);
        java.lang.String str15 = locale0.getDisplayScript(locale9);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "France" + "'", str1, "France");
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!ih" + "'", str7, "!ih");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "99.00:00:0" + "'", str11, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str14, "P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        java.util.Locale locale2 = java.util.Locale.UK;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("P0Y0-10DT07430-10.0343599900", locale2);
        java.lang.String str4 = locale2.getISO3Language();
        java.lang.String str5 = locale2.toLanguageTag();
        java.util.Set<java.lang.String> strSet6 = locale2.getUnicodeLocaleKeys();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.upperCase("GMT+00:00", locale2);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0343599900" + "'", str3, "P0Y0-10DT07430-10.0343599900");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eng" + "'", str4, "eng");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en-GB" + "'", str5, "en-GB");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GMT+00:00" + "'", str7, "GMT+00:00");
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("P-1Y11M30DT23H59M59.991S", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.991S" + "'", str2, "P-1Y11M30DT23H59M59.991S");
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("P0Y0M0DT0H0M0.014S", (int) 'x', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.014Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.014Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("can", "de_zh_tw (P0Y0-10DT07430-10.0343", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!#######", "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!#######" + "'", str2, "hi!#######");
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        java.util.Locale.Builder builder9 = builder7.setLanguage("");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.lang.String str15 = locale12.getDisplayName(locale14);
        java.util.Locale locale16 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale16.getExtension('a');
        java.lang.String str19 = locale12.getDisplayVariant(locale16);
        java.util.Locale.Builder builder20 = builder10.setLocale(locale16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder23 = builder20.setUnicodeLocaleKeyword("'4P4'4yyyy4'4Y4'4M4'4M4'4d4'4DT4'4H4'4H4'4m4'4M4'4s4.4S4'4S", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: '4P4'4yyyy4'4Y4'4M4'4M4'4d4'4DT4'4H4'4H4'4m4'4M4'4s4.4S4'4S [at index 0]");
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
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str15, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de_DE");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4444444444444444P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "P0Y000DT00000.0230");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\uad6d\uc911\uc5b4\uad6d\uc911", " I!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) " und ", (java.lang.CharSequence) "Chinese (China)FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("\u683c\u6797\u5a01\u6cbb\u6642\u9593", "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u683c\u6797\u5a01\u6cbb\u6642\u9593" + "'", str2, "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
    }
}
