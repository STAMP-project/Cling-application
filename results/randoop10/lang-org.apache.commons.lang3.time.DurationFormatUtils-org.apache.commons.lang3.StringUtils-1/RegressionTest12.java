import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = builder4.build();
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale8);
        boolean boolean11 = locale8.hasExtensions();
        java.util.Set<java.lang.String> strSet12 = locale8.getUnicodeLocaleKeys();
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.UK;
        java.util.Locale.setDefault(category13, locale14);
        java.lang.String str16 = locale14.getVariant();
        java.lang.String str17 = locale14.toLanguageTag();
        java.util.Set<java.lang.Character> charSet18 = locale14.getExtensionKeys();
        java.lang.String str19 = locale8.getDisplayCountry(locale14);
        java.lang.String str20 = locale8.getDisplayVariant();
        java.util.Locale.Builder builder21 = builder4.setLocale(locale8);
        java.util.Set<java.lang.String> strSet22 = locale8.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "99.00:00:0" + "'", str10, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en-GB" + "'", str17, "en-GB");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "China" + "'", str19, "China");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Chinese      ", (int) 'a', "P0Y0M0DT0H0M0.153S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.153SP0Y0M0DT0H0M0.153SP0Y0M0Chinese      P0Y0M0DT0H0M0.153SP0Y0M0DT0H0M0.153SP0Y0M0" + "'", str3, "P0Y0M0DT0H0M0.153SP0Y0M0DT0H0M0.153SP0Y0M0Chinese      P0Y0M0DT0H0M0.153SP0Y0M0DT0H0M0.153SP0Y0M0");
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u4e2d\u6587!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ip0y0m0dt0h0m0.090s", 'u');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u6587!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ip0y0m0dt0h0m0.090s" + "'", str3, "\u4e2d\u6587!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ip0y0m0dt0h0m0.090s");
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Chinese (China)FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)", "_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("P0Y0M0DT0H0M0.004S", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("P0Y0M0DT0H0M0.042S", "#####CAN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.042S" + "'", str2, "P0Y0M0DT0H0M0.042S");
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "und-IH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        java.util.Locale locale1 = new java.util.Locale("0:00:00.99");
        java.util.Locale locale2 = java.util.Locale.ROOT;
        java.util.Locale locale5 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.lang.String str6 = locale2.getDisplayCountry(locale5);
        java.lang.String str7 = locale1.getDisplayScript(locale2);
        java.lang.String str8 = locale1.getVariant();
        java.lang.String str9 = locale1.getDisplayCountry();
        java.lang.String str10 = locale1.getDisplayName();
        org.junit.Assert.assertEquals(locale1.toString(), "0:00:00.99");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.99" + "'", str10, "0:00:00.99");
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale.setDefault(locale1);
        java.lang.String str4 = locale1.getLanguage();
        java.lang.Class<?> wildcardClass5 = locale1.getClass();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr" + "'", str4, "fr");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
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
            java.util.Locale.Builder builder10 = builder8.setVariant("HI!                          ...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: HI!                          ... [at index 0]");
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
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        java.util.Locale locale1 = new java.util.Locale("English (United States)");
        java.lang.String str2 = locale1.getCountry();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale1.getScript();
        org.junit.Assert.assertEquals(locale1.toString(), "english (united states)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "                                                         danac                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str2, "\u4e2d\u6587\u53f0\u7063)");
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11M30DT23H59M59.990S");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11M30DT23H59M59.990S" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11M30DT23H59M59.990S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11M30DT23H59M59.990S" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11M30DT23H59M59.990S");
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("");
        java.lang.String str10 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone9);
        timeZone9.setRawOffset((int) (byte) 0);
        java.lang.String str13 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 11, (long) 100, "...chHeure de Gr...", true, timeZone9);
        int int15 = timeZone9.getOffset((long) 'x');
        boolean boolean16 = timeZone9.observesDaylightTime();
        boolean boolean17 = timeZone9.observesDaylightTime();
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u6587" + "'", str10, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "...ch0eure 0e Gr..." + "'", str13, "...ch0eure 0e Gr...");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        java.util.Locale.Builder builder10 = builder7.setExtension('x', "");
        java.util.Locale.Builder builder12 = builder10.setLanguageTag("en");
        java.util.Locale.Builder builder13 = builder10.clear();
        java.util.Locale.Builder builder15 = builder13.setRegion("de");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder15.setScript("United States");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: United States [at index 0]");
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
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HI!HI!HI!ihHI!HI!HI                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("                                                                !I0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=!i0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                p0y000dt00000.090153hip0y000dt00000.090153!p0y000dt00000.090153_XCHINESISCHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX_Canada");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                P0Y000DT00000.090153HIP0Y000DT00000.090153!P0Y000DT00000.090153_xchinesischxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_cANADA" + "'", str1, "                                                P0Y000DT00000.090153HIP0Y000DT00000.090153!P0Y000DT00000.090153_xchinesischxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_cANADA");
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Engli0h (Unite0 120tate0", "GBP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Englih (Unite 2tate" + "'", str3, "Englih (Unite 2tate");
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(37);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "_0 days 0 hours 0 minutes 0 seconds");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr..." + "'", str1, "...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...");
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) " #####################################################################################################################  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " #####################################################################################################################  " + "'", str1, " #####################################################################################################################  ");
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("zh_CNzhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz", "0:00:00.002", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "HI!                                                                                              ", (int) '4');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "zh_TW");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "P0Y0M0DT0H0M0.034S");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND", 17, 83);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale4 = new java.util.Locale("\u4e2d\u6587");
        java.util.Locale.setDefault(category0, locale4);
        java.lang.String str6 = locale4.getVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale4.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("un0");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "4444444444444444444444444444444444444444444444444444444444444444444440 DAYS 0 HOURS 0 MINUTES 0 SECO");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("               ZH_TW (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               ", 8, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        java.util.Locale locale2 = new java.util.Locale("                                                                                                                     !I0", "zho");
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Locale.Category category5 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category5, locale6);
        java.lang.String str8 = locale6.getLanguage();
        java.lang.String str9 = locale4.getDisplayScript(locale6);
        java.util.Set<java.lang.String> strSet10 = locale6.getUnicodeLocaleKeys();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", locale6);
        java.util.Set<java.lang.Character> charSet12 = locale6.getExtensionKeys();
        java.lang.String str14 = locale6.getExtension('a');
        java.lang.String str15 = locale2.getDisplayName(locale6);
        org.junit.Assert.assertEquals(locale2.toString(), "                                                                                                                     !i0_ZHO");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en" + "'", str8, "en");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str11, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                                                                     !i0 (ZHO)" + "'", str15, "                                                                                                                     !i0 (ZHO)");
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("German (Germany)", "Rf");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "German (Germany)" + "'", str2, "German (Germany)");
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("...                                                                                                     ", "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("001.00:00:0", "...                                                                                                     ", 0, 120);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...                                                                                                     " + "'", str4, "...                                                                                                     ");
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "P0Y0M0DT0H0M0.031S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "H!ih!ih!ih!ih!ih!ih!iP0Y0-10DT07430-10.1213599678");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
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
            java.util.Locale.Builder builder10 = builder7.removeUnicodeLocaleAttribute("P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S [at index 0]");
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
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        java.util.Locale locale1 = new java.util.Locale("English (United States)");
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale1.getDisplayLanguage();
        java.util.Locale.Category category4 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category4, locale5);
        java.util.Locale locale7 = java.util.Locale.getDefault(category4);
        java.util.Locale locale8 = java.util.Locale.UK;
        java.util.Locale.Category category9 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category9, locale10);
        java.lang.String str12 = locale10.getLanguage();
        java.lang.String str13 = locale8.getDisplayScript(locale10);
        java.util.Locale.setDefault(category4, locale8);
        java.util.Locale locale17 = new java.util.Locale("");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.upperCase("p0y0m0dt0h0m0.034s", locale17);
        java.lang.String str19 = locale17.getDisplayLanguage();
        java.util.Locale.setDefault(category4, locale17);
        java.lang.String str21 = locale1.getDisplayVariant(locale17);
        org.junit.Assert.assertEquals(locale1.toString(), "english (united states)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "english (united states)" + "'", str3, "english (united states)");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.FORMAT + "'", category4.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.FORMAT + "'", category9.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en" + "'", str12, "en");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str18, "P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replaceEach("0", strArray1, strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'u');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str6, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                              000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                              000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A" + "'", str1, "                                                                                                                                                                                                                              000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A");
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-CA");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.setDefault(locale6);
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.util.Locale locale9 = java.util.Locale.PRC;
        java.lang.String str10 = locale8.getDisplayLanguage(locale9);
        java.lang.String str11 = locale6.getDisplayLanguage(locale9);
        java.util.Locale locale14 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.lang.String str15 = locale9.getDisplayVariant(locale14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.lowerCase("", locale9);
        java.lang.String str17 = locale9.getDisplayCountry();
        boolean boolean18 = languageRange1.equals((java.lang.Object) locale9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-ca" + "'", str2, "en-ca");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u6587" + "'", str10, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals(locale14.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "China" + "'", str17, "China");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)");
        boolean boolean2 = timeZone1.observesDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "TW" + "'", str4, "TW");
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("ENGENGENGENGENGENGENGENGENGENGENGENGENGzh_twt00t00t00t00t0ENGENGENGENGENGENGENGENGENGENGENGENGENG", "                                                                                                                                                                                                                              000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ENGENGENGENGENGENGENGENGENGENGENGENGENGzh_twt00t00t00t00t0ENGENGENGENGENGENGENGENGENGENGENGENGENG" + "'", str2, "ENGENGENGENGENGENGENGENGENGENGENGENGENGzh_twt00t00t00t00t0ENGENGENGENGENGENGENGENGENGENGENGENGENG");
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        java.util.Locale locale3 = new java.util.Locale("P0Y0M0DT0H0M0.001S", "hi!", "0:00:00.99");
        java.lang.String str5 = locale3.getExtension('u');
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale3.getDisplayName(locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "p0y0m0dt0h0m0.001s_HI!_0:00:00.99");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
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
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "!ih");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap12);
        java.util.Collection<java.lang.String> strCollection14 = null;
        java.lang.String str15 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection14);
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap26 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, strMap26);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.Locale.Category category31 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category31, locale32);
        java.util.Set<java.lang.String> strSet34 = locale32.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strSet34);
        java.util.List<java.lang.String> strList36 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strSet34);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList17, "P-1Y11M30DT23H59M59.947S");
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.util.Locale.Category category42 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category42, locale43);
        java.util.Set<java.lang.String> strSet45 = locale43.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strSet45);
        java.lang.String str47 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList46);
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        java.util.Locale[] localeArray51 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList52 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList52, localeArray51);
        java.util.Locale locale54 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.util.Locale>) localeList52);
        java.util.Collection<java.util.Locale> localeCollection55 = null;
        java.util.Locale.FilteringMode filteringMode56 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList57 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, localeCollection55, filteringMode56);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap58 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList59 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, strMap58);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap60 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList61 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, strMap60);
        java.lang.String str63 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList61, 'x');
        java.util.Locale.LanguageRange[] languageRangeArray64 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList65 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList65, languageRangeArray64);
        java.util.Locale[] localeArray67 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList68 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList68, localeArray67);
        java.util.Locale locale70 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList65, (java.util.Collection<java.util.Locale>) localeList68);
        java.util.Collection<java.util.Locale> localeCollection71 = null;
        java.util.Locale.FilteringMode filteringMode72 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList73 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList65, localeCollection71, filteringMode72);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap74 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList75 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList65, strMap74);
        java.util.Locale.LanguageRange[] languageRangeArray76 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList77 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList77, languageRangeArray76);
        java.util.Locale.Category category79 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale80 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category79, locale80);
        java.util.Set<java.lang.String> strSet82 = locale80.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList77, (java.util.Collection<java.lang.String>) strSet82);
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList65, (java.util.Collection<java.lang.String>) strSet82);
        java.util.Locale.FilteringMode filteringMode85 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags(languageRangeList61, (java.util.Collection<java.lang.String>) strSet82, filteringMode85);
        java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList46, filteringMode85);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode8.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(locale22);
        org.junit.Assert.assertTrue("'" + filteringMode24 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode24.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList25);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + category31 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category31.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + category42 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category42.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(languageRangeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(localeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(locale54);
        org.junit.Assert.assertTrue("'" + filteringMode56 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode56.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList57);
        org.junit.Assert.assertNotNull(languageRangeList59);
        org.junit.Assert.assertNotNull(languageRangeList61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(languageRangeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(localeArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(locale70);
        org.junit.Assert.assertTrue("'" + filteringMode72 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode72.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList73);
        org.junit.Assert.assertNotNull(languageRangeList75);
        org.junit.Assert.assertNotNull(languageRangeArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + category79 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category79.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "");
        org.junit.Assert.assertNotNull(strSet82);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertTrue("'" + filteringMode85 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode85.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertNotNull(strList87);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        int int2 = timeZone1.getRawOffset();
        int int3 = timeZone1.getRawOffset();
        int int5 = timeZone1.getOffset(1L);
        java.util.TimeZone.setDefault(timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = timeZone1.getDisplayName(true, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("0320.000000I!                                                                                              ", "French");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = builder4.build();
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale8);
        boolean boolean11 = locale8.hasExtensions();
        java.util.Set<java.lang.String> strSet12 = locale8.getUnicodeLocaleKeys();
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.UK;
        java.util.Locale.setDefault(category13, locale14);
        java.lang.String str16 = locale14.getVariant();
        java.lang.String str17 = locale14.toLanguageTag();
        java.util.Set<java.lang.Character> charSet18 = locale14.getExtensionKeys();
        java.lang.String str19 = locale8.getDisplayCountry(locale14);
        java.lang.String str20 = locale8.getDisplayVariant();
        java.util.Locale.Builder builder21 = builder4.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder23 = builder4.setLanguage("0e_zh_tw (p0y0-10aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.034Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanute04 0 econd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 0e_zh_tw (p0y0-10aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.034Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanute04 0 econd) [at index 0]");
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
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "99.00:00:0" + "'", str10, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en-GB" + "'", str17, "en-GB");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "China" + "'", str19, "China");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        timeZone13.setID("zh");
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone("");
        int int20 = timeZone19.getRawOffset();
        java.lang.String str21 = timeZone19.getID();
        int int22 = timeZone19.getRawOffset();
        timeZone19.setID("#####################################################################################################################");
        boolean boolean25 = timeZone13.hasSameRules(timeZone19);
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone32 = java.util.TimeZone.getTimeZone("");
        java.lang.String str33 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone32);
        boolean boolean34 = timeZone32.observesDaylightTime();
        java.util.TimeZone timeZone40 = java.util.TimeZone.getTimeZone("");
        java.lang.String str41 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone40);
        boolean boolean42 = timeZone32.hasSameRules(timeZone40);
        boolean boolean43 = timeZone26.hasSameRules(timeZone32);
        boolean boolean44 = timeZone32.observesDaylightTime();
        int int45 = timeZone32.getRawOffset();
        boolean boolean46 = timeZone32.observesDaylightTime();
        boolean boolean47 = timeZone19.hasSameRules(timeZone32);
        java.util.Locale locale51 = new java.util.Locale("0:00:00.335", "44444444444444444444444444444", "Chinesisch (China)");
        java.util.Locale locale53 = new java.util.Locale("0:00:00.99");
        java.util.Locale locale54 = java.util.Locale.ROOT;
        java.util.Locale locale57 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.lang.String str58 = locale54.getDisplayCountry(locale57);
        java.lang.String str59 = locale53.getDisplayScript(locale54);
        java.util.Locale locale60 = locale54.stripExtensions();
        java.lang.String str61 = locale51.getDisplayVariant(locale60);
        java.lang.String str62 = timeZone32.getDisplayName(locale60);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "GMT" + "'", str21, "GMT");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals(locale51.toString(), "0:00:00.335_44444444444444444444444444444_Chinesisch (China)");
        org.junit.Assert.assertEquals(locale53.toString(), "0:00:00.99");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals(locale57.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Chinesisch (China)" + "'", str61, "Chinesisch (China)");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Greenwich Mean Time" + "'", str62, "Greenwich Mean Time");
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = locale0.stripExtensions();
        boolean boolean2 = locale1.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.setDefault(locale2);
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = locale4.getDisplayLanguage(locale5);
        java.lang.String str7 = locale2.getDisplayLanguage(locale5);
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale10 = new java.util.Locale("P0Y0M0DT0H0M0.090S");
        java.util.Locale locale13 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.lang.String str15 = locale13.getDisplayName(locale14);
        java.lang.String str16 = locale14.toLanguageTag();
        java.lang.String str17 = locale10.getDisplayLanguage(locale14);
        java.lang.String str18 = locale14.getDisplayVariant();
        java.util.Locale locale19 = locale14.stripExtensions();
        java.lang.String str20 = locale5.getDisplayVariant(locale19);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals(locale10.toString(), "p0y0m0dt0h0m0.090s");
        org.junit.Assert.assertEquals(locale13.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str15, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh" + "'", str16, "zh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "p0y0m0dt0h0m0.090s" + "'", str17, "p0y0m0dt0h0m0.090s");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("P-1Y11M30DT23H59M59.947S");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("un00unun_0 DAY5 0 0OUR5 0 0INUTE005 0 ECONDun000unun");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "un00unun_0 DAY5 0 0OUR5 0 0INUTE005 0 ECONDun000unun" + "'", str1, "un00unun_0 DAY5 0 0OUR5 0 0INUTE005 0 ECONDun000unun");
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("44", "0I!                                                                                              ", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "P0Y000DT00000.09010hiP0Y000DT00000.09010!P0Y000DT00000.09010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str2, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.lang.String str4 = locale2.getISO3Country();
        java.lang.String str5 = locale2.getVariant();
        java.lang.String str6 = locale2.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "anglais (Royaume-Uni)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("0:00:00.007");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.007" + "'", str1, "0:00:00.007");
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        java.util.Locale locale1 = new java.util.Locale("English (United States)");
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale1.getDisplayLanguage();
        java.lang.String str4 = locale1.getISO3Country();
        java.lang.String str5 = locale1.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "english (united states)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "english (united states)" + "'", str3, "english (united states)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("eng", '4');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                zh", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("de_DE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=de_de");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "", 3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("en-CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("United States");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United States" + "'", str1, "United States");
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
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
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.util.Locale locale18 = java.util.Locale.CHINESE;
        java.lang.String str19 = locale16.getDisplayName(locale18);
        java.lang.String str20 = locale18.getLanguage();
        java.util.Set<java.lang.String> strSet21 = locale18.getUnicodeLocaleAttributes();
        java.lang.String str22 = locale18.getVariant();
        java.util.Locale.setDefault(category0, locale18);
        java.util.Locale locale24 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
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
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str19, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zh" + "'", str20, "zh");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh");
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("#######P0Y0M0DT0H0M0...", "p-1y11m30dt23h59m59.979s", 89);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######P0Y0M0DT0H0M0..." + "'", str3, "#######P0Y0M0DT0H0M0...");
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setLanguageTag("fran\347ais (France)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: franc?ais (France) [at index 0]");
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
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("0 days", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
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
        boolean boolean20 = timeZone17.observesDaylightTime();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("mxanxarxasxavxayxazxbaxbexbgxbhxbixbmxbnxboxbrxbsxcaxcexchxcoxcrxcsxcxcvxcyxdaxdexdvxdzxeexelxenxeoxesxetxexfaxffxfixfjxfoxfrxfyxgaxgdxglxgnxgxgvxhaxhexhixhoxhrxhtxhxhyxhzxiaxidxiexigxiixikxinxioxisxitxixiwxjaxjixjvxkaxkgxkixkjxkkxklxkmxknxkoxkrxksxkxkvxkwxkyxlaxlbxlgxlixlnxloxltxlxlvxmgxmhxmixmkxmlxmnxmoxmrxmsxmtxmyxnaxnbxndxnexngxnlxnnxnoxnrxnvxnyxocxojxomxorxosxpaxpixplxpsxptxqxrmxrnxroxrxrwxsaxscxsdxsexsgxsixskxslxsmxsnxsoxsqxsrxssxstxsxsvxswxtaxtextgxthxtixtkxtlxtnxtoxtrxtsxttxtwxtyxgxkxrxzxvexvixvoxwaxwoxxhxyixyoxzaxzhxz", "danac");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mxanxarxasxavxayxazxbaxbexbgxbhxbixbmxbnxboxbrxbsxcaxcexchxcoxcrxcsxcxcvxcyxdaxdexdvxdzxeexelxenxeoxesxetxexfaxffxfixfjxfoxfrxfyxgaxgdxglxgnxgxgvxhaxhexhixhoxhrxhtxhxhyxhzxiaxidxiexigxiixikxinxioxisxitxixiwxjaxjixjvxkaxkgxkixkjxkkxklxkmxknxkoxkrxksxkxkvxkwxkyxlaxlbxlgxlixlnxloxltxlxlvxmgxmhxmixmkxmlxmnxmoxmrxmsxmtxmyxnaxnbxndxnexngxnlxnnxnoxnrxnvxnyxocxojxomxorxosxpaxpixplxpsxptxqxrmxrnxroxrxrwxsaxscxsdxsexsgxsixskxslxsmxsnxsoxsqxsrxssxstxsxsvxswxtaxtextgxthxtixtkxtlxtnxtoxtrxtsxttxtwxtyxgxkxrxzxvexvixvoxwaxwoxxhxyixyoxzaxzhxz" + "'", str2, "mxanxarxasxavxayxazxbaxbexbgxbhxbixbmxbnxboxbrxbsxcaxcexchxcoxcrxcsxcxcvxcyxdaxdexdvxdzxeexelxenxeoxesxetxexfaxffxfixfjxfoxfrxfyxgaxgdxglxgnxgxgvxhaxhexhixhoxhrxhtxhxhyxhzxiaxidxiexigxiixikxinxioxisxitxixiwxjaxjixjvxkaxkgxkixkjxkkxklxkmxknxkoxkrxksxkxkvxkwxkyxlaxlbxlgxlixlnxloxltxlxlvxmgxmhxmixmkxmlxmnxmoxmrxmsxmtxmyxnaxnbxndxnexngxnlxnnxnoxnrxnvxnyxocxojxomxorxosxpaxpixplxpsxptxqxrmxrnxroxrxrwxsaxscxsdxsexsgxsixskxslxsmxsnxsoxsqxsrxssxstxsxsvxswxtaxtextgxthxtixtkxtlxtnxtoxtrxtsxttxtwxtyxgxkxrxzxvexvixvoxwaxwoxxhxyixyoxzaxzhxz");
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) 224, "                                 'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 p0000y0m0dthh0m00.s                                 " + "'", str3, "                                 p0000y0m0dthh0m00.s                                 ");
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("CN");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'x');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "########chinese(china)#########");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CN" + "'", str3, "CN");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
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
        java.lang.String str14 = locale2.getISO3Language();
        java.util.Set<java.lang.String> strSet15 = locale2.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = locale2.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zho" + "'", str14, "zho");
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
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
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.util.Set<java.lang.String> strSet14 = locale12.getUnicodeLocaleKeys();
        java.lang.String str15 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet14);
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
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(str15);
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
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "CA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!                                                                                              ", (int) '#', " DAYS 0 HO");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!                                                                                              " + "'", str3, "HI!                                                                                              ");
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00          0I!          0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:", "'P'yyyy'Y'M'M'd'DT'H'H'ZH_tw'P'yyyy'Y'M'M'd'DT'H'H'm", 117);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("p0y0m0dt0h0m0.034s");
        java.util.Locale locale2 = null;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        java.util.Locale locale3 = new java.util.Locale("zh_TW", "Chinese (China)");
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.lang.String str5 = locale4.getDisplayVariant();
        java.lang.String str6 = locale3.getDisplayLanguage(locale4);
        java.util.Locale locale8 = new java.util.Locale("en-GB");
        java.lang.String str9 = locale8.getISO3Country();
        java.lang.String str10 = locale4.getDisplayCountry(locale8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("CAN", locale4);
        java.lang.Object obj12 = locale4.clone();
        org.junit.Assert.assertEquals(locale3.toString(), "zh_tw_CHINESE (CHINA)");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh_tw" + "'", str6, "zh_tw");
        org.junit.Assert.assertEquals(locale8.toString(), "en-gb");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "can" + "'", str11, "can");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "de");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "de");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "de");
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder11.setUnicodeLocaleKeyword("001.00:00:0", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaap0y0m0dt0h0m0.034saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 001.00:00:0 [at index 0]");
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
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("English (United States)", "#######P0Y0M0DT0H0M0...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("########chinese (china)#########", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########chinese (china)#########" + "'", str2, "########chinese (china)#########");
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "chinois (Chine)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("\u6cd5\u6587\u6cd5\u56fd))");
        java.util.TimeZone.setDefault(timeZone1);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("UN00UNUN_0_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0P0Y0M0DT0H0M0.020S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "un00unun_0_0 days 0 hours 0 minutes 0 seconds_0 days 0 hours 0 minutes 0 seconds_0 days 0p0y0m0dt0h0m0.020s" + "'", str1, "un00unun_0_0 days 0 hours 0 minutes 0 seconds_0 days 0 hours 0 minutes 0 seconds_0 days 0p0y0m0dt0h0m0.020s");
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        java.util.Locale locale2 = new java.util.Locale("English (United States)");
        boolean boolean3 = locale2.hasExtensions();
        java.lang.String str4 = locale2.getDisplayName();
        java.lang.String str5 = locale2.getDisplayVariant();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("HI!HIanglais (Royaume-Uni)HI!HI!", locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "english (united states)");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "english (united states)" + "'", str4, "english (united states)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!HIANGLAIS (ROYAUME-UNI)HI!HI!" + "'", str6, "HI!HIANGLAIS (ROYAUME-UNI)HI!HI!");
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
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
        java.lang.String str83 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "aaxabxaexafxakxamxanxarxasxavxayxazxbaxbexbgxbhxbixbmxbnxboxbrxbsxcaxcexchxcoxcrxcsxcxcvxcyxdaxdexdvxdzxeexelxenxeoxesxetxexfaxffxfixfjxfoxfrxfyxgaxgdxglxgnxgxgvxhaxhexhixhoxhrxhtxhxhyxhzxiaxidxiexigxiixikxinxioxisxitxixiwxjaxjixjvxkaxkgxkixkjxkkxklxkmxknxkoxkrxksxkxkvxkwxkyxlaxlbxlgxlixlnxloxltxlxlvxmgxmhxmixmkxmlxmnxmoxmrxmsxmtxmyxnaxnbxndxnexngxnlxnnxnoxnrxnvxnyxocxojxomxorxosxpaxpixplxpsxptxqxrmxrnxroxrxrwxsaxscxsdxsexsgxsixskxslxsmxsnxsoxsqxsrxssxstxsxsvxswxtaxtextgxthxtixtkxtlxtnxtoxtrxtsxttxtwxtyxgxkxrxzxvexvixvoxwaxwoxxhxyixyoxzaxzhxz");
        java.lang.String str85 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, 'x');
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
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u4e2d\u6587" + "'", str20, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u4e2d\u6587" + "'", str29, "\u4e2d\u6587");
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
// flaky:         org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\u4e2d\u6587" + "'", str60, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale65);
// flaky:         org.junit.Assert.assertEquals(locale65.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\u4e2d\u6587" + "'", str69, "\u4e2d\u6587");
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
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0 days 0 hours 0 minutes 0 seco", "...chHeure de Gr...");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0e_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAY4 0 0OUR4 0 0INUTE04 0 ECOND)", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("Ger0an0", strArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("china");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("engeng", "p0y0m0dt0h0m0.042s");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p0y0m0dt0h0m0.042s" + "'", str2, "p0y0m0dt0h0m0.042s");
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("00dt00000.090153HIp0y000dt00000.090153!p0y000dt00000.090153", "g35999t", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\u6cd5\u6587\u6cd5\u56fd)", '4');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("p000000t00000.0230", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                p000000t0h000.0900hip000000t0h000.0900!p000000t0h000.0900                                                 ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str6, "\u6cd5\u6587\u6cd5\u56fd)");
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
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
        java.lang.String str17 = locale16.getISO3Language();
        java.util.Set<java.lang.String> strSet18 = locale16.getUnicodeLocaleAttributes();
        java.lang.String str19 = locale16.getDisplayLanguage();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "eng" + "'", str17, "eng");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "English" + "'", str19, "English");
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("fran\347\uc911\uad6d\uc5b4\uc911\uad6d)", 153, 17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        char[] charArray5 = new char[] { '4', '#' };
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0 days 0 hours 0 minutes 0 seconds", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "china", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en_GB", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, #]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        char[] charArray11 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\u683c\u6797\u5a01\u6cbb\u6642\u9593", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\uad6d\uc911\uc5b4\uad6d\uc911", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("P0Y0M0DT0H0M0.121S", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P0Y000DT00000.0230", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category5, locale6);
        java.util.Locale locale8 = java.util.Locale.getDefault(category5);
        java.util.Locale locale9 = java.util.Locale.getDefault(category5);
        java.util.Locale.Category category10 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category10, locale11);
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.util.Locale.setDefault(category10, locale13);
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.util.Locale locale17 = locale16.stripExtensions();
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale16);
        java.util.Locale.setDefault(category10, locale16);
        java.util.Locale.Category category20 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale21 = java.util.Locale.UK;
        java.util.Locale.setDefault(category20, locale21);
        java.util.Locale locale23 = java.util.Locale.getDefault(category20);
        java.util.Locale locale24 = java.util.Locale.getDefault(category20);
        java.util.Locale.setDefault(category10, locale24);
        java.util.Locale.setDefault(category5, locale24);
        java.lang.String str27 = locale24.getDisplayScript();
        java.lang.String str28 = locale4.getDisplayCountry(locale24);
        java.lang.String str29 = locale4.getDisplayName();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category10.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "99.00:00:0" + "'", str18, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + category20 + "' != '" + java.util.Locale.Category.FORMAT + "'", category20.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "China" + "'", str28, "China");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Chinese (China)" + "'", str29, "Chinese (China)");
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("0e_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAY4 0 0OUR4 0 0INUTE04 0 ECOND)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=0e_zh_tw (p0y0-10dt07430-10.0343599900,0 day4 0 0our4 0 0inute04 0 econd)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "   TE0    ", (java.lang.CharSequence) "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        char[] charArray10 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "P0Y0M0DT0H0M0.079S", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0 seconds", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi!", "P0Y0M0DT0H0M0.013S", 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int6 = timeZone5.getRawOffset();
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 41, (long) 52, "tes", false, timeZone5);
        timeZone5.setRawOffset(23);
        java.lang.String str10 = timeZone5.getID();
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale locale14 = builder13.build();
        java.util.Locale.setDefault(locale14);
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.util.Locale locale17 = java.util.Locale.PRC;
        java.lang.String str18 = locale16.getDisplayLanguage(locale17);
        java.lang.String str19 = locale14.getDisplayLanguage(locale17);
        java.lang.String str20 = locale17.getISO3Language();
        java.util.Locale.setDefault(locale17);
        java.util.Locale locale22 = java.util.Locale.PRC;
        java.lang.String str23 = locale22.getDisplayName();
        java.util.Set<java.lang.Character> charSet24 = locale22.getExtensionKeys();
        java.lang.String str25 = locale17.getDisplayLanguage(locale22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = timeZone5.getDisplayName(false, (int) '#', locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "te0" + "'", str7, "te0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GMT" + "'", str10, "GMT");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u6587" + "'", str18, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zho" + "'", str20, "zho");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str23, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(charSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u4e2d\u6587" + "'", str25, "\u4e2d\u6587");
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120", "...a)FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                    ", '#');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        java.util.Locale locale1 = new java.util.Locale("\u6cd5\u6587\u6cd5\u56fd)");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale.setDefault(locale1);
        java.lang.String str4 = locale1.getDisplayCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 224, "       ", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       " + "'", str3, "       ");
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "P-1Y11M30DT23H59M59.664S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
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
        java.util.Locale.Builder builder21 = builder8.clearExtensions();
        java.util.Locale.Builder builder22 = builder21.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder24 = builder21.addUnicodeLocaleAttribute("zh_tw");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: zh_tw [at index 0]");
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
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        char[] charArray7 = new char[] { '4', '#' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0 days 0 hours 0 minutes 0 seconds", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!                                                                                              ", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "CAN", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("                       P0Y0M0DT0H                        ", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P0Y0M0DT0H0M0.042S", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, #]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("und-IH", 21, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuund-IH" + "'", str3, "uuuuuuuuuuuuuuuund-IH");
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("g", "'P'yyyy'Y'M'M'd'DT'H'H'ZH_tw'P'yyyy'Y'M'M'd'DT'H'H'm");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "343599900");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("cancancancancancancancancancancancancancancancancancancancancancancancancancancancancancancan0:00:00.089");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getExtension('a');
        java.lang.String str4 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("P-1Y11M30DT23H59M59.999S", (int) '#', "0:00:00.000uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                     0:00:00.000uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                     0:00:00.000uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                     0:00:00.000uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                     0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11M30DT23H59M59.999S0:00:00.000" + "'", str3, "P-1Y11M30DT23H59M59.999S0:00:00.000");
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        java.util.Locale locale1 = new java.util.Locale("canada");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale1.toString(), "canada");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("!ih!ih!..", "p0y0m0dt0h0m0.000", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
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
        java.util.Locale.Builder builder20 = builder7.setExtension('a', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder23 = builder20.setExtension(' ', "...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuu");
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
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = locale2.getDisplayName(locale4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", locale2);
        java.lang.String str7 = locale2.getCountry();
        java.lang.String str8 = locale0.getDisplayVariant(locale2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str5, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str6, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FR" + "'", str7, "FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                        ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "                                                                                     0:00:00.000");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                4P404Y404M404DT404H404M404.40904Shi4P404Y404M404DT404H404M404.40904S4!4P404Y404M404DT404H404M404.40904S4                        " + "'", str3, "                4P404Y404M404DT404H404M404.40904Shi4P404Y404M404DT404H404M404.40904S4!4P404Y404M404DT404H404M404.40904S4                        ");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4P44Y44M44DT44H44M44494Shi4P44Y44M44DT44H44M44494S4!4P44Y44M44DT44H44M44494S4" + "'", str7, "4P44Y44M44DT44H44M44494Shi4P44Y44M44DT44H44M44494S4!4P44Y44M44DT44H44M44494S4");
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("     ...");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", "HI!                          ...", 10);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "0 days 0 hours 0 minutes 0 seco");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("               zh               ", strArray2, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ZH_tw", "TW", 41);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "P0Y0M0DT0H0M0.013S");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZH_tw" + "'", str5, "ZH_tw");
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        int int9 = timeZone5.getOffset(0L);
        java.util.TimeZone.setDefault(timeZone5);
        timeZone5.setID("de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)");
        java.util.TimeZone.setDefault(timeZone5);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = timeZone5.getOffset(19, 57, 13, 100, 153, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("Chinese                       'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's                                 ", "aaaaaa0:00:00.99aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("danac", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0:00:00.096", "P-1Y11030DT23059059.998120");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        char[] charArray10 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Heure de Greenwich", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("4P404Y4040404DT40404040404.40904313hi4P404Y4040404DT40404040404.409043134!4P404Y4040404DT40404040404.409043134", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("chinese (china)fran\347\uc911\uad6d\uc5b4\uc911\uad6d)", "#######p0y0m0dt0h0m0.000s#######");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhi!#######");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhi!#######ineuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhi!#######e (cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhi!#######ina)fran\347\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str4, "cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhi!#######ineuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhi!#######e (cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhi!#######ina)fran\347\uc911\uad6d\uc5b4\uc911\uad6d)");
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Chinese", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese" + "'", str2, "Chinese");
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "44444444444444444444444444444444444444           HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", "               z0_tw (p0y0-10dt07430-10.0343599900,0 day93 0 0our93 0 0inute93 0 econd)               ", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        java.util.Locale locale3 = new java.util.Locale("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", "M0.019S", "                                                                                                                                                                                                                              000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a");
        org.junit.Assert.assertEquals(locale3.toString(), "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'_M0.019S_                                                                                                                                                                                                                              000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a");
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("W");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "W" + "'", str1, "W");
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("4P404Y404M404DT404H404M404.40904Shi4P404Y404M404DT404H404M404.40904S4!4P404Y404M404DT404H404M404.40904S4", 58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
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
        boolean boolean21 = timeZone6.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone6);
        java.time.ZoneId zoneId23 = timeZone6.toZoneId();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(zoneId23);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = builder4.build();
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale8);
        boolean boolean11 = locale8.hasExtensions();
        java.util.Set<java.lang.String> strSet12 = locale8.getUnicodeLocaleKeys();
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.UK;
        java.util.Locale.setDefault(category13, locale14);
        java.lang.String str16 = locale14.getVariant();
        java.lang.String str17 = locale14.toLanguageTag();
        java.util.Set<java.lang.Character> charSet18 = locale14.getExtensionKeys();
        java.lang.String str19 = locale8.getDisplayCountry(locale14);
        java.lang.String str20 = locale8.getDisplayVariant();
        java.util.Locale.Builder builder21 = builder4.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder23 = builder4.setLanguage("un00unun_0 DAY32 0 0OUR32 0 0INUTE032 0 ECONDun000unun");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: un00unun_0 DAY32 0 0OUR32 0 0INUTE032 0 ECONDun000unun [at index 0]");
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
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "99.00:00:0" + "'", str10, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en-GB" + "'", str17, "en-GB");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "China" + "'", str19, "China");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "zh_CNzhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("99.00:00:0");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale4);
        java.util.Locale.Builder builder7 = builder2.setLocale(locale4);
        java.lang.String str8 = locale1.getDisplayLanguage(locale4);
        java.lang.String str9 = locale1.getDisplayScript();
        java.lang.String str10 = locale1.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "99.00:00:0" + "'", str6, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(" I!", "                                                                                                                                                                                                                              000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " I!" + "'", str2, " I!");
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
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
        java.util.Locale.Builder builder19 = builder5.setLanguageTag("en-ca");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder22 = builder19.setExtension('#', "Chinese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
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
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "994.4004:4004:40");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44p0y0m0dt0h0m0.090s4444444444444444444", 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("44444444444444444444444444444444444444           HI", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=44444444444444444444444444444444444444hi");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0-10DT07430-10.0343599900", "Engli0h (Unite0 120tate0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale2);
        java.lang.String str4 = locale0.getDisplayVariant(locale2);
        java.util.Set<java.lang.Character> charSet5 = locale2.getExtensionKeys();
        java.util.Locale locale9 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        java.lang.String str11 = locale9.getLanguage();
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.util.Locale locale14 = locale13.stripExtensions();
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale13);
        boolean boolean16 = locale13.hasExtensions();
        java.util.Set<java.lang.String> strSet17 = locale13.getUnicodeLocaleKeys();
        java.lang.String str18 = locale9.getDisplayCountry(locale13);
        java.util.Locale.Category category19 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale20 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category19, locale20);
        java.lang.String str22 = locale13.getDisplayScript(locale20);
        java.lang.String str23 = locale20.getLanguage();
        java.util.Set<java.lang.Character> charSet24 = locale20.getExtensionKeys();
        java.lang.String str25 = locale2.getDisplayCountry(locale20);
        java.lang.String str26 = locale2.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charSet5);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!ih" + "'", str11, "!ih");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "99.00:00:0" + "'", str15, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str18, "P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.FORMAT + "'", category19.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "en" + "'", str23, "en");
        org.junit.Assert.assertNotNull(charSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Germany" + "'", str25, "Germany");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "German (Germany)" + "'", str26, "German (Germany)");
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("0:00:00.104", "8", "#####################################################################################################################", 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.104" + "'", str4, "0:00:00.104");
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("de", "testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", 10);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", "p0y0m0dt0h0m0.000s", (int) (short) 100);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "P0Y000DT00000.09010hiP0Y000DT00000.09010!P0Y000DT00000.09010FRAFRAFRAFRAFRAFRAFRAFRAFRAFRAFRAFRA", 0, 336);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("P0Y000DT00000.01925", "P0Y0M0DT0H0M0.052S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.01925" + "'", str2, "P0Y000DT00000.01925");
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("IM 0 SRUO", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("de_dede_dede_dedeng", "P-1Y11M30DT23H59M59.999S0:00:00.000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0:00:00.010", "uuuuuuuuuuuuuzh_CN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...a)FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)", "P0Y0M0DT0H0M0.020S", "\u6cd5\u6587\u6cd5\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6cd5\u6cd5a)FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str3, "\u6cd5\u6cd5\u6cd5a)FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)");
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        java.lang.String[] strArray4 = new java.lang.String[] { "0e_zh_tw (p0y0-10dt07430-10.0343599900,0 day4 0 0our4 0 0inute04 0 econd)", "00DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.09015", "p0y000dt00000.0230" };
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo #h yi yo za zh zu", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "China");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0e_zh_tw (p0y0-10dt07430-10.0343599900,0 day4 0 0our4 0 0inute04 0 econd)China00DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.09015Chinap0y000dt00000.0230" + "'", str7, "0e_zh_tw (p0y0-10dt07430-10.0343599900,0 day4 0 0our4 0 0inute04 0 econd)China00DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.09015Chinap0y000dt00000.0230");
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("Germany", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u6cd5\u6587\u6cd5\u56fd)", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray0, '4', (int) 'a', (int) '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray0, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo xh yi yo za zh zu" + "'", str6, "aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo xh yi yo za zh zu");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aaabaeafakamanarasavayazbabebgbhbibmbnbobrbscacechcocrcscucvcydadedvdzeeeleneoeseteufafffifjfofrfygagdglgngugvhahehihohrhthuhyhziaidieigiiikinioisitiuiwjajijvkakgkikjkkklkmknkokrkskukvkwkylalblglilnloltlulvmgmhmimkmlmnmomrmsmtmynanbndnengnlnnnonrnvnyocojomorospapiplpsptqurmrnrorurwsascsdsesgsiskslsmsnsosqsrssstsusvswtatetgthtitktltntotrtstttwtyugukuruzvevivowawoxhyiyozazhzu" + "'", str7, "aaabaeafakamanarasavayazbabebgbhbibmbnbobrbscacechcocrcscucvcydadedvdzeeeleneoeseteufafffifjfofrfygagdglgngugvhahehihohrhthuhyhziaidieigiiikinioisitiuiwjajijvkakgkikjkkklkmknkokrkskukvkwkylalblglilnloltlulvmgmhmimkmlmnmomrmsmtmynanbndnengnlnnnonrnvnyocojomorospapiplpsptqurmrnrorurwsascsdsesgsiskslsmsnsosqsrssstsusvswtatetgthtitktltntotrtstttwtyugukuruzvevivowawoxhyiyozazhzu");
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                                                                                                     !i0 (ZHO)", "!I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                     !i0 (ZHO)" + "'", str2, "                                                                                                                     !i0 (ZHO)");
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("001.00:00:0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "001.00:00:0" + "'", str1, "001.00:00:0");
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("UN00UNUN_0_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0P0Y0M0DT0H0M0.020S", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!IHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("Heure de Greenwich", 102);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Heure de Greenwich" + "'", str2, "Heure de Greenwich");
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("0e-0:00:00.017");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("00DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.09015");
        java.util.TimeZone.setDefault(timeZone1);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        java.util.Locale locale2 = new java.util.Locale("44444444444444444444444444444", "0 days 0 hours 0 minutes 0 seco");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.lang.String str4 = locale2.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale2.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for 44444444444444444444444444444");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "44444444444444444444444444444_0 DAYS 0 HOURS 0 MINUTES 0 SECO");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECO" + "'", str4, "0 DAYS 0 HOURS 0 MINUTES 0 SECO");
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        int int2 = timeZone1.getRawOffset();
        java.lang.String str3 = timeZone1.getID();
        java.time.ZoneId zoneId4 = timeZone1.toZoneId();
        int int6 = timeZone1.getOffset((long) (byte) 0);
        boolean boolean7 = timeZone1.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GMT" + "'", str3, "GMT");
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("de_DE", "P0Y0M0DT0H0M0.090S0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 ho", (int) (short) 0);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)", strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "P0Y0M0DT0H0M0.041S", 19, 9);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '#');
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.split("EN-GB", 'x');
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray16);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("\u4e2d\u56fd", strArray6, strArray16);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "de_DE" + "'", str13, "de_DE");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u56fd" + "'", str18, "\u4e2d\u56fd");
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("hi!", '4');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("4444444444444444444444444444444444444444444444444444", strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("Chine0e", "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray5, strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("eng", "deuuuuuuuuuuuuuuuu");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("           HI!", strArray9, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ng" + "'", str14, "ng");
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0 days 0 hours 0 minutes 0 seconds");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "zh", 153, 117);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("aaxabxaexafxakxamxanxarxasxavxayxazxbaxbexbgxbhxbixbmxbnxboxbrxbsxcaxcexchxcoxcrxcsxcxcvxcyxdaxdexdvxdzxeexelxenxeoxesxetxexfaxffxfixfjxfoxfrxfyxgaxgdxglxgnxgxgvxhaxhexhixhoxhrxhtxhxhyxhzxiaxidxiexigxiixikxinxioxisxitxixiwxjaxjixjvxkaxkgxkixkjxkkxklxkmxknxkoxkrxksxkxkvxkwxkyxlaxlbxlgxlixlnxloxltxlxlvxmgxmhxmixmkxmlxmnxmoxmrxmsxmtxmyxnaxnbxndxnexngxnlxnnxnoxnrxnvxnyxocxojxomxorxosxpaxpixplxpsxptxqxrmxrnxroxrxrwxsaxscxsdxsexsgxsixskxslxsmxsnxsoxsqxsrxssxstxsxsvxswxtaxtextgxthxtixtkxtlxtnxtoxtrxtsxttxtwxtyxgxkxrxzxvexvixvoxwaxwoxxhxyixyoxzaxzhxz");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Japan" + "'", str2, "Japan");
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("p-1Y11M30DT23H59M59.991S", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p-1Y11M30DT23H59M59.991S" + "'", str2, "p-1Y11M30DT23H59M59.991S");
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("00dt00000.090153HIp0y000dt00000.090153!p0y000dt00000.090153", "...ch0eure 0e Gr...", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("en-GB");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.addUnicodeLocaleAttribute("United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: United Kingdom [at index 0]");
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
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("china           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "china          " + "'", str1, "china          ");
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "               zh               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("P-1Y11M30DT23H59M59.964S", "4P404Y404M404DT404H404M404.40904Shi4P404Y404M404DT404H404M404.40904S4!4P404Y404M404DT404H404M404.40904S4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\u6cd5\u6587\u6cd5\u56fd))", 'x');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "S020.0M00TD0M0Y0P");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "s020.0M00TD0M0Y0P" + "'", str1, "s020.0M00TD0M0Y0P");
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale3 = new java.util.Locale("\u4e2d\u6587");
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("P0Y0M0DT0H0M0.034S");
        java.lang.String str7 = locale3.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.lang.String str10 = locale8.getExtension('a');
        java.lang.String str11 = locale6.getDisplayName(locale8);
        java.lang.String str12 = locale8.getLanguage();
        java.lang.String str13 = locale8.getCountry();
        java.lang.String str14 = locale8.getLanguage();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "de" + "'", str12, "de");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DE" + "'", str13, "DE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "de" + "'", str14, "de");
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HI!HI!ihHI!HI!HIHI!HI!HI!ihHI!HI!HIHI!HI!HI!ihHI!HI!HIHI!HI!HI!ihHI!HI!HIHI!HI!HI!ihHI!HI!HIHI!HI!HI!ihHI!HI!HIHI!HI!HI!ihHI!HI!HIHI!HI!HI!ihHI!HI!HIHI!HI!HI!ihHI!HI!HIHI!HI!HI!ihHI!HI!HIHI!HI!HI!ihHI!HI!HI", "ine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "P0Y0-10DT07430-10.0323599998");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!I0");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        char[] charArray15 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!IH", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0 seconds", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0 seconds", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0:00:00.097", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "p-1y11m30dt23h59m59.979s", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\u671d\u9c9c\u6587", charArray15);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                       danac                        ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        int int6 = timeZone5.getRawOffset();
        java.lang.String str7 = timeZone5.getID();
        java.time.ZoneId zoneId8 = timeZone5.toZoneId();
        java.lang.String str9 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 1L, "\u6cd5\u6587\u6cd5\u56fd)", false, timeZone5);
        java.util.TimeZone.setDefault(timeZone5);
        int int11 = timeZone5.getRawOffset();
        int int12 = timeZone5.getRawOffset();
        java.util.Locale locale16 = java.util.Locale.ROOT;
        java.util.Locale locale19 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.lang.String str20 = locale16.getDisplayCountry(locale19);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.upperCase("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", locale16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = timeZone5.getDisplayName(true, (int) '4', locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GMT" + "'", str7, "GMT");
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str9, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals(locale19.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str21, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Engli0h(Unite0120tate0)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("P0Y0M0DT0H0M0.014Sxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.014Sxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str1, "P0Y0M0DT0H0M0.014Sxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.clear();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!44444444444444444444444444444", "0e_zh_tw (p0y0-10aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.034Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanute04 0 econd)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.lang.String str4 = locale1.getDisplayName(locale3);
        java.lang.String str5 = locale3.getLanguage();
        java.util.Set<java.lang.String> strSet6 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale locale10 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet11 = locale10.getExtensionKeys();
        java.lang.String str12 = locale10.getLanguage();
        java.util.Set<java.lang.String> strSet13 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str14 = locale3.getDisplayScript(locale10);
        java.lang.String str15 = locale10.getISO3Language();
        java.lang.String str16 = locale0.getDisplayCountry(locale10);
        java.lang.String str17 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str4, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertNotNull(strSet6);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "!ih" + "'", str12, "!ih");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "!ih" + "'", str15, "!ih");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italy" + "'", str16, "Italy");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.stripAll(strArray0);
        org.junit.Assert.assertNull(strArray1);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("danac", "Germany##############################################################################################################", 47);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
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
        java.util.Locale locale23 = java.util.Locale.getDefault(category0);
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
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("0e_zh_tw (p0y0-10dt07430-10.0343599900,0 day4 0 0our4 0 0inute04 0 econd)China00DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.09015Chinap0y000dt00000.0230", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhi!#######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("chinois (Chine)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "chinois (Chine)" + "'", str1, "chinois (Chine)");
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...c0Hur..Gr...", "!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("gmt                                                                                                                     ", "             ...ch0eure 0e Gr...              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gmt                                                                                                                     " + "'", str2, "gmt                                                                                                                     ");
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aihihtestestestestestest00.034-1aaaaaaaaaaaaaaaaaaGreenwich Mean Time", "'P'yyyy''''d''''m''s.''", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("Un00unun_0 DAY32 0 0OUR32 0 0INUTE032 0 ECONDun000unun", locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fra" + "'", str2, "fra");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UN00UNUN_0 DAY32 0 0OUR32 0 0INUTE032 0 ECONDUN000UNUN" + "'", str3, "UN00UNUN_0 DAY32 0 0OUR32 0 0INUTE032 0 ECONDUN000UNUN");
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        java.util.Locale locale1 = java.util.Locale.ROOT;
        java.util.Locale locale4 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.lang.String str5 = locale1.getDisplayCountry(locale4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", locale1);
        java.lang.String str7 = locale1.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale4.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str6, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("p0y0m0dt0h0m0.041s", "aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo #h yi yo za zh zu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo #h yi yo za zh zu" + "'", str2, "aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo #h yi yo za zh zu");
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("0                      ", "       P0Y0M0DT0H0M0.041S       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("t00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "t00" + "'", str1, "t00");
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("I!I!I!I!I!I!I!I!", '4');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!I!I!I!I!I!I!I!" + "'", str3, "I!I!I!I!I!I!I!I!");
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
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
        java.lang.String str17 = locale12.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = locale12.getUnicodeLocaleType("Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "English" + "'", str17, "English");
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ip0y0m0dt0h0m0.090s", "4P404Y4040404DT40404040404.4090493hi4P404Y4040404DT40404040404.40904934!4P404Y4040404DT40404040404.40904934");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ip0y0m0dt0h0m0.090s" + "'", str2, "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ip0y0m0dt0h0m0.090s");
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
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
        java.util.Set<java.lang.Character> charSet16 = locale14.getExtensionKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
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
        org.junit.Assert.assertNotNull(charSet16);
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("uuuuuuuuuuuuuzh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuzh_CN" + "'", str1, "uuuuuuuuuuuuuzh_CN");
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0:00:00.017", 102, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.017xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str3, "0:00:00.017xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        timeZone13.setID("zh");
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone("");
        int int20 = timeZone19.getRawOffset();
        java.lang.String str21 = timeZone19.getID();
        int int22 = timeZone19.getRawOffset();
        timeZone19.setID("#####################################################################################################################");
        boolean boolean25 = timeZone13.hasSameRules(timeZone19);
        int int27 = timeZone19.getOffset((long) 93);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "GMT" + "'", str21, "GMT");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("'UpU'UYYYYU'UyU'UmU'UmU'UDU'UdtU'UhU'UhU'UMU'UmU'USU.UsU'Us", "aaaaaaaaaaaaaa... 0 SECOND)aaaaaaaaaaaaaa", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("M0.019S                                             ", "I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!", "                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "M0.019S                                             " + "'", str3, "M0.019S                                             ");
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                     !I0", 58, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                     !I0" + "'", str3, "                                                                                                                     !I0");
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "NG");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        java.util.Locale locale2 = new java.util.Locale("                                                                                                                     !I0", "zho");
        java.lang.String str3 = locale2.getLanguage();
        org.junit.Assert.assertEquals(locale2.toString(), "                                                                                                                     !i0_ZHO");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                     !i0" + "'", str3, "                                                                                                                     !i0");
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0:00:00.00", 31, 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 37);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.037S" + "'", str1, "P0Y0M0DT0H0M0.037S");
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("CN", 102, "chinois");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chinoischinoischinoischinoischinoischinoischinoischinoischinoischinoischinoischinoischinoischinoischCN" + "'", str3, "chinoischinoischinoischinoischinoischinoischinoischinoischinoischinoischinoischinoischinoischinoischCN");
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("'UpU'UYYYYU'UyU'UmU'UmU'UDU'UdtU'UhU'UhU'UMU'UmU'USU.UsU'Us");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'UpU'UYYYYU'UyU'UmU'UmU'UDU'UdtU'UhU'UhU'UMU'UmU'USU.UsU'Us" + "'", str1, "'UpU'UYYYYU'UyU'UmU'UmU'UDU'UdtU'UhU'UhU'UMU'UmU'USU.UsU'Us");
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("p0y0m0dt0h0m0.034s", locale3);
        java.lang.String str5 = locale3.getDisplayLanguage();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("p-1Y11M30DT23H59M59.975S", locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str4, "P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "p-1y11m30dt23h59m59.975s" + "'", str6, "p-1y11m30dt23h59m59.975s");
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "Africa/AbidjanAfrica/AccraAfrica/BamakoAfrica/BanjulAfrica/BissauAfrica/CasablancaAfrica/ConakryAfrica/DakarAfrica/El_AaiunAfrica/FreetownAfrica/LomeAfrica/MonroviaAfrica/NouakchottAfrica/OuagadougouAfrica/Sao_TomeAfrica/TimbuktuAmerica/DanmarkshavnAntarctica/TrollAtlantic/CanaryAtlantic/FaeroeAtlantic/FaroeAtlantic/MadeiraAtlantic/ReykjavikAtlantic/St_HelenaEireEtc/GMTEtc/GMT+Etc/GMT-Etc/GMTEtc/GreenwichEtc/UCTEtc/UTCEtc/UniversalEtc/ZuluEurope/BelfastEurope/DublinEurope/GuernseyEurope/Isle_of_ManEurope/JerseyEurope/LisbonEurope/LondonGBGB-EireGMTGMTGreenwichIcelandPortugalUCTUTCUniversalWETZulu", 0, 153);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaap0y000dt00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
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
        java.util.Locale.Builder builder11 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.removeUnicodeLocaleAttribute("0:00:00.024");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 0:00:00.024 [at index 0]");
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
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("uNITEDSTATES", 98, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("7430-10.0903599686743ip0y0-10dt07430-10.0903599686!p0y0-10dt07430-10.0903599686");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "7430-10.0903599686743ip0y0-10dt07430-10.0903599686!p0y0-10dt07430-10.0903599686" + "'", str1, "7430-10.0903599686743ip0y0-10dt07430-10.0903599686!p0y0-10dt07430-10.0903599686");
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("'P'yyyy'Y'M'M'd'DT'H'H'ZH_tw'P'yyyy'Y'M'M'd'DT'H'H'm", "", "P0Y0M0DT0H0M0.013S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'H'ZH_tw'P'yyyy'Y'M'M'd'DT'H'H'm" + "'", str3, "'P'yyyy'Y'M'M'd'DT'H'H'ZH_tw'P'yyyy'Y'M'M'd'DT'H'H'm");
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "tes)aenglish (united st");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        java.util.Locale.Builder builder10 = builder7.setExtension('x', "");
        java.util.Locale locale11 = builder7.build();
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.util.Set<java.lang.String> strSet13 = locale11.getUnicodeLocaleKeys();
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str16 = locale14.getDisplayLanguage();
        java.lang.String str17 = locale14.getISO3Country();
        java.lang.String str18 = locale11.getDisplayLanguage(locale14);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "_CN");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CHN" + "'", str17, "CHN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "0:00:00.017", 52, 335);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.017" + "'", str4, "0:00:00.017");
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0:00:00.120");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "g35999t");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND", 14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND" + "'", str2, "de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND");
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        java.time.ZoneId zoneId16 = timeZone13.toZoneId();
        timeZone13.setID("P0Y0M0DT0H0M0.001S");
        java.util.TimeZone.setDefault(timeZone13);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(zoneId16);
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                     !I0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!I0" + "'", str1, "!I0");
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                        ", "Uen-CAUUUUUUUUUUUUUUUUUUUUUUU0:00:00.097UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "P0Y0M0DT0H0M0.003S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                        " + "'", str3, "                                                                                                                        ");
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0M0DT0H0M0.001S");
        timeZone1.setID("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = timeZone1.getDisplayName(locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4" + "'", str1, "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("un0", "44p0y0m0dt0h0m0.090s4444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        char[] charArray3 = new char[] {};
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "deuuuuuuuuuuuuuuuu", charArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsAny("0 days 0 hours 0 minutes 0 seconds", charArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "M0.019S                                             ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "de_DE" + "'", str1, "de_DE");
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("44444444444444444444444444444444444444 HI!", "P0Y0M0DT0H0M0.014Sxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("OURS 0 MI");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaaaaaaaa... 0 SECOND)aaaaaaaaaaaaaa", "g35999t", 0, 336);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "g35999t" + "'", str4, "g35999t");
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale.Builder builder8 = builder4.setLanguageTag("danac");
        java.util.Locale.Builder builder9 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setVariant("                zh");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant:                 zh [at index 0]");
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
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("0 days 0 hours 0 minutes 0 seco", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!ih!ih!...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clear();
        java.util.Locale.Builder builder9 = builder3.setLanguageTag("tes");
        java.util.Locale.Builder builder10 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ???????? (??????) [at index 0]");
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
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 6, (long) 119);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.113S" + "'", str2, "P0Y0M0DT0H0M0.113S");
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
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
        java.util.Locale locale12 = builder11.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder11.addUnicodeLocaleAttribute("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa [at index 0]");
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
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "tes");
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        java.util.Locale locale4 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.lang.String str6 = locale4.getLanguage();
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale8);
        boolean boolean11 = locale8.hasExtensions();
        java.util.Set<java.lang.String> strSet12 = locale8.getUnicodeLocaleKeys();
        java.lang.String str13 = locale4.getDisplayCountry(locale8);
        java.util.Locale.Category category14 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale15 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category14, locale15);
        java.lang.String str17 = locale8.getDisplayScript(locale15);
        java.lang.String str18 = locale15.getISO3Country();
        java.util.Locale.Builder builder19 = new java.util.Locale.Builder();
        java.util.Locale locale20 = builder19.build();
        java.util.Locale.setDefault(locale20);
        java.util.Locale locale22 = java.util.Locale.CHINA;
        java.util.Locale locale23 = java.util.Locale.PRC;
        java.lang.String str24 = locale22.getDisplayLanguage(locale23);
        java.lang.String str25 = locale20.getDisplayLanguage(locale23);
        java.lang.String str26 = locale23.getISO3Language();
        java.util.Locale locale29 = new java.util.Locale("!I0", "P0Y0M0DT0H0M0.034S");
        java.lang.String str30 = locale23.getDisplayVariant(locale29);
        java.util.Locale.Builder builder31 = new java.util.Locale.Builder();
        java.util.Locale locale32 = builder31.build();
        java.util.Locale locale33 = builder31.build();
        java.util.Locale.Builder builder34 = builder31.clear();
        java.util.Locale.Builder builder35 = builder34.clearExtensions();
        java.util.Locale.Builder builder36 = builder35.clear();
        java.util.Locale locale37 = builder36.build();
        java.lang.String str38 = locale23.getDisplayScript(locale37);
        java.lang.String str39 = locale23.getDisplayScript();
        java.lang.String str40 = locale15.getDisplayScript(locale23);
        java.util.Locale locale41 = locale23.stripExtensions();
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleAttributes();
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.lowerCase("JA", locale41);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!ih" + "'", str6, "!ih");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "99.00:00:0" + "'", str10, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str13, "P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.FORMAT + "'", category14.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CAN" + "'", str18, "CAN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u4e2d\u6587" + "'", str24, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zho" + "'", str26, "zho");
        org.junit.Assert.assertEquals(locale29.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ja" + "'", str43, "ja");
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0M0DT0H0M0.001S", "!IH");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih", 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", strArray3, strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'u');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str7, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!ih" + "'", str8, "!ih");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "!ih" + "'", str9, "!ih");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "!ih" + "'", str12, "!ih");
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                         ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "Royaume-Uni", (java.lang.CharSequence) "English (United Kingdom)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "ENGLISH (UNITED STATES)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!IH#####################################################################################################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!IH#####################################################################################################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!IH#####################################################################################################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!IH#####################################################################################################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!IH#####################################################################################################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!IH#####################################################################################################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!IH#####################################################################################################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!IH#####################################################################################################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!IH#####################################################################################################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("'m's.s'p0y0m0dt0h0m0.042s", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'m'..." + "'", str2, "'m'...");
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "               ZH_TW (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "!IH#####################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("Heure de Greenwich", "p0y0m0dt0h0m0.041s");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Heure de Greenwic" + "'", str2, "Heure de Greenwic");
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!HI", "ine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("0:00:00.000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.000" + "'", str1, "0:00:00.000");
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("ZH_TW", "tes)aenglish (united st44444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        java.util.Locale locale2 = new java.util.Locale("   TE0    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaGreenwich Mean Time");
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale8 = builder6.build();
        java.util.Locale locale9 = builder6.build();
        java.lang.String str11 = locale9.getExtension('a');
        java.lang.String str12 = locale9.getDisplayName();
        java.lang.String str13 = locale2.getDisplayVariant(locale9);
        org.junit.Assert.assertEquals(locale2.toString(), "   te0    _AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP0Y000DT00000.034-1AAAAAAAAAAAAAAAAAAGREENWICH MEAN TIME");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category4, locale5);
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        java.lang.String str8 = locale5.getDisplayCountry();
        java.lang.String str9 = locale5.getISO3Country();
        java.lang.String str10 = locale3.getDisplayScript(locale5);
        java.util.Set<java.lang.Character> charSet11 = locale5.getExtensionKeys();
        java.lang.String str12 = locale5.getScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                 P0Y0M0DT0H0M0.121S", 335);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 P0Y0M0DT0H0M0.121S" + "'", str2, "                 P0Y0M0DT0H0M0.121S");
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "cHINESE      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("zh_44444444444444444444444444444zh_      ", "un00unun_0 DAY5 0 0OUR5 0 0INUTE005 0 ECONDun000unun");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_44444444444444444444444444444zh_      " + "'", str2, "zh_44444444444444444444444444444zh_      ");
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...c0Hur..Gr...", 52, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...c0Hur..Gr...xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str3, "...c0Hur..Gr...xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("P0Y0M0DT0H0M0.068S", "000000000000000000000000000000000000000000000000000000000000000743I!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000000000000000000000000000000000000000000000000000000000000000743I!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!I" + "'", str2, "000000000000000000000000000000000000000000000000000000000000000743I!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!I");
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("P-1Y11030DT23059059.99914", "                                                                                     0:00:00.000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11030DT23059059.99914" + "'", str2, "P-1Y11030DT23059059.99914");
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        java.util.Locale locale3 = new java.util.Locale("P0Y0M0DT0H0M0.019S", "               zh               ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("P0Y0M0DT0H0M0.068S", locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "p0y0m0dt0h0m0.019s_               ZH               ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "p0y0m0dt0h0m0.068s" + "'", str4, "p0y0m0dt0h0m0.068s");
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\347\uc911\uad6d\uc5b4\uc911\uad6d)", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u4e2d\u56fd", "0:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.99");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("####################################################################################################################", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "Japan");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich", "ENGENGENGENGENGENGENGENGENGENGENGENGENGzh_twt00t00t00t00t0ENGENGENGENGENGENGENGENGENGENGENGENGENG");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich" + "'", str2, "eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich");
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("########chinese(china)#########", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("P0Y0M0DT0H0M0.037S", 58);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    P0Y0M0DT0H0M0.037S                    " + "'", str2, "                    P0Y0M0DT0H0M0.037S                    ");
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...ch0eure 0e Gr...", "ENGLISH (UNITED STATES)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        int int6 = timeZone5.getRawOffset();
        int int7 = timeZone5.getRawOffset();
        timeZone5.setID("0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
        java.lang.String str10 = timeZone5.getID();
        java.util.TimeZone.setDefault(timeZone5);
        java.lang.String str12 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 31, (long) 224, "I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!", false, timeZone5);
        java.util.Date date13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = timeZone5.inDaylightTime(date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon" + "'", str10, "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "I!Chine0ich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!" + "'", str12, "I!Chine0ich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!");
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("English", (double) (short) 1);
        double double3 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                4P404Y4040404DT40404040404.4090410hi4P404Y4040404DT40404040404.40904104!4P404Y4040404DT40404040404.40904104                        ", (java.lang.CharSequence) "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                4P404Y4040404DT40404040404.4090410hi4P404Y4040404DT40404040404.40904104!4P404Y4040404DT40404040404.40904104                        " + "'", charSequence2, "                4P404Y4040404DT40404040404.4090410hi4P404Y4040404DT40404040404.40904104!4P404Y4040404DT40404040404.40904104                        ");
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\u6cd5\u6587\u6cd5\u56fd))");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u56fd\u6cd5\u6587\u6cd5,s430.0m0h0td0m0y0p( hi!" + "'", str1, "\u56fd\u6cd5\u6587\u6cd5,s430.0m0h0td0m0y0p( hi!");
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("x");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "x" + "'", str1, "x");
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.lang.String str2 = locale0.getDisplayLanguage(locale1);
        java.lang.String str3 = locale0.getDisplayScript();
        java.util.Set<java.lang.Character> charSet4 = locale0.getExtensionKeys();
        java.lang.String str5 = locale0.getDisplayScript();
        java.lang.String str6 = locale0.toLanguageTag();
        java.lang.String str7 = locale0.getISO3Language();
        java.util.Set<java.lang.String> strSet8 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587" + "'", str2, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zho" + "'", str7, "zho");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("P0Y0M0DT0H0M0.003S", 14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0." + "'", str2, "P0Y0M0DT0H0M0.");
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        int int17 = timeZone13.getOffset((long) (short) 10);
        int int18 = timeZone13.getRawOffset();
        timeZone13.setID("OURS 0 MI");
        java.util.TimeZone.setDefault(timeZone13);
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
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("p0y0m0dt0h0m0.020s", "zh-CN");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p0y0m0dt00m0.020s" + "'", str3, "p0y0m0dt00m0.020s");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        java.util.Locale.Builder builder10 = builder7.setExtension('x', "");
        java.util.Locale.Builder builder12 = builder7.setLanguageTag("ih");
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.lang.String str14 = locale13.getDisplayVariant();
        java.lang.String str15 = locale13.getVariant();
        java.util.Locale.setDefault(locale13);
        java.util.Locale.Builder builder17 = builder12.setLocale(locale13);
        java.util.Locale.Builder builder18 = builder12.clear();
        java.util.Locale.Builder builder20 = builder12.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder22 = builder20.setScript("Japan");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Japan [at index 0]");
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
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("                                                p000000t0h000.0900hip000000t0h000.0900!p000000t0h000.0900                                                 ", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=                                                p000000t0h000.0900hip000000t0h000.0900!p000000t0h000.0900                                                 ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("WWWWWWWWWW", "                              ", 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("P0Y0M0DT0H0M0.004", 16, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.004" + "'", str3, "P0Y0M0DT0H0M0.004");
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HI!44444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("p0y0m0dt00m0.020s", "P-1Y11M30DT23H59M59.975S", 13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020s" + "'", str3, "p0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020s");
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        java.util.Locale locale3 = new java.util.Locale("P0Y0M0DT0H0M0.001S", "hi!", "0:00:00.99");
        java.lang.String str5 = locale3.getExtension('u');
        java.lang.Object obj6 = locale3.clone();
        org.junit.Assert.assertEquals(locale3.toString(), "p0y0m0dt0h0m0.001s_HI!_0:00:00.99");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "p0y0m0dt0h0m0.001s_HI!_0:00:00.99");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "p0y0m0dt0h0m0.001s_HI!_0:00:00.99");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "p0y0m0dt0h0m0.001s_HI!_0:00:00.99");
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("               zh               ", "Chine0e", "##############################################################################################################################################################################################################P0Y0M0DT0H0M0.121S");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale3);
        java.lang.String str5 = locale1.getDisplayVariant(locale3);
        java.util.Set<java.lang.Character> charSet6 = locale3.getExtensionKeys();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444444444", locale3);
        java.util.Locale.setDefault(locale3);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "44444444444444444444444444444" + "'", str7, "44444444444444444444444444444");
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0 seconds", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        java.time.ZoneId zoneId16 = timeZone13.toZoneId();
        boolean boolean17 = timeZone13.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("P-1Y11M30DT23H59M59.995S", "                                                                                                                     !i0", "P-1Y11M30DT23H59M59.947S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11M30DT23H59M59.995S" + "'", str3, "P-1Y11M30DT23H59M59.995S");
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS", "                                 0 DAY0 0 0OUR0 0 0INUTE00 0 ECOND                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS" + "'", str2, "_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS_0#DAYS#0#HOURS#0#MINUTES#0#SECONDS");
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Engli0hP0Y0-10DT07430-10.1213599678(Unite0P0Y0-10DT07430-10.1213599678120tate0)", "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        char[] charArray8 = new char[] { '4', '#' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0 days 0 hours 0 minutes 0 seconds", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "'P'yyyy''''d''''m''s.''", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Chine", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Engli0h (Unite0 120tate0)", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("aaxabxaexafxakxamxanxarxasxavxayxazxbaxbexbgxbhxbixbmxbnxboxbrxbsxcaxcexchxcoxcrxcsxcuxcvxcyxdaxdexdvxdzxeexelxenxeoxesxetxeuxfaxffxfixfjxfoxfrxfyxgaxgdxglxgnxguxgvxhaxhexhixhoxhrxhtxhuxhyxhzxiaxidxiexigxiixikxinxioxisxitxiuxiwxjaxjixjvxkaxkgxkixkjxkkxklxkmxknxkoxkrxksxkuxkvxkwxkyxlaxlbxlgxlixlnxloxltxluxlvxmgxmhxmixmkxmlxmnxmoxmrxmsxmtxmyxnaxnbxndxnexngxnlxnnxnoxnrxnvxnyxocxojxomxorxosxpaxpixplxpsxptxquxrmxrnxroxruxrwxsaxscxsdxsexsgxsixskxslxsmxsnxsoxsqxsrxssxstxsuxsvxswxtaxtextgxthxtixtkxtlxtnxtoxtrxtsxttxtwxtyxugxukxurxuzxvexvixvoxwaxwoxxhxyixyoxzaxzhxzu", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!I", "danac");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!I" + "'", str2, "!I");
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        java.util.Locale locale2 = new java.util.Locale("!I0", "P0Y0M0DT0H0M0.034S");
        boolean boolean3 = locale2.hasExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("000000000000000000000000000000000000000000000000000000000000000743I!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!II!I!I!ihI!I!I", 336);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("0:00:00.119", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9" + "'", str2, "9");
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                                                                                            P-1Y11M30DT23H59M59.999                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("Heure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de Greenwich");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.lang.Object obj3 = timeZone1.clone();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        java.util.Locale locale3 = new java.util.Locale("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", "#####CAN", "un00unun_0 DAY32 0 0OUR32 0 0INUTE032 0 ECONDun000unun");
        org.junit.Assert.assertEquals(locale3.toString(), "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'_#####CAN_un00unun_0 DAY32 0 0OUR32 0 0INUTE032 0 ECONDun000unun");
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
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
        java.time.ZoneId zoneId20 = timeZone6.toZoneId();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zoneId19);
        org.junit.Assert.assertNotNull(zoneId20);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("P0Y0M0DT0H0M0.042S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.042" + "'", str1, "P0Y0M0DT0H0M0.042");
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0M0DT0H0M0.020S", "WWWWWWWWWW");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("Chinese (China)FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("zh_tw", strArray3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("P-1Y11030DT23059059.998120", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11030DT23059059.998120" + "'", str2, "P-1Y11030DT23059059.998120");
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                        ", 8, 153);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("Africa/AbidjanAfrica/AccraAfrica/BamakoAfrica/BanjulAfrica/BissauAfrica/CasablancaAfrica/ConakryAfrica/DakarAfrica/El_AaiunAfrica/FreetownAfrica/LomeAfrica/MonroviaAfrica/NouakchottAfrica/OuagadougouAfrica/Sao_TomeAfrica/TimbuktuAmerica/DanmarkshavnAntarctica/TrollAtlantic/CanaryAtlantic/FaeroeAtlantic/FaroeAtlantic/MadeiraAtlantic/ReykjavikAtlantic/St_HelenaEireEtc/GMTEtc/GMT+0Etc/GMT-0Etc/GMT0Etc/GreenwichEtc/UCTEtc/UTCEtc/UniversalEtc/ZuluEurope/BelfastEurope/DublinEurope/GuernseyEurope/Isle_of_ManEurope/JerseyEurope/LisbonEurope/LondonGBGB-EireGMTGMT0GreenwichIcelandPortugalUCTUTCUniversalWETZulu", "                    HI!                                      P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", "\u82f1\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 9, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\uad6d\uc911\uc5b4\uad6d\uc911", "\u671d\u9c9c\u6587");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad(" ...", 19);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ...               " + "'", str2, " ...               ");
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\u6cd5\u6cd5\u6cd5a)FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)", "        zh", "0:00:00.024");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6cd5\u6cd5a)FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str3, "\u6cd5\u6cd5\u6cd5a)FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)");
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("italy", "P0Y0M0DT0H0M0.004S", 14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004Sitaly" + "'", str3, "italyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004Sitaly");
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
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
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str16 = locale12.getDisplayScript(locale14);
        java.lang.String str17 = locale14.getISO3Language();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zho" + "'", str17, "zho");
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        java.util.Locale.Builder builder10 = builder7.setExtension('x', "");
        java.util.Locale.Builder builder12 = builder10.setLanguageTag("en");
        java.util.Locale.Builder builder13 = builder10.clear();
        java.util.Locale.Builder builder14 = builder13.clear();
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
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("p0y0m0dt0h0m0.041s", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p0y0m0dt0h0m0.041s" + "'", str3, "p0y0m0dt0h0m0.041s");
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("0:00:00.000", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'u');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("P-1Y11M30DT23H59M59.999S", (java.lang.Object[]) strArray3);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0:00.", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                        ", "un0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        java.util.Locale locale1 = new java.util.Locale("P0Y0M0DT0H0M0.090S");
        java.util.Locale locale4 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.lang.String str6 = locale4.getDisplayName(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayLanguage(locale5);
        java.util.Locale locale11 = new java.util.Locale("Engli0h (Unite0 120tate0)", "P0Y000DT00000.00120");
        java.lang.String str12 = locale1.getDisplayName(locale11);
        java.lang.String str13 = locale11.getDisplayCountry();
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = locale11.getDisplayLanguage(locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "p0y0m0dt0h0m0.090s");
        org.junit.Assert.assertEquals(locale4.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str6, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh" + "'", str7, "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "p0y0m0dt0h0m0.090s" + "'", str8, "p0y0m0dt0h0m0.090s");
        org.junit.Assert.assertEquals(locale11.toString(), "engli0h (unite0 120tate0)_P0Y000DT00000.00120");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "p0y0m0dt0h0m0.090s" + "'", str12, "p0y0m0dt0h0m0.090s");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P0Y000DT00000.00120" + "'", str13, "P0Y000DT00000.00120");
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("TW", "en");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category5, locale6);
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.util.Locale.setDefault(category5, locale8);
        java.util.Locale locale11 = java.util.Locale.CHINA;
        java.util.Locale locale12 = locale11.stripExtensions();
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale11);
        java.util.Locale.setDefault(category5, locale11);
        java.util.Locale.Category category15 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale16 = java.util.Locale.UK;
        java.util.Locale.setDefault(category15, locale16);
        java.util.Locale locale18 = java.util.Locale.getDefault(category15);
        java.util.Locale locale19 = java.util.Locale.getDefault(category15);
        java.util.Locale.setDefault(category5, locale19);
        java.util.Locale.setDefault(category0, locale19);
        java.util.Locale locale25 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Locale locale29 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet30 = locale29.getExtensionKeys();
        java.lang.String str31 = locale29.getLanguage();
        java.util.Set<java.lang.String> strSet32 = locale29.getUnicodeLocaleAttributes();
        java.lang.String str33 = locale25.getDisplayScript(locale29);
        java.util.Locale locale34 = java.util.Locale.PRC;
        java.util.Locale locale36 = java.util.Locale.GERMANY;
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale36);
        java.lang.String str38 = locale34.getDisplayVariant(locale36);
        java.lang.String str39 = locale29.getDisplayVariant(locale36);
        java.lang.String str40 = locale19.getDisplayScript(locale29);
        java.lang.String str42 = locale29.getExtension('x');
        java.lang.String str43 = locale29.toLanguageTag();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "99.00:00:0" + "'", str13, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + category15 + "' != '" + java.util.Locale.Category.FORMAT + "'", category15.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "!ih" + "'", str31, "!ih");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str39, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "und" + "'", str43, "und");
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("de", "i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de" + "'", str2, "de");
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale3 = new java.util.Locale("\u4e2d\u6587");
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("P0Y0M0DT0H0M0.034S");
        java.lang.String str7 = locale3.getDisplayName(locale6);
        java.lang.String str8 = locale3.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale3.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for ??");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("444444444444444444444444444444444444444444444444444444444de_DE4444444444444444444444444444444444444444444444444444444444", "                                                                                              dnu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444de_DE4444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444de_DE4444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                 !I0", "Deutschland", (int) 'x');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND", "ENG", "     ...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int10 = timeZone9.getRawOffset();
        java.lang.String str11 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y0M0DT0H0M0.023S", false, timeZone9);
        java.lang.String str12 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) 'x', "CAN", true, timeZone9);
        java.time.ZoneId zoneId13 = timeZone9.toZoneId();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone(zoneId13);
        int int15 = timeZone14.getRawOffset();
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y000DT00000.0230" + "'", str11, "P0Y000DT00000.0230");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CAN" + "'", str12, "CAN");
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0 DAYS 0 HOURS 0 MINUTES 0 SECOND", 14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECOND" + "'", str2, "0 DAYS 0 HOURS 0 MINUTES 0 SECOND");
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "franc", "!ih!ih!...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", "uuuuuuuuuuuuuuuuuuuuuuuuuuuu", 31);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        java.util.Locale locale4 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("0:00:00.119", locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.119" + "'", str6, "0:00:00.119");
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        java.util.Locale locale3 = new java.util.Locale("zh_TW", "P0Y0-10DT07430-10.0343599900", "0 DAYS 0 HOURS 0 MINUTES 0 SECOND");
        java.lang.String str4 = locale3.getDisplayName();
        java.util.Locale locale5 = locale3.stripExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleKeys();
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.lang.String str9 = locale6.getDisplayName(locale8);
        java.lang.String str10 = locale8.getLanguage();
        java.util.Set<java.lang.String> strSet11 = locale8.getUnicodeLocaleAttributes();
        java.util.Locale locale15 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet16 = locale15.getExtensionKeys();
        java.lang.String str17 = locale15.getLanguage();
        java.util.Set<java.lang.String> strSet18 = locale15.getUnicodeLocaleAttributes();
        java.lang.String str19 = locale8.getDisplayScript(locale15);
        java.lang.String str20 = locale15.getISO3Language();
        java.lang.String str21 = locale5.getDisplayCountry(locale15);
        java.lang.String str22 = locale5.getDisplayName();
        java.util.Locale locale23 = locale5.stripExtensions();
        java.util.Locale locale25 = java.util.Locale.UK;
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.upperCase("P0Y0-10DT07430-10.0343599900", locale25);
        java.lang.String str27 = locale5.getDisplayName(locale25);
        java.lang.String str29 = locale5.getExtension('a');
        org.junit.Assert.assertEquals(locale3.toString(), "zh_tw_P0Y0-10DT07430-10.0343599900_0 DAYS 0 HOURS 0 MINUTES 0 SECOND");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)" + "'", str4, "zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_tw_P0Y0-10DT07430-10.0343599900_0 DAYS 0 HOURS 0 MINUTES 0 SECOND");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str9, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh" + "'", str10, "zh");
        org.junit.Assert.assertNotNull(strSet11);
