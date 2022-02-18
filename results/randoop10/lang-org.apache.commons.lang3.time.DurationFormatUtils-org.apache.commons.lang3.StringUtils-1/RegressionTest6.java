import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("ENG                                                                                                                     ", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ZH_TW", 89);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ENG                                                                                                                     " + "'", str3, "ENG                                                                                                                     ");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!i0", "\u6cd5\u6587\u6cd5\u56fd))");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("can", "P0Y0M0DT0H0M0.090S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Uen-CAUUUUUUUUUUUUUUUUUUUUUUU0:00:00.097UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=uen-cauuuuuuuuuuuuuuuuuuuuuuu0:00:00.097uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("p0y0m0dt0h0m0.034s");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\u683c\u6797\u5a01\u6cbb\u6642\u9593", "                                                                                                                     !I0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "");
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, ' ');
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
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + filteringMode22 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode22.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("\u4e2d\u6587");
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet23 = locale21.getUnicodeLocaleAttributes();
        java.lang.String str24 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet23);
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
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "English (United States)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("0I!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                P0Y0M0DT0H0M0.090SHIP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                                                 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaGreenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H0M0.090SHIP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S" + "'", str2, "H0M0.090SHIP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("fr-FR", "Chinese (China)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("########Chinese (China)#########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########chinese (china)#########" + "'", str1, "########chinese (china)#########");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("P0Y000DT00000.09010hiP0Y000DT00000.09010!P0Y000DT00000.09010", 96, "FRA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09010hiP0Y000DT00000.09010!P0Y000DT00000.09010FRAFRAFRAFRAFRAFRAFRAFRAFRAFRAFRAFRA" + "'", str3, "P0Y000DT00000.09010hiP0Y000DT00000.09010!P0Y000DT00000.09010FRAFRAFRAFRAFRAFRAFRAFRAFRAFRAFRAFRA");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("Canada", "     4444444444444444444444444444444444444444444444444444      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("p0y0m0dt0h0m0.000s", "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p0y0m0dt0h0m0.000s" + "'", str2, "p0y0m0dt0h0m0.000s");
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("!I", (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.util.Locale locale2 = java.util.Locale.PRC;
        java.lang.String str3 = locale1.getDisplayLanguage(locale2);
        java.lang.String str4 = locale1.getISO3Country();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("               zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               ", locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u6587" + "'", str3, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CHN" + "'", str4, "CHN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "               ZH_TW (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               " + "'", str5, "               ZH_TW (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               ");
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("     4444444444444444444444444444444444444444444444444444      ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:      4444444444444444444444444444444444444444444444444444       [at index 0]");
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
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("44444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444" + "'", str1, "44444444444444444444444444444");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\u4e2d\u6587!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ip0y0m0dt0h0m0.090s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaxabxaexafxakxamxanxarxasxavxayxazxbaxbexbgxbhxbixbmxbnxboxbrxbsxcaxcexchxcoxcrxcsxcuxcvxcyxdaxdexdvxdzxeexelxenxeoxesxetxeuxfaxffxfixfjxfoxfrxfyxgaxgdxglxgnxguxgvxhaxhexhixhoxhrxhtxhuxhyxhzxiaxidxiexigxiixikxinxioxisxitxiuxiwxjaxjixjvxkaxkgxkixkjxkkxklxkmxknxkoxkrxksxkuxkvxkwxkyxlaxlbxlgxlixlnxloxltxluxlvxmgxmhxmixmkxmlxmnxmoxmrxmsxmtxmyxnaxnbxndxnexngxnlxnnxnoxnrxnvxnyxocxojxomxorxosxpaxpixplxpsxptxquxrmxrnxroxruxrwxsaxscxsdxsexsgxsixskxslxsmxsnxsoxsqxsrxssxstxsuxsvxswxtaxtextgxthxtixtkxtlxtnxtoxtrxtsxttxtwxtyxugxukxurxuzxvexvixvoxwaxwoxxhxyixyoxzaxzhxzu", "UN00UNUN_0 day32 0 0our32 0 0inute032 0 econdUN000UNUN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("china", 5, 96);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "china" + "'", str3, "china");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                              p0y0m0dt0h0m0.090s", (java.lang.CharSequence) "                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 318 + "'", int2 == 318);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        boolean boolean2 = timeZone1.observesDaylightTime();
        timeZone1.setID("HI!44444444444444444444444444444");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "########chinese (china)#########", (java.lang.CharSequence) "0 days 0 hours 0 minutes 0 seco");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("...ch0eure0eGr...", "uuuuuuuuuuuuuzh_CN", 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr..." + "'", str3, "...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...");
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...chHeure de Gr...", "                       danac                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "               zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               ", 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HI!HI!HI!ihHI!HI!HI", "P-1Y11M30DT23H59M59.947S", "", 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!HI!HI!ihHI!HI!HI" + "'", str4, "HI!HI!HI!ihHI!HI!HI");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        int int9 = timeZone5.getOffset(0L);
        timeZone5.setID("P0Y0M0DT0H0M0.100S");
        int int12 = timeZone5.getRawOffset();
        int int14 = timeZone5.getOffset((long) 3);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("Greenwich Mean Time", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11M30DT23H59M59.990S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        java.util.Locale locale1 = java.util.Locale.ROOT;
        java.util.Locale locale4 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.lang.String str5 = locale1.getDisplayCountry(locale4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", locale1);
        java.lang.String str7 = locale1.getISO3Language();
        java.util.Locale locale10 = new java.util.Locale("");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("p0y0m0dt0h0m0.034s", locale10);
        java.lang.String str12 = locale10.getDisplayLanguage();
        boolean boolean13 = locale1.equals((java.lang.Object) str12);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale4.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str6, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str11, "P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("p0y0m0dt0h0m0.090s");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("OURS 0 MI", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                                                                                                                                                                                                                                              p0y0m0dt0h0m0.090s", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 335 + "'", int5 == 335);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("P0Y0M0DT0H0M0.100S", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=p0y0m0dt0h0m0.100s");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "english (united states)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u4e2d\u6587", ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 120, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "0:00:00.00", 11, 153);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setVariant("               zh              ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant:                zh               [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0M0DT0H0M0.000S444444", " und ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("\u4e2d\u6587_                                                                                                    ", "Italy");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587_                                                                                                    " + "'", str2, "\u4e2d\u6587_                                                                                                    ");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                    !I0", "de_DE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
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
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Locale[] localeArray35 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList36 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList36, localeArray35);
        java.util.Locale locale38 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.util.Locale>) localeList36);
        java.util.Locale.Category category39 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category39, locale40);
        java.util.Set<java.lang.String> strSet42 = locale40.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strSet42);
        java.lang.String str44 = java.util.Locale.lookupTag(languageRangeList24, (java.util.Collection<java.lang.String>) strSet42);
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.util.Locale[] localeArray48 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList49 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList49, localeArray48);
        java.util.Locale locale51 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.util.Locale>) localeList49);
        java.util.Locale locale52 = java.util.Locale.PRC;
        java.util.Locale locale54 = java.util.Locale.GERMANY;
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale54);
        java.lang.String str56 = locale52.getDisplayVariant(locale54);
        java.util.Locale.Category category57 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale58 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category57, locale58);
        java.util.Set<java.lang.String> strSet60 = locale58.getUnicodeLocaleKeys();
        java.util.Locale locale61 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet62 = locale61.getUnicodeLocaleKeys();
        java.util.Locale locale63 = java.util.Locale.CHINA;
        java.util.Locale locale64 = locale63.stripExtensions();
        java.lang.String str65 = locale63.getDisplayLanguage();
        java.util.Locale locale66 = java.util.Locale.CHINA;
        java.util.Locale locale67 = locale66.stripExtensions();
        java.util.Locale locale68 = java.util.Locale.FRANCE;
        java.util.Locale locale69 = java.util.Locale.TAIWAN;
        java.util.Locale locale70 = java.util.Locale.getDefault();
        java.lang.String str71 = locale70.getDisplayVariant();
        java.util.Locale locale72 = java.util.Locale.CHINA;
        java.util.Locale locale73 = locale72.stripExtensions();
        java.lang.String str74 = locale72.getDisplayLanguage();
        java.util.Locale locale75 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet76 = locale75.getUnicodeLocaleKeys();
        java.util.Locale locale77 = java.util.Locale.CHINESE;
        java.lang.String str78 = locale75.getDisplayName(locale77);
        java.lang.String str79 = locale77.getCountry();
        java.util.Locale[] localeArray80 = new java.util.Locale[] { locale54, locale58, locale61, locale63, locale66, locale68, locale69, locale70, locale72, locale77 };
        java.util.ArrayList<java.util.Locale> localeList81 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList81, localeArray80);
        java.util.Locale.FilteringMode filteringMode83 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList84 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.util.Locale>) localeList81, filteringMode83);
        java.util.Locale locale88 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet89 = locale88.getExtensionKeys();
        java.lang.String str90 = locale88.getLanguage();
        java.util.Set<java.lang.String> strSet91 = locale88.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList92 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.lang.String>) strSet91);
        java.util.Locale.FilteringMode filteringMode93 = null;
        java.util.List<java.lang.String> strList94 = java.util.Locale.filterTags(languageRangeList24, (java.util.Collection<java.lang.String>) strSet91, filteringMode93);
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
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(locale38);
        org.junit.Assert.assertTrue("'" + category39 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category39.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale40);
