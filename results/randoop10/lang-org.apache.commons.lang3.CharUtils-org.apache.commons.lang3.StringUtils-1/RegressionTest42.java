import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest42 {

    public static boolean debug = false;

    @Test
    public void test21001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21001");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder7 = builder1.setLanguage("RA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setVariant("                       \\u0020                        ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant:                        \\u0020                         [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test21002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21002");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "f(KOREAN)", (java.lang.CharSequence) "AnihCFFFFFFFF");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21003");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "zosischFranzosisch (Frankreich)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21004");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("und-RA", "Egsh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und-RA" + "'", str2, "und-RA");
    }

    @Test
    public void test21005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21005");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hzhzhzhzhz", "n       nn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hzhzhzhzhz" + "'", str2, "hzhzhzhzhz");
    }

    @Test
    public void test21006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21006");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("US", "", 20);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '0');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "US" + "'", str6, "US");
    }

    @Test
    public void test21007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21007");
        java.util.Locale locale2 = new java.util.Locale("anihc", "GB");
        java.lang.Class<?> wildcardClass3 = locale2.getClass();
        org.junit.Assert.assertEquals(locale2.toString(), "anihc_GB");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test21008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21008");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitali", "hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21009");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHHH", "Eng");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21010");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\U0034\\U00                                             HCSTUD                                             \\U0034\\U00", "ITALIAN");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\U0034\\U00                                             HCSTUD                                             \\U0034\\U00" + "'", str4, "\\U0034\\U00                                             HCSTUD                                             \\U0034\\U00");
    }

    @Test
    public void test21011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21011");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("talian (FRA,Undetermined)", "0", "\\u0038ZHO                          ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test21012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21012");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str11 = locale9.getExtension('h');
        java.lang.String str12 = locale8.getDisplayScript(locale9);
        java.lang.String str13 = locale8.getISO3Country();
        java.util.Locale locale14 = locale8.stripExtensions();
        java.util.Locale.Builder builder15 = builder4.setLocale(locale14);
        java.util.Locale.Builder builder18 = builder4.setExtension('a', "ita");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder21 = builder4.setExtension('d', "nc_HZ                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: HZ                                                                   [at index 3]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FRA" + "'", str13, "FRA");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test21013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21013");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                     fran\347ais (France)                                      ", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "         ITALIAN_italian_eNGLISH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                     fr         ITALIAN_italian_eNGLISHn\347         ITALIAN_italian_eNGLISHis (Fr         ITALIAN_italian_eNGLISHnce)                                      " + "'", str4, "                                     fr         ITALIAN_italian_eNGLISHn\347         ITALIAN_italian_eNGLISHis (Fr         ITALIAN_italian_eNGLISHnce)                                      ");
    }

    @Test
    public void test21014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21014");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkk\n", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ranzosisch(frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch(frankreich)kkkkkkkkkk?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21015");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Italy", 0, 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test21016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21016");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("FgenceFgenceFgenceFgenceFgenceFgenceFgenc", 363, 101);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test21017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21017");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('g');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character g is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21018");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test21019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21019");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\u82f1\u56fd ", 97, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test21020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\uc601\uc5b4", 62);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc601\uc5b4                                                           " + "'", str2, "\uc601\uc5b4                                                           ");
    }

    @Test
    public void test21021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21021");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("\uc911\uad6d)", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21022");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\\u0054", "cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21023");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.Locale.FilteringMode filteringMode9 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList7, filteringMode9);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.Locale.FilteringMode filteringMode19 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList20 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList17, filteringMode19);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList23);
        java.lang.String str26 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList23);
        java.util.Locale locale27 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleKeys();
        java.lang.String str29 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strSet28);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.Locale.FilteringMode filteringMode38 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strList36, filteringMode38);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.util.Locale.FilteringMode filteringMode48 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList46, filteringMode48);
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList52);
        java.lang.String str55 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strList52);
        java.util.Locale locale56 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet57 = locale56.getExtensionKeys();
        java.util.Locale locale59 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale61 = new java.util.Locale("");
        java.util.Locale locale62 = java.util.Locale.FRANCE;
        java.util.Locale locale63 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str64 = locale62.getDisplayScript(locale63);
        java.util.Locale locale65 = java.util.Locale.ENGLISH;
        java.lang.String str66 = locale65.getDisplayCountry();
        java.util.Locale locale67 = java.util.Locale.PRC;
        java.util.Locale locale68 = java.util.Locale.US;
        java.util.Locale locale69 = java.util.Locale.FRANCE;
        java.util.Locale locale70 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str71 = locale69.getDisplayScript(locale70);
        java.util.Locale locale72 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet73 = locale72.getExtensionKeys();
        java.util.Locale locale74 = java.util.Locale.ITALIAN;
        java.lang.String str75 = locale74.getDisplayLanguage();
        java.util.Locale locale76 = java.util.Locale.FRENCH;
        java.util.Locale locale77 = java.util.Locale.US;
        java.util.Locale locale78 = java.util.Locale.ITALIAN;
        java.lang.String str79 = locale78.getDisplayLanguage();
        java.util.Locale locale80 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray81 = new java.util.Locale[] { locale56, locale59, locale61, locale62, locale65, locale67, locale68, locale70, locale72, locale74, locale76, locale77, locale78, locale80 };
        java.util.ArrayList<java.util.Locale> localeList82 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList82, localeArray81);
        java.util.Locale locale84 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.util.Locale>) localeList82);
        java.util.List<java.util.Locale> localeList85 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList82);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap86 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList87 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strMap86);
        java.util.Locale.Builder builder88 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder89 = builder88.clearExtensions();
        java.util.Locale locale90 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str91 = locale90.getDisplayName();
        java.util.Locale.Builder builder92 = builder89.setLocale(locale90);
        java.util.Locale.Builder builder93 = builder92.clear();
        java.util.Locale locale94 = builder93.build();
        java.util.Set<java.lang.String> strSet95 = locale94.getUnicodeLocaleKeys();
        java.lang.String str96 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strSet95);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str97 = java.util.Locale.lookupTag(languageRangeList0, (java.util.Collection<java.lang.String>) strSet95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + filteringMode9 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode9.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + filteringMode19 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode19.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + filteringMode38 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode38.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + filteringMode48 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode48.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "it");
        org.junit.Assert.assertNotNull(charSet57);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertEquals(locale61.toString(), "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "en");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "it");
        org.junit.Assert.assertNotNull(charSet73);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "it");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Italian" + "'", str75, "Italian");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "fr");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "it");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Italian" + "'", str79, "Italian");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNull(locale84);
        org.junit.Assert.assertNotNull(localeList85);
        org.junit.Assert.assertNotNull(languageRangeList87);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "French (Canada)" + "'", str91, "French (Canada)");
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(builder93);
        org.junit.Assert.assertNotNull(locale94);
        org.junit.Assert.assertEquals(locale94.toString(), "");
        org.junit.Assert.assertNotNull(strSet95);
        org.junit.Assert.assertNull(str96);
    }

    @Test
    public void test21024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21024");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("italian (italian,e...", "\\U0020ItalianItalianItalianItali\\U0020ItalianItalianItalianItal");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21025");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("CHINESE (CHINA", '\u6cd5');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHINESE (CHINA" + "'", str2, "CHINESE (CHINA");
    }

    @Test
    public void test21026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21026");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test21027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21027");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Frnz\366sisch(KndFrnz\366sisch(KndFrnz\366sisch(KndFrnz\366sisch(KndFEEEEEEEEEEEEE", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21028");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(" (ITALIAN,ENGLISH)", "deu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21029");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "italian (italian,englcor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351", (java.lang.CharSequence) "FRANZ\326SISCH(FRANKREICH)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test21030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21030");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder8 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setScript("             und");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script:              und [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test21031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21031");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\\U0020IiTALIAN\\U0020I                                                 ", (int) (short) -1, "nglischIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0020IiTALIAN\\U0020I                                                 " + "'", str3, "\\U0020IiTALIAN\\U0020I                                                 ");
    }

    @Test
    public void test21032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21032");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\nFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\nFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF" + "'", str1, "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\nFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
    }

    @Test
    public void test21033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21033");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          ", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'U');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '\u671d');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "          " + "'", str6, "          ");
    }

    @Test
    public void test21034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21034");
        java.util.Locale locale1 = new java.util.Locale("                                                                                               en");
        org.junit.Assert.assertEquals(locale1.toString(), "                                                                                               en");
    }

    @Test
    public void test21035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21035");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("und");
        java.lang.String str3 = locale2.getScript();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("       iiiiiiiiiiifrankreichnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn        ", locale2);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "       IIIIIIIIIIIFRANKREICHNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN        " + "'", str4, "       IIIIIIIIIIIFRANKREICHNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN        ");
    }

    @Test
    public void test21036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21036");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("44444444444444444444444444444444!IH");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '4' + "'", char1 == '4');
    }

    @Test
    public void test21037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21037");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "#u##2#iTALIANiTALIANiTALIANiT");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test21038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21038");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("german (germany)", "hi!       fr_FR                  Italienischfr_FR                  italian_ITALIAN_Englishfr_FR                  HI!fr_FR                  hi!fr_FR                  ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...fr_FR                  \\u0034fr_FR                  HI!fr_FR                  Italianfr_FR                  \\u0061fr_FR                  \\u0023fr_FR                  hi!fr_FR                  iTALIANfr_FR                  Chinese (China)fr_FR                  hi!fr_FR                  zh_CNfr_FR                  iTALIANfr_FR                  enfr_FR                  Italienisch", (int) '0');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("5c", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5c5c5cm5c5c5c5c5c5c5cm5c5cy5c" + "'", str5, "5c5c5cm5c5c5c5c5c5c5cm5c5cy5c");
    }

    @Test
    public void test21039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21039");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\u82f1\u56fd", 122);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u56fd                                                            " + "'", str2, "\u82f1\u56fd                                                            ");
    }

    @Test
    public void test21040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21040");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setVariant("\uad6d\uc911\uc5b4\uad6d\uc911IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: )??????( ????????IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test21041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21041");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("E             g                                                                                     ", 200, '8');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888E             g                                                                                     " + "'", str3, "8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888E             g                                                                                     ");
    }

    @Test
    public void test21042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21042");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("francese (Canada)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ")adanaC( esecnarf" + "'", str1, ")adanaC( esecnarf");
    }

    @Test
    public void test21043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21043");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "UND");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21044");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test21045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21045");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("FR_CA                             ...!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\", 371);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21046");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
    }

    @Test
    public void test21047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21047");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Katalanisch", 136, "\u97d3\u6587\u5357\u97d3)");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3" + "'", str3, "\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3");
    }

    @Test
    public void test21048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21048");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("22222222222222222222222222222222222222222222222222FRANCESE (cANADA)");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '2' + "'", char1 == '2');
    }

    @Test
    public void test21049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21049");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder6 = builder1.setLocale(locale5);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = locale11.getDisplayName();
        java.util.Locale.Builder builder13 = builder10.setLocale(locale11);
        java.util.Locale.Builder builder14 = builder13.clear();
        java.util.Locale.Builder builder16 = builder14.setLanguage("ITALIAN");
        java.util.Locale locale17 = builder14.build();
        java.util.Locale.Builder builder18 = builder14.clearExtensions();
        java.util.Locale locale19 = java.util.Locale.ROOT;
        java.lang.String str20 = locale19.getISO3Country();
        java.util.Set<java.lang.String> strSet21 = locale19.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder22 = builder18.setLocale(locale19);
        java.util.Locale.Builder builder23 = builder7.setLocale(locale19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder25 = builder7.setScript("alzzzItalian (Italy)enzzzItalian (Italy)czzzItalian (Italy)#########################################################################################");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: alzzzItalian (Italy)enzzzItalian (Italy)czzzItalian (Italy)######################################################################################### [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "francese (Canada)" + "'", str3, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "francese (Canada)" + "'", str12, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "italian");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test21050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21050");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HSAAGAekkkkkkkkkkkkkkkkk", (int) '9', 224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test21051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21051");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("France");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.lowerCase("tedesco    ", locale13);
        java.util.Locale.setDefault(category0, locale13);
        java.util.Locale locale16 = java.util.Locale.getDefault(category0);
        java.util.Locale locale17 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "france");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "tedesco    " + "'", str14, "tedesco    ");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "france");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "france");
    }

    @Test
    public void test21052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21052");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("#########FranzosischFranzosisch (Frankreich", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=#########franzosischfranzosisch(frankreich");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21053");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test21054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21054");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("   \\U0034\\U00", ")dnK( hcsis\366znrF");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   \\U0034\\U00" + "'", str2, "   \\U0034\\U00");
    }

    @Test
    public void test21055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21055");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("       !ih", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       !ih" + "'", str2, "       !ih");
    }

    @Test
    public void test21056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21056");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("italian_ITALIAN_EnglisF", "hh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\)anic( esenic");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21057");
        java.util.Locale locale3 = new java.util.Locale("\uc601\uc5b4", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCC...", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!itTAiT_ITALIAN_EgAish!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\\u0068");
        org.junit.Assert.assertEquals(locale3.toString(), "\uc601\uc5b4_CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCENGLISCHCCCCCCCCCCC..._!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!itTAiT_ITALIAN_EgAish!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\\u0068");
    }

    @Test
    public void test21058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21058");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                        itTAiT_ITALIAN_EgAish                       )modgniK detinU( hsilgnE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21059");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\u0039", "NC_HZ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '!');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0039" + "'", str4, "\\u0039");
    }

    @Test
    public void test21060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21060");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hhhhhhhhHFranz\366sisch", "UND");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21061");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getLanguage();
        java.util.Set<java.lang.String> strSet4 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.lang.String str9 = locale7.getExtension('h');
        java.lang.String str10 = locale6.getDisplayScript(locale7);
        java.util.Locale locale14 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str15 = locale6.getDisplayCountry(locale14);
        java.lang.String str16 = locale14.getDisplayName();
        java.lang.String str18 = locale14.getExtension('i');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.upperCase("iTALIAN                                                                 ", locale14);
        java.lang.String str20 = locale0.getDisplayVariant(locale14);
        java.util.Set<java.lang.String> strSet21 = locale0.getUnicodeLocaleKeys();
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet21, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italiano" + "'", str1, "italiano");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals(locale14.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "France" + "'", str15, "France");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str16, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ITALIAN                                                                 " + "'", str19, "ITALIAN                                                                 ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test21062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21062");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(" Italia ", "", (int) 'E');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test21063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21063");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "EN_US", (java.lang.CharSequence) "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21064");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", (int) 'G', 73);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test21065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21065");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("69\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch", "\u6cd5\u6587", 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test21066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21066");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                               INGLESE                                ", "\ud504\ub791\uc2a4\uc5b4", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test21067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21067");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("en-GBDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHD", "                                                                                           U0020", 262);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("italian(italian,eng", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en-GBDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHD" + "'", str5, "en-GBDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHD");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "italian(italian,eng" + "'", str8, "italian(italian,eng");
    }

    @Test
    public void test21068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21068");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("LATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATih", 'k', 't');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATih" + "'", str3, "LATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATih");
    }

    @Test
    public void test21069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21069");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "Italian (italian,english");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21070");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "             \\U0049                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21071");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale4 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale0.getDisplayCountry(locale4);
        java.lang.String str8 = locale4.getExtension('E');
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = locale9.toLanguageTag();
        java.lang.String str11 = locale4.getDisplayName(locale9);
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.lang.String str14 = locale13.getDisplayCountry();
        java.lang.String str15 = locale12.getDisplayVariant(locale13);
        java.lang.String str16 = locale12.getDisplayCountry();
        java.lang.String str17 = locale12.getScript();
        java.lang.String str18 = locale12.getScript();
        java.util.Locale locale19 = java.util.Locale.FRENCH;
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = locale20.getDisplayCountry();
        java.lang.String str22 = locale19.getDisplayVariant(locale20);
        java.lang.String str23 = locale19.getDisplayCountry();
        java.lang.String str24 = locale19.getScript();
        java.lang.String str25 = locale19.getScript();
        java.lang.String str26 = locale12.getDisplayCountry(locale19);
        java.util.Locale.Category category27 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale28 = java.util.Locale.getDefault(category27);
        java.util.Locale locale29 = java.util.Locale.FRANCE;
        java.util.Locale locale30 = java.util.Locale.ITALIAN;
        java.lang.String str32 = locale30.getExtension('h');
        java.lang.String str33 = locale29.getDisplayScript(locale30);
        java.lang.String str34 = locale29.getISO3Country();
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale35);
        java.lang.String str37 = locale29.getDisplayName(locale35);
        java.lang.String str38 = locale29.getScript();
        java.util.Locale.setDefault(category27, locale29);
        java.lang.String str40 = locale12.getDisplayCountry(locale29);
        java.lang.String str41 = locale9.getDisplayScript(locale12);
        java.lang.String str42 = locale12.getDisplayLanguage();
        java.lang.String str43 = locale12.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale4.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITALIAN" + "'", str5, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-US" + "'", str10, "en-US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "italian (ITALIAN,English)" + "'", str11, "italian (ITALIAN,English)");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + category27 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category27.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "FRA" + "'", str34, "FRA");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "de");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str37, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "fran\347ais" + "'", str42, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test21072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21072");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hzhzhzhzhzhzhzhzhzhzahzsahzrahzqahzoahznahzmahzlahziahzgahzfahzeahzdaarfhzhzhzhzhzhzhzhzhzhz", "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000italiano000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000", (int) '\ud504');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test21073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21073");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                       ...", 328);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                              ...                                                                                                                                                       " + "'", str2, "                                                                                                                                                                              ...                                                                                                                                                       ");
    }

    @Test
    public void test21074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("Deutsch", "                                                                 \\U0020  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deutsch" + "'", str2, "Deutsch");
    }

    @Test
    public void test21075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21075");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Italienisch#########################################################################################", "!IH");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("HI!HI!", (java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italienisch#########################################################################################" + "'", str4, "Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Italienisch#########################################################################################" + "'", str5, "Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test21076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21076");
        java.util.Locale locale3 = new java.util.Locale("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN", "                                                  HSIAGE_NAILATI_TIATTIHI!_NAILATI HSILGNE_NAILATI_NAILAT", "CCCCCCIAN\\U0020ICCCCCCC");
        java.lang.String str4 = locale3.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_cn_                                                  HSIAGE_NAILATI_TIATTIHI!_NAILATI HSILGNE_NAILATI_NAILAT_CCCCCCIAN\\U0020ICCCCCCC");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_cn_                                                  HSIAGE_NAILATI_TIATTIHI!_NAILATI HSILGNE_NAILATI_NAILAT_CCCCCCIAN\\U0020ICCCCCCC" + "'", str4, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_cn_                                                  HSIAGE_NAILATI_TIATTIHI!_NAILATI HSILGNE_NAILATI_NAILAT_CCCCCCIAN\\U0020ICCCCCCC");
    }

    @Test
    public void test21077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21077");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("ko-kr                                                                                                    ", "und-itTAiT-ITALIAN-EgAish", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test21078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21078");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\!u!00!de!\\!u!0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21079");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("GENCE");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test21080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21080");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty(" \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test21081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("##################    \\XTALXAN_TALAN_ENGLXSH    ###################", "         ITALIAN_italian_eNGLISH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test21082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21082");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                  it44444444444444444en", "francia");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                  it44444444444444444en" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                  it44444444444444444en");
    }

    @Test
    public void test21083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21083");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\\u0029", "HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21084");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\u0074", 108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21085");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("0655de06550655de06550655d         INGS        ", "FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21086");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale8 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str9 = locale0.getDisplayCountry(locale8);
        java.util.Locale.setDefault(locale0);
        java.lang.String str11 = locale0.getISO3Country();
        java.util.Locale locale12 = java.util.Locale.PRC;
        java.lang.String str13 = locale12.getDisplayVariant();
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.lang.String str16 = locale15.getDisplayCountry();
        java.lang.String str17 = locale14.getDisplayVariant(locale15);
        java.lang.String str18 = locale12.getDisplayScript(locale15);
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.util.Locale locale21 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str22 = locale20.getDisplayScript(locale21);
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.util.Locale locale24 = java.util.Locale.ITALIAN;
        java.lang.String str26 = locale24.getExtension('h');
        java.lang.String str27 = locale23.getDisplayScript(locale24);
        java.lang.String str28 = locale23.getISO3Country();
        java.lang.String str29 = locale21.getDisplayVariant(locale23);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.upperCase("\\u0020iTALIANiTALIANiTALIANiTALI", locale21);
        java.lang.String str31 = locale15.getDisplayCountry(locale21);
        java.util.Locale.setDefault(locale15);
        java.lang.String str33 = locale0.getDisplayVariant(locale15);
        boolean boolean34 = locale15.hasExtensions();
        java.util.Locale locale35 = null;
        java.lang.String str36 = locale15.getDisplayCountry(locale35);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals(locale8.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "France" + "'", str9, "France");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FRA" + "'", str11, "FRA");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "FRA" + "'", str28, "FRA");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI" + "'", str30, "\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test21087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21087");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("fffffffffffff                                                                        ", "hi!(\\U0020,Italienisch############################################hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fffffffffffff                                                                        " + "'", str2, "fffffffffffff                                                                        ");
    }

    @Test
    public void test21088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21088");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("REHEGEEECEZDODMDKDJDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBY");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: REHEGEEECEZDODMDKDJDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBY [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test21089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CAfr-CAfr-CAfr-C8600u\\fr-CAffr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CAfr-CAfr-CAfr-C8600u\\fr-CAf", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CAfr-CAfr-CAfr-C8600u\\fr-CAffr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CAfr-CAfr-CAfr-C8600u\\fr-CAf" + "'", str2, "fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CAfr-CAfr-CAfr-C8600u\\fr-CAffr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CAfr-CAfr-CAfr-C8600u\\fr-CAf");
    }

    @Test
    public void test21090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21090");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "NC_HZ\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21091");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder5.clearExtensions();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale locale11 = builder9.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder9.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "italian");
    }

    @Test
    public void test21092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21092");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("iTTAIT_ITALIAN_EGAISH          ", 44);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iTTAIT_ITALIAN_EGAISH          " + "'", str2, "iTTAIT_ITALIAN_EGAISH          ");
    }

    @Test
    public void test21093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21093");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Fgence", "!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Fgence" + "'", str2, "Fgence");
    }

    @Test
    public void test21094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21094");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\\XTALXAN_ITALIAN_ENGLXSH    R0                                               nailati");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\XTALXAN_ITALIAN_ENGLXSH    R0                                               nailati" + "'", str1, "\\XTALXAN_ITALIAN_ENGLXSH    R0                                               nailati");
    }

    @Test
    public void test21095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21095");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\U0069cccccccccccccccccccccccccccccccceGSCHcccccccccccccccccccccccccccccccccccccccccccccccccc", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21096");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Etats-Unis", 0, 'e');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Etats-Unis" + "'", str3, "Etats-Unis");
    }

    @Test
    public void test21097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21097");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("AzhzhzhzhzhzhzhzhzhzhADAAEAAFAAGAAAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUADAEALAMANAOAQARASATAJEAJMAJOAJPAKEAKGAKHAKAKMAKNAKPAKRAKWAKYAKZALAALBALCALALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVAVNAVUAWFAWSAYEAYTAZAAZMAZW", "444444444it");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test21098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21098");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                       \\u0020                        ", "...FDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIAGAFAEADA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21099");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIHM", 31, "ITALIAN (ITALIAN,ENGLISH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIHM" + "'", str3, "BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIHM");
    }

    @Test
    public void test21100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21100");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.getDisplayName();
        java.lang.String str4 = locale0.getCountry();
        java.util.Set<java.lang.String> strSet5 = locale0.getUnicodeLocaleKeys();
        java.lang.String str6 = locale0.getScript();
        java.lang.String str7 = locale0.getDisplayCountry();
        java.lang.Object obj8 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Italian" + "'", str3, "Italian");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "it");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "it");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "it");
    }

    @Test
    public void test21101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21101");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                          hi!       2ITALIANITALIANITALIANITALItalienisch2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese (China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienisch                                           ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test21102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21102");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("zH_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zH_CN" + "'", str1, "zH_CN");
    }

    @Test
    public void test21103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21103");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\\italian_ITALIAN_English", (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=\\italian_italian_english");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21104");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "AD  \\u007");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21105");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "cHINESISCH (cHINA)", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21106");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("SUen_", "FRANZ\326SISCHF(FRANKREICH)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21107");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("FR-CAFR-CAFR-C8600U\\FR-CAFR-CAFR-CA", (int) 'B');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               FR-CAFR-CAFR-C8600U\\FR-CAFR-CAFR-CA                " + "'", str2, "               FR-CAFR-CAFR-C8600U\\FR-CAFR-CAFR-CA                ");
    }

    @Test
    public void test21108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21108");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "coreano (Corea del Sud)", "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test21109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21109");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test21110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21110");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("italieitalNC_hzitalieital", "                                                                                                                                                                      HI!       ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENG    \\     ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE (CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH", 113);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test21111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21111");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\engli");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21112");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        java.util.Locale locale6 = locale1.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.util.Locale locale9 = new java.util.Locale("en");
        boolean boolean10 = locale9.hasExtensions();
        java.util.Set<java.lang.String> strSet11 = locale9.getUnicodeLocaleKeys();
        java.lang.String str12 = locale6.getDisplayCountry(locale9);
        java.util.Locale locale14 = new java.util.Locale("en");
        boolean boolean15 = locale14.hasExtensions();
        java.lang.String str16 = locale9.getDisplayCountry(locale14);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.lowerCase("Frnz\366sisch (Knd)", locale9);
        java.util.Locale locale18 = locale9.stripExtensions();
        java.lang.String str19 = locale18.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FRA" + "'", str7, "FRA");
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "France" + "'", str12, "France");
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "frnz\366sisch (knd)" + "'", str17, "frnz\366sisch (knd)");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test21113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21113");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "Englisch!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21114");
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Locale locale5 = new java.util.Locale("English", "italy", "H (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)");
        java.lang.String str6 = locale1.getDisplayCountry(locale5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("                                        ITtaIt_italian_eGaISH                                 \\U006", locale1);
        boolean boolean8 = locale1.hasExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals(locale5.toString(), "english_ITALY_H (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                        ittait_italian_egaish                                 \\u006" + "'", str7, "                                        ittait_italian_egaish                                 \\u006");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test21115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21115");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('b');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21116");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "HhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21117");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("nglish ...", "         R", 216);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test21118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21118");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "fffffffffffffffffffffffffffffffffffffffffffffffffff\nffffffffffffffffffffffffffffffffffffffffffffffffffff");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test21119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21119");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hen", "FRANZ\326SISCH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21120");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("zh-CN", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                                         u005c         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21121");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("DEFGILMNOQRSTUWXZBBBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCCCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLLBLCLILKLRLSLTLULVLYMMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNNCNENFNGNINLNONPNRNUNZOMPPEPFPGPHPKPLPMPNPRPSPTPWPYQRERORSRURWSSBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUUGUMUSUYUZVVCVEVGVIVNVUWFWSYEYTZZMZW", "                                                    FR-                                                     ", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test21122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21122");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "i\\u0020iTALIANiTALIANiTALIANiTALIit");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21123");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "iiiiiiiiiiifrankreichnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 102 + "'", int1 == 102);
    }

    @Test
    public void test21124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21124");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale4.getISO3Country();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.removeUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder10 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setLanguageTag("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CAN" + "'", str5, "CAN");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test21125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21125");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ECANADA                                      ...g                                      ...CANADACANADA                                      ...sh                                      ...                                                                                                   ", 30, "                                             \\u0066                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ECANADA                                      ...g                                      ...CANADACANADA                                      ...sh                                      ...                                                                                                   " + "'", str3, "ECANADA                                      ...g                                      ...CANADACANADA                                      ...sh                                      ...                                                                                                   ");
    }

    @Test
    public void test21126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21126");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "         ITALIAN_italian_eNGLISH", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "          HI!           ", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "      ", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "e             g                                                                                     ", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaallemand", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 58 + "'", int18 == 58);
    }

    @Test
    public void test21127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21127");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                                                                                                                                                                                                                                   \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\hi!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\", "fran\347ais (France)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21128");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21129");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("GBR", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GBR" + "'", str2, "GBR");
    }

    @Test
    public void test21130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21130");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDH...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDH..." + "'", str1, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDH...");
    }

    @Test
    public void test21131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21131");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\\u0020iItalian\\u008600u\\\\atalaaa_ITALIAN_Eaglaaa\\u0020iItalian\\u008600u\\Ueutsc\\u0020iItalian\\u008600u\\\\atalaaa_ITALIAN_Eaglaaa\\u0020iItalian\\u008600u\\U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21132");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale locale8 = builder5.build();
        java.util.Locale.Builder builder9 = builder5.clearExtensions();
        java.util.Locale locale10 = java.util.Locale.ROOT;
        java.lang.String str11 = locale10.getISO3Country();
        java.util.Set<java.lang.String> strSet12 = locale10.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder13 = builder9.setLocale(locale10);
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale.Builder builder17 = builder14.setLanguageTag("Italian");
        java.util.Locale.Builder builder18 = builder14.clearExtensions();
        java.util.Locale.Builder builder19 = builder14.clear();
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder22 = builder14.setLocale(locale21);
        java.util.Locale.Builder builder23 = builder22.clear();
        java.util.Locale.Builder builder24 = builder22.clear();
        java.util.Locale.Builder builder25 = builder24.clear();
        java.util.Locale locale26 = builder24.build();
        java.util.Locale.Builder builder27 = builder13.setLocale(locale26);
        java.lang.String str28 = locale26.getLanguage();
        java.lang.String str29 = locale26.getDisplayCountry();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "italian");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test21133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("talian_ITALIAN_English", "!ih_HHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "talian_ITALIAN_English" + "'", str2, "talian_ITALIAN_English");
    }

    @Test
    public void test21134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21134");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("German", 720, "hi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienisch");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienischhi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAGermanhi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienischhi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXA" + "'", str3, "hi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienischhi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAGermanhi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienischhi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXA");
    }

    @Test
    public void test21135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21135");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("zzzChina", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                            zzzChina" + "'", str2, "                                                                                            zzzChina");
    }

    @Test
    public void test21136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21136");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("EFrankreichgFrankreichFrankreichsh", " italia  italia  italia  italia  italia  italia  italia deutsch italia  italia  italia  italia  italia  italia  italia  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EFrankreichgFrankreichFrankreichsh" + "'", str2, "EFrankreichgFrankreichFrankreichsh");
    }

    @Test
    public void test21137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21137");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("English                                 (                United                                 Kingdom                )", "anihc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test21138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21138");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21139");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "zho");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21140");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("x-lvariant-CAN", (int) ')');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             x-lvariant-CAN              " + "'", str2, "             x-lvariant-CAN              ");
    }

    @Test
    public void test21141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21141");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "u00\\u0034\\u00                                             hcstud                                             \\u0034", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21142");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("FRANCESE (cANADA)", "                                                                                           U0020");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21143");
        java.util.Locale locale1 = new java.util.Locale("en");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale2.getDisplayScript(locale3);
        java.util.Locale locale7 = locale2.stripExtensions();
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.lang.String str9 = locale7.getScript();
        boolean boolean10 = locale7.hasExtensions();
        java.lang.String str11 = locale1.getDisplayLanguage(locale7);
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "anglais" + "'", str11, "anglais");
    }

    @Test
    public void test21144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21144");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "\\u0069", (java.lang.CharSequence) "it_I");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\\u0069" + "'", charSequence2, "\\u0069");
    }

    @Test
    public void test21145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21145");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "Azhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0cinese0(cina)Uu!!i9h..France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Azhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0cinese0(cina)Uu!!i9h..France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)A" + "'", str1, "Azhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0cinese0(cina)Uu!!i9h..France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)A");
    }

    @Test
    public void test21146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21146");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, "RoADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ\\\\\\\\\\\\\\\\\\\\\\\\\\-Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Uni");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21147");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("cinese (Cina)", 76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cinese (Cina)                                                               " + "'", str2, "cinese (Cina)                                                               ");
    }

    @Test
    public void test21148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21148");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "rnz\366sisch(Knd                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Rnz\366sisch(Knd                                                                                                                                                                                                               " + "'", str1, "Rnz\366sisch(Knd                                                                                                                                                                                                               ");
    }

    @Test
    public void test21149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21149");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet4, "\\u0020iTALIANiTALIANiTALIANiTALI");
        java.lang.String str7 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.Locale.FilteringMode filteringMode18 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList19 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList16, filteringMode18);
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.Locale.FilteringMode filteringMode28 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strList26, filteringMode28);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strList32);
        java.lang.String str35 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList32);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.util.Locale.FilteringMode filteringMode44 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strList42, filteringMode44);
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.Locale.FilteringMode filteringMode54 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.lang.String>) strList52, filteringMode54);
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.lang.String>) strList58);
        java.lang.String str61 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strList58);
        java.util.Locale locale62 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet63 = locale62.getExtensionKeys();
        java.util.Locale locale65 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale67 = new java.util.Locale("");
        java.util.Locale locale68 = java.util.Locale.FRANCE;
        java.util.Locale locale69 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str70 = locale68.getDisplayScript(locale69);
        java.util.Locale locale71 = java.util.Locale.ENGLISH;
        java.lang.String str72 = locale71.getDisplayCountry();
        java.util.Locale locale73 = java.util.Locale.PRC;
        java.util.Locale locale74 = java.util.Locale.US;
        java.util.Locale locale75 = java.util.Locale.FRANCE;
        java.util.Locale locale76 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str77 = locale75.getDisplayScript(locale76);
        java.util.Locale locale78 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet79 = locale78.getExtensionKeys();
        java.util.Locale locale80 = java.util.Locale.ITALIAN;
        java.lang.String str81 = locale80.getDisplayLanguage();
        java.util.Locale locale82 = java.util.Locale.FRENCH;
        java.util.Locale locale83 = java.util.Locale.US;
        java.util.Locale locale84 = java.util.Locale.ITALIAN;
        java.lang.String str85 = locale84.getDisplayLanguage();
        java.util.Locale locale86 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray87 = new java.util.Locale[] { locale62, locale65, locale67, locale68, locale71, locale73, locale74, locale76, locale78, locale80, locale82, locale83, locale84, locale86 };
        java.util.ArrayList<java.util.Locale> localeList88 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList88, localeArray87);
        java.util.Locale locale90 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.util.Locale>) localeList88);
        java.util.List<java.util.Locale> localeList91 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList88);
        java.util.Locale locale92 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList91);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap93 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList94 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap93);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + filteringMode18 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode18.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + filteringMode28 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode28.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + filteringMode44 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode44.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + filteringMode54 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode54.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "it");
        org.junit.Assert.assertNotNull(charSet63);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "en");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "it");
        org.junit.Assert.assertNotNull(charSet79);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "it");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Italian" + "'", str81, "Italian");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "fr");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "it");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Italian" + "'", str85, "Italian");
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNull(locale90);
        org.junit.Assert.assertNotNull(localeList91);
        org.junit.Assert.assertNull(locale92);
        org.junit.Assert.assertNotNull(languageRangeList94);
    }

    @Test
    public void test21150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21150");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", (java.lang.CharSequence) "                                                                                         U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test21151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21151");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Kanada)", "                                   44444444444444ITALIAN4444444444444                                   ", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test21152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21152");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("de", "itTAiT_ITALIAN_EgAish");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("4", (java.lang.Object[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("    ...", strArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "de" + "'", str6, "de");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test21153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("", "\\U006E");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U006E" + "'", str2, "\\U006E");
    }

    @Test
    public void test21154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21154");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('F', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test21155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21155");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                   ", 69, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxxxxxxxxxxxxxxxx                                                   " + "'", str3, "xxxxxxxxxxxxxxxxxx                                                   ");
    }

    @Test
    public void test21156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21156");
        java.util.Locale locale1 = new java.util.Locale("!_\\u0020_iTLE#########################################################################################");
        org.junit.Assert.assertEquals(locale1.toString(), "!_\\u0020_itle#########################################################################################");
    }

    @Test
    public void test21157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21157");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\u82f1\u56fd ", (java.lang.CharSequence) "iTALIAN                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21158");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Locale locale3 = locale0.stripExtensions();
        java.util.Locale locale4 = locale0.stripExtensions();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale7 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str8 = locale7.getDisplayName();
        java.util.Locale.Builder builder9 = builder6.setLocale(locale7);
        java.util.Locale.Builder builder11 = builder6.setLanguage("und");
        java.util.Locale.Builder builder12 = builder6.clear();
        java.util.Locale locale14 = java.util.Locale.JAPANESE;
        java.lang.String str15 = locale14.getISO3Country();
        java.lang.String str16 = locale14.getVariant();
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.upperCase("it", locale14);
        java.util.Locale.Builder builder18 = builder6.setLocale(locale14);
        java.lang.String str19 = locale4.getDisplayLanguage(locale14);
        java.lang.String str20 = locale14.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "French (Canada)" + "'", str8, "French (Canada)");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IT" + "'", str17, "IT");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u30c9\u30a4\u30c4\u8a9e" + "'", str19, "\u30c9\u30a4\u30c4\u8a9e");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test21159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21159");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet4, "\\u0020iTALIANiTALIANiTALIANiTALI");
        java.lang.String str7 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap8);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.parse("fr");
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.Locale.FilteringMode filteringMode23 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList21, filteringMode23);
        java.util.Locale.FilteringMode filteringMode25 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList21, filteringMode25);
        java.util.Locale.FilteringMode filteringMode27 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags(languageRangeList11, (java.util.Collection<java.lang.String>) strList21, filteringMode27);
        java.lang.String str29 = java.util.Locale.lookupTag(languageRangeList9, (java.util.Collection<java.lang.String>) strList28);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.Locale.FilteringMode filteringMode38 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strList36, filteringMode38);
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strList42);
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.lang.String[] strArray50 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        java.util.Locale.FilteringMode filteringMode53 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.lang.String>) strList51, filteringMode53);
        java.lang.String[] strArray56 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.lang.String>) strList57);
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strList57);
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        java.lang.String[] strArray66 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        java.util.Locale.FilteringMode filteringMode69 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList70 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, (java.util.Collection<java.lang.String>) strList67, filteringMode69);
        java.lang.String[] strArray72 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        java.util.List<java.lang.String> strList75 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, (java.util.Collection<java.lang.String>) strList73);
        java.util.Locale.LanguageRange[] languageRangeArray76 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList77 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList77, languageRangeArray76);
        java.lang.String[] strArray81 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList82 = new java.util.ArrayList<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList82, strArray81);
        java.util.Locale.FilteringMode filteringMode84 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList77, (java.util.Collection<java.lang.String>) strList82, filteringMode84);
        java.lang.String[] strArray87 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList88 = new java.util.ArrayList<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList88, strArray87);
        java.util.List<java.lang.String> strList90 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList77, (java.util.Collection<java.lang.String>) strList88);
        java.util.List<java.lang.String> strList91 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, (java.util.Collection<java.lang.String>) strList88);
        java.util.Locale.FilteringMode filteringMode92 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strList91, filteringMode92);
        java.lang.String str94 = java.util.Locale.lookupTag(languageRangeList9, (java.util.Collection<java.lang.String>) strList93);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + filteringMode23 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode23.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + filteringMode25 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode25.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + filteringMode27 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode27.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + filteringMode38 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode38.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + filteringMode53 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode53.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + filteringMode69 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode69.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(languageRangeArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + filteringMode84 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode84.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(strList90);
        org.junit.Assert.assertNotNull(strList91);
        org.junit.Assert.assertTrue("'" + filteringMode92 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode92.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList93);
        org.junit.Assert.assertNull(str94);
    }

    @Test
    public void test21160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21160");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("italian (italian,engl", "FRENCH                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italian (italian,engl" + "'", str2, "italian (italian,engl");
    }

    @Test
    public void test21161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21161");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("     Eng", 374, 164);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     Eng" + "'", str3, "     Eng");
    }

    @Test
    public void test21162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21162");
        java.util.Locale locale1 = new java.util.Locale("n44444444444444alia44444444444444it");
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.Category category5 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale6 = java.util.Locale.getDefault(category5);
        java.lang.String str7 = locale3.getDisplayVariant(locale6);
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale8.getDisplayName(locale9);
        java.util.Locale locale11 = java.util.Locale.UK;
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str14 = locale12.getDisplayName(locale13);
        java.util.Locale locale15 = locale12.stripExtensions();
        java.lang.String str16 = locale11.getDisplayVariant(locale12);
        java.lang.String str17 = locale9.getDisplayLanguage(locale12);
        java.lang.String str18 = locale6.getDisplayName(locale9);
        java.lang.String str19 = locale1.getDisplayCountry(locale6);
        java.util.Locale locale20 = locale1.stripExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "n44444444444444alia44444444444444it");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "allemand" + "'", str10, "allemand");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "allemand" + "'", str14, "allemand");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Franz\366sisch" + "'", str17, "Franz\366sisch");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "anglais" + "'", str18, "anglais");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "n44444444444444alia44444444444444it");
    }

    @Test
    public void test21163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21163");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("TALIAN_italian_eNGLISH         ITAL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TALIAN_italian_eNGLISH         ITAL" + "'", str1, "TALIAN_italian_eNGLISH         ITAL");
    }

    @Test
    public void test21164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21164");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("                              4444ALLEMAND                              4444", 'F');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test21165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21165");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "             hcsineilatI             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21166");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkreitaly", 'E', '2');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkreitaly" + "'", str3, "Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkreitaly");
    }

    @Test
    public void test21167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21167");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r8600u\\U\\u0\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "eagaash                                                                                                                                                                                                                                                                                                                                                                                                    ", "\\u0020iItalian\\u008600u\\U\\u0020iItalian\\u0020iUanglaisUFRZ\326CZ(FRKREC)Uitalian    U                                                                                                      U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r8600u\\U\\u0\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r8600u\\U\\u0\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test21168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21168");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('5');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5" + "'", str1, "5");
    }

    @Test
    public void test21169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21169");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEFEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE", "hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21170");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("HhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhHHHHHHHHHH" + "'", str1, "HhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhHHHHHHHHHH");
    }

    @Test
    public void test21171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21171");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\u00de\\u00\\u00de\\u00\\u00d         INGLESE       ", 49, "OHZ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u00de\\u00\\u00de\\u00\\u00d         INGLESE       O" + "'", str3, "\\u00de\\u00\\u00de\\u00\\u00d         INGLESE       O");
    }

    @Test
    public void test21172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21172");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 537);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 537 + "'", int2 == 537);
    }

    @Test
    public void test21173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21173");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("h2CINESE (CINA...IAN2CINESE (CINA...\\2CINESE (CINA...U2CINESE (CINA...00202CINESE (CINA...I2CINESE (CINA...h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h2CINESE (CINA...IAN2CINESE (CINA...\\2CINESE (CINA...U2CINESE (CINA...00202CINESE (CINA...I2CINESE (CINA...h" + "'", str1, "h2CINESE (CINA...IAN2CINESE (CINA...\\2CINESE (CINA...U2CINESE (CINA...00202CINESE (CINA...I2CINESE (CINA...h");
    }

    @Test
    public void test21174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21174");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!hI!hI!hI!hI!CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00d\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", '9');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test21175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21175");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("Ital");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21176");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "tal");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21177");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                           u0020italianitalianitalianitali");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                           u0020italianitalianitalianital" + "'", str1, "                                                                                           u0020italianitalianitalianital");
    }

    @Test
    public void test21178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21178");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                           u0020italianitalianitalianital", "TITITITITITIT");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21179");
        java.util.Locale locale3 = new java.util.Locale("hi!", "English", "");
        java.util.Locale locale7 = new java.util.Locale("H", "Hhhhhhhhh", "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.util.Locale locale11 = new java.util.Locale("\\u005c");
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale13);
        java.lang.String str15 = locale13.getVariant();
        java.lang.String str16 = locale11.getDisplayScript(locale13);
        java.lang.String str18 = locale11.getExtension('C');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.lowerCase("italian (ITALIAN,English)", locale11);
        java.lang.String str20 = locale7.getDisplayLanguage(locale11);
        java.lang.String str21 = locale11.getDisplayVariant();
        java.util.Set<java.lang.Character> charSet22 = locale11.getExtensionKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_ENGLISH");
        org.junit.Assert.assertEquals(locale7.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals(locale11.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "franz\366sisch (frankreich)" + "'", str14, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "italian (italian,english)" + "'", str19, "italian (italian,english)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charSet22);
    }

    @Test
    public void test21180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21180");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("u00\\u0034\\u00                                             hcstud                                             \\u0034", "nglish (united kingdom");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u00\\u0034\\u00                                             hcstud                                             \\u0034" + "'", str2, "u00\\u0034\\u00                                             hcstud                                             \\u0034");
    }

    @Test
    public void test21181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21181");
        java.util.Locale locale3 = new java.util.Locale(" Italia  Italia  Italia  Italia  Italia  Italia  Italia DEUTSCH Italia  Italia  Italia  Italia  Italia  Italia  Italia  ", "8300u\\", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for 8300U\\");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), " italia  italia  italia  italia  italia  italia  italia deutsch italia  italia  italia  italia  italia  italia  italia  _8300U\\_!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese");
    }

    @Test
    public void test21182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21182");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("x", "ixii");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test21183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21183");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("franz\366sisch\n(frankreich)hsiage_nailati_tiattihi!_nailati         hsilgne_nailati_", 'e');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test21184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21184");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("nglisch", " (italian,english)                                      ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, " \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "c" + "'", str4, "c");
    }

    @Test
    public void test21185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21185");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", '\r');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                                                                                                           z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...                                                                                                                                                                    italian_ITALIAN_EnglisF", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test21186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21186");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Locale locale3 = locale0.stripExtensions();
        java.util.Locale locale4 = locale0.stripExtensions();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale7 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str8 = locale7.getDisplayName();
        java.util.Locale.Builder builder9 = builder6.setLocale(locale7);
        java.util.Locale.Builder builder11 = builder6.setLanguage("und");
        java.util.Locale.Builder builder12 = builder6.clear();
        java.util.Locale locale14 = java.util.Locale.JAPANESE;
        java.lang.String str15 = locale14.getISO3Country();
        java.lang.String str16 = locale14.getVariant();
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.upperCase("it", locale14);
        java.util.Locale.Builder builder18 = builder6.setLocale(locale14);
        java.lang.String str19 = locale4.getDisplayLanguage(locale14);
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.lang.String str24 = locale22.getExtension('h');
        java.lang.String str25 = locale21.getDisplayScript(locale22);
        java.util.Locale locale29 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str30 = locale21.getDisplayCountry(locale29);
        java.lang.String str31 = locale29.getDisplayName();
        java.lang.String str33 = locale29.getExtension('i');
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.upperCase("iTALIAN                                                                 ", locale29);
        java.lang.String str35 = locale29.getVariant();
        java.lang.String str36 = locale14.getDisplayLanguage(locale29);
        java.lang.String str37 = locale14.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "French (Canada)" + "'", str8, "French (Canada)");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IT" + "'", str17, "IT");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u30c9\u30a4\u30c4\u8a9e" + "'", str19, "\u30c9\u30a4\u30c4\u8a9e");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals(locale29.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "France" + "'", str30, "France");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str31, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ITALIAN                                                                 " + "'", str34, "ITALIAN                                                                 ");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Italienisch#########################################################################################" + "'", str35, "Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Japanese" + "'", str36, "Japanese");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Japanese" + "'", str37, "Japanese");
    }

    @Test
    public void test21187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21187");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "frnz\366sisch (knd)", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test21188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21188");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("ADAEAFAGAI\\u0034\\u00                                             hcstueD                                             \\u0034\\u00XAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDFrance...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ADAEAFAGAI\\u0034\\u00                                             hcstueD                                             \\u0034\\u00XAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDFrance..." + "'", str1, "ADAEAFAGAI\\u0034\\u00                                             hcstueD                                             \\u0034\\u00XAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDFrance...");
    }

    @Test
    public void test21189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21189");
        java.util.Locale locale3 = new java.util.Locale("h", "i\\u0020iTALIANiTALIANiTALIANiTALIit", "    \\     ");
        boolean boolean4 = locale3.hasExtensions();
        java.lang.String str5 = locale3.getDisplayVariant();
        java.util.Set<java.lang.String> strSet6 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet6, "x");
        org.junit.Assert.assertEquals(locale3.toString(), "h_I\\U0020ITALIANITALIANITALIANITALIIT_    \\     ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "    \\     " + "'", str5, "    \\     ");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test21190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21190");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21191");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("en");
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.lang.String str4 = locale2.getVariant();
        java.lang.String str5 = locale2.getDisplayScript();
        java.lang.String str6 = locale1.getDisplayCountry(locale2);
        java.lang.String str7 = locale1.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "English" + "'", str7, "English");
    }

    @Test
    public void test21192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21192");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("zH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Zh_CNfRENCH (cANADA)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\U0020IiTALIAN\\U0020I                                                 " + "'", str1, "Zh_CNfRENCH (cANADA)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\U0020IiTALIAN\\U0020I                                                 ");
    }

    @Test
    public void test21193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21193");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCC...", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTU005CTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCC..." + "'", str2, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCC...");
    }

    @Test
    public void test21194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21194");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        java.util.Locale.Builder builder6 = builder0.setLocale(locale5);
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.util.Locale locale12 = new java.util.Locale("", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_cn", "CAN");
        java.lang.String str13 = locale12.getDisplayName();
        java.lang.String str14 = locale12.toLanguageTag();
        java.lang.String str15 = locale5.getDisplayLanguage(locale12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals(locale12.toString(), "_\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN_CAN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN (CAN)" + "'", str13, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN (CAN)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "x-lvariant-CAN" + "'", str14, "x-lvariant-CAN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test21195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21195");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "TITcnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21196");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\uc911\uad6d\uc5b4\uc911\uad6d)", "8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888E             g                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str2, "\uc911\uad6d\uc5b4\uc911\uad6d)");
    }

    @Test
    public void test21197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21197");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                       00000000000000cor\351en (Cor\351e du Sud)                        ", "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test21198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21198");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                               INGLESE                                ", "italian");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test21199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21199");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                           ", "...444444444444444444444444444444444444444444444444444                              ", 221);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test21200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21200");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#" + "'", str1, "#");
    }

    @Test
    public void test21201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21201");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('A', (int) '\r');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test21202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21202");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("A", "ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test21203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21203");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("4444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI44444444444444", "         ITALIAN_italian_eNGLISH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test21204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21204");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "italieitalNC_hzitalieital", 58);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test21205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21205");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale4 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale0.getDisplayCountry(locale4);
        java.lang.String str8 = locale4.getExtension('E');
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = locale9.toLanguageTag();
        java.lang.String str11 = locale4.getDisplayName(locale9);
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.lang.String str14 = locale13.getDisplayCountry();
        java.lang.String str15 = locale12.getDisplayVariant(locale13);
        java.lang.String str16 = locale12.getDisplayCountry();
        java.lang.String str17 = locale12.getScript();
        java.lang.String str18 = locale12.getScript();
        java.util.Locale locale19 = java.util.Locale.FRENCH;
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = locale20.getDisplayCountry();
        java.lang.String str22 = locale19.getDisplayVariant(locale20);
        java.lang.String str23 = locale19.getDisplayCountry();
        java.lang.String str24 = locale19.getScript();
        java.lang.String str25 = locale19.getScript();
        java.lang.String str26 = locale12.getDisplayCountry(locale19);
        java.util.Locale.Category category27 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale28 = java.util.Locale.getDefault(category27);
        java.util.Locale locale29 = java.util.Locale.FRANCE;
        java.util.Locale locale30 = java.util.Locale.ITALIAN;
        java.lang.String str32 = locale30.getExtension('h');
        java.lang.String str33 = locale29.getDisplayScript(locale30);
        java.lang.String str34 = locale29.getISO3Country();
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale35);
        java.lang.String str37 = locale29.getDisplayName(locale35);
        java.lang.String str38 = locale29.getScript();
        java.util.Locale.setDefault(category27, locale29);
        java.lang.String str40 = locale12.getDisplayCountry(locale29);
        java.lang.String str41 = locale9.getDisplayScript(locale12);
        java.lang.String str42 = locale9.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale4.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITALIAN" + "'", str5, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-US" + "'", str10, "en-US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "italian (ITALIAN,English)" + "'", str11, "italian (ITALIAN,English)");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + category27 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category27.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "deutsch");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "FRA" + "'", str34, "FRA");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "de");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str37, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "USA" + "'", str42, "USA");
    }

    @Test
    public void test21206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21206");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str5 = locale4.getDisplayScript();
        java.lang.String str6 = locale2.getDisplayCountry(locale4);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str11 = locale8.getDisplayLanguage(locale10);
        java.lang.String str12 = locale2.getDisplayLanguage(locale8);
        java.lang.String str14 = locale8.getExtension('u');
        java.util.Set<java.lang.String> strSet15 = locale8.getUnicodeLocaleAttributes();
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet15, "    IIIIIIIIII");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien" + "'", str1, "italien");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Italian" + "'", str12, "Italian");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test21207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21207");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale4 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale0.getDisplayCountry(locale4);
        java.lang.String str7 = locale4.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale4.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITALIAN" + "'", str5, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "English" + "'", str7, "English");
    }

    @Test
    public void test21208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21208");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hi!       allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21209");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rchinesisch (china)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test21210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\\XTALXAN_ITALIAN_ENGLXSH", "    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\XTALXAN_ITALIAN_ENGLXSH" + "'", str2, "\\XTALXAN_ITALIAN_ENGLXSH");
    }

    @Test
    public void test21211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21211");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HCSINEI", "German", (int) 'D');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test21212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21212");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("5555555555", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test21213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                    k             ", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                    k             " + "'", str2, "                                                    k             ");
    }

    @Test
    public void test21214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21214");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("                                               nailati                                                ", strMap1);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap7);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.util.Locale.FilteringMode filteringMode20 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList18, filteringMode20);
        java.util.Locale.FilteringMode filteringMode22 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList18, filteringMode22);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.Locale.FilteringMode filteringMode32 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList30, filteringMode32);
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!       ", "Italienisch", "italian_ITALIAN_English", "HI!", "hi!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "\\u0034", "HI!", "Italian", "\\u0061", "\\u0023", "hi!", "iTALIAN", "Chinese (China)", "hi!", "zh_CN", "iTALIAN", "en", "Italienisch" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        java.util.Locale.LanguageRange[] languageRangeArray56 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList57 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList57, languageRangeArray56);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        java.util.Locale.FilteringMode filteringMode64 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList57, (java.util.Collection<java.lang.String>) strList62, filteringMode64);
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList54, filteringMode64);
        java.util.List<java.lang.String> strList67 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList54);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap68 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList69 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, strMap68);
        java.util.Locale.LanguageRange[] languageRangeArray70 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList71 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71, languageRangeArray70);
        java.util.Locale.LanguageRange[] languageRangeArray73 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList74 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74, languageRangeArray73);
        java.lang.String[] strArray78 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList79 = new java.util.ArrayList<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList79, strArray78);
        java.util.Locale.FilteringMode filteringMode81 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList82 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, (java.util.Collection<java.lang.String>) strList79, filteringMode81);
        java.util.Locale.FilteringMode filteringMode83 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList71, (java.util.Collection<java.lang.String>) strList79, filteringMode83);
        java.util.Collection<java.util.Locale> localeCollection85 = null;
        java.util.List<java.util.Locale> localeList86 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList71, localeCollection85);
        java.util.List<java.util.Locale> localeList87 = java.util.Locale.filter(languageRangeList69, (java.util.Collection<java.util.Locale>) localeList86);
        java.util.List<java.util.Locale> localeList88 = java.util.Locale.filter(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList86);
        java.util.Locale locale89 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList86);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + filteringMode20 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode20.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + filteringMode22 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode22.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + filteringMode32 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode32.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(languageRangeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + filteringMode64 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode64.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(languageRangeList69);
        org.junit.Assert.assertNotNull(languageRangeArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(languageRangeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + filteringMode81 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode81.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertTrue("'" + filteringMode83 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode83.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNotNull(localeList86);
        org.junit.Assert.assertNotNull(localeList87);
        org.junit.Assert.assertNotNull(localeList88);
        org.junit.Assert.assertNull(locale89);
    }

    @Test
    public void test21215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21215");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder8 = builder5.setExtension('i', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder5.removeUnicodeLocaleAttribute(" Italia  Italia  Italia  Italia  Italia  Italia  Italia DEUTSCH Italia  Italia  Italia  Italia  Italia  Italia  Italia  ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  Italia  Italia  Italia  Italia  Italia  Italia  Italia DEUTSCH Italia  Italia  Italia  Italia  Italia  Italia  Italia   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test21216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21216");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Frnz\366sisch(Knd)", "                                                    k             ", "5");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Frnz\366sisch(Knd)" + "'", str3, "Frnz\366sisch(Knd)");
    }

    @Test
    public void test21217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21217");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHI!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHI!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN" + "'", str1, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHI!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
    }

    @Test
    public void test21218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21218");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("KOREAN");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test21219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21219");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("fr_CA", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIn44444444444444alia44444444444444itIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test21220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21220");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("Eagaas", "hcsineilatI             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Eagaas" + "'", str2, "Eagaas");
    }

    @Test
    public void test21221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21221");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("Azhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)u0069h..France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzh", 'z');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'A' + "'", char2 == 'A');
    }

    @Test
    public void test21222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21222");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                               \\u005c                                                                              ", "FRANZ\326SISCH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRANZ\326SISCH" + "'", str2, "FRANZ\326SISCH");
    }

    @Test
    public void test21223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21223");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str2, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
    }

    @Test
    public void test21224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21224");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                              deutsch");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21225");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hi!       _\\u0020_italienisch####################################################################...", "!ih                            dalleman!ih                            dalleman!ih                          ", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                                     ", 371);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!       _\\u0020_italienisch####################################################################..." + "'", str4, "hi!       _\\u0020_italienisch####################################################################...");
    }

    @Test
    public void test21226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21226");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati", "...ARzhASzhAzhzhzhzhzhzhzemandn (South Korea)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati" + "'", str2, "    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati");
    }

    @Test
    public void test21227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21227");
        char[] charArray9 = new char[] { ' ', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "          ", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              fr_CA", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "inglese...........................................................................................................................................................................................................................................................................................................................................................................", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test21228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21228");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test21229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21229");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hhhhhhhhhh", "hcsineilatI", (int) 'h');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("NI d00u\\00u\\ed00u\\00u\\ed00u\\G ESEL", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test21230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21230");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test21231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21231");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("8600U\\                                                                                                                  ", "                                                                                         fr-", "french (NC_HZ)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8600U\\                                                                                                                  " + "'", str3, "8600U\\                                                                                                                  ");
    }

    @Test
    public void test21232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21232");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                        #u##2#iTALIANiTALIANiTALIANiT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                        #U##2#ITALIANITALIANITALIANIT" + "'", str1, "                                        #U##2#ITALIANITALIANITALIANIT");
    }

    @Test
    public void test21233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21233");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hIAN\\U0020Ihi", "hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNA", 20);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hIAN\\U0020Ihi" + "'", str5, "hIAN\\U0020Ihi");
    }

    @Test
    public void test21234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21234");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZhsxlgne_n", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21235");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "hi! _\\U0020_Italienisch####################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! _\\U0020_Italienisch####################################################################" + "'", str1, "hi! _\\U0020_Italienisch####################################################################");
    }

    @Test
    public void test21236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21236");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("EEEEEEEEEFRAEEEEEEEEE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21237");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.toLanguageTag();
        java.lang.String str3 = locale0.getISO3Language();
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.toLanguageTag();
        java.lang.String str8 = locale0.getDisplayName(locale6);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ko-KR" + "'", str2, "ko-KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kor" + "'", str3, "kor");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "en");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en" + "'", str7, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Korean (South Korea)" + "'", str8, "Korean (South Korea)");
    }

    @Test
    public void test21238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21238");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\r\r\r\r\r\r\r\r\r\r\r\ritalieital");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL" + "'", str1, "\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL");
    }

    @Test
    public void test21239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21239");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\ud55c\uad6d\uc5b4", "\\u0062", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test21240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21240");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "francese88888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21241");
        java.util.Locale locale2 = new java.util.Locale("inglesehhhhhhhhHITTAIT_ITALIAN_EGAISH          ", "Deutsch (Deutschland)");
        java.lang.String str3 = locale2.getVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "inglesehhhhhhhhhittait_italian_egaish          _DEUTSCH (DEUTSCHLAND)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test21242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21242");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setLanguageTag("anglais");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setUnicodeLocaleKeyword("8ian\\u0020i86", "hcsineilatI");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 8ian\\u0020i86 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test21243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21243");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u30a4\u30bf\u30ea\u30a2\u8a9e", "hzhzhzhzhzhzhzhzhzhzahzsahzrahzqahzoahznahzmahzlahziahzgahzfahzeahzdaarfhzhzhzhzhzhzhzhzhzhz");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test21244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21244");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("###################################i#######...", (int) '5', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       ###################################i#######..." + "'", str3, "       ###################################i#######...");
    }

    @Test
    public void test21245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21245");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK", 'h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK" + "'", str2, "_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
    }

    @Test
    public void test21246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21246");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\)anic( esenic", "FRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21247");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("deutsch");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("e");
        boolean boolean7 = languageRange1.equals((java.lang.Object) strArray6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "deutsch" + "'", str2, "deutsch");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "deutsch" + "'", str3, "deutsch");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "deutsch" + "'", str4, "deutsch");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test21248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21248");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("69\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21249");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "X", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("Korean", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "French (Canada)", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "FRANZ\326SISCHFRANZOSISCH (FRANKREICH)", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test21250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21250");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "  \\u0020iTALIANiTALIANiTALIANiTAL  ", "                                            HCSTUD                                             \\U0034");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test21251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21251");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                         italian (italian,e...                                                                                          ", 105, 111);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...lian (italian,e...                                                                                          " + "'", str3, "...lian (italian,e...                                                                                          ");
    }

    @Test
    public void test21252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21252");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21253");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("nailati", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("ENGLISCH", strMap8);
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet11 = locale10.getExtensionKeys();
        java.lang.String str12 = locale10.getVariant();
        java.lang.String str13 = locale10.getDisplayName();
        java.lang.String str14 = locale10.getCountry();
        java.util.Set<java.lang.String> strSet15 = locale10.getUnicodeLocaleKeys();
        java.lang.String str16 = java.util.Locale.lookupTag(languageRangeList9, (java.util.Collection<java.lang.String>) strSet15);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.Locale.FilteringMode filteringMode28 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strList26, filteringMode28);
        java.util.Locale.FilteringMode filteringMode30 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList26, filteringMode30);
        java.util.Collection<java.util.Locale> localeCollection32 = null;
        java.util.List<java.util.Locale> localeList33 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, localeCollection32);
        java.util.Locale locale34 = java.util.Locale.lookup(languageRangeList9, (java.util.Collection<java.util.Locale>) localeList33);
        java.util.Locale locale35 = java.util.Locale.lookup(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList33);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap36 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap36);
        java.util.Collection<java.lang.String> strCollection38 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap40 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList41 = java.util.Locale.LanguageRange.parse("it                   ", strMap40);
        java.util.Locale.LanguageRange[] languageRangeArray42 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList43 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43, languageRangeArray42);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        java.util.Locale.FilteringMode filteringMode50 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, (java.util.Collection<java.lang.String>) strList48, filteringMode50);
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!       ", "Italienisch", "italian_ITALIAN_English", "HI!", "hi!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "\\u0034", "HI!", "Italian", "\\u0061", "\\u0023", "hi!", "iTALIAN", "Chinese (China)", "hi!", "zh_CN", "iTALIAN", "en", "Italienisch" };
        java.util.ArrayList<java.lang.String> strList72 = new java.util.ArrayList<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList72, strArray71);
        java.util.Locale.LanguageRange[] languageRangeArray74 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList75 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList75, languageRangeArray74);
        java.lang.String[] strArray79 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList80 = new java.util.ArrayList<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList80, strArray79);
        java.util.Locale.FilteringMode filteringMode82 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList75, (java.util.Collection<java.lang.String>) strList80, filteringMode82);
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, (java.util.Collection<java.lang.String>) strList72, filteringMode82);
        java.util.Locale.FilteringMode filteringMode85 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags(languageRangeList41, (java.util.Collection<java.lang.String>) strList72, filteringMode85);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags(languageRangeList4, strCollection38, filteringMode85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Italian" + "'", str13, "Italian");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + filteringMode28 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode28.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + filteringMode30 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode30.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(localeList33);
        org.junit.Assert.assertNull(locale34);
        org.junit.Assert.assertNull(locale35);
        org.junit.Assert.assertNotNull(languageRangeList37);
        org.junit.Assert.assertNotNull(languageRangeList41);
        org.junit.Assert.assertNotNull(languageRangeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + filteringMode50 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode50.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(languageRangeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + filteringMode82 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode82.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertTrue("'" + filteringMode85 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode85.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList86);
    }

    @Test
    public void test21254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21254");
        char[] charArray13 = new char[] { ' ', '4' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "FRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFR", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("ran\347ais (France)                                      f                                     ", charArray13);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  \\u0020iTALIANiTALIANiTALIANiTAL  ", charArray13);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HCSTUED", charArray13);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "iTTAIT_ITALIAN_EGAISH", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test21255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLC", "itTAiT_ITALIAN_EgAish                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test21256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21256");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("FR-FR", 13, "    \\     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FR-FR    \\   " + "'", str3, "FR-FR    \\   ");
    }

    @Test
    public void test21257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21257");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              fr_C", "                                                     \\u005c        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21258");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("German (Germany)", "...nglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEngli...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test21259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21259");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 713);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test21260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21260");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", 220);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                          nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                           " + "'", str2, "                                                          nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                           ");
    }

    @Test
    public void test21261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21261");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0034\\u00", 36, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test21262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21262");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.lang.String str4 = locale1.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test21263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21263");
        char[] charArray9 = new char[] { ' ', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "          ", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              fr_CA", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test21264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21264");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("6b", "u Italia u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21265");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("    ##########", "\\u002 (ROYAUME-UNI)", 328);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test21266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("8600U\\                                                                                                                  ", "00CCCC\\CCCC0000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8600U\\                                                                                                                  " + "'", str2, "8600U\\                                                                                                                  ");
    }

    @Test
    public void test21267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21267");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("adaeafagaialamanaoaqarasatauawaxazbabbbdEEEEEEEEEFRAEEEEEEEEEcdcfcgchcickclcmcncocrcucvcwcxcyczded...", "                        German (Germany)                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test21268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21268");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Deutschland", "D  \\u007a", 0);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test21269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21269");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("             x-lvariant-CAN              ", (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21270");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\u82f1\u6587", "                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21271");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hI!       G", 9, 'B');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!       G" + "'", str3, "hI!       G");
    }

    @Test
    public void test21272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                     etatS detinU", "italian_ITALIAN_EnglisF");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italian_ITALIAN_EnglisF" + "'", str2, "italian_ITALIAN_EnglisF");
    }

    @Test
    public void test21273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21273");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("zh_CN", "ITALIEN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21274");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                 ", "Deutsch");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21275");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "uniCCCC\\CCCCC                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str2, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test21276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21276");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setVariant("                ITA                ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant:                 ITA                 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test21277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21277");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                     fran\347ais (france)                                      ", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                     fran\347ais (france)                                      " + "'", str2, "                                     fran\347ais (france)                                      ");
    }

    @Test
    public void test21278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21278");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("RA", "ti");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("\\u0020iTALIANiTALIANiTALIANiTALI", "");
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("French (Canada)", strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("ko", (java.lang.Object[]) strArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", strArray3, strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u0020iTALIANiTALIANiTALIANiTALI" + "'", str10, "\\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str12, "Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test21279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21279");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank(charSequence0, (java.lang.CharSequence) "AzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs cAnese (cAna)u0069h..France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)Azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "AzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs cAnese (cAna)u0069h..France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)Azhzhzhzhzhzhzhzhzhzh" + "'", charSequence2, "AzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs cAnese (cAna)u0069h..France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)Azhzhzhzhzhzhzhzhzhzh");
    }

    @Test
    public void test21280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21280");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "...N4AO4AQ4AR4AS4AT4A...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...N4AO4AQ4AR4AS4AT4A..." + "'", str1, "...N4AO4AQ4AR4AS4AT4A...");
    }

    @Test
    public void test21281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21281");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        java.util.Locale locale6 = locale1.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.util.Locale locale9 = new java.util.Locale("en");
        boolean boolean10 = locale9.hasExtensions();
        java.util.Set<java.lang.String> strSet11 = locale9.getUnicodeLocaleKeys();
        java.lang.String str12 = locale6.getDisplayCountry(locale9);
        java.util.Locale locale14 = new java.util.Locale("en");
        boolean boolean15 = locale14.hasExtensions();
        java.lang.String str16 = locale9.getDisplayCountry(locale14);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.lowerCase("Frnz\366sisch (Knd)", locale9);
        java.util.Locale locale18 = locale9.stripExtensions();
        java.util.Set<java.lang.Character> charSet19 = locale9.getExtensionKeys();
        java.lang.String str20 = locale9.getDisplayCountry();
        boolean boolean21 = locale9.hasExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FRA" + "'", str7, "FRA");
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "France" + "'", str12, "France");
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "frnz\366sisch (knd)" + "'", str17, "frnz\366sisch (knd)");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test21282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21282");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_NAILAT", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))italian", 30, (int) 'N');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test21283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21283");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("france");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "france" + "'", str1, "france");
    }

    @Test
    public void test21284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21284");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("2iT hi!       _\\U0020_Italienisch####################################################################            2i", "...HBI...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2iT hi!       _\\U0020_Italienisch####################################################################            2i" + "'", str2, "2iT hi!       _\\U0020_Italienisch####################################################################            2i");
    }

    @Test
    public void test21285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21285");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("CCCCCCCCCCCCCCCCCCCCCCCCCCfrz\366cz(frkrec)CCCCCCCCCCCCCCCCCCCCCCCCCC                                                                                                                                                                                                                                                                                                                                                    ", (int) 'G', (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                              ..." + "'", str3, "...                                              ...");
    }

    @Test
    public void test21286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21286");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("iTALIAN (ITALIAN,ENGLISH", "\\u0020__AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test21287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21287");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("FRANCESE (CANADA)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test21288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21288");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "44444444444444444444444444444444");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  ", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfra");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("E gl", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "  " + "'", str7, "  ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "E gl" + "'", str8, "E gl");
    }

    @Test
    public void test21289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21289");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("\\u0043");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0043" + "'", str1, "\\u0043");
    }

    @Test
    public void test21290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21290");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                             Deutsch                                             ", "IT44444444444444444EN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test21291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21291");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("french (NC_HZ)", "francesefrancesefrancesefr\\u007", 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "french (NC_HZ)" + "'", str3, "french (NC_HZ)");
    }

    @Test
    public void test21292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21292");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHsh");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test21293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21293");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNA", "hI!       G", "\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\z\\z\\z\\z\\z\\z\\z\\z\\z\\zA\\zSA\\zRA\\zQA\\zOA\\zNA" + "'", str3, "\\z\\z\\z\\z\\z\\z\\z\\z\\z\\zA\\zSA\\zRA\\zQA\\zOA\\zNA");
    }

    @Test
    public void test21294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21294");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Chinesisch (China", "hi!       ", (int) 'H');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "Italienisch#########################################################################################");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("A", strArray3, strArray7);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN", "                                                         \\u005c                                                         ", (int) 'C');
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "Azhzhzhzhzhzhzhzhzhzh");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach(" italian  ", strArray15, strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray15);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("it", strArray3, strArray15);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chinesisch (China" + "'", str9, "Chinesisch (China");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " italian  " + "'", str19, " italian  ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN" + "'", str20, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "it" + "'", str21, "it");
    }

    @Test
    public void test21295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21295");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("iTALIAN                                                                 ", ")ADANAc( ESECNARF");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iTALIAN                                                                 " + "'", str2, "iTALIAN                                                                 ");
    }

    @Test
    public void test21296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21296");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("en-GB", "englischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglisch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test21297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21297");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                ", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 " + "'", str2, "                                                 ");
    }

    @Test
    public void test21298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21298");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale0.getDisplayCountry(locale2);
        java.lang.String str6 = locale2.toLanguageTag();
        java.lang.String str7 = locale2.getDisplayLanguage();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale locale10 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale.Builder builder12 = builder9.setLocale(locale10);
        java.util.Locale.Builder builder13 = builder9.clear();
        java.util.Locale.Builder builder14 = builder13.clear();
        java.util.Locale.Builder builder16 = builder13.setLanguage("zh");
        java.util.Locale locale17 = builder16.build();
        java.util.Locale.setDefault(locale17);
        java.util.Locale locale19 = locale17.stripExtensions();
        java.util.Locale locale20 = locale19.stripExtensions();
        java.util.Locale locale22 = java.util.Locale.FRENCH;
        java.util.Locale locale23 = java.util.Locale.ENGLISH;
        java.lang.String str24 = locale23.getDisplayCountry();
        java.lang.String str25 = locale22.getDisplayVariant(locale23);
        java.lang.String str26 = locale22.getDisplayCountry();
        java.lang.String str27 = locale22.getScript();
        java.lang.String str28 = locale22.getScript();
        java.util.Locale locale29 = java.util.Locale.FRENCH;
        java.util.Locale locale30 = java.util.Locale.ENGLISH;
        java.lang.String str31 = locale30.getDisplayCountry();
        java.lang.String str32 = locale29.getDisplayVariant(locale30);
        java.lang.String str33 = locale29.getDisplayCountry();
        java.lang.String str34 = locale29.getScript();
        java.lang.String str35 = locale29.getScript();
        java.lang.String str36 = locale22.getDisplayCountry(locale29);
        java.util.Locale.Category category37 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale38 = java.util.Locale.getDefault(category37);
        java.util.Locale locale39 = java.util.Locale.FRANCE;
        java.util.Locale locale40 = java.util.Locale.ITALIAN;
        java.lang.String str42 = locale40.getExtension('h');
        java.lang.String str43 = locale39.getDisplayScript(locale40);
        java.lang.String str44 = locale39.getISO3Country();
        java.util.Locale locale45 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale45);
        java.lang.String str47 = locale39.getDisplayName(locale45);
        java.lang.String str48 = locale39.getScript();
        java.util.Locale.setDefault(category37, locale39);
        java.lang.String str50 = locale22.getDisplayCountry(locale39);
        java.lang.String str51 = locale39.getCountry();
        java.lang.String str52 = org.apache.commons.lang3.StringUtils.upperCase("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\", locale39);
        java.util.Locale locale53 = locale39.stripExtensions();
        java.util.Locale locale55 = new java.util.Locale("\\u005c");
        java.util.Locale locale57 = java.util.Locale.CHINESE;
        java.lang.String str58 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale57);
        java.lang.String str59 = locale57.getVariant();
        java.lang.String str60 = locale55.getDisplayScript(locale57);
        java.lang.String str61 = locale39.getDisplayLanguage(locale57);
        java.lang.String str62 = locale57.toLanguageTag();
        java.lang.String str63 = locale19.getDisplayVariant(locale57);
        java.lang.String str64 = locale2.getDisplayLanguage(locale19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str66 = locale19.getUnicodeLocaleType("\ud504\ub791\uc2a4HI!(\\U0020,ITALIENISCH#########################################################################################)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ???????HI!(\\U0020,ITALIENISCH#########################################################################################)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "it" + "'", str6, "it");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Italian" + "'", str7, "Italian");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "French (Canada)" + "'", str11, "French (Canada)");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + category37 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category37.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "it");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "FRA" + "'", str44, "FRA");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "de");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str47, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "FR" + "'", str51, "FR");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\" + "'", str52, "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale55.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "franz\366sisch (frankreich)" + "'", str58, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\u6cd5\u6587" + "'", str61, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "zh" + "'", str62, "zh");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str64, "\u610f\u5927\u5229\u6587");
    }

    @Test
    public void test21299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21299");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "zzzItalian (Italy)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test21300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21300");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("FRANCESE (CANADA)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "francese (canada)" + "'", str1, "francese (canada)");
    }

    @Test
    public void test21301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21301");
        java.lang.String[] strArray1 = java.util.Locale.getISOCountries();
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("Cranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkkhinoisranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkk ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkk(ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkkchineranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkk)", strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test21302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21302");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("deutsch");
        java.util.Locale.LanguageRange languageRange3 = new java.util.Locale.LanguageRange("E");
        java.lang.String str4 = languageRange3.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange3 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.util.Locale locale10 = locale8.stripExtensions();
        java.lang.String str11 = locale8.getLanguage();
        java.util.Set<java.lang.String> strSet12 = locale8.getUnicodeLocaleKeys();
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet12, "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        java.util.Locale.FilteringMode filteringMode15 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strSet12, filteringMode15);
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.lang.String str18 = locale17.getDisplayLanguage();
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str21 = locale19.getExtension('h');
        java.lang.String str22 = locale17.getDisplayCountry(locale19);
        java.util.Set<java.lang.String> strSet23 = locale19.getUnicodeLocaleKeys();
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet23, "Deutsch");
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.Locale.FilteringMode filteringMode34 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList32, filteringMode34);
        java.util.List<java.lang.String> strList36 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strSet23, filteringMode34);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList36, '\n');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "e" + "'", str4, "e");
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Italian" + "'", str9, "Italian");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "it" + "'", str11, "it");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + filteringMode15 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode15.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Italian" + "'", str18, "Italian");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + filteringMode34 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode34.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test21303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21303");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("English                                 (                United                                 Kingdom                )", "44444444444444444444444444444444!IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test21304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21304");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('B');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21305");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                         \\u005c                                                         ", "", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25 + "'", int3 == 25);
    }

    @Test
    public void test21306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21306");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("K");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "k" + "'", str1, "k");
    }

    @Test
    public void test21307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21307");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("       DE_DE            ", "FRANZ\326SISCH\n(FRANKREICH)HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_", 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test21308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21308");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian" + "'", str1, "Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian");
    }

    @Test
    public void test21309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21309");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        java.util.Locale.Builder builder6 = builder0.setLocale(locale5);
        java.util.Locale.Category category7 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale8 = java.util.Locale.getDefault(category7);
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale10.getExtension('h');
        java.lang.String str13 = locale9.getDisplayScript(locale10);
        java.lang.String str14 = locale9.getISO3Country();
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale15);
        java.lang.String str17 = locale9.getDisplayName(locale15);
        java.lang.String str18 = locale9.getScript();
        java.util.Locale.setDefault(category7, locale9);
        java.util.Locale locale20 = java.util.Locale.getDefault(category7);
        java.util.Locale locale21 = java.util.Locale.getDefault(category7);
        java.util.Locale.Category category22 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale23 = java.util.Locale.getDefault(category22);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.util.Locale locale25 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str26 = locale24.getDisplayName(locale25);
        java.util.Locale.setDefault(category22, locale25);
        java.util.Locale locale30 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category22, locale30);
        java.util.Locale locale32 = java.util.Locale.getDefault(category22);
        java.util.Locale locale34 = new java.util.Locale("en");
        java.lang.String str35 = locale32.getDisplayCountry(locale34);
        java.util.Set<java.lang.Character> charSet36 = locale34.getExtensionKeys();
        java.util.Locale.setDefault(category7, locale34);
        java.lang.String str38 = locale5.getDisplayLanguage(locale34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = locale5.getUnicodeLocaleType("\\z\\z\\z\\z\\z\\z\\z\\z\\z\\zA\\zSA\\zRA\\zQA\\zOA\\zNA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: \\z\\z\\z\\z\\z\\z\\z\\z\\z\\zA\\zSA\\zRA\\zQA\\zOA\\zNA");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category7.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FRA" + "'", str14, "FRA");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str17, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.FORMAT + "'", category22.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "allemand" + "'", str26, "allemand");
        org.junit.Assert.assertEquals(locale30.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertEquals(locale34.toString(), "en");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ALLEMAND" + "'", str35, "ALLEMAND");
        org.junit.Assert.assertNotNull(charSet36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test21310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21310");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("italian_ITALIAN_EnglisFitalian (italian,englis", 'a');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "itlin_ITALIAN_EnglisFitlin (itlin,englis" + "'", str3, "itlin_ITALIAN_EnglisFitlin (itlin,englis");
    }

    @Test
    public void test21311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21311");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)", 241, (int) '5');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test21312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21312");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\351eHHHHHHHHHHtTAHHHHHHHHHHT_ITAcor\351eHHHHHHHHHHtTAHHHHHHHHHHT_ITAcor\351eHHHHHHHHHHtTAHHHHHHHHHHT_ITAcor\351", "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\351eHHHHHHHHHHtTAHHHHHHHHHHT_ITAcor\351eHHHHHHHHHHtTAHHHHHHHHHHT_ITAcor\351eHHHHHHHHHHtTAHHHHHHHHHHT_ITAcor\351" + "'", str2, "\351eHHHHHHHHHHtTAHHHHHHHHHHT_ITAcor\351eHHHHHHHHHHtTAHHHHHHHHHHT_ITAcor\351eHHHHHHHHHHtTAHHHHHHHHHHT_ITAcor\351");
    }

    @Test
    public void test21313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21313");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("English", "Rankreich)00      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21314");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = builder6.build();
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        boolean boolean10 = locale8.hasExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test21315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21315");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444444444444444it                   zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444it                   zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" + "'", str2, "44444444444444444444444444444444444444444444it                   zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
    }

    @Test
    public void test21316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21316");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("              TA...", "                                                                                                            anglais                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21317");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", 79);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21318");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "UD                                             \\U0034");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uD                                             \\U0034" + "'", str1, "uD                                             \\U0034");
    }

    @Test
    public void test21319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21319");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "hIEnglish                                 (                United                                 Kingdom                )!English                                 (                United                                 Kingdom                )       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test21320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21320");
        java.util.Locale locale1 = new java.util.Locale("TA...");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale1.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for ta...");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "ta...");
    }

    @Test
    public void test21321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21321");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hi!        (\\U0020,Italienisch#########################################################################################nnn", ")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))italian");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21322");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HI!hI!hI!hI!hI!CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00d\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn", "E");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test21323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21323");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\u30ab\u30ca\u30c0", "enenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u30ab\u30ca\u30c0" + "'", str2, "\u30ab\u30ca\u30c0");
    }

    @Test
    public void test21324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21324");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("!       2ITALIANITALIANITALIANITALItalienisch2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese (China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienisch", "cCCCC...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cCCCC..." + "'", str2, "cCCCC...");
    }

    @Test
    public void test21325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21325");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0...", 78);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0..." + "'", str2, "\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0...");
    }

    @Test
    public void test21326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21326");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("tanoch", 51, 'n');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tanochnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn" + "'", str3, "tanochnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    }

    @Test
    public void test21327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21327");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("FRDzhEzhFzhGzhIzhLzhMzhNzhOzhQzhRzhSzheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", "ITTAIT_ITALIAN_EGAISHI!_\\U0020_ITLE###########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21328");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\U0020", '8');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "REHEGEEECEZDODMDKDJDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBY", 804, 224);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test21329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21329");
        java.util.Locale locale2 = new java.util.Locale("\\u0066");
        java.lang.String str4 = locale2.getExtension('i');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("Cinese (Cina)\\u0069h...", locale2);
        java.lang.String str6 = locale2.getScript();
        java.lang.String str7 = locale2.getScript();
        org.junit.Assert.assertEquals(locale2.toString(), "\\u0066");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cinese (cina)\\u0069h..." + "'", str5, "cinese (cina)\\u0069h...");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test21330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21330");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder6 = builder3.setScript("");
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = locale9.toLanguageTag();
        java.util.Set<java.lang.String> strSet11 = locale9.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder12 = builder7.setLocale(locale9);
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale.Builder builder16 = builder12.setExtension('h', "Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder16.setLanguage("UD                                             \\U0034");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: UD                                             \\U0034 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-US" + "'", str10, "en-US");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test21331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21331");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)", 537, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ermany)ger" + "'", str3, "ermany)ger");
    }

    @Test
    public void test21332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21332");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("titititititit", "NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test21333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21333");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.Locale.FilteringMode filteringMode18 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList19 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList16, filteringMode18);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList22);
        java.lang.String str25 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList22);
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleKeys();
        java.lang.String str28 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet27);
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.util.Locale.FilteringMode filteringMode37 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList38 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.lang.String>) strList35, filteringMode37);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.util.Locale.FilteringMode filteringMode47 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList45, filteringMode47);
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList51);
        java.lang.String str54 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.lang.String>) strList51);
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.util.Locale.LanguageRange[] languageRangeArray58 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList59 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59, languageRangeArray58);
        java.lang.String[] strArray63 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        java.util.Locale.FilteringMode filteringMode66 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList67 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, (java.util.Collection<java.lang.String>) strList64, filteringMode66);
        java.util.Locale.FilteringMode filteringMode68 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList69 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.lang.String>) strList64, filteringMode68);
        java.util.Locale.LanguageRange[] languageRangeArray70 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList71 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71, languageRangeArray70);
        java.util.Locale.LanguageRange[] languageRangeArray73 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList74 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74, languageRangeArray73);
        java.lang.String[] strArray78 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList79 = new java.util.ArrayList<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList79, strArray78);
        java.util.Locale.FilteringMode filteringMode81 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList82 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, (java.util.Collection<java.lang.String>) strList79, filteringMode81);
        java.util.Locale.FilteringMode filteringMode83 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList71, (java.util.Collection<java.lang.String>) strList79, filteringMode83);
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.lang.String>) strList69, filteringMode83);
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList69);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap87 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList88 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap87);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap89 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList90 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap89);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap91 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList92 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList90, strMap91);
        java.util.Collection<java.lang.String> strCollection93 = null;
        java.util.List<java.lang.String> strList94 = java.util.Locale.filterTags(languageRangeList92, strCollection93);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode8.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + filteringMode18 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode18.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + filteringMode37 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode37.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + filteringMode47 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode47.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(languageRangeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + filteringMode66 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode66.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertTrue("'" + filteringMode68 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode68.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(languageRangeArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(languageRangeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + filteringMode81 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode81.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertTrue("'" + filteringMode83 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode83.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertNotNull(languageRangeList88);
        org.junit.Assert.assertNotNull(languageRangeList90);
        org.junit.Assert.assertNotNull(languageRangeList92);
        org.junit.Assert.assertNotNull(strList94);
    }

    @Test
    public void test21334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21334");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "Franz\366sisch (Kanada)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21335");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("HCSTUED", "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000italiano000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000", 20);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HCSTUED" + "'", str3, "HCSTUED");
    }

    @Test
    public void test21336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21336");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "ITALIENISCH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test21337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21337");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("France");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("inglese", locale2);
        java.lang.String str4 = locale2.getDisplayName();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "france");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "INGLESE" + "'", str3, "INGLESE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "france" + "'", str4, "france");
    }

    @Test
    public void test21338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21338");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test21339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21339");
        java.util.Locale locale1 = new java.util.Locale("en");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        boolean boolean4 = locale1.hasExtensions();
        java.lang.String str5 = locale1.getCountry();
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "");
        boolean boolean9 = locale1.equals((java.lang.Object) "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test21340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21340");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("frankreich", 42, 997);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test21341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21341");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\\u0052", 69);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                               \\u0052" + "'", str2, "                                                               \\u0052");
    }

    @Test
    public void test21342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21342");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", (java.lang.CharSequence) "gbr");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21343");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                        ittait_italian_egaish                                 \\u006", (java.lang.CharSequence) "T");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                        ittait_italian_egaish                                 \\u006" + "'", charSequence2, "                                        ittait_italian_egaish                                 \\u006");
    }

    @Test
    public void test21344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21344");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HSXLGNE_NAILATI_NAXLATX\\", "\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r", "ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAfffffffffffffffffffffffffffffffff", 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HSXLGNE_NAILATI_NAXLATX\\" + "'", str4, "HSXLGNE_NAILATI_NAXLATX\\");
    }

    @Test
    public void test21345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21345");
        java.util.Locale locale2 = new java.util.Locale("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "TALIAN");
        org.junit.Assert.assertEquals(locale2.toString(), "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkdekkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk_TALIAN");
    }

    @Test
    public void test21346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21346");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "itTAiT_ITA", 52);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "English");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 101, 40);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test21347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21347");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u0045", "FRANC", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test21348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21348");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('7');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0037" + "'", str1, "\\u0037");
    }

    @Test
    public void test21349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21349");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("I\\U0020ITALIANITALIANITALIANITALIIT", "FR_CA                             ...!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21350");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale.Builder builder7 = builder1.clear();
        java.util.Locale.Builder builder9 = builder7.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setScript("hcstued");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: hcstued [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test21351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21351");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.Locale.FilteringMode filteringMode18 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList19 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList16, filteringMode18);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList22);
        java.lang.String str25 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList22);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.Locale.FilteringMode filteringMode34 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList32, filteringMode34);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList38);
        java.lang.String str41 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList38);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap42 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList43 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap42);
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.lang.String[] strArray49 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        java.util.Locale.FilteringMode filteringMode52 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.lang.String>) strList50, filteringMode52);
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.lang.String>) strList56);
        java.lang.String str59 = java.util.Locale.lookupTag(languageRangeList43, (java.util.Collection<java.lang.String>) strList58);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList61 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap62 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList63 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList61, strMap62);
        java.util.Locale locale66 = new java.util.Locale("chinois (Chine)", "\\italian_ITALIAN_English");
        java.util.Set<java.lang.String> strSet67 = locale66.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags(languageRangeList61, (java.util.Collection<java.lang.String>) strSet67);
        java.lang.String str70 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList68, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)\\u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        java.util.Locale.FilteringMode filteringMode71 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList72 = java.util.Locale.filterTags(languageRangeList43, (java.util.Collection<java.lang.String>) strList68, filteringMode71);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap73 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList74 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList43, strMap73);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode8.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + filteringMode18 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode18.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + filteringMode34 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode34.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(languageRangeList43);
        org.junit.Assert.assertNotNull(languageRangeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + filteringMode52 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode52.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(languageRangeList61);
        org.junit.Assert.assertNotNull(languageRangeList63);
        org.junit.Assert.assertEquals(locale66.toString(), "chinois (chine)_\\ITALIAN_ITALIAN_ENGLISH");
        org.junit.Assert.assertNotNull(strSet67);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + filteringMode71 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode71.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(languageRangeList74);
    }

    @Test
    public void test21352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21352");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setVariant("itTAiT_ITALIAN_EgAish");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setVariant("Eagaash");
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder12 = builder9.setScript("");
        java.util.Locale.Builder builder14 = builder12.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder14.setVariant("e             HCSINEILATI             g             HCSINEILATI                          HCSINEILATI             sh");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: e             HCSINEILATI             g             HCSINEILATI                          HCSINEILATI             sh [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test21353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21353");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0046\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "\\u0020italianitalianitalianitali");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test21354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21354");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("HCSINEI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HCSINEI" + "'", str1, "HCSINEI");
    }

    @Test
    public void test21355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21355");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                          \\u0046");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "TIT");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test21356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21356");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.setLanguage("fr");
        java.util.Locale locale10 = builder6.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
    }

    @Test
    public void test21357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21357");
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.util.Locale.setDefault(category1, locale4);
        java.util.Locale locale9 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category1, locale9);
        java.util.Locale locale11 = java.util.Locale.getDefault(category1);
        java.util.Locale locale13 = new java.util.Locale("en");
        java.lang.String str14 = locale11.getDisplayCountry(locale13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.lowerCase("Francia", locale13);
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.util.Locale.setDefault(locale16);
        java.lang.String str19 = locale13.getDisplayCountry(locale16);
        java.util.Locale locale20 = locale13.stripExtensions();
        java.lang.String str21 = locale13.getDisplayCountry();
        java.util.Locale.Category category22 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale23 = java.util.Locale.getDefault(category22);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.util.Locale locale25 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str26 = locale24.getDisplayName(locale25);
        java.util.Locale.setDefault(category22, locale25);
        java.util.Locale.Category category28 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale29 = java.util.Locale.getDefault(category28);
        java.lang.String str31 = locale29.getExtension('x');
        java.util.Locale.setDefault(category22, locale29);
        java.util.Locale locale33 = java.util.Locale.getDefault(category22);
        java.util.Locale locale35 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale.setDefault(category22, locale35);
        java.util.Locale locale37 = java.util.Locale.FRENCH;
        java.util.Locale locale38 = java.util.Locale.ENGLISH;
        java.lang.String str39 = locale38.getDisplayCountry();
        java.lang.String str40 = locale37.getDisplayVariant(locale38);
        java.lang.String str41 = locale37.getDisplayCountry();
        java.lang.String str42 = locale37.getScript();
        java.lang.String str43 = locale37.getScript();
        java.util.Locale locale44 = java.util.Locale.FRENCH;
        java.util.Locale locale45 = java.util.Locale.ENGLISH;
        java.lang.String str46 = locale45.getDisplayCountry();
        java.lang.String str47 = locale44.getDisplayVariant(locale45);
        java.lang.String str48 = locale44.getDisplayCountry();
        java.lang.String str49 = locale44.getScript();
        java.lang.String str50 = locale44.getScript();
        java.lang.String str51 = locale37.getDisplayCountry(locale44);
        java.util.Locale.Category category52 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale53 = java.util.Locale.getDefault(category52);
        java.util.Locale locale54 = java.util.Locale.FRANCE;
        java.util.Locale locale55 = java.util.Locale.ITALIAN;
        java.lang.String str57 = locale55.getExtension('h');
        java.lang.String str58 = locale54.getDisplayScript(locale55);
        java.lang.String str59 = locale54.getISO3Country();
        java.util.Locale locale60 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale60);
        java.lang.String str62 = locale54.getDisplayName(locale60);
        java.lang.String str63 = locale54.getScript();
        java.util.Locale.setDefault(category52, locale54);
        java.lang.String str65 = locale37.getDisplayCountry(locale54);
        java.util.Locale.Builder builder66 = new java.util.Locale.Builder();
        java.util.Locale locale67 = builder66.build();
        java.util.Locale locale69 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str70 = locale67.getDisplayLanguage(locale69);
        java.lang.String str71 = locale54.getDisplayVariant(locale67);
        java.util.Locale.setDefault(category22, locale67);
        java.util.Locale locale73 = java.util.Locale.FRANCE;
        java.util.Locale locale74 = java.util.Locale.ITALIAN;
        java.lang.String str76 = locale74.getExtension('h');
        java.lang.String str77 = locale73.getDisplayScript(locale74);
        java.util.Locale locale78 = locale73.stripExtensions();
        java.util.Set<java.lang.Character> charSet79 = locale78.getExtensionKeys();
        java.util.Locale locale81 = java.util.Locale.ENGLISH;
        java.lang.String str82 = locale81.getDisplayLanguage();
        java.lang.String str83 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale81);
        java.lang.String str84 = locale81.getCountry();
        java.lang.String str85 = locale81.getCountry();
        boolean boolean86 = locale81.hasExtensions();
        java.lang.String str87 = locale78.getDisplayVariant(locale81);
        java.lang.String str89 = locale81.getExtension('a');
        java.lang.String str90 = locale67.getDisplayScript(locale81);
        java.lang.String str91 = locale13.getDisplayScript(locale67);
        java.util.Set<java.lang.String> strSet92 = locale13.getUnicodeLocaleAttributes();
        java.lang.String str94 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet92, "german (germany)");
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "allemand" + "'", str5, "allemand");
        org.junit.Assert.assertEquals(locale9.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ALLEMAND" + "'", str14, "ALLEMAND");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "francia" + "'", str15, "francia");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "italien" + "'", str17, "italien");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.FORMAT + "'", category22.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "allemand" + "'", str26, "allemand");
        org.junit.Assert.assertTrue("'" + category28 + "' != '" + java.util.Locale.Category.FORMAT + "'", category28.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_CA");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + category52 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category52.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "it");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "it");
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "FRA" + "'", str59, "FRA");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "de");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str62, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "it");
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet79);
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "en");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "anglais" + "'", str82, "anglais");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "!IH" + "'", str83, "!IH");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertNotNull(strSet92);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
    }

    @Test
    public void test21358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21358");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21359");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\\u0034\\u00hcstud\\u0034\\u00", "\\u005");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test21360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21360");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "...xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", (java.lang.CharSequence) "))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test21361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21361");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  \\u005   ", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)\\u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 20);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("444444444it", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test21362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21362");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('S');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character S is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("CCCCCCCCC", "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCCCCCCCC" + "'", str2, "CCCCCCCCC");
    }

    @Test
    public void test21364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21364");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("Azhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)A", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rchinesisch (china)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21365");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("                                                  HSIAGE_NAILATI_TIATTIHI!_NAILATI HSILGNE_NAILATI_NAILAT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test21366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21366");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                         \\u0046                                                         ", "Iinglese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                         \\u0046                                                         " + "'", str2, "                                                         \\u0046                                                         ");
    }

    @Test
    public void test21367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21367");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("ANGLAIS (ROYAUME-UNI)FRA", "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGkorezhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)", "KKKKKKKKKKKKKKKKKKKK)DNK(HCSIS\326ZNRFKKKKKKKKKKKKKKKKKKKK");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ANGLAIS (ROYAUME-UNI)FRA" + "'", str3, "ANGLAIS (ROYAUME-UNI)FRA");
    }

    @Test
    public void test21368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21368");
        java.util.Locale locale1 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet4 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charSet4);
    }

    @Test
    public void test21369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21369");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("United State                                                                                     ", "\u1112\u1161\u11ab\u1100\u116e\u11a8\u110b\u1165\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nITALIAN_ITALIAN_ENGLISF\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "United State                                                                                     " + "'", str2, "United State                                                                                     ");
    }

    @Test
    public void test21370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21370");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip(".", "GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
    }

    @Test
    public void test21371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21371");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\ud504\ub791\uc2a4\uc5b4", "                                                                                                                                                                                                                                                                                                                                                                     4444ALLEMAND 4444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test21372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21372");
        java.util.Locale locale3 = new java.util.Locale("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA", "", "                                      )hsilgne,nailati( ");
        java.lang.String str4 = locale3.getDisplayName();
        org.junit.Assert.assertEquals(locale3.toString(), "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca__                                      )hsilgne,nailati( ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca (                                      )hsilgne,nailati( )" + "'", str4, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca (                                      )hsilgne,nailati( )");
    }

    @Test
    public void test21373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21373");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                             de_de                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                             de_de                                             " + "'", str1, "                                             de_de                                             ");
    }

    @Test
    public void test21374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21374");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet1, "");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test21375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21375");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("italy", 'd', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italy" + "'", str3, "italy");
    }

    @Test
    public void test21376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21376");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                    \\u0020iTALIANiTALIANiTALIANiTALI", "", 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
    }

    @Test
    public void test21377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21377");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Italie", "ECANADAgCANADACANADAsh                                                                                                   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test21378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21378");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("          HI!           ", "hi! 5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienisch");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21379");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("                                           fRENCH (fRANCE)                                            ", "2CINESE (CINA.", 9);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("          2cinese (cina)italianitalianitalianital", (java.lang.Object[]) strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fR          2cinese (cina)italianitalianitalianitalH          2cinese (cina)italianitalianitalianitalfR          2cinese (cina)italianitalianitalianital)" + "'", str6, "fR          2cinese (cina)italianitalianitalianitalH          2cinese (cina)italianitalianitalianitalfR          2cinese (cina)italianitalianitalianital)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fRHfR)" + "'", str7, "fRHfR)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfraH\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfrafR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra)" + "'", str8, "fR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfraH\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfrafR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra)");
    }

    @Test
    public void test21380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21380");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        java.lang.String str5 = locale3.getDisplayLanguage();
        boolean boolean6 = locale3.hasExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "italian" + "'", str5, "italian");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test21381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21381");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "\\!u!00!de!\\!u!0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21382");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                               English(UnitedKingdom)                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21383");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!ih    Deutsc", "KKKKKKKKKKKKKKKKKKKK)DNK( HCSIS\326ZNRFKKKKKKKKKKKKKKKKKKKK", "44d444", 53);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih    Deutsc" + "'", str4, "!ih    Deutsc");
    }

    @Test
    public void test21384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21384");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Franz\366sischFranzosisch(Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "\ud504");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test21385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21385");
        java.util.Locale locale1 = new java.util.Locale("cinese (Cina)                                                               ");
        org.junit.Assert.assertEquals(locale1.toString(), "cinese (cina)                                                               ");
    }

    @Test
    public void test21386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21386");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("italian_ITALIAN_EnglisF", ' ', '9');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italian_ITALIAN_EnglisF" + "'", str3, "italian_ITALIAN_EnglisF");
    }

    @Test
    public void test21387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21387");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...       HCSINEILATI                          HCSINEILATI             sh", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test21388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21388");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("ILATiNA...royaume-uniroyaume-uniroy");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ILATiNA...royaume-uniroyaume-uniroy" + "'", str1, "ILATiNA...royaume-uniroyaume-uniroy");
    }

    @Test
    public void test21389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21389");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "italiaE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test21390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21390");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\\U0049");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21391");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0029", "         ITALIAN_italian_eNGLISH", 16);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u0029" + "'", str5, "\\u0029");
    }

    @Test
    public void test21392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21392");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\ud504', 'b');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\ud504' + "'", char2 == '\ud504');
    }

    @Test
    public void test21393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21393");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("...dedcfcgchcickclcmcncocrcucvcwcxcyczdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdaeafagaialamanaoaqarasatauawaxazbabbbda", "italian    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test21394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21394");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) '5');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test21395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21395");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hsilgnE_NAILATI_nailati\\" + "'", str1, "hsilgnE_NAILATI_nailati\\");
    }

    @Test
    public void test21396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21396");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "itTAiT_ITALIAN_EgAishi!_\\u0020_iTLE###########", "FranzosischFranz\366sisch (Kanada)(Frankreich)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21397");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('Y');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test21398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21398");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("         HHHHHHHHHILATILGNe_nailati_NAI         HSILATI!_NAI_TiATtiHILATIhsiAgE_NA", "\\U0034\\U00                                             HCSTUD                                             \\U0034\\U00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test21399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21399");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("E");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String str6 = languageRange1.getRange();
        java.lang.String str7 = languageRange1.getRange();
        java.util.Locale.Category category8 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale10 = new java.util.Locale("\\u005c");
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale12);
        java.lang.String str14 = locale12.getVariant();
        java.lang.String str15 = locale10.getDisplayScript(locale12);
        java.util.Locale.setDefault(locale10);
        java.util.Locale.setDefault(category8, locale10);
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.lang.String str22 = locale20.getExtension('h');
        java.lang.String str23 = locale19.getDisplayScript(locale20);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale19);
        java.lang.String str26 = locale19.getExtension('z');
        java.util.Locale.setDefault(category8, locale19);
        java.util.Locale locale28 = java.util.Locale.ITALIAN;
        java.lang.String str30 = locale28.getExtension('h');
        java.lang.String str31 = locale28.getVariant();
        java.util.Locale.setDefault(category8, locale28);
        java.util.Locale locale33 = java.util.Locale.getDefault(category8);
        boolean boolean34 = languageRange1.equals((java.lang.Object) category8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e" + "'", str2, "e");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "e" + "'", str5, "e");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "e" + "'", str6, "e");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "e" + "'", str7, "e");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.FORMAT + "'", category8.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale10.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "franz\366sisch (frankreich)" + "'", str13, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!       " + "'", str24, "hi!       ");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "it");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "it");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test21400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21400");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\U0020ITALIANITALIANITALIANITALI", "))))))))))))))))))))))))))))))))))))))))))))))))))))", 99);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '\u671d');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI" + "'", str5, "\\U0020ITALIANITALIANITALIANITALI");
    }

    @Test
    public void test21401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21401");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHI!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK" + "'", str2, "_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
    }

    @Test
    public void test21402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21402");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'c', '\ud504');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'c' + "'", char2 == 'c');
    }

    @Test
    public void test21403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21403");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRFrancia");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRFrancia" + "'", str2, "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRFrancia");
    }

    @Test
    public void test21404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21404");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test21405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21405");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale6 = builder5.build();
        java.lang.String str7 = locale6.getDisplayCountry();
        java.util.Locale.Builder builder8 = builder3.setLocale(locale6);
        java.lang.String str9 = locale6.getDisplayCountry();
        java.lang.String str10 = locale6.getLanguage();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test21406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21406");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\\u0020iTALIANiTALIANiTALIANiTALI", "");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("French (Canada)", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "ittait_italian_egaish          ");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("########################################################################################", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\u0020iTALIANiTALIANiTALIANiTALI" + "'", str7, "\\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\u0020iTALIANiTALIANiTALIANiTALI" + "'", str9, "\\u0020iTALIANiTALIANiTALIANiTALI");
    }

    @Test
    public void test21407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21407");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("e                               ", 109, "                                                          nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                          nnnnnnnnnnnnnnnnnnne                               " + "'", str3, "                                                          nnnnnnnnnnnnnnnnnnne                               ");
    }

    @Test
    public void test21408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21408");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("fr_CA                             ...!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21409");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        boolean boolean3 = locale0.hasExtensions();
        java.util.Locale.setDefault(locale0);
        boolean boolean5 = locale0.hasExtensions();
        java.lang.String str6 = locale0.getDisplayScript();
        java.lang.String str7 = locale0.getDisplayVariant();
        java.lang.String str8 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italy" + "'", str2, "Italy");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test21410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21410");
        java.util.Locale locale2 = new java.util.Locale("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "Franz\366sischFranzosisch (Frankreich)");
        java.lang.String str3 = locale2.toLanguageTag();
        org.junit.Assert.assertEquals(locale2.toString(), "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii_FRANZ\366SISCHFRANZOSISCH (FRANKREICH)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
    }

    @Test
    public void test21411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21411");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("ITALIAN (italian,eNGLISH)", '!');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITALIAN (italian,eNGLISH)" + "'", str2, "ITALIAN (italian,eNGLISH)");
    }

    @Test
    public void test21412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21412");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("en-US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-US" + "'", str1, "en-US");
    }

    @Test
    public void test21413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21413");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\\\\\\\\\\\\\\\\\\\\\\\kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test21414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21414");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4", "E             g                                                                                     ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
    }

    @Test
    public void test21415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21415");
        java.lang.String[] strArray2 = java.util.Locale.getISOCountries();
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("ita", strArray2);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("Egsh", strArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test21416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21416");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setLanguage("iFranzosisch ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: iFranzosisch  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cinese (Cina)" + "'", str5, "cinese (Cina)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test21417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21417");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "HCSTUD \\U0034");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test21418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21418");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN", "", 26);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test21419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21419");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder3.removeUnicodeLocaleAttribute("italy");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        java.util.Locale locale11 = builder8.build();
        java.lang.String str12 = locale11.getISO3Language();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test21420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21420");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("z...frn", (int) 'e', "))))))))))))))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ")))))))))))))))))))))))))))))))))))))))))))))))z...frn)))))))))))))))))))))))))))))))))))))))))))))))" + "'", str3, ")))))))))))))))))))))))))))))))))))))))))))))))z...frn)))))))))))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test21421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21421");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fr");
        java.lang.String[] strArray5 = new java.lang.String[] { "...ANiTALI", "             ", "          " };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap9);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.Locale.FilteringMode filteringMode19 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList20 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList17, filteringMode19);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList23);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.Locale.FilteringMode filteringMode34 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList32, filteringMode34);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList38);
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList38);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap42 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList43 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, strMap42);
        java.util.Locale locale44 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet45 = locale44.getUnicodeLocaleAttributes();
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet45, "\\u005c");
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet45, "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strSet45);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap51 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList52 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, strMap51);
        java.util.Locale.Builder builder53 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder54 = builder53.clearExtensions();
        java.util.Locale locale55 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str56 = locale55.getDisplayName();
        java.util.Locale.Builder builder57 = builder54.setLocale(locale55);
        java.util.Locale locale58 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder59 = builder54.setLocale(locale58);
        java.util.Set<java.lang.String> strSet60 = locale58.getUnicodeLocaleAttributes();
        java.lang.String str61 = locale58.getVariant();
        java.util.Locale locale62 = java.util.Locale.ITALIAN;
        java.lang.String str63 = locale62.getDisplayLanguage();
        java.lang.String str64 = locale58.getDisplayLanguage(locale62);
        java.util.Set<java.lang.String> strSet65 = locale58.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strSet65);
        java.util.List<java.lang.String> strList67 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList66);
        java.util.Collection<java.util.Locale> localeCollection68 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale69 = java.util.Locale.lookup(languageRangeList1, localeCollection68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + filteringMode19 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode19.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + filteringMode34 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode34.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(languageRangeList43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(languageRangeList52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "francese (Canada)" + "'", str56, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "it");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "italiano" + "'", str63, "italiano");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "tedesco" + "'", str64, "tedesco");
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(strList67);
    }

    @Test
    public void test21422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21422");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hzhzhzhzhzhzh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hzhzhzhzhzhzh" + "'", str1, "hzhzhzhzhzhzh");
    }

    @Test
    public void test21423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21423");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\\u0020iTALIANiTALIANiTALIANiTALI", "");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("French (Canada)", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("ko", (java.lang.Object[]) strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'B');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "french (canada)                                                                  ", 46, 262);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u0020iTALIANiTALIANiTALIANiTALI" + "'", str6, "\\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\u0020iTALIANiTALIANiTALIANiTALI" + "'", str9, "\\u0020iTALIANiTALIANiTALIANiTALI");
    }

    @Test
    public void test21424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21424");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK" + "'", str1, "_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
    }

    @Test
    public void test21425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21425");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                  \\U0069HHHHHHHHHH", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxESENIHC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                  \\U0069HHHHHHHHHH" + "'", str2, "                                                                  \\U0069HHHHHHHHHH");
    }

    @Test
    public void test21426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21426");
        java.util.Locale locale3 = new java.util.Locale("italian_ITALIAN_EnglisFitalian (italian,englis", "                                                    ", "ITALIAN_ITALIAN_ENGLISH");
        boolean boolean4 = locale3.hasExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "italian_italian_englisfitalian (italian,englis_                                                    _ITALIAN_ITALIAN_ENGLISH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test21427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21427");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("ITALIAN (ITALIAN,ENGLISH)", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rHI!\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21428");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\\u0034\\u00                                             hcstud                                             \\u0034\\u00 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0034\\u00                                             hcstud                                             \\u0034\\u00 " + "'", str1, "\\u0034\\u00                                             hcstud                                             \\u0034\\u00 ");
    }

    @Test
    public void test21429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21429");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("                                               nailati                                                ko");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=                                               nailati                                                ko");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21430");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder9 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.removeUnicodeLocaleAttribute("!!!!!!!!!!!!!!!!!!!!!!    zh_cn    !!!!!!!!!!!!!!!!!!!!!!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: !!!!!!!!!!!!!!!!!!!!!!    zh_cn    !!!!!!!!!!!!!!!!!!!!!! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinesisch (China)" + "'", str5, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test21431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21431");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", 115, 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test21432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21432");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("iTALIAN (ITALIAN,ENGLISH", "USEEEE");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "HI!");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("9hhhhhhhhhh", strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinig", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test21433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21433");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...lian (italian,e...                                                                                          ", "f (KOREAN)", 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test21434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21434");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str5 = locale4.getDisplayScript();
        java.lang.String str6 = locale2.getDisplayCountry(locale4);
        java.util.Locale locale8 = new java.util.Locale("\\u0066");
        java.lang.String str10 = locale8.getExtension('i');
        java.lang.String str11 = locale4.getDisplayScript(locale8);
        java.lang.String str12 = locale8.getScript();
        java.util.Locale locale13 = java.util.Locale.US;
        java.lang.String str14 = locale13.getScript();
        java.util.Set<java.lang.String> strSet15 = locale13.getUnicodeLocaleAttributes();
        java.lang.String str16 = locale13.getCountry();
        java.lang.String str17 = locale8.getDisplayName(locale13);
        java.lang.String str18 = locale8.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italienisch" + "'", str1, "Italienisch");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0066");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "US" + "'", str16, "US");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\u0066" + "'", str17, "\\u0066");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\u0066" + "'", str18, "\\u0066");
    }

    @Test
    public void test21435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21435");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\\u0020iIalian\\u008600u\\U\\u0020iIalian\\u0020iUanglaisUFRZ\326CZ(FRKREC)Uialian    U                                                                                                      U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...", 2, 20);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0020iIalian\\u008600u" + "'", str3, "0020iIalian\\u008600u");
    }

    @Test
    public void test21436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21436");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("78", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "78" + "'", str2, "78");
    }

    @Test
    public void test21437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21437");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("und-CA", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkNI");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test21438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21438");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.lang.String str4 = locale0.getDisplayCountry();
        java.lang.String str5 = locale0.getScript();
        java.lang.String str6 = locale0.getScript();
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.lang.String str9 = locale8.getDisplayCountry();
        java.lang.String str10 = locale7.getDisplayVariant(locale8);
        java.lang.String str11 = locale7.getDisplayCountry();
        java.lang.String str12 = locale7.getScript();
        java.lang.String str13 = locale7.getScript();
        java.lang.String str14 = locale0.getDisplayCountry(locale7);
        java.lang.String str15 = locale7.getDisplayCountry();
        java.lang.String str16 = locale7.getLanguage();
        java.lang.String str17 = locale7.getDisplayCountry();
        java.lang.String str18 = locale7.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "fr" + "'", str16, "fr");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test21439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21439");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HSAAGAekkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HSAAGAekkkkkkkkkkkkkkkkk" + "'", str1, "HSAAGAekkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test21440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21440");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Chinois (chine)");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("\\0020ItalianItalianItalianItal", strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("069\\u0069\\u0069\\u0069\\u0069\\", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test21441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21441");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\u0034\\u00                                   en_C\\u0034\\u00", "                                ", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test21442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21442");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("de_DE", locale1);
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet3, '0');
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DE_DE" + "'", str2, "DE_DE");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test21443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21443");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("E             gallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand", "de_DE", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test21444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21444");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder5.clearExtensions();
        java.util.Locale locale9 = builder8.build();
        java.util.Locale locale10 = java.util.Locale.PRC;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale.Builder builder12 = builder8.setLocale(locale10);
        java.util.Locale.Builder builder13 = builder8.clear();
        java.util.Locale.Builder builder14 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder14.removeUnicodeLocaleAttribute("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "italian");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese (China)" + "'", str11, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test21445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21445");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.util.Locale locale9 = locale7.stripExtensions();
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str12 = locale11.getDisplayScript();
        java.lang.String str13 = locale9.getDisplayCountry(locale11);
        java.util.Set<java.lang.Character> charSet14 = locale9.getExtensionKeys();
        java.util.Locale.Builder builder15 = builder0.setLocale(locale9);
        java.util.Locale locale17 = java.util.Locale.FRENCH;
        java.util.Locale locale18 = java.util.Locale.ENGLISH;
        java.lang.String str19 = locale18.getDisplayCountry();
        java.lang.String str20 = locale17.getDisplayVariant(locale18);
        java.lang.String str21 = locale17.getDisplayCountry();
        java.lang.String str22 = locale17.getScript();
        java.lang.String str23 = locale17.getScript();
        java.util.Locale locale24 = java.util.Locale.FRENCH;
        java.util.Locale locale25 = java.util.Locale.ENGLISH;
        java.lang.String str26 = locale25.getDisplayCountry();
        java.lang.String str27 = locale24.getDisplayVariant(locale25);
        java.lang.String str28 = locale24.getDisplayCountry();
        java.lang.String str29 = locale24.getScript();
        java.lang.String str30 = locale24.getScript();
        java.lang.String str31 = locale17.getDisplayCountry(locale24);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.upperCase("\\xtalxan_ITALIAN_Englxsh", locale24);
        java.lang.String str33 = locale24.getDisplayName();
        java.util.Locale locale34 = null;
        java.lang.String str35 = locale24.getDisplayVariant(locale34);
        java.util.Set<java.lang.String> strSet36 = locale24.getUnicodeLocaleKeys();
        java.lang.String str37 = locale9.getDisplayVariant(locale24);
        java.util.Locale locale39 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str40 = locale39.getDisplayScript();
        java.lang.String str41 = locale39.getDisplayName();
        java.lang.String str42 = locale9.getDisplayVariant(locale39);
        java.util.Locale.setDefault(locale9);
        java.lang.String str45 = locale9.getExtension('t');
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italian" + "'", str8, "Italian");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\\XTALXAN_ITALIAN_ENGLXSH" + "'", str32, "\\XTALXAN_ITALIAN_ENGLXSH");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "French" + "'", str33, "French");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test21446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21446");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("onailati", "Korean (Souti\\u0020iTALIANiTALIANiTALIANiTALIitBBBBBBBBB\\BBBBB Korea)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21447");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("cinese) )()C)ina)))\\)u)0069)h)...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cinese) )()c)ina)))\\)u)0069)h)..." + "'", str1, "cinese) )()c)ina)))\\)u)0069)h)...");
    }

    @Test
    public void test21448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21448");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh...", 'I');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test21449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21449");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "CHINA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21450");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("TALIAN\\u0023DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE", "", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test21451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21451");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a", "                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21452");
        java.util.Locale locale1 = java.util.Locale.ITALY;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayCountry();
        boolean boolean4 = locale1.hasExtensions();
        java.util.Locale.setDefault(locale1);
        boolean boolean6 = locale1.hasExtensions();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("                          ...", locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Italia" + "'", str3, "Italia");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                          ..." + "'", str7, "                          ...");
    }

    @Test
    public void test21453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21453");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Deutsch", "             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "\\u0020iItalian\\u008600u\\\\atalaaa_ITALIAN_Eaglaaa\\u0020iItalian\\u008600u\\U");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hI!       ", 116, (int) '!');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0020iItalian\\u008600u\\\\atalaaa_ITALIAN_Eaglaaa\\u0020iItalian\\u008600u\\Ueutsc\\u0020iItalian\\u008600u\\\\atalaaa_ITALIAN_Eaglaaa\\u0020iItalian\\u008600u\\U" + "'", str4, "\\u0020iItalian\\u008600u\\\\atalaaa_ITALIAN_Eaglaaa\\u0020iItalian\\u008600u\\Ueutsc\\u0020iItalian\\u008600u\\\\atalaaa_ITALIAN_Eaglaaa\\u0020iItalian\\u008600u\\U");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test21454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21454");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Englisch (Vereinigtes K\366nigreich)", "Italian");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("KKKKKKKKKKKKKKKKKEAGAASH", strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'G', 18, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test21455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21455");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale8 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str9 = locale0.getDisplayCountry(locale8);
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale11 = locale0.stripExtensions();
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleAttributes();
        java.lang.String str13 = locale11.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals(locale8.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "France" + "'", str9, "France");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fr" + "'", str13, "fr");
    }

    @Test
    public void test21456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21456");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("it hi!       _\\U0020...T hi!       _\\U0020...Ai hi!       _\\U0020...T hi!       _\\U0020..._ hi!       _\\U0020...ITA", "A)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaDzh_CNfRENCH (cANA", 804);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test21457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21457");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str4 = locale3.getCountry();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.lang.String str7 = locale6.getDisplayCountry();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleAttributes();
        java.lang.String str9 = locale3.getDisplayName(locale6);
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = locale6.getDisplayLanguage(locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test21458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21458");
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale1);
        java.lang.String str3 = locale1.getDisplayName();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("NA");
        java.lang.String str6 = locale5.getVariant();
        java.lang.String str7 = locale1.getDisplayCountry(locale5);
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.lang.String str9 = locale8.getDisplayVariant();
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.util.Locale locale11 = java.util.Locale.ENGLISH;
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale10.getDisplayVariant(locale11);
        java.lang.String str14 = locale8.getDisplayScript(locale11);
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.util.Locale locale17 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str18 = locale16.getDisplayScript(locale17);
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.lang.String str22 = locale20.getExtension('h');
        java.lang.String str23 = locale19.getDisplayScript(locale20);
        java.lang.String str24 = locale19.getISO3Country();
        java.lang.String str25 = locale17.getDisplayVariant(locale19);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.upperCase("\\u0020iTALIANiTALIANiTALIANiTALI", locale17);
        java.lang.String str27 = locale11.getDisplayCountry(locale17);
        java.lang.String str28 = locale5.getDisplayScript(locale11);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "franz\366sisch (frankreich)" + "'", str2, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chinois" + "'", str3, "chinois");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "na");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "FRA" + "'", str24, "FRA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI" + "'", str26, "\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test21459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21459");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("zh", "!ih                            dalleman!ih                            dalleman!ih                          ", "                                             hcstued                                            ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test21460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21460");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Italia", 'f', 'b');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Italia" + "'", str3, "Italia");
    }

    @Test
    public void test21461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21461");
        java.util.Locale locale3 = new java.util.Locale("hi!       _\\U0020_Italienisch####################################################################...", "italian_ITALIAN_English", "hcsineilatI");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!       _\\u0020_italienisch####################################################################..._ITALIAN_ITALIAN_ENGLISH_hcsineilatI");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test21462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21462");
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.util.Locale.setDefault(category1, locale4);
        java.util.Locale locale9 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category1, locale9);
        java.util.Locale locale11 = java.util.Locale.getDefault(category1);
        java.util.Locale locale13 = new java.util.Locale("en");
        java.lang.String str14 = locale11.getDisplayCountry(locale13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.lowerCase("Francia", locale13);
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.util.Locale.setDefault(locale16);
        java.lang.String str19 = locale13.getDisplayCountry(locale16);
        java.util.Locale locale20 = locale13.stripExtensions();
        java.lang.String str21 = locale13.toString();
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "allemand" + "'", str5, "allemand");
        org.junit.Assert.assertEquals(locale9.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ALLEMAND" + "'", str14, "ALLEMAND");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "francia" + "'", str15, "francia");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "italien" + "'", str17, "italien");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "en" + "'", str21, "en");
    }

    @Test
    public void test21463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21463");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'i', '2');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'i' + "'", char2 == 'i');
    }

    @Test
    public void test21464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21464");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("           \\u", "hcsineilatI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           \\u" + "'", str2, "           \\u");
    }

    @Test
    public void test21465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21465");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\\u0023", "\\u0023");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("\r", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                                  \\u0068", strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                                                               \\U0020");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test21466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21466");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("Chinesisch", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test21467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21467");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("fffffffffffff");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test21468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21468");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it                   ", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.Locale.FilteringMode filteringMode11 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList9, filteringMode11);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!       ", "Italienisch", "italian_ITALIAN_English", "HI!", "hi!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "\\u0034", "HI!", "Italian", "\\u0061", "\\u0023", "hi!", "iTALIAN", "Chinese (China)", "hi!", "zh_CN", "iTALIAN", "en", "Italienisch" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.util.Locale.FilteringMode filteringMode43 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.lang.String>) strList41, filteringMode43);
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList33, filteringMode43);
        java.util.Locale.FilteringMode filteringMode46 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList33, filteringMode46);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap48 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList49 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap48);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap50 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList51 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList49, strMap50);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap52 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList53 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList49, strMap52);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + filteringMode11 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode11.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + filteringMode43 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode43.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertTrue("'" + filteringMode46 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode46.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(languageRangeList49);
        org.junit.Assert.assertNotNull(languageRangeList51);
        org.junit.Assert.assertNotNull(languageRangeList53);
    }

    @Test
    public void test21469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21469");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("D  \\u007", "                          \\u0046");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21470");
        char[] charArray7 = new char[] { ' ', '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("R0", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhz", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfra", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test21471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21471");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 28, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str3, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test21472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21472");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...", "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEFEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE", "                                                                                                                                                                                                                                                                                   \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\hi!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test21473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21473");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\\u0034\\u00hcstuD\\u0034\\u00", 574);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0034\\u00hcstuD\\u0034\\u00" + "'", str2, "\\u0034\\u00hcstuD\\u0034\\u00");
    }

    @Test
    public void test21474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21474");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAhz", "                                                                                              DEUTSCH");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '2', 79, 216);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 79");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test21475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21475");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.setLanguage("zh");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setLanguage("HI!(\\U0020,ITALIENISCH#########################################################################################)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: HI!(\\U0020,ITALIENISCH#########################################################################################) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "francese (Canada)" + "'", str3, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test21476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21476");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21477");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('S');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21478");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "...! \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\                      ", (java.lang.CharSequence) "                                                                                               en");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "...! \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\                      " + "'", charSequence2, "...! \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\                      ");
    }

    @Test
    public void test21479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21479");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("2E             giTALIANiTALIANi", 34, "en-CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "e2E             giTALIANiTALIANien" + "'", str3, "e2E             giTALIANiTALIANien");
    }

    @Test
    public void test21480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21480");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("AD  \\u007", "e                         iItal");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21481");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = builder5.build();
        java.lang.String str7 = locale6.getLanguage();
        java.lang.String str8 = locale6.getISO3Language();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "francese (Canada)" + "'", str3, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test21482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21482");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Engl", 64, "Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Frankreich)kkkkkkkkkkkkkkkkkkkEnglFrankreich)kkkkkkkkkkkkkkkkkkk" + "'", str3, "Frankreich)kkkkkkkkkkkkkkkkkkkEnglFrankreich)kkkkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test21483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21483");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setVariant("itTAiT_ITALIAN_EgAish");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str11 = locale9.getExtension('h');
        java.lang.String str12 = locale8.getDisplayScript(locale9);
        java.util.Locale locale13 = locale8.stripExtensions();
        java.lang.String str14 = locale13.getISO3Country();
        java.util.Locale locale16 = new java.util.Locale("en");
        boolean boolean17 = locale16.hasExtensions();
        java.util.Set<java.lang.String> strSet18 = locale16.getUnicodeLocaleKeys();
        java.lang.String str19 = locale13.getDisplayCountry(locale16);
        java.util.Locale.setDefault(locale13);
        java.lang.String str21 = locale13.getISO3Country();
        java.util.Locale.Builder builder22 = builder6.setLocale(locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder24 = builder6.addUnicodeLocaleAttribute("                                                                                                                                                                                                                                                                           ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                                                                                                                                                                                                                                                                             [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FRA" + "'", str14, "FRA");
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "France" + "'", str19, "France");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "FRA" + "'", str21, "FRA");
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test21484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21484");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaa...anitaliaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaa...anitaliaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaa...anitaliaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test21485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21485");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fr");
        java.lang.String[] strArray5 = new java.lang.String[] { "...ANiTALI", "             ", "          " };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap9);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.Locale.FilteringMode filteringMode19 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList20 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList17, filteringMode19);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList23);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.Locale.FilteringMode filteringMode34 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList32, filteringMode34);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList38);
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList38);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap42 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList43 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, strMap42);
        java.util.Locale locale44 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet45 = locale44.getUnicodeLocaleAttributes();
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet45, "\\u005c");
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet45, "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strSet45);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap51 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList52 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, strMap51);
        java.util.Locale.Builder builder53 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder54 = builder53.clearExtensions();
        java.util.Locale locale55 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str56 = locale55.getDisplayName();
        java.util.Locale.Builder builder57 = builder54.setLocale(locale55);
        java.util.Locale locale58 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder59 = builder54.setLocale(locale58);
        java.util.Set<java.lang.String> strSet60 = locale58.getUnicodeLocaleAttributes();
        java.lang.String str61 = locale58.getVariant();
        java.util.Locale locale62 = java.util.Locale.ITALIAN;
        java.lang.String str63 = locale62.getDisplayLanguage();
        java.lang.String str64 = locale58.getDisplayLanguage(locale62);
        java.util.Set<java.lang.String> strSet65 = locale58.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strSet65);
        java.util.List<java.lang.String> strList67 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList66);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap68 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList69 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap68);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + filteringMode19 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode19.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + filteringMode34 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode34.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(languageRangeList43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(languageRangeList52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "fran\347ais (Canada)" + "'", str56, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "it");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "italien" + "'", str63, "italien");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "tedesco" + "'", str64, "tedesco");
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(languageRangeList69);
    }

    @Test
    public void test21486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21486");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Eagaash                                                                                                                                                                                                                                                                                                                                                                                                    ", 713, "                                       \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                       \\u0020iTALIANiTALIANiTALIANiTALI                                       \\u0020iTALIANiTALIANiTALIANiTALI                                       \\u0020iTALIANiTALIANiTALIANiTALI                                       \\u0020iTALIANiTALIANiTALIANiTALI                                  Eagaash                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str3, "                                       \\u0020iTALIANiTALIANiTALIANiTALI                                       \\u0020iTALIANiTALIANiTALIANiTALI                                       \\u0020iTALIANiTALIANiTALIANiTALI                                       \\u0020iTALIANiTALIANiTALIANiTALI                                  Eagaash                                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test21487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21487");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test21488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21488");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'f', (int) 'D');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 68 + "'", int2 == 68);
    }

    @Test
    public void test21489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21489");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                        ", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_N");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                        " + "'", str2, "                                                                        ");
    }

    @Test
    public void test21490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21490");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("hi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienischhi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAGermanhi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienischhi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test21491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21491");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setLanguageTag("anglais");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setVariant("HZHZHZHZHZHZHZHZHZHZAHZSAHZRAHZQAHZOAHZNAH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: HZHZHZHZHZHZHZHZHZHZAHZSAHZRAHZQAHZOAHZNAH [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinois (Chine)" + "'", str5, "chinois (Chine)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test21492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21492");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Italienisch#########################################################################################", "!IH");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("       !IH", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                              Deutsch", "italian_ITALIAN_English");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("E             g", strArray4, strArray10);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, "NAC", 97, (int) '4');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Italienisch#########################################################################################" + "'", str6, "Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Italienisch#########################################################################################" + "'", str7, "Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "E             g" + "'", str11, "E             g");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test21493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21493");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("chinesexxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "                                                                                              DEUTSCH", 37, 98);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chinesexxxxxxxxxxxxxxxxxxxxxxxxxxxxxx                                                                                              DEUTSCHx" + "'", str4, "chinesexxxxxxxxxxxxxxxxxxxxxxxxxxxxxx                                                                                              DEUTSCHx");
    }

    @Test
    public void test21494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("...alamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxc...", "hI!       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...alamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxc..." + "'", str2, "...alamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxc...");
    }

    @Test
    public void test21495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21495");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\\U0020IiTALIAN\\U0020I                                                 ", 309, 109);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test21496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21496");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("coreen", "gERMAN (gERMANY)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test21497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21497");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("TALIAN", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 96);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("         italian_italian_english");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test21498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21498");
        java.util.Locale locale3 = new java.util.Locale("44444444444444444444444444444444!IH", "HHHHHHHHHH", "8ian\\u0020i86");
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str8 = locale6.getExtension('h');
        java.lang.String str9 = locale4.getDisplayCountry(locale6);
        java.lang.String str10 = locale6.toLanguageTag();
        java.lang.String str11 = locale3.getDisplayCountry(locale6);
        java.lang.String str12 = locale3.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "44444444444444444444444444444444!ih_HHHHHHHHHH_8ian\\u0020i86");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "italien" + "'", str5, "italien");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "it" + "'", str10, "it");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHHHHHHHHH" + "'", str11, "HHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "44444444444444444444444444444444!ih" + "'", str12, "44444444444444444444444444444444!ih");
    }

    @Test
    public void test21499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21499");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("c500u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "c500u" + "'", str1, "c500u");
    }

    @Test
    public void test21500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21500");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("RoyaumeDeutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\-Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Uni");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RoyaumeDeutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\-Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Un" + "'", str1, "RoyaumeDeutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\-Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Un");
    }
}