// flaky:         org.junit.Assert.assertEquals(locale15.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "!ih" + "'", str17, "!ih");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "!ih" + "'", str20, "!ih");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "P0Y0-10DT07430-10.0343599900" + "'", str21, "P0Y0-10DT07430-10.0343599900");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)" + "'", str22, "zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_tw_P0Y0-10DT07430-10.0343599900_0 DAYS 0 HOURS 0 MINUTES 0 SECOND");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "P0Y0-10DT07430-10.0343599900" + "'", str26, "P0Y0-10DT07430-10.0343599900");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)" + "'", str27, "zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)");
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder5.setLanguage("und");
        java.util.Locale.Builder builder9 = builder5.setLanguageTag("ih");
        java.util.Locale.Builder builder10 = builder9.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setLanguageTag("##############################################################################################################################################################################################################P0Y0M0DT0H0M0.121S");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ##############################################################################################################################################################################################################P0Y0M0DT0H0M0.121S [at index 0]");
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
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
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
        java.lang.String str15 = locale2.getExtension('a');
        java.lang.String str16 = locale2.getCountry();
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder5.setLanguage("und");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = builder8.build();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        java.util.Locale.Builder builder10 = builder7.setExtension('x', "");
        java.util.Locale.Builder builder12 = builder10.setLanguageTag("en");
        java.util.Locale.Builder builder13 = builder10.clear();
        java.util.Locale.Builder builder15 = builder13.setRegion("de");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder13.setVariant("GMT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: GMT [at index 0]");
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
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        timeZone13.setID("zh");
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone("");
        int int20 = timeZone19.getRawOffset();
        java.lang.String str21 = timeZone19.getID();
        int int22 = timeZone19.getRawOffset();
        timeZone19.setID("#####################################################################################################################");
        boolean boolean25 = timeZone13.hasSameRules(timeZone19);
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone32 = java.util.TimeZone.getTimeZone("");
        java.lang.String str33 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone32);
        boolean boolean34 = timeZone32.observesDaylightTime();
        java.util.TimeZone timeZone40 = java.util.TimeZone.getTimeZone("");
        java.lang.String str41 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone40);
        boolean boolean42 = timeZone32.hasSameRules(timeZone40);
        boolean boolean43 = timeZone26.hasSameRules(timeZone32);
        boolean boolean44 = timeZone32.observesDaylightTime();
        int int45 = timeZone32.getRawOffset();
        boolean boolean46 = timeZone32.observesDaylightTime();
        boolean boolean47 = timeZone19.hasSameRules(timeZone32);
        java.lang.String str50 = timeZone19.getDisplayName(true, 0);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "GMT" + "'", str21, "GMT");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:00");
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "GMT+00:00" + "'", str50, "GMT+00:00");
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                       danac                        ", "\u683c\u6797\u5a01\u6cbb\u6642\u9593       ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("0:00:00.023", "n\347\uc911\uad6d\uc5b4\uc911\uad6d");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.023" + "'", str2, "0:00:00.023");
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
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
        java.util.Locale locale31 = new java.util.Locale("                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", "HI!HI!HI!ihHI!HI!HI");
        java.lang.String str32 = timeZone0.getDisplayName(locale31);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "GMT" + "'", str25, "GMT");
        org.junit.Assert.assertNotNull(zoneId26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str27, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals(locale31.toString(), "                                                p0y0m0dt0h0m0.090ship0y0m0dt0h0m0.090s!p0y0m0dt0h0m0.090s_HI!HI!HI!IHHI!HI!HI");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "GMT+00:00" + "'", str32, "GMT+00:00");
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!IH#####################################################################################################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!IH#####################################################################################################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!IH#####################################################################################################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0P0Y0M0DT0H0M0.020S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "UNITED STATES");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazh_TWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 18, 14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaa");
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 1, " uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!IHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                          " + "'", str1, "                                          ");
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
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
        java.util.Locale locale16 = java.util.Locale.PRC;
        java.util.Locale locale18 = java.util.Locale.GERMANY;
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale18);
        java.lang.String str20 = locale16.getDisplayVariant(locale18);
        java.util.Locale.Category category21 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category21, locale22);
        java.util.Set<java.lang.String> strSet24 = locale22.getUnicodeLocaleKeys();
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet26 = locale25.getUnicodeLocaleKeys();
        java.util.Locale locale27 = java.util.Locale.CHINA;
        java.util.Locale locale28 = locale27.stripExtensions();
        java.lang.String str29 = locale27.getDisplayLanguage();
        java.util.Locale locale30 = java.util.Locale.CHINA;
        java.util.Locale locale31 = locale30.stripExtensions();
        java.util.Locale locale32 = java.util.Locale.FRANCE;
        java.util.Locale locale33 = java.util.Locale.TAIWAN;
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = locale34.getDisplayVariant();
        java.util.Locale locale36 = java.util.Locale.CHINA;
        java.util.Locale locale37 = locale36.stripExtensions();
        java.lang.String str38 = locale36.getDisplayLanguage();
        java.util.Locale locale39 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet40 = locale39.getUnicodeLocaleKeys();
        java.util.Locale locale41 = java.util.Locale.CHINESE;
        java.lang.String str42 = locale39.getDisplayName(locale41);
        java.lang.String str43 = locale41.getCountry();
        java.util.Locale[] localeArray44 = new java.util.Locale[] { locale18, locale22, locale25, locale27, locale30, locale32, locale33, locale34, locale36, locale41 };
        java.util.ArrayList<java.util.Locale> localeList45 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList45, localeArray44);
        java.util.Locale.FilteringMode filteringMode47 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList48 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.util.Locale>) localeList45, filteringMode47);
        java.util.Locale locale52 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet53 = locale52.getExtensionKeys();
        java.lang.String str54 = locale52.getLanguage();
        java.util.Set<java.lang.String> strSet55 = locale52.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strSet55);
        java.util.Locale.FilteringMode filteringMode57 = null;
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet55, filteringMode57);
        java.util.Locale.Category category59 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale60 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category59, locale60);
        java.util.Set<java.lang.String> strSet62 = locale60.getUnicodeLocaleKeys();
        java.lang.String str63 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet62);
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
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + category21 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category21.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale22);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Chinese" + "'", str29, "Chinese");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Chinese" + "'", str38, "Chinese");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str42, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(localeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + filteringMode47 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode47.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList48);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "!ih" + "'", str54, "!ih");
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertTrue("'" + category59 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category59.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale60);
// flaky:         org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertNull(str63);
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "I!I!I!I!I!I!I!I!", "0:00:00.007");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("\u4e2d\u6587!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ip0y0m0dt0h0m0.090s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ip0y0m0dt0h0m0.090s" + "'", str1, "\u4e2d\u6587!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ip0y0m0dt0h0m0.090s");
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        java.util.Locale locale1 = new java.util.Locale("!I0");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "!i0");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "!i0");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                4P404Y4040404DT40404040404.4090410hi4P404Y4040404DT40404040404.40904104!4P404Y4040404DT40404040404.40904104                        ", "ine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                4P404Y4040404DT40404040404.4090410hi4P404Y4040404DT40404040404.40904104!4P404Y4040404DT40404040404.40904104                        " + "'", str2, "                4P404Y4040404DT40404040404.4090410hi4P404Y4040404DT40404040404.40904104!4P404Y4040404DT40404040404.40904104                        ");
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\u4e2d\u6587\u4e2d\u56fd)", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str2, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
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
        java.time.ZoneId zoneId21 = timeZone20.toZoneId();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone(zoneId21);
        java.util.TimeZone timeZone23 = java.util.TimeZone.getTimeZone(zoneId21);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zoneId19);
        org.junit.Assert.assertNotNull(timeZone20);