// flaky:         org.junit.Assert.assertEquals(locale40.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(localeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(locale51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + category57 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category57.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale58);
// flaky:         org.junit.Assert.assertEquals(locale58.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Chinese" + "'", str65, "Chinese");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale70);
// flaky:         org.junit.Assert.assertEquals(locale70.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Chinese" + "'", str74, "Chinese");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet76);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str78, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(localeArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + filteringMode83 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode83.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList84);
// flaky:         org.junit.Assert.assertEquals(locale88.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "!ih" + "'", str90, "!ih");
        org.junit.Assert.assertNotNull(strSet91);
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertNotNull(strList94);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("fra", "english (united states)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                    !I0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                    !I0" + "'", str1, "                                                                                                                    !I0");
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0days0hours0minutes0seco", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("P-1Y11M30DT23H59M59.979S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p-1y11m30dt23h59m59.979s" + "'", str1, "p-1y11m30dt23h59m59.979s");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int6 = timeZone5.getRawOffset();
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 41, (long) 52, "tes", false, timeZone5);
        boolean boolean8 = timeZone5.observesDaylightTime();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "te0" + "'", str7, "te0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECON", (double) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=117.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank(charSequence0, (java.lang.CharSequence) "WWWWWWWWWW");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "WWWWWWWWWW" + "'", charSequence2, "WWWWWWWWWW");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("HI!44444444444444444444444444444", '#');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "HI!");
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("CAN", strArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("44444444444444444444444444444444444444           HI!", strArray5);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0days0hours0minutes0seco", strArray5);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("P0Y0M0DT0H0M0.001S", "0:00:00.002", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
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
        java.util.Locale locale30 = java.util.Locale.PRC;
        java.util.Locale locale32 = java.util.Locale.GERMANY;
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale32);
        java.lang.String str34 = locale30.getDisplayVariant(locale32);
        java.util.Locale.Category category35 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category35, locale36);
        java.util.Set<java.lang.String> strSet38 = locale36.getUnicodeLocaleKeys();
        java.util.Locale locale39 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet40 = locale39.getUnicodeLocaleKeys();
        java.util.Locale locale41 = java.util.Locale.CHINA;
        java.util.Locale locale42 = locale41.stripExtensions();
        java.lang.String str43 = locale41.getDisplayLanguage();
        java.util.Locale locale44 = java.util.Locale.CHINA;
        java.util.Locale locale45 = locale44.stripExtensions();
        java.util.Locale locale46 = java.util.Locale.FRANCE;
        java.util.Locale locale47 = java.util.Locale.TAIWAN;
        java.util.Locale locale48 = java.util.Locale.getDefault();
        java.lang.String str49 = locale48.getDisplayVariant();
        java.util.Locale locale50 = java.util.Locale.CHINA;
        java.util.Locale locale51 = locale50.stripExtensions();
        java.lang.String str52 = locale50.getDisplayLanguage();
        java.util.Locale locale53 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet54 = locale53.getUnicodeLocaleKeys();
        java.util.Locale locale55 = java.util.Locale.CHINESE;
        java.lang.String str56 = locale53.getDisplayName(locale55);
        java.lang.String str57 = locale55.getCountry();
        java.util.Locale[] localeArray58 = new java.util.Locale[] { locale32, locale36, locale39, locale41, locale44, locale46, locale47, locale48, locale50, locale55 };
        java.util.ArrayList<java.util.Locale> localeList59 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList59, localeArray58);
        java.util.Locale.FilteringMode filteringMode61 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList62 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.util.Locale>) localeList59, filteringMode61);
        java.util.Locale locale66 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet67 = locale66.getExtensionKeys();
        java.lang.String str68 = locale66.getLanguage();
        java.util.Set<java.lang.String> strSet69 = locale66.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList70 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.lang.String>) strSet69);
        java.util.List<java.lang.String> strList71 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList70);
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
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + category35 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category35.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale36);
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Chinese" + "'", str43, "Chinese");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale48);
// flaky:         org.junit.Assert.assertEquals(locale48.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Chinese" + "'", str52, "Chinese");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str56, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(localeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + filteringMode61 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode61.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList62);
// flaky:         org.junit.Assert.assertEquals(locale66.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "!ih" + "'", str68, "!ih");
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNotNull(strList71);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaxabxaexafxakxamxanxarxasxavxayxazxbaxbexbgxbhxbixbmxbnxboxbrxbsxcaxcexchxcoxcrxcsxcxcvxcyxdaxdexdvxdzxeexelxenxeoxesxetxexfaxffxfixfjxfoxfrxfyxgaxgdxglxgnxgxgvxhaxhexhixhoxhrxhtxhxhyxhzxiaxidxiexigxiixikxinxioxisxitxixiwxjaxjixjvxkaxkgxkixkjxkkxklxkmxknxkoxkrxksxkxkvxkwxkyxlaxlbxlgxlixlnxloxltxlxlvxmgxmhxmixmkxmlxmnxmoxmrxmsxmtxmyxnaxnbxndxnexngxnlxnnxnoxnrxnvxnyxocxojxomxorxosxpaxpixplxpsxptxqxrmxrnxroxrxrwxsaxscxsdxsexsgxsixskxslxsmxsnxsoxsqxsrxssxstxsxsvxswxtaxtextgxthxtixtkxtlxtnxtoxtrxtsxttxtwxtyxgxkxrxzxvexvixvoxwaxwoxxhxyixyoxzaxzhxz", "ANGLAIS (CANADA)");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
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
        java.util.Locale locale39 = java.util.Locale.forLanguageTag("99.00:00:0");
        java.lang.String str40 = locale39.toLanguageTag();
        java.lang.String str41 = locale39.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = timeZone13.getDisplayName(false, 19, locale39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 19");
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
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "und" + "'", str40, "und");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("aaaaaaaaaaaaaChinese (China)aaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.UK;
        java.util.Locale.setDefault(category0, locale1);
        java.lang.String str3 = locale1.getVariant();
        java.lang.String str4 = locale1.toLanguageTag();
        java.util.Set<java.lang.Character> charSet5 = locale1.getExtensionKeys();
        java.lang.String str6 = locale1.getLanguage();
        java.lang.String str7 = locale1.getDisplayLanguage();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "English" + "'", str7, "English");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "4444444444444444444444444444444444444444444444444444");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECON", '#');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("P0Y000DT00000.00120", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00120" + "'", str2, "P0Y000DT00000.00120");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "0320.000000I!  ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aaTE0abTE0aeTE0afTE0akTE0amTE0anTE0arTE0asTE0avTE0ayTE0azTE0baTE0beTE0bgTE0bhTE0biTE0bmTE0bnTE0boTE0brTE0bsTE0caTE0ceTE0chTE0coTE0crTE0csTE0cuTE0cvTE0cyTE0daTE0deTE0dvTE0dzTE0eeTE0elTE0enTE0eoTE0esTE0etTE0euTE0faTE0ffTE0fiTE0fjTE0foTE0frTE0fyTE0gaTE0gdTE0glTE0gnTE0guTE0gvTE0haTE0heTE0hiTE0hoTE0hrTE0htTE0huTE0hyTE0hzTE0iaTE0idTE0ieTE0igTE0iiTE0ikTE0inTE0ioTE0isTE0itTE0iuTE0iwTE0jaTE0jiTE0jvTE0kaTE0kgTE0kiTE0kjTE0kkTE0klTE0kmTE0knTE0koTE0krTE0ksTE0kuTE0kvTE0kwTE0kyTE0laTE0lbTE0lgTE0liTE0lnTE0loTE0ltTE0luTE0lvTE0mgTE0mhTE0miTE0mkTE0mlTE0mnTE0moTE0mrTE0msTE0mtTE0myTE0naTE0nbTE0ndTE0neTE0ngTE0nlTE0nnTE0noTE0nrTE0nvTE0nyTE0ocTE0ojTE0omTE0orTE0osTE0paTE0piTE0plTE0psTE0ptTE0quTE0rmTE0rnTE0roTE0ruTE0rwTE0saTE0scTE0sdTE0seTE0sgTE0siTE0skTE0slTE0smTE0snTE0soTE0sqTE0srTE0ssTE0stTE0suTE0svTE0swTE0taTE0teTE0tgTE0thTE0tiTE0tkTE0tlTE0tnTE0toTE0trTE0tsTE0ttTE0twTE0tyTE0ugTE0ukTE0urTE0uzTE0veTE0viTE0voTE0waTE0woTE0xhTE0yiTE0yoTE0zaTE0zhTE0zu", "stestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 3);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.003" + "'", str1, "0:00:00.003");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int6 = timeZone5.getRawOffset();
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y0M0DT0H0M0.023S", false, timeZone5);
        int int9 = timeZone5.getOffset((long) 120);
        boolean boolean10 = timeZone5.observesDaylightTime();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P0Y000DT00000.0230" + "'", str7, "P0Y000DT00000.0230");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("0danaC:danaC00danaC:danaC00danaC.danaC097", "Korean");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("P0Y0-10DT07430-10.0343599900I!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0343599900I!" + "'", str2, "P0Y0-10DT07430-10.0343599900I!");
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("S469.95M95H32TD03M11Y1-P", "P0Y0-10DT07430-10.0343599900", 336);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("fra", "ZH_TW");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazh_TWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 1, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("", "P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str2, "P0Y0M0DT0H0M0.034S");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "deu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("");
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone6);
        boolean boolean8 = timeZone6.observesDaylightTime();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("");
        java.lang.String str15 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone14);
        boolean boolean16 = timeZone6.hasSameRules(timeZone14);
        boolean boolean17 = timeZone0.hasSameRules(timeZone6);
        boolean boolean18 = timeZone0.observesDaylightTime();
        java.lang.String str19 = timeZone0.getID();
        java.lang.Object obj20 = timeZone0.clone();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
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
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon" + "'", str19, "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
        org.junit.Assert.assertNotNull(obj20);
