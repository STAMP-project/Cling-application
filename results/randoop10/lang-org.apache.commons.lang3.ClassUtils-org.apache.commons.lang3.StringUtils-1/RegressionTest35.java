import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest35 {

    public static boolean debug = false;

    @Test
    public void test17501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17501");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Anzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAn", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Anzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAn");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17502");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "undaaaaaaaH                                 ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: undaaaaaaaH");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17503");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("italiano", strMap1);
        boolean boolean3 = languageRangeList2.isEmpty();
        java.util.Locale.LanguageRange languageRange6 = new java.util.Locale.LanguageRange("English");
        java.lang.String str7 = languageRange6.getRange();
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) languageRange6, "          ");
        double double10 = languageRange6.getWeight();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange11 = languageRangeList2.set((int) (short) 10, languageRange6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "english" + "'", str7, "english");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.util" + "'", str9, "java.util");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test17504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17504");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                    EN                    ", "Ci_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17505");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "44444444444444444444444444444444444", (java.lang.CharSequence) "i");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "44444444444444444444444444444444444" + "'", charSequence2, "44444444444444444444444444444444444");
    }

    @Test
    public void test17506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17506");
        java.util.Locale locale3 = new java.util.Locale("", "ITALIAHi", "zh-CNenglis");
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder7 = builder5.setLocale(locale6);
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale12 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        boolean boolean14 = locale12.hasExtensions();
        java.lang.String str15 = locale12.getVariant();
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.upperCase("String", locale12);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.lowerCase("chinChinChinChinChiChinChinChinChinC", locale12);
        java.util.Set<java.lang.String> strSet18 = locale12.getUnicodeLocaleAttributes();
        java.lang.String str19 = locale8.getDisplayName(locale12);
        java.lang.String str20 = locale8.getLanguage();
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("CN");
        java.util.Locale locale23 = java.util.Locale.CANADA;
        boolean boolean24 = locale23.hasExtensions();
        java.util.Locale locale25 = java.util.Locale.ITALIAN;
        java.lang.String str26 = locale23.getDisplayScript(locale25);
        java.lang.String str27 = locale22.getDisplayCountry(locale23);
        java.lang.String str28 = locale23.getDisplayScript();
        java.lang.String str29 = locale8.getDisplayLanguage(locale23);
        java.lang.String str30 = locale3.getDisplayVariant(locale23);
        java.lang.String str31 = locale3.getVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "_ITALIAHI_zh-CNenglis");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "STRING" + "'", str16, "STRING");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chinchinchinchinchichinchinchinchinc" + "'", str17, "chinchinchinchinchichinchinchinchinc");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Chinese (China)" + "'", str19, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zh" + "'", str20, "zh");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "cn");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Chinese" + "'", str29, "Chinese");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zh-CNenglis" + "'", str30, "zh-CNenglis");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zh-CNenglis" + "'", str31, "zh-CNenglis");
    }

    @Test
    public void test17507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17507");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale8 = new java.util.Locale("");
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = locale10.getDisplayLanguage();
        java.lang.String str12 = locale8.getDisplayScript(locale10);
        java.lang.String str13 = locale10.getDisplayVariant();
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        java.lang.String str16 = locale14.getDisplayCountry(locale15);
        java.lang.String str17 = locale15.getDisplayVariant();
        java.lang.String str18 = locale10.getDisplayScript(locale15);
        java.util.Locale.Builder builder19 = builder5.setLocale(locale15);
        java.util.Locale locale20 = builder19.build();
        java.util.Locale.Builder builder21 = builder19.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder23 = builder21.setLanguage("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHN     ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHN      [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "English" + "'", str11, "English");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
// flaky:         org.junit.Assert.assertEquals(locale15.toString(), "china_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "China" + "'", str16, "China");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "china_CN");
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test17508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17508");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale.setDefault(locale0);
        java.lang.String str3 = locale0.toLanguageTag();
        java.util.Set<java.lang.Character> charSet4 = locale0.getExtensionKeys();
        boolean boolean5 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr-FR" + "'", str3, "fr-FR");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test17509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17509");
        java.util.Locale locale3 = new java.util.Locale("cina_NCNCNCNCNCNCGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLICNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLIST", "l.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "ahi!hiCinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCH");
        org.junit.Assert.assertEquals(locale3.toString(), "cina_ncncncncncncggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....englicncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncarraylist_L.AVAJSTRING[]STRING[]STRING[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$_ahi!hiCinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCH");
    }

    @Test
    public void test17510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17510");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("ESESENICHZ.....", "fr", "chinarglAsAchinarglAsAchinarglAsAchinarglAsAchinarglAsAchinarglAsAchinarglAsAchinarglAsAchinarglAsAchina");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ESESENICHZ....." + "'", str3, "ESESENICHZ.....");
    }

    @Test
    public void test17511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17511");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("xxxxxxxxxxxxafxxxxxxxxxxxxx", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: xxxxxxxxxxxxafxxxxxxxxxxxxx");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17512");
        java.util.Locale locale3 = new java.util.Locale("Cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engli", "us");
        java.lang.String str4 = locale3.getDisplayScript();
        java.util.Locale locale7 = new java.util.Locale("zh_C");
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = java.util.Locale.ENGLISH;
        java.util.Locale.setDefault(category8, locale9);
        java.util.Locale locale11 = java.util.Locale.JAPANESE;
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("", locale13);
        java.lang.String str15 = locale11.getDisplayVariant(locale13);
        java.util.Locale.setDefault(category8, locale13);
        java.lang.String str17 = locale13.getVariant();
        java.lang.String str18 = locale7.getDisplayScript(locale13);
        java.util.Locale locale21 = new java.util.Locale("italiano", "Ci_a");
        java.util.Locale locale25 = new java.util.Locale("Canada", "allemand", "cHINA");
        java.lang.String str26 = locale21.getDisplayName(locale25);
        java.lang.String str27 = locale21.getLanguage();
        java.lang.String str29 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) locale21, "GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGL");
        java.lang.String str30 = locale13.getDisplayLanguage(locale21);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.upperCase("locale.builder", locale13);
        java.lang.String str32 = locale3.getDisplayLanguage(locale13);
        java.lang.String str33 = locale13.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI_us");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals(locale7.toString(), "zh_c");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ja");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals(locale21.toString(), "italiano_CI_A");
        org.junit.Assert.assertEquals(locale25.toString(), "canada_ALLEMAND_cHINA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "italiano (CI_A)" + "'", str26, "italiano (CI_A)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "italiano" + "'", str27, "italiano");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Locale" + "'", str29, "Locale");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Chinese" + "'", str30, "Chinese");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "LOCALE.BUILDER" + "'", str31, "LOCALE.BUILDER");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str32, "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zh_TW" + "'", str33, "zh_TW");
    }

    @Test
    public void test17513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17513");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("lOCALE.bUILDER", 99);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17514");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("tuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "\u4e2d\u56fdAD.AE.AFxxxxxxxxxxxxxxxxxxxxxxxxx", 24);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("ANIHC                                                                                               ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test17515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17515");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("cNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" + "'", str1, "cNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    @Test
    public void test17516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17516");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("\u82f1\u8a9e...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx.." + "'", str1, "\u82f1\u8a9e...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx..");
    }

    @Test
    public void test17517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17517");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("ANIHC   ENGLTWNSTWN", "ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17518");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream5 = languageRangeList1.stream();
        boolean boolean6 = languageRangeList1.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor12 = languageRangeList11.listIterator();
        boolean boolean13 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11);
        java.lang.String str15 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) languageRangeList11, "Chinese");
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream16 = languageRangeList11.parallelStream();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator17 = languageRangeList11.spliterator();
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, strMap22);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream24 = languageRangeList20.stream();
        boolean boolean25 = languageRangeList20.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap29 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, strMap29);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor31 = languageRangeList30.listIterator();
        boolean boolean32 = languageRangeList20.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30);
        java.util.Locale.LanguageRange languageRange35 = new java.util.Locale.LanguageRange("a");
        languageRangeList20.add(0, languageRange35);
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList11.add(2, languageRange35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.util" + "'", str15, "java.util");
        org.junit.Assert.assertNotNull(languageRangeStream16);
        org.junit.Assert.assertNotNull(languageRangeSpliterator17);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertNotNull(languageRangeStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertNotNull(languageRangeItor31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test17519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17519");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                  xxxxxxxxxxFrench(France)xxxxxxxxxx", (java.lang.CharSequence) "WZ.MZ.AZ.TY.EY.SW.FW.UV.NV.IV.GV.EV.CV.AV.ZU.YU.SU.MU.GU.AU.ZT.WT.VT.TT.RT.OT.NT.MT.LT.KT.JT.HT.GT.FT.DT.CT.ZS.YS.XS.VS.TS.SS.RS.OS.NS.MS.LS.KS.JS.IS.HS.GS.ES.DS.CS.BS.AS.WR.UR.SR.OR.ER.AQ.YP.WP.TP.SP.RP.NP.MP.LP.KP.HP.GP.FP.EP.AP.MO.ZN.UN.RN.PN.ON.LN.IN.GN.FN.EN.CN.AN.ZM.YM.XM.WM.VM.UM.TM.SM.RM.QM.PM.OM.NM.MM.LM.KM.HM.GM.FM.EM.DM.CM.AM.YL.VL.UL.TL.SL.RL.KL.IL.CL.BL.AL.ZK.YK.WK.RK.PK.NK.MK.IK.HK.GK.EK.PJ.OJ.MJ.EJ.TI.SI.RI.QI.OI.NI.MI.LI.EI.DI.UH.TH.RH.NH.MH.KH.YG.WG.UG.TG.SG.RG.QG.PG.NG.MG.LG.IG.HG.GG.FG.EG.DG.BG.AG.RF.OF.MF.KF.JF.IF.TE.SE.RE.HE.GE.EE.CE.ZD.OD.MD.KD.JD.ED.ZC.YC.XC.WC.VC.UC.RC.OC.NC.MC.LC.KC.IC.HC.GC.FC.DC.CC.AC.ZB.YB.WB.VB.TB.SB.RB.QB.OB.NB.MB.LB.JB.IB.HB.GB.FB.EB.DB.BB.AB.ZA.XA.WA.UA.TA.SA.RA.QA.OA.NA.MA.LA.IA.GA.FA.EA.DA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17520");
        java.util.Locale locale3 = new java.util.Locale("", "Chine", "");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        boolean boolean5 = locale3.hasExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "_CHINE");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test17521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17521");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                             italiahI                                              ", "                                                      JAVA.LANG                                                      ", 990);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17522");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor5 = languageRangeList4.listIterator();
        char[][] charArray6 = new char[][] {};
        char[][] charArray7 = languageRangeList4.toArray(charArray6);
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("English");
        java.lang.String str10 = languageRange9.getRange();
        java.util.Locale.LanguageRange languageRange12 = new java.util.Locale.LanguageRange("English");
        java.lang.String str13 = languageRange12.getRange();
        java.util.Locale.LanguageRange languageRange15 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] { languageRange9, languageRange12, languageRange15 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream19 = languageRangeList17.stream();
        int int20 = languageRangeList4.indexOf((java.lang.Object) languageRangeList17);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream21 = languageRangeList4.stream();
        languageRangeList4.clear();
        boolean boolean23 = languageRangeList4.isEmpty();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeItor5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "english" + "'", str10, "english");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "english" + "'", str13, "english");
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(languageRangeStream19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(languageRangeStream21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test17523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17523");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17524");
        java.util.Locale locale3 = new java.util.Locale("CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "en_CA", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.util.Locale locale6 = new java.util.Locale("");
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.lang.String str10 = locale6.getDisplayScript(locale8);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale12);
        java.lang.String str14 = locale6.getDisplayCountry(locale12);
        java.lang.String str15 = locale4.getDisplayScript(locale6);
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        java.lang.String str17 = locale6.getDisplayLanguage(locale16);
        java.util.Locale locale20 = new java.util.Locale("");
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.util.Locale locale22 = java.util.Locale.CANADA;
        java.lang.String str23 = locale22.getDisplayLanguage();
        java.lang.String str24 = locale20.getDisplayScript(locale22);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale20);
        java.lang.String str26 = locale20.getDisplayScript();
        java.lang.String str27 = locale16.getDisplayLanguage(locale20);
        java.util.Set<java.lang.String> strSet28 = locale20.getUnicodeLocaleAttributes();
        java.lang.String str29 = locale3.getDisplayCountry(locale20);
        java.util.Locale locale32 = new java.util.Locale("zh_TW", "chinchinchinchinchichinchinchinchinc");
        java.lang.String str33 = locale3.getDisplayCountry(locale32);
        java.lang.String str34 = locale32.getDisplayScript();
        java.lang.Object obj35 = locale32.clone();
        org.junit.Assert.assertEquals(locale3.toString(), "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa_EN_CA_ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u82f1\u6587" + "'", str9, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "english" + "'", str13, "english");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u82f1\u6587" + "'", str23, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "a" + "'", str25, "a");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "German" + "'", str27, "German");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EN_CA" + "'", str29, "EN_CA");
        org.junit.Assert.assertEquals(locale32.toString(), "zh_tw_CHINCHINCHINCHINCHICHINCHINCHINCHINC");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EN_CA" + "'", str33, "EN_CA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "zh_tw_CHINCHINCHINCHINCHICHINCHINCHINCHINC");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "zh_tw_CHINCHINCHINCHINCHICHINCHINCHINCHINC");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "zh_tw_CHINCHINCHINCHINCHICHINCHINCHINCHINC");
    }

    @Test
    public void test17525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17525");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("France");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FRANCE" + "'", str1, "FRANCE");
    }

    @Test
    public void test17526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17526");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayName();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("String[]", locale4);
        java.lang.String str7 = locale0.getDisplayScript(locale4);
        java.util.Set<java.lang.Character> charSet8 = locale4.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587\u4e2d\u570b)" + "'", str1, "\u4e2d\u6587\u4e2d\u570b)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "string[]" + "'", str6, "string[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charSet8);
    }

    @Test
    public void test17527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17527");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("zhcines############################", "zaa.ab.ae.af.ak.am.an.ar.as.av.ay.az.ba.be.bg.bh.bi.bm.bn.bo.br.bs.ca.ce.ch.co.cr.cs.cu.cv.cy.da.de.dv.dz.ee.el.en.eo.es.et.eu.fa.ff.fi.fj.fo.fr.fy.ga.gd.gl.gn.gu.gv.ha.he.hi.ho.hr.ht.hu.hy.hz.ia.id.ie.ig.ii.ik.in.io.is.it.iu.iw.ja.ji.jv.ka.kg.ki.kj.kk.kl.km.kn.ko.kr.ks.ku.kv.kw.ky.la.lb.lg.li.ln.lo.lt.lu.lv.mg.mh.mi.mk.ml.mn.mo.mr.ms.mt.my.na.nb.nd.ne.ng.nl.nn.no.nr.nv.ny.oc.oj.om.or.os.pa.pi.pl.ps.pt.qu.rm.rn.ro.ru.rw.sa.sc.sd.se.sg.si.sk.sl.sm.sn.so.sq.sr.ss.st.su.sv.sw.ta.te.tg.th.ti.tk.tl.tn.to.tr.ts.tt.tw.ty.ug.uk.ur.uz.ve.vi.vo.wa.wo.xh.yi.yo.za.zh.zu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zhcines############################" + "'", str2, "zhcines############################");
    }

    @Test
    public void test17528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17528");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("ed", "AN       english");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ed" + "'", str2, "ed");
    }

    @Test
    public void test17529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17529");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.setScript("");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test17530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17530");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "N       A                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17531");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "ions.EmptySet");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17532");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("string", "anihc               en_ca");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17533");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "us", (java.lang.CharSequence) "Locale.FilteringMode");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test17534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17534");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        boolean boolean3 = locale1.hasExtensions();
        java.lang.String str4 = locale1.getVariant();
        java.lang.String str5 = locale1.getDisplayCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test17535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17535");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "AIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17536");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray5 = languageRangeList4.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator6 = languageRangeList4.spliterator();
        boolean boolean7 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor8 = languageRangeList1.listIterator();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "                  hI                   ");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.parse("hi");
        java.util.Locale.LanguageRange languageRange14 = new java.util.Locale.LanguageRange("cn");
        boolean boolean15 = languageRangeList12.add(languageRange14);
        int int17 = languageRangeList12.indexOf((java.lang.Object) "xxxxxxxxinglese (Canada)xxxxxxxx");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.parse("hi");
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.util.Locale locale24 = java.util.Locale.FRANCE;
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale24);
        java.util.Locale locale26 = java.util.Locale.US;
        java.util.Locale locale27 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale28 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str31 = locale29.getDisplayCountry(locale30);
        java.lang.String str32 = locale29.toLanguageTag();
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = locale33.getDisplayCountry(locale34);
        java.util.Locale locale36 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.lang.String str38 = locale36.getDisplayCountry(locale37);
        java.util.Locale locale42 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale43 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale44 = java.util.Locale.getDefault();
        java.lang.String str45 = locale43.getDisplayCountry(locale44);
        java.util.Locale locale47 = new java.util.Locale("");
        java.lang.String str48 = locale47.getDisplayVariant();
        java.util.Locale locale49 = java.util.Locale.KOREAN;
        java.util.Locale locale51 = new java.util.Locale("");
        java.util.Locale locale52 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray53 = new java.util.Locale[] { locale24, locale26, locale27, locale28, locale29, locale34, locale36, locale42, locale44, locale47, locale49, locale51, locale52 };
        java.util.ArrayList<java.util.Locale> localeList54 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList54, localeArray53);
        java.util.List<java.util.Locale> localeList56 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.util.Locale>) localeList54);
        java.util.List<java.util.Locale> localeList57 = java.util.Locale.filter(languageRangeList19, (java.util.Collection<java.util.Locale>) localeList56);
        java.util.List<java.util.Locale> localeList58 = java.util.Locale.filter(languageRangeList12, (java.util.Collection<java.util.Locale>) localeList57);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap60 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList61 = java.util.Locale.LanguageRange.parse("Cina", strMap60);
        java.lang.String[] strArray65 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        java.util.Locale.FilteringMode filteringMode68 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList69 = java.util.Locale.filterTags(languageRangeList61, (java.util.Collection<java.lang.String>) strList66, filteringMode68);
        java.util.List<java.lang.Class<?>> wildcardClassList70 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList66);
        java.util.List<java.lang.Class<?>> wildcardClassList71 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList66);
        java.util.List<java.lang.Class<?>> wildcardClassList72 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList66);
        java.util.List<java.lang.String> strList73 = java.util.Locale.filterTags(languageRangeList12, (java.util.Collection<java.lang.String>) strList66);
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList73);
        int int75 = languageRangeList1.size();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(languageRangeSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(languageRangeItor8);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "english" + "'", str25, "english");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Chine" + "'", str31, "Chine");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "zh-CN" + "'", str32, "zh-CN");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Chine" + "'", str35, "Chine");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Chine" + "'", str38, "Chine");
        org.junit.Assert.assertEquals(locale42.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Chine" + "'", str45, "Chine");
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ko");
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(localeList56);
        org.junit.Assert.assertNotNull(localeList57);
        org.junit.Assert.assertNotNull(localeList58);
        org.junit.Assert.assertNotNull(languageRangeList61);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + filteringMode68 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode68.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(wildcardClassList70);
        org.junit.Assert.assertNotNull(wildcardClassList71);
        org.junit.Assert.assertNotNull(wildcardClassList72);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
    }

    @Test
    public void test17537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17537");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za....");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17538");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale3.getDisplayScript(locale5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale3);
        java.lang.String str9 = locale3.getDisplayScript();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale11 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.lang.String str13 = locale11.getDisplayCountry(locale12);
        java.lang.String str14 = locale12.getDisplayVariant();
        java.util.Locale.setDefault(category0, locale12);
        java.util.Locale locale16 = java.util.Locale.getDefault(category0);
        java.util.Locale locale17 = java.util.Locale.getDefault(category0);
        java.util.Locale locale18 = java.util.Locale.getDefault(category0);
        java.util.Locale locale22 = new java.util.Locale("hi", "hi!", "cHINA");
        java.lang.String str23 = locale22.getDisplayVariant();
        java.util.Locale locale24 = locale22.stripExtensions();
        java.util.Locale locale25 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale26 = java.util.Locale.getDefault();
        java.lang.String str27 = locale25.getDisplayCountry(locale26);
        java.lang.String str28 = locale25.toLanguageTag();
        java.lang.String str29 = locale25.getLanguage();
        java.util.Locale locale30 = java.util.Locale.ITALIAN;
        java.util.Locale locale32 = new java.util.Locale("");
        java.lang.String str33 = locale32.getDisplayLanguage();
        java.util.Locale locale34 = java.util.Locale.CANADA;
        java.lang.String str35 = locale34.getDisplayLanguage();
        java.lang.String str36 = locale32.getDisplayScript(locale34);
        java.util.Locale locale38 = java.util.Locale.FRANCE;
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale38);
        java.lang.String str40 = locale32.getDisplayCountry(locale38);
        java.lang.String str41 = locale30.getDisplayScript(locale32);
        java.util.Locale locale42 = java.util.Locale.GERMAN;
        java.lang.String str43 = locale32.getDisplayLanguage(locale42);
        java.lang.String str44 = locale25.getDisplayCountry(locale32);
        java.lang.String str45 = locale32.getCountry();
        java.util.Locale locale49 = new java.util.Locale("....english", "zhcinesese", ".");
        java.lang.String str50 = locale32.getDisplayName(locale49);
        java.lang.String str51 = locale22.getDisplayName(locale32);
        java.util.Locale.setDefault(category0, locale32);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u82f1\u6587" + "'", str6, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chine" + "'", str13, "Chine");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale22.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "cHINA" + "'", str23, "cHINA");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Chine" + "'", str27, "Chine");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "zh-CN" + "'", str28, "zh-CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zh" + "'", str29, "zh");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it");
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u82f1\u6587" + "'", str35, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "english" + "'", str39, "english");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "de");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "China" + "'", str44, "China");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals(locale49.toString(), "....english_ZHCINESESE_.");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Hindi (HI!,cHINA)" + "'", str51, "Hindi (HI!,cHINA)");
    }

    @Test
    public void test17539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17539");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                         a                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test17540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17540");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("                                ese(Taiwan");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ese(taiwan");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17541");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "xxxxxxxxinglese (canada)xxxxxxxx", "\u53f0\u6e7e\u5730\u533a####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17542");
        java.util.Locale locale3 = new java.util.Locale("china_cn                             ese(taiwan", "ANIHCxxxxhIxxx", "SIA\307NARF");
        org.junit.Assert.assertEquals(locale3.toString(), "china_cn                             ese(taiwan_ANIHCXXXXHIXXX_SIA\307NARF");
    }

    @Test
    public void test17543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17543");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] { languageRange7, languageRange9, languageRange11 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        boolean boolean15 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        java.util.Locale locale18 = new java.util.Locale("");
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.util.Locale locale20 = java.util.Locale.CANADA;
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.lang.String str22 = locale18.getDisplayScript(locale20);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale18);
        java.lang.String str24 = locale18.getDisplayScript();
        java.util.Set<java.lang.String> strSet25 = locale18.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode26 = null;
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strSet25, filteringMode26);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList13, "\u6cd5\u6587");
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream30 = languageRangeList13.stream();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean34 = languageRangeList32.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange languageRange36 = languageRangeList32.get(0);
        boolean boolean37 = languageRangeList13.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32);
        java.util.Locale.Builder builder38 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder40 = builder38.setScript("");
        java.util.Locale.Builder builder42 = builder40.setLanguage("HI");
        java.util.Locale locale43 = builder42.build();
        java.util.Locale locale44 = builder42.build();
        int int45 = languageRangeList32.indexOf((java.lang.Object) builder42);
        java.util.Locale.Builder builder46 = builder42.clear();
        java.util.Locale.Builder builder47 = builder46.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder49 = builder46.setVariant("$$$$$$$$$$$$$xxxxxxxxinglese (canada)xxxxxxxx$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: $$$$$$$$$$$$$xxxxxxxxinglese (canada)xxxxxxxx$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u82f1\u6587" + "'", str21, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "a" + "'", str23, "a");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(languageRangeStream30);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(languageRange36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "hi");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "hi");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test17544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17544");
        java.util.Locale locale1 = new java.util.Locale("zh_C");
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) locale1, "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587          ");
        java.util.Locale locale5 = new java.util.Locale("");
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.lang.String str9 = locale5.getDisplayScript(locale7);
        java.lang.String str10 = locale7.getDisplayVariant();
        java.util.Locale locale11 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.lang.String str13 = locale11.getDisplayCountry(locale12);
        java.lang.String str14 = locale12.getDisplayVariant();
        java.lang.String str15 = locale7.getDisplayScript(locale12);
        java.lang.String str16 = locale7.getScript();
        java.lang.String str17 = locale7.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet18 = locale7.getUnicodeLocaleKeys();
        java.lang.String str19 = locale1.getDisplayScript(locale7);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_c");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Locale" + "'", str3, "Locale");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u82f1\u6587" + "'", str8, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chine" + "'", str13, "Chine");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u82f1\u6587" + "'", str17, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test17545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17545");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("glish  hieNdi (hi!,eNhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "glish  hieNdi (hi!,eNhi" + "'", str1, "glish  hieNdi (hi!,eNhi");
    }

    @Test
    public void test17546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17546");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.lang.String str3 = locale1.getCountry();
        java.lang.String str4 = locale1.getDisplayName();
        java.lang.String str5 = locale1.getVariant();
        java.lang.String str7 = locale1.getExtension('a');
        java.util.Locale locale8 = locale1.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chine" + "'", str2, "Chine");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FR" + "'", str3, "FR");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6cd5\u6587\u6cd5\u570b)" + "'", str4, "\u6cd5\u6587\u6cd5\u570b)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
    }

    @Test
    public void test17547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17547");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                          zh_c                                                          ", "ORTSHORTSHORT");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17548");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                     France", "...................................................................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..................................................................................." + "'", str2, "...................................................................................");
    }

    @Test
    public void test17549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17549");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\u82f1\u8a9e\u30ab\u30ca\u30c0)", "Taiwan", "       hi!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test17550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17550");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale1 = java.util.Locale.JAPANESE;
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("", locale3);
        java.lang.String str5 = locale1.getDisplayVariant(locale3);
        java.util.Set<java.lang.Character> charSet6 = locale3.getExtensionKeys();
        java.util.Set<java.lang.String> strSet7 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale locale10 = new java.util.Locale("ahi!hi!", "                 a                 ");
        java.lang.String str11 = locale3.getDisplayScript(locale10);
        java.lang.String str12 = locale0.getDisplayName(locale3);
        java.lang.String str13 = locale3.getDisplayLanguage();
        java.lang.String str14 = locale3.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals(locale10.toString(), "ahi!hi!_                 A                 ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587" + "'", str13, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test17551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17551");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("java.lang");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("cinese", (java.lang.Object[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("            )ANIHc,!IH(idni", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "javacinese.cineselang" + "'", str4, "javacinese.cineselang");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test17552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17552");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("Canada");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Canada" + "'", str1, "Canada");
    }

    @Test
    public void test17553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17553");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ITALIANO", "\u6587\u4e2desenihC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITALIANO" + "'", str2, "ITALIANO");
    }

    @Test
    public void test17554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17554");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("ChinesHin", "\u4e2d\u6587", "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test17555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17555");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("......44444444EnglTWNsTWN44444444......", "                                                                                                   .", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444EnglTWNsTWN44444444" + "'", str3, "44444444EnglTWNsTWN44444444");
    }

    @Test
    public void test17556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17556");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("i##################################################################################################", (int) '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i##########################################..." + "'", str2, "i##########################################...");
    }

    @Test
    public void test17557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17557");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("HI", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRangeList2, "\u53f0\u7063");
        boolean boolean6 = languageRangeList2.equals((java.lang.Object) "EN_CA");
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream12 = languageRangeList8.stream();
        boolean boolean13 = languageRangeList8.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, strMap17);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor19 = languageRangeList18.listIterator();
        boolean boolean20 = languageRangeList8.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18);
        java.lang.String str22 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) languageRangeList18, "Chinese");
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Chin", "english");
        boolean boolean27 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                    ", strArray26);
        boolean boolean28 = languageRangeList18.equals((java.lang.Object) strArray26);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream29 = languageRangeList18.parallelStream();
        boolean boolean31 = languageRangeList18.remove((java.lang.Object) "A");
        java.lang.Object[] objArray32 = languageRangeList18.toArray();
        int int34 = languageRangeList18.indexOf((java.lang.Object) "ja");
        boolean boolean35 = languageRangeList2.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor36 = languageRangeList2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange38 = languageRangeList2.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ArrayList" + "'", str4, "ArrayList");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(languageRangeItor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.util" + "'", str22, "java.util");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(languageRangeStream29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(languageRangeItor36);
    }

    @Test
    public void test17558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17558");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("##################EnglCNsCN###################", "rance)Italiuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17559");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("aiaiaiaiaiaiaiaiaia", 41);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaia" + "'", str2, "aiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaia");
    }

    @Test
    public void test17560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17560");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\u82f1\u6587\u52a0\u62ff\u5927)");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17561");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("                                           nawiaT(ese                                                                                       nawiaT(ese                                                                                       nawiaT(ese                                                                                       )adanaC( eselgni");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test17562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17562");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\u4e2d\u56fd", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd" + "'", str2, "\u4e2d\u56fd");
    }

    @Test
    public void test17563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17563");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("acoL", "Short");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "acoL" + "'", str2, "acoL");
    }

    @Test
    public void test17564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17564");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliilish)                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliilish)" + "'", str1, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliilish)");
    }

    @Test
    public void test17565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17565");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("zho", "ese(China)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zho" + "'", str2, "zho");
    }

    @Test
    public void test17566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17566");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...inglese (Canada)xxxxxxxx", "INGLESE (CANADA)", (int) 'u');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17567");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setLanguageTag("ANIHC");
        java.util.Locale locale10 = builder6.build();
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale locale13 = builder11.build();
        java.util.Locale locale14 = builder11.build();
        java.lang.String str16 = locale14.getExtension('a');
        java.lang.String str17 = locale10.getDisplayName(locale14);
        java.util.Locale.Builder builder18 = builder1.setLocale(locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder18.setScript("ShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShort");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShort [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "anihc");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "anihc" + "'", str17, "anihc");
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test17568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17568");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getVariant();
        java.lang.String str2 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
    }

    @Test
    public void test17569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17569");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator5 = languageRangeList1.spliterator();
        boolean boolean6 = languageRangeList1.isEmpty();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean10 = languageRangeList8.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale15);
        java.util.Locale locale17 = java.util.Locale.US;
        java.util.Locale locale18 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str22 = locale20.getDisplayCountry(locale21);
        java.lang.String str23 = locale20.toLanguageTag();
        java.util.Locale locale24 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale24.getDisplayCountry(locale25);
        java.util.Locale locale27 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale27.getDisplayCountry(locale28);
        java.util.Locale locale33 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale34 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale35 = java.util.Locale.getDefault();
        java.lang.String str36 = locale34.getDisplayCountry(locale35);
        java.util.Locale locale38 = new java.util.Locale("");
        java.lang.String str39 = locale38.getDisplayVariant();
        java.util.Locale locale40 = java.util.Locale.KOREAN;
        java.util.Locale locale42 = new java.util.Locale("");
        java.util.Locale locale43 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray44 = new java.util.Locale[] { locale15, locale17, locale18, locale19, locale20, locale25, locale27, locale33, locale35, locale38, locale40, locale42, locale43 };
        java.util.ArrayList<java.util.Locale> localeList45 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList45, localeArray44);
        java.util.List<java.util.Locale> localeList47 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.util.Locale>) localeList45);
        java.util.List<java.util.Locale> localeList48 = java.util.Locale.filter(languageRangeList8, (java.util.Collection<java.util.Locale>) localeList45);
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap52 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList53 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, strMap52);
        int int54 = languageRangeList50.size();
        java.util.Locale.LanguageRange languageRange56 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange58 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange60 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] { languageRange56, languageRange58, languageRange60 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        boolean boolean64 = languageRangeList50.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62);
        boolean boolean65 = languageRangeList8.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream66 = languageRangeList50.parallelStream();
        boolean boolean67 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor68 = languageRangeList1.listIterator();
        java.lang.String str70 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor68, ' ');
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "english" + "'", str16, "english");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Chine" + "'", str22, "Chine");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zh-CN" + "'", str23, "zh-CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Chine" + "'", str26, "Chine");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Chine" + "'", str29, "Chine");
        org.junit.Assert.assertEquals(locale33.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Chine" + "'", str36, "Chine");
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ko");
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(localeList47);
        org.junit.Assert.assertNotNull(localeList48);
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(languageRangeList53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(languageRangeStream66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(languageRangeItor68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }

    @Test
    public void test17570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17570");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                    ", (int) ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    " + "'", str3, "                                                                                                    ");
    }

    @Test
    public void test17571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17571");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd(".......................HI.......................", "ShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShort");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".......................HI......................." + "'", str2, ".......................HI.......................");
    }

    @Test
    public void test17572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17572");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.lang.String str3 = locale1.getCountry();
        java.lang.String str4 = locale1.getDisplayName();
        boolean boolean5 = locale1.hasExtensions();
        java.lang.String str6 = locale1.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chine" + "'", str2, "Chine");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FR" + "'", str3, "FR");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6cd5\u6587\u6cd5\u570b)" + "'", str4, "\u6cd5\u6587\u6cd5\u570b)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr_FR" + "'", str6, "fr_FR");
    }

    @Test
    public void test17573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17573");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)", " ZH  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)" + "'", str2, "Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)");
    }

    @Test
    public void test17574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17574");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "    nglais     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17575");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("l", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l" + "'", str2, "l");
    }

    @Test
    public void test17576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17576");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("uuuuuxxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxxuuuuu", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuxxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxxuuuuu" + "'", str2, "uuuuuxxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxxuuuuu");
    }

    @Test
    public void test17577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17577");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        boolean boolean1 = locale0.hasExtensions();
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale0.getDisplayScript(locale2);
        java.lang.String str5 = locale0.getExtension('a');
        java.lang.String str6 = locale0.getDisplayLanguage();
        java.lang.String str7 = locale0.getDisplayName();
        java.lang.String str8 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u82f1\u6587" + "'", str6, "\u82f1\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u82f1\u6587\u52a0\u62ff\u5927)" + "'", str7, "\u82f1\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eng" + "'", str8, "eng");
    }

    @Test
    public void test17578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17578");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                      java.lang                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.lang" + "'", str1, "java.lang");
    }

    @Test
    public void test17579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17579");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("      444444444444444444444444444444444      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17580");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                             italiahI                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                             italiahI                                            " + "'", str1, "                                             italiahI                                            ");
    }

    @Test
    public void test17581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17581");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder4 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setLanguageTag("ShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShort");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShort [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test17582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17582");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 11, 23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17583");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "cINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA", 17);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test17584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17584");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        boolean boolean10 = locale8.hasExtensions();
        java.lang.String str11 = locale8.getVariant();
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.upperCase("String", locale8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.lowerCase("chinChinChinChinChiChinChinChinChinC", locale8);
        java.util.Set<java.lang.String> strSet14 = locale8.getUnicodeLocaleAttributes();
        java.lang.String str15 = locale4.getDisplayName(locale8);
        java.lang.String str16 = locale4.getLanguage();
        java.lang.String str17 = locale4.getVariant();
        java.lang.String str18 = locale4.getISO3Language();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "STRING" + "'", str12, "STRING");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chinchinchinchinchichinchinchinchinc" + "'", str13, "chinchinchinchinchichinchinchinchinc");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Chinese (China)" + "'", str15, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh" + "'", str16, "zh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zho" + "'", str18, "zho");
    }

    @Test
    public void test17585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("chinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachina", "ava");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17586");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("ZH-CNENGLISH");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ZH-CNENGLISH");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17587");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("class java.lang.Stringclass java.lang.Stringclass java.lang.String");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class java.lang.Stringclass java.lang.Stringclass java.lang" + "'", str1, "class java.lang.Stringclass java.lang.Stringclass java.lang");
    }

    @Test
    public void test17588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17588");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\u4e2d\u56fd\u8a9e\u53f0\u6e7e)", "esesenichz");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17589");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAH", 742);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17590");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.lang.String str3 = locale1.getCountry();
        java.lang.String str4 = locale1.getDisplayName();
        java.lang.String str5 = locale1.getVariant();
        java.lang.String str7 = locale1.getExtension('a');
        java.lang.String str8 = locale1.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chine" + "'", str2, "Chine");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FR" + "'", str3, "FR");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6cd5\u6587\u6cd5\u570b)" + "'", str4, "\u6cd5\u6587\u6cd5\u570b)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u6cd5\u570b" + "'", str8, "\u6cd5\u570b");
    }

    @Test
    public void test17591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17591");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.lang.String str6 = locale2.getDisplayScript(locale4);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale8);
        java.lang.String str10 = locale2.getDisplayCountry(locale8);
        java.lang.String str11 = locale0.getDisplayScript(locale2);
        java.lang.String str12 = locale2.getDisplayCountry();
        java.lang.String str13 = locale2.getDisplayLanguage();
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.lang.String str15 = locale2.getDisplayScript(locale14);
        boolean boolean16 = locale14.hasExtensions();
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = locale14.getDisplayCountry(locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u82f1\u6587" + "'", str5, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "english" + "'", str9, "english");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test17592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17592");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Cina", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("Cina", strMap4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList5, strMap6);
        boolean boolean8 = languageRangeList2.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, "ChinChinChinChinChinChinChinChinChinaaaaaaaaa$");
        boolean boolean12 = languageRangeList2.remove((java.lang.Object) "italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahI");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.parse("hi");
        int int16 = languageRangeList14.indexOf((java.lang.Object) '4');
        boolean boolean18 = languageRangeList14.contains((java.lang.Object) 8);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor19 = languageRangeList14.iterator();
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.split("a", "cHINA");
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.stripAll(strArray22, "zho");
        int int25 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray22);
        boolean boolean26 = languageRangeList14.equals((java.lang.Object) int25);
        int int27 = languageRangeList2.lastIndexOf((java.lang.Object) languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeItor19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test17593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\u53f0\u7063$$$$$$$$", "char[]char[]char[]cITALIANOchar[]char[]char[]ch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u53f0\u7063$$$$$$$$" + "'", str2, "\u53f0\u7063$$$$$$$$");
    }

    @Test
    public void test17594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17594");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("CN");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("hi");
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("cn");
        boolean boolean6 = languageRangeList3.add(languageRange5);
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.util.Locale locale11 = java.util.Locale.CANADA;
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.lang.String str13 = locale9.getDisplayScript(locale11);
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale15);
        java.lang.String str17 = locale9.getDisplayCountry(locale15);
        java.lang.String str18 = locale7.getDisplayScript(locale9);
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.lang.String str20 = locale9.getDisplayLanguage(locale19);
        java.util.Locale locale23 = new java.util.Locale("");
        java.lang.String str24 = locale23.getDisplayLanguage();
        java.util.Locale locale25 = java.util.Locale.CANADA;
        java.lang.String str26 = locale25.getDisplayLanguage();
        java.lang.String str27 = locale23.getDisplayScript(locale25);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale23);
        java.lang.String str29 = locale23.getDisplayScript();
        java.lang.String str30 = locale19.getDisplayLanguage(locale23);
        java.util.Set<java.lang.String> strSet31 = locale19.getUnicodeLocaleAttributes();
        boolean boolean32 = languageRangeList3.remove((java.lang.Object) locale19);
        java.lang.String str33 = locale19.getVariant();
        java.util.Locale locale34 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet35 = locale34.getExtensionKeys();
        java.util.Set<java.lang.String> strSet36 = locale34.getUnicodeLocaleAttributes();
        java.lang.String str37 = locale19.getDisplayName(locale34);
        java.lang.String str38 = locale1.getDisplayName(locale34);
        java.util.Locale.setDefault(locale34);
        java.lang.String str40 = locale34.getScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "cn");
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u82f1\u6587" + "'", str12, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "english" + "'", str16, "english");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u82f1\u6587" + "'", str26, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "a" + "'", str28, "a");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "German" + "'", str30, "German");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u5fb7\u6587" + "'", str37, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "cn" + "'", str38, "cn");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test17595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17595");
        java.util.Locale locale2 = new java.util.Locale("eNGLxxxxENGLISHSxxxxENGLISH", "ENG");
        org.junit.Assert.assertEquals(locale2.toString(), "englxxxxenglishsxxxxenglish_ENG");
    }

    @Test
    public void test17596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17596");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("cINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA", "\u30c9\u30a4\u30c4\u8a9e", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA" + "'", str3, "cINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA");
    }

    @Test
    public void test17597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17597");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "n", (java.lang.CharSequence) "n       a                                           ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "n" + "'", charSequence2, "n");
    }

    @Test
    public void test17598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17598");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip(".                                                                                                   ", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".                                                                                                   " + "'", str2, ".                                                                                                   ");
    }

    @Test
    public void test17599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17599");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace(")xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ")xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)" + "'", str1, ")xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)");
    }

    @Test
    public void test17600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17600");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hHI!STRING[///????????????????????????????????????????????????????????????????????????????????????????????????");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17601");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                  hI                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17602");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("XXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXX", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17603");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("ITHI!LIHI!NO");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITHI!LIHI!NO" + "'", str2, "ITHI!LIHI!NO");
    }

    @Test
    public void test17604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17604");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("INGLESEU", "Chinesisch(China)");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '.', 16, (-1));
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test17605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17605");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor5 = languageRangeList4.listIterator();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale14);
        java.util.Locale locale16 = java.util.Locale.US;
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale18 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale19.getDisplayCountry(locale20);
        java.lang.String str22 = locale19.toLanguageTag();
        java.util.Locale locale23 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = locale23.getDisplayCountry(locale24);
        java.util.Locale locale26 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale26.getDisplayCountry(locale27);
        java.util.Locale locale32 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = locale33.getDisplayCountry(locale34);
        java.util.Locale locale37 = new java.util.Locale("");
        java.lang.String str38 = locale37.getDisplayVariant();
        java.util.Locale locale39 = java.util.Locale.KOREAN;
        java.util.Locale locale41 = new java.util.Locale("");
        java.util.Locale locale42 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray43 = new java.util.Locale[] { locale14, locale16, locale17, locale18, locale19, locale24, locale26, locale32, locale34, locale37, locale39, locale41, locale42 };
        java.util.ArrayList<java.util.Locale> localeList44 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList44, localeArray43);
        java.util.List<java.util.Locale> localeList46 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList44);
        java.lang.String[] strArray54 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        java.util.List<java.lang.Class<?>> wildcardClassList57 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList55);
        java.util.Locale.FilteringMode filteringMode58 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList55, filteringMode58);
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strList8, filteringMode58);
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap64 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList65 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, strMap64);
        int int66 = languageRangeList62.size();
        boolean boolean67 = languageRangeList4.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor68 = languageRangeList62.listIterator();
        java.lang.String str70 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor68, 'u');
        java.lang.String str72 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor68, "hi!hi! (                 A                 )");
        java.lang.String str74 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor68, "zho");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeItor5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "english" + "'", str15, "english");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u4e2d\u56fd" + "'", str21, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u4e2d\u56fd" + "'", str25, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u4e2d\u56fd" + "'", str28, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale32.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u4e2d\u56fd" + "'", str35, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ko");
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(localeList46);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClassList57);
        org.junit.Assert.assertTrue("'" + filteringMode58 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode58.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(languageRangeList65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(languageRangeItor68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
    }

    @Test
    public void test17606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17606");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)", "CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)" + "'", str2, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
    }

    @Test
    public void test17607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17607");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("..................chinois (chine)", "Germn");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17608");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("zh-CN");
        java.util.Locale locale7 = builder4.build();
        java.lang.String str9 = locale7.getExtension('a');
        java.lang.String str10 = locale0.getDisplayVariant(locale7);
        java.util.Locale locale11 = locale0.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
    }

    @Test
    public void test17609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17609");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("trt           hindi(HI!,cHINA)            g[]", "\u5317\u5370\u5ea6\u6587 (hi!,china)", "chinois (chine)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test17610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17610");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                   lang)                                                                                                                                                                                                                                                                                                                                                                                   ", "#####################################################################################################################################################################################################################################################################################################################################hi!italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital..#####################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17611");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("HI!HI!HI!HI!HI!Hzh_Z!ZH_TWHI!HI!HI!HI!HI!Hzh_Z!H", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!Hzh_Z!ZH_TWHI!HI!HI!HI!HI!Hzh_Z!H" + "'", str2, "HI!HI!HI!HI!HI!Hzh_Z!ZH_TWHI!HI!HI!HI!HI!Hzh_Z!H");
    }

    @Test
    public void test17612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17612");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("zu", (-1), 746);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17613");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("...e.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugernge...", "h                                                gnalesenic.esenicavaj                                                I", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17614");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray6);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray6, "zh-CN");
        boolean boolean12 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, (java.lang.Class<?>[]) classArray6);
        java.lang.Class[] classArray14 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray14);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray14);
        java.lang.Class[] classArray20 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray20);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray20);
        boolean boolean24 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray14, (java.lang.Class<?>[]) classArray20);
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, (java.lang.Class<?>[]) classArray20, true);
        java.lang.Class[] classArray28 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray28);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray28);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray28);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray32);
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray32, ' ');
        boolean boolean36 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray20, wildcardClassArray32);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray32);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray37);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
    }

    @Test
    public void test17615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17615");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aD.AE.AF.AGchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", 94, '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aD.AE.AF.AGchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW" + "'", str3, "aD.AE.AF.AGchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW");
    }

    @Test
    public void test17616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17616");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("iHAILATI..", 'x', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iHAILATI.." + "'", str3, "iHAILATI..");
    }

    @Test
    public void test17617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17617");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##ITALIAN");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17618");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u4e2d\u56fd\u8a9e", "\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliIlish)", 27);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliilish)");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test17619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17619");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\u5317\u5370\u5ea6\u6587", (java.lang.CharSequence) "ITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITAL..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17620");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 35, 117);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17621");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Double", "d u ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Double" + "'", str2, "Double");
    }

    @Test
    public void test17622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17622");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                  hI   Taiwan                  hI   xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "HINDI(hi!,China)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17623");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "GERMAN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17624");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17625");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                            ##_#a", "\u4e2d\u56fdAD.AE.AF.A         ", 649);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                            ##_#a" + "'", str3, "                                                                                            ##_#a");
    }

    @Test
    public void test17626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17626");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, "cinese (Taiwan)");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("Cina", strMap6);
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("English");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange9, "");
        java.lang.String str12 = languageRange9.getRange();
        boolean boolean13 = languageRangeList7.add(languageRange9);
        boolean boolean14 = languageRangeList2.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, strMap18);
        java.lang.String[] strArray27 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.util.List<java.lang.Class<?>> wildcardClassList30 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList28);
        java.lang.String str31 = java.util.Locale.lookupTag(languageRangeList19, (java.util.Collection<java.lang.String>) strList28);
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags(languageRangeList7, (java.util.Collection<java.lang.String>) strList28);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, strMap37);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream39 = languageRangeList35.stream();
        boolean boolean40 = languageRangeList35.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap44 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList45 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, strMap44);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor46 = languageRangeList45.listIterator();
        boolean boolean47 = languageRangeList35.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45);
        java.util.Locale.LanguageRange languageRange50 = new java.util.Locale.LanguageRange("a");
        languageRangeList35.add(0, languageRange50);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange52 = languageRangeList7.set(83, languageRange50);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 83, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Locale.LanguageRange" + "'", str11, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "english" + "'", str12, "english");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClassList30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertNotNull(languageRangeStream39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(languageRangeList45);
        org.junit.Assert.assertNotNull(languageRangeItor46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test17627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17627");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("fra");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fra" + "'", str1, "fra");
    }

    @Test
    public void test17628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17628");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxUSxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17629");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("US", "zh", (int) '#');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "US" + "'", str5, "US");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test17630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17630");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".bg.bh.bi.bj.bl.bm.bn..", 'x');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17631");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("SEXXXXXXXXXXXXXX", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17632");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("FR", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FR" + "'", str2, "FR");
    }

    @Test
    public void test17633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17633");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "ca");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17634");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("YT.ZA.ZM.ZW", "ahi!hi!hi!GNE", "ChinChinChinChinChiChinChinChinChinC                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "YT.ZA.ZM.ZW" + "'", str3, "YT.ZA.ZM.ZW");
    }

    @Test
    public void test17635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17635");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("$(JAVA.LANG)", "HI!HI!HI!HI!HI!Hzh_Z!ZH_TWHI!HI!HI!HI!HI!Hzh_Z!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17636");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator3 = languageRangeList1.spliterator();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("zh-CN");
        java.util.Locale locale8 = builder5.build();
        boolean boolean9 = languageRangeList1.remove((java.lang.Object) locale8);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor10 = languageRangeList1.iterator();
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "\u4e2d\u6587");
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList1.replaceAll(languageRangeUnaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeSpliterator3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeItor10);
    }

    @Test
    public void test17637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17637");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "English", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "engliIlish", charArray7);
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) charArray7, "EnglTWNsTWN");
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "inglese", charArray7);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish", charArray7);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "latiarfatilatiarfatilatiarfatilatiar", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "char[]" + "'", str13, "char[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test17638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17638");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "RRAYLIS", (java.lang.CharSequence) "ssalc");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test17639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17639");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Locale locale4 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.lang.String str11 = locale7.getDisplayScript(locale9);
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale13);
        java.lang.String str15 = locale7.getDisplayCountry(locale13);
        java.lang.String str16 = locale5.getDisplayScript(locale7);
        java.util.Locale.setDefault(locale5);
        java.lang.String str18 = locale4.getDisplayVariant(locale5);
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.setDefault(locale19);
        java.lang.String str21 = locale19.getCountry();
        java.lang.String str22 = locale4.getDisplayCountry(locale19);
        java.lang.String str23 = locale19.getDisplayName();
        boolean boolean24 = locale19.hasExtensions();
        java.lang.String str25 = locale0.getDisplayVariant(locale19);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertEquals(locale4.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "inglese" + "'", str10, "inglese");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "english" + "'", str14, "english");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "cHINA" + "'", str18, "cHINA");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CN" + "'", str21, "CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HI!" + "'", str22, "HI!");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str23, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test17640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17640");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital..", 563, "TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWhi!italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital.." + "'", str3, "TWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWhi!italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital..");
    }

    @Test
    public void test17641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17641");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "#########################       HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########################       HI!" + "'", str1, "#########################       HI!");
    }

    @Test
    public void test17642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17642");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("ArrayList", '.');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "English");
        java.lang.String[] strArray6 = null;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("enenenenenen", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "enenenenenen" + "'", str7, "enenenenenen");
    }

    @Test
    public void test17643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17643");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "twn", "anihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihc");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test17644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17644");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("n       a                                           _          XXXXXXX_it                                           it          AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "n       a                                           _          XXXXXXX_it                                           it          AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa" + "'", str1, "n       a                                           _          XXXXXXX_it                                           it          AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa");
    }

    @Test
    public void test17645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17645");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("h                                                gnalesenic.esenicavaj                                                I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H                                                GNALESENIC.ESENICAVAJ                                                I" + "'", str1, "H                                                GNALESENIC.ESENICAVAJ                                                I");
    }

    @Test
    public void test17646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17646");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("######################", 98, '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$######################" + "'", str3, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$######################");
    }

    @Test
    public void test17647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17647");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("ZH)", "                             HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZH)" + "'", str2, "ZH)");
    }

    @Test
    public void test17648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17648");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCt    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17649");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(" a", "CA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17650");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("anAnAnAnAnAnxxxxxxxxinglese (Canada)xxxxxxxx", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17651");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("xxxahi!hiCinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", '$');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17652");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        boolean boolean8 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, strMap12);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        boolean boolean17 = languageRangeList10.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList15, "hi!");
        boolean boolean20 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream21 = languageRangeList1.stream();
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Locale locale26 = java.util.Locale.FRANCE;
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale26);
        java.util.Locale locale28 = java.util.Locale.US;
        java.util.Locale locale29 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale31 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.lang.String str33 = locale31.getDisplayCountry(locale32);
        java.lang.String str34 = locale31.toLanguageTag();
        java.util.Locale locale35 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = locale35.getDisplayCountry(locale36);
        java.util.Locale locale38 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale38.getDisplayCountry(locale39);
        java.util.Locale locale44 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale45 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale46 = java.util.Locale.getDefault();
        java.lang.String str47 = locale45.getDisplayCountry(locale46);
        java.util.Locale locale49 = new java.util.Locale("");
        java.lang.String str50 = locale49.getDisplayVariant();
        java.util.Locale locale51 = java.util.Locale.KOREAN;
        java.util.Locale locale53 = new java.util.Locale("");
        java.util.Locale locale54 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray55 = new java.util.Locale[] { locale26, locale28, locale29, locale30, locale31, locale36, locale38, locale44, locale46, locale49, locale51, locale53, locale54 };
        java.util.ArrayList<java.util.Locale> localeList56 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList56, localeArray55);
        java.util.List<java.util.Locale> localeList58 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.util.Locale>) localeList56);
        java.lang.String[] strArray66 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        java.util.List<java.lang.Class<?>> wildcardClassList69 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList67);
        java.util.Locale.FilteringMode filteringMode70 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList71 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.lang.String>) strList67, filteringMode70);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream72 = languageRangeList23.parallelStream();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap73 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList74 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, strMap73);
        boolean boolean75 = languageRangeList1.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap78 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList79 = java.util.Locale.LanguageRange.parse("Cina", strMap78);
        java.util.Locale.LanguageRange languageRange81 = new java.util.Locale.LanguageRange("English");
        java.lang.String str83 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange81, "");
        java.lang.String str84 = languageRange81.getRange();
        boolean boolean85 = languageRangeList79.add(languageRange81);
        double double86 = languageRange81.getWeight();
        double double87 = languageRange81.getWeight();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange88 = languageRangeList74.set(100, languageRange81);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(languageRangeStream21);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "english" + "'", str27, "english");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u4e2d\u56fd" + "'", str33, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "zh-CN" + "'", str34, "zh-CN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u56fd" + "'", str37, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u4e2d\u56fd" + "'", str40, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale44.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\u4e2d\u56fd" + "'", str47, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "ko");
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(localeList58);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(wildcardClassList69);
        org.junit.Assert.assertTrue("'" + filteringMode70 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode70.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(languageRangeStream72);
        org.junit.Assert.assertNotNull(languageRangeList74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(languageRangeList79);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Locale.LanguageRange" + "'", str83, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "english" + "'", str84, "english");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 1.0d + "'", double86 == 1.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 1.0d + "'", double87 == 1.0d);
    }

    @Test
    public void test17653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17653");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        44444444ENGLTWNSTWN44444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444ENGLTWNSTWN44444444" + "'", str1, "44444444ENGLTWNSTWN44444444");
    }

    @Test
    public void test17654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17654");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                  HINDI (HI!,CHINA)", 81, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                  HINDI (HI!,CHINA)" + "'", str3, "                                                                                  HINDI (HI!,CHINA)");
    }

    @Test
    public void test17655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17655");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\u4e2d\u56fd", "DE");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "...istfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayL...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test17656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17656");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale4.getDisplayCountry(locale6);
        java.util.Locale locale8 = java.util.Locale.TAIWAN;
        java.lang.String str9 = locale8.getVariant();
        java.lang.String str10 = locale4.getDisplayName(locale8);
        java.lang.String str11 = locale3.getDisplayScript(locale4);
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("twn");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.upperCase("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", locale15);
        java.lang.String str17 = locale15.getVariant();
        java.util.Locale.setDefault(category0, locale15);
        java.util.Locale locale21 = new java.util.Locale("");
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.util.Locale locale23 = java.util.Locale.CANADA;
        java.lang.String str24 = locale23.getDisplayLanguage();
        java.lang.String str25 = locale21.getDisplayScript(locale23);
        java.lang.String str26 = locale23.getDisplayVariant();
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.upperCase("", locale23);
        java.lang.String str28 = locale23.getLanguage();
        java.lang.String str30 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) locale23, "en_CA");
        java.util.Locale.setDefault(category0, locale23);
        java.lang.String str32 = locale23.getDisplayName();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587" + "'", str5, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str7, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str10, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "twn");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str16, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "English" + "'", str24, "English");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "en" + "'", str28, "en");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.util" + "'", str30, "java.util");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "English (Canada)" + "'", str32, "English (Canada)");
    }

    @Test
    public void test17657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17657");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("ITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIEN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIEN" + "'", str1, "ITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIEN");
    }

    @Test
    public void test17658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17658");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale locale4 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleKeys();
        java.lang.String str6 = locale4.getDisplayName();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test17659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17659");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace(".....ZHCINESESEn", "                                                                            it-CN", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxanic");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".....ZHCINESESEn" + "'", str3, ".....ZHCINESESEn");
    }

    @Test
    public void test17660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17660");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?> wildcardClass4 = null;
        java.lang.Class[] classArray6 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        wildcardClassArray7[0] = wildcardClass4;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray7, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray13);
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, (java.lang.Class<?>[]) classArray13);
        java.lang.Class[] classArray18 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray18);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray18);
        java.lang.Class[] classArray23 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray23);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray23);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray23, "zh-CN");
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, (java.lang.Class<?>[]) classArray23);
        boolean boolean31 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray21, false);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class[] classArray35 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray35);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray35);
        java.lang.Class[] classArray40 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray41 = (java.lang.Class<?>[]) classArray40;
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray40);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray40);
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray40, "zh-CN");
        boolean boolean46 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray38, (java.lang.Class<?>[]) classArray40);
        java.lang.Class[] classArray48 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray49 = (java.lang.Class<?>[]) classArray48;
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray48);
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray48);
        java.lang.Class[] classArray54 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray55 = (java.lang.Class<?>[]) classArray54;
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray54);
        java.lang.String str57 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray54);
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray48, (java.lang.Class<?>[]) classArray54);
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray38, (java.lang.Class<?>[]) classArray54, true);
        java.lang.Class[] classArray62 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray63 = (java.lang.Class<?>[]) classArray62;
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray62);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray62);
        java.lang.Class<?>[] wildcardClassArray66 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray62);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray66);
        java.lang.String str69 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray66, ' ');
        boolean boolean70 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray54, wildcardClassArray66);
        java.lang.Class<?>[] wildcardClassArray71 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray66);
        boolean boolean72 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray33, wildcardClassArray66);
        java.lang.Class<?>[] wildcardClassArray73 = null;
        boolean boolean74 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray33, wildcardClassArray73);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(classArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(classArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test17661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17661");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("chinois(chine)", "               class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.", 98);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17662");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder8 = builder3.setLanguage("");
        java.util.Locale.Builder builder9 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder3.setLanguageTag("Java.uHAR[].............................................................................................il");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: Java.uHAR[].............................................................................................il [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "china_CN");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test17663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17663");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("cn");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17664");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("                      hArrayList", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=harraylist");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17665");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray5 = languageRangeList4.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator6 = languageRangeList4.spliterator();
        boolean boolean7 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor8 = languageRangeList1.iterator();
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder12 = builder10.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder14 = builder12.setLanguage("it");
        boolean boolean15 = languageRangeList1.remove((java.lang.Object) builder14);
        java.util.Locale.Builder builder17 = builder14.setLanguageTag("CINESE");
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("HI");
        java.util.Locale.Builder builder20 = builder14.setLocale(locale19);
        java.util.Locale.Builder builder23 = builder20.setExtension('a', "");
        java.lang.String str25 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) 'a', "raaaaaaaaaaaaaaaaaaaingleseaaaaaaaaaaaaaaaaaaaaglAs");
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(languageRangeSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(languageRangeItor8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "hi");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang" + "'", str25, "java.lang");
    }

    @Test
    public void test17666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17666");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                I", "                  hI                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17667");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("uuuuuxAuuuuu", "ITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITALIAHi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuxAuuuuu" + "'", str2, "uuuuuxAuuuuu");
    }

    @Test
    public void test17668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17668");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English");
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange1, "");
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange5, languageRange7 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor11 = languageRangeList9.listIterator();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream12 = languageRangeList9.parallelStream();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator13 = languageRangeList9.spliterator();
        java.lang.Object[] objArray14 = languageRangeList9.toArray();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Locale.LanguageRange" + "'", str3, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(languageRangeItor11);
        org.junit.Assert.assertNotNull(languageRangeStream12);
        org.junit.Assert.assertNotNull(languageRangeSpliterator13);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test17669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17669");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray1, "zh-CN");
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        boolean boolean15 = languageRangeList8.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList13, "hi!");
        java.lang.Class[] classArray19 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray19);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray19);
        java.lang.Class[] classArray25 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray25);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray25);
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray19, (java.lang.Class<?>[]) classArray25);
        java.lang.Class[] classArray31 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray31);
        java.lang.Class<?> wildcardClass34 = null;
        java.lang.Class[] classArray36 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass34;
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray33, wildcardClassArray37, false);
        java.lang.Class[] classArray43 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray44 = (java.lang.Class<?>[]) classArray43;
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray43);
        boolean boolean46 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray33, (java.lang.Class<?>[]) classArray43);
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray19, (java.lang.Class<?>[]) classArray43);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray43);
        java.lang.Class<?>[] wildcardClassArray49 = languageRangeList13.toArray((java.lang.Class<?>[]) classArray43);
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray49);
        java.lang.Class[] classArray52 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray53 = (java.lang.Class<?>[]) classArray52;
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray52);
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray52);
        java.lang.Class[] classArray58 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray59 = (java.lang.Class<?>[]) classArray58;
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray58);
        java.lang.String str61 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray58);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray52, (java.lang.Class<?>[]) classArray58);
        java.lang.Class[] classArray64 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray65 = (java.lang.Class<?>[]) classArray64;
        java.lang.Class<?>[] wildcardClassArray66 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray64);
        java.lang.Class<?> wildcardClass67 = null;
        java.lang.Class[] classArray69 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray70 = (java.lang.Class<?>[]) classArray69;
        wildcardClassArray70[0] = wildcardClass67;
        boolean boolean74 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray66, wildcardClassArray70, false);
        java.lang.Class[] classArray76 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray77 = (java.lang.Class<?>[]) classArray76;
        java.lang.Class<?>[] wildcardClassArray78 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray76);
        boolean boolean79 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray66, (java.lang.Class<?>[]) classArray76);
        boolean boolean80 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray52, (java.lang.Class<?>[]) classArray76);
        java.lang.String str82 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray52, '#');
        boolean boolean83 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray50, (java.lang.Class<?>[]) classArray52);
        boolean boolean84 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray1, wildcardClassArray50);
        java.lang.Class<?>[] wildcardClassArray85 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(classArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(classArray64);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertNotNull(classArray69);
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(classArray76);
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertNotNull(wildcardClassArray78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray85);
    }

    @Test
    public void test17670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17670");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("INGLESE (CANADA)");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: INGLESE(CANADA)");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17671");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587          ", 'a');
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
    }

    @Test
    public void test17672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17672");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("Japanese", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Japanese" + "'", str2, "Japanese");
    }

    @Test
    public void test17673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17673");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("C...", "chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17674");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Cina", strMap1);
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("English");
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange4, "");
        java.lang.String str7 = languageRange4.getRange();
        boolean boolean8 = languageRangeList2.add(languageRange4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, 'x');
        boolean boolean12 = languageRangeList2.contains((java.lang.Object) "Chine");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap13);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream15 = languageRangeList14.stream();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream16 = languageRangeList14.parallelStream();
        int int17 = languageRangeList14.size();
        java.lang.Object[] objArray18 = languageRangeList14.toArray();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Locale.LanguageRange" + "'", str6, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "english" + "'", str7, "english");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeStream15);
        org.junit.Assert.assertNotNull(languageRangeStream16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test17675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17675");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("uuuuuuuuuuuuuuuuuuuuIthi!lihi!no", "Chinesisch(China)", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17676");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("$$$", 52, '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str3, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test17677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17677");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                              italiahi                                              ", "HArrayList", "rancese", 88);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                              italiahi                                              " + "'", str4, "                                              italiahi                                              ");
    }

    @Test
    public void test17678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17678");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale2);
        java.util.Locale.setDefault(locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setLanguage("HAR[].............................................................................................");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: HAR[]............................................................................................. [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "english" + "'", str3, "english");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test17679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17679");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("Xxxxxxxxinglese (Canada)xxxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Xxxxxxxxinglese (Canada)xxxxxxxx" + "'", str1, "Xxxxxxxxinglese (Canada)xxxxxxxx");
    }

    @Test
    public void test17680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17680");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("ng");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ng" + "'", str1, "ng");
    }

    @Test
    public void test17681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17681");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English");
        java.lang.String str2 = languageRange1.getRange();
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("English");
        java.lang.String str5 = languageRange4.getRange();
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange4, languageRange7 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream11 = languageRangeList9.stream();
        boolean boolean12 = languageRangeList9.isEmpty();
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        java.util.Locale.Builder builder15 = builder13.clearExtensions();
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str18 = locale17.getISO3Language();
        java.util.Locale.Builder builder19 = builder16.setLocale(locale17);
        java.util.Locale.Builder builder20 = builder16.clearExtensions();
        java.util.Locale locale21 = builder16.build();
        java.lang.String str23 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) locale21, "                                             italiahI                                             ");
        int int24 = languageRangeList9.indexOf((java.lang.Object) locale21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "english" + "'", str2, "english");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "english" + "'", str5, "english");
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(languageRangeStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zho" + "'", str18, "zho");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Locale" + "'", str23, "Locale");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test17682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17682");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("STRING");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "STRIN" + "'", str1, "STRIN");
    }

    @Test
    public void test17683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17683");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, "cinese (Taiwan)");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("Cina", strMap6);
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("English");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange9, "");
        java.lang.String str12 = languageRange9.getRange();
        boolean boolean13 = languageRangeList7.add(languageRange9);
        boolean boolean14 = languageRangeList2.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor15 = languageRangeList2.iterator();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Locale.LanguageRange" + "'", str11, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "english" + "'", str12, "english");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeItor15);
    }

    @Test
    public void test17684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17684");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("IT-CN", 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test17685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17685");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                             HI!HI!HI!HI!HI!", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             HI!HI!HI!HI!HI!" + "'", str2, "                             HI!HI!HI!HI!HI!");
    }

    @Test
    public void test17686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17686");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference(")                 A                 ( !ih!iha", "][gnirts");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "][gnirts" + "'", str2, "][gnirts");
    }

    @Test
    public void test17687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17687");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("TALIAHi");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: TALIAHi");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17688");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\u7063\u53f0\u6587\u4e2d", "###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17689");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("ENGLISH", "hi!string[]string[]s", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17690");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("WZ.MZ.AZ.TY.EY.SW.FW.UV.NV.IV.GV.EV.CV.AV.ZU.YShortA.XA.WA.UA.TA.SA.RA.QA.OA.NA.MA.LA.IA.GA.FA.EA", "de                                                                                                  ", "...                                     hI                                                javacinese.cineselang   ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WZ.MZ.AZ.TY.EY.SW.FW.UV.NV.IV.GV.EV.CV.AV.ZU.YShortA.XA.WA.UA.TA.SA.RA.QA.OA.NA.MA.LA.IA.GA.FA.EA" + "'", str3, "WZ.MZ.AZ.TY.EY.SW.FW.UV.NV.IV.GV.EV.CV.AV.ZU.YShortA.XA.WA.UA.TA.SA.RA.QA.OA.NA.MA.LA.IA.GA.FA.EA");
    }

    @Test
    public void test17691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17691");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                gnalesenic.esenicavaj                                                ", "fran\347ais (France)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17692");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("xxxxxxxxinglese (canada)xxxxxxxx", "\u7fa9\u5927\u5229");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17693");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("glish", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: glish");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17694");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale2);
        java.util.Locale.setDefault(locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.removeUnicodeLocaleAttribute("ANIH");
        java.util.Locale locale9 = builder8.build();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "english" + "'", str3, "english");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
    }

    @Test
    public void test17695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17695");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean5 = languageRangeList3.remove((java.lang.Object) "English");
        boolean boolean6 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        java.lang.String[] strArray19 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.List<java.lang.Class<?>> wildcardClassList22 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList20);
        java.lang.String str23 = java.util.Locale.lookupTag(languageRangeList11, (java.util.Collection<java.lang.String>) strList20);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean27 = languageRangeList25.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.Locale locale32 = java.util.Locale.FRANCE;
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale32);
        java.util.Locale locale34 = java.util.Locale.US;
        java.util.Locale locale35 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale36 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale37 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.lang.String str39 = locale37.getDisplayCountry(locale38);
        java.lang.String str40 = locale37.toLanguageTag();
        java.util.Locale locale41 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.lang.String str43 = locale41.getDisplayCountry(locale42);
        java.util.Locale locale44 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale45 = java.util.Locale.getDefault();
        java.lang.String str46 = locale44.getDisplayCountry(locale45);
        java.util.Locale locale50 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale51 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.lang.String str53 = locale51.getDisplayCountry(locale52);
        java.util.Locale locale55 = new java.util.Locale("");
        java.lang.String str56 = locale55.getDisplayVariant();
        java.util.Locale locale57 = java.util.Locale.KOREAN;
        java.util.Locale locale59 = new java.util.Locale("");
        java.util.Locale locale60 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray61 = new java.util.Locale[] { locale32, locale34, locale35, locale36, locale37, locale42, locale44, locale50, locale52, locale55, locale57, locale59, locale60 };
        java.util.ArrayList<java.util.Locale> localeList62 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList62, localeArray61);
        java.util.List<java.util.Locale> localeList64 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.util.Locale>) localeList62);
        java.util.List<java.util.Locale> localeList65 = java.util.Locale.filter(languageRangeList25, (java.util.Collection<java.util.Locale>) localeList62);
        java.util.List<java.util.Locale> localeList66 = java.util.Locale.filter(languageRangeList11, (java.util.Collection<java.util.Locale>) localeList65);
        java.util.Locale locale67 = java.util.Locale.lookup(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor68 = languageRangeList3.iterator();
        java.lang.String str70 = org.apache.commons.lang3.StringUtils.join(languageRangeItor68, "Cnxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange71 = languageRangeItor68.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClassList22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "english" + "'", str33, "english");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Chine" + "'", str39, "Chine");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "zh-CN" + "'", str40, "zh-CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Chine" + "'", str43, "Chine");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Chine" + "'", str46, "Chine");
        org.junit.Assert.assertEquals(locale50.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Chine" + "'", str53, "Chine");
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "ko");
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(localeList64);
        org.junit.Assert.assertNotNull(localeList65);
        org.junit.Assert.assertNotNull(localeList66);
        org.junit.Assert.assertNull(locale67);
        org.junit.Assert.assertNotNull(languageRangeItor68);
    }

    @Test
    public void test17696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17696");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("fran\347ais(France)", "xxxxxxxxxxxxxxxxxxxxxxxTRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]xxxxxxxxxxxxxxxxxxxxxxx", 120, (int) '$');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fran\347ais(France)xxxxxxxxxxxxxxxxxxxxxxxTRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]xxxxxxxxxxxxxxxxxxxxxxx" + "'", str4, "fran\347ais(France)xxxxxxxxxxxxxxxxxxxxxxxTRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]xxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test17697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17697");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ENGHI", "ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ENGHI" + "'", str2, "ENGHI");
    }

    @Test
    public void test17698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17698");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en-CASTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN", "ahi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17699");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder2.setLanguage("HI");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, strMap9);
        int int11 = languageRangeList7.size();
        java.util.Locale.LanguageRange languageRange13 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange15 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange17 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] { languageRange13, languageRange15, languageRange17 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        boolean boolean21 = languageRangeList7.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19);
        boolean boolean23 = languageRangeList19.equals((java.lang.Object) "Cina");
        java.util.Locale locale24 = java.util.Locale.ITALY;
        boolean boolean25 = languageRangeList19.equals((java.lang.Object) locale24);
        java.util.Locale.Builder builder26 = builder4.setLocale(locale24);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder28 = builder26.setRegion("                                                                  xxxxxxxxxxFrench(France)xxxxxxxxxx");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region:                                                                   xxxxxxxxxxFrench(France)xxxxxxxxxx [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test17700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17700");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "twn", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("chi...", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test17701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17701");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("A   ", 742);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  A   " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  A   ");
    }

    @Test
    public void test17702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17702");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) builder3, "CHNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.util.Locale.Builder builder8 = builder3.setLanguageTag("CN");
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("CHN");
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.lang.String str12 = locale11.getVariant();
        java.util.Locale locale14 = new java.util.Locale("");
        java.lang.String str15 = locale14.getDisplayLanguage();
        java.util.Locale locale16 = java.util.Locale.CANADA;
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.lang.String str18 = locale14.getDisplayScript(locale16);
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale20);
        java.lang.String str22 = locale14.getDisplayCountry(locale20);
        java.lang.String str23 = locale11.getDisplayScript(locale14);
        java.util.Locale.Builder builder24 = builder10.setLocale(locale14);
        java.util.Locale.Builder builder25 = builder24.clearExtensions();
        java.util.Locale.Builder builder27 = builder24.setScript("");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Locale.Builder" + "'", str6, "Locale.Builder");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "anglais" + "'", str17, "anglais");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "english" + "'", str21, "english");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test17703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17703");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("A#A#A#A#A#                      ", "English");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A#A#A#A#A#                      " + "'", str2, "A#A#A#A#A#                      ");
    }

    @Test
    public void test17704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17704");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream3 = languageRangeList1.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap7);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        boolean boolean12 = languageRangeList5.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap16 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, strMap16);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        boolean boolean21 = languageRangeList14.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList19, "hi!");
        boolean boolean24 = languageRangeList5.remove((java.lang.Object) languageRangeList19);
        boolean boolean25 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19);
        java.lang.Object obj26 = null;
        int int27 = languageRangeList1.indexOf(obj26);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor29 = languageRangeList1.listIterator(530);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 530");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeStream3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test17705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17705");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("redliub.elacol", 990, "cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "redliub.elacolcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAA" + "'", str3, "redliub.elacolcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcHINAAAAAA");
    }

    @Test
    public void test17706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17706");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.lang.String[] strArray12 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.List<java.lang.Class<?>> wildcardClassList15 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = java.util.Locale.lookupTag(languageRangeList4, (java.util.Collection<java.lang.String>) strList13);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, strMap20);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        boolean boolean25 = languageRangeList18.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream26 = languageRangeList23.stream();
        boolean boolean27 = languageRangeList4.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap31 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, strMap31);
        int int33 = languageRangeList29.size();
        java.util.Locale.LanguageRange languageRange35 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange37 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange39 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] { languageRange35, languageRange37, languageRange39 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        boolean boolean43 = languageRangeList29.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41);
        java.util.Locale locale46 = new java.util.Locale("");
        java.lang.String str47 = locale46.getDisplayLanguage();
        java.util.Locale locale48 = java.util.Locale.CANADA;
        java.lang.String str49 = locale48.getDisplayLanguage();
        java.lang.String str50 = locale46.getDisplayScript(locale48);
        java.lang.String str51 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale46);
        java.lang.String str52 = locale46.getDisplayScript();
        java.util.Set<java.lang.String> strSet53 = locale46.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode54 = null;
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strSet53, filteringMode54);
        java.lang.String str56 = java.util.Locale.lookupTag(languageRangeList4, (java.util.Collection<java.lang.String>) strSet53);
        java.util.Locale.LanguageRange[] languageRangeArray57 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList58 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList58, languageRangeArray57);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap60 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList61 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList58, strMap60);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream62 = languageRangeList58.stream();
        boolean boolean63 = languageRangeList58.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray64 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList65 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList65, languageRangeArray64);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap67 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList68 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList65, strMap67);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor69 = languageRangeList68.listIterator();
        boolean boolean70 = languageRangeList58.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList68);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap72 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList73 = java.util.Locale.LanguageRange.parse("Cina", strMap72);
        java.lang.String[] strArray77 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        java.util.Locale.FilteringMode filteringMode80 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList81 = java.util.Locale.filterTags(languageRangeList73, (java.util.Collection<java.lang.String>) strList78, filteringMode80);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap83 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList84 = java.util.Locale.LanguageRange.parse("Cina", strMap83);
        java.lang.String[] strArray88 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList89 = new java.util.ArrayList<java.lang.String>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList89, strArray88);
        java.util.Locale.FilteringMode filteringMode91 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList92 = java.util.Locale.filterTags(languageRangeList84, (java.util.Collection<java.lang.String>) strList89, filteringMode91);
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags(languageRangeList68, (java.util.Collection<java.lang.String>) strList78, filteringMode91);
        boolean boolean94 = languageRangeList4.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList68);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor95 = languageRangeList4.listIterator();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClassList15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(languageRangeStream26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "anglais" + "'", str49, "anglais");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "a" + "'", str51, "a");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(languageRangeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(languageRangeList61);
        org.junit.Assert.assertNotNull(languageRangeStream62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(languageRangeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(languageRangeList68);
        org.junit.Assert.assertNotNull(languageRangeItor69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(languageRangeList73);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + filteringMode80 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode80.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNotNull(languageRangeList84);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + filteringMode91 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode91.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertNotNull(strList93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(languageRangeItor95);
    }

    @Test
    public void test17707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17707");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("Chinese (Taiwan)", "\u82f1\u6587\u52a0\u62ff\u5927)", ".....zhcinesese");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test17708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17708");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder6 = builder4.setLocale(locale5);
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        boolean boolean13 = locale11.hasExtensions();
        java.lang.String str14 = locale11.getVariant();
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.upperCase("String", locale11);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.lowerCase("chinChinChinChinChiChinChinChinChinC", locale11);
        java.util.Set<java.lang.String> strSet17 = locale11.getUnicodeLocaleAttributes();
        java.lang.String str18 = locale7.getDisplayName(locale11);
        java.util.Locale.Builder builder19 = builder2.setLocale(locale7);
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder21 = builder20.clearExtensions();
        java.util.Locale.Builder builder23 = builder21.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder25 = builder23.setLanguage("CHINA");
        java.util.Locale.Builder builder27 = builder23.setRegion("zh");
        java.util.Locale locale28 = builder27.build();
        java.util.Locale.Builder builder29 = builder19.setLocale(locale28);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "STRING" + "'", str15, "STRING");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chinchinchinchinchichinchinchinchinc" + "'", str16, "chinchinchinchinchichinchinchinchinc");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Chinese (China)" + "'", str18, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "china_ZH");
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test17709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17709");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "f   c ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17710");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("n a", "en-ca");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test17711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17711");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "ANGLAIS (CANADA", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17712");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("CHIChinChinChinChinChinChinChinChinChinaaaaaaaaa#A", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHIChinChinChinChinChinChinChinChinChinaaaaaaaaa#A" + "'", str2, "CHIChinChinChinChinChinChinChinChinChinaaaaaaaaa#A");
    }

    @Test
    public void test17713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17713");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray5 = languageRangeList4.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator6 = languageRangeList4.spliterator();
        boolean boolean7 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4);
        boolean boolean8 = languageRangeList4.isEmpty();
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder12 = builder10.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        java.util.Locale.Builder builder16 = builder14.addUnicodeLocaleAttribute("util");
        boolean boolean17 = languageRangeList4.remove((java.lang.Object) builder14);
        java.util.Locale.Builder builder18 = builder14.clear();
        java.util.Locale.Builder builder19 = builder14.clearExtensions();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(languageRangeSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test17714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17714");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "fr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17715");
        java.util.Locale locale3 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.util.Locale locale6 = new java.util.Locale("");
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.lang.String str10 = locale6.getDisplayScript(locale8);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale12);
        java.lang.String str14 = locale6.getDisplayCountry(locale12);
        java.lang.String str15 = locale4.getDisplayScript(locale6);
        java.util.Locale.setDefault(locale4);
        java.lang.String str17 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale18 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.setDefault(locale18);
        java.lang.String str20 = locale18.getCountry();
        java.lang.String str21 = locale3.getDisplayCountry(locale18);
        java.lang.String str22 = locale18.getDisplayName();
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder25 = builder23.setScript("");
        java.util.Locale locale26 = builder23.build();
        java.util.Locale locale27 = builder23.build();
        java.lang.String str28 = locale18.getDisplayScript(locale27);
        java.lang.String str29 = locale18.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "anglais" + "'", str9, "anglais");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "english" + "'", str13, "english");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "cHINA" + "'", str17, "cHINA");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CN" + "'", str20, "CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HI!" + "'", str21, "HI!");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str22, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u4e2d\u6587" + "'", str29, "\u4e2d\u6587");
    }

    @Test
    public void test17716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17716");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("EnglANIHC      sANIHC      ", "AIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAI", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17717");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn", "lang)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17718");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("zho-US", 22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zho-US                " + "'", str2, "zho-US                ");
    }

    @Test
    public void test17719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17719");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Nithi!li", (int) (byte) 0, "jpn");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nithi!li" + "'", str3, "Nithi!li");
    }

    @Test
    public void test17720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17720");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\u6587\u4e2desenihC", "                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17721");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ArrayList", '.');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ArrayList" + "'", str3, "ArrayList");
    }

    @Test
    public void test17722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17722");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("English");
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale5.getDisplayCountry(locale6);
        java.lang.String str8 = locale5.toLanguageTag();
        java.lang.String str9 = locale5.getCountry();
        java.lang.String str10 = locale5.getISO3Country();
        java.util.Locale locale12 = new java.util.Locale("");
        java.lang.String str13 = locale12.getDisplayVariant();
        java.lang.String str14 = locale5.getDisplayLanguage(locale12);
        java.lang.String str15 = locale12.getLanguage();
        java.util.Set<java.lang.Character> charSet16 = locale12.getExtensionKeys();
        java.lang.String str17 = locale12.getVariant();
        java.util.Locale.Builder builder18 = builder4.setLocale(locale12);
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str20 = locale19.getLanguage();
        java.lang.String str21 = locale19.getLanguage();
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.util.Locale locale24 = new java.util.Locale("");
        java.lang.String str25 = locale24.getDisplayLanguage();
        java.util.Locale locale26 = java.util.Locale.CANADA;
        java.lang.String str27 = locale26.getDisplayLanguage();
        java.lang.String str28 = locale24.getDisplayScript(locale26);
        java.util.Locale locale30 = java.util.Locale.FRANCE;
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale30);
        java.lang.String str32 = locale24.getDisplayCountry(locale30);
        java.lang.String str33 = locale22.getDisplayScript(locale24);
        java.util.Locale.setDefault(locale22);
        java.util.Locale locale38 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale39 = java.util.Locale.ITALIAN;
        java.util.Locale locale41 = new java.util.Locale("");
        java.lang.String str42 = locale41.getDisplayLanguage();
        java.util.Locale locale43 = java.util.Locale.CANADA;
        java.lang.String str44 = locale43.getDisplayLanguage();
        java.lang.String str45 = locale41.getDisplayScript(locale43);
        java.util.Locale locale47 = java.util.Locale.FRANCE;
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale47);
        java.lang.String str49 = locale41.getDisplayCountry(locale47);
        java.lang.String str50 = locale39.getDisplayScript(locale41);
        java.util.Locale.setDefault(locale39);
        java.lang.String str52 = locale38.getDisplayVariant(locale39);
        java.lang.String str53 = locale22.getDisplayLanguage(locale39);
        java.lang.String str54 = locale19.getDisplayLanguage(locale39);
        java.util.Locale locale55 = locale39.stripExtensions();
        java.util.Locale.Builder builder56 = builder4.setLocale(locale39);
        java.util.Locale.Builder builder57 = builder56.clear();
        java.util.Locale locale58 = builder56.build();
        java.lang.String str59 = locale58.getScript();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd" + "'", str7, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh-CN" + "'", str8, "zh-CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CN" + "'", str9, "CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CHN" + "'", str10, "CHN");
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chinese" + "'", str14, "Chinese");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "it" + "'", str20, "it");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "it" + "'", str21, "it");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u82f1\u6587" + "'", str27, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "english" + "'", str31, "english");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals(locale38.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it");
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "inglese" + "'", str44, "inglese");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "english" + "'", str48, "english");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "cHINA" + "'", str52, "cHINA");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "italiano" + "'", str53, "italiano");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "italiano" + "'", str54, "italiano");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "it");
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test17723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17723");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zho");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray6);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray6);
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray6);
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray10, ' ');
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray10);
        boolean boolean15 = languageRange1.equals((java.lang.Object) wildcardClassArray14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zho" + "'", str2, "zho");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zho" + "'", str4, "zho");
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test17724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17724");
        java.util.Locale locale3 = new java.util.Locale("Cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engli", "us");
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleKeys();
        java.lang.String str6 = locale3.getVariant();
        java.util.Locale locale7 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.lang.String str9 = locale7.getDisplayCountry(locale8);
        java.lang.String str10 = locale7.toLanguageTag();
        java.lang.String str11 = locale7.getCountry();
        java.lang.String str12 = locale7.getISO3Country();
        java.util.Locale locale14 = new java.util.Locale("");
        java.lang.String str15 = locale14.getDisplayVariant();
        java.lang.String str16 = locale7.getDisplayLanguage(locale14);
        java.lang.String str17 = locale14.getLanguage();
        java.util.Set<java.lang.Character> charSet18 = locale14.getExtensionKeys();
        java.lang.String str19 = locale14.getVariant();
        java.lang.String str20 = locale3.getDisplayName(locale14);
        java.util.Locale locale21 = locale14.stripExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI_us");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str4, "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "us" + "'", str6, "us");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cina" + "'", str9, "Cina");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh-CN" + "'", str10, "zh-CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CN" + "'", str11, "CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CHN" + "'", str12, "CHN");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx (GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI,us)" + "'", str20, "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx (GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI,us)");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
    }

    @Test
    public void test17725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17725");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("\u56fd\u4e2d");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A.FA.EA" + "'", str1, "A.FA.EA");
    }

    @Test
    public void test17726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17726");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("cines                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test17727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17727");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ahi!hi!hi!hi!hi...", "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fdxxx");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17728");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale3.getDisplayScript(locale5);
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale9);
        java.lang.String str11 = locale3.getDisplayCountry(locale9);
        java.lang.String str12 = locale1.getDisplayScript(locale3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.upperCase("China", locale1);
        java.util.Set<java.lang.Character> charSet14 = locale1.getExtensionKeys();
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.lowerCase("String[]", locale16);
        java.lang.String str19 = locale16.getVariant();
        java.lang.String str20 = locale1.getDisplayScript(locale16);
        java.lang.String str21 = locale1.getLanguage();
        java.util.Set<java.lang.Character> charSet22 = locale1.getExtensionKeys();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap24 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.parse("italiano", strMap24);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator26 = languageRangeList25.spliterator();
        boolean boolean27 = locale1.equals((java.lang.Object) languageRangeList25);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "inglese" + "'", str6, "inglese");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "english" + "'", str10, "english");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CHINA" + "'", str13, "CHINA");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "string[]" + "'", str18, "string[]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "it" + "'", str21, "it");
        org.junit.Assert.assertNotNull(charSet22);
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertNotNull(languageRangeSpliterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test17729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17729");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (IA,zh,CN)", "it                                           it          AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17730");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                zH                ", (java.lang.CharSequence) "                                                                                                              hI   Taiwan                  hI   xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17731");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw", "Ithi!lihi!no", 98);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Ci_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_a", strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("", "frfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr", (int) 'u');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ita", strArray5, strArray10);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ita" + "'", str12, "ita");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test17732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17732");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "ReferencePipeline.Head");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17733");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\u4e2d\u56fd");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17734");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b)");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ??(??)??(??)??(??)??(??)??(??)??(??)??(??)??(??)??(??)??(??)??(??)??(??)??(??)??(??)??(??)??(??)??(??)??(??)??(??)??(??)??(??)??(??)??(??)??(??)??(??)??(??)??(??)??(??)??(??)??(??)??(??)");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17735");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587 (HI!,cHINA)", "raaaaaaaaaaaaaaaaaaaingleseaaaaaaaaaaaaaaaaaaaaglasaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish", "\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940 (Italiano)", 248);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587 (HI!,cHINA)" + "'", str4, "\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587 (HI!,cHINA)");
    }

    @Test
    public void test17736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17736");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("LOCLE.LNGUGERNGE", "Chinese (China)", 6);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd", strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "avaj", 42);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("$$$$$$$$$$$$$$$$$a$$$$$$$$$$$$$$$$$", strArray7, strArray12);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$$$$$$$$$$$$$$$$$a$$$$$$$$$$$$$$$$$" + "'", str13, "$$$$$$$$$$$$$$$$$a$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test17737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17737");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "CHINES");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17738");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("hi!hi! (       AN       englis A                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi! (       AN       englis A                 " + "'", str1, "hi!hi! (       AN       englis A                 ");
    }

    @Test
    public void test17739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17739");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("IA", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIA" + "'", str2, "IAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIA");
    }

    @Test
    public void test17740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17740");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...ggggggggItaliano...ggggggggg", 259, "HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...ggggggggItaliano...gggggggggHI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!H" + "'", str3, "...ggggggggItaliano...gggggggggHI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!H");
    }

    @Test
    public void test17741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17741");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("zh-cnenglish (locale.languagerange)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-cnenglish (locale.languagerange)" + "'", str1, "zh-cnenglish (locale.languagerange)");
    }

    @Test
    public void test17742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17742");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("   JAJAJAJAJAJAJAJAJAJAJAJAJAJ)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAJAJAJAJAJAJAJAJAJAJAJAJAJ)" + "'", str1, "JAJAJAJAJAJAJAJAJAJAJAJAJAJ)");
    }

    @Test
    public void test17743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17743");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        boolean boolean8 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, strMap12);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        boolean boolean17 = languageRangeList10.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList15, "hi!");
        boolean boolean20 = languageRangeList1.remove((java.lang.Object) languageRangeList15);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor21 = languageRangeList1.listIterator();
        boolean boolean22 = languageRangeList1.isEmpty();
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder25 = builder23.setScript("");
        java.util.Locale.Builder builder27 = builder25.setLanguage("HI");
        int int28 = languageRangeList1.indexOf((java.lang.Object) builder27);
        java.util.Locale.Builder builder29 = builder27.clear();
        java.util.Locale.Builder builder30 = builder27.clear();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(languageRangeItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test17744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17744");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("class java.lang.string", "....english");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17745");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("LANGUAGERANGE", "REFERENCEPIPELINE.HEAD");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17746");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("....english", 93, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "....englishxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str3, "....englishxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test17747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17747");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("                                   ", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17748");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "\u4e2d\u56fd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17749");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "it-CN", "XXXXXXXXXXXXXXJAPANESEXXXXXXXXXXXXXX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17750");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        int int4 = languageRangeList2.lastIndexOf((java.lang.Object) locale3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor10 = languageRangeList9.listIterator();
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, strMap14);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor16 = languageRangeList15.listIterator();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale25);
        java.util.Locale locale27 = java.util.Locale.US;
        java.util.Locale locale28 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = locale30.getDisplayCountry(locale31);
        java.lang.String str33 = locale30.toLanguageTag();
        java.util.Locale locale34 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale35 = java.util.Locale.getDefault();
        java.lang.String str36 = locale34.getDisplayCountry(locale35);
        java.util.Locale locale37 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.lang.String str39 = locale37.getDisplayCountry(locale38);
        java.util.Locale locale43 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale44 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale45 = java.util.Locale.getDefault();
        java.lang.String str46 = locale44.getDisplayCountry(locale45);
        java.util.Locale locale48 = new java.util.Locale("");
        java.lang.String str49 = locale48.getDisplayVariant();
        java.util.Locale locale50 = java.util.Locale.KOREAN;
        java.util.Locale locale52 = new java.util.Locale("");
        java.util.Locale locale53 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray54 = new java.util.Locale[] { locale25, locale27, locale28, locale29, locale30, locale35, locale37, locale43, locale45, locale48, locale50, locale52, locale53 };
        java.util.ArrayList<java.util.Locale> localeList55 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList55, localeArray54);
        java.util.List<java.util.Locale> localeList57 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.util.Locale>) localeList55);
        java.lang.String[] strArray65 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        java.util.List<java.lang.Class<?>> wildcardClassList68 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList66);
        java.util.Locale.FilteringMode filteringMode69 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList70 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList66, filteringMode69);
        java.util.List<java.lang.String> strList71 = java.util.Locale.filterTags(languageRangeList15, (java.util.Collection<java.lang.String>) strList19, filteringMode69);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor72 = languageRangeList15.listIterator();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream73 = languageRangeList15.parallelStream();
        boolean boolean74 = languageRangeList9.remove((java.lang.Object) languageRangeStream73);
        boolean boolean75 = languageRangeList2.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9);
        java.lang.String str77 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, "esesenichz");
        int int78 = languageRangeList2.size();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeItor10);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(languageRangeItor16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "english" + "'", str26, "english");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "it");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Cina" + "'", str32, "Cina");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zh-CN" + "'", str33, "zh-CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "it");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Cina" + "'", str36, "Cina");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "it");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Cina" + "'", str39, "Cina");
        org.junit.Assert.assertEquals(locale43.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Cina" + "'", str46, "Cina");
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "ko");
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(localeList57);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(wildcardClassList68);
        org.junit.Assert.assertTrue("'" + filteringMode69 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode69.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(languageRangeItor72);
        org.junit.Assert.assertNotNull(languageRangeStream73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
    }

    @Test
    public void test17751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17751");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("INA................................................................................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "INA..............................................................................................." + "'", str1, "INA...............................................................................................");
    }

    @Test
    public void test17752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17752");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("English (United States)", "        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English (United States)" + "'", str2, "English (United States)");
    }

    @Test
    public void test17753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17753");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw", 234, 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17754");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] { languageRange7, languageRange9, languageRange11 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        boolean boolean15 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, strMap19);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator21 = languageRangeList17.spliterator();
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap25 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList26 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, strMap25);
        int int27 = languageRangeList23.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean31 = languageRangeList29.remove((java.lang.Object) "English");
        boolean boolean32 = languageRangeList23.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap36 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, strMap36);
        java.lang.String[] strArray45 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.util.List<java.lang.Class<?>> wildcardClassList48 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList46);
        java.lang.String str49 = java.util.Locale.lookupTag(languageRangeList37, (java.util.Collection<java.lang.String>) strList46);
        java.util.List<java.lang.Class<?>> wildcardClassList50 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList46);
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.lang.String>) strList46);
        java.util.Locale.LanguageRange[] languageRangeArray52 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList53 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53, languageRangeArray52);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap55 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList56 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, strMap55);
        int int57 = languageRangeList53.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList59 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean61 = languageRangeList59.remove((java.lang.Object) "English");
        boolean boolean62 = languageRangeList53.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59);
        java.lang.String[] strArray67 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray70 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray71 = org.apache.commons.lang3.StringUtils.stripAll(strArray70);
        java.lang.String[] strArray72 = org.apache.commons.lang3.StringUtils.stripAll(strArray71);
        java.lang.String str73 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray67, strArray71);
        boolean boolean74 = languageRangeList53.equals((java.lang.Object) strArray71);
        boolean boolean75 = languageRangeList23.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53);
        boolean boolean76 = languageRangeList17.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23);
        boolean boolean77 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23);
        java.util.Locale.Category category78 = java.util.Locale.Category.FORMAT;
        boolean boolean79 = languageRangeList23.remove((java.lang.Object) category78);
        java.util.Locale locale80 = java.util.Locale.ITALIAN;
        java.lang.String str81 = locale80.getLanguage();
        java.lang.String str82 = locale80.getLanguage();
        java.util.Set<java.lang.String> strSet83 = locale80.getUnicodeLocaleAttributes();
        java.lang.String str84 = locale80.getISO3Language();
        java.util.Locale.setDefault(category78, locale80);
        java.util.Locale locale86 = java.util.Locale.getDefault(category78);
        java.util.Locale locale87 = java.util.Locale.getDefault(category78);
        java.util.Locale locale88 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category78, locale88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(languageRangeSpliterator21);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(languageRangeList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(languageRangeList29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(languageRangeList37);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClassList48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(wildcardClassList50);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(languageRangeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(languageRangeList56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(languageRangeList59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str73, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + category78 + "' != '" + java.util.Locale.Category.FORMAT + "'", category78.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "it");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "it" + "'", str81, "it");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "it" + "'", str82, "it");
        org.junit.Assert.assertNotNull(strSet83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "ita" + "'", str84, "ita");
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "it");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "it");
    }

    @Test
    public void test17755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17755");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ENGL....ENGLISHS....ENGLISH", "        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17756");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ENGLxxxxENGLISHSxxxxENGLISH", "italiahi", "TRING[]TRIAD.AE.AF.A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ENGLxxxxENGLISHSxxxxENGLISH" + "'", str3, "ENGLxxxxENGLISHSxxxxENGLISH");
    }

    @Test
    public void test17757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17757");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("$$ZH_TW$$$", "RGLASA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$ZH_TW$$$" + "'", str2, "$$ZH_TW$$$");
    }

    @Test
    public void test17758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17758");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("ANIHC               EN_ca                                                                 ", 'u');
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("ese (Taiwan", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("zhcines", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("L.AVAJSTRING[]STRING[]STRING[");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHind", strArray5, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ANIHC               EN_ca                                                                 " + "'", str8, "ANIHC               EN_ca                                                                 ");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test17759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17759");
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("java.uil", locale1);
        java.util.Locale.Category category6 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.util.Locale locale8 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.lang.String str10 = locale8.getDisplayScript();
        java.util.Locale.setDefault(category6, locale8);
        java.util.Locale locale12 = java.util.Locale.getDefault(category6);
        java.lang.String str13 = locale12.getDisplayVariant();
        java.util.Locale locale15 = new java.util.Locale("I");
        java.util.Locale locale16 = locale15.stripExtensions();
        java.lang.String str17 = locale12.getDisplayLanguage(locale16);
        java.lang.String str18 = locale1.getDisplayScript(locale12);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "it" + "'", str2, "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.uil" + "'", str5, "java.uil");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "cinese" + "'", str9, "cinese");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals(locale15.toString(), "i");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "i");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Chinese" + "'", str17, "Chinese");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test17760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17760");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("                 a  ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: a");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17761");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Chinese(China)");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("chinois (Chine    ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test17762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17762");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                          N       A                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "N A" + "'", str1, "N A");
    }

    @Test
    public void test17763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17763");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("CHINOIS(CHINE)", 47);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                CHINOIS(CHINE)                 " + "'", str2, "                CHINOIS(CHINE)                 ");
    }

    @Test
    public void test17764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17764");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("   CINESE       CINESE       CINESE       CINESE       CINESE       CINESE       CINESE       CGNE", "$$$$$$$$$$$$$$$$$a$$$$$$$$$$$$$$$$$", "\u7063\u53f0\u6587\u4e2d");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test17765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17765");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                redliuB.elacoL");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17766");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("us");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '$', 5, 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test17767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17767");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hI");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI" + "'", str2, "hI");
    }

    @Test
    public void test17768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17768");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", (int) (byte) -1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "Short");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test17769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17769");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "in", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: in");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17770");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("en-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CA                                                                                                                                                                                                                                                                 ", "  l");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17771");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("undaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaa", 9, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17772");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale4);
        java.util.Locale locale6 = java.util.Locale.US;
        java.util.Locale locale7 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.lang.String str11 = locale9.getDisplayCountry(locale10);
        java.lang.String str12 = locale9.toLanguageTag();
        java.util.Locale locale13 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = locale13.getDisplayCountry(locale14);
        java.util.Locale locale16 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale16.getDisplayCountry(locale17);
        java.util.Locale locale22 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale23 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = locale23.getDisplayCountry(locale24);
        java.util.Locale locale27 = new java.util.Locale("");
        java.lang.String str28 = locale27.getDisplayVariant();
        java.util.Locale locale29 = java.util.Locale.KOREAN;
        java.util.Locale locale31 = new java.util.Locale("");
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray33 = new java.util.Locale[] { locale4, locale6, locale7, locale8, locale9, locale14, locale16, locale22, locale24, locale27, locale29, locale31, locale32 };
        java.util.ArrayList<java.util.Locale> localeList34 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList34, localeArray33);
        java.util.List<java.util.Locale> localeList36 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList34);
        java.lang.String[] strArray44 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.util.List<java.lang.Class<?>> wildcardClassList47 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList45);
        java.util.Locale.FilteringMode filteringMode48 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList45, filteringMode48);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream50 = languageRangeList1.parallelStream();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator51 = languageRangeList1.spliterator();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap53 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList54 = java.util.Locale.LanguageRange.parse("Cina", strMap53);
        java.lang.String[] strArray58 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        java.util.Locale.FilteringMode filteringMode61 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList62 = java.util.Locale.filterTags(languageRangeList54, (java.util.Collection<java.lang.String>) strList59, filteringMode61);
        java.lang.String str63 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList62);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream64 = languageRangeList1.stream();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "english" + "'", str5, "english");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cina" + "'", str11, "Cina");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh-CN" + "'", str12, "zh-CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cina" + "'", str15, "Cina");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cina" + "'", str18, "Cina");
        org.junit.Assert.assertEquals(locale22.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cina" + "'", str25, "Cina");
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko");
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(localeList36);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClassList47);
        org.junit.Assert.assertTrue("'" + filteringMode48 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode48.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(languageRangeStream50);
        org.junit.Assert.assertNotNull(languageRangeSpliterator51);
        org.junit.Assert.assertNotNull(languageRangeList54);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + filteringMode61 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode61.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(languageRangeStream64);
    }

    @Test
    public void test17773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17773");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("BUILDEo", "AnAnAnAnAnAnxxxxxxxxinglese (Canada)xxxxxxxx", "OCLE.LGUGERGE", 649);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "BUILDEo" + "'", str4, "BUILDEo");
    }

    @Test
    public void test17774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17774");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 747);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17775");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("ARRAYLIS", "                                           CINACI                                            ", 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ARRAYLIS                                           CINACI                                            ARRAYLIS                                           CINACI                                            ARRAYLIS                                           CINACI                                            ARRAYLIS                                           CINACI                                            ARRAYLIS                                           CINACI                                            ARRAYLIS                                           CINACI                                            ARRAYLIS                                           CINACI                                            ARRAYLIS                                           CINACI                                            ARRAYLIS                                           CINACI                                            ARRAYLIS" + "'", str3, "ARRAYLIS                                           CINACI                                            ARRAYLIS                                           CINACI                                            ARRAYLIS                                           CINACI                                            ARRAYLIS                                           CINACI                                            ARRAYLIS                                           CINACI                                            ARRAYLIS                                           CINACI                                            ARRAYLIS                                           CINACI                                            ARRAYLIS                                           CINACI                                            ARRAYLIS                                           CINACI                                            ARRAYLIS");
    }

    @Test
    public void test17776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17776");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("SHORT                                                                                       ", (double) 18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=18.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17777");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("$$ZH_TW$$$", "WZ.MZ.AZ.TY.EY.SW.FW.UV.NV.IV.GV.EV.CV.AV.ZU.YU.SU.MU.GU.AU.ZT.WT.VT.TT.RT.OT.NT.MT.LT.KT.JT.HT.GT.FT.DT.CT.ZS.YS.XS.VS.TS.SS.RS.OS.NS.MS.LS.KS.JS.IS.HS.GS.ES.DS.CS.BS.AS.WR.UR.SR.OR.ER.AQ.YP.WP.TP.SP.RP.NP.MP.LP.KP.HP.GP.FP.EP.AP.MO.ZN.UN.RN.PN.ON.LN.IN.GN.FN.EN.CN.AN.ZM.YM.XM.WM.VM.UM.TM.SM.RM.QM.PM.OM.NM.MM.LM.KM.HM.GM.FM.EM.DM.CM.AM.YL.VL.UL.TL.SL.RL.KL.IL.CL.BL.AL.ZK.YK.WK.RK.PK.NK.MK.IK.HK.GK.EK.PJ.OJ.MJ.EJ.TI.SI.RI.QI.OI.NI.MI.LI.EI.DI.UH.TH.RH.NH.MH.KH.YG.WG.UG.TG.SG.RG.QG.PG.NG.MG.LG.IG.HG.GG.FG.EG.DG.BG.AG.RF.OF.MF.KF.JF.IF.TE.SE.RE.HE.GE.EE.CE.ZD.OD.MD.KD.JD.ED.ZC.YC.XC.WC.VC.UC.RC.OC.NC.MC.LC.KC.IC.HC.GC.FC.DC.CC.AC.ZB.YB.WB.VB.TB.SB.RB.QB.OB.NB.MB.LB.JB.IB.HB.GB.FB.EB.DB.BB.AB.ZA.XA.WA.UA.TA.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanhcGA.FA.EA.DA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$ZH_TW$$$" + "'", str2, "$$ZH_TW$$$");
    }

    @Test
    public void test17778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17778");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("                                Zxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test17779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17779");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("String", "#######################################################################################", "ava");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "String" + "'", str3, "String");
    }

    @Test
    public void test17780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17780");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 20, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17781");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Locale.Category");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17782");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("english");
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clearExtensions();
        java.util.Locale.Builder builder11 = builder9.setLanguage("nglais");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder9.setRegion("############################NHC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ############################NHC [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "english");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test17783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17783");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("twn");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", locale5);
        java.lang.String str7 = locale2.getDisplayCountry(locale5);
        java.lang.String str8 = locale5.getDisplayCountry();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "twn");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str6, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test17784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17784");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("h", "AN                 a                 AN", 7);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("aaaaaaaaa$", (java.lang.Object[]) strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("\u65e5\u6587", "EnglTWNsTWN");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("...ccccc", strArray6, strArray11);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'x', 20, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "...ccccc" + "'", str12, "...ccccc");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test17785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17785");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English");
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange1, "");
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange5, languageRange7 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor11 = languageRangeList9.listIterator();
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.split("english", "cHINA", (int) (byte) 1);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("Chin", strArray16);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        int int20 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray16);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray16);
        boolean boolean22 = languageRangeList9.equals((java.lang.Object) strArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = languageRangeList9.subList(234, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Locale.LanguageRange" + "'", str3, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(languageRangeItor11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "english" + "'", str19, "english");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test17786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17786");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliIlish)", 259, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17787");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("UNDAAAAAAA", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17788");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ITALIAHI", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17789");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                                                  US");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 116 + "'", int1 == 116);
    }

    @Test
    public void test17790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17790");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("4444444iai4444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444iai4444444" + "'", str1, "4444444iai4444444");
    }

    @Test
    public void test17791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17791");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList1.listIterator();
        java.util.Locale.LanguageRange languageRange8 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange10 = new java.util.Locale.LanguageRange("English");
        java.lang.String str12 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange10, "");
        java.util.Locale.LanguageRange languageRange14 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] { languageRange8, languageRange10, languageRange14 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        boolean boolean18 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor19 = languageRangeList1.iterator();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray22 = languageRangeList21.toArray();
        boolean boolean23 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap25 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList26 = java.util.Locale.LanguageRange.parse("Cina", strMap25);
        java.util.Locale.LanguageRange languageRange28 = new java.util.Locale.LanguageRange("English");
        java.lang.String str30 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange28, "");
        java.lang.String str31 = languageRange28.getRange();
        boolean boolean32 = languageRangeList26.add(languageRange28);
        double double33 = languageRange28.getWeight();
        boolean boolean34 = languageRangeList1.add(languageRange28);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList36 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray37 = languageRangeList36.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream38 = languageRangeList36.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap42 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList43 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, strMap42);
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        boolean boolean47 = languageRangeList40.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45);
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap51 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList52 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, strMap51);
        java.util.Locale.LanguageRange[] languageRangeArray53 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList54 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList54, languageRangeArray53);
        boolean boolean56 = languageRangeList49.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList54);
        java.lang.String str58 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList54, "hi!");
        boolean boolean59 = languageRangeList40.remove((java.lang.Object) languageRangeList54);
        boolean boolean60 = languageRangeList36.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList54);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream61 = languageRangeList36.parallelStream();
        boolean boolean62 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Locale.LanguageRange" + "'", str12, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeItor19);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(languageRangeList26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Locale.LanguageRange" + "'", str30, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "english" + "'", str31, "english");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(languageRangeList36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(languageRangeStream38);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(languageRangeList43);
        org.junit.Assert.assertNotNull(languageRangeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(languageRangeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(languageRangeList52);
        org.junit.Assert.assertNotNull(languageRangeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(languageRangeStream61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test17792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17792");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("chinois (chine)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "L.AVAJSTRING[]STRING[]STRING[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17793");
        java.util.Locale locale1 = new java.util.Locale("NHC");
        org.junit.Assert.assertEquals(locale1.toString(), "nhc");
    }

    @Test
    public void test17794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17794");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str3 = locale1.getLanguage();
        java.lang.String str4 = locale1.getCountry();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder11 = builder8.setLanguageTag("ANIHC");
        java.util.Locale locale12 = builder8.build();
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("An");
        java.util.Locale.Builder builder15 = builder8.setLocale(locale14);
        java.lang.String str16 = locale1.getDisplayCountry(locale14);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "anihc");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "an");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test17795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17795");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("   ");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("String", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) strArray2, "");
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) str5, "#a");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "String[]" + "'", str5, "String[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "String" + "'", str7, "String");
    }

    @Test
    public void test17796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17796");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("DE       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test17797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17797");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("germn", 32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17798");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setLanguageTag("ANIHC");
        java.util.Locale locale10 = builder6.build();
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale locale13 = builder11.build();
        java.util.Locale locale14 = builder11.build();
        java.lang.String str16 = locale14.getExtension('a');
        java.lang.String str17 = locale10.getDisplayName(locale14);
        java.util.Locale.Builder builder18 = builder1.setLocale(locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder1.addUnicodeLocaleAttribute("italienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalien");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: italienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalien [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "anihc");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "anihc" + "'", str17, "anihc");
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test17799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17799");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny("A#A#A#A#A#", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17800");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                    ", "A");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "zh-nngh");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test17801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17801");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "English");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17802");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split(".....ZHCINESES");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17803");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                  HINDI (HI!,CHINA)", "fr-FRSTI-F");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                  HINDI (HI!,CHINA)" + "'", str2, "                                                                                  HINDI (HI!,CHINA)");
    }

    @Test
    public void test17804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17804");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("English");
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale5.getDisplayCountry(locale6);
        java.lang.String str8 = locale5.toLanguageTag();
        java.lang.String str9 = locale5.getCountry();
        java.lang.String str10 = locale5.getISO3Country();
        java.util.Locale locale12 = new java.util.Locale("");
        java.lang.String str13 = locale12.getDisplayVariant();
        java.lang.String str14 = locale5.getDisplayLanguage(locale12);
        java.lang.String str15 = locale12.getLanguage();
        java.util.Set<java.lang.Character> charSet16 = locale12.getExtensionKeys();
        java.lang.String str17 = locale12.getVariant();
        java.util.Locale.Builder builder18 = builder4.setLocale(locale12);
        java.util.Locale.Builder builder20 = builder18.setScript("");
        java.util.Locale.Builder builder21 = builder20.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder24 = builder21.setUnicodeLocaleKeyword("ncncncncncncncncn", "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5...4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ncncncncncncncncn [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cina" + "'", str7, "Cina");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh-CN" + "'", str8, "zh-CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CN" + "'", str9, "CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CHN" + "'", str10, "CHN");
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chinese" + "'", str14, "Chinese");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test17805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17805");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("nc-hz", 92, "$$$$$$$$$$$$$xxxxxxxxinglese (Canada)xxxxxxxx$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$$$$$$$$$$$$$xxxxxxxxinglese (Canada)xxxxxxnc-hz$$$$$$$$$$$$$xxxxxxxxinglese (Canada)xxxxxxx" + "'", str3, "$$$$$$$$$$$$$xxxxxxxxinglese (Canada)xxxxxxnc-hz$$$$$$$$$$$$$xxxxxxxxinglese (Canada)xxxxxxx");
    }

    @Test
    public void test17806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17806");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("$$$$$$$$$nawiaT( eseengls$$$$$$$$$nawiaT( esE", 248, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17807");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "HINDI(hi!,China)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17808");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5...", "en-ca", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17809");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "      444444444444444444444444444444444      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17810");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("cCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina (CCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina)", "ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayLisTRING[]ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayLisTRING[]ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayLisTRING[]ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayLisTRING[]ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayLisTRING[]ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayLis");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina (CCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina)" + "'", str2, "cCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina (CCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina)");
    }

    @Test
    public void test17811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17811");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("ingleseu", "Germn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ingleseu" + "'", str2, "ingleseu");
    }

    @Test
    public void test17812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17812");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.util.Locale.LanguageRange languageRange3 = new java.util.Locale.LanguageRange("cn");
        boolean boolean4 = languageRangeList1.add(languageRange3);
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.lang.String str11 = locale7.getDisplayScript(locale9);
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale13);
        java.lang.String str15 = locale7.getDisplayCountry(locale13);
        java.lang.String str16 = locale5.getDisplayScript(locale7);
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.lang.String str18 = locale7.getDisplayLanguage(locale17);
        java.util.Locale locale21 = new java.util.Locale("");
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.util.Locale locale23 = java.util.Locale.CANADA;
        java.lang.String str24 = locale23.getDisplayLanguage();
        java.lang.String str25 = locale21.getDisplayScript(locale23);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale21);
        java.lang.String str27 = locale21.getDisplayScript();
        java.lang.String str28 = locale17.getDisplayLanguage(locale21);
        java.util.Set<java.lang.String> strSet29 = locale17.getUnicodeLocaleAttributes();
        boolean boolean30 = languageRangeList1.remove((java.lang.Object) locale17);
        int int31 = languageRangeList1.size();
        java.util.Locale locale33 = new java.util.Locale("WZ.MZ.AZ.TY.EY.SW.FW.UV.NV.IV.GV.EV.CV.AV.ZU.YU.SU.MU.GU.AU.ZT.WT.VT.TT.RT.OT.NT.MT.LT.KT.JT.HT.GT.FT.DT.CT.ZS.YS.XS.VS.TS.SS.RS.OS.NS.MS.LS.KS.JS.IS.HS.GS.ES.DS.CS.BS.AS.WR.UR.SR.OR.ER.AQ.YP.WP.TP.SP.RP.NP.MP.LP.KP.HP.GP.FP.EP.AP.MO.ZN.UN.RN.PN.ON.LN.IN.GN.FN.EN.CN.AN.ZM.YM.XM.WM.VM.UM.TM.SM.RM.QM.PM.OM.NM.MM.LM.KM.HM.GM.FM.EM.DM.CM.AM.YL.VL.UL.TL.SL.RL.KL.IL.CL.BL.AL.ZK.YK.WK.RK.PK.NK.MK.IK.HK.GK.EK.PJ.OJ.MJ.EJ.TI.SI.RI.QI.OI.NI.MI.LI.EI.DI.UH.TH.RH.NH.MH.KH.YG.WG.UG.TG.SG.RG.QG.PG.NG.MG.LG.IG.HG.GG.FG.EG.DG.BG.AG.RF.OF.MF.KF.JF.IF.TE.SE.RE.HE.GE.EE.CE.ZD.OD.MD.KD.JD.ED.ZC.YC.XC.WC.VC.UC.RC.OC.NC.MC.LC.KC.IC.HC.GC.FC.DC.CC.AC.ZB.YB.WB.VB.TB.SB.RB.QB.OB.NB.MB.LB.JB.IB.HB.GB.FB.EB.DB.BB.AB.ZA.XA.WA.UA.TA.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanhcGA.FA.EA.DA");
        java.util.Locale locale35 = java.util.Locale.forLanguageTag("EN-ca");
        java.lang.String str36 = locale35.getISO3Country();
        java.lang.String str37 = locale33.getDisplayCountry(locale35);
        boolean boolean38 = languageRangeList1.contains((java.lang.Object) str37);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "English" + "'", str10, "English");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "english" + "'", str14, "english");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "English" + "'", str24, "English");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "a" + "'", str26, "a");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "German" + "'", str28, "German");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertEquals(locale33.toString(), "wz.mz.az.ty.ey.sw.fw.uv.nv.iv.gv.ev.cv.av.zu.yu.su.mu.gu.au.zt.wt.vt.tt.rt.ot.nt.mt.lt.kt.jt.ht.gt.ft.dt.ct.zs.ys.xs.vs.ts.ss.rs.os.ns.ms.ls.ks.js.is.hs.gs.es.ds.cs.bs.as.wr.ur.sr.or.er.aq.yp.wp.tp.sp.rp.np.mp.lp.kp.hp.gp.fp.ep.ap.mo.zn.un.rn.pn.on.ln.in.gn.fn.en.cn.an.zm.ym.xm.wm.vm.um.tm.sm.rm.qm.pm.om.nm.mm.lm.km.hm.gm.fm.em.dm.cm.am.yl.vl.ul.tl.sl.rl.kl.il.cl.bl.al.zk.yk.wk.rk.pk.nk.mk.ik.hk.gk.ek.pj.oj.mj.ej.ti.si.ri.qi.oi.ni.mi.li.ei.di.uh.th.rh.nh.mh.kh.yg.wg.ug.tg.sg.rg.qg.pg.ng.mg.lg.ig.hg.gg.fg.eg.dg.bg.ag.rf.of.mf.kf.jf.if.te.se.re.he.ge.ee.ce.zd.od.md.kd.jd.ed.zc.yc.xc.wc.vc.uc.rc.oc.nc.mc.lc.kc.ic.hc.gc.fc.dc.cc.ac.zb.yb.wb.vb.tb.sb.rb.qb.ob.nb.mb.lb.jb.ib.hb.gb.fb.eb.db.bb.ab.za.xa.wa.ua.ta.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanhcga.fa.ea.da");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "CAN" + "'", str36, "CAN");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test17813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17813");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("D U ", "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17814");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("BUILDEo", 551);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "BUILDEo" + "'", str2, "BUILDEo");
    }

    @Test
    public void test17815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17815");
        java.util.Locale locale1 = new java.util.Locale("\u82f1\u6587\u7f8e\u56fd)");
        org.junit.Assert.assertEquals(locale1.toString(), "\u82f1\u6587\u7f8e\u56fd)");
    }

    @Test
    public void test17816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17816");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("wt_hz");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale.setDefault(locale1);
        java.lang.Object obj4 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
    }

    @Test
    public void test17817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17817");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("fr-FRSTI-", "italiano (CI_A)", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17818");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("ITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITAL...XXXX");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITAL.." + "'", str1, "ITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITAL..");
    }

    @Test
    public void test17819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17819");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor5 = languageRangeList4.listIterator();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale14);
        java.util.Locale locale16 = java.util.Locale.US;
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale18 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale19.getDisplayCountry(locale20);
        java.lang.String str22 = locale19.toLanguageTag();
        java.util.Locale locale23 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = locale23.getDisplayCountry(locale24);
        java.util.Locale locale26 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale26.getDisplayCountry(locale27);
        java.util.Locale locale32 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = locale33.getDisplayCountry(locale34);
        java.util.Locale locale37 = new java.util.Locale("");
        java.lang.String str38 = locale37.getDisplayVariant();
        java.util.Locale locale39 = java.util.Locale.KOREAN;
        java.util.Locale locale41 = new java.util.Locale("");
        java.util.Locale locale42 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray43 = new java.util.Locale[] { locale14, locale16, locale17, locale18, locale19, locale24, locale26, locale32, locale34, locale37, locale39, locale41, locale42 };
        java.util.ArrayList<java.util.Locale> localeList44 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList44, localeArray43);
        java.util.List<java.util.Locale> localeList46 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList44);
        java.lang.String[] strArray54 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        java.util.List<java.lang.Class<?>> wildcardClassList57 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList55);
        java.util.Locale.FilteringMode filteringMode58 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList55, filteringMode58);
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strList8, filteringMode58);
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap64 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList65 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, strMap64);
        int int66 = languageRangeList62.size();
        boolean boolean67 = languageRangeList4.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62);
        boolean boolean68 = languageRangeList4.isEmpty();
        java.lang.Object[] objArray69 = languageRangeList4.toArray();
        java.lang.String str71 = org.apache.commons.lang3.StringUtils.join(objArray69, 'u');
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeItor5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "english" + "'", str15, "english");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "China" + "'", str21, "China");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "China" + "'", str25, "China");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "China" + "'", str28, "China");
        org.junit.Assert.assertEquals(locale32.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "China" + "'", str35, "China");
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ko");
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(localeList46);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClassList57);
        org.junit.Assert.assertTrue("'" + filteringMode58 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode58.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(languageRangeList65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[]");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test17820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17820");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("a#");
        java.lang.String str2 = locale1.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17821");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("lOCALE.bUILDER[]");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17822");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxxx", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17823");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("\u53f0\u7063$$$$$$$$");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ??$$$$$$$$");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17824");
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.lang.String str6 = locale2.getDisplayScript(locale4);
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.util.Locale locale11 = java.util.Locale.CANADA;
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.lang.String str13 = locale9.getDisplayScript(locale11);
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale15);
        java.lang.String str17 = locale9.getDisplayCountry(locale15);
        java.lang.String str18 = locale7.getDisplayScript(locale9);
        java.lang.String str19 = locale9.getDisplayCountry();
        java.lang.String str20 = locale9.getDisplayLanguage();
        java.util.Locale locale21 = java.util.Locale.PRC;
        java.lang.String str22 = locale9.getDisplayScript(locale21);
        java.lang.String str23 = locale4.getDisplayCountry(locale9);
        java.util.Locale locale26 = new java.util.Locale("CHN", "hi!");
        java.lang.String str27 = locale4.getDisplayCountry(locale26);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.lowerCase("AF", locale26);
        java.lang.String str29 = locale26.getDisplayCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "English" + "'", str5, "English");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English" + "'", str12, "English");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "english" + "'", str16, "english");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Canada" + "'", str23, "Canada");
        org.junit.Assert.assertEquals(locale26.toString(), "chn_HI!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Canada" + "'", str27, "Canada");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "af" + "'", str28, "af");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HI!" + "'", str29, "HI!");
    }

    @Test
    public void test17825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17825");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("locale.builde");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17826");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("CzuC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "czuc" + "'", str1, "czuc");
    }

    @Test
    public void test17827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17827");
        java.util.Locale locale2 = new java.util.Locale("$");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("EnglTWNsTWN", locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for $");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "$");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ENGLTWNSTWN" + "'", str3, "ENGLTWNSTWN");
    }

    @Test
    public void test17828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17828");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("nglish  hindi (hi!,china", "Aiaiaiaiaiaiaiaiaia");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17829");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "ChinChinChinChinChinChinChinChinChinaaaaaaaaa$                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ChinChinChinChinChinChinChinChinChinaaaaaaaaa$                                                    " + "'", str1, "ChinChinChinChinChinChinChinChinChinaaaaaaaaa$                                                    ");
    }

    @Test
    public void test17830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17830");
        java.util.Locale locale3 = new java.util.Locale("                 A                 ", "g", "acoL");
        org.junit.Assert.assertEquals(locale3.toString(), "                 a                 _G_acoL");
    }

    @Test
    public void test17831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17831");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale1 = java.util.Locale.JAPANESE;
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("", locale3);
        java.lang.String str5 = locale1.getDisplayVariant(locale3);
        java.util.Set<java.lang.Character> charSet6 = locale3.getExtensionKeys();
        java.util.Set<java.lang.String> strSet7 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale locale10 = new java.util.Locale("ahi!hi!", "                 a                 ");
        java.lang.String str11 = locale3.getDisplayScript(locale10);
        java.lang.String str12 = locale0.getDisplayName(locale3);
        java.util.Set<java.lang.Character> charSet13 = locale0.getExtensionKeys();
        java.lang.String str14 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals(locale10.toString(), "ahi!hi!_                 A                 ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh" + "'", str14, "zh");
    }

    @Test
    public void test17832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17832");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray5);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class[] classArray14 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray14);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray14);
        boolean boolean18 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, (java.lang.Class<?>[]) classArray14);
        boolean boolean19 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray14);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray14, "\u4e2d\u6587");
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray14, "Chinese(China)");
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test17833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17833");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("ese (Taiwanese (Taiwanese (Taiwanese (Taiwan", "zh-cnenglish (LOCALE.LANGUAGERANGE)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17834");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hI");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("latiarfatilatiarfatilatiarfatilatiar", strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hI" + "'", str4, "hI");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test17835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17835");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        boolean boolean8 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList6, "hi!");
        java.lang.Class[] classArray12 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray13 = (java.lang.Class<?>[]) classArray12;
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray12);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray12);
        java.lang.Class[] classArray18 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray18);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray18);
        boolean boolean22 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray12, (java.lang.Class<?>[]) classArray18);
        java.lang.Class[] classArray24 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray24);
        java.lang.Class<?> wildcardClass27 = null;
        java.lang.Class[] classArray29 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        wildcardClassArray30[0] = wildcardClass27;
        boolean boolean34 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray30, false);
        java.lang.Class[] classArray36 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray36);
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, (java.lang.Class<?>[]) classArray36);
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray12, (java.lang.Class<?>[]) classArray36);
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray36);
        java.lang.Class<?>[] wildcardClassArray42 = languageRangeList6.toArray((java.lang.Class<?>[]) classArray36);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray42);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray43);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray43);
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray43);
        java.lang.String str48 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) str46, "ja");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang" + "'", str48, "java.lang");
    }

    @Test
    public void test17836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17836");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor5 = languageRangeList4.listIterator();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale14);
        java.util.Locale locale16 = java.util.Locale.US;
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale18 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale19.getDisplayCountry(locale20);
        java.lang.String str22 = locale19.toLanguageTag();
        java.util.Locale locale23 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = locale23.getDisplayCountry(locale24);
        java.util.Locale locale26 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale26.getDisplayCountry(locale27);
        java.util.Locale locale32 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = locale33.getDisplayCountry(locale34);
        java.util.Locale locale37 = new java.util.Locale("");
        java.lang.String str38 = locale37.getDisplayVariant();
        java.util.Locale locale39 = java.util.Locale.KOREAN;
        java.util.Locale locale41 = new java.util.Locale("");
        java.util.Locale locale42 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray43 = new java.util.Locale[] { locale14, locale16, locale17, locale18, locale19, locale24, locale26, locale32, locale34, locale37, locale39, locale41, locale42 };
        java.util.ArrayList<java.util.Locale> localeList44 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList44, localeArray43);
        java.util.List<java.util.Locale> localeList46 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList44);
        java.lang.String[] strArray54 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        java.util.List<java.lang.Class<?>> wildcardClassList57 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList55);
        java.util.Locale.FilteringMode filteringMode58 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList55, filteringMode58);
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strList8, filteringMode58);
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap64 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList65 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, strMap64);
        int int66 = languageRangeList62.size();
        boolean boolean67 = languageRangeList4.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap68 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList69 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap68);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor71 = languageRangeList69.listIterator(44);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 44");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeItor5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "english" + "'", str15, "english");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "China" + "'", str21, "China");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "China" + "'", str25, "China");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "China" + "'", str28, "China");
        org.junit.Assert.assertEquals(locale32.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "China" + "'", str35, "China");
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ko");
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(localeList46);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClassList57);
        org.junit.Assert.assertTrue("'" + filteringMode58 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode58.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(languageRangeList65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(languageRangeList69);
    }

    @Test
    public void test17837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17837");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("locale");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17838");
        java.util.Locale locale2 = new java.util.Locale("zh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglish", "Collections.EmptySet");
        org.junit.Assert.assertEquals(locale2.toString(), "zh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglish_COLLECTIONS.EMPTYSET");
    }

    @Test
    public void test17839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17839");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaZH-CNENGLISH", (java.lang.CharSequence) "italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxxx");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17840");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                  hI   Taiwan                  hI   xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                  hI   Taiwan                  hI   xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str1, "                  hI   Taiwan                  hI   xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test17841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17841");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi", "A", (int) (short) -1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '.');
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#', 17, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '$', 41, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi" + "'", str6, "hi");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test17842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17842");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("alc", 17, 990);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17843");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("...", "tring[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test17844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17844");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                 A                ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test17845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17845");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGA   LIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17846");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test17847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17847");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", (int) (byte) -1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("zaachi...zaa", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str6, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str7, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test17848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17848");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("           ZXXXXXXXXXXXXXXXXXXX", "N A", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17849");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\u53f0\u7063$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17850");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("ahi!hi! (                 A                 )");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi!hi! (                 A                 )" + "'", str1, "ahi!hi! (                 A                 )");
    }

    @Test
    public void test17851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17851");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream3 = languageRangeList1.parallelStream();
        languageRangeList1.clear();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator5 = languageRangeList1.spliterator();
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "zho", (int) 'u', (int) (short) 0);
        boolean boolean14 = languageRangeList1.remove((java.lang.Object) "zho");
        java.lang.Class[] classArray16 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray16);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray16);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray16);
        java.lang.Class[] classArray22 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray23 = (java.lang.Class<?>[]) classArray22;
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray22);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray22);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray22);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray26);
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, wildcardClassArray26, true);
        java.lang.Class[] classArray31 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray31);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray31);
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray31);
        java.lang.Class[] classArray37 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray37);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray37);
        java.lang.Class[] classArray43 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray44 = (java.lang.Class<?>[]) classArray43;
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray43);
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray43);
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray37, (java.lang.Class<?>[]) classArray43);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray43);
        boolean boolean49 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray35, (java.lang.Class<?>[]) classArray43);
        boolean boolean51 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, wildcardClassArray35, true);
        boolean boolean52 = languageRangeList1.remove((java.lang.Object) wildcardClassArray20);
        java.lang.Class[] classArray54 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray55 = (java.lang.Class<?>[]) classArray54;
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray54);
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray54);
        java.lang.Class[] classArray60 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray61 = (java.lang.Class<?>[]) classArray60;
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray60);
        java.lang.String str63 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray60);
        boolean boolean64 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray54, (java.lang.Class<?>[]) classArray60);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray60);
        java.lang.Class<?>[] wildcardClassArray66 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray65);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray65);
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray65);
        boolean boolean69 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, wildcardClassArray65);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeStream3);
        org.junit.Assert.assertNotNull(languageRangeSpliterator5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test17852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17852");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "HAR[]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: [LHAR;");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17853");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale3.getDisplayScript(locale5);
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale9);
        java.lang.String str11 = locale3.getDisplayCountry(locale9);
        java.lang.String str12 = locale1.getDisplayScript(locale3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.upperCase("China", locale1);
        java.lang.String str14 = locale1.getISO3Language();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English" + "'", str6, "English");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "english" + "'", str10, "english");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CHINA" + "'", str13, "CHINA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ita" + "'", str14, "ita");
    }

    @Test
    public void test17854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17854");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                 A                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                 a                  " + "'", str1, "                 a                  ");
    }

    @Test
    public void test17855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17855");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                           d                                                            ", "                                                                            tsiAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESEhsilIilgneLAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESEhsilIilgneyarrAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESEhsilIilgneAAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESEhsilIilgnecncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncn");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17856");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("EN_cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "                    java                    ", "\u6587\u5fb7");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test17857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17857");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("eN", 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17858");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ITA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ITA" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ITA");
    }

    @Test
    public void test17859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17859");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("ad.fr_CAzw                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ad.fr_CAzw" + "'", str1, "ad.fr_CAzw");
    }

    @Test
    public void test17860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17860");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray5, ' ');
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray5);
        java.lang.Class[] classArray12 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray13 = (java.lang.Class<?>[]) classArray12;
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray12);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray12);
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray12);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray16);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray16);
        java.lang.Class[] classArray20 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray20);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray20);
        java.lang.Class[] classArray25 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray25);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray25);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray25, "zh-CN");
        boolean boolean31 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray25);
        java.lang.Class[] classArray33 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray33);
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray33);
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray39);
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray39);
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray33, (java.lang.Class<?>[]) classArray39);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray39, true);
        java.lang.Class[] classArray47 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray48 = (java.lang.Class<?>[]) classArray47;
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray47);
        java.lang.Class<?> wildcardClass50 = null;
        java.lang.Class[] classArray52 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray53 = (java.lang.Class<?>[]) classArray52;
        wildcardClassArray53[0] = wildcardClass50;
        boolean boolean57 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray49, wildcardClassArray53, false);
        java.lang.Class[] classArray59 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray60 = (java.lang.Class<?>[]) classArray59;
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray59);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray49, (java.lang.Class<?>[]) classArray59);
        java.lang.Class[] classArray64 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray65 = (java.lang.Class<?>[]) classArray64;
        java.lang.Class<?>[] wildcardClassArray66 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray64);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray64);
        java.lang.Class[] classArray69 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray70 = (java.lang.Class<?>[]) classArray69;
        java.lang.Class<?>[] wildcardClassArray71 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray69);
        java.lang.Class<?>[] wildcardClassArray72 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray69);
        java.lang.String str74 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray69, "zh-CN");
        boolean boolean75 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray67, (java.lang.Class<?>[]) classArray69);
        boolean boolean77 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray49, wildcardClassArray67, false);
        java.lang.Class<?>[] wildcardClassArray78 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray49);
        java.lang.Class<?>[] wildcardClassArray79 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray49);
        boolean boolean80 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray39, wildcardClassArray49);
        java.lang.Class[] classArray82 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray83 = (java.lang.Class<?>[]) classArray82;
        java.lang.Class<?>[] wildcardClassArray84 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray82);
        java.lang.Class<?> wildcardClass85 = null;
        java.lang.Class[] classArray87 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray88 = (java.lang.Class<?>[]) classArray87;
        wildcardClassArray88[0] = wildcardClass85;
        boolean boolean92 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray84, wildcardClassArray88, false);
        java.lang.Class<?>[] wildcardClassArray93 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray84);
        boolean boolean95 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray39, wildcardClassArray93, false);
        boolean boolean96 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray93);
        boolean boolean98 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray16, false);
        java.lang.String str99 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray16);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(classArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(classArray64);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertNotNull(classArray69);
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray78);
        org.junit.Assert.assertNotNull(wildcardClassArray79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(classArray82);
        org.junit.Assert.assertNotNull(wildcardClassArray83);
        org.junit.Assert.assertNotNull(wildcardClassArray84);
        org.junit.Assert.assertNotNull(classArray87);
        org.junit.Assert.assertNotNull(wildcardClassArray88);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "" + "'", str99, "");
    }

    @Test
    public void test17861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17861");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "latiarfati");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: latiarfati");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17862");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                   lang)                                                                                                                                                                                                                                                                                                                                                                                   ", (int) (short) 1, "nch(France)xxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                   lang)                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                   lang)                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test17863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17863");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "INA...............................................................................................", (java.lang.CharSequence) "                                                                                            Itali");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17864");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                               javacinese.cineselang                                                ", 2, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                               javacinese.cineselang                                                " + "'", str3, "                                               javacinese.cineselang                                                ");
    }

    @Test
    public void test17865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17865");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("xxxxxxx", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17866");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ITALIEN", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test17867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17867");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("cnn", "$ (JAVA.LANG)", "Collections.EmptySet");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cnn" + "'", str3, "cnn");
    }

    @Test
    public void test17868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17868");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "\u4e2d\u6587string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string", (java.lang.CharSequence) "                                                          c_hz                                                          ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\u4e2d\u6587string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string" + "'", charSequence2, "\u4e2d\u6587string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string");
    }

    @Test
    public void test17869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17869");
        java.util.Locale locale1 = new java.util.Locale("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (IA,zh,CN)");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale2.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (ia,zh,cn)");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (ia,zh,cn)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17870");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("cinese", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  cinese" + "'", str2, "                  cinese");
    }

    @Test
    public void test17871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17871");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("cnncnncnnlocale.Buildercnncnncnnc", 51, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         cnncnncnnlocale.Buildercnncnncnnc         " + "'", str3, "         cnncnncnnlocale.Buildercnncnncnnc         ");
    }

    @Test
    public void test17872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17872");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = builder3.build();
        java.lang.String str6 = locale5.getCountry();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.upperCase("CHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", locale5);
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder11 = builder9.setLocale(locale10);
        java.util.Locale.Builder builder13 = builder9.setRegion("zh");
        java.util.Locale.Builder builder14 = builder13.clear();
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale.Builder builder17 = builder14.addUnicodeLocaleAttribute("CAN");
        java.util.Locale locale18 = java.util.Locale.CHINESE;
        java.util.Locale locale19 = java.util.Locale.JAPANESE;
        java.util.Locale locale21 = java.util.Locale.TAIWAN;
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.upperCase("", locale21);
        java.lang.String str23 = locale19.getDisplayVariant(locale21);
        java.util.Set<java.lang.Character> charSet24 = locale21.getExtensionKeys();
        java.util.Set<java.lang.String> strSet25 = locale21.getUnicodeLocaleAttributes();
        java.util.Locale locale28 = new java.util.Locale("ahi!hi!", "                 a                 ");
        java.lang.String str29 = locale21.getDisplayScript(locale28);
        java.lang.String str30 = locale18.getDisplayName(locale21);
        java.util.Locale.Builder builder31 = builder14.setLocale(locale18);
        java.util.Locale.Builder builder32 = builder14.clear();
        boolean boolean33 = locale5.equals((java.lang.Object) builder14);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str7, "CHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ja");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charSet24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertEquals(locale28.toString(), "ahi!hi!_                 A                 ");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u4e2d\u6587" + "'", str30, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test17873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17873");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder6.setRegion("ja");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setLanguage("\u7063\u53f0\u6587\u4e2d                                                                                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language:                                                                                                                                         )??( ??                                                                                                                                         [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test17874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17874");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Cina", "AN       a", 1);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi", "A", (int) (short) -1);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny("AI", strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray5, strArray11);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        int int17 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("acol", strArray16);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("GNE", strArray11, strArray16);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, '4', 211, 39);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GNE" + "'", str18, "GNE");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test17875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17875");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean3 = languageRangeList1.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange languageRange5 = languageRangeList1.get(0);
        languageRangeList1.clear();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.parse("cnn");
        boolean boolean9 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, strMap13);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        boolean boolean18 = languageRangeList11.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16);
        languageRangeList11.clear();
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.util.Locale locale24 = java.util.Locale.FRANCE;
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale24);
        java.util.Locale locale26 = java.util.Locale.US;
        java.util.Locale locale27 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale28 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str31 = locale29.getDisplayCountry(locale30);
        java.lang.String str32 = locale29.toLanguageTag();
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = locale33.getDisplayCountry(locale34);
        java.util.Locale locale36 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.lang.String str38 = locale36.getDisplayCountry(locale37);
        java.util.Locale locale42 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale43 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale44 = java.util.Locale.getDefault();
        java.lang.String str45 = locale43.getDisplayCountry(locale44);
        java.util.Locale locale47 = new java.util.Locale("");
        java.lang.String str48 = locale47.getDisplayVariant();
        java.util.Locale locale49 = java.util.Locale.KOREAN;
        java.util.Locale locale51 = new java.util.Locale("");
        java.util.Locale locale52 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray53 = new java.util.Locale[] { locale24, locale26, locale27, locale28, locale29, locale34, locale36, locale42, locale44, locale47, locale49, locale51, locale52 };
        java.util.ArrayList<java.util.Locale> localeList54 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList54, localeArray53);
        java.util.List<java.util.Locale> localeList56 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.util.Locale>) localeList54);
        java.util.List<java.util.Locale> localeList57 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList56);
        java.util.Locale.FilteringMode filteringMode58 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList57, filteringMode58);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList61 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray62 = languageRangeList61.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream63 = languageRangeList61.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray64 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList65 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList65, languageRangeArray64);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap67 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList68 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList65, strMap67);
        java.util.Locale.LanguageRange[] languageRangeArray69 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList70 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList70, languageRangeArray69);
        boolean boolean72 = languageRangeList65.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList70);
        java.util.Locale.LanguageRange[] languageRangeArray73 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList74 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74, languageRangeArray73);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap76 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList77 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, strMap76);
        java.util.Locale.LanguageRange[] languageRangeArray78 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList79 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList79, languageRangeArray78);
        boolean boolean81 = languageRangeList74.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList79);
        java.lang.String str83 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList79, "hi!");
        boolean boolean84 = languageRangeList65.remove((java.lang.Object) languageRangeList79);
        boolean boolean85 = languageRangeList61.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList79);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream86 = languageRangeList61.parallelStream();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream87 = languageRangeList61.stream();
        boolean boolean88 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRange5);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "english" + "'", str25, "english");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "China" + "'", str31, "China");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "zh-CN" + "'", str32, "zh-CN");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "China" + "'", str35, "China");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "China" + "'", str38, "China");
        org.junit.Assert.assertEquals(locale42.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "China" + "'", str45, "China");
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ko");
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(localeList56);
        org.junit.Assert.assertNotNull(localeList57);
        org.junit.Assert.assertTrue("'" + filteringMode58 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode58.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList59);
        org.junit.Assert.assertNotNull(languageRangeList61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(languageRangeStream63);
        org.junit.Assert.assertNotNull(languageRangeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(languageRangeList68);
        org.junit.Assert.assertNotNull(languageRangeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(languageRangeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(languageRangeList77);
        org.junit.Assert.assertNotNull(languageRangeArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(languageRangeStream86);
        org.junit.Assert.assertNotNull(languageRangeStream87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test17876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17876");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, '#');
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList2.listIterator(1);
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleAttributes();
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale10);
        java.lang.String str12 = locale7.getDisplayCountry(locale10);
        java.util.Set<java.lang.String> strSet13 = locale10.getUnicodeLocaleKeys();
        java.lang.String str14 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet13);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.split("Cina", "zho", 10);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray19);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.concatWith("zh-CNnglese", (java.lang.Object[]) strArray19);
        boolean boolean22 = languageRangeList2.contains((java.lang.Object) strArray19);
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap26 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, strMap26);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        boolean boolean31 = languageRangeList24.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap35 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList36 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, strMap35);
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        boolean boolean40 = languageRangeList33.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38);
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList38, "hi!");
        boolean boolean43 = languageRangeList24.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList45 = java.util.Locale.LanguageRange.parse("Chinese");
        boolean boolean46 = languageRangeList38.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45);
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap50 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList51 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, strMap50);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor52 = languageRangeList48.iterator();
        java.util.Locale locale55 = new java.util.Locale("");
        java.lang.String str56 = locale55.getDisplayLanguage();
        java.util.Locale locale57 = java.util.Locale.CANADA;
        java.lang.String str58 = locale57.getDisplayLanguage();
        java.lang.String str59 = locale55.getDisplayScript(locale57);
        java.lang.String str60 = locale57.getDisplayVariant();
        java.lang.String str61 = org.apache.commons.lang3.StringUtils.upperCase("", locale57);
        java.lang.String str62 = locale57.getLanguage();
        boolean boolean63 = languageRangeList48.equals((java.lang.Object) locale57);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList65 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray66 = languageRangeList65.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream67 = languageRangeList65.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray68 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList69 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList69, languageRangeArray68);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap71 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList72 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList69, strMap71);
        java.util.Locale.LanguageRange[] languageRangeArray73 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList74 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74, languageRangeArray73);
        boolean boolean76 = languageRangeList69.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74);
        java.util.Locale.LanguageRange[] languageRangeArray77 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList78 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList78, languageRangeArray77);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap80 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList81 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList78, strMap80);
        java.util.Locale.LanguageRange[] languageRangeArray82 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList83 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList83, languageRangeArray82);
        boolean boolean85 = languageRangeList78.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList83);
        java.lang.String str87 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList83, "hi!");
        boolean boolean88 = languageRangeList69.remove((java.lang.Object) languageRangeList83);
        boolean boolean89 = languageRangeList65.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList83);
        boolean boolean90 = languageRangeList48.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList83);
        boolean boolean91 = languageRangeList38.remove((java.lang.Object) languageRangeList83);
        boolean boolean92 = languageRangeList2.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "english" + "'", str11, "english");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Canada" + "'", str12, "Canada");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cina" + "'", str21, "Cina");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(languageRangeList36);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(languageRangeList45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(languageRangeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(languageRangeList51);
        org.junit.Assert.assertNotNull(languageRangeItor52);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "English" + "'", str58, "English");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "en" + "'", str62, "en");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(languageRangeList65);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(languageRangeStream67);
        org.junit.Assert.assertNotNull(languageRangeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(languageRangeList72);
        org.junit.Assert.assertNotNull(languageRangeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(languageRangeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(languageRangeList81);
        org.junit.Assert.assertNotNull(languageRangeArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test17877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17877");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b)", "", 47, 24);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b)" + "'", str4, "\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b)");
    }

    @Test
    public void test17878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17878");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("cina_NCNCNCNCNCNCGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLICNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLIST", "loca");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cina_NCNCNCNCNCNCGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLICNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLIST" + "'", str2, "cina_NCNCNCNCNCNCGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLICNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLIST");
    }

    @Test
    public void test17879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17879");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                           ", "unduhar[]undu");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17880");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                          zh_C                                                          ", "aaaaaaaaaaaaaaaalocale.languagerange", "glish");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test17881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                                                       ese(Taiwan", ".....................................................................................................................................................................................................................................................................................allemand......................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                       ese(Taiw" + "'", str2, "                                                                                       ese(Taiw");
    }

    @Test
    public void test17882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17882");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray5 = languageRangeList4.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator6 = languageRangeList4.spliterator();
        boolean boolean7 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray10 = languageRangeList9.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream11 = languageRangeList9.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, strMap15);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        boolean boolean20 = languageRangeList13.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap24 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, strMap24);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        boolean boolean29 = languageRangeList22.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList27, "hi!");
        boolean boolean32 = languageRangeList13.remove((java.lang.Object) languageRangeList27);
        boolean boolean33 = languageRangeList9.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27);
        java.util.Locale.LanguageRange languageRange35 = new java.util.Locale.LanguageRange("cn");
        boolean boolean36 = languageRangeList9.add(languageRange35);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream37 = languageRangeList9.stream();
        boolean boolean39 = languageRangeList9.contains((java.lang.Object) "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587          ");
        boolean boolean40 = languageRangeList4.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap44 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList45 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, strMap44);
        java.lang.String[] strArray53 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        java.util.List<java.lang.Class<?>> wildcardClassList56 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList54);
        java.lang.String str57 = java.util.Locale.lookupTag(languageRangeList45, (java.util.Collection<java.lang.String>) strList54);
        java.util.Locale.LanguageRange[] languageRangeArray58 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList59 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59, languageRangeArray58);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap61 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList62 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, strMap61);
        java.util.Locale.LanguageRange[] languageRangeArray63 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList64 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64, languageRangeArray63);
        boolean boolean66 = languageRangeList59.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream67 = languageRangeList64.stream();
        boolean boolean68 = languageRangeList45.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64);
        java.util.Locale.LanguageRange languageRange71 = new java.util.Locale.LanguageRange("English");
        java.lang.String str73 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange71, "");
        languageRangeList64.add((int) (byte) 0, languageRange71);
        double double75 = languageRange71.getWeight();
        boolean boolean76 = languageRangeList9.add(languageRange71);
        boolean boolean78 = languageRange71.equals((java.lang.Object) "java.uHAR[].............................................................................................il");
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(languageRangeSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(languageRangeStream11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(languageRangeStream37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(languageRangeList45);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(wildcardClassList56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(languageRangeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(languageRangeList62);
        org.junit.Assert.assertNotNull(languageRangeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(languageRangeStream67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Locale.LanguageRange" + "'", str73, "Locale.LanguageRange");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 1.0d + "'", double75 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test17883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17883");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.lang.Class<?> wildcardClass3 = locale2.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test17884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17884");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("                                        Englisch (Kanada)                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=englisch(kanada)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17885");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("ja", "CHINOIS (CHINE)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17886");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("chine");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setRegion("hArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayList");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: hArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayList [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test17887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17887");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "enenenenenenenenenen", "ANIHC$      $xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test17888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17888");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayName();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("String[]", locale4);
        java.lang.String str7 = locale0.getDisplayScript(locale4);
        java.util.Locale locale9 = new java.util.Locale("zh_C");
        java.util.Locale.Category category10 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale11 = java.util.Locale.ENGLISH;
        java.util.Locale.setDefault(category10, locale11);
        java.util.Locale locale13 = java.util.Locale.JAPANESE;
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.upperCase("", locale15);
        java.lang.String str17 = locale13.getDisplayVariant(locale15);
        java.util.Locale.setDefault(category10, locale15);
        java.lang.String str19 = locale15.getVariant();
        java.lang.String str20 = locale9.getDisplayScript(locale15);
        java.util.Locale locale23 = new java.util.Locale("italiano", "Ci_a");
        java.util.Locale locale27 = new java.util.Locale("Canada", "allemand", "cHINA");
        java.lang.String str28 = locale23.getDisplayName(locale27);
        java.lang.String str29 = locale23.getLanguage();
        java.lang.String str31 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) locale23, "GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGL");
        java.lang.String str32 = locale15.getDisplayLanguage(locale23);
        java.util.Locale locale34 = java.util.Locale.forLanguageTag("                 a                 ");
        java.lang.String str35 = locale15.getDisplayName(locale34);
        java.lang.String str36 = locale4.getDisplayLanguage(locale34);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese (China)" + "'", str1, "Chinese (China)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "string[]" + "'", str6, "string[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals(locale9.toString(), "zh_c");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category10.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale23.toString(), "italiano_CI_A");
        org.junit.Assert.assertEquals(locale27.toString(), "canada_ALLEMAND_cHINA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "italiano (CI_A)" + "'", str28, "italiano (CI_A)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "italiano" + "'", str29, "italiano");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Locale" + "'", str31, "Locale");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Chinese" + "'", str32, "Chinese");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Chinese (Taiwan)" + "'", str35, "Chinese (Taiwan)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Chinese" + "'", str36, "Chinese");
    }

    @Test
    public void test17889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17889");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray6);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray6);
        java.lang.Class[] classArray12 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray13 = (java.lang.Class<?>[]) classArray12;
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray12);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray12);
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray6, (java.lang.Class<?>[]) classArray12);
        java.lang.Class[] classArray18 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray18);
        java.lang.Class<?> wildcardClass21 = null;
        java.lang.Class[] classArray23 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        wildcardClassArray24[0] = wildcardClass21;
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, wildcardClassArray24, false);
        java.lang.Class[] classArray30 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray31 = (java.lang.Class<?>[]) classArray30;
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray30);
        boolean boolean33 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, (java.lang.Class<?>[]) classArray30);
        boolean boolean34 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray6, (java.lang.Class<?>[]) classArray30);
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray30);
        boolean boolean36 = locale2.equals((java.lang.Object) classArray30);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test17890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17890");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream5 = languageRangeList1.stream();
        boolean boolean6 = languageRangeList1.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor12 = languageRangeList11.listIterator();
        boolean boolean13 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11);
        java.lang.String str15 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) languageRangeList11, "Chinese");
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Chin", "english");
        boolean boolean20 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                    ", strArray19);
        boolean boolean21 = languageRangeList11.equals((java.lang.Object) strArray19);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream22 = languageRangeList11.parallelStream();
        boolean boolean24 = languageRangeList11.remove((java.lang.Object) "A");
        java.lang.Object[] objArray25 = languageRangeList11.toArray();
        int int27 = languageRangeList11.indexOf((java.lang.Object) "ja");
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream28 = languageRangeList11.stream();
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap33 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList34 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, strMap33);
        int int35 = languageRangeList31.size();
        java.util.Locale.LanguageRange languageRange37 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange39 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange41 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray42 = new java.util.Locale.LanguageRange[] { languageRange37, languageRange39, languageRange41 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList43 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43, languageRangeArray42);
        boolean boolean45 = languageRangeList31.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43);
        java.util.Locale locale48 = new java.util.Locale("");
        java.lang.String str49 = locale48.getDisplayLanguage();
        java.util.Locale locale50 = java.util.Locale.CANADA;
        java.lang.String str51 = locale50.getDisplayLanguage();
        java.lang.String str52 = locale48.getDisplayScript(locale50);
        java.lang.String str53 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale48);
        java.lang.String str54 = locale48.getDisplayScript();
        java.util.Set<java.lang.String> strSet55 = locale48.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode56 = null;
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, (java.util.Collection<java.lang.String>) strSet55, filteringMode56);
        java.lang.String str59 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList43, "\u6cd5\u6587");
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream60 = languageRangeList43.stream();
        int int62 = languageRangeList43.indexOf((java.lang.Object) "En");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean63 = languageRangeList11.addAll(33, (java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 33, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.util" + "'", str15, "java.util");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(languageRangeStream22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(languageRangeStream28);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(languageRangeList34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\u82f1\u6587" + "'", str51, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "a" + "'", str53, "a");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(languageRangeStream60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
    }

    @Test
    public void test17891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17891");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip(".][gnirts.", "Ithi!lihi!no");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".][gnirts." + "'", str2, ".][gnirts.");
    }

    @Test
    public void test17892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("ahi!hi", "        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        " + "'", str2, "        ");
    }

    @Test
    public void test17893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17893");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ese(Taiwan$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ese(taiwan$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17894");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("italiano", strMap1);
        boolean boolean3 = languageRangeList2.isEmpty();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap4);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeList5);
    }

    @Test
    public void test17895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17895");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaITHI!LIHI!NO", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17896");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.lang.String[] strArray12 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.List<java.lang.Class<?>> wildcardClassList15 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = java.util.Locale.lookupTag(languageRangeList4, (java.util.Collection<java.lang.String>) strList13);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, strMap20);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        boolean boolean25 = languageRangeList18.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream26 = languageRangeList23.stream();
        boolean boolean27 = languageRangeList4.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap31 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, strMap31);
        int int33 = languageRangeList29.size();
        java.util.Locale.LanguageRange languageRange35 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange37 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange39 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] { languageRange35, languageRange37, languageRange39 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        boolean boolean43 = languageRangeList29.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41);
        java.util.Locale locale46 = new java.util.Locale("");
        java.lang.String str47 = locale46.getDisplayLanguage();
        java.util.Locale locale48 = java.util.Locale.CANADA;
        java.lang.String str49 = locale48.getDisplayLanguage();
        java.lang.String str50 = locale46.getDisplayScript(locale48);
        java.lang.String str51 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale46);
        java.lang.String str52 = locale46.getDisplayScript();
        java.util.Set<java.lang.String> strSet53 = locale46.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode54 = null;
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strSet53, filteringMode54);
        java.lang.String str56 = java.util.Locale.lookupTag(languageRangeList4, (java.util.Collection<java.lang.String>) strSet53);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap57 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList58 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap57);
        java.lang.Class<?> wildcardClass59 = languageRangeList4.getClass();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClassList15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(languageRangeStream26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\u82f1\u6587" + "'", str49, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "a" + "'", str51, "a");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(languageRangeList58);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test17897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17897");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17898");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("                                                                            it-CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it-CN" + "'", str1, "it-CN");
    }

    @Test
    public void test17899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17899");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, "cinese (Taiwan)");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("Cina", strMap6);
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("English");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange9, "");
        java.lang.String str12 = languageRange9.getRange();
        boolean boolean13 = languageRangeList7.add(languageRange9);
        boolean boolean14 = languageRangeList2.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        java.lang.Object obj15 = null;
        int int16 = languageRangeList2.indexOf(obj15);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Locale.LanguageRange" + "'", str11, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "english" + "'", str12, "english");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test17900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17901");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("nglish");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nglish" + "'", str1, "nglish");
    }

    @Test
    public void test17902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17902");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("US");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4', (int) (byte) 0, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "US" + "'", str2, "US");
    }

    @Test
    public void test17903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17903");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                              italiahi                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17904");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test17905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17905");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\u5fb7\u6587\u5fb7\u56fd)", 120);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u5fb7\u6587\u5fb7\u56fd)" + "'", str2, "\u5fb7\u6587\u5fb7\u56fd)");
    }

    @Test
    public void test17906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17906");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] { languageRange7, languageRange9, languageRange11 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        boolean boolean15 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        java.util.Locale locale18 = new java.util.Locale("");
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.util.Locale locale20 = java.util.Locale.CANADA;
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.lang.String str22 = locale18.getDisplayScript(locale20);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale18);
        java.lang.String str24 = locale18.getDisplayScript();
        java.util.Set<java.lang.String> strSet25 = locale18.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode26 = null;
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strSet25, filteringMode26);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList13, "\u6cd5\u6587");
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream30 = languageRangeList13.stream();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean34 = languageRangeList32.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange languageRange36 = languageRangeList32.get(0);
        boolean boolean37 = languageRangeList13.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList39 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean41 = languageRangeList39.remove((java.lang.Object) "English");
        boolean boolean43 = languageRangeList39.remove((java.lang.Object) 1);
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.util.Locale locale48 = java.util.Locale.FRANCE;
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale48);
        java.util.Locale locale50 = java.util.Locale.US;
        java.util.Locale locale51 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale52 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale53 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale54 = java.util.Locale.getDefault();
        java.lang.String str55 = locale53.getDisplayCountry(locale54);
        java.lang.String str56 = locale53.toLanguageTag();
        java.util.Locale locale57 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale58 = java.util.Locale.getDefault();
        java.lang.String str59 = locale57.getDisplayCountry(locale58);
        java.util.Locale locale60 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale61 = java.util.Locale.getDefault();
        java.lang.String str62 = locale60.getDisplayCountry(locale61);
        java.util.Locale locale66 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale67 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale68 = java.util.Locale.getDefault();
        java.lang.String str69 = locale67.getDisplayCountry(locale68);
        java.util.Locale locale71 = new java.util.Locale("");
        java.lang.String str72 = locale71.getDisplayVariant();
        java.util.Locale locale73 = java.util.Locale.KOREAN;
        java.util.Locale locale75 = new java.util.Locale("");
        java.util.Locale locale76 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray77 = new java.util.Locale[] { locale48, locale50, locale51, locale52, locale53, locale58, locale60, locale66, locale68, locale71, locale73, locale75, locale76 };
        java.util.ArrayList<java.util.Locale> localeList78 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList78, localeArray77);
        java.util.List<java.util.Locale> localeList80 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.Locale locale81 = java.util.Locale.lookup(languageRangeList39, (java.util.Collection<java.util.Locale>) localeList78);
        java.lang.String[] strArray86 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray89 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray90 = org.apache.commons.lang3.StringUtils.stripAll(strArray89);
        java.lang.String[] strArray91 = org.apache.commons.lang3.StringUtils.stripAll(strArray90);
        java.lang.String str92 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray86, strArray90);
        int int93 = languageRangeList39.indexOf((java.lang.Object) strArray86);
        boolean boolean95 = languageRangeList39.equals((java.lang.Object) 100L);
        boolean boolean96 = languageRangeList32.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39);
        java.lang.String str98 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList32, 'x');
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream99 = languageRangeList32.parallelStream();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u82f1\u6587" + "'", str21, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "a" + "'", str23, "a");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(languageRangeStream30);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(languageRange36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(languageRangeList39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(languageRangeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "english" + "'", str49, "english");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "China" + "'", str55, "China");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "zh-CN" + "'", str56, "zh-CN");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "China" + "'", str59, "China");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "China" + "'", str62, "China");
        org.junit.Assert.assertEquals(locale66.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "China" + "'", str69, "China");
        org.junit.Assert.assertEquals(locale71.toString(), "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "ko");
        org.junit.Assert.assertEquals(locale75.toString(), "");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(localeList80);
        org.junit.Assert.assertNull(locale81);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str92, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(languageRangeStream99);
    }

    @Test
    public void test17907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17907");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "hi!", (int) (byte) 0);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("China", strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "a", (int) '4', (int) ' ');
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "twn");
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray13);
        java.lang.Class[] classArray16 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray16);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray16);
        java.lang.Class[] classArray22 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray23 = (java.lang.Class<?>[]) classArray22;
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray22);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray22);
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray16, (java.lang.Class<?>[]) classArray22);
        java.lang.Class[] classArray28 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray28);
        java.lang.Class<?> wildcardClass31 = null;
        java.lang.Class[] classArray33 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        wildcardClassArray34[0] = wildcardClass31;
        boolean boolean38 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, wildcardClassArray34, false);
        java.lang.Class[] classArray40 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray41 = (java.lang.Class<?>[]) classArray40;
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray40);
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, (java.lang.Class<?>[]) classArray40);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray16, (java.lang.Class<?>[]) classArray40);
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray16, '#');
        java.lang.Class[] classArray48 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray49 = (java.lang.Class<?>[]) classArray48;
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray48);
        java.lang.Class<?> wildcardClass51 = null;
        java.lang.Class[] classArray53 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray54 = (java.lang.Class<?>[]) classArray53;
        wildcardClassArray54[0] = wildcardClass51;
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray50, wildcardClassArray54, false);
        java.lang.Class[] classArray60 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray61 = (java.lang.Class<?>[]) classArray60;
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray60);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray60);
        java.lang.String str65 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray60, "zh-CN");
        java.lang.String str69 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray60, ' ', 100, 0);
        boolean boolean71 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray54, (java.lang.Class<?>[]) classArray60, false);
        boolean boolean72 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray16, wildcardClassArray54);
        boolean boolean74 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, wildcardClassArray54, false);
        java.lang.Class<?>[] wildcardClassArray75 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray54);
        java.lang.Class[] classArray77 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray78 = (java.lang.Class<?>[]) classArray77;
        java.lang.Class<?>[] wildcardClassArray79 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray77);
        java.lang.Class<?>[] wildcardClassArray80 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray77);
        java.lang.Class[] classArray83 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray84 = (java.lang.Class<?>[]) classArray83;
        java.lang.Class<?>[] wildcardClassArray85 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray83);
        java.lang.String str86 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray83);
        boolean boolean87 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray77, (java.lang.Class<?>[]) classArray83);
        boolean boolean89 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray75, (java.lang.Class<?>[]) classArray83, true);
        boolean boolean90 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray0, wildcardClassArray75);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class java.lang.Stringclass java.lang.Stringclass java.lang.String" + "'", str14, "class java.lang.Stringclass java.lang.Stringclass java.lang.String");
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(classArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertNotNull(classArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray75);
        org.junit.Assert.assertNotNull(classArray77);
        org.junit.Assert.assertNotNull(wildcardClassArray78);
        org.junit.Assert.assertNotNull(wildcardClassArray79);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertNotNull(classArray83);
        org.junit.Assert.assertNotNull(wildcardClassArray84);
        org.junit.Assert.assertNotNull(wildcardClassArray85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test17908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17908");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("n       a                                           ", "aa.ab.ae.af.ak.am.an.ar.as.av.ay.az.ba.be.bg.bh.bi.bm.bn.bo.br.bs.ca.ce.ch.co.cr.cs.cu.cv.cy.da.de.dv.dz.ee.el.en.eo.es.et.eu.fa.ff.fi.fj.fo.fr.fy.ga.gd.gl.gn.gu.gv.ha.he.hi.ho.hr.ht.hu.hy.hz.ia.id.ie.ig.ii.ik.in.io.is.it.iu.iw.ja.ji.jv.ka.kg.ki.kj.kk.kl.km.kn.ko.kr.ks.ku.kv.kw.ky.la.lb.lg.li.ln.lo.lt.lu.lv.mg.mh.mi.mk.ml.mn.mo.mr.ms.mt.my.na.nb.nd.ne.ng.nl.nn.no.nr.nv.ny.oc.oj.om.or.os.pa.pi.pl.ps.pt.qu.rm.rn.ro.ru.rw.sa.sc.sd.se.sg.si.sk.sl.sm.sn.so.sq.sr.ss.st.su.sv.sw.ta.te.tg.th.ti.tk.tl.tn.to.tr.ts.tt.tw.ty.ug.uk.ur.uz.ve.vi.vo.wa.wo.xh.yi.yo.za.zh.zu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n       a                                           " + "'", str2, "n       a                                           ");
    }

    @Test
    public void test17909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17909");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("English                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ENGLISH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str1, "ENGLISH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test17910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17910");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("CHINOIS(CHINE", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                          CHINOIS(CHINE                                           " + "'", str2, "                                          CHINOIS(CHINE                                           ");
    }

    @Test
    public void test17911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17911");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("         cnncnncnnlocale.Buildercnncnncnnc         ", "Locale");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         cnncnncnnlocale.Buildercnncnncnnc         " + "'", str2, "         cnncnncnnlocale.Buildercnncnncnnc         ");
    }

    @Test
    public void test17912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17912");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("fra", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "string[]", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ese(Taiwan$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test17913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17913");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$xxxxxxxxinglese (Canada)xxxxxxxx$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17914");
        java.util.Locale locale4 = new java.util.Locale("       hi!", "LOCALE#LANGUAGERANGE", "\u65e5\u6587");
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale8);
        java.lang.String str10 = locale5.getDisplayCountry(locale8);
        java.lang.String str11 = locale4.getDisplayVariant(locale8);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.upperCase("\u6cd5\u6587", locale8);
        java.lang.String str13 = locale8.getVariant();
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "\u65e5\u6587");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "english" + "'", str9, "english");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Canada" + "'", str10, "Canada");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u65e5\u6587" + "'", str11, "\u65e5\u6587");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u6cd5\u6587" + "'", str12, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test17915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17915");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.lang.String str5 = locale3.getDisplayCountry(locale4);
        java.lang.String str6 = locale3.toLanguageTag();
        boolean boolean7 = locale3.hasExtensions();
        java.lang.String str8 = locale3.getDisplayCountry();
        java.util.Set<java.lang.String> strSet9 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder10 = builder2.setLocale(locale3);
        java.util.Locale locale12 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.lang.String str14 = locale12.getDisplayName();
        java.util.Locale.Builder builder15 = builder10.setLocale(locale12);
        java.lang.String str16 = locale12.getDisplayScript();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chine" + "'", str5, "Chine");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "China" + "'", str8, "China");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test17916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17916");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahI", "                                ese(Taiwan", (int) (byte) 0);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("lOCALE.bUILDER[]", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahI" + "'", str6, "italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahI");
    }

    @Test
    public void test17917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17917");
        java.util.Locale locale3 = new java.util.Locale("zho", "", "en-C...");
        org.junit.Assert.assertEquals(locale3.toString(), "zho__en-C...");
    }

    @Test
    public void test17918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17918");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("I", 530, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuIuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuIuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test17919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17919");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\u82f1\u6587", "                                 Taiwan");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17920");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital.italiahIitaliahIitaliahIitalixxxxxxxitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital.italiahIitaliahIitaliahIitalia", "tRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRIAD.AE.AF", "INA...............................................................................................");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test17921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17921");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("java.lang");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "ZHCINES");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java . lang" + "'", str4, "java . lang");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17922");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Chinese", '$', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinese" + "'", str3, "Chinese");
    }

    @Test
    public void test17923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17923");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean3 = languageRangeList1.remove((java.lang.Object) "English");
        boolean boolean5 = languageRangeList1.remove((java.lang.Object) 1);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale10);
        java.util.Locale locale12 = java.util.Locale.US;
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale15 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.lang.String str17 = locale15.getDisplayCountry(locale16);
        java.lang.String str18 = locale15.toLanguageTag();
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale19.getDisplayCountry(locale20);
        java.util.Locale locale22 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale23 = java.util.Locale.getDefault();
        java.lang.String str24 = locale22.getDisplayCountry(locale23);
        java.util.Locale locale28 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str31 = locale29.getDisplayCountry(locale30);
        java.util.Locale locale33 = new java.util.Locale("");
        java.lang.String str34 = locale33.getDisplayVariant();
        java.util.Locale locale35 = java.util.Locale.KOREAN;
        java.util.Locale locale37 = new java.util.Locale("");
        java.util.Locale locale38 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray39 = new java.util.Locale[] { locale10, locale12, locale13, locale14, locale15, locale20, locale22, locale28, locale30, locale33, locale35, locale37, locale38 };
        java.util.ArrayList<java.util.Locale> localeList40 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList40, localeArray39);
        java.util.List<java.util.Locale> localeList42 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList40);
        java.util.Locale locale43 = java.util.Locale.lookup(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList40);
        boolean boolean44 = languageRangeList1.isEmpty();
        boolean boolean45 = languageRangeList1.isEmpty();
        languageRangeList1.clear();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "english" + "'", str11, "english");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Chine" + "'", str17, "Chine");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh-CN" + "'", str18, "zh-CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Chine" + "'", str21, "Chine");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Chine" + "'", str24, "Chine");
        org.junit.Assert.assertEquals(locale28.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Chine" + "'", str31, "Chine");
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko");
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(localeList42);
        org.junit.Assert.assertNull(locale43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test17924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17924");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("A", "\u82f1\u6587\u52a0\u62ff\u5927)", 20);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("Engls", '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, '4', (int) (short) 0, 1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("fra", strArray6, strArray10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.parse("Cina", strMap17);
        java.lang.String[] strArray22 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.Locale.FilteringMode filteringMode25 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags(languageRangeList18, (java.util.Collection<java.lang.String>) strList23, filteringMode25);
        java.lang.String[] strArray28 = org.apache.commons.lang3.StringUtils.splitByCharacterType("ita");
        boolean boolean29 = languageRangeList18.remove((java.lang.Object) strArray28);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.replaceEach("xxxxxxxxxxFrench (France)xxxxxxxxxx", strArray10, strArray28);
        java.lang.String[] strArray34 = org.apache.commons.lang3.StringUtils.split("cinese (Cina)", "TW", (-1));
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray34);
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray34);
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.replaceEach("AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HENGLISH", strArray28, strArray34);
        java.lang.Class<?> wildcardClass38 = strArray28.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Engls" + "'", str14, "Engls");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fra" + "'", str15, "fra");
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + filteringMode25 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode25.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "xxxxxxxxxxFrench (France)xxxxxxxxxx" + "'", str30, "xxxxxxxxxxFrench (France)xxxxxxxxxx");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "cinese (Cina)" + "'", str35, "cinese (Cina)");
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HENGLISH" + "'", str37, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HENGLISH");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test17925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17925");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        java.util.Locale.Builder builder8 = builder3.clear();
        java.util.Locale locale9 = builder3.build();
        java.util.Locale.Builder builder11 = builder3.setLanguageTag("nawiazh-cnnawia");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder3.setRegion("\u6587\u5fb7");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region:                                                                                                                       ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "china_CN");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test17926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17926");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "          cnn           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "Chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test17927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17927");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.lang.String[] strArray12 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.List<java.lang.Class<?>> wildcardClassList15 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = java.util.Locale.lookupTag(languageRangeList4, (java.util.Collection<java.lang.String>) strList13);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, strMap20);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        boolean boolean25 = languageRangeList18.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream26 = languageRangeList23.stream();
        boolean boolean27 = languageRangeList4.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23);
        java.util.Locale.LanguageRange languageRange29 = new java.util.Locale.LanguageRange("English");
        java.lang.String str30 = languageRange29.getRange();
        boolean boolean31 = languageRangeList4.add(languageRange29);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor33 = languageRangeList4.listIterator(0);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, strMap37);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor39 = languageRangeList35.iterator();
        java.util.Locale locale42 = new java.util.Locale("");
        java.lang.String str43 = locale42.getDisplayLanguage();
        java.util.Locale locale44 = java.util.Locale.CANADA;
        java.lang.String str45 = locale44.getDisplayLanguage();
        java.lang.String str46 = locale42.getDisplayScript(locale44);
        java.lang.String str47 = locale44.getDisplayVariant();
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.upperCase("", locale44);
        java.lang.String str49 = locale44.getLanguage();
        boolean boolean50 = languageRangeList35.equals((java.lang.Object) locale44);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList52 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray53 = languageRangeList52.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream54 = languageRangeList52.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap58 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList59 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, strMap58);
        java.util.Locale.LanguageRange[] languageRangeArray60 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList61 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61, languageRangeArray60);
        boolean boolean63 = languageRangeList56.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61);
        java.util.Locale.LanguageRange[] languageRangeArray64 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList65 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList65, languageRangeArray64);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap67 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList68 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList65, strMap67);
        java.util.Locale.LanguageRange[] languageRangeArray69 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList70 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList70, languageRangeArray69);
        boolean boolean72 = languageRangeList65.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList70);
        java.lang.String str74 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList70, "hi!");
        boolean boolean75 = languageRangeList56.remove((java.lang.Object) languageRangeList70);
        boolean boolean76 = languageRangeList52.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList70);
        boolean boolean77 = languageRangeList35.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList70);
        int int78 = languageRangeList4.indexOf((java.lang.Object) boolean77);
        java.util.Locale.LanguageRange languageRange80 = new java.util.Locale.LanguageRange("English");
        java.lang.String str82 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange80, "");
        double double83 = languageRange80.getWeight();
        boolean boolean84 = languageRangeList4.add(languageRange80);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor85 = languageRangeList4.listIterator();
        boolean boolean86 = languageRangeList4.isEmpty();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClassList15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(languageRangeStream26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "english" + "'", str30, "english");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(languageRangeItor33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertNotNull(languageRangeItor39);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "English" + "'", str45, "English");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "en" + "'", str49, "en");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(languageRangeList52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(languageRangeStream54);
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(languageRangeList59);
        org.junit.Assert.assertNotNull(languageRangeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(languageRangeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(languageRangeList68);
        org.junit.Assert.assertNotNull(languageRangeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Locale.LanguageRange" + "'", str82, "Locale.LanguageRange");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 1.0d + "'", double83 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(languageRangeItor85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test17928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17928");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\u82f1\u6587", "\u53f0\u7063                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u6587" + "'", str2, "\u82f1\u6587");
    }

    @Test
    public void test17929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17929");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("zxxxxxxxxxxxxxxxxxxx", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zxxxxxxxxxxxxxxxxxxx" + "'", str2, "zxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test17930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17930");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Cina", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream10 = languageRangeList6.stream();
        boolean boolean11 = languageRangeList6.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, strMap15);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor17 = languageRangeList16.listIterator();
        boolean boolean18 = languageRangeList6.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16);
        java.lang.String str20 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) languageRangeList16, "Chinese");
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Chin", "english");
        boolean boolean25 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                    ", strArray24);
        boolean boolean26 = languageRangeList16.equals((java.lang.Object) strArray24);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream27 = languageRangeList16.parallelStream();
        boolean boolean28 = languageRangeList2.equals((java.lang.Object) languageRangeStream27);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor29 = languageRangeList2.listIterator();
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor29, "china_CN                             ese(Taiwan");
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(languageRangeItor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.util" + "'", str20, "java.util");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(languageRangeStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(languageRangeItor29);
    }

    @Test
    public void test17931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17931");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "", 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', (int) (byte) 1, (int) (byte) -1);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.parse("it", strMap11);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList12, '#');
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor16 = languageRangeList12.listIterator(1);
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleAttributes();
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale20);
        java.lang.String str22 = locale17.getDisplayCountry(locale20);
        java.util.Set<java.lang.String> strSet23 = locale20.getUnicodeLocaleKeys();
        java.lang.String str24 = java.util.Locale.lookupTag(languageRangeList12, (java.util.Collection<java.lang.String>) strSet23);
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.split("Cina", "zho", 10);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray29);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.concatWith("zh-CNnglese", (java.lang.Object[]) strArray29);
        boolean boolean32 = languageRangeList12.contains((java.lang.Object) strArray29);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("          cnn           ", strArray9, strArray29);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeItor16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "english" + "'", str21, "english");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Canada" + "'", str22, "Canada");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Cina" + "'", str31, "Cina");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "          cnn           " + "'", str33, "          cnn           ");
    }

    @Test
    public void test17932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17932");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("IT-CN");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17933");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\u82f1\u6587\u52a0\u62ff\u5927)", 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17934");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "Cnxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx ", (java.lang.CharSequence) "ese");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "Cnxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx " + "'", charSequence2, "Cnxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx ");
    }

    @Test
    public void test17935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17935");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("A", "\u82f1\u6587\u52a0\u62ff\u5927)", 20);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("Engls", '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, '4', (int) (short) 0, 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("fra", strArray5, strArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny("ANGLAIS (CANADA", strArray5);
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Engls" + "'", str13, "Engls");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fra" + "'", str14, "fra");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
    }

    @Test
    public void test17936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17936");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("builder", 21, 27);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17937");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("ALROLEALROLEALROLEALROLEALROLEALROLEALROLEALROLEALROLEALROLEALROLEALROLEALROLEALROLEALROLEALRO", "LANG");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17938");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("CHINOIS (CHINE)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "       HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHINOIS (CHINE)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "CHINOIS (CHINE)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test17939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17939");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("......44444444EnglTWNsTWN44444444......", "ngls");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "......44444444EnglTWNsTWN44444444......" + "'", str2, "......44444444EnglTWNsTWN44444444......");
    }

    @Test
    public void test17940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17940");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("enghI", "cina_NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLIST");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17941");
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale2.getDisplayCountry(locale3);
        java.lang.String str5 = locale2.toLanguageTag();
        java.lang.String str6 = locale2.getLanguage();
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.util.Locale locale11 = java.util.Locale.CANADA;
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.lang.String str13 = locale9.getDisplayScript(locale11);
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale15);
        java.lang.String str17 = locale9.getDisplayCountry(locale15);
        java.lang.String str18 = locale7.getDisplayScript(locale9);
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.lang.String str20 = locale9.getDisplayLanguage(locale19);
        java.lang.String str21 = locale2.getDisplayCountry(locale9);
        java.util.Locale locale22 = locale2.stripExtensions();
        java.lang.String str23 = locale1.getDisplayName(locale2);
        java.lang.String str24 = locale1.getCountry();
        java.util.Locale locale28 = new java.util.Locale("zho", "US");
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = locale28.getDisplayVariant(locale29);
        java.lang.String str31 = locale29.getVariant();
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.upperCase("AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", locale29);
        java.lang.String str33 = locale29.getDisplayScript();
        java.util.Locale.setDefault(locale29);
        java.lang.String str35 = locale29.getDisplayName();
        java.lang.String str36 = locale29.getDisplayLanguage();
        java.lang.String str37 = locale1.getDisplayCountry(locale29);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.lowerCase("REFERENCEPIPELINE.HEAD                        list###########                                 ", locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chine" + "'", str4, "Chine");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh" + "'", str6, "zh");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English" + "'", str12, "English");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "english" + "'", str16, "english");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "China" + "'", str21, "China");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u6cd5\u6587" + "'", str23, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals(locale28.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW" + "'", str32, "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "fran\347ais (Canada)" + "'", str35, "fran\347ais (Canada)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "fran\347ais" + "'", str36, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "referencepipeline.head                        list###########                                 " + "'", str38, "referencepipeline.head                        list###########                                 ");
    }

    @Test
    public void test17942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17942");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor5 = languageRangeList4.listIterator();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale14);
        java.util.Locale locale16 = java.util.Locale.US;
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale18 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale19.getDisplayCountry(locale20);
        java.lang.String str22 = locale19.toLanguageTag();
        java.util.Locale locale23 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = locale23.getDisplayCountry(locale24);
        java.util.Locale locale26 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale26.getDisplayCountry(locale27);
        java.util.Locale locale32 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = locale33.getDisplayCountry(locale34);
        java.util.Locale locale37 = new java.util.Locale("");
        java.lang.String str38 = locale37.getDisplayVariant();
        java.util.Locale locale39 = java.util.Locale.KOREAN;
        java.util.Locale locale41 = new java.util.Locale("");
        java.util.Locale locale42 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray43 = new java.util.Locale[] { locale14, locale16, locale17, locale18, locale19, locale24, locale26, locale32, locale34, locale37, locale39, locale41, locale42 };
        java.util.ArrayList<java.util.Locale> localeList44 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList44, localeArray43);
        java.util.List<java.util.Locale> localeList46 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList44);
        java.lang.String[] strArray54 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        java.util.List<java.lang.Class<?>> wildcardClassList57 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList55);
        java.util.Locale.FilteringMode filteringMode58 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList55, filteringMode58);
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strList8, filteringMode58);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor61 = languageRangeList4.listIterator();
        java.lang.String str63 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor61, ' ');
        boolean boolean64 = languageRangeItor61.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange65 = languageRangeItor61.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeItor5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "english" + "'", str15, "english");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Chine" + "'", str21, "Chine");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Chine" + "'", str25, "Chine");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Chine" + "'", str28, "Chine");
        org.junit.Assert.assertEquals(locale32.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Chine" + "'", str35, "Chine");
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ko");
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(localeList46);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClassList57);
        org.junit.Assert.assertTrue("'" + filteringMode58 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode58.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(languageRangeItor61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test17943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17943");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S", "iiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayList");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17944");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("slgnE", "                                                                            tsiAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESEhsilIilgneLAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESEhsilIilgneyarrAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESEhsilIilgneAAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESEhsilIilgnecncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncn", "44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17945");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("eselgnNC-hz", 92, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                        eselgnNC-hz                                         " + "'", str3, "                                        eselgnNC-hz                                         ");
    }

    @Test
    public void test17946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17946");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        int int4 = languageRangeList2.lastIndexOf((java.lang.Object) locale3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        boolean boolean13 = languageRangeList6.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, strMap17);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        boolean boolean22 = languageRangeList15.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList20, "hi!");
        boolean boolean25 = languageRangeList6.remove((java.lang.Object) languageRangeList20);
        boolean boolean26 = languageRangeList2.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6);
        java.util.Collection<java.util.Locale> localeCollection27 = null;
        java.util.List<java.util.Locale> localeList28 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, localeCollection27);
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, strMap32);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream34 = languageRangeList30.stream();
        boolean boolean35 = languageRangeList30.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap39 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList40 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, strMap39);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor41 = languageRangeList40.listIterator();
        boolean boolean42 = languageRangeList30.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40);
        java.lang.String str44 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) languageRangeList40, "Chinese");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList40, strMap45);
        boolean boolean47 = languageRangeList6.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40);
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList40, "                  aRRAYlIST.lISTiTR");
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(localeList28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(languageRangeList33);
        org.junit.Assert.assertNotNull(languageRangeStream34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(languageRangeList40);
        org.junit.Assert.assertNotNull(languageRangeItor41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java.util" + "'", str44, "java.util");
        org.junit.Assert.assertNotNull(languageRangeList46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test17947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17947");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("fr-CA", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray10 = languageRangeList9.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator11 = languageRangeList9.spliterator();
        boolean boolean12 = languageRangeList4.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9);
        boolean boolean13 = languageRangeList2.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4);
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.upperCase("", locale15);
        java.util.Locale locale17 = java.util.Locale.FRENCH;
        java.lang.String str18 = locale15.getDisplayVariant(locale17);
        java.lang.String str19 = locale17.getDisplayCountry();
        boolean boolean20 = languageRangeList2.contains((java.lang.Object) locale17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor22 = languageRangeList2.listIterator(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(languageRangeSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test17948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17948");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihind (LOCALE.BUILDER,ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ")hsilgnEh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!iha,REDLIUB.ELACOL( dnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnih" + "'", str1, ")hsilgnEh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!iha,REDLIUB.ELACOL( dnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnihidnih");
    }

    @Test
    public void test17949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17949");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                      java.lang                                     ", 186);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                      java.lang                                                                                                                           " + "'", str2, "                                                      java.lang                                                                                                                           ");
    }

    @Test
    public void test17950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17950");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Cina", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        int int10 = languageRangeList6.size();
        boolean boolean11 = languageRangeList2.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream12 = languageRangeList2.stream();
        java.util.Locale.LanguageRange languageRange14 = new java.util.Locale.LanguageRange("zho");
        double double15 = languageRange14.getWeight();
        boolean boolean16 = languageRangeList2.add(languageRange14);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.parse("it", strMap18);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList19, '#');
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList19, strMap22);
        int int24 = languageRangeList2.indexOf((java.lang.Object) languageRangeList23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap26 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.parse("it", strMap26);
        languageRangeList27.clear();
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, strMap32);
        java.lang.String[] strArray41 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.util.List<java.lang.Class<?>> wildcardClassList44 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList42);
        java.lang.String str45 = java.util.Locale.lookupTag(languageRangeList33, (java.util.Collection<java.lang.String>) strList42);
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap49 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList50 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, strMap49);
        java.util.Locale.LanguageRange[] languageRangeArray51 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList52 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52, languageRangeArray51);
        boolean boolean54 = languageRangeList47.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream55 = languageRangeList52.stream();
        boolean boolean56 = languageRangeList33.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52);
        java.util.Locale.LanguageRange languageRange58 = new java.util.Locale.LanguageRange("English");
        java.lang.String str59 = languageRange58.getRange();
        boolean boolean60 = languageRangeList33.add(languageRange58);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor62 = languageRangeList33.listIterator(0);
        boolean boolean63 = languageRangeList27.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap64 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList65 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList33, strMap64);
        boolean boolean66 = languageRangeList23.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList68 = java.util.Locale.LanguageRange.parse("zh-CN");
        java.lang.String[] strArray72 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("zh-CNnglese", "inglese", 3);
        int int73 = languageRangeList68.lastIndexOf((java.lang.Object) "zh-CNnglese");
        java.lang.String str75 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList68, 'u');
        java.util.List<java.util.Locale.LanguageRange> languageRangeList77 = java.util.Locale.LanguageRange.parse("zh-cnenglh");
        boolean boolean78 = languageRangeList68.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList77);
        boolean boolean79 = languageRangeList23.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList68);
        int int80 = languageRangeList23.size();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(languageRangeStream12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(languageRangeList33);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClassList44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(languageRangeList50);
        org.junit.Assert.assertNotNull(languageRangeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(languageRangeStream55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "english" + "'", str59, "english");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(languageRangeItor62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(languageRangeList65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(languageRangeList68);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(languageRangeList77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 2 + "'", int80 == 2);
    }

    @Test
    public void test17951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17951");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean5 = languageRangeList3.remove((java.lang.Object) "English");
        boolean boolean6 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        java.lang.String[] strArray19 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.List<java.lang.Class<?>> wildcardClassList22 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList20);
        java.lang.String str23 = java.util.Locale.lookupTag(languageRangeList11, (java.util.Collection<java.lang.String>) strList20);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean27 = languageRangeList25.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.Locale locale32 = java.util.Locale.FRANCE;
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale32);
        java.util.Locale locale34 = java.util.Locale.US;
        java.util.Locale locale35 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale36 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale37 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.lang.String str39 = locale37.getDisplayCountry(locale38);
        java.lang.String str40 = locale37.toLanguageTag();
        java.util.Locale locale41 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.lang.String str43 = locale41.getDisplayCountry(locale42);
        java.util.Locale locale44 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale45 = java.util.Locale.getDefault();
        java.lang.String str46 = locale44.getDisplayCountry(locale45);
        java.util.Locale locale50 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale51 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.lang.String str53 = locale51.getDisplayCountry(locale52);
        java.util.Locale locale55 = new java.util.Locale("");
        java.lang.String str56 = locale55.getDisplayVariant();
        java.util.Locale locale57 = java.util.Locale.KOREAN;
        java.util.Locale locale59 = new java.util.Locale("");
        java.util.Locale locale60 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray61 = new java.util.Locale[] { locale32, locale34, locale35, locale36, locale37, locale42, locale44, locale50, locale52, locale55, locale57, locale59, locale60 };
        java.util.ArrayList<java.util.Locale> localeList62 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList62, localeArray61);
        java.util.List<java.util.Locale> localeList64 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.util.Locale>) localeList62);
        java.util.List<java.util.Locale> localeList65 = java.util.Locale.filter(languageRangeList25, (java.util.Collection<java.util.Locale>) localeList62);
        java.util.List<java.util.Locale> localeList66 = java.util.Locale.filter(languageRangeList11, (java.util.Collection<java.util.Locale>) localeList65);
        java.util.Locale locale67 = java.util.Locale.lookup(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor68 = languageRangeList3.iterator();
        java.lang.Object[] objArray69 = languageRangeList3.toArray();
        java.lang.String str71 = org.apache.commons.lang3.StringUtils.join(objArray69, '$');
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClassList22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "english" + "'", str33, "english");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Chine" + "'", str39, "Chine");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "zh-CN" + "'", str40, "zh-CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Chine" + "'", str43, "Chine");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Chine" + "'", str46, "Chine");
        org.junit.Assert.assertEquals(locale50.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Chine" + "'", str53, "Chine");
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "ko");
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(localeList64);
        org.junit.Assert.assertNotNull(localeList65);
        org.junit.Assert.assertNotNull(localeList66);
        org.junit.Assert.assertNull(locale67);
        org.junit.Assert.assertNotNull(languageRangeItor68);
        org.junit.Assert.assertNotNull(objArray69);
    }

    @Test
    public void test17952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17952");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("ahi!hi!hi!GNE");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17953");
        char[] charArray9 = new char[] { '#', '#', ' ' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "CHINA", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("esecnarF", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$xxxxxxxxinglese (Canada)xxxxxxxx$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "xxx", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test17954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17954");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("BUILDER", "AN       A", "zh-ZH", 27);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "BUILDER" + "'", str4, "BUILDER");
    }

    @Test
    public void test17955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17955");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...Anzh_TWAnzh_TWAnz", "\u7fa9\u5927\u5229\u6587", "chinois ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...Anzh_TWAnzh_TWAnz" + "'", str3, "CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...Anzh_TWAnzh_TWAnz");
    }

    @Test
    public void test17956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17956");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Cina", strMap1);
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("English");
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange4, "");
        java.lang.String str7 = languageRange4.getRange();
        boolean boolean8 = languageRangeList2.add(languageRange4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, 'x');
        boolean boolean12 = languageRangeList2.contains((java.lang.Object) "Chine");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap13);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.parse("  China   ");
        boolean boolean17 = languageRangeList2.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, strMap22);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream24 = languageRangeList20.stream();
        boolean boolean25 = languageRangeList20.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap29 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, strMap29);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor31 = languageRangeList30.listIterator();
        boolean boolean32 = languageRangeList20.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Locale locale37 = java.util.Locale.FRANCE;
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale37);
        java.util.Locale locale39 = java.util.Locale.US;
        java.util.Locale locale40 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale41 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale42 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.lang.String str44 = locale42.getDisplayCountry(locale43);
        java.lang.String str45 = locale42.toLanguageTag();
        java.util.Locale locale46 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.lang.String str48 = locale46.getDisplayCountry(locale47);
        java.util.Locale locale49 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.lang.String str51 = locale49.getDisplayCountry(locale50);
        java.util.Locale locale55 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale56 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale57 = java.util.Locale.getDefault();
        java.lang.String str58 = locale56.getDisplayCountry(locale57);
        java.util.Locale locale60 = new java.util.Locale("");
        java.lang.String str61 = locale60.getDisplayVariant();
        java.util.Locale locale62 = java.util.Locale.KOREAN;
        java.util.Locale locale64 = new java.util.Locale("");
        java.util.Locale locale65 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale37, locale39, locale40, locale41, locale42, locale47, locale49, locale55, locale57, locale60, locale62, locale64, locale65 };
        java.util.ArrayList<java.util.Locale> localeList67 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList67, localeArray66);
        java.util.List<java.util.Locale> localeList69 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.util.Locale>) localeList67);
        java.util.Locale.FilteringMode filteringMode70 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList71 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList67, filteringMode70);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean72 = languageRangeList16.addAll((int) ' ', (java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Locale.LanguageRange" + "'", str6, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "english" + "'", str7, "english");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertNotNull(languageRangeStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertNotNull(languageRangeItor31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "english" + "'", str38, "english");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Chine" + "'", str44, "Chine");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "zh-CN" + "'", str45, "zh-CN");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Chine" + "'", str48, "Chine");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Chine" + "'", str51, "Chine");
        org.junit.Assert.assertEquals(locale55.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Chine" + "'", str58, "Chine");
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "ko");
        org.junit.Assert.assertEquals(locale64.toString(), "");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(localeList69);
        org.junit.Assert.assertTrue("'" + filteringMode70 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode70.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList71);
    }

    @Test
    public void test17957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17957");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engl");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engl" + "'", str1, "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engl");
    }

    @Test
    public void test17958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17958");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("ChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test17959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17959");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindi", (int) (byte) 0, 18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HindiHindiHindiHin" + "'", str3, "HindiHindiHindiHin");
    }

    @Test
    public void test17960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17960");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder0.setRegion("AI");
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale5.getLanguage();
        java.lang.String str7 = locale5.getLanguage();
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.util.Locale locale10 = new java.util.Locale("");
        java.lang.String str11 = locale10.getDisplayLanguage();
        java.util.Locale locale12 = java.util.Locale.CANADA;
        java.lang.String str13 = locale12.getDisplayLanguage();
        java.lang.String str14 = locale10.getDisplayScript(locale12);
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale16);
        java.lang.String str18 = locale10.getDisplayCountry(locale16);
        java.lang.String str19 = locale8.getDisplayScript(locale10);
        java.util.Locale.setDefault(locale8);
        java.util.Locale locale24 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale25 = java.util.Locale.ITALIAN;
        java.util.Locale locale27 = new java.util.Locale("");
        java.lang.String str28 = locale27.getDisplayLanguage();
        java.util.Locale locale29 = java.util.Locale.CANADA;
        java.lang.String str30 = locale29.getDisplayLanguage();
        java.lang.String str31 = locale27.getDisplayScript(locale29);
        java.util.Locale locale33 = java.util.Locale.FRANCE;
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale33);
        java.lang.String str35 = locale27.getDisplayCountry(locale33);
        java.lang.String str36 = locale25.getDisplayScript(locale27);
        java.util.Locale.setDefault(locale25);
        java.lang.String str38 = locale24.getDisplayVariant(locale25);
        java.lang.String str39 = locale8.getDisplayLanguage(locale25);
        java.lang.String str40 = locale5.getDisplayLanguage(locale25);
        java.util.Locale locale43 = new java.util.Locale("HArrayList", "englishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglish");
        java.lang.String str44 = locale25.getDisplayScript(locale43);
        java.util.Locale locale46 = java.util.Locale.TAIWAN;
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.upperCase("", locale46);
        java.lang.String str48 = locale25.getDisplayLanguage(locale46);
        java.util.Locale.Builder builder49 = builder0.setLocale(locale25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder51 = builder0.setLanguage("xxxxxxxxxxxxafxxxxxxxxxxxxx");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: xxxxxxxxxxxxafxxxxxxxxxxxxx [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "it" + "'", str6, "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "it" + "'", str7, "it");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "anglais" + "'", str13, "anglais");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "english" + "'", str17, "english");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals(locale24.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it");
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "inglese" + "'", str30, "inglese");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "english" + "'", str34, "english");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "cHINA" + "'", str38, "cHINA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "italiano" + "'", str39, "italiano");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "italiano" + "'", str40, "italiano");
        org.junit.Assert.assertEquals(locale43.toString(), "harraylist_ENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISH");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str48, "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(builder49);
    }

    @Test
    public void test17961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17961");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = new java.util.Locale("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish", "IA", "zh_CN");
        java.util.Locale locale7 = new java.util.Locale("zho", "US");
        java.util.Locale locale8 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.lang.String str10 = locale4.getDisplayName(locale8);
        java.lang.String str11 = locale8.toLanguageTag();
        java.lang.String str12 = locale0.getDisplayName(locale8);
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("Collecti");
        java.lang.String str15 = locale0.getDisplayVariant(locale14);
        java.lang.String str16 = locale14.getDisplayCountry();
        java.lang.String str17 = locale14.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals(locale4.toString(), "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish_IA_zh_CN");
        org.junit.Assert.assertEquals(locale7.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (IA,zh,CN)" + "'", str10, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (IA,zh,CN)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr-CA" + "'", str11, "fr-CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "allemand" + "'", str12, "allemand");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "collecti");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "collecti" + "'", str17, "collecti");
    }

    @Test
    public void test17962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17962");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "ahi!hi! (                 A               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17963");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "china (Cina)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17964");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "twn", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                  hI   Taiwan                  hI                                                                       ", charArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " ud  ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test17965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17965");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuIthi!lihi!no");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17966");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Acol", 83);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17967");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587                                                                                                                                                                          ", "###############################En");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587                                                                                                                                                                          " + "'", str2, "\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587                                                                                                                                                                          ");
    }

    @Test
    public void test17968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17968");
        java.util.Locale locale2 = new java.util.Locale(".");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("ITALIEN", locale2);
        java.util.Set<java.lang.Character> charSet5 = locale2.getExtensionKeys();
        java.lang.String str6 = locale2.getScript();
        org.junit.Assert.assertEquals(locale2.toString(), ".");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italien" + "'", str4, "italien");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test17969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17969");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("e!e(Tiiwin                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                       niwiiT(e!e" + "'", str1, "                                                                                       niwiiT(e!e");
    }

    @Test
    public void test17970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17970");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                 ...inglese (Canada)xxxxxxxx                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17971");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("java.util", "Short");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.uil" + "'", str3, "java.uil");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test17972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17972");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                           CINACI                                            ", "Hindi (HI!,cHINA)", (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17973");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuItali");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test17974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17974");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.lang.String str3 = locale0.toLanguageTag();
        boolean boolean4 = locale0.hasExtensions();
        java.lang.String str5 = locale0.getDisplayCountry();
        java.util.Locale locale6 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.lang.String str8 = locale6.getDisplayCountry(locale7);
        java.lang.String str9 = locale0.getDisplayCountry(locale6);
        java.util.Set<java.lang.String> strSet10 = locale6.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cina" + "'", str2, "Cina");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cina" + "'", str5, "Cina");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cina" + "'", str8, "Cina");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u56fd" + "'", str9, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test17975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17975");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("COLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTI", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHN     ", "                 ITALIAHi                 ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test17976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17976");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] { languageRange7, languageRange9, languageRange11 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        boolean boolean15 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        boolean boolean17 = languageRangeList13.equals((java.lang.Object) "Cina");
        java.util.Locale locale18 = java.util.Locale.ITALY;
        boolean boolean19 = languageRangeList13.equals((java.lang.Object) locale18);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream20 = languageRangeList13.stream();
        boolean boolean21 = languageRangeList13.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap26 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, strMap26);
        int int28 = languageRangeList24.size();
        java.util.Locale.LanguageRange languageRange30 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange32 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange34 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] { languageRange30, languageRange32, languageRange34 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        boolean boolean38 = languageRangeList24.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36);
        java.util.Locale locale41 = new java.util.Locale("");
        java.lang.String str42 = locale41.getDisplayLanguage();
        java.util.Locale locale43 = java.util.Locale.CANADA;
        java.lang.String str44 = locale43.getDisplayLanguage();
        java.lang.String str45 = locale41.getDisplayScript(locale43);
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale41);
        java.lang.String str47 = locale41.getDisplayScript();
        java.util.Set<java.lang.String> strSet48 = locale41.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode49 = null;
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.lang.String>) strSet48, filteringMode49);
        java.lang.String str52 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList36, "\u6cd5\u6587");
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream53 = languageRangeList36.stream();
        boolean boolean54 = languageRangeList36.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = languageRangeList13.addAll(100, (java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(languageRangeStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "inglese" + "'", str44, "inglese");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "a" + "'", str46, "a");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(languageRangeStream53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test17977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17977");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa", 'u');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa" + "'", str3, "AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa");
    }

    @Test
    public void test17978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17978");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "raaaaaaaaaaaaaaaaaaaingleseaaaaaaaaaaaaaaaaaaaaglAs", "LANG      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17979");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("English (United States)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "English (United States)" + "'", str1, "English (United States)");
    }

    @Test
    public void test17980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17980");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587 (HI!,cHINA)", (int) (short) 1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z" + "'", str2, "z");
    }

    @Test
    public void test17981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17981");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)", "REFERENCEPIPELINE.HEAD                        list###########                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)" + "'", str2, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
    }

    @Test
    public void test17982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17982");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ANIHC      ", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
        boolean boolean8 = languageRangeList7.isEmpty();
        boolean boolean9 = languageRangeList2.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator10 = languageRangeList2.spliterator();
        java.lang.Object[] objArray11 = languageRangeList2.toArray();
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, strMap15);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        boolean boolean20 = languageRangeList13.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap24 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, strMap24);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        boolean boolean29 = languageRangeList22.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList27, "hi!");
        boolean boolean32 = languageRangeList13.remove((java.lang.Object) languageRangeList27);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor33 = languageRangeList13.listIterator();
        boolean boolean34 = languageRangeList13.isEmpty();
        java.util.Locale.Builder builder35 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder37 = builder35.setScript("");
        java.util.Locale.Builder builder39 = builder37.setLanguage("HI");
        int int40 = languageRangeList13.indexOf((java.lang.Object) builder39);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap44 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList45 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, strMap44);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream46 = languageRangeList42.stream();
        boolean boolean47 = languageRangeList42.isEmpty();
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList42, '#');
        boolean boolean50 = languageRangeList13.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42);
        boolean boolean51 = languageRangeList42.isEmpty();
        boolean boolean52 = languageRangeList2.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42);
        java.util.Locale locale54 = java.util.Locale.forLanguageTag("ud");
        java.util.Locale locale55 = locale54.stripExtensions();
        boolean boolean56 = languageRangeList42.equals((java.lang.Object) locale55);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange58 = languageRangeList42.remove(186);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 186, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeSpliterator10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(languageRangeItor33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(languageRangeList45);
        org.junit.Assert.assertNotNull(languageRangeStream46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "ud");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ud");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test17983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17983");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("", locale5);
        java.lang.String str7 = locale3.getDisplayVariant(locale5);
        java.util.Locale.setDefault(category0, locale5);
        java.lang.String str9 = locale5.getISO3Country();
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, strMap13);
        int int15 = languageRangeList11.size();
        java.util.Locale.LanguageRange languageRange17 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange19 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange21 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] { languageRange17, languageRange19, languageRange21 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        boolean boolean25 = languageRangeList11.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23);
        boolean boolean27 = languageRangeList23.equals((java.lang.Object) "Cina");
        java.util.Locale locale28 = java.util.Locale.ITALY;
        boolean boolean29 = languageRangeList23.equals((java.lang.Object) locale28);
        java.lang.String str30 = locale5.getDisplayName(locale28);
        java.lang.String str31 = locale28.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "TWN" + "'", str9, "TWN");
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "cinese (Taiwan)" + "'", str30, "cinese (Taiwan)");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "it_IT" + "'", str31, "it_IT");
    }

    @Test
    public void test17984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17984");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "ItaliItaliItaliItaliItaliItaliItaliItaliItali");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 45 + "'", int1 == 45);
    }

    @Test
    public void test17985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17985");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                           AHI!HI!                                                                 ", "ArrsyList", 97);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17986");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("GNAL.AVAJSTRING[]STRING[]STRING[]", "\u6cd5\u6cd5\u6587\u6587ST");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17987");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("H", "         HI!HI!HI!HI!HI!HI         ", 990);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17988");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("chinois", 35, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxxxxxxxxxxxxchinoisxxxxxxxxxxxxxx" + "'", str3, "xxxxxxxxxxxxxxchinoisxxxxxxxxxxxxxx");
    }

    @Test
    public void test17989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17989");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "javacinese.cineselang                            ...", (java.lang.CharSequence) "ortShortShort");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17990");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(charSequence0, (java.lang.CharSequence) "\u30d2\u30f3\u30c7\u30a3\u30fc\u8a9e (HI!,cHINA)");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\u30d2\u30f3\u30c7\u30a3\u30fc\u8a9e (HI!,cHINA)" + "'", charSequence2, "\u30d2\u30f3\u30c7\u30a3\u30fc\u8a9e (HI!,cHINA)");
    }

    @Test
    public void test17991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17991");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("chine", (double) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=52.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17992");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("French (Canada)", "NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLIS", 42);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
    }

    @Test
    public void test17993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17993");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\u4e2d\u6587\u53f0\u7063)", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchnhsiliilgnexxxxxxxxxxxxxxxxxxxxxxxxxhsiliilgnexxxxxxxxxxxxxxxxxxxxxxxxxhsiliilgnexxxxxxxxxxxxxxxxxxxxxxxxxhsiliilgnexxxxxxxxxxxxxxxxxxxxxxxxxhsiliilgnexxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17994");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("inois(chine)", "                                 TW", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17995");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("United State", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17996");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray7);
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray1, (java.lang.Class<?>[]) classArray7);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray7);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray12);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray12);
        java.lang.Class<?>[] wildcardClassArray15 = null;
        boolean boolean17 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray12, wildcardClassArray15, false);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test17997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17997");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("yListayListiiiiiiiiiiiiiiiiiiiiiiiAIIayListiiiiiiiiiiiiiiiiiiiiiiiAIIayListiiiiiiiiiiiiiiiiiiiiiiiAIIayListiiiiiiiiiiiiiiiiiiiiiiiAIIayListiiiiiiiiiiiiiiiiiiiiiiiAIIayListiiiiiiiiiiiiiiiiiiiiiiiAIIayListiiiiiiiiiiiiiiiiiiiiiiiAIIayListiiiiiiiiiiiiiiiiiiiiiiiAIIaiiiiiiiiiiiiiiiiiiiiiiiAI", "d");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17998");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("de");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17999");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("Japaneseuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "ahi!hi! (                 A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test18000");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        int int3 = languageRangeList1.indexOf((java.lang.Object) '4');
        boolean boolean5 = languageRangeList1.contains((java.lang.Object) 8);
        java.lang.Object[] objArray6 = languageRangeList1.toArray();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("Cina", strMap8);
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("English");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange11, "");
        java.lang.String str14 = languageRange11.getRange();
        boolean boolean15 = languageRangeList9.add(languageRange11);
        boolean boolean16 = languageRangeList1.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("  China   ");
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray18);
        int int20 = languageRangeList9.lastIndexOf((java.lang.Object) wildcardClassArray19);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Locale.LanguageRange" + "'", str13, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "english" + "'", str14, "english");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }
}