// flaky:         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertNotNull(timeZone22);
// flaky:         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone23);
// flaky:         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("P-1Y11M30DT23H59M59.928S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P-1Y11M30DT23H59M59.928S" + "'", str1, "P-1Y11M30DT23H59M59.928S");
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Chinese (China)FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)", "_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) 'a');
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("HI!44444444444444444444444444444", '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!", strArray9, strArray12);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("uNITED STATES", '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("     ...", strArray9, strArray16);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("P-1Y11M30DT23H59M59.901S", strArray3, strArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "     ..." + "'", str17, "     ...");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str18, "P-1Y11M30DT23H59M59.901S");
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                p000000t0h000.0900hip000000t0h000.0900!p000000t0h000.0900                                                 ", "aaabaeafakamanarasavayazbabebgbhbibmbnbobrbscacechcocrcscucvcydadedvdzeeeleneoeseteufafffifjfofrfygagdglgngugvhahehihohrhthuhyhziaidieigiiikinioisitiuiwjajijvkakgkikjkkklkmknkokrkskukvkwkylalblglilnloltlulvmgmhmimkmlmnmomrmsmtmynanbndnengnlnnnonrnvnyocojomorospapiplpsptqurmrnrorurwsascsdsesgsiskslsmsnsosqsrssstsusvswtatetgthtitktltntotrtstttwtyugukuruzvevivowawoxhyiyozazhzu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Chinese(China)", 'x');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("7430-10.0903599686743IP0Y0-10DT07430-10.0903599686!P0Y0-10DT07430-10.0903599686", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinese(China)" + "'", str4, "Chinese(China)");
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("en-GB");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = builder6.build();
        java.util.Locale.Builder builder10 = builder6.setLanguage("Franc");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "p0y0m0dt0h0m0.034s", (java.lang.CharSequence) "HI!HIanglais (Royaume-Uni)HI!HI!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "p0y0m0dt0h0m0.034s" + "'", charSequence2, "p0y0m0dt0h0m0.034s");
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "P0Y0M0DT0H0M0.001S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0Y0M0DT0H0M0.001S" + "'", str1, "p0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("xxxxxxxxxxxxxxxxxxxxxxxxxxchinaxxxxxxxxxxxxxxxxxxxxxxxxxx", "343599900");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("stestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "STESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'" + "'", str1, "STESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'");
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!HI!HI!ihHI!HI!HI", "...ch0eure 0e Gr...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("en-CA", "Engli0h(Unite0120tate0)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(98);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "!ih#######");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.clear();
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
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Heure de Greenwich", "aaabaeafakamanarasavayazbabebgbhbibmbnbobrbscacechcocrcscucvcydadedvdzeeeleneoeseteufafffifjfofrfygagdglgngugvhahehihohrhthuhyhziaidieigiiikinioisitiuiwjajijvkakgkikjkkklkmknkokrkskukvkwkylalblglilnloltlulvmgmhmimkmlmnmomrmsmtmynanbndnengnlnnnonrnvnyocojomorospapiplpsptqurmrnrorurwsascsdsesgsiskslsmsnsosqsrssstsusvswtatetgthtitktltntotrtstttwtyugukuruzvevivowawoxhyiyozazhzu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale4 = new java.util.Locale("\u4e2d\u6587");
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.util.Locale locale10 = locale9.stripExtensions();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale9);
        java.util.Locale.Builder builder12 = builder7.setLocale(locale9);
        java.util.Locale.Builder builder14 = builder7.setLanguage("");
        java.util.Locale.Builder builder16 = builder14.setLanguage("");
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale locale18 = builder16.build();
        java.util.Locale.setDefault(category0, locale18);
        java.util.Locale locale20 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale4.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "99.00:00:0" + "'", str11, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "_CN");
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
        char[] charArray12 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("zh", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444zh_tw", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0:00:00.031", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 41 + "'", int14 == 41);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("Rf");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Rf" + "'", str1, "Rf");
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "!i0_ZHO", (java.lang.CharSequence) "GB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) 'a');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("HI!44444444444444444444444444444", '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!", strArray5, strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("uNITED STATES", '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("     ...", strArray5, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "     ..." + "'", str13, "     ...");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale4 = new java.util.Locale("\u4e2d\u6587");
        java.util.Locale.setDefault(category0, locale4);
        java.lang.String str6 = locale4.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale4.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale6);
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.lang.String str11 = locale10.getScript();
        java.util.Locale locale14 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.util.Locale locale15 = java.util.Locale.CHINESE;
        java.lang.String str16 = locale14.getDisplayName(locale15);
        java.lang.String str17 = locale15.toLanguageTag();
        java.util.Locale locale18 = java.util.Locale.GERMANY;
        java.lang.String str19 = locale15.getDisplayLanguage(locale18);
        java.lang.String str20 = locale10.getDisplayLanguage(locale15);
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale locale22 = builder21.build();
        java.util.Locale locale23 = builder21.build();
        java.util.Locale.Builder builder24 = builder21.clear();
        java.util.Locale.Builder builder25 = builder24.clearExtensions();
        java.util.Locale.Builder builder26 = builder25.clear();
        java.util.Locale locale27 = builder26.build();
        java.lang.String str28 = locale15.getDisplayScript(locale27);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "99.00:00:0" + "'", str8, "99.00:00:0");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals(locale14.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str16, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh" + "'", str17, "zh");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Chinesisch" + "'", str19, "Chinesisch");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u4e2d\u6587" + "'", str20, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)", "z", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("I!Chine0ich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!Chine0ich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!" + "'", str2, "I!Chine0ich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!");
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
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
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "china           ");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode8.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList9);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeList13);
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
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertTrue("'" + filteringMode36 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode36.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty(" ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
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
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Locale[] localeArray22 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList23 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList23, localeArray22);
        java.util.Locale locale25 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList23);
        java.util.Locale.Category category26 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category26, locale27);
        java.util.Set<java.lang.String> strSet29 = locale27.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strSet29);
        java.util.Locale.FilteringMode filteringMode31 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strSet29, filteringMode31);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Locale[] localeArray36 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList37 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList37, localeArray36);
        java.util.Locale locale39 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.util.Locale>) localeList37);
        java.util.Locale locale40 = java.util.Locale.PRC;
        java.util.Locale locale42 = java.util.Locale.GERMANY;
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale42);
        java.lang.String str44 = locale40.getDisplayVariant(locale42);
        java.util.Locale locale45 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet46 = locale45.getUnicodeLocaleKeys();
        java.util.Locale locale47 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet48 = locale47.getUnicodeLocaleKeys();
        java.util.Locale locale49 = java.util.Locale.CHINESE;
        java.lang.String str50 = locale47.getDisplayName(locale49);
        java.util.Locale locale51 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray52 = new java.util.Locale[] { locale40, locale45, locale47, locale51 };
        java.util.ArrayList<java.util.Locale> localeList53 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList53, localeArray52);
        java.util.Locale locale55 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.util.Locale>) localeList53);
        java.util.List<java.util.Locale> localeList56 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.util.Locale>) localeList53);
        java.util.List<java.util.Locale> localeList57 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList53);
        java.util.Locale.Builder builder58 = new java.util.Locale.Builder();
        java.util.Locale locale60 = java.util.Locale.CHINA;
        java.util.Locale locale61 = locale60.stripExtensions();
        java.lang.String str62 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale60);
        java.util.Locale.Builder builder63 = builder58.setLocale(locale60);
        java.util.Locale.Builder builder65 = builder63.setLanguage("und");
        java.util.Locale.Builder builder67 = builder63.setLanguageTag("ih");
        java.util.Locale.Builder builder68 = builder67.clear();
        java.util.Locale locale69 = builder68.build();
        java.util.Set<java.lang.String> strSet70 = locale69.getUnicodeLocaleKeys();
        java.lang.String str71 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet70);
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
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(locale25);
        org.junit.Assert.assertTrue("'" + category26 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category26.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + filteringMode31 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode31.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(localeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(locale39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str50, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(locale55);
        org.junit.Assert.assertNotNull(localeList56);
        org.junit.Assert.assertNotNull(localeList57);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "99.00:00:0" + "'", str62, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "");
        org.junit.Assert.assertNotNull(strSet70);
        org.junit.Assert.assertNull(str71);
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("Deutschland", "0:00:00.017xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("english (united states)", "I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "glauatadatat" + "'", str4, "glauatadatat");
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "HI!                                                                                              ", (int) '4');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "zh_TW");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0:00:00.007", strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder7 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setExtension('u', "anglais (Canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: anglais (Canada) [at index 0]");
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
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 96, "0:00:00.032", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.032" + "'", str3, "0:00:00.032");
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", "can", 47);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("          0I!", "de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int10 = timeZone9.getRawOffset();
        java.lang.String str11 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 41, (long) 52, "tes", false, timeZone9);
        java.lang.String str12 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 2, "!ih#######", true, timeZone9);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "te0" + "'", str11, "te0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "!ih#######" + "'", str12, "!ih#######");
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
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
        java.lang.String str17 = locale14.getLanguage();
        java.util.Locale.Category category18 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(category18, locale19);
        java.util.Locale locale21 = java.util.Locale.getDefault(category18);
        java.util.Locale locale22 = java.util.Locale.getDefault(category18);
        java.util.Locale locale23 = java.util.Locale.getDefault(category18);
        java.lang.String str24 = locale23.getLanguage();
        java.lang.String str25 = locale14.getDisplayVariant(locale23);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en" + "'", str17, "en");
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category18.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "fr" + "'", str24, "fr");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("M0DT0H0M0.000S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "m0dt0h0m0.000s" + "'", str1, "m0dt0h0m0.000s");
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                              ", (java.lang.CharSequence) "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("########Chinese (China)#########", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!ih!ih!...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########Chinese (China)#########" + "'", str3, "########Chinese (China)#########");
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("CHN                                ", "..china...", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 38, 104);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int10 = timeZone9.getRawOffset();
        java.lang.String str11 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y0M0DT0H0M0.023S", false, timeZone9);
        java.lang.String str12 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) 'x', "CAN", true, timeZone9);
        java.time.ZoneId zoneId13 = timeZone9.toZoneId();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone(zoneId13);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getTimeZone(zoneId13);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y000DT00000.0230" + "'", str11, "P0Y000DT00000.0230");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CAN" + "'", str12, "CAN");
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Heure de Greenwich");
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
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
        timeZone5.setRawOffset(0);
        java.util.TimeZone timeZone47 = java.util.TimeZone.getTimeZone("");
        java.lang.String str48 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone47);
        boolean boolean49 = timeZone47.observesDaylightTime();
        int int51 = timeZone47.getOffset(0L);
        java.util.TimeZone.setDefault(timeZone47);
        timeZone47.setID("de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)");
        boolean boolean55 = timeZone5.hasSameRules(timeZone47);
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
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u4e2d\u6587" + "'", str28, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587" + "'", str36, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(zoneId38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\u4e2d\u6587" + "'", str48, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("UNITED STATES", "                                                p0y000dt00000.090153hip0y000dt00000.090153!p0y000dt00000.090153_XCHINESISCHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX_Canada", "zh_twt00t00t00t00t0");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        int int17 = timeZone13.getOffset((long) (short) 10);
        java.time.ZoneId zoneId18 = timeZone13.toZoneId();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone(zoneId18);
        boolean boolean20 = timeZone19.observesDaylightTime();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("", objArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("", objArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(objArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(objArray2, 'a');
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!", '4');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0 seconds", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("deuuuuuuuuuuuuuuuu", (java.lang.Object[]) strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!" + "'", str6, "HI!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny("United States", strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "", 0, (int) (short) 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "!i0");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("en-GB");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = builder6.build();
        java.lang.String str9 = locale8.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
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
            java.util.Locale.Builder builder20 = builder5.setExtension('a', "              C#N              ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value:               C#N               [at index 0]");
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
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("United States", "P0Y0M0DT0de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                P0Y000DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.090153", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale3 = new java.util.Locale("\u4e2d\u6587");
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("P0Y0M0DT0H0M0.034S");
        java.lang.String str7 = locale3.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.lang.String str10 = locale8.getExtension('a');
        java.lang.String str11 = locale6.getDisplayName(locale8);
        java.lang.String str12 = locale8.toLanguageTag();
        java.lang.String str13 = locale8.getCountry();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DE" + "'", str13, "DE");
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Chinese(China)", 'x');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("                 P0Y0M0DT0H0M0.121S", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh_cn" + "'", str1, "zh_cn");
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("...                                                                  0:00:00.000uuuuuu...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...uuuuuu000.00:00:0                                                                  ..." + "'", str1, "...uuuuuu000.00:00:0                                                                  ...");
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder5.setLanguage("und");
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getScript();
        java.util.Locale.Builder builder11 = builder7.setLocale(locale9);
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder11.setUnicodeLocaleKeyword("P0Y0M0DT0H0M0.070S", "chinois");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: P0Y0M0DT0H0M0.070S [at index 0]");
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
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
        java.util.Locale locale3 = new java.util.Locale("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaap0y0m0dt0h0m0.034saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("P-1Y11M30DT23H59M59.959S", locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaap0y0m0dt0h0m0.034saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa_AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAFRAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P-1Y11M30DT23H59M59.959S" + "'", str4, "P-1Y11M30DT23H59M59.959S");
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "0:00:00.031");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
        java.util.Locale locale3 = new java.util.Locale("", "", "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
        java.lang.String str4 = locale3.getISO3Country();
        java.util.Locale locale8 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.lang.String str10 = locale3.getDisplayVariant(locale8);
        java.lang.String str11 = locale8.toLanguageTag();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon" + "'", str10, "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "und" + "'", str11, "und");
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                 'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's                                 ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's                                 " + "'", str2, "                                 'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's                                 ");
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "ihihtestestestestestestP0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                        ", "Chinese      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                   aaaaaaaaaaaaaa... 0 SECOND)aaaaaaaaaaaaaa                                                                                                                                                    ", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("GMT");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "German (Germany)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
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
        java.util.Locale locale31 = java.util.Locale.FRENCH;
        java.lang.String str32 = locale31.getCountry();
        java.lang.String str33 = timeZone7.getDisplayName(locale31);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GMT" + "'", str9, "GMT");
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "P0Y000DT00000.0230" + "'", str25, "P0Y000DT00000.0230");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "CAN" + "'", str26, "CAN");
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Heure de Greenwich" + "'", str33, "Heure de Greenwich");
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                p0y000dt00000.090153hip0y000dt00000.090153!p0y000dt00000.090153", "HI!                                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray0, "-GB", 0, 0);
        java.lang.Class<?> wildcardClass5 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("p0y0m0dt0h0m0.034s", 'a');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "4444444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!", "0:00:00.99");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("44444444444444444444444444444", strArray3, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, 'a', 93, 318);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 93");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "44444444444444444444444444444" + "'", str9, "44444444444444444444444444444");
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0:00:00.010", "0 days 0 hours 0 minutes 0 seco", 3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("'P'yyyy''''d''''m''s.''", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("\uc911\uad6d\uc5b4\uc911\uad6d)!ih!ih!ih!ih!ih!i", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "Africa/AbidjanAfrica/AccraAfrica/BamakoAfrica/BanjulAfrica/BissauAfrica/CasablancaAfrica/ConakryAfrica/DakarAfrica/El_AaiunAfrica/FreetownAfrica/LomeAfrica/MonroviaAfrica/NouakchottAfrica/OuagadougouAfrica/Sao_TomeAfrica/TimbuktuAmerica/DanmarkshavnAntarctica/TrollAtlantic/CanaryAtlantic/FaeroeAtlantic/FaroeAtlantic/MadeiraAtlantic/ReykjavikAtlantic/St_HelenaEireEtc/GMTEtc/GMT+Etc/GMT-Etc/GMTEtc/GreenwichEtc/UCTEtc/UTCEtc/UniversalEtc/ZuluEurope/BelfastEurope/DublinEurope/GuernseyEurope/Isle_of_ManEurope/JerseyEurope/LisbonEurope/LondonGBGB-EireGMTGMTGreenwichIcelandPortugalUCTUTCUniversalWETZulu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
        java.util.Locale locale1 = new java.util.Locale("\u4e2d\u6587");
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale1.getScript();
        org.junit.Assert.assertEquals(locale1.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0danaC:danaC00danaC:danaC00danaC.danaC097");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("HI!44444444444444444444444444444", '#');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "HI!");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("p0y0m0dt0h0m0.034s", (java.lang.Object[]) strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "0e_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAY4 0 0OUR4 0 0INUTE04 0 ECOND)");
        int int14 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Chinese      ", strArray13);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "44444444444444444444444444444" + "'", str9, "44444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44444444444444444444444444444" + "'", str11, "44444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 13 + "'", int14 == 13);
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
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
            java.util.Locale.Builder builder14 = builder11.setExtension('4', "\u6cd5\u6587\u6cd5\u56fd)xxx");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
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
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("!i0 (P0Y0M0DT0H0M0.034S)!i0 (P0Y0M0DT0H0M0.034S)!i0 (P0Y0M0DT0H0M0.034S)!i0 (P0Y0M0DT0H0M0.034S)!i", "\u6cd5\u6587\u6cd5\u56fd))", 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                 p0000y0m0dthh0m00.s                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0000y0m0dthh0m00.s" + "'", str1, "p0000y0m0dthh0m00.s");
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setVariant("            0:00:00.000");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant:             0:00:00.000 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("fran\347\uc911\uad6d\uc5b4\uc911\uad6d)", (-1), 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "Chine");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.090S", ' ');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.090S" + "'", str3, "P0Y0M0DT0H0M0.090S");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "P0Y0M0DT0H0M0.004", (java.lang.CharSequence) "zh_CNzhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str1, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhi!#######ineuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhi!#######e (cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhi!#######ina)fran\347\uc911\uad6d\uc5b4\uc911\uad6d)", "0:00:00.003");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("P-1Y11M30DT23H59M59.979S", "P0Y0M0DT0H0M0.019S", (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("cancancancancancancancancancancancancancancancancancancancancancancancancancancancancancancan0:00:00.089");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cancancancancancancancancancancancancancancancancancancancancancancancancancancancancancancan0:00:00.08" + "'", str1, "cancancancancancancancancancancancancancancancancancancancancancancancancancancancancancancan0:00:00.08");
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\u82f1\u56fd", "44P0Y0-10DT07430-10.034359990044");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ENGLISH (UNITED STATES)", "Rf", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("Deutschland");
        int int2 = timeZone1.getRawOffset();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "\u683c\u6797\u5a01\u6cbb\u6642\u9593", 318);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("I!Chine0ich (Chin )I!Chineich (Chin )I!Chineich (Chin )I!Chineich (Chin )I!Chineich (Chin )I!Chineich (Chin )I!Chineich (Chin )I!Chineich (Chin )I!Chineich (Chin )I!", "0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00          0I!          0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse(" I!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=i!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6468");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "deHI!44444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6469");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("mxanxarxasxavxayxazxbaxbexbgxbhxbixbmxbnxboxbrxbsxcaxcexchxcoxcrxcsxcxcvxcyxdaxdexdvxdzxeexelxenxeoxesxetxexfaxffxfixfjxfoxfrxfyxgaxgdxglxgnxgxgvxhaxhexhixhoxhrxhtxhxhyxhzxiaxidxiexigxiixikxinxioxisxitxixiwxjaxjixjvxkaxkgxkixkjxkkxklxkmxknxkoxkrxksxkxkvxkwxkyxlaxlbxlgxlixlnxloxltxlxlvxmgxmhxmixmkxmlxmnxmoxmrxmsxmtxmyxnaxnbxndxnexngxnlxnnxnoxnrxnvxnyxocxojxomxorxosxpaxpixplxpsxptxqxrmxrnxroxrxrwxsaxscxsdxsexsgxsixskxslxsmxsnxsoxsqxsrxssxstxsxsvxswxtaxtextgxthxtixtkxtlxtnxtoxtrxtsxttxtwxtyxgxkxrxzxvexvixvoxwaxwoxxhxyixyoxzaxzhxz", 30, "0e_zh_tw (p0y0-10dt07430-10.0343599900,0 day4 0 0our4 0 0inute04 0 econd)China00DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.09015Chinap0y000dt00000.0230");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mxanxarxasxavxayxazxbaxbexbgxbhxbixbmxbnxboxbrxbsxcaxcexchxcoxcrxcsxcxcvxcyxdaxdexdvxdzxeexelxenxeoxesxetxexfaxffxfixfjxfoxfrxfyxgaxgdxglxgnxgxgvxhaxhexhixhoxhrxhtxhxhyxhzxiaxidxiexigxiixikxinxioxisxitxixiwxjaxjixjvxkaxkgxkixkjxkkxklxkmxknxkoxkrxksxkxkvxkwxkyxlaxlbxlgxlixlnxloxltxlxlvxmgxmhxmixmkxmlxmnxmoxmrxmsxmtxmyxnaxnbxndxnexngxnlxnnxnoxnrxnvxnyxocxojxomxorxosxpaxpixplxpsxptxqxrmxrnxroxrxrwxsaxscxsdxsexsgxsixskxslxsmxsnxsoxsqxsrxssxstxsxsvxswxtaxtextgxthxtixtkxtlxtnxtoxtrxtsxttxtwxtyxgxkxrxzxvexvixvoxwaxwoxxhxyixyoxzaxzhxz" + "'", str3, "mxanxarxasxavxayxazxbaxbexbgxbhxbixbmxbnxboxbrxbsxcaxcexchxcoxcrxcsxcxcvxcyxdaxdexdvxdzxeexelxenxeoxesxetxexfaxffxfixfjxfoxfrxfyxgaxgdxglxgnxgxgvxhaxhexhixhoxhrxhtxhxhyxhzxiaxidxiexigxiixikxinxioxisxitxixiwxjaxjixjvxkaxkgxkixkjxkkxklxkmxknxkoxkrxksxkxkvxkwxkyxlaxlbxlgxlixlnxloxltxlxlvxmgxmhxmixmkxmlxmnxmoxmrxmsxmtxmyxnaxnbxndxnexngxnlxnnxnoxnrxnvxnyxocxojxomxorxosxpaxpixplxpsxptxqxrmxrnxroxrxrwxsaxscxsdxsexsgxsixskxslxsmxsnxsoxsqxsrxssxstxsxsvxswxtaxtextgxthxtixtkxtlxtnxtoxtrxtsxttxtwxtyxgxkxrxzxvexvixvoxwaxwoxxhxyixyoxzaxzhxz");
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6470");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        int int17 = timeZone13.getOffset((long) 4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6471");
        java.util.Locale locale1 = new java.util.Locale("!IH");
        java.lang.String str2 = locale1.getDisplayName();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Set<java.lang.Character> charSet5 = locale3.getExtensionKeys();
        java.util.Locale locale7 = new java.util.Locale("English (United States)");
        java.lang.String str8 = locale7.toLanguageTag();
        java.lang.String str9 = locale7.getISO3Country();
        java.lang.String str10 = locale3.getDisplayCountry(locale7);
        java.lang.String str11 = locale1.getDisplayVariant(locale3);
        org.junit.Assert.assertEquals(locale1.toString(), "!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih" + "'", str2, "!ih");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertEquals(locale7.toString(), "english (united states)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "und" + "'", str8, "und");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "France" + "'", str10, "France");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6472");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4" + "'", str1, "4");
    }

    @Test
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6473");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        java.util.Locale.Builder builder9 = builder7.setLanguage("");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale locale11 = builder9.build();
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "_CN");
        org.junit.Assert.assertNotNull(charSet12);
    }

    @Test
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6474");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(23);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6475");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = builder1.build();
        java.lang.String str4 = locale3.getISO3Language();
        java.lang.String str5 = locale3.toLanguageTag();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("\u4e2d\u6587", locale3);
        java.util.Locale locale7 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str8 = locale7.getISO3Language();
        java.util.Locale locale9 = locale7.stripExtensions();
        java.util.Locale.Category category10 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category10, locale11);
        java.util.Locale locale13 = java.util.Locale.getDefault(category10);
        java.util.Locale locale14 = java.util.Locale.getDefault(category10);
        java.util.Locale.Category category15 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category15, locale16);
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.util.Locale.setDefault(category15, locale18);
        java.util.Locale locale21 = java.util.Locale.CHINA;
        java.util.Locale locale22 = locale21.stripExtensions();
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale21);
        java.util.Locale.setDefault(category15, locale21);
        java.util.Locale.Category category25 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale26 = java.util.Locale.UK;
        java.util.Locale.setDefault(category25, locale26);
        java.util.Locale locale28 = java.util.Locale.getDefault(category25);
        java.util.Locale locale29 = java.util.Locale.getDefault(category25);
        java.util.Locale.setDefault(category15, locale29);
        java.util.Locale.setDefault(category10, locale29);
        java.lang.String str32 = locale29.getDisplayScript();
        java.lang.String str33 = locale7.getDisplayName(locale29);
        java.lang.String str34 = locale3.getDisplayLanguage(locale29);
        java.util.Set<java.lang.String> strSet35 = locale29.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "und" + "'", str5, "und");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fra" + "'", str8, "fra");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category10.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertTrue("'" + category15 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category15.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale16);
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "99.00:00:0" + "'", str23, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + category25 + "' != '" + java.util.Locale.Category.FORMAT + "'", category25.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "French (Canada)" + "'", str33, "French (Canada)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strSet35);
    }

    @Test
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6476");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("t00", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t00" + "'", str2, "t00");
    }

    @Test
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6477");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        timeZone13.setID("zh");
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone("");
        int int20 = timeZone19.getRawOffset();
        java.lang.String str21 = timeZone19.getID();
        int int22 = timeZone19.getRawOffset();
        timeZone19.setID("#####################################################################################################################");
        boolean boolean25 = timeZone13.hasSameRules(timeZone19);
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone32 = java.util.TimeZone.getTimeZone("");
        java.lang.String str33 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone32);
        boolean boolean34 = timeZone32.observesDaylightTime();
        java.util.TimeZone timeZone40 = java.util.TimeZone.getTimeZone("");
        java.lang.String str41 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone40);
        boolean boolean42 = timeZone32.hasSameRules(timeZone40);
        boolean boolean43 = timeZone26.hasSameRules(timeZone32);
        boolean boolean44 = timeZone32.observesDaylightTime();
        int int45 = timeZone32.getRawOffset();
        boolean boolean46 = timeZone32.observesDaylightTime();
        boolean boolean47 = timeZone19.hasSameRules(timeZone32);
        int int48 = timeZone32.getRawOffset();
        boolean boolean49 = timeZone32.observesDaylightTime();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "GMT" + "'", str21, "GMT");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:00");
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6478");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "HI!444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6479");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0320.00000TD000Y0P", 58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6480");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 10, "   ...M0.001S    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test6481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6481");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\uc77c\ubcf8\uc5b4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\uc77c\ubcf8\uc5b4" + "'", str1, "\uc77c\ubcf8\uc5b4");
    }

    @Test
    public void test6482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6482");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("0e_zh_tw (p0y0-10dt07430-10.0343599900,0 day4 0 0our4 0 0inute04 0 econd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=0e_zh_tw(p0y0-10dt07430-10.0343599900");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6483");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                P0Y000DT00000.090153HIP0Y000DT00000.090153!P0Y000DT00000.090153_xchinesischxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_cANADA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6484");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", 120, 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6485");
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
        java.util.TimeZone timeZone31 = java.util.TimeZone.getTimeZone("");
        java.lang.String str32 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone31);
        boolean boolean33 = timeZone31.observesDaylightTime();
        java.util.TimeZone timeZone39 = java.util.TimeZone.getTimeZone("");
        java.lang.String str40 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone39);
        boolean boolean41 = timeZone31.hasSameRules(timeZone39);
        java.time.ZoneId zoneId42 = timeZone39.toZoneId();
        boolean boolean43 = timeZone9.hasSameRules(timeZone39);
        boolean boolean44 = timeZone9.observesDaylightTime();
        java.lang.String str45 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'x', (long) 7, "United States", false, timeZone9);
        java.util.TimeZone.setDefault(timeZone9);
        timeZone9.setRawOffset(83);
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
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u4e2d\u6587" + "'", str32, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u4e2d\u6587" + "'", str40, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(zoneId42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Unite30 887tate86399" + "'", str45, "Unite30 887tate86399");
    }

    @Test
    public void test6486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6486");
        char[] charArray12 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!IH", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0 seconds", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P0Y0M0DT0H0M0.224S", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("United States", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6487");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.014Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6488");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P-1Y11M30DT23H59M59.999S0:00:00.000", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6489");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0I!", 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0I!" + "'", str2, "0I!");
    }

    @Test
    public void test6490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6490");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("tes", "p-1y11m30dt23h59m59.975s (IH)", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6491");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("0I!", "n ar as av ay az ba be bg bh bi bm bn ", "english (united states)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test6492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6492");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("");
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone6);
        boolean boolean8 = timeZone6.observesDaylightTime();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("");
        java.lang.String str15 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone14);
        boolean boolean16 = timeZone6.hasSameRules(timeZone14);
        boolean boolean17 = timeZone0.hasSameRules(timeZone6);
        boolean boolean18 = timeZone0.observesDaylightTime();
        int int19 = timeZone0.getDSTSavings();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test6493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6493");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "aaaaaaaaaaaaaa...", "0:00.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test6494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6494");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) 'a');
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("HI!44444444444444444444444444444", strArray10);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("", "", 100);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("4444444444444444444444444444444444444444444444444444", strArray10, strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.concatWith("0 seconds", (java.lang.Object[]) strArray10);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, ' ', (int) 'u', (int) (short) 1);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.startsWithAny("und", strArray10);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", '#');
        java.lang.String[] strArray32 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) 'a');
        boolean boolean33 = org.apache.commons.lang3.StringUtils.startsWithAny("HI!44444444444444444444444444444", strArray32);
        java.lang.String[] strArray37 = org.apache.commons.lang3.StringUtils.split("", "", 100);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.replaceEach("4444444444444444444444444444444444444444444444444444", strArray32, strArray37);
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.replaceEach("United States", strArray26, strArray37);
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray37, "");
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray10, strArray37);
        java.lang.String[] strArray45 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih", 'a');
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray45, 'a', 0, 0);
        java.lang.String[] strArray50 = org.apache.commons.lang3.StringUtils.stripAll(strArray45);
        java.lang.String str51 = org.apache.commons.lang3.StringUtils.replaceEach("hi!#######", strArray10, strArray50);
        java.lang.String[] strArray54 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("zh_TW", 'u');
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("OUhS 0 MI", strArray10, strArray54);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4444444444444444444444444444444444444444444444444444" + "'", str16, "4444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "4444444444444444444444444444444444444444444444444444" + "'", str38, "4444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "United States" + "'", str39, "United States");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str42, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "!ih#######" + "'", str51, "!ih#######");
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "OUhS 0 MI" + "'", str55, "OUhS 0 MI");
    }

    @Test
    public void test6495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6495");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("UN00UNUN_0 DAY32 0 0OUR32 0 0INUTE032 0 ECONDUN000UNUN", "P-1Y11M30DT23H59M59.990S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6496");
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
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Locale[] localeArray20 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList21 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList21, localeArray20);
        java.util.Locale locale23 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList21);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Locale[] localeArray27 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList28 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList28, localeArray27);
        java.util.Locale locale30 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.util.Locale>) localeList28);
        java.util.Collection<java.lang.String> strCollection31 = null;
        java.util.Locale.FilteringMode filteringMode32 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, strCollection31, filteringMode32);
        java.util.List<java.util.Locale> localeList34 = java.util.Locale.filter(languageRangeList16, (java.util.Collection<java.util.Locale>) localeList21, filteringMode32);
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.util.Locale[] localeArray38 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList39 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList39, localeArray38);
        java.util.Locale locale41 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.util.Locale>) localeList39);
        java.util.Collection<java.util.Locale> localeCollection42 = null;
        java.util.Locale.FilteringMode filteringMode43 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList44 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, localeCollection42, filteringMode43);
        java.util.List<java.util.Locale> localeList45 = java.util.Locale.filter(languageRangeList16, (java.util.Collection<java.util.Locale>) localeList44);
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
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(locale23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(locale30);
        org.junit.Assert.assertTrue("'" + filteringMode32 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode32.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(localeList34);
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(locale41);
        org.junit.Assert.assertTrue("'" + filteringMode43 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode43.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList44);
        org.junit.Assert.assertNotNull(localeList45);
    }

    @Test
    public void test6497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6497");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("####################################################################################################################", "        zh", (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6498");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("P00-1Y11M30DT23H59M59.991S", 8, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P00-1Y11M30DT23H59M59.991S" + "'", str3, "P00-1Y11M30DT23H59M59.991S");
    }

    @Test
    public void test6499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6499");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "EN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EN" + "'", str1, "EN");
    }

    @Test
    public void test6500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6500");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("        Italy", "4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        Italy" + "'", str2, "        Italy");
    }
}