// flaky:         org.junit.Assert.assertEquals(obj20.toString(), "sun.util.calendar.ZoneInfo[id=\"0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "sun.util.calendar.ZoneInfo[id=\"0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "sun.util.calendar.ZoneInfo[id=\"0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ZH_TW", 48, "                                ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     ZH_TW                      " + "'", str3, "                     ZH_TW                      ");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...", "0 days 0 hours 0 minutes 0 seconds");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("0320.00000td000y0p");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0320.00000TD000Y0P" + "'", str1, "0320.00000TD000Y0P");
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH" + "'", str1, "!IH");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
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
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap14);
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
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("", "I!", 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!I!I!I!I!I!I!I!" + "'", str3, "I!I!I!I!I!I!I!I!");
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "de-DE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\uad6d\uc911\uc5b4\uad6d\uc911", "44P0Y0-10DT07430-10.034359990044");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
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
            java.util.Locale.Builder builder23 = builder20.setExtension('4', "GMT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
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
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("P0Y0M0DT0H0M0.000S444444", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("fr_FR", "undundun_0 DAYS 0 HOURS 0 MINUTES 0 SECONDSundundund");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("danaC", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u4e2d\u6587");
        java.lang.String str2 = locale1.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale1.getUnicodeLocaleType("\u6cd5\u6587\u6cd5\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: !ih_P0Y000DT00000.0340_?? (??)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                     0:00:00.000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 96 + "'", int1 == 96);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Chinese(China)", (int) 'x', 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (-1), (long) 14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.015S" + "'", str2, "P0Y0M0DT0H0M0.015S");
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse(" #####################################################################################################################  ", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=#####################################################################################################################");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("english (united states)", "aaxabxaexafxakxamxanxarxasxavxayxazxbaxbexbgxbhxbixbmxbnxboxbrxbsxcaxcexchxcoxcrxcsxcxcvxcyxdaxdexdvxdzxeexelxenxeoxesxetxexfaxffxfixfjxfoxfrxfyxgaxgdxglxgnxgxgvxhaxhexhixhoxhrxhtxhxhyxhzxiaxidxiexigxiixikxinxioxisxitxixiwxjaxjixjvxkaxkgxkixkjxkkxklxkmxknxkoxkrxksxkxkvxkwxkyxlaxlbxlgxlixlnxloxltxlxlvxmgxmhxmixmkxmlxmnxmoxmrxmsxmtxmyxnaxnbxndxnexngxnlxnnxnoxnrxnvxnyxocxojxomxorxosxpaxpixplxpsxptxqxrmxrnxroxrxrwxsaxscxsdxsexsgxsixskxslxsmxsnxsoxsqxsrxssxstxsxsvxswxtaxtextgxthxtixtkxtlxtnxtoxtrxtsxttxtwxtyxgxkxrxzxvexvixvoxwaxwoxxhxyixyoxzaxzhxz");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "english (united states)" + "'", str2, "english (united states)");
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("p0y0m0dt0h0m0.034s", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p0y0m0dt0h0m0.034s" + "'", str2, "p0y0m0dt0h0m0.034s");
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0:00:00.002", (int) 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.002" + "'", str2, "0:00:00.002");
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
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
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "...M0.001S");
        java.util.Locale.LanguageRange[] languageRangeArray42 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList43 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43, languageRangeArray42);
        java.util.Locale[] localeArray45 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList46 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList46, localeArray45);
        java.util.Locale locale48 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, (java.util.Collection<java.util.Locale>) localeList46);
        java.util.Locale.Category category49 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category49, locale50);
        java.util.Set<java.lang.String> strSet52 = locale50.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, (java.util.Collection<java.lang.String>) strSet52);
        java.lang.String str54 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet52);
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
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "!i0_P0Y0M0DT0H0M0.034S");
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
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "!i0_P0Y0M0DT0H0M0.034S");
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
        org.junit.Assert.assertNotNull(languageRangeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(localeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(locale48);
        org.junit.Assert.assertTrue("'" + category49 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category49.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "tes");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ih", 'x', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih" + "'", str3, "ih");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...chHeure de Gr...", "English (United Kingdom)", "0:00:00.003");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...c0Hur..Gr..." + "'", str3, "...c0Hur..Gr...");
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\u683c\u6797\u5a01\u6cbb\u65f6\u95f4", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4" + "'", str3, "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(" I!", "!I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("china", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setLanguageTag("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i [at index 0]");
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
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                     ZH_TW                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!ih#######");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("44p0y0m0dt0h0m0.090s4444444444444444444", "CA", "P0Y0M0DT0H0M0.99S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44p0y0m0dt0h0m0.090s4444444444444444444" + "'", str3, "44p0y0m0dt0h0m0.090s4444444444444444444");
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0:00:00.097");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "danaC");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0danaC:danaC00danaC:danaC00danaC.danaC097" + "'", str3, "0danaC:danaC00danaC:danaC00danaC.danaC097");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.097" + "'", str4, "0:00:00.097");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aaxabxaexafxakxamxanxarxasxavxayxazxbaxbexbgxbhxbixbmxbnxboxbrxbsxcaxcexchxcoxcrxcsxcuxcvxcyxdaxdexdvxdzxeexelxenxeoxesxetxeuxfaxffxfixfjxfoxfrxfyxgaxgdxglxgnxguxgvxhaxhexhixhoxhrxhtxhuxhyxhzxiaxidxiexigxiixikxinxioxisxitxiuxiwxjaxjixjvxkaxkgxkixkjxkkxklxkmxknxkoxkrxksxkuxkvxkwxkyxlaxlbxlgxlixlnxloxltxluxlvxmgxmhxmixmkxmlxmnxmoxmrxmsxmtxmyxnaxnbxndxnexngxnlxnnxnoxnrxnvxnyxocxojxomxorxosxpaxpixplxpsxptxquxrmxrnxroxruxrwxsaxscxsdxsexsgxsixskxslxsmxsnxsoxsqxsrxssxstxsuxsvxswxtaxtextgxthxtixtkxtlxtnxtoxtrxtsxttxtwxtyxugxukxurxuzxvexvixvoxwaxwoxxhxyixyoxzaxzhxzu", "P0Y0M0DT0H0M0.041S", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.100S", '#');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("\u6cd5\u6587\u6cd5\u56fd)", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        java.lang.Iterable<java.util.Locale.LanguageRange> languageRangeIterable0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(languageRangeIterable0, "'P'yyyy''''d''''m''s.''");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("S469.95M95H32TD03M11Y1-P", "ng");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "S469.95M95H32TD03M11Y1-P" + "'", str2, "S469.95M95H32TD03M11Y1-P");
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setRegion("P-1Y11M30DT23H59M59.975S");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: P-1Y11M30DT23H59M59.975S [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        int int9 = timeZone5.getOffset(0L);
        java.util.TimeZone.setDefault(timeZone5);
        timeZone5.setID("de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)");
        java.lang.Object obj13 = timeZone5.clone();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "sun.util.calendar.ZoneInfo[id=\"de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "sun.util.calendar.ZoneInfo[id=\"de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "sun.util.calendar.ZoneInfo[id=\"de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("P-1Y11M30DT23H59M59.964S", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.96S" + "'", str2, "P-1Y11M30DT23H59M59.96S");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        char[] charArray6 = new char[] { ' ', 'x', 'x', 'u', 'u' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "P-1Y11M30DT23H59M59.990S", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " xxuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " xxuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , x, x, u, u]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhi!#######", 23, "FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhi!#######" + "'", str3, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhi!#######");
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        java.lang.String str16 = timeZone13.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Greenwich Mean Time" + "'", str16, "Greenwich Mean Time");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0M0DT0H0M0.023S", "P00-1Y11M30DT23H59M59.991S");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "hi!", (int) (byte) 10);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("HI!", strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaGreenwich Mean Time", strArray3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Locale[] localeArray15 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList16 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList16, localeArray15);
        java.util.Locale locale18 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.util.Locale>) localeList16);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList13, 'a');
        java.util.Locale locale22 = new java.util.Locale("");
        java.lang.String str23 = locale22.getScript();
        java.util.Locale locale24 = java.util.Locale.CHINESE;
        java.util.Locale locale27 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.util.Locale locale28 = java.util.Locale.ROOT;
        java.util.Locale.Category category29 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category29, locale30);
        java.util.Locale locale32 = java.util.Locale.CHINA;
        java.util.Locale locale33 = java.util.Locale.PRC;
        java.lang.String str34 = locale32.getDisplayLanguage(locale33);
        java.util.Locale locale35 = java.util.Locale.CHINA;
        java.util.Locale locale36 = java.util.Locale.PRC;
        java.util.Locale locale38 = java.util.Locale.GERMANY;
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale38);
        java.lang.String str40 = locale36.getDisplayVariant(locale38);
        java.util.Locale.Category category41 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category41, locale42);
        java.util.Locale locale44 = java.util.Locale.CHINESE;
        java.util.Locale locale45 = java.util.Locale.PRC;
        java.util.Locale locale47 = java.util.Locale.GERMANY;
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale47);
        java.lang.String str49 = locale45.getDisplayVariant(locale47);
        java.util.Locale locale50 = java.util.Locale.CHINA;
        java.util.Locale locale51 = java.util.Locale.ITALY;
        java.util.Locale locale52 = java.util.Locale.PRC;
        java.util.Locale locale54 = java.util.Locale.GERMANY;
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale54);
        java.lang.String str56 = locale52.getDisplayVariant(locale54);
        java.util.Locale locale57 = java.util.Locale.getDefault();
        java.util.Locale locale58 = java.util.Locale.ROOT;
        java.lang.String str59 = locale58.getLanguage();
        java.util.Locale locale60 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray61 = new java.util.Locale[] { locale22, locale24, locale27, locale28, locale30, locale33, locale35, locale36, locale42, locale44, locale45, locale50, locale51, locale52, locale57, locale58, locale60 };
        java.util.ArrayList<java.util.Locale> localeList62 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList62, localeArray61);
        java.util.List<java.util.Locale> localeList64 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.util.Locale>) localeList62);
        java.util.List<java.util.Locale> localeList65 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList62);
        java.util.Locale.LanguageRange[] languageRangeArray66 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList67 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList67, languageRangeArray66);
        java.util.Locale[] localeArray69 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList70 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList70, localeArray69);
        java.util.Locale locale72 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList67, (java.util.Collection<java.util.Locale>) localeList70);
        java.util.Collection<java.lang.String> strCollection73 = null;
        java.util.Locale.FilteringMode filteringMode74 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList75 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList67, strCollection73, filteringMode74);
        java.util.List<java.lang.String> strList76 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList75);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode8.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh");
        org.junit.Assert.assertEquals(locale27.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertTrue("'" + category29 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category29.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u4e2d\u6587" + "'", str34, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + category41 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category41.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale42);
// flaky:         org.junit.Assert.assertEquals(locale42.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(locale57);
// flaky:         org.junit.Assert.assertEquals(locale57.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(localeList64);
        org.junit.Assert.assertNotNull(localeList65);
        org.junit.Assert.assertNotNull(languageRangeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(localeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(locale72);
        org.junit.Assert.assertTrue("'" + filteringMode74 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode74.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(strList76);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("343599900", "Chinese (China)FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)", 31);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
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
        java.lang.Object obj22 = locale19.clone();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "!i0_P0Y0M0DT0H0M0.034S");
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
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "en_GB");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "en_GB");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "en_GB");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("English (United Kingdom)", "", 335);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("FRA", 'x');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                P0Y000DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.090153");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
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
        timeZone21.setRawOffset(63);
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
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#####################################################################################################################");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "HI!                                                                                              ", (int) '4');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "zh_TW");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) 'a');
        boolean boolean17 = org.apache.commons.lang3.StringUtils.startsWithAny("HI!44444444444444444444444444444", strArray16);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.split("", "", 100);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("4444444444444444444444444444444444444444444444444444", strArray16, strArray21);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.concatWith("0 seconds", (java.lang.Object[]) strArray16);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEach("                                                hi!                                                 ", strArray9, strArray16);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEach("0 seconds", strArray2, strArray16);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4444444444444444444444444444444444444444444444444444" + "'", str22, "4444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "                                                hi!                                                 " + "'", str24, "                                                hi!                                                 ");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0 seconds" + "'", str25, "0 seconds");
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "FR", "chinois");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("United States", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaxabxaexafxakxamxanxarxasxavxayxazxbaxbexbgxbhxbixbmxbnxboxbrxbsxcaxcexchxcoxcrxcsxcuxcvxcyxdaxdexdvxdzxeexelxenxeoxesxetxeuxfaxffxfixfjxfoxfrxfyxgaxgdxglxgnxguxgvxhaxhexhixhoxhrxhtxhuxhyxhzxiaxidxiexigxiixikxinxioxisxitxiuxiwxjaxjixjvxkaxkgxkixkjxkkxklxkmxknxkoxkrxksxkuxkvxkwxkyxlaxlbxlgxlixlnxloxltxluxlvxmgxmhxmixmkxmlxmnxmoxmrxmsxmtxmyxnaxnbxndxnexngxnlxnnxnoxnrxnvxnyxocxojxomxorxosxpaxpixplxpsxptxquxrmxrnxroxruxrwxsaxscxsdxsexsgxsixskxslxsmxsnxsoxsqxsrxssxstxsuxsvxswxtaxtextgxthxtixtkxtlxtnxtoxtrxtsxttxtwxtyxugxukxurxuzxvexvixvoxwaxwoxxhxyixyoxzaxzhxzu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo xh yi yo za zh zu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("danac", "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        java.util.Locale locale3 = new java.util.Locale("zh_TW", "P0Y0-10DT07430-10.0343599900", "0 DAYS 0 HOURS 0 MINUTES 0 SECOND");
        java.lang.String str4 = locale3.getDisplayName();
        java.lang.String str5 = locale3.getDisplayName();
        java.lang.String str6 = locale3.getDisplayVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "zh_tw_P0Y0-10DT07430-10.0343599900_0 DAYS 0 HOURS 0 MINUTES 0 SECOND");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)" + "'", str4, "zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)" + "'", str5, "zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECOND" + "'", str6, "0 DAYS 0 HOURS 0 MINUTES 0 SECOND");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("   te0    ", "Chinesisch (China)", (int) 'x', 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "   tChinesisch (China)" + "'", str4, "   tChinesisch (China)");
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
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
            java.util.Locale.Builder builder13 = builder7.setRegion("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S' [at index 0]");
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
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "   ...M0.001S    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                     !I0", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\u4e2d\u570b");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getLanguage();
        java.lang.String str3 = locale1.getVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en" + "'", str2, "en");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("'P'yyyy'Y'M'M'd'DT'H'H'ZH_tw'P'yyyy'Y'M'M'd'DT'H'H'm");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("en-GB");
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.addUnicodeLocaleAttribute("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!ih!ih!...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!ih!ih!...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih [at index 0]");
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
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                     ZH_TW                      ", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ..." + "'", str2, "       ...");
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("danac");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "danac" + "'", str1, "danac");
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "un00unun_0 DAY32 0 0OUR32 0 0INUTE032 0 ECONDun000unun", "0320.000000I!  ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("anglais(Canada)", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais(Canada)" + "'", str2, "anglais(Canada)");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setUnicodeLocaleKeyword("zh_CNzhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz", "P0Y0M0DT0H0M0.121S");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: zh_CNzhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("un0", "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("P0Y000DT00000.00120", (double) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=9.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        java.util.Locale.Builder builder10 = builder7.setExtension('x', "");
        java.util.Locale.Builder builder12 = builder7.setLanguageTag("ih");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder7.setLanguage("0 DAYS 0 HOURS 0 MINUTES 0 SECOND");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 0 DAYS 0 HOURS 0 MINUTES 0 SECOND [at index 0]");
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
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("P-1Y11M30DT23H59M59.999S", "P0Y0M0DT0H0M0.003S", "          0I!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("\u6cd5\u6587\u6cd5\u56fd)", "Cine0e");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444440 DAYS 0 HOURS 0 MINUTES 0 SECO", "Chinesisch                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\u53f0\u7063", "p0y0m0dt0h0m0.090s", "P-1Y11M30DT23H59M59.998S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u53f0\u7063" + "'", str3, "\u53f0\u7063");
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
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
        int int19 = timeZone1.getOffset((long) 32);
        boolean boolean20 = timeZone1.observesDaylightTime();
        java.lang.Object obj21 = timeZone1.clone();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "sun.util.calendar.ZoneInfo[id=\"\u6cd5\u6587\u6cd5\u56fd)\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "sun.util.calendar.ZoneInfo[id=\"\u6cd5\u6587\u6cd5\u56fd)\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "sun.util.calendar.ZoneInfo[id=\"\u6cd5\u6587\u6cd5\u56fd)\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "ihihtestestestestestestP0Y0M0DT0H0M0.034S", "ng");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\uad6d\uc911\uc5b4\uad6d\uc911", ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc5b4\uad6d\uc911\uad6d\uc911(" + "'", str2, "\uc5b4\uad6d\uc911\uad6d\uc911(");
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        java.util.Locale.Builder builder9 = builder7.setLanguage("");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setScript("44444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 44444444444444444444444444444 [at index 0]");
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
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "P-1Y11M30DT23H59M59.999");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                     0:00:00.000", "P0Y0M0DT0H0M0.000S444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                     0:00:00.000" + "'", str2, "                                                                                     0:00:00.000");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 4, (-1L));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.995S" + "'", str2, "P-1Y11M30DT23H59M59.995S");
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                      hi!                                                 ", '4');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                      hi!                                                 " + "'", str3, "                                      hi!                                                 ");
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", (java.lang.CharSequence) "Chinesisch");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("P0Y0M0DT0H0M0.001S");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 52, "P0Y0M0DT0H0M0.001S", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        timeZone5.setRawOffset(9);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P0Y000DT00000.00120" + "'", str6, "P0Y000DT00000.00120");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        int int16 = timeZone13.getRawOffset();
        java.time.ZoneId zoneId17 = timeZone13.toZoneId();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getTimeZone(zoneId17);
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
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clear();
        java.util.Locale.Builder builder9 = builder3.setLanguageTag("tes");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setVariant("P0Y0-10DT07430-10.0343599900I!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: P0Y0-10DT07430-10.0343599900I! [at index 0]");
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
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\u6cd5\u6587\u6cd5\u56fd)", "           HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaap0y0m0dt0h0m0.034saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Chine0e", 0);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        java.util.Locale locale2 = new java.util.Locale("c#n", "Chinese(China)");
        org.junit.Assert.assertEquals(locale2.toString(), "c#n_CHINESE(CHINA)");
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "P-1Y11M30DT23H59M59.995S", (java.lang.CharSequence) "W");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "P-1Y11M30DT23H59M59.995S" + "'", charSequence2, "P-1Y11M30DT23H59M59.995S");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "hi!", (int) (byte) 10);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", 336, 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(24);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("44P0Y0-10DT07430-10.034359990044", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44P0Y0-10DT07430-10.034359990044" + "'", str2, "44P0Y0-10DT07430-10.034359990044");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "P0Y0M0DT0H0M0.052S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        java.lang.Iterable<java.util.Locale.LanguageRange> languageRangeIterable0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(languageRangeIterable0, "                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                        ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("fr-FR", "HI!                                                                                              ", "z");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr-FR" + "'", str3, "fr-FR");
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0 0a00", "!ih", 104);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("0days0hours0minutes0seco", "deuuuuuuuuuuuuuuuu", "                     ZH_TW                      ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0e-de", 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("Chine0e", "0I!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("P0Y0M0DT0H0M0.003S", "0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("p0y0m0dt0h0m0.041s", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p0y0m0dt0h0m0.041s" + "'", str2, "p0y0m0dt0h0m0.041s");
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("0 days", "TE0", "0:00:00.010");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("P0Y0M0DT0H0M0.100S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str1, "P0Y0M0DT0H0M0.100S");
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("P0Y0M0DT0H0M0.001S");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 52, "P0Y0M0DT0H0M0.001S", true, timeZone5);
        java.time.ZoneId zoneId7 = timeZone5.toZoneId();
        int int8 = timeZone5.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P0Y000DT00000.00120" + "'", str6, "P0Y000DT00000.00120");
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 120);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                        " + "'", str2, "                                                                                                                        ");
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("P-1Y11M30DT23H59M59.964S", " un0 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("44444444444444444444444444444444444444           HI!", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=44444444444444444444444444444444444444hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 11, "de_dede_dede_dedeng");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECON", "un0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!ih!ih!...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        boolean boolean2 = timeZone1.observesDaylightTime();
        int int3 = timeZone1.getRawOffset();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!IH#####################################################################################################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!IH#####################################################################################################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!IH#####################################################################################################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Greenwich Mean Time", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=greenwichmeantime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\u671d\u9c9c\u6587", (java.lang.CharSequence) "x");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        java.util.Locale.Builder builder10 = builder7.setExtension('x', "");
        java.util.Locale locale11 = builder7.build();
        java.util.Locale locale13 = new java.util.Locale("English (United States)");
        java.util.Locale locale16 = new java.util.Locale("                                                                                                                     !I0", "zho");
        java.lang.String str17 = locale13.getDisplayCountry(locale16);
        java.util.Locale locale18 = locale16.stripExtensions();
        java.lang.String str19 = locale18.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder7.setLocale(locale18);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language:                                                                                                                      !i0 [at index 0]");
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "_CN");
        org.junit.Assert.assertEquals(locale13.toString(), "english (united states)");
        org.junit.Assert.assertEquals(locale16.toString(), "                                                                                                                     !i0_ZHO");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "                                                                                                                     !i0_ZHO");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "und" + "'", str19, "und");
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("               ZH_TW (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               ", 153, "44P0Y0-10DT07430-10.034359990044");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44P0Y0-10DT07430-10.034359               ZH_TW (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               44P0Y0-10DT07430-10.0343599" + "'", str3, "44P0Y0-10DT07430-10.034359               ZH_TW (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               44P0Y0-10DT07430-10.0343599");
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("\u6cd5\u6587\u6cd5\u56fd)", "4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str2, "\u6cd5\u6587\u6cd5\u56fd)");
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "0days0hours0minutes0seco");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("", "0:00:00.100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.100" + "'", str2, "0:00:00.100");
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("44P0Y0-10DT07430-10.034359               ZH_TW (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               44P0Y0-10DT07430-10.0343599", "Italy");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44P0Y0-10DT07430-10.034359               ZH_TW (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               44P0Y0-10DT07430-10.0343599" + "'", str2, "44P0Y0-10DT07430-10.034359               ZH_TW (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               44P0Y0-10DT07430-10.0343599");
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        int int2 = timeZone1.getRawOffset();
        java.lang.String str3 = timeZone1.getID();
        java.time.ZoneId zoneId4 = timeZone1.toZoneId();
        java.lang.String str5 = timeZone1.getID();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GMT" + "'", str3, "GMT");
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GMT" + "'", str5, "GMT");
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.lang.String str6 = locale2.getDisplayCountry();
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale2.getDisplayScript(locale7);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("zho", ' ', 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int2 = timeZone1.getRawOffset();
        int int3 = timeZone1.getRawOffset();
        timeZone1.setID("!ih");
        boolean boolean6 = timeZone1.observesDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("de_DE", "P0Y0M0DT0H0M0.090S0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 ho", (int) (short) 0);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "de_DE" + "'", str5, "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "de_DE" + "'", str6, "de_DE");
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ih");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String str6 = languageRange1.getRange();
        java.lang.String str7 = languageRange1.getRange();
        java.lang.String str8 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih" + "'", str2, "ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih" + "'", str3, "ih");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ih" + "'", str5, "ih");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ih" + "'", str6, "ih");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ih" + "'", str7, "ih");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ih" + "'", str8, "ih");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "     4444444444444444444444444444444444444444444444444444      ", (java.lang.CharSequence) "United Kingdom");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "   TE0    ", "ja");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "0 days", (java.lang.CharSequence) "un00unun_0 DAY32 0 0OUR32 0 0INUTE032 0 ECONDun000unun");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("...chHeure de Gr...", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=...chheuredegr...");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                    !I0", "!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                    !I0" + "'", str2, "                                                                                                                    !I0");
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("HI!444444444444444444...", "                                 0 DAYS 0 HOURS 0 MINUTES 0 SECOND                                  ", "zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!444444444444444444..." + "'", str3, "HI!444444444444444444...");
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("########chinese (china)#########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale locale2 = new java.util.Locale("!ih!ih!...");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = java.util.Locale.lookupTag(languageRangeList0, (java.util.Collection<java.lang.String>) strSet3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "!ih!ih!...");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("en", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale[] localeArray6 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList7 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList7, localeArray6);
        java.util.Locale locale9 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList7);
        java.util.Locale locale10 = java.util.Locale.PRC;
        java.util.Locale locale12 = java.util.Locale.GERMANY;
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale12);
        java.lang.String str14 = locale10.getDisplayVariant(locale12);
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleKeys();
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleKeys();
        java.util.Locale locale19 = java.util.Locale.CHINESE;
        java.lang.String str20 = locale17.getDisplayName(locale19);
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray22 = new java.util.Locale[] { locale10, locale15, locale17, locale21 };
        java.util.ArrayList<java.util.Locale> localeList23 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList23, localeArray22);
        java.util.Locale locale25 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList23);
        java.util.Locale.FilteringMode filteringMode26 = null;
        java.util.List<java.util.Locale> localeList27 = java.util.Locale.filter(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList23, filteringMode26);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap28 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap28);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str20, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(locale25);
        org.junit.Assert.assertNotNull(localeList27);
        org.junit.Assert.assertNotNull(languageRangeList29);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("Chinesisch", "       P0Y0M0DT0H0M0.041S       ", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch" + "'", str3, "Chinesisch");
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("               zh              ", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     ..." + "'", str2, "     ...");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("uuuuuuuuuuuuuzh_CN", 3, "0:00:00.010");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuzh_CN" + "'", str3, "uuuuuuuuuuuuuzh_CN");
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0e-de", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      0e-de      " + "'", str2, "      0e-de      ");
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int6 = timeZone5.getRawOffset();
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 41, (long) 52, "tes", false, timeZone5);
        timeZone5.setRawOffset(104);
        java.util.TimeZone.setDefault(timeZone5);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "te0" + "'", str7, "te0");
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "Chine0e");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("P00-1Y11M30DT23H59M59.991S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("fran\347ais", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        java.util.Locale locale2 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.lang.String str5 = locale3.toLanguageTag();
        java.lang.String str6 = locale3.getCountry();
        java.lang.Object obj7 = locale3.clone();
        org.junit.Assert.assertEquals(locale2.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str4, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "zh");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "zh");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "zh");
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
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
        java.util.Locale locale33 = new java.util.Locale("English (United States)");
        java.util.Locale locale36 = new java.util.Locale("                                                                                                                     !I0", "zho");
        java.lang.String str37 = locale33.getDisplayCountry(locale36);
        java.lang.String str38 = locale36.toLanguageTag();
        java.util.Set<java.lang.String> strSet39 = locale36.getUnicodeLocaleKeys();
        java.lang.String str40 = java.util.Locale.lookupTag(languageRangeList24, (java.util.Collection<java.lang.String>) strSet39);
        java.util.Locale.Category category41 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category41, locale42);
        java.util.Locale locale44 = java.util.Locale.KOREA;
        java.util.Locale.setDefault(category41, locale44);
        java.util.Locale locale47 = java.util.Locale.CHINA;
        java.util.Locale locale48 = locale47.stripExtensions();
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale47);
        java.util.Locale.setDefault(category41, locale47);
        java.util.Locale.Category category51 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale52 = java.util.Locale.UK;
        java.util.Locale.setDefault(category51, locale52);
        java.util.Locale locale54 = java.util.Locale.getDefault(category51);
        java.util.Locale locale55 = java.util.Locale.getDefault(category51);
        java.util.Locale.setDefault(category41, locale55);
        java.util.Locale locale57 = java.util.Locale.getDefault(category41);
        java.lang.String str58 = locale57.getISO3Language();
        java.util.Set<java.lang.String> strSet59 = locale57.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags(languageRangeList24, (java.util.Collection<java.lang.String>) strSet59);
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
        org.junit.Assert.assertEquals(locale33.toString(), "english (united states)");
        org.junit.Assert.assertEquals(locale36.toString(), "                                                                                                                     !i0_ZHO");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "und" + "'", str38, "und");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + category41 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category41.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale42);
