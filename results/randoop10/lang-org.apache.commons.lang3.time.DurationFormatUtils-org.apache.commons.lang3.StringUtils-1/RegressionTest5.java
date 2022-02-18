import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        char[] charArray9 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\u683c\u6797\u5a01\u6cbb\u6642\u9593", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 14, "P-1Y11M30DT23H59M59.999S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11030DT23059059.99914" + "'", str3, "P-1Y11030DT23059059.99914");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("fR", "I!", 23);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0:00:00.097", "p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s", 32);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("                  ", strArray5, strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                  " + "'", str10, "                  ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("anglais(Canada)", "un00unun_0 DAY32 0 0OUR32 0 0INUTE032 0 ECONDun000unun", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 52, true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        int int16 = timeZone13.getRawOffset();
        java.time.ZoneId zoneId17 = timeZone13.toZoneId();
        boolean boolean18 = timeZone13.observesDaylightTime();
        java.time.ZoneId zoneId19 = timeZone13.toZoneId();
        java.lang.Object obj20 = timeZone13.clone();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zoneId19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0320.000000I!                                                                                              ", 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0320.000000I!  ..." + "'", str2, "0320.000000I!  ...");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!I" + "'", str1, "!I");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.lang.String str4 = locale3.getCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "\u53f0\u7063", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u53f0\u7063" + "'", str3, "\u53f0\u7063");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode2 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        boolean boolean3 = locale0.equals((java.lang.Object) filteringMode2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + filteringMode2 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode2.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "Chinese(China)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        int int2 = timeZone1.getRawOffset();
        int int3 = timeZone1.getRawOffset();
        timeZone1.setID("0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("");
        int int8 = timeZone7.getRawOffset();
        java.lang.String str9 = timeZone7.getID();
        java.time.ZoneId zoneId10 = timeZone7.toZoneId();
        boolean boolean11 = timeZone1.hasSameRules(timeZone7);
        int int13 = timeZone7.getOffset((-1L));
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        java.util.Locale locale2 = new java.util.Locale("");
        java.util.Locale locale4 = new java.util.Locale("\u4e2d\u6587");
        java.lang.String str5 = locale2.getDisplayScript(locale4);
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("P0Y0M0DT0H0M0.034S");
        java.lang.String str8 = locale4.getDisplayName(locale7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.upperCase("####################################################################################################################", locale4);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals(locale4.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u6587" + "'", str8, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "####################################################################################################################" + "'", str9, "####################################################################################################################");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\u6cd5\u6587\u6cd5\u56fd)", "P0Y0M0DT0H0M0.001S", (int) '#');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'u');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str5, "\u6cd5\u6587\u6cd5\u56fd)");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "hine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!44444444444444444444444444444", '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "HI!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "44444444444444444444444444444" + "'", str6, "44444444444444444444444444444");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                    !I0", 104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                     ..." + "'", str2, "                                                                                                     ...");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("Heure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de Greenwich", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("zh_CN", "Cine0e");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cine0e" + "'", str2, "Cine0e");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("               zh              ", 224);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
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
        java.util.Locale locale16 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.lang.String str17 = locale7.getDisplayVariant(locale16);
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
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "                       44444444444444444444444444444W");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("0danaC:danaC00danaC:danaC00danaC.danaC097", "can", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", (int) (byte) 10, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("zh_TW", (int) 'x', 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Chinesisch                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinesisch" + "'", str1, "Chinesisch");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", "     4444444444444444444444444444444444444444444444444444      ", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
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
        java.util.Locale locale22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = timeZone6.getDisplayName(true, (int) (short) -1, locale22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo xh yi yo za zh zu", "P0Y0M0DT0H0M0.090S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("P0Y0M0DT0H0M0.090S", "hi!", "Chinese (China)");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        int int2 = timeZone1.getRawOffset();
        java.lang.String str3 = timeZone1.getID();
        java.time.ZoneId zoneId4 = timeZone1.toZoneId();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = timeZone1.getOffset(17, 8, (int) (byte) -1, 0, 11, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GMT" + "'", str3, "GMT");
        org.junit.Assert.assertNotNull(zoneId4);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "United States");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "#######p0y0m0dt0h0m0.000s#######");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("Chine", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.034Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chine" + "'", str2, "Chine");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("en_GB", "UNITED STATES");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en_GB" + "'", str2, "en_GB");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", "Canada");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("00DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.090153");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00dt00000.090153HIp0y000dt00000.090153!p0y000dt00000.090153" + "'", str1, "00dt00000.090153HIp0y000dt00000.090153!p0y000dt00000.090153");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("Canada", locale1);
        java.util.Locale locale5 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.util.Locale locale8 = new java.util.Locale("                                                                                                                     !I0", "zho");
        java.lang.String str9 = locale5.getDisplayScript(locale8);
        java.lang.String str10 = locale1.getDisplayCountry(locale5);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "canada" + "'", str2, "canada");
        org.junit.Assert.assertEquals(locale5.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals(locale8.toString(), "                                                                                                                     !i0_ZHO");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon", 1, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!", '4');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("4444444444444444444444444444444444444444444444444444", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'u');
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0M0DT0H0M0.001S", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", 10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("p0y0m0dt0h0m0.000s", strArray4, strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray11);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "p0y0m0dt0h0m0.000s" + "'", str12, "p0y0m0dt0h0m0.000s");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str13, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "z", "P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "xChinesischxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11M30DT23H59M59.990S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11M30DT23H59M59.990S" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11M30DT23H59M59.990S");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        java.util.Locale locale1 = new java.util.Locale("English (United States)");
        java.util.Locale locale4 = new java.util.Locale("                                                                                                                     !I0", "zho");
        java.lang.String str5 = locale1.getDisplayCountry(locale4);
        java.util.Locale locale6 = locale4.stripExtensions();
        java.util.Locale.setDefault(locale6);
        org.junit.Assert.assertEquals(locale1.toString(), "english (united states)");
        org.junit.Assert.assertEquals(locale4.toString(), "                                                                                                                     !i0_ZHO");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "                                                                                                                     !i0_ZHO");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder5.setLanguage("und");
        java.util.Locale.Builder builder8 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("Chinese (China)FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Chinese (China)FRANC?AIS???????? (??????) [at index 0]");
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
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("English (United States)", "stestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'nglish (United Kingdom)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("deuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "deuuuuuuuuuuuuuuuu" + "'", str1, "deuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...ch0eure 0e Gr...", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "p0y0m0dt0h0m0.010s", "P0Y0M0DT0H0M0.99S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                !I0", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 !I0" + "'", str2, "                                                                                                 !I0");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("HI!", "\u4e2d\u6587!ih!ih!i", "H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("P0Y0M0DT0H0M0.121S", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 P0Y0M0DT0H0M0.121S" + "'", str2, "                 P0Y0M0DT0H0M0.121S");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" #####################################################################################################################  ", (int) '#', 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " #####################################################################################################################  " + "'", str3, " #####################################################################################################################  ");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("p-1Y11M30DT23H59M59.975S", "ihihtestestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm'ss's'");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\u6cd5\u6587\u6cd5\u56fd))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd))" + "'", str1, "\u6cd5\u6587\u6cd5\u56fd))");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Locale[] localeArray4 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList5 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList5, localeArray4);
        java.util.Locale locale7 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList5);
        java.util.Collection<java.util.Locale> localeCollection8 = null;
        java.util.Locale.FilteringMode filteringMode9 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList10 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, localeCollection8, filteringMode9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strMap11);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Locale.Category category16 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category16, locale17);
        java.util.Set<java.lang.String> strSet19 = locale17.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList20 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strSet19);
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strSet19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = java.util.Locale.lookupTag(languageRangeList0, (java.util.Collection<java.lang.String>) strList21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertTrue("'" + filteringMode9 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode9.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList10);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category16.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "                                                                                                                     !i0_ZHO");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("undundun_0 DAYS 0 HOURS 0 MINUTES 0 SECONDSundundund", "0 DAYS 0 HOURS 0 MINUTES 0 SECO");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "P-1Y11M30DT23H59M59.990S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0M0DT0H0M0.001S");
        timeZone1.setID("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        int int4 = timeZone1.getRawOffset();
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = timeZone1.getDisplayName(true, (int) (short) 100, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("");
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone6);
        boolean boolean8 = timeZone6.observesDaylightTime();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("");
        java.lang.String str15 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone14);
        boolean boolean16 = timeZone6.hasSameRules(timeZone14);
        boolean boolean17 = timeZone0.hasSameRules(timeZone6);
        java.util.TimeZone timeZone23 = java.util.TimeZone.getTimeZone("");
        java.lang.String str24 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone23);
        boolean boolean25 = timeZone23.observesDaylightTime();
        java.util.TimeZone timeZone31 = java.util.TimeZone.getTimeZone("");
        java.lang.String str32 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone31);
        boolean boolean33 = timeZone23.hasSameRules(timeZone31);
        java.util.TimeZone timeZone39 = java.util.TimeZone.getTimeZone("");
        java.lang.String str40 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone39);
        boolean boolean41 = timeZone39.observesDaylightTime();
        java.util.TimeZone timeZone47 = java.util.TimeZone.getTimeZone("");
        java.lang.String str48 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone47);
        boolean boolean49 = timeZone39.hasSameRules(timeZone47);
        java.time.ZoneId zoneId50 = timeZone47.toZoneId();
        timeZone47.setRawOffset(52);
        boolean boolean53 = timeZone31.hasSameRules(timeZone47);
        boolean boolean54 = timeZone6.hasSameRules(timeZone47);
        java.util.Locale locale57 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet58 = locale57.getUnicodeLocaleKeys();
        java.util.Locale locale59 = java.util.Locale.CHINESE;
        java.lang.String str60 = locale57.getDisplayName(locale59);
        java.lang.String str61 = locale59.getLanguage();
        java.util.Set<java.lang.String> strSet62 = locale59.getUnicodeLocaleAttributes();
        java.lang.String str63 = locale59.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str64 = timeZone47.getDisplayName(true, 89, locale59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 89");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u4e2d\u6587" + "'", str24, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u4e2d\u6587" + "'", str32, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u4e2d\u6587" + "'", str40, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\u4e2d\u6587" + "'", str48, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(zoneId50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str60, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "zh" + "'", str61, "zh");
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0 days 0 hours 0 minutes 0 seconds");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0M0DT0H0M0.001S", "!IH");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("0e-0:00:00.017", strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 15 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\u6cd5\u6587\u6cd5\u56fd)", "de");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=117.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00          0I!          0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:", "P0Y0-10DT07430-10.0323599998");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("P-1Y11M30DT23H59M59.999S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P-1Y11M30DT23H59M59.999" + "'", str1, "P-1Y11M30DT23H59M59.999");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("          0I!          ", "0danaC:danaC00danaC:danaC00danaC.danaC097");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str1 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eng" + "'", str1, "eng");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\u683c\u6797\u5a01\u6cbb\u6642\u9593", "   ...M0.001S    ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fr_FR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fr_fr");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale1);
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.lang.String str4 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "German (Germany)" + "'", str4, "German (Germany)");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("!I0", "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "und");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str2 = locale0.getISO3Language();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.setDefault(locale4);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Locale locale7 = java.util.Locale.PRC;
        java.lang.String str8 = locale6.getDisplayLanguage(locale7);
        java.lang.String str9 = locale4.getDisplayLanguage(locale7);
        java.lang.String str10 = locale7.getISO3Language();
        java.lang.String str11 = locale0.getDisplayName(locale7);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zho" + "'", str2, "zho");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u6587" + "'", str8, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zho" + "'", str10, "zho");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str11, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.util.Set<java.lang.Character> charSet4 = locale1.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fra" + "'", str2, "fra");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charSet4);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
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
        java.lang.String str20 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
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
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Greenwich Mean Time" + "'", str20, "Greenwich Mean Time");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "zh", (java.lang.CharSequence) "!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str2, "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Chinese(China)", (int) (byte) -1, "0et");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinese(China)" + "'", str3, "Chinese(China)");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("P0Y0M0DT0H0M0.001S", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P0Y0M0DT0H0M0.010S", "\u4e2d\u6587!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!ih!ih!...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!IH", 336, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!IHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!IHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Chine", "-gb");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("P-1Y11M30DT23H59M59.990S", 'x');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'x');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P-1Y11M30DT23H59M59.990S" + "'", str4, "P-1Y11M30DT23H59M59.990S");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("en-GB");
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setVariant("P0Y0-10DT07430-10.0343599900I!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: P0Y0-10DT07430-10.0343599900I! [at index 0]");
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
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!" + "'", str3, "I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 8, "_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND" + "'", str2, "_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0:00:00.089", 104, "can");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cancancancancancancancancancancancancancancancancancancancancancancancancancancancancancancan0:00:00.089" + "'", str3, "cancancancancancancancancancancancancancancancancancancancancancancancancancancancancancancan0:00:00.089");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO(10L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str1, "P0Y0M0DT0H0M0.010S");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("Korean");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Korean" + "'", str1, "Korean");
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
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
        java.lang.String str20 = locale4.getISO3Language();
        java.lang.String str21 = locale4.getCountry();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zho" + "'", str20, "zho");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CN" + "'", str21, "CN");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("#######P0Y0M0DT0H0M0.000S#######", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=#######p0y0m0dt0h0m0.000s#######");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!", "####################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!" + "'", str2, "eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("en", "P-1Y11M30DT23H59M59.990S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en" + "'", str2, "en");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("   ...M0.001S    ", "Germany##############################################################################################################", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        java.util.Locale locale2 = new java.util.Locale("zh_TW", "Chinese (China)");
        java.lang.String str4 = locale2.getExtension('x');
        org.junit.Assert.assertEquals(locale2.toString(), "zh_tw_CHINESE (CHINA)");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("chinois", 41);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("-GB", 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray10 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence2, charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\u671d\u9c9c\u6587", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "z", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        java.util.Locale locale1 = new java.util.Locale("ih");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale1.getCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "ih");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("P0Y0M0DT0H0M0.99S", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str2, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("P0Y0M0DT0H0M0.121S", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.121S" + "'", str2, "P0Y0M0DT0H0M0.121S");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("China", (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        java.util.Locale locale18 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.util.Locale locale19 = java.util.Locale.CHINESE;
        java.lang.String str20 = locale18.getDisplayName(locale19);
        java.lang.String str21 = locale19.toLanguageTag();
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.lang.String str23 = locale19.getDisplayLanguage(locale22);
        java.util.Locale locale24 = null;
        java.lang.String str25 = locale19.getDisplayCountry(locale24);
        java.lang.String str26 = timeZone13.getDisplayName(locale19);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals(locale18.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str20, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zh" + "'", str21, "zh");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Chinesisch" + "'", str23, "Chinesisch");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Greenwich Mean Time" + "'", str26, "Greenwich Mean Time");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("####################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####################################################################################################################" + "'", str1, "####################################################################################################################");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale1);
        java.lang.String str3 = locale1.toLanguageTag();
        java.lang.String str4 = locale1.getDisplayScript();
        java.lang.String str5 = locale1.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale1.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "de-DE" + "'", str3, "de-DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("343599900", 23, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("P-1Y11M30DT23H59M59.989S", 153, 89);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "0 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "                                                P0Y000DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.090153", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        int int16 = timeZone13.getRawOffset();
        java.time.ZoneId zoneId17 = timeZone13.toZoneId();
        boolean boolean18 = timeZone13.observesDaylightTime();
        java.time.ZoneId zoneId19 = timeZone13.toZoneId();
        java.util.Date date20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = timeZone13.inDaylightTime(date20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zoneId19);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("eng");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eng" + "'", str1, "eng");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setLanguage("UNITED STATES");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: UNITED STATES [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                P0Y000DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.090153", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                P0Y000DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.090153" + "'", str4, "                                                P0Y000DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.090153");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!ih", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Chinese", "P0Y0M0DT0H0M0.090S", "\u4e2d\u6587!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!ih!ih!...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinese" + "'", str3, "Chinese");
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale10 = new java.util.Locale("English (United States)");
        java.util.Locale locale13 = new java.util.Locale("                                                                                                                     !I0", "zho");
        java.lang.String str14 = locale10.getDisplayCountry(locale13);
        java.util.Locale locale15 = locale13.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder7.setLocale(locale15);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language:                                                                                                                      !i0 [at index 0]");
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
        org.junit.Assert.assertEquals(locale10.toString(), "english (united states)");
        org.junit.Assert.assertEquals(locale13.toString(), "                                                                                                                     !i0_ZHO");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "                                                                                                                     !i0_ZHO");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0320.000000I!                                                                                              ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("4444444444444444444444444444444444444444444444444444444444444444444440 DAYS 0 HOURS 0 MINUTES 0 SECO", "CAN", (int) 'x');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        int int9 = timeZone5.getOffset(0L);
        timeZone5.setID("P0Y0M0DT0H0M0.100S");
        int int12 = timeZone5.getRawOffset();
        boolean boolean13 = timeZone5.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!IH#####################################################################################################################", 0, "canada");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH#####################################################################################################################" + "'", str3, "!IH#####################################################################################################################");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND" + "'", str1, "_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("0I!                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0I!                                                                                              " + "'", str1, "0I!                                                                                              ");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" und ", (-1), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " und " + "'", str3, " und ");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
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
        java.util.Locale.setDefault(locale22);
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
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("Chine");
        java.util.Locale.Builder builder6 = builder0.setLanguage("Chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setLanguageTag("0:00:00.000");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 0:00:00.000 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI!                                                                                              ", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "########Chinese (China)#########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 19);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.019S" + "'", str1, "P0Y0M0DT0H0M0.019S");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concatWith("France", objArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(" #####################################################################################################################  ", 153);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\uad6d\uc911\uc5b4\uad6d\uc911");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\uad6d\uc911\uc5b4\uad6d\uc911" + "'", str1, "\uad6d\uc911\uc5b4\uad6d\uc911");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setLanguage("zh_44444444444444444444444444444zh_");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: zh_44444444444444444444444444444zh_ [at index 0]");
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
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("english (united states)", "P0Y0M0DT0H0M0.034S", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("P-1Y11M30DT23H59M59.901S", (int) 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str2, "P-1Y11M30DT23H59M59.901S");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "P0Y0M0DT0H0M0.097S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("CN", "zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 17, 0L, "P0Y000DT00000.00120");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00120" + "'", str3, "P0Y000DT00000.00120");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                 P-1Y11M30DT23H59M59.947S0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", 23, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 P-1Y11M30DT23H59M59.947S0DT0H0M0.090S!P0Y0M0DT0H0M0.090S" + "'", str3, "                                 P-1Y11M30DT23H59M59.947S0DT0H0M0.090S!P0Y0M0DT0H0M0.090S");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444zh_tw");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ZH_TW" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ZH_TW");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("UN00UNUN_0 day32 0 0our32 0 0inute032 0 econdUN000UNUN", "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UN00UNUN_0 day32 0 0our32 0 0inute032 0 econdUN000UNUN" + "'", str2, "UN00UNUN_0 day32 0 0our32 0 0inute032 0 econdUN000UNUN");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("     4444444444444444444444444444444444444444444444444444      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder5.setLanguage("und");
        java.util.Locale locale9 = java.util.Locale.ROOT;
        java.util.Locale locale12 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.lang.String str13 = locale9.getDisplayCountry(locale12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", locale9);
        java.lang.String str15 = locale9.getScript();
        boolean boolean16 = locale9.hasExtensions();
        java.util.Locale.Builder builder17 = builder5.setLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder17.setExtension('a', "\u6cd5\u6587\u6cd5\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: !ih [at index 0]");
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
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale12.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str14, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaChinese (China)aaaaaaaaaaaaa", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaChinese (China)aaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaChinese (China)aaaaaaaaaaaaa");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 96);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.096" + "'", str1, "0:00:00.096");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("P0Y0-10DT07430-10.0323599998", "4444444444444444444444444444444444444444444444444444444444444444444440 DAYS 0 HOURS 0 MINUTES 0 SECO", "P0Y0M0DT0H0M0.100S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0323599998" + "'", str3, "P0Y0-10DT07430-10.0323599998");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097", "               zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 120, (long) 224, "STESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'NGLISH (uNITED kINGDOM)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00000000000000104TETETETETETETETETETETETETETETETETPYYYYY0MDDT0H0M104.SNGLI0 (uNITED kINGDO0)" + "'", str3, "00000000000000104TETETETETETETETETETETETETETETETETPYYYYY0MDDT0H0M104.SNGLI0 (uNITED kINGDO0)");
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.lang.String str4 = locale2.getLanguage();
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = locale5.getDisplayName();
        java.util.Set<java.lang.Character> charSet7 = locale5.getExtensionKeys();
        java.util.Set<java.lang.String> strSet8 = locale5.getUnicodeLocaleAttributes();
        boolean boolean9 = locale2.equals((java.lang.Object) strSet8);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str6, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("           HI!", "", "44444444444444444444444444444444444444 HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "           HI!" + "'", str3, "           HI!");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
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
            java.util.Locale.Builder builder13 = builder11.setScript("P0Y0M0DT0H0M0.041S");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: P0Y0M0DT0H0M0.041S [at index 0]");
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
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("0e-DE", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0e-DE" + "'", str2, "0e-DE");
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!", '4');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0 seconds", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI!" + "'", str5, "HI!");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        int int2 = timeZone1.getRawOffset();
        boolean boolean3 = timeZone1.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "P0Y0M0DT0H0M0.068S", (java.lang.CharSequence) "fra");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" un0 ", 42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        java.util.Locale locale3 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        java.lang.String str5 = locale3.getLanguage();
        java.util.Locale locale6 = locale3.stripExtensions();
        java.lang.Object obj7 = null;
        boolean boolean8 = locale3.equals(obj7);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!ih" + "'", str5, "!ih");
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("99.00:00:0");
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale7);
        java.util.Locale.Builder builder10 = builder5.setLocale(locale7);
        java.lang.String str11 = locale4.getDisplayLanguage(locale7);
        java.util.Locale.Builder builder12 = builder1.setLocale(locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder1.removeUnicodeLocaleAttribute("zh_44444444444444444444444444444zh_      ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: zh_44444444444444444444444444444zh_       [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "99.00:00:0" + "'", str9, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.setLanguage("Cine0e");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: Cine0e [at index 0]");
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
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!", "ZH_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!" + "'", str2, "eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!");
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "de" + "'", str1, "de");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!IHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "0e-0:00:00.017");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("de_DE", "            0:00:00.000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de_DE" + "'", str2, "de_DE");
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("CAN", (int) (byte) -1, "p0y000dt00000.0230");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CAN" + "'", str3, "CAN");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "p000000t00000.0230");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder7 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder9 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setLanguageTag("P-1Y11M30DT23H59M59.989S");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: P [at index 0]");
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
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u6cd5\u6587\u6cd5\u56fd)", 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "STESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'NGLISH (uNITED kINGDOM)", 120, (int) 'u');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.lang.String str6 = locale2.getDisplayCountry();
        java.lang.String str7 = locale2.toLanguageTag();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-CN" + "'", str7, "zh-CN");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                                                                              !I0                                      P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("p0y000dt00000.0230", "fran\347ais");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        java.lang.Iterable<java.util.Locale.LanguageRange> languageRangeIterable0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(languageRangeIterable0, 'a');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("0e-0:00:00.017");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0e-0:00:00.017" + "'", str1, "0e-0:00:00.017");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("zh_CNzhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz", "0:00:00.99");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_CNzhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz" + "'", str2, "zh_CNzhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr_FR" + "'", str1, "fr_FR");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("!ih!ih!...", "canada", (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!..." + "'", str3, "!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...");
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("German (Germany)", "DE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("P0Y0M0DT0H0M0.031S", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("P0Y0M0DT0H0M0.001S", "P0Y0-10DT07430-10.0323599998", 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("\u53f0\u7063");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u53f0\u7063" + "'", str1, "\u53f0\u7063");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 'x');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        java.util.Locale locale3 = new java.util.Locale("Chinesisch                                                                                          ", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "                       44444444444444444444444444444W");
        org.junit.Assert.assertEquals(locale3.toString(), "chinesisch                                                                                          _XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX_                       44444444444444444444444444444W");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
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
        boolean boolean34 = timeZone6.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
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
        java.util.Locale.Builder builder17 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder7.setExtension('x', "00dt00000.090153HIp0y000dt00000.090153!p0y000dt00000.090153");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: 00dt00000.090153HIp0y000dt00000.090153!p0y000dt00000.090153 [at index 0]");
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
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fra" + "'", str15, "fra");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("     4444444444444444444444444444444444444444444444444444      ", "UN00UNUN_0 day32 0 0our32 0 0inute032 0 econdUN000UNUN", 153);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale.Builder builder7 = builder3.clear();
        java.util.Locale.Builder builder8 = builder3.clear();
        java.util.Locale locale9 = builder8.build();
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
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("44p0y0m0dt0h0m0.090s4444444444444444444", "00dt00000.090153HIp0y000dt00000.090153!p0y000dt00000.090153", "                                                                                                     ...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\u6cd5\u6587\u6cd5\u56fd))", "P-1Y11-130DT2374359-159.9903599985");
// flaky:         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        timeZone13.setID("zh");
        int int18 = timeZone13.getRawOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId19 = timeZone13.toZoneId();
            org.junit.Assert.fail("Expected exception of type java.time.zone.ZoneRulesException; message: Unknown time-zone ID: zh");
        } catch (java.time.zone.ZoneRulesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 336, (long) 14, "P0Y0M0DT0H0M0.121S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0-10DT07430-10.1213599678" + "'", str3, "P0Y0-10DT07430-10.1213599678");
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\u4e2d\u6587", (java.lang.CharSequence) "CA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("0e-de", "CA", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
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
            java.util.Locale.Builder builder11 = builder5.setLanguageTag("4444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 4444444444444444444444444444444444444444444444444444 [at index 0]");
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
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", "", "...ch0eure 0e Gr...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        int int2 = timeZone1.getRawOffset();
        java.lang.String str3 = timeZone1.getID();
        java.time.ZoneId zoneId4 = timeZone1.toZoneId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = timeZone1.getDisplayName(true, 41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 41");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GMT" + "'", str3, "GMT");
        org.junit.Assert.assertNotNull(zoneId4);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "OUhS 0 MI");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                ...", "_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444zh_tw ECOND");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                ..." + "'", str2, "                                ...");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaxabxaexafxakxamxanxarxasxavxayxazxbaxbexbgxbhxbixbmxbnxboxbrxbsxcaxcexchxcoxcrxcsxcxcvxcyxdaxdexdvxdzxeexelxenxeoxesxetxexfaxffxfixfjxfoxfrxfyxgaxgdxglxgnxgxgvxhaxhexhixhoxhrxhtxhxhyxhzxiaxidxiexigxiixikxinxioxisxitxixiwxjaxjixjvxkaxkgxkixkjxkkxklxkmxknxkoxkrxksxkxkvxkwxkyxlaxlbxlgxlixlnxloxltxlxlvxmgxmhxmixmkxmlxmnxmoxmrxmsxmtxmyxnaxnbxndxnexngxnlxnnxnoxnrxnvxnyxocxojxomxorxosxpaxpixplxpsxptxqxrmxrnxroxrxrwxsaxscxsdxsexsgxsixskxslxsmxsnxsoxsqxsrxssxstxsxsvxswxtaxtextgxthxtixtkxtlxtnxtoxtrxtsxttxtwxtyxgxkxrxzxvexvixvoxwaxwoxxhxyixyoxzaxzhxz", "P-1Y11M30DT23H59M59.901S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "P0Y0M0DT0H0M0.031S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.031S" + "'", str1, "P0Y0M0DT0H0M0.031S");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("p0y0m0dt0h0m0.090s");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("OURS 0 MI", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("de_DE", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited(" #####################################################################################################################  ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################################################################################################################" + "'", str2, "#####################################################################################################################");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 120, "                                                                                                 !I0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 !I0" + "'", str2, "                                                                                                 !I0");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ZH_tw", 52, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'H'ZH_tw'P'yyyy'Y'M'M'd'DT'H'H'm" + "'", str3, "'P'yyyy'Y'M'M'd'DT'H'H'ZH_tw'P'yyyy'Y'M'M'd'DT'H'H'm");
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Italy");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\uad6d\uc911\uc5b4\uad6d\uc911sia\347narf)anihc( esenihc", 32);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "   ...M0.001S    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(" und ", "\uad6d\uc911\uc5b4\uad6d\uc911");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " und " + "'", str2, " und ");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!#######", 104, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                               hi!#######                                               " + "'", str3, "                                               hi!#######                                               ");
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("P0Y0M0DT0H0M0.041S", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       P0Y0M0DT0H0M0.041S       " + "'", str2, "       P0Y0M0DT0H0M0.041S       ");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("ENG", 120);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ENG                                                                                                                     " + "'", str2, "ENG                                                                                                                     ");
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        java.util.Locale locale1 = new java.util.Locale("English (United States)");
        java.util.Locale locale4 = new java.util.Locale("                                                                                                                     !I0", "zho");
        java.lang.String str5 = locale1.getDisplayCountry(locale4);
        java.lang.String str6 = locale4.toLanguageTag();
        java.util.Set<java.lang.String> strSet7 = locale4.getUnicodeLocaleKeys();
        java.lang.String str8 = locale4.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "english (united states)");
        org.junit.Assert.assertEquals(locale4.toString(), "                                                                                                                     !i0_ZHO");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "und" + "'", str6, "und");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                                     !i0_ZHO" + "'", str8, "                                                                                                                     !i0_ZHO");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\u6cd5\u6587\u6cd5\u56fd)", "                zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str2, "\u6cd5\u6587\u6cd5\u56fd)");
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("0 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a00", 4, 96);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a" + "'", str3, "000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder7 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder9 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setScript("                  ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script:                    [at index 0]");
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
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!", "...ch0eure 0e Gr...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("P0Y0-10DT07430-10.1213599678", "0I!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("English (United States)");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("\u4e2d\u6587");
        java.lang.String str4 = timeZone1.getDisplayName(locale3);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Greenwich Mean Time" + "'", str4, "Greenwich Mean Time");
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                                                                                                     !i0", (java.lang.CharSequence) " I!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                                                     !i0" + "'", charSequence2, "                                                                                                                     !i0");
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0:00:00.097", (int) (short) -1, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.097" + "'", str3, "0:00:00.097");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        char[] charArray7 = new char[] { '4', '#' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0 days 0 hours 0 minutes 0 seconds", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "'P'yyyy''''d''''m''s.''", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Chine", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0 seconds", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, #]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        char[] charArray9 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "p0y0m0dt0h0m0.090s", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!..." + "'", str1, "!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "english (united states)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 23 + "'", int1 == 23);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "4444444444444444P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S444444444444444444444444" + "'", str1, "4444444444444444P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S444444444444444444444444");
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(" un0 ", "zh_44444444444444444444444444444zh_");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int10 = timeZone9.getRawOffset();
        java.lang.String str11 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y0M0DT0H0M0.023S", false, timeZone9);
        java.lang.String str12 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) 'a', "P0Y0-10DT07430-10.1213599678", false, timeZone9);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y000DT00000.0230" + "'", str11, "P0Y000DT00000.0230");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "P0Y0-10DT07430-10.1213599678" + "'", str12, "P0Y0-10DT07430-10.1213599678");
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("P00-1Y11M30DT23H59M59.991S", "                                                         danac                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                         danac                                                          " + "'", str2, "                                                         danac                                                          ");
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("P0Y0M0DT0H0M0.010S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str1, "P0Y0M0DT0H0M0.010S");
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("p0y0m0dt0h0m0.000s", "4444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0M0DT0H0M0.001S");
        java.lang.String str2 = timeZone1.getID();
        boolean boolean3 = timeZone1.observesDaylightTime();
        boolean boolean4 = timeZone1.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GMT" + "'", str2, "GMT");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("anglais(Canada)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anglais(Canada)" + "'", str1, "anglais(Canada)");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                        " + "'", str2, "                                                                                                        ");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("english (united states)", "de_DE", "aaaaaaaaaaaaaChinese (China)aaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
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
        java.util.Locale locale39 = new java.util.Locale("");
        java.util.Locale locale41 = new java.util.Locale("\u4e2d\u6587");
        java.lang.String str42 = locale39.getDisplayScript(locale41);
        java.util.Locale locale44 = java.util.Locale.forLanguageTag("P0Y0M0DT0H0M0.034S");
        java.lang.String str45 = locale41.getDisplayName(locale44);
        java.util.Locale locale46 = java.util.Locale.GERMANY;
        java.lang.String str48 = locale46.getExtension('a');
        java.lang.String str49 = locale44.getDisplayName(locale46);
        java.lang.String str50 = locale46.toLanguageTag();
        java.lang.String str51 = timeZone25.getDisplayName(locale46);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone25);