// flaky:         org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "99.00:00:0" + "'", str49, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + category51 + "' != '" + java.util.Locale.Category.FORMAT + "'", category51.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "eng" + "'", str58, "eng");
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertNotNull(strList60);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazh_TWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "      0e-de      ", "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                 P-1Y11M30DT23H59M59.947S0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", "   te0    ", 63);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("ZH_TW", "...chHeure de Gr...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("99.00:00:0", "                                               hi!#######                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "99.00:00:0" + "'", str2, "99.00:00:0");
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                P0Y000DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.090153", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("fR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fR" + "'", str1, "fR");
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Africa/AbidjanAfrica/AccraAfrica/BamakoAfrica/BanjulAfrica/BissauAfrica/CasablancaAfrica/ConakryAfrica/DakarAfrica/El_AaiunAfrica/FreetownAfrica/LomeAfrica/MonroviaAfrica/NouakchottAfrica/OuagadougouAfrica/Sao_TomeAfrica/TimbuktuAmerica/DanmarkshavnAntarctica/TrollAtlantic/CanaryAtlantic/FaeroeAtlantic/FaroeAtlantic/MadeiraAtlantic/ReykjavikAtlantic/St_HelenaEireEtc/GMTEtc/GMT+0Etc/GMT-0Etc/GMT0Etc/GreenwichEtc/UCTEtc/UTCEtc/UniversalEtc/ZuluEurope/BelfastEurope/DublinEurope/GuernseyEurope/Isle_of_ManEurope/JerseyEurope/LisbonEurope/LondonGBGB-EireGMTGMT0GreenwichIcelandPortugalUCTUTCUniversalWETZulu");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
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
            java.util.Locale.Builder builder10 = builder7.setRegion("P0Y0-10DT07430-10.0323599998");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: P0Y0-10DT07430-10.0323599998 [at index 0]");
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
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale4.getDisplayName(locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("de", "HI!44444444444444444444444444444", 224, 104);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "deHI!44444444444444444444444444444" + "'", str4, "deHI!44444444444444444444444444444");
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                     ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, (long) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.051S" + "'", str2, "P0Y0M0DT0H0M0.051S");
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "canada");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clear();
        java.util.Locale.Builder builder9 = builder3.setLanguageTag("tes");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setUnicodeLocaleKeyword("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "Chinese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx [at index 0]");
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
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        char[] charArray6 = new char[] { '4', '#' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0 days 0 hours 0 minutes 0 seconds", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!                                                                                              ", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "tes", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaap0y0m0dt0h0m0.034saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 57 + "'", int10 == 57);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "china");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("               zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               ", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str6, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("china", 57, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxchinaxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str3, "xxxxxxxxxxxxxxxxxxxxxxxxxxchinaxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        java.util.Locale locale2 = new java.util.Locale("p-1Y11M30DT23H59M59.975S", "ih");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale2.getScript();
        org.junit.Assert.assertEquals(locale2.toString(), "p-1y11m30dt23h59m59.975s_IH");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
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
        java.lang.String str31 = timeZone7.getID();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "GMT" + "'", str31, "GMT");
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("ih", "!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", "ChinesessshisssssAs\307\uc911\uad6d\uc5b4\uc911\uc911\uad6d", (int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ih" + "'", str4, "ih");
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
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
        java.lang.String str20 = timeZone13.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zoneId19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Heure de Greenwich" + "'", str20, "Heure de Greenwich");
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("english (united states)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english (united states)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ih");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String str6 = languageRange1.getRange();
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
        java.util.Locale locale20 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Set<java.lang.String> strSet22 = locale20.getUnicodeLocaleKeys();
        java.lang.String str23 = locale8.getDisplayScript(locale20);
        java.util.Set<java.lang.String> strSet24 = locale8.getUnicodeLocaleKeys();
        boolean boolean25 = languageRange1.equals((java.lang.Object) locale8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih" + "'", str2, "ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih" + "'", str3, "ih");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ih" + "'", str5, "ih");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ih" + "'", str6, "ih");
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
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "               ZH_TW (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               ", 97);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("        zh", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        zh" + "'", str2, "        zh");
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi!#######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        java.util.Locale locale2 = new java.util.Locale("!I0", "P0Y0M0DT0H0M0.034S");
        java.lang.String str3 = locale2.getLanguage();
        org.junit.Assert.assertEquals(locale2.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!i0" + "'", str3, "!i0");
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.time.ZoneId zoneId8 = timeZone5.toZoneId();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone(zoneId8);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = timeZone9.getOffset((int) 'u', 21, 3, 97, 13, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Heure de Greenwich");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.time.ZoneId zoneId8 = timeZone5.toZoneId();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone(zoneId8);
        java.util.Date date10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = timeZone9.inDaylightTime(date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Heure de Greenwich");
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\347\uc911\uad6d\uc5b4\uc911\uad6d)", "can", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int3 = timeZone1.getOffset((long) (byte) 0);
        java.util.TimeZone.setDefault(timeZone1);
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = timeZone1.inDaylightTime(date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("     ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("GMT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gmt" + "'", str1, "gmt");
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
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
            java.util.Locale.Builder builder18 = builder10.addUnicodeLocaleAttribute("aaxabxaexafxakxamxanxarxasxavxayxazxbaxbexbgxbhxbixbmxbnxboxbrxbsxcaxcexchxcoxcrxcsxcuxcvxcyxdaxdexdvxdzxeexelxenxeoxesxetxeuxfaxffxfixfjxfoxfrxfyxgaxgdxglxgnxguxgvxhaxhexhixhoxhrxhtxhuxhyxhzxiaxidxiexigxiixikxinxioxisxitxiuxiwxjaxjixjvxkaxkgxkixkjxkkxklxkmxknxkoxkrxksxkuxkvxkwxkyxlaxlbxlgxlixlnxloxltxluxlvxmgxmhxmixmkxmlxmnxmoxmrxmsxmtxmyxnaxnbxndxnexngxnlxnnxnoxnrxnvxnyxocxojxomxorxosxpaxpixplxpsxptxquxrmxrnxroxruxrwxsaxscxsdxsexsgxsixskxslxsmxsnxsoxsqxsrxssxstxsuxsvxswxtaxtextgxthxtixtkxtlxtnxtoxtrxtsxttxtwxtyxugxukxurxuzxvexvixvoxwaxwoxxhxyixyoxzaxzhxzu");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: aaxabxaexafxakxamxanxarxasxavxayxazxbaxbexbgxbhxbixbmxbnxboxbrxbsxcaxcexchxcoxcrxcsxcuxcvxcyxdaxdexdvxdzxeexelxenxeoxesxetxeuxfaxffxfixfjxfoxfrxfyxgaxgdxglxgnxguxgvxhaxhexhixhoxhrxhtxhuxhyxhzxiaxidxiexigxiixikxinxioxisxitxiuxiwxjaxjixjvxkaxkgxkixkjxkkxklxkmxknxkoxkrxksxkuxkvxkwxkyxlaxlbxlgxlixlnxloxltxluxlvxmgxmhxmixmkxmlxmnxmoxmrxmsxmtxmyxnaxnbxndxnexngxnlxnnxnoxnrxnvxnyxocxojxomxorxosxpaxpixplxpsxptxquxrmxrnxroxruxrwxsaxscxsdxsexsgxsixskxslxsmxsnxsoxsqxsrxssxstxsuxsvxswxtaxtextgxthxtixtkxtlxtnxtoxtrxtsxttxtwxtyxugxukxurxuzxvexvixvoxwaxwoxxhxyixyoxzaxzhxzu [at index 0]");
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
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.lang.String str2 = locale0.getDisplayLanguage(locale1);
        java.lang.String str3 = locale0.getDisplayScript();
        java.util.Set<java.lang.Character> charSet4 = locale0.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.UK;
        java.util.Locale.Category category7 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category7, locale8);
        java.lang.String str10 = locale8.getLanguage();
        java.lang.String str11 = locale6.getDisplayScript(locale8);
        java.util.Set<java.lang.String> strSet12 = locale8.getUnicodeLocaleKeys();
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.upperCase("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", locale8);
        java.util.Set<java.lang.Character> charSet14 = locale8.getExtensionKeys();
        java.lang.String str15 = locale0.getDisplayLanguage(locale8);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587" + "'", str2, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.FORMAT + "'", category7.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en" + "'", str10, "en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str13, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Chinese" + "'", str15, "Chinese");
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        java.util.Locale locale3 = new java.util.Locale("0:00:00.99");
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("   te0    ", locale3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("P-1Y11M30DT23H59M59.964S", locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "0:00:00.99");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "   TE0    " + "'", str5, "   TE0    ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P-1Y11M30DT23H59M59.964S" + "'", str6, "P-1Y11M30DT23H59M59.964S");
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        boolean boolean16 = timeZone13.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Chine0e(China)", 14, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chine0e(China)" + "'", str3, "Chine0e(China)");
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
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
        boolean boolean20 = locale0.hasExtensions();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setVariant("ChinesessshisssssAs\307\uc911\uad6d\uc5b4\uc911\uc911\uad6d");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ChinesessshisssssAsC?Asn???????? ????????? [at index 0]");
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
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a", "0 days 0 hours 0 minutes 0 seco", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gb" + "'", str1, "gb");
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
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
            java.util.Locale.Builder builder11 = builder9.setLanguage("0e-0:00:00.017");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 0e-0:00:00.017 [at index 0]");
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
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0e-de", "p-1y11m30dt23h59m59.979s", (int) 'a');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.020S", '4');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.020S" + "'", str3, "P0Y0M0DT0H0M0.020S");
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("p0y0m0dt0h0m0.034s", "     4444444444444444444444444444444444444444444444444444      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "eng", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        java.util.Locale locale1 = new java.util.Locale("0:00:00.99");
        java.util.Locale locale2 = java.util.Locale.ROOT;
        java.util.Locale locale5 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.lang.String str6 = locale2.getDisplayCountry(locale5);
        java.lang.String str7 = locale1.getDisplayScript(locale2);
        java.lang.String str8 = locale1.getVariant();
        java.lang.String str9 = locale1.getDisplayCountry();
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale[] localeArray13 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList14 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList14, localeArray13);
        java.util.Locale locale16 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList14);
        java.util.Collection<java.util.Locale> localeCollection17 = null;
        java.util.Locale.FilteringMode filteringMode18 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList19 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, localeCollection17, filteringMode18);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, strMap20);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, strMap22);
        boolean boolean24 = locale1.equals((java.lang.Object) strMap22);
        org.junit.Assert.assertEquals(locale1.toString(), "0:00:00.99");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertTrue("'" + filteringMode18 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode18.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList19);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        java.util.Locale locale2 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.lang.String str5 = locale3.toLanguageTag();
        java.util.Locale locale7 = java.util.Locale.UK;
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.upperCase("P0Y0-10DT07430-10.0343599900", locale7);
        java.lang.String str9 = locale7.getISO3Language();
        java.lang.String str10 = locale7.toLanguageTag();
        java.lang.String str11 = locale7.getDisplayCountry();
        java.lang.String str12 = locale3.getDisplayName(locale7);
        java.lang.String str13 = locale3.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str4, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0Y0-10DT07430-10.0343599900" + "'", str8, "P0Y0-10DT07430-10.0343599900");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "eng" + "'", str9, "eng");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-GB" + "'", str10, "en-GB");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Royaume-Uni" + "'", str11, "Royaume-Uni");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chinese" + "'", str12, "Chinese");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazh_TWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "WWWWWWWWWW", "de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazh_TWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazh_TWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P0Y0M0DT0H0M0.020S", "           HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 120);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.120" + "'", str1, "0:00:00.120");
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
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
        java.lang.Object obj36 = timeZone13.clone();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u4e2d\u6587" + "'", str22, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u4e2d\u6587" + "'", str30, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(zoneId32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                         danac                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("P0Y0M0DT0H0M0.015S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.015S" + "'", str1, "P0Y0M0DT0H0M0.015S");
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        java.util.Locale locale3 = new java.util.Locale("0et", "0                      ", "fran\347\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertEquals(locale3.toString(), "0et_0                      _fran\347\uc911\uad6d\uc5b4\uc911\uad6d)");
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim(" I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!" + "'", str1, "I!");
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("I!", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11M30DT23H59M59.990S", " un0 ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "Royaume-Uni");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 42, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587" + "'", str2, "\u4e2d\u6587");
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's" + "'", str1, "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's");
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        char[] charArray10 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\u683c\u6797\u5a01\u6cbb\u6642\u9593", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("deuuuuuuuuuuuuuuuu", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "OUhS 0 MI", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HI!                                                                                              ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                                                                                              " + "'", str2, "HI!                                                                                              ");
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "HI!                                                                                              ", (int) '4');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "zh_TW");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "!IH#####################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.lang.String str4 = locale1.getDisplayName(locale3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", locale1);
        java.util.Locale locale6 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str7 = locale6.getISO3Language();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleAttributes();
        java.lang.String str9 = locale1.getDisplayLanguage(locale6);
        java.lang.String str10 = locale6.getScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str4, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str5, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fra" + "'", str7, "fra");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fran\347ais" + "'", str9, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "44444444444444444444444444444444444444 HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("de-DE", "P0Y000DT00000.09010hiP0Y000DT00000.09010!P0Y000DT00000.09010FRAFRAFRAFRAFRAFRAFRAFRAFRAFRAFRAFRA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "un0", 23);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", (double) 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=31.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("HI!44444444444444444444444444444", '#');
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", (java.lang.Object[]) strArray5);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) 'a');
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("HI!44444444444444444444444444444", strArray13);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("", "", 100);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("4444444444444444444444444444444444444444444444444444", strArray13, strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("'P'yyyy''''d''''m''s.''", strArray5, strArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                                    !I0", strArray5);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HI!44444444444444444444444444444" + "'", str7, "HI!44444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4444444444444444444444444444444444444444444444444444" + "'", str19, "4444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "'P'yyyy''''d''''m''s.''" + "'", str20, "'P'yyyy''''d''''m''s.''");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HI!44444444444444444444444444444" + "'", str22, "HI!44444444444444444444444444444");
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("ihihtestestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm'ss's'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ihihtestestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm'ss's'" + "'", str1, "ihihtestestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm'ss's'");
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "xChinesischxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        boolean boolean2 = timeZone1.observesDaylightTime();
        boolean boolean3 = timeZone1.observesDaylightTime();
        boolean boolean4 = timeZone1.observesDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray10 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence2, charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("hi!#######", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("0320.000000I!                                                                                              ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clear();
        java.util.Locale.Builder builder9 = builder3.setLanguageTag("tes");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder3.setUnicodeLocaleKeyword("0:00:00.00", "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 0:00:00.00 [at index 0]");
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
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "DE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.99", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0M0DT0H0M0.001S");
        java.lang.String str2 = timeZone1.getID();
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = timeZone1.inDaylightTime(date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GMT" + "'", str2, "GMT");
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon", "\uad6d\uc911\uc5b4\uad6d\uc911sia\347narf)anihc( esenihc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon" + "'", str2, "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        int int2 = timeZone1.getRawOffset();
        int int3 = timeZone1.getRawOffset();
        timeZone1.setID("0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
        java.util.TimeZone.setDefault(timeZone1);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("   ...M0.001S    ", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   ...M0.001S    " + "'", str2, "   ...M0.001S    ");
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                4P404Y404M404DT404H404M404.40904Shi4P404Y404M404DT404H404M404.40904S4!4P404Y404M404DT404H404M404.40904S4                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4P404Y404M404DT404H404M404.40904Shi4P404Y404M404DT404H404M404.40904S4!4P404Y404M404DT404H404M404.40904S4" + "'", str1, "4P404Y404M404DT404H404M404.40904Shi4P404Y404M404DT404H404M404.40904S4!4P404Y404M404DT404H404M404.40904S4");
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        java.util.Locale locale1 = new java.util.Locale("P0Y0M0DT0H0M0.090S");
        java.util.Locale locale4 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.lang.String str6 = locale4.getDisplayName(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayLanguage(locale5);
        java.util.Locale locale9 = locale5.stripExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "p0y0m0dt0h0m0.090s");
        org.junit.Assert.assertEquals(locale4.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str6, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh" + "'", str7, "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "p0y0m0dt0h0m0.090s" + "'", str8, "p0y0m0dt0h0m0.090s");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("ng", 19, "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                 ng" + "'", str3, "                 ng");
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "!I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 19, "tes", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "te0" + "'", str3, "te0");
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                    ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("4444444444444444P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S444444444444444444444444", "\uad6d\uc911\uc5b4\uad6d\uc911", "                                                hi!                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S444444444444444444444444" + "'", str3, "4444444444444444P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S444444444444444444444444");
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "OUhS 0 MI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        java.util.Locale locale2 = new java.util.Locale("00dt00000.090153HIp0y000dt00000.090153!p0y000dt00000.090153", "GB");
        org.junit.Assert.assertEquals(locale2.toString(), "00dt00000.090153hip0y000dt00000.090153!p0y000dt00000.090153_GB");
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                                     !i0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       P0Y0M0DT0H0M0.041S       ", "", (int) 'x');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        java.util.Locale locale1 = new java.util.Locale("0:00:00.99");
        java.util.Locale locale2 = java.util.Locale.ROOT;
        java.util.Locale locale5 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.lang.String str6 = locale2.getDisplayCountry(locale5);
        java.lang.String str7 = locale1.getDisplayScript(locale2);
        java.util.Locale locale10 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.lang.String str11 = locale1.getDisplayName(locale10);
        java.lang.String str12 = locale10.getDisplayLanguage();
        boolean boolean14 = locale10.equals((java.lang.Object) "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals(locale1.toString(), "0:00:00.99");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals(locale10.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.99" + "'", str11, "0:00:00.99");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                  ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)", "44444444444444444444444444444444444444 HI!", "aaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)" + "'", str3, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("p-1y11m30dt23h59m59.979s", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
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
        java.util.Collection<java.lang.String> strCollection48 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap50 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList51 = java.util.Locale.LanguageRange.parse("en", strMap50);
        java.util.Locale.LanguageRange[] languageRangeArray52 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList53 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53, languageRangeArray52);
        java.util.Locale[] localeArray55 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList56 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList56, localeArray55);
        java.util.Locale locale58 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, (java.util.Collection<java.util.Locale>) localeList56);
        java.util.Locale locale59 = java.util.Locale.PRC;
        java.util.Locale locale61 = java.util.Locale.GERMANY;
        java.lang.String str62 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale61);
        java.lang.String str63 = locale59.getDisplayVariant(locale61);
        java.util.Locale locale64 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet65 = locale64.getUnicodeLocaleKeys();
        java.util.Locale locale66 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet67 = locale66.getUnicodeLocaleKeys();
        java.util.Locale locale68 = java.util.Locale.CHINESE;
        java.lang.String str69 = locale66.getDisplayName(locale68);
        java.util.Locale locale70 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray71 = new java.util.Locale[] { locale59, locale64, locale66, locale70 };
        java.util.ArrayList<java.util.Locale> localeList72 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList72, localeArray71);
        java.util.Locale locale74 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, (java.util.Collection<java.util.Locale>) localeList72);
        java.util.Locale.FilteringMode filteringMode75 = null;
        java.util.List<java.util.Locale> localeList76 = java.util.Locale.filter(languageRangeList51, (java.util.Collection<java.util.Locale>) localeList72, filteringMode75);
        java.util.Locale locale77 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet78 = locale77.getUnicodeLocaleKeys();
        java.util.Locale locale79 = java.util.Locale.CHINESE;
        java.lang.String str80 = locale77.getDisplayName(locale79);
        java.lang.String str81 = locale79.getLanguage();
        java.util.Set<java.lang.String> strSet82 = locale79.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray83 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList84 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList84, languageRangeArray83);
        java.util.Locale[] localeArray86 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList87 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList87, localeArray86);
        java.util.Locale locale89 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList84, (java.util.Collection<java.util.Locale>) localeList87);
        java.util.Collection<java.lang.String> strCollection90 = null;
        java.util.Locale.FilteringMode filteringMode91 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList92 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList84, strCollection90, filteringMode91);
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags(languageRangeList51, (java.util.Collection<java.lang.String>) strSet82, filteringMode91);
        java.util.List<java.lang.String> strList94 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection48, filteringMode91);
        java.lang.String str96 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "'P'yyyy''''d''''m''s.''");
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
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "");
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
        org.junit.Assert.assertNotNull(languageRangeList51);
        org.junit.Assert.assertNotNull(languageRangeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(localeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(locale58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str69, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNull(locale74);
        org.junit.Assert.assertNotNull(localeList76);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet78);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str80, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "zh" + "'", str81, "zh");
        org.junit.Assert.assertNotNull(strSet82);
        org.junit.Assert.assertNotNull(languageRangeArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(localeArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(locale89);
        org.junit.Assert.assertTrue("'" + filteringMode91 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode91.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertNotNull(strList93);
        org.junit.Assert.assertNotNull(strList94);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                               hi!#######                                               ", 104, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 47 + "'", int3 == 47);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\uc77c\ubcf8\uc5b4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("4444444444444444444444444444444444444444444444444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = timeZone1.getDisplayName(false, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0320.000000I!  ...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("               zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               ", "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", "'P'yyyy''''d''''m''s.''");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
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
        boolean boolean39 = locale1.equals((java.lang.Object) "Chine0e");
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
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "");
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hi!", "P0Y000DT00000.09010hiP0Y000DT00000.09010!P0Y000DT00000.09010");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
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
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.lang.String str15 = locale12.getDisplayName(locale14);
        java.lang.String str16 = locale14.getLanguage();
        java.util.Set<java.lang.String> strSet17 = locale14.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet17);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Locale[] localeArray22 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList23 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList23, localeArray22);
        java.util.Locale locale25 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList23);
        java.util.Collection<java.util.Locale> localeCollection26 = null;
        java.util.Locale.FilteringMode filteringMode27 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList28 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, localeCollection26, filteringMode27);
        java.util.Locale locale31 = new java.util.Locale("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECON", "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's");
        java.util.Set<java.lang.String> strSet32 = locale31.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strSet32);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Locale[] localeArray37 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList38 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList38, localeArray37);
        java.util.Locale locale40 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.Locale locale41 = java.util.Locale.PRC;
        java.util.Locale locale43 = java.util.Locale.GERMANY;
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale43);
        java.lang.String str45 = locale41.getDisplayVariant(locale43);
        java.util.Locale.Category category46 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category46, locale47);
        java.util.Set<java.lang.String> strSet49 = locale47.getUnicodeLocaleKeys();
        java.util.Locale locale50 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet51 = locale50.getUnicodeLocaleKeys();
        java.util.Locale locale52 = java.util.Locale.CHINA;
        java.util.Locale locale53 = locale52.stripExtensions();
        java.lang.String str54 = locale52.getDisplayLanguage();
        java.util.Locale locale55 = java.util.Locale.CHINA;
        java.util.Locale locale56 = locale55.stripExtensions();
        java.util.Locale locale57 = java.util.Locale.FRANCE;
        java.util.Locale locale58 = java.util.Locale.TAIWAN;
        java.util.Locale locale59 = java.util.Locale.getDefault();
        java.lang.String str60 = locale59.getDisplayVariant();
        java.util.Locale locale61 = java.util.Locale.CHINA;
        java.util.Locale locale62 = locale61.stripExtensions();
        java.lang.String str63 = locale61.getDisplayLanguage();
        java.util.Locale locale64 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet65 = locale64.getUnicodeLocaleKeys();
        java.util.Locale locale66 = java.util.Locale.CHINESE;
        java.lang.String str67 = locale64.getDisplayName(locale66);
        java.lang.String str68 = locale66.getCountry();
        java.util.Locale[] localeArray69 = new java.util.Locale[] { locale43, locale47, locale50, locale52, locale55, locale57, locale58, locale59, locale61, locale66 };
        java.util.ArrayList<java.util.Locale> localeList70 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList70, localeArray69);
        java.util.Locale.FilteringMode filteringMode72 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList73 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.util.Locale>) localeList70, filteringMode72);
        java.util.List<java.util.Locale> localeList74 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.Locale.LanguageRange[] languageRangeArray75 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList76 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList76, languageRangeArray75);
        java.util.Locale[] localeArray78 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList79 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList79, localeArray78);
        java.util.Locale locale81 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList76, (java.util.Collection<java.util.Locale>) localeList79);
        java.util.Collection<java.util.Locale> localeCollection82 = null;
        java.util.Locale.FilteringMode filteringMode83 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList84 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList76, localeCollection82, filteringMode83);
        java.util.Locale.LanguageRange[] languageRangeArray85 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList86 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList86, languageRangeArray85);
        java.util.Locale[] localeArray88 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList89 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList89, localeArray88);
        java.util.Locale locale91 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList86, (java.util.Collection<java.util.Locale>) localeList89);
        java.util.Locale.Category category92 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale93 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category92, locale93);
        java.util.Set<java.lang.String> strSet95 = locale93.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList96 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList86, (java.util.Collection<java.lang.String>) strSet95);
        java.util.Locale.FilteringMode filteringMode97 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList98 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList76, (java.util.Collection<java.lang.String>) strSet95, filteringMode97);
        java.util.List<java.util.Locale> localeList99 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList73, filteringMode97);
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
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str15, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh" + "'", str16, "zh");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(locale25);
        org.junit.Assert.assertTrue("'" + filteringMode27 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode27.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList28);
        org.junit.Assert.assertEquals(locale31.toString(), "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon_'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(locale40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + category46 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category46.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Chinese" + "'", str54, "Chinese");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Chinese" + "'", str63, "Chinese");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str67, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(localeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + filteringMode72 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode72.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList73);
        org.junit.Assert.assertNotNull(localeList74);
        org.junit.Assert.assertNotNull(languageRangeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(localeArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(locale81);
        org.junit.Assert.assertTrue("'" + filteringMode83 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode83.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList84);
        org.junit.Assert.assertNotNull(languageRangeArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(localeArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNull(locale91);
        org.junit.Assert.assertTrue("'" + category92 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category92.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale93);
        org.junit.Assert.assertEquals(locale93.toString(), "");
        org.junit.Assert.assertNotNull(strSet95);
        org.junit.Assert.assertNotNull(strList96);
        org.junit.Assert.assertTrue("'" + filteringMode97 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode97.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList98);
        org.junit.Assert.assertNotNull(localeList99);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "                                         ", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                         " + "'", str3, "                                         ");
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a00", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!HI" + "'", str1, "eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!HI");
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 335);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a00");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
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
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, ' ');
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap27);
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Locale[] localeArray32 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList33 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList33, localeArray32);
        java.util.Locale locale35 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.util.Locale>) localeList33);
        java.util.Locale locale36 = java.util.Locale.PRC;
        java.util.Locale locale38 = java.util.Locale.GERMANY;
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale38);
        java.lang.String str40 = locale36.getDisplayVariant(locale38);
        java.util.Locale locale41 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleKeys();
        java.util.Locale locale43 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet44 = locale43.getUnicodeLocaleKeys();
        java.util.Locale locale45 = java.util.Locale.CHINESE;
        java.lang.String str46 = locale43.getDisplayName(locale45);
        java.util.Locale locale47 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray48 = new java.util.Locale[] { locale36, locale41, locale43, locale47 };
        java.util.ArrayList<java.util.Locale> localeList49 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList49, localeArray48);
        java.util.Locale locale51 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.util.Locale>) localeList49);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap52 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList53 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, strMap52);
        java.util.Locale locale54 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet55 = locale54.getUnicodeLocaleKeys();
        java.lang.String str56 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.lang.String>) strSet55);
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet55);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(localeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(locale35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str46, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(locale51);
        org.junit.Assert.assertNotNull(languageRangeList53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(strList57);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Germany", "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("...INUTES 0 SECOND)", 14, 13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "... 0 SECOND)" + "'", str3, "... 0 SECOND)");
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444zh_tw", "zh_tw");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444de_DE4444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        int int6 = timeZone5.getRawOffset();
        java.lang.String str7 = timeZone5.getID();
        java.time.ZoneId zoneId8 = timeZone5.toZoneId();
        java.lang.String str9 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 1L, "\u6cd5\u6587\u6cd5\u56fd)", false, timeZone5);
        java.lang.String str10 = timeZone5.getID();
        boolean boolean11 = timeZone5.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GMT" + "'", str7, "GMT");
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str9, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GMT" + "'", str10, "GMT");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("stestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'nglish (United Kingdom)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "stestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'nglish (United Kingdom)" + "'", str1, "stestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'nglish (United Kingdom)");
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("P-1Y11030DT23059059.99914", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11030DT23059059.99914" + "'", str2, "P-1Y11030DT23059059.99914");
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("OURS 0 MI");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ours0mi");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\u4e2d\u6587", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "ng");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ZH_TW", 318);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                          44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ZH_TW" + "'", str2, "                                                                                                                                                                                                                          44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ZH_TW");
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("P0Y0M0DT0H0M0.100S", "can");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "can" + "'", str2, "can");
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("     ...", "!IH#####################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     ..." + "'", str2, "     ...");
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih ", "0 seconds");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("               zh               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh" + "'", str1, "zh");
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("P0Y0M0DT0H0M0.000S444444", 224, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuP0Y0M0DT0H0M0.000S444444uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuP0Y0M0DT0H0M0.000S444444uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih ", "de_DE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("p0y0m0dt0h0m0.041s", 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p0y0m0dt0h0m0.041s                              " + "'", str2, "p0y0m0dt0h0m0.041s                              ");
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!" + "'", str3, "I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!Chinesisch (Chin )I!");
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("english (united states)", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tes)aenglish (united st" + "'", str2, "tes)aenglish (united st");
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str1, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setLanguageTag("t00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: t00 [at index 0]");
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
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!44444444444444444444444444444", '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "HI!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "44444444444444444444444444444" + "'", str7, "44444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "44444444444444444444444444444" + "'", str8, "44444444444444444444444444444");
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("P0Y0M0DT0H0M0.019S");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                      hi!                                                 ", "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECON");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("               zh               ", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               zh               " + "'", str2, "               zh               ");
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\u6cd5\u6587\u6cd5\u56fd)", 0, 48);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder7 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale locale10 = builder8.build();
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
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("P-1Y11M30DT23H59M59.975S", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
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
        int int21 = timeZone6.getOffset((long) 335);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P00-1Y11M30DT23H59M59.991S");
        boolean boolean2 = timeZone1.observesDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi!#######", "Greenwich Zeit", "0:00:00.017");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                                                                                                          44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ZH_TW", (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("p0y000dt00000.0230");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=p0y000dt00000.0230");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", "Engli0h (Unite0 120tate0)", (int) 'u', 336);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'Engli0h (Unite0 120tate0)" + "'", str4, "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'Engli0h (Unite0 120tate0)");
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JA" + "'", str1, "JA");
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
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
        java.util.Locale locale22 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
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
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_GB");
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S444444444444444444444444", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S444444444444444444444444" + "'", str2, "4444444444444444P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S444444444444444444444444");
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...canada!ih!ih!...", "CN", 120);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int10 = timeZone9.getRawOffset();
        java.lang.String str11 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y0M0DT0H0M0.023S", false, timeZone9);
        java.lang.String str12 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) 'x', "CAN", true, timeZone9);
        java.time.ZoneId zoneId13 = timeZone9.toZoneId();
        int int15 = timeZone9.getOffset((long) (short) 100);
        int int16 = timeZone9.getRawOffset();
        int int17 = timeZone9.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y000DT00000.0230" + "'", str11, "P0Y000DT00000.0230");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CAN" + "'", str12, "CAN");
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) 'a');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("P0Y0M0DT0H0M0.121S", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!ih!ih!...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "ihihtestestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm'ss's'", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                     !I0", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ..." + "'", str2, " ...");
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.079S" + "'", str2, "P0Y0M0DT0H0M0.079S");
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int2 = timeZone1.getRawOffset();
        int int4 = timeZone1.getOffset(100L);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx...chHeure de Gr...xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", (java.lang.CharSequence) "0 0a00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 119 + "'", int2 == 119);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.lang.String str2 = locale0.getVariant();
        java.util.Locale.Category category3 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category3, locale4);
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale4.getDisplayCountry(locale6);
        java.lang.String str8 = locale0.getDisplayLanguage(locale4);
        java.lang.String str9 = locale0.getISO3Language();
        java.lang.String str10 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinese" + "'", str8, "Chinese");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zho" + "'", str9, "zho");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh-CN" + "'", str10, "zh-CN");
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("0e-DE", "OURS 0 MI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0e-DE" + "'", str2, "0e-DE");
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)", "EN-GB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("       p0y0m0dt0h0m0.041s       ", " #####################################################################################################################  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       p0y0m0dt0h0m0.041s       " + "'", str2, "       p0y0m0dt0h0m0.041s       ");
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
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
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, "!ih");
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Locale[] localeArray16 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList17 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList17, localeArray16);
        java.util.Locale locale19 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.util.Locale>) localeList17);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList14, 'a');
        java.util.Locale locale23 = new java.util.Locale("");
        java.lang.String str24 = locale23.getScript();
        java.util.Locale locale25 = java.util.Locale.CHINESE;
        java.util.Locale locale28 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.util.Locale locale29 = java.util.Locale.ROOT;
        java.util.Locale.Category category30 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category30, locale31);
        java.util.Locale locale33 = java.util.Locale.CHINA;
        java.util.Locale locale34 = java.util.Locale.PRC;
        java.lang.String str35 = locale33.getDisplayLanguage(locale34);
        java.util.Locale locale36 = java.util.Locale.CHINA;
        java.util.Locale locale37 = java.util.Locale.PRC;
        java.util.Locale locale39 = java.util.Locale.GERMANY;
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale39);
        java.lang.String str41 = locale37.getDisplayVariant(locale39);
        java.util.Locale.Category category42 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category42, locale43);
        java.util.Locale locale45 = java.util.Locale.CHINESE;
        java.util.Locale locale46 = java.util.Locale.PRC;
        java.util.Locale locale48 = java.util.Locale.GERMANY;
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale48);
        java.lang.String str50 = locale46.getDisplayVariant(locale48);
        java.util.Locale locale51 = java.util.Locale.CHINA;
        java.util.Locale locale52 = java.util.Locale.ITALY;
        java.util.Locale locale53 = java.util.Locale.PRC;
        java.util.Locale locale55 = java.util.Locale.GERMANY;
        java.lang.String str56 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale55);
        java.lang.String str57 = locale53.getDisplayVariant(locale55);
        java.util.Locale locale58 = java.util.Locale.getDefault();
        java.util.Locale locale59 = java.util.Locale.ROOT;
        java.lang.String str60 = locale59.getLanguage();
        java.util.Locale locale61 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray62 = new java.util.Locale[] { locale23, locale25, locale28, locale29, locale31, locale34, locale36, locale37, locale43, locale45, locale46, locale51, locale52, locale53, locale58, locale59, locale61 };
        java.util.ArrayList<java.util.Locale> localeList63 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList63, localeArray62);
        java.util.List<java.util.Locale> localeList65 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.util.Locale>) localeList63);
        java.util.List<java.util.Locale> localeList66 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList63);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale67 = java.util.Locale.lookup(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList63);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh");
        org.junit.Assert.assertEquals(locale28.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertTrue("'" + category30 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category30.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u4e2d\u6587" + "'", str35, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + category42 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category42.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(localeList65);
        org.junit.Assert.assertNotNull(localeList66);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("4444444444444444444444444444444444444444444444444444444444444444444440 DAYS 0 HOURS 0 MINUTES 0 SECO");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeZone1.getOffset(48, (int) (byte) 100, 153, 17, 5, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left(" DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECON", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " DAYS 0 HO" + "'", str2, " DAYS 0 HO");
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
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
        boolean boolean20 = timeZone13.observesDaylightTime();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)", " DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECON");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("ANGLAIS (CANADA)");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("de-DE", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!IHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("P-1Y11M30DT23H59M59.975S", "0:00:00.99", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("P-1Y11M30DT23H59M59.995S", "", (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("     444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     444444444444444444444444444..." + "'", str1, "     444444444444444444444444444...");
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\u683c\u6797\u5a01\u6cbb\u6642\u9593", 52, "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u683c\u6797\u5a01\u6cbb\u6642\u9593" + "'", str3, "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category1, locale2);
        java.lang.String str4 = locale2.getLanguage();
        java.lang.String str5 = locale2.getISO3Language();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("de_DEde_DEde_DEdeng", locale2);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale9 = builder7.build();
        java.util.Locale.Builder builder10 = builder7.clear();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        boolean boolean14 = locale2.equals((java.lang.Object) builder12);
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eng" + "'", str5, "eng");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "de_dede_dede_dedeng" + "'", str6, "de_dede_dede_dedeng");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("0et", "fr-FR", 318);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0et" + "'", str3, "0et");
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("fran\347ais");
        java.lang.String str2 = locale1.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        char[] charArray10 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "de-DE", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0danaC:danaC00danaC:danaC00danaC.danaC097", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097", "HI!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097" + "'", str4, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097" + "'", str6, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097");
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("!i0 (P0Y0M0DT0H0M0.034S)", "P-1Y11M30DT23H59M59.975S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                               hi!#######                                               ", 7, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                               hi!#######                                               " + "'", str3, "                                               hi!#######                                               ");
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11M30DT23H59M59.990S");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "0e-de");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("uuuuuuuuuuuuuzh_CN", 13, "ChinesessshisssssAs\307\uc911\uad6d\uc5b4\uc911\uc911\uad6d");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuzh_CN" + "'", str3, "uuuuuuuuuuuuuzh_CN");
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u6cd5\u6587\u6cd5\u56fd)", 'a');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!ih!ih!...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", (int) (short) 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("eng", strArray4, strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "eng" + "'", str10, "eng");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str12, "\u6cd5\u6587\u6cd5\u56fd)");
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Heure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de Greenwich", 31, "0320.000000I!                                                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Heure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de Greenwich" + "'", str3, "Heure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de Greenwich");
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("44p0y0m0dt0h0m0.090s4444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444de_DE4444444444444444444444444444444444444444444444444444444444", "chinois", (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("anglais (Canada)", "can", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("cancancancancancancancancancancancancancancancancancancancancancancancancancancancancancancan0:00:00.089", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cancancancancancancancancancancancancancancancancancancancancancancancancancancancancancancan0:00:00.089" + "'", str2, "cancancancancancancancancancancancancancancancancancancancancancancancancancancancancancancan0:00:00.089");
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("0:00:00.002", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.002" + "'", str2, "0:00:00.002");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("!ih#######", "000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("CHN", "eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHN" + "'", str2, "CHN");
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("00DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.090153");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.09015" + "'", str1, "00DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.09015");
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaChinese (China)aaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", "te0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'" + "'", str2, "!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        java.util.Locale locale3 = new java.util.Locale("", "", "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
        java.lang.String str4 = locale3.getISO3Country();
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale5.getDisplayName(locale7);
        java.lang.String str9 = locale7.getLanguage();
        java.util.Set<java.lang.String> strSet10 = locale7.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet11 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale7.getScript();
        java.lang.String str13 = locale3.getDisplayName(locale7);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str8, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh" + "'", str9, "zh");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon" + "'", str13, "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("fran\347\uc911\uad6d\uc5b4\uc911\uad6d)", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr4n\347\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str3, "fr4n\347\uc911\uad6d\uc5b4\uc911\uad6d)");
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("P0Y000DT00000.09010hiP0Y000DT00000.09010!P0Y000DT00000.09010FRAFRAFRAFRAFRAFRAFRAFRAFRAFRAFRAFRA", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.09010hiP0Y000DT00000.09010!P0Y000DT00000.09010FRAFRAFRAFRAFRAFRAFRAFRAFRAFRAFRAFRA" + "'", str2, "P0Y000DT00000.09010hiP0Y000DT00000.09010!P0Y000DT00000.09010FRAFRAFRAFRAFRAFRAFRAFRAFRAFRAFRAFRA");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("uNITED STATES", 70, "0:00:00.017");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:uNITED STATES" + "'", str3, "0:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:uNITED STATES");
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("dnu", "FRA", "                     ZH_TW                      ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("44444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444" + "'", str1, "44444444444444444444444444444");
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("P-1Y11M30DT23H59M59.998S", "P0Y0M0DT0H0M0.052S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0:00:00.010", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("99.00:00:0");
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale4);
        java.lang.String str7 = locale1.getDisplayVariant(locale4);
        java.lang.Object obj8 = locale4.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "99.00:00:0" + "'", str6, "99.00:00:0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "zh_CN");
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("0 days 0 hours 0 minutes 0 seco", "P0Y0M0DT0H0M0.097S", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seco" + "'", str3, "0 days 0 hours 0 minutes 0 seco");
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
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
            java.util.Locale.Builder builder14 = builder12.setVariant("\u4e2d\u6587_                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ??_                                                                                                     [at index 0]");
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
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Chinesisch (China)", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Canada", (int) (short) -1, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Canada" + "'", str3, "Canada");
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale3.getDisplayLanguage(locale4);
        java.lang.String str6 = locale1.getDisplayLanguage(locale4);
        java.util.Locale locale9 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.lang.String str10 = locale4.getDisplayVariant(locale9);
        java.lang.String str11 = locale9.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale9.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for                                                                                                     ");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587" + "'", str5, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals(locale9.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u6587" + "'", str11, "\u4e2d\u6587");
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setScript("de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("0:00:00.00", 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.00" + "'", str2, "0:00:00.00");
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "00DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.090153", (java.lang.CharSequence) "0I!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "00DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.090153" + "'", charSequence2, "00DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.090153");
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("de_zh_tw (P0Y0-10DT07430-10.0343", "44444444444444444444444444444444444444 HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de_zh_tw (P0Y0-10DT07430-10.0343" + "'", str2, "de_zh_tw (P0Y0-10DT07430-10.0343");
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("P-1Y11M30DT23H59M59.975S", 318);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        java.time.ZoneId zoneId16 = timeZone13.toZoneId();
        timeZone13.setRawOffset(52);
        boolean boolean19 = timeZone13.observesDaylightTime();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "gmt");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str2, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder17.addUnicodeLocaleAttribute("!ih!ih!...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: !ih!ih!... [at index 0]");
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
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "\u683c\u6797\u5a01\u6cbb\u6642\u9593", (java.lang.CharSequence) "CHN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("4444444444444444444444444444444444444444444444444444");
        java.lang.String str2 = timeZone1.getID();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GMT" + "'", str2, "GMT");
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\u53f0\u7063");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u7063\u53f0" + "'", str1, "\u7063\u53f0");
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(10L, (long) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.991S" + "'", str2, "P-1Y11M30DT23H59M59.991S");
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", "P0Y0-10DT07430-10.1213599678", 119, 21);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H!ih!ih!ih!ih!ih!ih!iP0Y0-10DT07430-10.1213599678" + "'", str4, "H!ih!ih!ih!ih!ih!ih!iP0Y0-10DT07430-10.1213599678");
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("zh", "                     ZH_TW                      ", 96);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaap0y0m0dt0h0m0.034saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaap0y0m0dt0h0m0.034saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaap0y0m0dt0h0m0.034saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("zh_CN", "de_DE", 19);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
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
        java.lang.String str13 = locale7.getScript();
        java.lang.String str14 = locale7.getDisplayName();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "anglais (Royaume-Uni)" + "'", str14, "anglais (Royaume-Uni)");
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str2, "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("English (United States)", "stestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("P0Y0M0DT0H0M0.031S", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("P-1Y11M30DT23H59M59.999S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=p-1y11m30dt23h59m59.999s");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("     444444444444444444444444444...", "c#n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     444444444444444444444444444..." + "'", str2, "     444444444444444444444444444...");
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        java.lang.String[] strArray1 = java.util.Locale.getISOLanguages();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4', (int) 'a', (int) '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ');
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih", "HI!");
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("P0Y0M0DT0H0M0.100S", strArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach(" #####################################################################################################################  ", strArray1, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 188 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo xh yi yo za zh zu" + "'", str7, "aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo xh yi yo za zh zu");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\u6cd5\u6587\u6cd5\u56fd))", "P0Y0M0DT0H0M0.079S");
// flaky:         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Chinesisch                                                                                          ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinesisch" + "'", str2, "Chinesisch");
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 23);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.023" + "'", str1, "0:00:00.023");
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaTE0abTE0aeTE0afTE0akTE0amTE0anTE0arTE0asTE0avTE0ayTE0azTE0baTE0beTE0bgTE0bhTE0biTE0bmTE0bnTE0boTE0brTE0bsTE0caTE0ceTE0chTE0coTE0crTE0csTE0cuTE0cvTE0cyTE0daTE0deTE0dvTE0dzTE0eeTE0elTE0enTE0eoTE0esTE0etTE0euTE0faTE0ffTE0fiTE0fjTE0foTE0frTE0fyTE0gaTE0gdTE0glTE0gnTE0guTE0gvTE0haTE0heTE0hiTE0hoTE0hrTE0htTE0huTE0hyTE0hzTE0iaTE0idTE0ieTE0igTE0iiTE0ikTE0inTE0ioTE0isTE0itTE0iuTE0iwTE0jaTE0jiTE0jvTE0kaTE0kgTE0kiTE0kjTE0kkTE0klTE0kmTE0knTE0koTE0krTE0ksTE0kuTE0kvTE0kwTE0kyTE0laTE0lbTE0lgTE0liTE0lnTE0loTE0ltTE0luTE0lvTE0mgTE0mhTE0miTE0mkTE0mlTE0mnTE0moTE0mrTE0msTE0mtTE0myTE0naTE0nbTE0ndTE0neTE0ngTE0nlTE0nnTE0noTE0nrTE0nvTE0nyTE0ocTE0ojTE0omTE0orTE0osTE0paTE0piTE0plTE0psTE0ptTE0quTE0rmTE0rnTE0roTE0ruTE0rwTE0saTE0scTE0sdTE0seTE0sgTE0siTE0skTE0slTE0smTE0snTE0soTE0sqTE0srTE0ssTE0stTE0suTE0svTE0swTE0taTE0teTE0tgTE0thTE0tiTE0tkTE0tlTE0tnTE0toTE0trTE0tsTE0ttTE0twTE0tyTE0ugTE0ukTE0urTE0uzTE0veTE0viTE0voTE0waTE0woTE0xhTE0yiTE0yoTE0zaTE0zhTE0zu");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        java.util.Locale locale2 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.util.Locale locale5 = new java.util.Locale("                                                                                                                     !I0", "zho");
        java.lang.String str6 = locale2.getDisplayScript(locale5);
        java.lang.String str7 = locale2.getLanguage();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale locale9 = builder8.build();
        java.util.Locale.setDefault(locale9);
        java.util.Locale locale11 = java.util.Locale.CHINA;
        java.util.Locale locale12 = java.util.Locale.PRC;
        java.lang.String str13 = locale11.getDisplayLanguage(locale12);
        java.lang.String str14 = locale9.getDisplayLanguage(locale12);
        java.util.Locale locale17 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.lang.String str18 = locale12.getDisplayVariant(locale17);
        java.lang.String str19 = locale2.getDisplayVariant(locale17);
        java.lang.String str20 = locale17.getDisplayScript();
        org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals(locale5.toString(), "                                                                                                                     !i0_ZHO");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587" + "'", str13, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale17.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("xChinesischxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "                       danac                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        char[] charArray11 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("zh", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("p0y0m0dt0h0m0.010s", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 41 + "'", int13 == 41);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
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
        java.util.Locale locale15 = java.util.Locale.CHINA;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale15);
        boolean boolean18 = locale15.hasExtensions();
        java.lang.String str19 = locale15.getScript();
        java.lang.String str20 = locale2.getDisplayName(locale15);
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
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "99.00:00:0" + "'", str17, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u4e2d\u6587" + "'", str20, "\u4e2d\u6587");
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\u671d\u9c9c\u6587");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u671d\u9c9c\u6587" + "'", str1, "\u671d\u9c9c\u6587");
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0 0a00", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("I!Chine0ich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!Chine0ich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!" + "'", str2, "I!Chine0ich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!");
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
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
        java.lang.String str26 = locale20.getCountry();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "CA" + "'", str26, "CA");
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("English", 24, 224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'" + "'", str2, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Africa/AbidjanAfrica/AccraAfrica/BamakoAfrica/BanjulAfrica/BissauAfrica/CasablancaAfrica/ConakryAfrica/DakarAfrica/El_AaiunAfrica/FreetownAfrica/LomeAfrica/MonroviaAfrica/NouakchottAfrica/OuagadougouAfrica/Sao_TomeAfrica/TimbuktuAmerica/DanmarkshavnAntarctica/TrollAtlantic/CanaryAtlantic/FaeroeAtlantic/FaroeAtlantic/MadeiraAtlantic/ReykjavikAtlantic/St_HelenaEireEtc/GMTEtc/GMT+0Etc/GMT-0Etc/GMT0Etc/GreenwichEtc/UCTEtc/UTCEtc/UniversalEtc/ZuluEurope/BelfastEurope/DublinEurope/GuernseyEurope/Isle_of_ManEurope/JerseyEurope/LisbonEurope/LondonGBGB-EireGMTGMT0GreenwichIcelandPortugalUCTUTCUniversalWETZulu", "Engli0h (Unite0 120tate0)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\u671d\u9c9c\u6587");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u671d\u9c9c\u6587" + "'", str1, "\u671d\u9c9c\u6587");
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        char[] charArray7 = new char[] { '4', '#' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0 days 0 hours 0 minutes 0 seconds", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!                                                                                              ", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "CAN", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "P-1Y11M30DT23H59M59.975S", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "               zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, #]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "\uad6d\uc911\uc5b4\uad6d\uc911sia\347narf)anihc( esenihc", (java.lang.CharSequence) "FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!IHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "                                                                                                                                                                                                                                                                                                                              p0y0m0dt0h0m0.090s", (int) 'a');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) (byte) 0);
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Africa/AbidjanAfrica/AccraAfrica/BamakoAfrica/BanjulAfrica/BissauAfrica/CasablancaAfrica/ConakryAfrica/DakarAfrica/El_AaiunAfrica/FreetownAfrica/LomeAfrica/MonroviaAfrica/NouakchottAfrica/OuagadougouAfrica/Sao_TomeAfrica/TimbuktuAmerica/DanmarkshavnAntarctica/TrollAtlantic/CanaryAtlantic/FaeroeAtlantic/FaroeAtlantic/MadeiraAtlantic/ReykjavikAtlantic/St_HelenaEireEtc/GMTEtc/GMT+0Etc/GMT-0Etc/GMT0Etc/GreenwichEtc/UCTEtc/UTCEtc/UniversalEtc/ZuluEurope/BelfastEurope/DublinEurope/GuernseyEurope/Isle_of_ManEurope/JerseyEurope/LisbonEurope/LondonGBGB-EireGMTGMT0GreenwichIcelandPortugalUCTUTCUniversalWETZulu" + "'", str2, "Africa/AbidjanAfrica/AccraAfrica/BamakoAfrica/BanjulAfrica/BissauAfrica/CasablancaAfrica/ConakryAfrica/DakarAfrica/El_AaiunAfrica/FreetownAfrica/LomeAfrica/MonroviaAfrica/NouakchottAfrica/OuagadougouAfrica/Sao_TomeAfrica/TimbuktuAmerica/DanmarkshavnAntarctica/TrollAtlantic/CanaryAtlantic/FaeroeAtlantic/FaroeAtlantic/MadeiraAtlantic/ReykjavikAtlantic/St_HelenaEireEtc/GMTEtc/GMT+0Etc/GMT-0Etc/GMT0Etc/GreenwichEtc/UCTEtc/UTCEtc/UniversalEtc/ZuluEurope/BelfastEurope/DublinEurope/GuernseyEurope/Isle_of_ManEurope/JerseyEurope/LisbonEurope/LondonGBGB-EireGMTGMT0GreenwichIcelandPortugalUCTUTCUniversalWETZulu");
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("P0Y0-10DT07430-10.0323599998", 19, "\uc911\uad6d\uc5b4\uc911\uad6d)!ih!ih!ih!ih!ih!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0323599998" + "'", str3, "P0Y0-10DT07430-10.0323599998");
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str3 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("#######P0Y0M0DT0H0M0.000S#######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######P0Y0M0DT0H0M0.000S#######" + "'", str1, "#######P0Y0M0DT0H0M0.000S#######");
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
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
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale locale24 = builder23.build();
        java.util.Locale locale25 = builder23.build();
        java.util.Locale.Builder builder26 = builder23.clear();
        java.util.Locale.Builder builder27 = builder26.clearExtensions();
        java.util.Locale locale28 = builder26.build();
        java.util.Locale.Builder builder29 = builder26.clearExtensions();
        java.util.Locale.Builder builder30 = builder29.clear();
        java.util.Locale.Builder builder32 = builder30.removeUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder33 = builder32.clear();
        boolean boolean34 = locale5.equals((java.lang.Object) builder33);
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
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                !I0", "HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                !I0" + "'", str2, "                                                                !I0");
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("ihihtestestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm'ss's'", "44P0Y0-10DT07430-10.034359               ZH_TW (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               44P0Y0-10DT07430-10.0343599");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ihihtestestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm'ss's'" + "'", str2, "ihihtestestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm'ss's'");
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("dnu", "00dt00000.090153HIp0y000dt00000.090153!p0y000dt00000.090153", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("I!I!I!I!I!I!I!I!", " ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!I!I!I!I!I!I!I!" + "'", str2, "I!I!I!I!I!I!I!I!");
    }
}