// flaky:         org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u6587" + "'", str26, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(timeZone33);
// flaky:         org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u4e2d\u6587" + "'", str34, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals(locale41.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\u4e2d\u6587" + "'", str45, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "de_DE");
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "de-DE" + "'", str50, "de-DE");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Greenwich Zeit" + "'", str51, "Greenwich Zeit");
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        java.util.Locale locale2 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.util.Locale locale5 = new java.util.Locale("                                                                                                                     !I0", "zho");
        java.lang.String str6 = locale2.getDisplayScript(locale5);
        java.lang.String str7 = locale2.getLanguage();
        java.lang.String str8 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals(locale5.toString(), "                                                                                                                     !i0_ZHO");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u6587_                                                                                                    " + "'", str8, "\u4e2d\u6587_                                                                                                    ");
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder5.setLanguage("und");
        java.util.Locale locale9 = java.util.Locale.ROOT;
        java.util.Locale locale12 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.lang.String str13 = locale9.getDisplayCountry(locale12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", locale9);
        java.lang.String str15 = locale9.getScript();
        boolean boolean16 = locale9.hasExtensions();
        java.util.Locale.Builder builder17 = builder5.setLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder5.setUnicodeLocaleKeyword("w", "\u6cd5\u6587\u6cd5\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: w [at index 0]");
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
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale12.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str14, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Chine0e", "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chine0e" + "'", str2, "Chine0e");
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("P0Y0M0DT0H0M0.001S", 0, "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str3, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "                                                         danac                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
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
        java.util.Locale locale21 = builder20.build();
        java.lang.Object obj22 = locale21.clone();
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
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("GBP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GBP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT" + "'", str1, "GBP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT");
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int3 = timeZone1.getOffset((long) (byte) 0);
        timeZone1.setID("0 days 0 hours 0 minutes 0 seco");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097");
        boolean boolean2 = locale1.hasExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.lang.String str6 = locale2.getDisplayCountry();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale9 = builder7.build();
        java.util.Locale.Builder builder10 = builder7.clear();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale locale12 = builder10.build();
        java.lang.String str13 = locale2.getDisplayVariant(locale12);
        java.lang.String str14 = locale12.getScript();
        java.lang.String str15 = locale12.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        java.util.Locale locale3 = new java.util.Locale("0:00:00.000", "zh_TW");
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.setDefault(locale5);
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.lang.String str9 = locale7.getDisplayLanguage(locale8);
        java.lang.String str10 = locale5.getDisplayLanguage(locale8);
        java.lang.String str11 = locale3.getDisplayVariant(locale8);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.lowerCase("_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAYchinois", locale8);
        org.junit.Assert.assertEquals(locale3.toString(), "0:00:00.000_ZH_TW");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u6587" + "'", str9, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_0 day10 0 0our10 0 0inute10 0 econd_0 day 0 0our10 0 0inute10 0 econd_0 day 0 0our10 0 0inute10 0 econd_0 daychinois" + "'", str12, "_0 day10 0 0our10 0 0inute10 0 econd_0 day 0 0our10 0 0inute10 0 econd_0 day 0 0our10 0 0inute10 0 econd_0 daychinois");
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                ...", "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", (int) 'u');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("...chHeure de Gr...", "en");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("P-1Y11M30DT23H59M59.989S", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989S" + "'", str2, "P-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989SP-1Y11M30DT23H59M59.989S");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "4444444444444444444444444444444444444444444444444444");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("44p0y0m0dt0h0m0.090s4444444444444444444", "p0y0m0dt0h0m0.041s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("p-1Y11M30DT23H59M59.975S", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "p0y0m0dt0h0m0.041s");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HI!44444444444444444444444444444", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!444444444444444444..." + "'", str2, "HI!444444444444444444...");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("TE0", "Rf");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "P0Y0M0DT0H0M0.153S", (java.lang.CharSequence) "deuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "P0Y0M0DT0H0M0.153S" + "'", charSequence2, "P0Y0M0DT0H0M0.153S");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale.Builder builder8 = builder4.setLanguageTag("danac");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder4.setExtension('x', "0320.00000td000y0p");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: 0320.00000td000y0p [at index 0]");
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
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
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
        timeZone1.setID("'P'yyyy''''d''''m''s.''");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = timeZone1.getDisplayName(true, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GMT" + "'", str9, "GMT");
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str1, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", (int) (byte) 1, "en_GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str3, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!                                                                                              ", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "OURS 0 MI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!                                                                                              " + "'", str4, "HI!                                                                                              ");
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        int int6 = timeZone5.getRawOffset();
        java.lang.String str7 = timeZone5.getID();
        java.time.ZoneId zoneId8 = timeZone5.toZoneId();
        java.lang.String str9 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 1L, "\u6cd5\u6587\u6cd5\u56fd)", false, timeZone5);
        timeZone5.setRawOffset((int) 'a');
        int int13 = timeZone5.getOffset((long) (-1));
        boolean boolean14 = timeZone5.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GMT" + "'", str7, "GMT");
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str9, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'u');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'uPu'uyyyyu'uYu'uMu'uMu'udu'uDTu'uHu'uHu'umu'uMu'usu.uSu'uS" + "'", str3, "'uPu'uyyyyu'uYu'uMu'uMu'udu'uDTu'uHu'uHu'umu'uMu'usu.uSu'uS");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'4P4'4yyyy4'4Y4'4M4'4M4'4d4'4DT4'4H4'4H4'4m4'4M4'4s4.4S4'4S" + "'", str5, "'4P4'4yyyy4'4Y4'4M4'4M4'4d4'4DT4'4H4'4H4'4m4'4M4'4s4.4S4'4S");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 31, (long) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.979S" + "'", str2, "P-1Y11M30DT23H59M59.979S");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.010" + "'", str1, "0:00:00.010");
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("zh_tw (P0Y0-10DT07430-10.0343599900,0 DAY14 0 0OUR14 0 0INUTE14 0 ECOND)", "fran\347ais", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_tw (P0Y0-10DT07430-10.0343599900,0 DAY14 0 0OUR14 0 0INUTE14 0 ECOND)" + "'", str3, "zh_tw (P0Y0-10DT07430-10.0343599900,0 DAY14 0 0OUR14 0 0INUTE14 0 ECOND)");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Canada", "", "#######p0y0m0dt0h0m0.000s#######");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Canada" + "'", str3, "Canada");
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("44P0Y0-10DT07430-10.034359990044", "\u683c\u6797\u5a01\u6cbb\u6642\u9593", 224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                zh", 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 0, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("P0Y0M0DT0H0M0.023S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.023S" + "'", str1, "P0Y0M0DT0H0M0.023S");
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo #h yi yo za zh zu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo #h yi yo za zh zu" + "'", str1, "aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo #h yi yo za zh zu");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ih");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("chinese (china)fran\347\uc911\uad6d\uc5b4\uc911\uad6d)");
        boolean boolean6 = languageRange1.equals((java.lang.Object) "chinese (china)fran\347\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("0:00:00.100", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.100" + "'", str2, "0:00:00.100");
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
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
        java.util.Locale locale22 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleKeys();
        java.util.Locale locale24 = java.util.Locale.CHINESE;
        java.lang.String str25 = locale22.getDisplayName(locale24);
        java.util.Locale locale26 = java.util.Locale.GERMANY;
        java.lang.String str28 = locale26.getExtension('a');
        java.lang.String str29 = locale22.getDisplayVariant(locale26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = timeZone17.getDisplayName(false, 23, locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 23");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str25, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de_DE");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("P0Y0M0DT0H0M0.010S", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str3, "P0Y0M0DT0H0M0.010S");
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        java.util.Locale locale2 = new java.util.Locale("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", "0:00:00.010");
        org.junit.Assert.assertEquals(locale2.toString(), "0 days 0 hours 0 minutes 0 seconds_0:00:00.010");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        char[] charArray15 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!IH", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("\u4e2d\u6587!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ip0y0m0dt0h0m0.090s", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("Chinese (China)FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ih!ih!...", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "can", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("Cine0e", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("P0Y0M0DT0H0M0.153S", "CA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaTE0abTE0aeTE0afTE0akTE0amTE0anTE0arTE0asTE0avTE0ayTE0azTE0baTE0beTE0bgTE0bhTE0biTE0bmTE0bnTE0boTE0brTE0bsTE0caTE0ceTE0chTE0coTE0crTE0csTE0cuTE0cvTE0cyTE0daTE0deTE0dvTE0dzTE0eeTE0elTE0enTE0eoTE0esTE0etTE0euTE0faTE0ffTE0fiTE0fjTE0foTE0frTE0fyTE0gaTE0gdTE0glTE0gnTE0guTE0gvTE0haTE0heTE0hiTE0hoTE0hrTE0htTE0huTE0hyTE0hzTE0iaTE0idTE0ieTE0igTE0iiTE0ikTE0inTE0ioTE0isTE0itTE0iuTE0iwTE0jaTE0jiTE0jvTE0kaTE0kgTE0kiTE0kjTE0kkTE0klTE0kmTE0knTE0koTE0krTE0ksTE0kuTE0kvTE0kwTE0kyTE0laTE0lbTE0lgTE0liTE0lnTE0loTE0ltTE0luTE0lvTE0mgTE0mhTE0miTE0mkTE0mlTE0mnTE0moTE0mrTE0msTE0mtTE0myTE0naTE0nbTE0ndTE0neTE0ngTE0nlTE0nnTE0noTE0nrTE0nvTE0nyTE0ocTE0ojTE0omTE0orTE0osTE0paTE0piTE0plTE0psTE0ptTE0quTE0rmTE0rnTE0roTE0ruTE0rwTE0saTE0scTE0sdTE0seTE0sgTE0siTE0skTE0slTE0smTE0snTE0soTE0sqTE0srTE0ssTE0stTE0suTE0svTE0swTE0taTE0teTE0tgTE0thTE0tiTE0tkTE0tlTE0tnTE0toTE0trTE0tsTE0ttTE0twTE0tyTE0ugTE0ukTE0urTE0uzTE0veTE0viTE0voTE0waTE0woTE0xhTE0yiTE0yoTE0zaTE0zhTE0zu", (int) (short) 10, "...chHeure de Gr...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaTE0abTE0aeTE0afTE0akTE0amTE0anTE0arTE0asTE0avTE0ayTE0azTE0baTE0beTE0bgTE0bhTE0biTE0bmTE0bnTE0boTE0brTE0bsTE0caTE0ceTE0chTE0coTE0crTE0csTE0cuTE0cvTE0cyTE0daTE0deTE0dvTE0dzTE0eeTE0elTE0enTE0eoTE0esTE0etTE0euTE0faTE0ffTE0fiTE0fjTE0foTE0frTE0fyTE0gaTE0gdTE0glTE0gnTE0guTE0gvTE0haTE0heTE0hiTE0hoTE0hrTE0htTE0huTE0hyTE0hzTE0iaTE0idTE0ieTE0igTE0iiTE0ikTE0inTE0ioTE0isTE0itTE0iuTE0iwTE0jaTE0jiTE0jvTE0kaTE0kgTE0kiTE0kjTE0kkTE0klTE0kmTE0knTE0koTE0krTE0ksTE0kuTE0kvTE0kwTE0kyTE0laTE0lbTE0lgTE0liTE0lnTE0loTE0ltTE0luTE0lvTE0mgTE0mhTE0miTE0mkTE0mlTE0mnTE0moTE0mrTE0msTE0mtTE0myTE0naTE0nbTE0ndTE0neTE0ngTE0nlTE0nnTE0noTE0nrTE0nvTE0nyTE0ocTE0ojTE0omTE0orTE0osTE0paTE0piTE0plTE0psTE0ptTE0quTE0rmTE0rnTE0roTE0ruTE0rwTE0saTE0scTE0sdTE0seTE0sgTE0siTE0skTE0slTE0smTE0snTE0soTE0sqTE0srTE0ssTE0stTE0suTE0svTE0swTE0taTE0teTE0tgTE0thTE0tiTE0tkTE0tlTE0tnTE0toTE0trTE0tsTE0ttTE0twTE0tyTE0ugTE0ukTE0urTE0uzTE0veTE0viTE0voTE0waTE0woTE0xhTE0yiTE0yoTE0zaTE0zhTE0zu" + "'", str3, "aaTE0abTE0aeTE0afTE0akTE0amTE0anTE0arTE0asTE0avTE0ayTE0azTE0baTE0beTE0bgTE0bhTE0biTE0bmTE0bnTE0boTE0brTE0bsTE0caTE0ceTE0chTE0coTE0crTE0csTE0cuTE0cvTE0cyTE0daTE0deTE0dvTE0dzTE0eeTE0elTE0enTE0eoTE0esTE0etTE0euTE0faTE0ffTE0fiTE0fjTE0foTE0frTE0fyTE0gaTE0gdTE0glTE0gnTE0guTE0gvTE0haTE0heTE0hiTE0hoTE0hrTE0htTE0huTE0hyTE0hzTE0iaTE0idTE0ieTE0igTE0iiTE0ikTE0inTE0ioTE0isTE0itTE0iuTE0iwTE0jaTE0jiTE0jvTE0kaTE0kgTE0kiTE0kjTE0kkTE0klTE0kmTE0knTE0koTE0krTE0ksTE0kuTE0kvTE0kwTE0kyTE0laTE0lbTE0lgTE0liTE0lnTE0loTE0ltTE0luTE0lvTE0mgTE0mhTE0miTE0mkTE0mlTE0mnTE0moTE0mrTE0msTE0mtTE0myTE0naTE0nbTE0ndTE0neTE0ngTE0nlTE0nnTE0noTE0nrTE0nvTE0nyTE0ocTE0ojTE0omTE0orTE0osTE0paTE0piTE0plTE0psTE0ptTE0quTE0rmTE0rnTE0roTE0ruTE0rwTE0saTE0scTE0sdTE0seTE0sgTE0siTE0skTE0slTE0smTE0snTE0soTE0sqTE0srTE0ssTE0stTE0suTE0svTE0swTE0taTE0teTE0tgTE0thTE0tiTE0tkTE0tlTE0tnTE0toTE0trTE0tsTE0ttTE0twTE0tyTE0ugTE0ukTE0urTE0uzTE0veTE0viTE0voTE0waTE0woTE0xhTE0yiTE0yoTE0zaTE0zhTE0zu");
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        java.util.Locale locale3 = new java.util.Locale("TE0", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("####################################################################################################################", locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "te0_AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "####################################################################################################################" + "'", str4, "####################################################################################################################");
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                     !i0_ZHO", 11, "444444444444444444444444444444444444444444444444444444444de_DE4444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                     !i0_ZHO" + "'", str3, "                                                                                                                     !i0_ZHO");
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        java.util.TimeZone timeZone21 = java.util.TimeZone.getTimeZone("");
        java.lang.String str22 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone21);
        boolean boolean23 = timeZone21.observesDaylightTime();
        java.util.TimeZone timeZone29 = java.util.TimeZone.getTimeZone("");
        java.lang.String str30 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone29);
        boolean boolean31 = timeZone21.hasSameRules(timeZone29);
        java.time.ZoneId zoneId32 = timeZone29.toZoneId();
        timeZone29.setRawOffset(52);
        boolean boolean35 = timeZone13.hasSameRules(timeZone29);
        int int36 = timeZone29.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u4e2d\u6587" + "'", str22, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u4e2d\u6587" + "'", str30, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(zoneId32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", "!i", "GMT+00:00");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.034Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "x");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.034Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.034Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("FR", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FR" + "'", str2, "FR");
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0-10DT07430-10.0323599998");
        timeZone1.setRawOffset((int) (short) 10);
        java.lang.String str4 = timeZone1.getID();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GMT" + "'", str4, "GMT");
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.034Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
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
        boolean boolean38 = timeZone25.useDaylightTime();
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
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Greenwich Mean Time");
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\u4e2d\u6587!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!ih!ih!...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "Africa/AbidjanAfrica/AccraAfrica/BamakoAfrica/BanjulAfrica/BissauAfrica/CasablancaAfrica/ConakryAfrica/DakarAfrica/El_AaiunAfrica/FreetownAfrica/LomeAfrica/MonroviaAfrica/NouakchottAfrica/OuagadougouAfrica/Sao_TomeAfrica/TimbuktuAmerica/DanmarkshavnAntarctica/TrollAtlantic/CanaryAtlantic/FaeroeAtlantic/FaroeAtlantic/MadeiraAtlantic/ReykjavikAtlantic/St_HelenaEireEtc/GMTEtc/GMT+0Etc/GMT-0Etc/GMT0Etc/GreenwichEtc/UCTEtc/UTCEtc/UniversalEtc/ZuluEurope/BelfastEurope/DublinEurope/GuernseyEurope/Isle_of_ManEurope/JerseyEurope/LisbonEurope/LondonGBGB-EireGMTGMT0GreenwichIcelandPortugalUCTUTCUniversalWETZulu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo xh yi yo za zh zu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale.Builder builder7 = builder3.clear();
        java.util.Locale.Builder builder8 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder3.setExtension('x', "Africa/AbidjanAfrica/AccraAfrica/BamakoAfrica/BanjulAfrica/BissauAfrica/CasablancaAfrica/ConakryAfrica/DakarAfrica/El_AaiunAfrica/FreetownAfrica/LomeAfrica/MonroviaAfrica/NouakchottAfrica/OuagadougouAfrica/Sao_TomeAfrica/TimbuktuAmerica/DanmarkshavnAntarctica/TrollAtlantic/CanaryAtlantic/FaeroeAtlantic/FaroeAtlantic/MadeiraAtlantic/ReykjavikAtlantic/St_HelenaEireEtc/GMTEtc/GMT+0Etc/GMT-0Etc/GMT0Etc/GreenwichEtc/UCTEtc/UTCEtc/UniversalEtc/ZuluEurope/BelfastEurope/DublinEurope/GuernseyEurope/Isle_of_ManEurope/JerseyEurope/LisbonEurope/LondonGBGB-EireGMTGMT0GreenwichIcelandPortugalUCTUTCUniversalWETZulu");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: Africa/AbidjanAfrica/AccraAfrica/BamakoAfrica/BanjulAfrica/BissauAfrica/CasablancaAfrica/ConakryAfrica/DakarAfrica/El [at index 0]");
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
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "stestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        java.util.Locale locale2 = new java.util.Locale("                                               hi!#######                                               ", "0 days 0 hours");
        org.junit.Assert.assertEquals(locale2.toString(), "                                               hi!#######                                               _0 DAYS 0 HOURS");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("DE", "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                                                 ", 24);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0M0DT0H0M0.001S");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId2);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("xChinesischxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "un00unun_0 DAY32 0 0OUR32 0 0INUTE032 0 ECONDun000unun");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
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
        java.lang.String str12 = locale10.getDisplayLanguage();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "!i0" + "'", str12, "!i0");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                         ", "                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND" + "'", str1, "de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND");
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "'P'yyyy''''d''''m''s.''", (java.lang.CharSequence) "P-1Y11M30DT23H59M59.947S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 3);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.003S" + "'", str1, "P0Y0M0DT0H0M0.003S");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str1, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("     4444444444444444444444444444444444444444444444444444      ", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     444444444444444444444444444..." + "'", str2, "     444444444444444444444444444...");
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\u4e2d\u56fd", "p0y0m0dt0h0m0.020s");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("OUhS 0 MI", "4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444", 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("HI!44444444444444444444444444444", "\u53f0\u7063");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 9, "w", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "w" + "'", str3, "w");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(31);
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "German (Germany)");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4444444444444444P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S444444444444444444444444", 5, "UN00UNUN_0_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0P0Y0M0DT0H0M0.020S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S444444444444444444444444" + "'", str3, "4444444444444444P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S444444444444444444444444");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setScript("zh_CNzhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: zh_CNzhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "0320.000000I!                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("en_GB", "P0Y0M0DT0H0M0.121S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.052S" + "'", str2, "P0Y0M0DT0H0M0.052S");
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                  ", (java.lang.CharSequence) "can");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("44P0Y0-10DT07430-10.034359990044", "44p0y0m0dt0h0m0.090s4444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 10, "P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09010hiP0Y000DT00000.09010!P0Y000DT00000.09010" + "'", str3, "P0Y000DT00000.09010hiP0Y000DT00000.09010!P0Y000DT00000.09010");
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 17, "\uad6d\uc911\uc5b4\uad6d\uc911sia\347narf)anihc( esenihc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uad6d\uc911\uc5b4\uad6d\uc91100ia\347narf)anihc( eenihc" + "'", str2, "\uad6d\uc911\uc5b4\uad6d\uc91100ia\347narf)anihc( eenihc");
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\u6cd5\u6587\u6cd5\u56fd))");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#######P0Y0M0DT0H0M0.000S#######", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u683c\u6797\u5a01\u6cbb\u6642\u9593" + "'", str1, "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("P0Y0-10DT07430-10.0323599998", "zh_TW0 seconds");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder7 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale locale10 = builder8.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setLanguage(" un0 ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language:  un0  [at index 0]");
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
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECON", '#');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECON" + "'", str3, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECON");
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", " I!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "Chinesisch                                                                                          ", 96, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                       44444444444444444444444444444", "cancancancancancancancancancancancancancancancancancancancancancancancancancancancancancancan0:00:00.089", (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, "France");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("343599900");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "343599900" + "'", str1, "343599900");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("00dt00000.090153HIp0y000dt00000.090153!p0y000dt00000.090153");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00dt00000.090153HIp0y000dt00000.090153!p0y000dt00000.090153" + "'", str1, "00dt00000.090153HIp0y000dt00000.090153!p0y000dt00000.090153");
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("ZH_tw");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zh_tw");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("#######P0Y0M0DT0H0M0.000S#######", "0 DAYS 0 HOURS 0 MINUTES 0 SECO");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4444444444444444444444444444444444444444444444444444444444444444444440 DAYS 0 HOURS 0 MINUTES 0 SECO", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'" + "'", str3, "!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                         ", "aaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         " + "'", str2, "                                         ");
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0:00:00.99", "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("#######P0Y0M0DT0H0M0.000S#######", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("!ih#######", "Chinesisch                                                                                          ", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("#####################################################################################################################", "P0Y0M0DT0H0M0.032S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\u4e2d\u6587!ih!ih!i", 104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587!ih!ih!i                                                                                              " + "'", str2, "\u4e2d\u6587!ih!ih!i                                                                                              ");
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        java.util.Locale locale0 = java.util.Locale.US;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("UN00UNUN_0 day32 0 0our32 0 0inute032 0 econdUN000UNUN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: UN00UNUN_0 day32 0 0our32 0 0inute032 0 econdUN000UNUN");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("...ch0eure 0e Gr...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...ch0eure0eGr..." + "'", str1, "...ch0eure0eGr...");
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        java.util.Locale locale2 = new java.util.Locale("P0Y0M0DT0H0M0.034S", "'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S");
        org.junit.Assert.assertEquals(locale2.toString(), "p0y0m0dt0h0m0.034s_'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S");
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazh_TWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s", "4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("zh-CN", "                                                                                                 !I0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                  ", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("P0Y0M0DT0H0M0.000S444444", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!i0", "0:00:00.10I!0:00:00.1", 41);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "                                 0 DAYS 0 HOURS 0 MINUTES 0 SECOND                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 0 DAY0 0 0OUR0 0 0INUTE00 0 ECOND                                  " + "'", str2, "                                 0 DAY0 0 0OUR0 0 0INUTE00 0 ECOND                                  ");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("te0", "Germany", "p0y0m0dt0h0m0.000s");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "t00" + "'", str3, "t00");
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int10 = timeZone9.getRawOffset();
        java.lang.String str11 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y0M0DT0H0M0.023S", false, timeZone9);
        java.lang.String str12 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) 'x', "CAN", true, timeZone9);
        java.time.ZoneId zoneId13 = timeZone9.toZoneId();
        int int15 = timeZone9.getOffset((long) (short) 100);
        int int16 = timeZone9.getRawOffset();
        java.lang.Object obj17 = timeZone9.clone();
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y000DT00000.0230" + "'", str11, "P0Y000DT00000.0230");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CAN" + "'", str12, "CAN");
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                       danac                        ", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx...chHeure de Gr...xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("hi!", '4');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("4444444444444444444444444444444444444444444444444444", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'u');
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0M0DT0H0M0.001S", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", 10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("p0y0m0dt0h0m0.000s", strArray5, strArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.endsWithAny("HI!                                                                                              ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "p0y0m0dt0h0m0.000s" + "'", str13, "p0y0m0dt0h0m0.000s");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "GMT", "Germany##############################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "I!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "\uad6d\uc911\uc5b4\uad6d\uc911sia\347narf)anihc( esenihc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uad6d\uc911\uc5b4\uad6d\uc91100ia\347narf)anihc( eenihc" + "'", str2, "\uad6d\uc911\uc5b4\uad6d\uc91100ia\347narf)anihc( eenihc");
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\u6cd5\u6587\u6cd5\u56fd))", "ihihtestestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm'ss's'", "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd))" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd))");
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("99.00:00:0", "   te0    ", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("P0Y0-10DT07430-10.0343599900", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0343599900" + "'", str2, "P0Y0-10DT07430-10.0343599900");
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("!ih", (double) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=4.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int2 = timeZone1.getRawOffset();
        java.lang.String str3 = timeZone1.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4" + "'", str3, "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                        ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("zho", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("0 days 0 hours 0 minutes 0 seconds                                                                  ", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 48 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\u6cd5\u6587\u6cd5\u56fd))", (int) 'x', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("");
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone6);
        boolean boolean8 = timeZone6.observesDaylightTime();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("");
        java.lang.String str15 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone14);
        boolean boolean16 = timeZone6.hasSameRules(timeZone14);
        boolean boolean17 = timeZone0.hasSameRules(timeZone6);
        boolean boolean18 = timeZone6.observesDaylightTime();
        boolean boolean19 = timeZone6.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#######p0y0m0dt0h0m0.000s#######", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhi!#######");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("P-1Y11M30DT23H59M59.990S", (double) 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=120.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444444444444444444444444444444444444444444444444444de_DE4444444444444444444444444444444444444444444444444444444444", "ih", "0e-de");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444de_DE4444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444de_DE4444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097", "HI!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097" + "'", str4, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097" + "'", str5, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097" + "'", str7, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097");
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale3 = new java.util.Locale("\u4e2d\u6587");
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("P0Y0M0DT0H0M0.034S");
        java.lang.String str7 = locale3.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.lang.String str10 = locale8.getExtension('a');
        java.lang.String str11 = locale6.getDisplayName(locale8);
        java.lang.String str12 = locale8.toLanguageTag();
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale locale14 = builder13.build();
        java.util.Locale locale15 = builder13.build();
        java.util.Locale.Builder builder16 = builder13.clear();
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale locale18 = builder16.build();
        java.util.Locale.Builder builder19 = builder16.clearExtensions();
        java.util.Locale.Builder builder20 = builder16.clear();
        java.util.Locale.Builder builder21 = builder16.clear();
        boolean boolean22 = locale8.equals((java.lang.Object) builder16);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "de-DE" + "'", str12, "de-DE");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        java.util.Locale.Builder builder9 = builder7.setLanguage("");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder11.setExtension(' ', "0:00:00.00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
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
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        char[] charArray12 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Heure de Greenwich", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "EN-GB", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444           HI!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 24, "fr", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr" + "'", str3, "fr");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("0", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0                      " + "'", str2, "0                      ");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00          0I!          0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:", "zh_44444444444444444444444444444zh_");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("P-1Y11030DT23059059.99914", "FRA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "CHN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zh_CN", "0e-DE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\u6cd5\u6587\u6cd5\u56fd))", 1, "x");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd))" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd))");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Chine0e", "ENG                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("CHN", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHN" + "'", str2, "CHN");
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!#######", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("          0I!", "P0Y0-10DT07430-10.1213599678");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("cancancancancancancancancancancancancancancancancancancancancancancancancancancancancancancan0:00:00.089", (int) ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cancancancancancancancancancancancancancancancancancancancancancancancancancancancancancancan0:00:00.089" + "'", str3, "cancancancancancancancancancancancancancancancancancancancancancancancancancancancancancancan0:00:00.089");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("GBP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT", "FR", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                        ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("china", "zh_TW0 seconds", "Canada");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "china" + "'", str3, "china");
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "zh_TW0 seconds");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getDisplayVariant();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("aaxabxaexafxakxamxanxarxasxavxayxazxbaxbexbgxbhxbixbmxbnxboxbrxbsxcaxcexchxcoxcrxcsxcuxcvxcyxdaxdexdvxdzxeexelxenxeoxesxetxeuxfaxffxfixfjxfoxfrxfyxgaxgdxglxgnxguxgvxhaxhexhixhoxhrxhtxhuxhyxhzxiaxidxiexigxiixikxinxioxisxitxiuxiwxjaxjixjvxkaxkgxkixkjxkkxklxkmxknxkoxkrxksxkuxkvxkwxkyxlaxlbxlgxlixlnxloxltxluxlvxmgxmhxmixmkxmlxmnxmoxmrxmsxmtxmyxnaxnbxndxnexngxnlxnnxnoxnrxnvxnyxocxojxomxorxosxpaxpixplxpsxptxquxrmxrnxroxruxrwxsaxscxsdxsexsgxsixskxslxsmxsnxsoxsqxsrxssxstxsuxsvxswxtaxtextgxthxtixtkxtlxtnxtoxtrxtsxttxtwxtyxugxukxurxuzxvexvixvoxwaxwoxxhxyixyoxzaxzhxzu", locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaxabxaexafxakxamxanxarxasxavxayxazxbaxbexbgxbhxbixbmxbnxboxbrxbsxcaxcexchxcoxcrxcsxcuxcvxcyxdaxdexdvxdzxeexelxenxeoxesxetxeuxfaxffxfixfjxfoxfrxfyxgaxgdxglxgnxguxgvxhaxhexhixhoxhrxhtxhuxhyxhzxiaxidxiexigxiixikxinxioxisxitxiuxiwxjaxjixjvxkaxkgxkixkjxkkxklxkmxknxkoxkrxksxkuxkvxkwxkyxlaxlbxlgxlixlnxloxltxluxlvxmgxmhxmixmkxmlxmnxmoxmrxmsxmtxmyxnaxnbxndxnexngxnlxnnxnoxnrxnvxnyxocxojxomxorxosxpaxpixplxpsxptxquxrmxrnxroxruxrwxsaxscxsdxsexsgxsixskxslxsmxsnxsoxsqxsrxssxstxsuxsvxswxtaxtextgxthxtixtkxtlxtnxtoxtrxtsxttxtwxtyxugxukxurxuzxvexvixvoxwaxwoxxhxyixyoxzaxzhxzu" + "'", str3, "aaxabxaexafxakxamxanxarxasxavxayxazxbaxbexbgxbhxbixbmxbnxboxbrxbsxcaxcexchxcoxcrxcsxcuxcvxcyxdaxdexdvxdzxeexelxenxeoxesxetxeuxfaxffxfixfjxfoxfrxfyxgaxgdxglxgnxguxgvxhaxhexhixhoxhrxhtxhuxhyxhzxiaxidxiexigxiixikxinxioxisxitxiuxiwxjaxjixjvxkaxkgxkixkjxkkxklxkmxknxkoxkrxksxkuxkvxkwxkyxlaxlbxlgxlixlnxloxltxluxlvxmgxmhxmixmkxmlxmnxmoxmrxmsxmtxmyxnaxnbxndxnexngxnlxnnxnoxnrxnvxnyxocxojxomxorxosxpaxpixplxpsxptxquxrmxrnxroxruxrwxsaxscxsdxsexsgxsixskxslxsmxsnxsoxsqxsrxssxstxsuxsvxswxtaxtextgxthxtixtkxtlxtnxtoxtrxtsxttxtwxtyxugxukxurxuzxvexvixvoxwaxwoxxhxyixyoxzaxzhxzu");
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s" + "'", str1, "p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s");
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u4e2d\u570b", "aaaaaaaaaaaaaChinese (China)aaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P-1Y11M30DT23H59M59.999S");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("P0Y000DT00000.00120", "        zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00120" + "'", str2, "P0Y000DT00000.00120");
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!IHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "!ih#######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!IHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!IHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ih");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        boolean boolean6 = languageRange1.equals((java.lang.Object) "ZH_tw");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ih" + "'", str4, "ih");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setUnicodeLocaleKeyword("\u4e2d\u6587!ih!ih!i                                                                                              ", "I!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ??!ih!ih!i                                                                                               [at index 0]");
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
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 104, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0:00:00.097UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "en-CA", (int) (byte) 1, 21);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Uen-CAUUUUUUUUUUUUUUUUUUUUUUU0:00:00.097UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str4, "Uen-CAUUUUUUUUUUUUUUUUUUUUUUU0:00:00.097UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", 4, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                               hi!#######                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("stestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'nglish (United Kingdom)", 10, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "stestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'nglish (United Kingdom)" + "'", str3, "stestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'nglish (United Kingdom)");
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("p0y0m0dt0h0m0.020s", "44444444444444444444444444444444444444           HI!", "P0Y0M0DT0H0M0.121S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p0y0m0dt0h0m0.020s" + "'", str3, "p0y0m0dt0h0m0.020s");
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.Locale locale6 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, 'a');
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
        java.util.Locale locale19 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection16);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "");
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
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("44444444444444444444444444444444444444 HI!", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444 HI!" + "'", str2, "44444444444444444444444444444444444444 HI!");
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\u683c\u6797\u5a01\u6cbb\u65f6\u95f4", 336, 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
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
        java.util.Locale.Builder builder12 = builder3.setVariant("Cine0e");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder12.setExtension('u', "hi!#######");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: hi!####### [at index 0]");
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
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
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
        java.lang.String str18 = timeZone1.getDisplayName();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GMT+00:00" + "'", str18, "GMT+00:00");
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        char[] charArray10 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "de-DE", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "0320.000000I!                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int10 = timeZone9.getRawOffset();
        java.lang.String str11 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y0M0DT0H0M0.023S", false, timeZone9);
        java.lang.String str12 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) 'x', "CAN", true, timeZone9);
        int int13 = timeZone9.getRawOffset();
        java.lang.String str14 = timeZone9.getID();
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y000DT00000.0230" + "'", str11, "P0Y000DT00000.0230");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CAN" + "'", str12, "CAN");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GMT" + "'", str14, "GMT");
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 32, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon", "anglais(Canada)", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                       44444444444444444444444444444W", "I!", "   ...M0.001S    ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "uNITED STATES");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", "", "          0I!          ", 120);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S" + "'", str4, "P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("P0Y0M0DT0H0M0.000S", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("p0y0m0dt0h0m0.034s", "Germany##############################################################################################################", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "0 days");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        java.util.Locale locale2 = new java.util.Locale("0320.000000I!  ...", "ZH_TW");
        org.junit.Assert.assertEquals(locale2.toString(), "0320.000000i!  ..._ZH_TW");
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("P0Y0-10DT07430-10.0343599900I!", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "                                                                                                                     !i0_ZHO", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaa...", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
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
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("");
        java.lang.String str28 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone27);
        boolean boolean29 = timeZone27.observesDaylightTime();
        java.util.TimeZone timeZone35 = java.util.TimeZone.getTimeZone("");
        java.lang.String str36 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone35);
        boolean boolean37 = timeZone27.hasSameRules(timeZone35);
        java.time.ZoneId zoneId38 = timeZone35.toZoneId();
        boolean boolean39 = timeZone5.hasSameRules(timeZone35);
        java.util.Date date40 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = timeZone35.inDaylightTime(date40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GMT" + "'", str19, "GMT");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u4e2d\u6587" + "'", str28, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587" + "'", str36, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(zoneId38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo #h yi yo za zh zu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                    ", "chinois", "c#n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    " + "'", str3, "                                                                                                    ");
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx...chHeure de Gr...xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("44P0Y0-10DT07430-10.034359990044", "UN00UNUN_0 day32 0 0our32 0 0inute032 0 econdUN000UNUN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44P0Y0-10DT07430-10.034359990044" + "'", str2, "44P0Y0-10DT07430-10.034359990044");
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 21, "und");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "un0" + "'", str2, "un0");
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("p0y000dt00000.0230", "de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)", "0:00:00.00");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
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
        java.util.Locale locale13 = java.util.Locale.PRC;
        java.util.Locale locale15 = java.util.Locale.GERMANY;
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale15);
        java.lang.String str17 = locale13.getDisplayVariant(locale15);
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet19 = locale18.getUnicodeLocaleKeys();
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleKeys();
        java.util.Locale locale22 = java.util.Locale.CHINESE;
        java.lang.String str23 = locale20.getDisplayName(locale22);
        java.util.Locale locale24 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray25 = new java.util.Locale[] { locale13, locale18, locale20, locale24 };
        java.util.ArrayList<java.util.Locale> localeList26 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList26, localeArray25);
        java.util.Locale locale28 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList26);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap29 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, strMap29);
        java.util.Locale locale31 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet32 = locale31.getUnicodeLocaleKeys();
        java.lang.String str33 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strSet32);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Locale[] localeArray37 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList38 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList38, localeArray37);
        java.util.Locale locale40 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.Collection<java.util.Locale> localeCollection41 = null;
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList43 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, localeCollection41, filteringMode42);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap44 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList45 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, strMap44);
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.util.Locale.Category category49 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category49, locale50);
        java.util.Set<java.lang.String> strSet52 = locale50.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.lang.String>) strSet52);
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strSet52);
        java.util.Locale.FilteringMode filteringMode55 = null;
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList54, filteringMode55);
        boolean boolean57 = languageRange1.equals((java.lang.Object) strList56);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih" + "'", str2, "ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih" + "'", str3, "ih");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ih" + "'", str5, "ih");
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str23, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(locale28);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(locale40);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode42.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList43);
        org.junit.Assert.assertNotNull(languageRangeList45);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + category49 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category49.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "'4P4'4yyyy4'4Y4'4M4'4M4'4d4'4DT4'4H4'4H4'4m4'4M4'4s4.4S4'4S", "p0y0m0dt0h0m0.032s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", "\u6cd5\u6587\u6cd5\u56fd)", 14);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("fR", "I!", 23);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                        ", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                        " + "'", str9, "                                                                                                        ");
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.090S", ' ');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("P-1Y11030DT23059059.99914", strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", "zh-CN", "                                      hi!                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'" + "'", str3, "!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("       P0Y0M0DT0H0M0.041S       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       p0y0m0dt0h0m0.041s       " + "'", str1, "       p0y0m0dt0h0m0.041s       ");
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("P0Y000DT00000.00120", "P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("canada", "P0Y0M0DT0H0M0.031S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "canada" + "'", str2, "canada");
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh" + "'", str1, "zh");
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                     0:00:00.000", 'x');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECON", "0:00:00.017");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECON" + "'", str2, " DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECON");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
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
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, '#');
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
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Chinese" + "'", str20, "Chinese");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Chinese" + "'", str29, "Chinese");
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\uc77c\ubcf8\uc5b4", "Canada");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "0 seconds");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 seconds" + "'", str1, "0 seconds");
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setRegion("4444444444444444P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 4444444444444444P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S444444444444444444444444 [at index 0]");
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
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\u4e2d\u6587");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("", "United States", (int) (short) 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)", strArray3, strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("can", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str8, "FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u6587" + "'", str9, "\u4e2d\u6587");
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("0 days 0 hours 0 minutes 0 seconds", (int) 'x', 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECON", "0:00:00.097");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("de_DE", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P0Y0-10DT07430-10.0343599900I!", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ANGLAIS (CANADA)", "\u6cd5\u6587\u6cd5\u56fd))");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("");
        java.lang.String str10 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone9);
        boolean boolean11 = timeZone9.observesDaylightTime();
        java.util.TimeZone timeZone17 = java.util.TimeZone.getTimeZone("");
        java.lang.String str18 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone17);
        boolean boolean19 = timeZone9.hasSameRules(timeZone17);
        java.util.TimeZone timeZone21 = java.util.TimeZone.getTimeZone("");
        int int22 = timeZone21.getRawOffset();
        java.lang.String str23 = timeZone21.getID();
        int int24 = timeZone21.getRawOffset();
        boolean boolean25 = timeZone9.hasSameRules(timeZone21);
        java.lang.String str26 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 14, "China", false, timeZone21);
        java.util.Date date27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = timeZone21.inDaylightTime(date27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u6587" + "'", str10, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u6587" + "'", str18, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GMT" + "'", str23, "GMT");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "China" + "'", str26, "China");
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "00dt00000.090153HIp0y000dt00000.090153!p0y000dt00000.090153");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale4 = new java.util.Locale("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        java.util.Locale.setDefault(category0, locale4);
        java.lang.String str6 = locale4.toLanguageTag();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale4.toString(), "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "und" + "'", str6, "und");
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("German (Germany)", "\uc911\uad6d\uc5b4\uc911\uad6d)", 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaaaaaaaChinese (China)aaaaaaaaaaaaa", (int) 'x', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "HI!                          ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("00dt00000.090153HIp0y000dt00000.090153!p0y000dt00000.090153", "ja", "P-1Y11M30DT23H59M59.901S");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("German (Germany)", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "German (Germany)" + "'", str2, "German (Germany)");
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        int int2 = timeZone1.getRawOffset();
        java.lang.String str3 = timeZone1.getID();
        int int5 = timeZone1.getOffset((long) 10);
        boolean boolean6 = timeZone1.observesDaylightTime();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        java.lang.String str11 = locale8.getDisplayName(locale10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.upperCase("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", locale8);
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str14 = locale13.getISO3Language();
        java.util.Set<java.lang.String> strSet15 = locale13.getUnicodeLocaleAttributes();
        java.lang.String str16 = locale8.getDisplayLanguage(locale13);
        java.lang.String str17 = timeZone1.getDisplayName(locale13);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GMT" + "'", str3, "GMT");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str11, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str12, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fra" + "'", str14, "fra");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "fran\347ais" + "'", str16, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Heure de Greenwich" + "'", str17, "Heure de Greenwich");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0I!                                                                                              ", "CHN");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', (int) (short) 0, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 0, 1);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny("           HI!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0I!                                                                                              " + "'", str11, "0I!                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "Korean");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int10 = timeZone9.getRawOffset();
        java.lang.String str11 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y0M0DT0H0M0.023S", false, timeZone9);
        java.lang.String str12 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) 'x', "CAN", true, timeZone9);
        java.time.ZoneId zoneId13 = timeZone9.toZoneId();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = timeZone9.getOffset((int) ' ', (int) (byte) 100, 98, 14, 336, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y000DT00000.0230" + "'", str11, "P0Y000DT00000.0230");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CAN" + "'", str12, "CAN");
        org.junit.Assert.assertNotNull(zoneId13);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0-10DT07430-10.0323599998");
        timeZone1.setRawOffset((int) (short) 10);
        timeZone1.setID("0:00:00.010");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("P-1Y11030DT23059059.99914", 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11030DT23059059.99914" + "'", str2, "P-1Y11030DT23059059.99914");
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\u4e2d\u6587!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!ih!ih!...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
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
        java.util.Date date14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = timeZone7.inDaylightTime(date14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("P0Y0M0DT0H0M0.000S444444", "0 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S444444" + "'", str2, "P0Y0M0DT0H0M0.000S444444");
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "0e_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAY4 0 0OUR4 0 0INUTE04 0 ECOND)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "fran\347\uc911\uad6d\uc5b4\uc911\uad6d)", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str3, "fran\347\uc911\uad6d\uc5b4\uc911\uad6d)");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("P0Y0M0DT0H0M0.034S", 41, "ihihtestestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm'ss's'");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ihihtestestestestestestP0Y0M0DT0H0M0.034S" + "'", str3, "ihihtestestestestestestP0Y0M0DT0H0M0.034S");
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        java.util.Locale locale2 = new java.util.Locale("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "\uc77c\ubcf8\uc5b4");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\uc77c\ubcf8\uc5b4");
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx...chHeure de Gr...xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx...chheure de gr...xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", "0320.00000td000y0p");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0320.00000td000y0p" + "'", str2, "0320.00000td000y0p");
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", (int) (byte) 10, "W");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WWWWWWWWWW" + "'", str3, "WWWWWWWWWW");
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
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
            java.util.Locale.Builder builder14 = builder11.setExtension('u', "P0Y0-10DT07430-10.0343599900");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: 10DT07430 [at index 5]");
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
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ZH_TW");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", 98, 18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("                                                                                     0:00:00.000", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                     0:00:00.000uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                     0:00:00.000uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                     0:00:00.000uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                     0:00:00.000uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                     0:00:00.000" + "'", str3, "                                                                                     0:00:00.000uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                     0:00:00.000uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                     0:00:00.000uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                     0:00:00.000uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                     0:00:00.000");
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        java.util.Locale locale3 = new java.util.Locale("!ih!ih!...", "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                                                 ", "de");
        java.lang.String str4 = locale3.getCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "!ih!ih!..._                                                P0Y0M0DT0H0M0.090SHIP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                                                 _de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                P0Y0M0DT0H0M0.090SHIP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                                                 " + "'", str4, "                                                P0Y0M0DT0H0M0.090SHIP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                                                 ");
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty(" und ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "und" + "'", str1, "und");
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale5 = new java.util.Locale("");
        java.util.Locale locale7 = new java.util.Locale("\u4e2d\u6587");
        java.lang.String str8 = locale5.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("P0Y0M0DT0H0M0.034S");
        java.lang.String str11 = locale7.getDisplayName(locale10);
        java.lang.String str12 = locale1.getDisplayScript(locale7);
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u6587" + "'", str11, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("p000000t00000.0230");
        java.util.Locale.Category category2 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category2, locale3);
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.util.Locale.setDefault(category2, locale5);
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale8);
        java.util.Locale.setDefault(category2, locale8);
        java.util.Locale.Category category12 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale13 = java.util.Locale.UK;
        java.util.Locale.setDefault(category12, locale13);
        java.util.Locale locale15 = java.util.Locale.getDefault(category12);
        java.util.Locale locale16 = java.util.Locale.getDefault(category12);
        java.util.Locale.setDefault(category2, locale16);
        java.util.Locale locale18 = java.util.Locale.getDefault(category2);
        java.lang.String str19 = locale18.getISO3Language();
        java.util.Set<java.lang.String> strSet20 = locale18.getUnicodeLocaleAttributes();
        java.lang.String str21 = timeZone1.getDisplayName(locale18);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category2.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "99.00:00:0" + "'", str10, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.FORMAT + "'", category12.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "eng" + "'", str19, "eng");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Greenwich Mean Time" + "'", str21, "Greenwich Mean Time");
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.090S0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 ho", '4');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.090S0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 ho" + "'", str3, "P0Y0M0DT0H0M0.090S0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 ho");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("", "                                                                                                                              !I0                                      P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                              !I0                                      P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S" + "'", str2, "                                                                                                                              !I0                                      P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S");
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0I!                                                                                              ", "Canada");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "P0Y0M0DT0H0M0.014S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }
}
