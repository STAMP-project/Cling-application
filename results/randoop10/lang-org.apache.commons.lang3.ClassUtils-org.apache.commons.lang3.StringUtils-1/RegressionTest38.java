import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest38 {

    public static boolean debug = false;

    @Test
    public void test19001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19001");
        java.util.Locale locale1 = java.util.Locale.TAIWAN;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("", locale1);
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale7 = builder5.build();
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.lang.String str9 = locale3.getISO3Country();
        java.util.Locale locale13 = new java.util.Locale("hi", "hi!", "cHINA");
        java.lang.String str14 = locale13.getDisplayVariant();
        java.util.Locale locale15 = locale13.stripExtensions();
        java.util.Locale locale16 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale16.getDisplayCountry(locale17);
        java.lang.String str19 = locale16.toLanguageTag();
        java.lang.String str20 = locale16.getLanguage();
        java.util.Locale locale21 = java.util.Locale.ITALIAN;
        java.util.Locale locale23 = new java.util.Locale("");
        java.lang.String str24 = locale23.getDisplayLanguage();
        java.util.Locale locale25 = java.util.Locale.CANADA;
        java.lang.String str26 = locale25.getDisplayLanguage();
        java.lang.String str27 = locale23.getDisplayScript(locale25);
        java.util.Locale locale29 = java.util.Locale.FRANCE;
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale29);
        java.lang.String str31 = locale23.getDisplayCountry(locale29);
        java.lang.String str32 = locale21.getDisplayScript(locale23);
        java.util.Locale locale33 = java.util.Locale.GERMAN;
        java.lang.String str34 = locale23.getDisplayLanguage(locale33);
        java.lang.String str35 = locale16.getDisplayCountry(locale23);
        java.lang.String str36 = locale23.getCountry();
        java.util.Locale locale40 = new java.util.Locale("....english", "zhcinesese", ".");
        java.lang.String str41 = locale23.getDisplayName(locale40);
        java.lang.String str42 = locale13.getDisplayName(locale23);
        java.util.Locale locale43 = java.util.Locale.ITALIAN;
        java.util.Locale locale45 = new java.util.Locale("");
        java.lang.String str46 = locale45.getDisplayLanguage();
        java.util.Locale locale47 = java.util.Locale.CANADA;
        java.lang.String str48 = locale47.getDisplayLanguage();
        java.lang.String str49 = locale45.getDisplayScript(locale47);
        java.util.Locale locale51 = java.util.Locale.FRANCE;
        java.lang.String str52 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale51);
        java.lang.String str53 = locale45.getDisplayCountry(locale51);
        java.lang.String str54 = locale43.getDisplayScript(locale45);
        java.lang.String str55 = locale13.getDisplayName(locale45);
        java.util.Locale locale59 = new java.util.Locale("\u5317\u5370\u5ea6\u6587 (HI!,cHINA)", "undaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaa", "String[]");
        java.lang.String str60 = locale13.getDisplayName(locale59);
        java.lang.String str61 = locale3.getDisplayScript(locale59);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals(locale13.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "cHINA" + "'", str14, "cHINA");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str18, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zh-CN" + "'", str19, "zh-CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zh" + "'", str20, "zh");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it");
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u82f1\u8a9e" + "'", str26, "\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "english" + "'", str30, "english");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "de");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "China" + "'", str35, "China");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals(locale40.toString(), "....english_ZHCINESESE_.");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Hindi (HI!,cHINA)" + "'", str42, "Hindi (HI!,cHINA)");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "it");
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\u82f1\u8a9e" + "'", str48, "\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "english" + "'", str52, "english");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Hindi (HI!,cHINA)" + "'", str55, "Hindi (HI!,cHINA)");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Hindi (HI!,cHINA)" + "'", str60, "Hindi (HI!,cHINA)");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test19002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19002");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\u6cd5\u6cd5\u6587\u6587ST", (java.lang.CharSequence) "eNGLxxxxENGLISHSxxxxENGLISH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test19003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19003");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)" + "'", str1, "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
    }

    @Test
    public void test19004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19004");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587" + "'", str1, "\u4e2d\u6587");
    }

    @Test
    public void test19005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19005");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "ACI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19006");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale locale7 = builder5.build();
        java.util.Locale.Builder builder9 = builder5.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setUnicodeLocaleKeyword("hrrylist", "HindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindi");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: hrrylist [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_CN");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test19007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19007");
        java.util.Locale locale2 = new java.util.Locale("italiano", "Ci_a");
        java.util.Locale locale6 = new java.util.Locale("Canada", "allemand", "cHINA");
        java.lang.String str7 = locale2.getDisplayName(locale6);
        java.util.Set<java.lang.String> strSet8 = locale2.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "italiano_CI_A");
        org.junit.Assert.assertEquals(locale6.toString(), "canada_ALLEMAND_cHINA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "italiano (CI_A)" + "'", str7, "italiano (CI_A)");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test19008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip(".", "Ci_a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
    }

    @Test
    public void test19009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19009");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("anihZHCINESESZHCINESESZHCINESESZHCINESESZHCINESESZHCINESESZHCINESESZHCINESESZHCINESESZHCINESESZHCINESESZHCINESESZHCIN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test19010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19010");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxx", "....................................................................................................Hindi (HI!,cHINA)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19011");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                            EN_CAEN_CA_EN_CAA", "util");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test19012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19012");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("anihc", 746, 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anihc" + "'", str3, "anihc");
    }

    @Test
    public void test19013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19013");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "###############################en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test19014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19014");
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
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale18);
        java.util.Locale locale20 = java.util.Locale.US;
        java.util.Locale locale21 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale22 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale23 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = locale23.getDisplayCountry(locale24);
        java.lang.String str26 = locale23.toLanguageTag();
        java.util.Locale locale27 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale27.getDisplayCountry(locale28);
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = locale30.getDisplayCountry(locale31);
        java.util.Locale locale36 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale37 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.lang.String str39 = locale37.getDisplayCountry(locale38);
        java.util.Locale locale41 = new java.util.Locale("");
        java.lang.String str42 = locale41.getDisplayVariant();
        java.util.Locale locale43 = java.util.Locale.KOREAN;
        java.util.Locale locale45 = new java.util.Locale("");
        java.util.Locale locale46 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray47 = new java.util.Locale[] { locale18, locale20, locale21, locale22, locale23, locale28, locale30, locale36, locale38, locale41, locale43, locale45, locale46 };
        java.util.ArrayList<java.util.Locale> localeList48 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList48, localeArray47);
        java.util.List<java.util.Locale> localeList50 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.util.Locale>) localeList48);
        java.util.Locale.FilteringMode filteringMode51 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList52 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList48, filteringMode51);
        boolean boolean53 = languageRangeList1.isEmpty();
        java.util.Locale locale54 = java.util.Locale.FRANCE;
        java.lang.String str55 = locale54.getVariant();
        java.util.Locale locale57 = new java.util.Locale("");
        java.lang.String str58 = locale57.getDisplayLanguage();
        java.util.Locale locale59 = java.util.Locale.CANADA;
        java.lang.String str60 = locale59.getDisplayLanguage();
        java.lang.String str61 = locale57.getDisplayScript(locale59);
        java.util.Locale locale63 = java.util.Locale.FRANCE;
        java.lang.String str64 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale63);
        java.lang.String str65 = locale57.getDisplayCountry(locale63);
        java.lang.String str66 = locale54.getDisplayScript(locale57);
        java.lang.String str67 = locale54.getDisplayLanguage();
        boolean boolean68 = languageRangeList1.equals((java.lang.Object) locale54);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str70 = locale54.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "english" + "'", str19, "english");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str25, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zh-CN" + "'", str26, "zh-CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str29, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale31);
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str32, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals(locale36.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str39, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "ko");
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(localeList50);
        org.junit.Assert.assertTrue("'" + filteringMode51 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode51.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\u82f1\u8a9e" + "'", str60, "\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "english" + "'", str64, "english");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "\u30d5\u30e9\u30f3\u30b9\u8a9e" + "'", str67, "\u30d5\u30e9\u30f3\u30b9\u8a9e");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test19015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19015");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("slgneslgneslgnefran\347ais (canada)slgneslgneslgnes", "CHNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19016");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.lang.String str3 = locale0.getLanguage();
        java.lang.String str4 = locale0.getVariant();
        java.util.Set<java.lang.String> strSet5 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str2, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh" + "'", str3, "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test19017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19017");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("unduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]undu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "unduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]undu" + "'", str1, "unduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]undu");
    }

    @Test
    public void test19018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19018");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHi", "n       a                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHi" + "'", str2, "..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHi");
    }

    @Test
    public void test19019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19019");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder2.setLanguage("HI");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.addUnicodeLocaleAttribute("ARRAYLIS");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder6.setScript("\u5fb7\u6587\u5fb7\u56fd\u4e2d\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?? (??)?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test19020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19020");
        char[] charArray10 = new char[] {};
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("string[]", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "JAVA.LANG", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "L.AVAJSTRING[]STRING[]STRING[", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "senic", charArray10);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "inglese (Canada)                                                                                       ese(Taiwan                                                                                       ese(Taiwan                                                                                       ese(Taiwan                                           ", charArray10);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "locle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugernge", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test19021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19021");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale locale6 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setLanguageTag("chinois ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: chinois  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "china_CN");
    }

    @Test
    public void test19022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19022");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "cese (fa)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test19023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19023");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("I!STRING[...", "rance)Italiuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "                       anihcxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " !STR NG[..." + "'", str3, " !STR NG[...");
    }

    @Test
    public void test19024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19024");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("        dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd        ", "   CINESE       CINESE       CINESE       CINESE       CINESE       CINESE       CINESE       CGNE", 117);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19025");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("java.util", "A#a#a#a#a#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test19026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19026");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale6 = new java.util.Locale("");
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.lang.String str10 = locale6.getDisplayScript(locale8);
        java.lang.String str11 = locale4.getDisplayName(locale6);
        java.lang.String str12 = locale6.toLanguageTag();
        java.lang.String str13 = locale6.getISO3Country();
        java.util.Set<java.lang.Character> charSet14 = locale6.getExtensionKeys();
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, strMap18);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor20 = languageRangeList19.listIterator();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.util.Locale locale29 = java.util.Locale.FRANCE;
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale29);
        java.util.Locale locale31 = java.util.Locale.US;
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale34 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale35 = java.util.Locale.getDefault();
        java.lang.String str36 = locale34.getDisplayCountry(locale35);
        java.lang.String str37 = locale34.toLanguageTag();
        java.util.Locale locale38 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale38.getDisplayCountry(locale39);
        java.util.Locale locale41 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.lang.String str43 = locale41.getDisplayCountry(locale42);
        java.util.Locale locale47 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale48 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale49 = java.util.Locale.getDefault();
        java.lang.String str50 = locale48.getDisplayCountry(locale49);
        java.util.Locale locale52 = new java.util.Locale("");
        java.lang.String str53 = locale52.getDisplayVariant();
        java.util.Locale locale54 = java.util.Locale.KOREAN;
        java.util.Locale locale56 = new java.util.Locale("");
        java.util.Locale locale57 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray58 = new java.util.Locale[] { locale29, locale31, locale32, locale33, locale34, locale39, locale41, locale47, locale49, locale52, locale54, locale56, locale57 };
        java.util.ArrayList<java.util.Locale> localeList59 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList59, localeArray58);
        java.util.List<java.util.Locale> localeList61 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.util.Locale>) localeList59);
        java.lang.String[] strArray69 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        java.util.List<java.lang.Class<?>> wildcardClassList72 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList70);
        java.util.Locale.FilteringMode filteringMode73 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList70, filteringMode73);
        java.util.List<java.lang.String> strList75 = java.util.Locale.filterTags(languageRangeList19, (java.util.Collection<java.lang.String>) strList23, filteringMode73);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor76 = languageRangeList19.listIterator();
        int int77 = languageRangeList19.size();
        java.lang.String str79 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList19, "Chin");
        java.util.Locale.Builder builder80 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder81 = builder80.clearExtensions();
        java.util.Locale.Builder builder82 = builder80.clearExtensions();
        java.util.Locale.Builder builder83 = builder82.clearExtensions();
        java.util.Locale locale84 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str85 = locale84.getISO3Language();
        java.util.Locale.Builder builder86 = builder83.setLocale(locale84);
        boolean boolean87 = languageRangeList19.contains((java.lang.Object) locale84);
        java.util.Locale.setDefault(locale84);
        java.lang.String str89 = locale6.getDisplayVariant(locale84);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u82f1\u8a9e" + "'", str9, "\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese (China)" + "'", str11, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "und" + "'", str12, "und");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertNotNull(languageRangeItor20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "english" + "'", str30, "english");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale35);
// flaky:         org.junit.Assert.assertEquals(locale35.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str36, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "zh-CN" + "'", str37, "zh-CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str40, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
// flaky:         org.junit.Assert.assertEquals(locale42.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str43, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals(locale47.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale49);
// flaky:         org.junit.Assert.assertEquals(locale49.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str50, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "ko");
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(localeList61);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(wildcardClassList72);
        org.junit.Assert.assertTrue("'" + filteringMode73 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode73.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(languageRangeItor76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "zho" + "'", str85, "zho");
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
    }

    @Test
    public void test19027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19027");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("CN");
        java.util.Locale locale2 = java.util.Locale.CANADA;
        boolean boolean3 = locale2.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale2.getDisplayScript(locale4);
        java.lang.String str6 = locale1.getDisplayCountry(locale2);
        java.lang.String str7 = locale1.getLanguage();
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.util.Locale locale9 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = locale9.getDisplayCountry(locale11);
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = locale13.getVariant();
        java.lang.String str15 = locale9.getDisplayName(locale13);
        java.lang.String str16 = locale8.getDisplayScript(locale9);
        java.lang.String str17 = locale1.getDisplayVariant(locale8);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "cn");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cn" + "'", str7, "cn");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u6587" + "'", str10, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u53f0\u7063" + "'", str12, "\u53f0\u7063");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str15, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test19028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19028");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "cinese");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: cinese");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19029");
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
        boolean boolean21 = languageRangeList15.isEmpty();
        boolean boolean22 = languageRangeList15.isEmpty();
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList15, "zu");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test19030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19030");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.setVariant("");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test19031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19031");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("zh_tw_CHINCHINCHINCHINCHICHINCHINCHINCHINC", "ESE (tAIWAN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19032");
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
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, strMap22);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor24 = languageRangeList20.iterator();
        java.util.Locale locale27 = new java.util.Locale("");
        java.lang.String str28 = locale27.getDisplayLanguage();
        java.util.Locale locale29 = java.util.Locale.CANADA;
        java.lang.String str30 = locale29.getDisplayLanguage();
        java.lang.String str31 = locale27.getDisplayScript(locale29);
        java.lang.String str32 = locale29.getDisplayVariant();
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.upperCase("", locale29);
        java.lang.String str34 = locale29.getLanguage();
        boolean boolean35 = languageRangeList20.equals((java.lang.Object) locale29);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap39 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList40 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, strMap39);
        int int41 = languageRangeList37.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList43 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean45 = languageRangeList43.remove((java.lang.Object) "English");
        boolean boolean46 = languageRangeList37.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43);
        java.util.Locale.LanguageRange languageRange48 = new java.util.Locale.LanguageRange("English");
        java.lang.String str49 = languageRange48.getRange();
        boolean boolean50 = languageRangeList43.add(languageRange48);
        boolean boolean51 = languageRangeList20.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43);
        java.util.Locale.LanguageRange[] languageRangeArray52 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList53 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53, languageRangeArray52);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap55 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList56 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, strMap55);
        java.lang.String[] strArray64 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        java.util.List<java.lang.Class<?>> wildcardClassList67 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList65);
        java.lang.String str68 = java.util.Locale.lookupTag(languageRangeList56, (java.util.Collection<java.lang.String>) strList65);
        java.util.Locale.LanguageRange[] languageRangeArray69 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList70 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList70, languageRangeArray69);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap72 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList73 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList70, strMap72);
        java.util.Locale.LanguageRange[] languageRangeArray74 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList75 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList75, languageRangeArray74);
        boolean boolean77 = languageRangeList70.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList75);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream78 = languageRangeList75.stream();
        boolean boolean79 = languageRangeList56.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList75);
        java.util.Locale.LanguageRange languageRange82 = new java.util.Locale.LanguageRange("English");
        java.lang.String str84 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange82, "");
        languageRangeList75.add((int) (byte) 0, languageRange82);
        double double86 = languageRange82.getWeight();
        boolean boolean87 = languageRangeList20.add(languageRange82);
        boolean boolean88 = languageRangeList1.add(languageRange82);
        java.lang.String str90 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) languageRange82, "frazh-CNenglis");
        java.lang.String str91 = languageRange82.getRange();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Locale.LanguageRange" + "'", str12, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertNotNull(languageRangeItor24);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u82f1\u6587" + "'", str30, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "en" + "'", str34, "en");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(languageRangeList40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(languageRangeList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "english" + "'", str49, "english");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(languageRangeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(languageRangeList56);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClassList67);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(languageRangeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(languageRangeList73);
        org.junit.Assert.assertNotNull(languageRangeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(languageRangeStream78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Locale.LanguageRange" + "'", str84, "Locale.LanguageRange");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 1.0d + "'", double86 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Locale.LanguageRange" + "'", str90, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "english" + "'", str91, "english");
    }

    @Test
    public void test19033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19033");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "GNAL.AVAJSTRING[]STRING[]STRING[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19034");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("undundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundund", "ese (Taiwan$$$$$$$$$slgneese (Taiwan$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "undundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundund" + "'", str2, "undundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundund");
    }

    @Test
    public void test19035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19035");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\u5fb7\u6587\u5fb7\u56fd\u4e2d\u56fd\u5fb7\u6587\u5fb7\u56fd\u4e2d\u56fd\u5fb7\u6587\u5fb7\u56fd\u4e2d\u56fd\u5fb7\u6587\u5fb7\u56fd\u4e2d\u56fd\u5fb7\u6587\u5fb7\u56fd\u4e2d\u56fd\u5fb7\u6587\u5fb7\u56fd\u4e2d\u56fd\u5fb7\u6587\u5fb7\u56fd\u4e2d\u56fd\u5fb7\u6587\u5fb7\u56fd\u4e2d\u56fd\u5fb7\u6587\u5fb7\u56fd\u4e2d\u56fd\u5fb7\u6587\u5fb7\u56fd\u4e2d\u56fd", "ANIHCANIHC", 990);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19036");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("ese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwan", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish_IA_zh_CN");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test19037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19037");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               " + "'", str2, "                               ");
    }

    @Test
    public void test19038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19038");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CTWzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19039");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("BUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEoBUILDEo", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19040");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ananananananananananaCINAanananananananananana", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ananananananananananacinaanananananananananana");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19041");
        java.util.Locale.Category category1 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        java.util.Locale.setDefault(category1, locale2);
        java.util.Locale locale4 = java.util.Locale.JAPANESE;
        java.util.Locale locale6 = java.util.Locale.TAIWAN;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.upperCase("", locale6);
        java.lang.String str8 = locale4.getDisplayVariant(locale6);
        java.util.Locale.setDefault(category1, locale6);
        java.util.Locale locale10 = java.util.Locale.getDefault(category1);
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder13 = builder11.clearExtensions();
        java.util.Locale.Builder builder15 = builder11.removeUnicodeLocaleAttribute("English");
        java.util.Locale locale16 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale16.getDisplayCountry(locale17);
        java.lang.String str19 = locale16.toLanguageTag();
        java.lang.String str20 = locale16.getCountry();
        java.lang.String str21 = locale16.getISO3Country();
        java.util.Locale locale23 = new java.util.Locale("");
        java.lang.String str24 = locale23.getDisplayVariant();
        java.lang.String str25 = locale16.getDisplayLanguage(locale23);
        java.lang.String str26 = locale23.getLanguage();
        java.util.Set<java.lang.Character> charSet27 = locale23.getExtensionKeys();
        java.lang.String str28 = locale23.getVariant();
        java.util.Locale.Builder builder29 = builder15.setLocale(locale23);
        java.lang.String str31 = locale23.getExtension('x');
        java.util.Locale locale32 = java.util.Locale.CANADA;
        boolean boolean33 = locale32.hasExtensions();
        java.util.Locale locale34 = java.util.Locale.ITALIAN;
        java.lang.String str35 = locale32.getDisplayScript(locale34);
        java.lang.String str37 = locale32.getExtension('a');
        boolean boolean38 = locale32.hasExtensions();
        java.util.Locale locale39 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.String> strSet40 = locale39.getUnicodeLocaleAttributes();
        java.lang.String str41 = locale39.getISO3Country();
        java.lang.String str42 = locale32.getDisplayCountry(locale39);
        java.lang.String str43 = locale23.getDisplayName(locale39);
        java.util.Locale.setDefault(category1, locale39);
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.upperCase("ad.fr_CAzw                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", locale39);
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category1.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u570b" + "'", str18, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zh-CN" + "'", str19, "zh-CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CN" + "'", str20, "CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CHN" + "'", str21, "CHN");
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Chinese" + "'", str25, "Chinese");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charSet27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "it");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it");
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Canada" + "'", str42, "Canada");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "AD.FR_CAZW                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str45, "AD.FR_CAZW                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test19042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19042");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull(".....ZHCINESESEn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".....ZHCINESESEn" + "'", str1, ".....ZHCINESESEn");
    }

    @Test
    public void test19043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19043");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("acoL", '4');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("ZHCINESESuEn", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test19044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19044");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean3 = languageRangeList1.remove((java.lang.Object) "English");
        int int4 = languageRangeList1.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor5 = languageRangeList1.listIterator();
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange languageRange10 = new java.util.Locale.LanguageRange("English");
        java.lang.String str12 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange10, "");
        java.util.Locale.LanguageRange languageRange14 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange16 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] { languageRange10, languageRange14, languageRange16 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor20 = languageRangeList18.listIterator();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream21 = languageRangeList18.parallelStream();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.parse("hi");
        int int25 = languageRangeList23.indexOf((java.lang.Object) '4');
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Locale locale30 = java.util.Locale.FRANCE;
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale30);
        java.util.Locale locale32 = java.util.Locale.US;
        java.util.Locale locale33 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale34 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale35 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = locale35.getDisplayCountry(locale36);
        java.lang.String str38 = locale35.toLanguageTag();
        java.util.Locale locale39 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.lang.String str41 = locale39.getDisplayCountry(locale40);
        java.util.Locale locale42 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.lang.String str44 = locale42.getDisplayCountry(locale43);
        java.util.Locale locale48 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale49 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.lang.String str51 = locale49.getDisplayCountry(locale50);
        java.util.Locale locale53 = new java.util.Locale("");
        java.lang.String str54 = locale53.getDisplayVariant();
        java.util.Locale locale55 = java.util.Locale.KOREAN;
        java.util.Locale locale57 = new java.util.Locale("");
        java.util.Locale locale58 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray59 = new java.util.Locale[] { locale30, locale32, locale33, locale34, locale35, locale40, locale42, locale48, locale50, locale53, locale55, locale57, locale58 };
        java.util.ArrayList<java.util.Locale> localeList60 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList60, localeArray59);
        java.util.List<java.util.Locale> localeList62 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.util.Locale>) localeList60);
        java.util.List<java.util.Locale> localeList63 = java.util.Locale.filter(languageRangeList23, (java.util.Collection<java.util.Locale>) localeList62);
        java.util.Locale.FilteringMode filteringMode64 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList65 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList63, filteringMode64);
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet8, filteringMode64);
        java.util.Locale.Builder builder67 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder68 = builder67.clearExtensions();
        java.util.Locale.Builder builder69 = builder67.clearExtensions();
        java.util.Locale.Builder builder70 = builder69.clearExtensions();
        java.util.Locale locale71 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str72 = locale71.getISO3Language();
        java.util.Locale.Builder builder73 = builder70.setLocale(locale71);
        java.util.Locale.Builder builder75 = builder73.setRegion("ja");
        java.util.Locale.Builder builder76 = builder75.clearExtensions();
        boolean boolean77 = languageRangeList1.remove((java.lang.Object) builder76);
        int int79 = languageRangeList1.lastIndexOf((java.lang.Object) "FranceseFranceseFranceseFranceseFrancslgne");
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(languageRangeItor5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "inglese" + "'", str7, "inglese");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Locale.LanguageRange" + "'", str12, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(languageRangeItor20);
        org.junit.Assert.assertNotNull(languageRangeStream21);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "english" + "'", str31, "english");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u570b" + "'", str37, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "zh-CN" + "'", str38, "zh-CN");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u4e2d\u570b" + "'", str41, "\u4e2d\u570b");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\u4e2d\u570b" + "'", str44, "\u4e2d\u570b");
        org.junit.Assert.assertEquals(locale48.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\u4e2d\u570b" + "'", str51, "\u4e2d\u570b");
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ko");
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(localeList62);
        org.junit.Assert.assertNotNull(localeList63);
        org.junit.Assert.assertTrue("'" + filteringMode64 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode64.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList65);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "zho" + "'", str72, "zho");
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
    }

    @Test
    public void test19045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19045");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("  China   ", "en-CA");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "ZW", 11, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test19046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19046");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("                                                          c_hz                                                          ");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test19047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19047");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "...................................................................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19048");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("arraylist##########", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arraylist##########                        " + "'", str2, "arraylist##########                        ");
    }

    @Test
    public void test19049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19049");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\u53f0\u7063", "\uc601\uc5b4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19050");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#################################################################################################");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("LOCLE.LNGUGERNGE", "Chinese (China)", 6);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940 (Canada)", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test19051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19051");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray1, (java.lang.Class<?>[]) classArray8, true);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class[] classArray14 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray14);
        java.lang.Class<?> wildcardClass17 = null;
        java.lang.Class[] classArray19 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        wildcardClassArray20[0] = wildcardClass17;
        boolean boolean24 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray20, false);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray16);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray25);
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
        java.lang.Class[] classArray45 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray46 = (java.lang.Class<?>[]) classArray45;
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray45);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray45);
        java.lang.Class[] classArray50 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray51 = (java.lang.Class<?>[]) classArray50;
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray50);
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray50);
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray50, "zh-CN");
        boolean boolean56 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray48, (java.lang.Class<?>[]) classArray50);
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, wildcardClassArray48, false);
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray48, true);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray26);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray61);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray61);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
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
        org.junit.Assert.assertNotNull(classArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(classArray50);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
    }

    @Test
    public void test19052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19052");
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
        languageRangeList1.clear();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray24 = languageRangeList23.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream25 = languageRangeList23.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap29 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, strMap29);
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        boolean boolean34 = languageRangeList27.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32);
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap38 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList39 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, strMap38);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        boolean boolean43 = languageRangeList36.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41);
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList41, "hi!");
        boolean boolean46 = languageRangeList27.remove((java.lang.Object) languageRangeList41);
        boolean boolean47 = languageRangeList23.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41);
        java.util.Locale.LanguageRange languageRange49 = new java.util.Locale.LanguageRange("cn");
        boolean boolean50 = languageRangeList23.add(languageRange49);
        java.lang.String str51 = languageRange49.getRange();
        boolean boolean52 = languageRangeList1.add(languageRange49);
        languageRangeList1.clear();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList55 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean57 = languageRangeList55.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange languageRange59 = languageRangeList55.get(0);
        java.lang.String str60 = languageRange59.getRange();
        double double61 = languageRange59.getWeight();
        boolean boolean62 = languageRangeList1.add(languageRange59);
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
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(languageRangeStream25);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(languageRangeList39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "cn" + "'", str51, "cn");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(languageRangeList55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(languageRange59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi" + "'", str60, "hi");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 1.0d + "'", double61 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test19053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19053");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray7);
        boolean boolean10 = languageRangeList1.equals((java.lang.Object) wildcardClassArray9);
        boolean boolean11 = languageRangeList1.isEmpty();
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        char[][] charArray16 = new char[][] { charArray12, charArray13, charArray14, charArray15 };
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        char[][] charArray21 = new char[][] { charArray17, charArray18, charArray19, charArray20 };
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        char[][] charArray26 = new char[][] { charArray22, charArray23, charArray24, charArray25 };
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        char[][] charArray31 = new char[][] { charArray27, charArray28, charArray29, charArray30 };
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        char[][] charArray36 = new char[][] { charArray32, charArray33, charArray34, charArray35 };
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        char[][] charArray41 = new char[][] { charArray37, charArray38, charArray39, charArray40 };
        char[][][] charArray42 = new char[][][] { charArray16, charArray21, charArray26, charArray31, charArray36, charArray41 };
        char[][][] charArray43 = languageRangeList1.toArray(charArray42);
        int int44 = languageRangeList1.size();
        java.util.Locale.LanguageRange languageRange46 = new java.util.Locale.LanguageRange("CA");
        int int47 = languageRangeList1.indexOf((java.lang.Object) languageRange46);
        java.lang.String str48 = languageRange46.getRange();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[]");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[]");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[]");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[]");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[]");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[]");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[]");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ca" + "'", str48, "ca");
    }

    @Test
    public void test19054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19054");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("l");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "l" + "'", str1, "l");
    }

    @Test
    public void test19055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19055");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("aragonese", "                                REDLIUB", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19056");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor5 = languageRangeList1.iterator();
        java.util.Locale locale8 = new java.util.Locale("");
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = locale10.getDisplayLanguage();
        java.lang.String str12 = locale8.getDisplayScript(locale10);
        java.lang.String str13 = locale10.getDisplayVariant();
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("", locale10);
        java.lang.String str15 = locale10.getLanguage();
        boolean boolean16 = languageRangeList1.equals((java.lang.Object) locale10);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray19 = languageRangeList18.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream20 = languageRangeList18.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap24 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, strMap24);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        boolean boolean29 = languageRangeList22.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap33 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList34 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, strMap33);
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        boolean boolean38 = languageRangeList31.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36);
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList36, "hi!");
        boolean boolean41 = languageRangeList22.remove((java.lang.Object) languageRangeList36);
        boolean boolean42 = languageRangeList18.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36);
        boolean boolean43 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor44 = languageRangeList1.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            languageRangeItor44.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeItor5);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "inglese" + "'", str11, "inglese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en" + "'", str15, "en");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(languageRangeStream20);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(languageRangeList34);
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(languageRangeItor44);
    }

    @Test
    public void test19057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19057");
        java.util.Locale locale1 = new java.util.Locale("HI!STRING[]STRING[]S");
        java.util.Locale locale3 = new java.util.Locale("e!e(Tiiwin");
        java.util.Locale locale7 = new java.util.Locale("       HI!", "ChinChinChinChinChinChinChinChinChinaaaaaaaaa#", "\u82f1\u8a9e...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx");
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder8.setScript("");
        java.util.Locale locale11 = builder8.build();
        java.lang.String str12 = locale11.getScript();
        java.lang.String str13 = locale11.getCountry();
        java.lang.String str14 = locale7.getDisplayCountry(locale11);
        java.lang.String str15 = locale3.getDisplayLanguage(locale11);
        java.util.Set<java.lang.String> strSet16 = locale11.getUnicodeLocaleAttributes();
        boolean boolean17 = locale11.hasExtensions();
        boolean boolean18 = locale1.equals((java.lang.Object) boolean17);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!string[]string[]s");
        org.junit.Assert.assertEquals(locale3.toString(), "e!e(tiiwin");
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "\u82f1\u8a9e...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CHINCHINCHINCHINCHINCHINCHINCHINCHINAAAAAAAAA#" + "'", str14, "CHINCHINCHINCHINCHINCHINCHINCHINCHINAAAAAAAAA#");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "e!e(tiiwin" + "'", str15, "e!e(tiiwin");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test19058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19058");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587" + "'", str1, "\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587");
    }

    @Test
    public void test19059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19059");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test19060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19060");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("...inglese (Canada)xxxxxxxx", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test19061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19061");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "deu########################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19062");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("$English (Canada)(JAVA.LANG)", "       hi!italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxx");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19063");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Engls", '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', (int) (short) 0, 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Engls" + "'", str6, "Engls");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Engls" + "'", str7, "Engls");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test19064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19064");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\u4e2d\u56fdAD.AE.AFxxxxxxxxxxxxxxxxxxxxxxxxx", '$', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fdAD.AE.AFxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str3, "\u4e2d\u56fdAD.AE.AFxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test19065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19065");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                              cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19066");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "CINA");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19067");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream5 = languageRangeList1.stream();
        boolean boolean6 = languageRangeList1.isEmpty();
        languageRangeList1.clear();
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("it");
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("ESE (tAIWAN", strArray10);
        boolean boolean12 = languageRangeList1.contains((java.lang.Object) strArray10);
        java.lang.Object[] objArray13 = languageRangeList1.toArray();
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, strMap17);
        int int19 = languageRangeList15.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor20 = languageRangeList15.listIterator();
        java.util.Locale.LanguageRange languageRange22 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange24 = new java.util.Locale.LanguageRange("English");
        java.lang.String str26 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange24, "");
        java.util.Locale.LanguageRange languageRange28 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] { languageRange22, languageRange24, languageRange28 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        boolean boolean32 = languageRangeList15.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor33 = languageRangeList30.listIterator();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap35 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList36 = java.util.Locale.LanguageRange.parse("Cina", strMap35);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList36, strMap37);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList40 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean42 = languageRangeList40.remove((java.lang.Object) "English");
        boolean boolean44 = languageRangeList40.remove((java.lang.Object) 1);
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.util.Locale locale49 = java.util.Locale.FRANCE;
        java.lang.String str50 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale49);
        java.util.Locale locale51 = java.util.Locale.US;
        java.util.Locale locale52 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale53 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale54 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale55 = java.util.Locale.getDefault();
        java.lang.String str56 = locale54.getDisplayCountry(locale55);
        java.lang.String str57 = locale54.toLanguageTag();
        java.util.Locale locale58 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale59 = java.util.Locale.getDefault();
        java.lang.String str60 = locale58.getDisplayCountry(locale59);
        java.util.Locale locale61 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale62 = java.util.Locale.getDefault();
        java.lang.String str63 = locale61.getDisplayCountry(locale62);
        java.util.Locale locale67 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale68 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale69 = java.util.Locale.getDefault();
        java.lang.String str70 = locale68.getDisplayCountry(locale69);
        java.util.Locale locale72 = new java.util.Locale("");
        java.lang.String str73 = locale72.getDisplayVariant();
        java.util.Locale locale74 = java.util.Locale.KOREAN;
        java.util.Locale locale76 = new java.util.Locale("");
        java.util.Locale locale77 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray78 = new java.util.Locale[] { locale49, locale51, locale52, locale53, locale54, locale59, locale61, locale67, locale69, locale72, locale74, locale76, locale77 };
        java.util.ArrayList<java.util.Locale> localeList79 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList79, localeArray78);
        java.util.List<java.util.Locale> localeList81 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.util.Locale>) localeList79);
        java.util.Locale locale82 = java.util.Locale.lookup(languageRangeList40, (java.util.Collection<java.util.Locale>) localeList79);
        java.util.List<java.util.Locale> localeList83 = java.util.Locale.filter(languageRangeList38, (java.util.Collection<java.util.Locale>) localeList79);
        java.util.List<java.util.Locale> localeList84 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.util.Locale>) localeList83);
        java.util.List<java.util.Locale> localeList85 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList84);
        boolean boolean86 = languageRangeList1.isEmpty();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Locale.LanguageRange" + "'", str26, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(languageRangeItor33);
        org.junit.Assert.assertNotNull(languageRangeList36);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertNotNull(languageRangeList40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "english" + "'", str50, "english");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\u4e2d\u570b" + "'", str56, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "zh-CN" + "'", str57, "zh-CN");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\u4e2d\u570b" + "'", str60, "\u4e2d\u570b");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\u4e2d\u570b" + "'", str63, "\u4e2d\u570b");
        org.junit.Assert.assertEquals(locale67.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "\u4e2d\u570b" + "'", str70, "\u4e2d\u570b");
        org.junit.Assert.assertEquals(locale72.toString(), "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "ko");
        org.junit.Assert.assertEquals(locale76.toString(), "");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(localeList81);
        org.junit.Assert.assertNull(locale82);
        org.junit.Assert.assertNotNull(localeList83);
        org.junit.Assert.assertNotNull(localeList84);
        org.junit.Assert.assertNotNull(localeList85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test19068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19068");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "HI!STRING[]STRING[]S                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#" + "'", str2, "#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#");
    }

    @Test
    public void test19070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19070");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test19071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19071");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           Taiwan");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19072");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("inglese");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eselgni" + "'", str1, "eselgni");
    }

    @Test
    public void test19073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19073");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                   java.util.stream", 46, 279);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19074");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale5.getDisplayCountry(locale6);
        java.lang.String str8 = locale5.toLanguageTag();
        java.lang.String str9 = locale1.getDisplayCountry(locale5);
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.lang.String str14 = locale13.getDisplayLanguage();
        java.lang.String str15 = locale11.getDisplayScript(locale13);
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale17);
        java.lang.String str19 = locale11.getDisplayCountry(locale17);
        java.lang.String str20 = locale5.getDisplayVariant(locale17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = locale5.getUnicodeLocaleType("FRAN\307AIS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: FRANC?AIS");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u570b" + "'", str2, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u570b" + "'", str7, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh-CN" + "'", str8, "zh-CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str9, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "inglese" + "'", str14, "inglese");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "english" + "'", str18, "english");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test19075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19075");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                       TW");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940 (Canada)", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940 (Canada)" + "'", str2, "\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940 (Canada)");
    }

    @Test
    public void test19077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19077");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "LOCALEI#########################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19078");
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
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, strMap14);
        int int16 = languageRangeList12.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean20 = languageRangeList18.remove((java.lang.Object) "English");
        boolean boolean21 = languageRangeList12.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray30 = org.apache.commons.lang3.StringUtils.stripAll(strArray29);
        java.lang.String[] strArray31 = org.apache.commons.lang3.StringUtils.stripAll(strArray30);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray26, strArray30);
        boolean boolean33 = languageRangeList12.equals((java.lang.Object) strArray30);
        java.util.Locale locale36 = new java.util.Locale("");
        java.lang.String str37 = locale36.getDisplayLanguage();
        java.util.Locale locale38 = java.util.Locale.CANADA;
        java.lang.String str39 = locale38.getDisplayLanguage();
        java.lang.String str40 = locale36.getDisplayScript(locale38);
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale36);
        java.lang.String str42 = locale36.getDisplayScript();
        java.util.Set<java.lang.String> strSet43 = locale36.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strSet43);
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList44);
        java.lang.String str47 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) strList44, "Japaneseuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeSpliterator10);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str32, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "inglese" + "'", str39, "inglese");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "a" + "'", str41, "a");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "ArrayList" + "'", str47, "ArrayList");
    }

    @Test
    public void test19079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19079");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                          avaj                                                          ", "cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 22);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19080");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ITALIEN");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ITALIEN");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19081");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, "cinese (Taiwan)");
        java.util.Locale.LanguageRange languageRange6 = new java.util.Locale.LanguageRange("English");
        java.lang.String str7 = languageRange6.getRange();
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("English");
        java.lang.String str10 = languageRange9.getRange();
        java.util.Locale.LanguageRange languageRange12 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] { languageRange6, languageRange9, languageRange12 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream16 = languageRangeList14.stream();
        java.util.Locale.Builder builder17 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder18 = builder17.clearExtensions();
        java.util.Locale.Builder builder19 = builder17.clearExtensions();
        boolean boolean20 = languageRangeList14.contains((java.lang.Object) builder19);
        java.util.Locale.Builder builder21 = builder19.clear();
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder24 = builder22.setScript("");
        java.util.Locale.Builder builder26 = builder24.setLanguage("HI");
        java.util.Locale locale27 = builder26.build();
        java.lang.String str28 = locale27.getDisplayScript();
        java.lang.String str29 = locale27.getVariant();
        java.util.Locale.Builder builder30 = builder21.setLocale(locale27);
        boolean boolean31 = languageRangeList2.remove((java.lang.Object) builder21);
        java.util.Locale locale32 = builder21.build();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "english" + "'", str7, "english");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "english" + "'", str10, "english");
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(languageRangeStream16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "hi");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "hi");
    }

    @Test
    public void test19082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19082");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19083");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                           ", "#####it_cn");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19084");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("ita", "ITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITAL..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test19085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19085");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("XXXXXXXXXXFRENCH (FRANCE)XXXXXXXXXX", "CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 83);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19086");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream3 = languageRangeList1.parallelStream();
        languageRangeList1.clear();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator5 = languageRangeList1.spliterator();
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "zho", (int) 'u', (int) (short) 0);
        boolean boolean14 = languageRangeList1.remove((java.lang.Object) "zho");
        int int16 = languageRangeList1.lastIndexOf((java.lang.Object) "..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHi");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "             AN       A");
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeStream3);
        org.junit.Assert.assertNotNull(languageRangeSpliterator5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test19087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19087");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder2.setLanguage("HI");
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder6 = builder4.setLocale(locale5);
        java.util.Locale.Builder builder8 = builder4.removeUnicodeLocaleAttribute("COLLECTI");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder10 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("LANG      ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: LANG       [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test19088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19088");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("       HI!", "SHORT                                                                                       ", "hi!hi! (                 A                 )#################################################", 93);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "       HI!" + "'", str4, "       HI!");
    }

    @Test
    public void test19089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19089");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("english");
        java.util.Locale locale8 = builder7.build();
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.lang.String str10 = locale8.getDisplayScript();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "english");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test19090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19090");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("anglais (Canada)                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anglais (Canada)                                                                                    " + "'", str1, "anglais (Canada)                                                                                    ");
    }

    @Test
    public void test19091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19091");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("\u4e2d\u56fdAD.AE.AF.A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test19092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19092");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b)", 248);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19093");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\u82f1\u8a9e...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx." + "'", str1, "\u82f1\u8a9e...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx.");
    }

    @Test
    public void test19094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19094");
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
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor33, "                                                                                       ese(Taiwan");
        languageRangeItor33.remove();
        boolean boolean37 = languageRangeItor33.hasNext();
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test19095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19095");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("CLASS[]", "zh-cnenglish", 698);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19096");
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
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor23 = languageRangeList11.iterator();
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
        org.junit.Assert.assertNotNull(languageRangeItor23);
    }

    @Test
    public void test19097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19097");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("....englishxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test19098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19098");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getLanguage();
        java.lang.String str2 = locale0.getLanguage();
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.util.Locale locale5 = new java.util.Locale("");
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.lang.String str9 = locale5.getDisplayScript(locale7);
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale11);
        java.lang.String str13 = locale5.getDisplayCountry(locale11);
        java.lang.String str14 = locale3.getDisplayScript(locale5);
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale19 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.util.Locale locale22 = new java.util.Locale("");
        java.lang.String str23 = locale22.getDisplayLanguage();
        java.util.Locale locale24 = java.util.Locale.CANADA;
        java.lang.String str25 = locale24.getDisplayLanguage();
        java.lang.String str26 = locale22.getDisplayScript(locale24);
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale28);
        java.lang.String str30 = locale22.getDisplayCountry(locale28);
        java.lang.String str31 = locale20.getDisplayScript(locale22);
        java.util.Locale.setDefault(locale20);
        java.lang.String str33 = locale19.getDisplayVariant(locale20);
        java.lang.String str34 = locale3.getDisplayLanguage(locale20);
        java.lang.String str35 = locale0.getDisplayLanguage(locale20);
        java.util.Locale.Category category36 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale37 = java.util.Locale.ENGLISH;
        java.util.Locale.setDefault(category36, locale37);
        java.util.Locale locale39 = java.util.Locale.JAPANESE;
        java.util.Locale locale41 = java.util.Locale.TAIWAN;
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.upperCase("", locale41);
        java.lang.String str43 = locale39.getDisplayVariant(locale41);
        java.util.Locale.setDefault(category36, locale41);
        java.util.Locale locale45 = java.util.Locale.getDefault(category36);
        java.lang.String str46 = locale45.getLanguage();
        java.lang.String str47 = locale0.getDisplayCountry(locale45);
        java.lang.String str48 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it" + "'", str1, "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "it" + "'", str2, "it");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "inglese" + "'", str8, "inglese");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "english" + "'", str12, "english");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale19.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "inglese" + "'", str25, "inglese");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "english" + "'", str29, "english");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "cHINA" + "'", str33, "cHINA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "italiano" + "'", str34, "italiano");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "italiano" + "'", str35, "italiano");
        org.junit.Assert.assertTrue("'" + category36 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category36.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ja");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "zh" + "'", str46, "zh");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test19099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19099");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                  hI   Taiwan                  hI   xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19100");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("                 a                  ", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) ".", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test19101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19101");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("zaachi...zaa.", "l.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx (GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI,us)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zaachi...zaa." + "'", str3, "zaachi...zaa.");
    }

    @Test
    public void test19102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19102");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale2);
        java.util.Locale.setDefault(locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setVariant(" ollections.EmptySetita ollections.EmptySetita ollections.EmptySetita ollections.EmptySet");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant:  ollections.EmptySetita ollections.EmptySetita ollections.EmptySetita ollections.EmptySet [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "english" + "'", str3, "english");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test19103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19103");
        java.lang.Class[] classArray2 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray2);
        java.lang.Class<?> wildcardClass5 = null;
        java.lang.Class[] classArray7 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        wildcardClassArray8[0] = wildcardClass5;
        boolean boolean12 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, wildcardClassArray8, false);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray16);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) wildcardClassArray16);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test19104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19104");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19105");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("en-c...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EN-C..." + "'", str1, "EN-C...");
    }

    @Test
    public void test19106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19106");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HINDI", 92, 107);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19107");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("German", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19108");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("china-CN", "ChinChinChinChinChiChinChinChinChinC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19109");
        java.util.Locale locale3 = new java.util.Locale("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxzh-cnenglh", "                                                                                  HINDI (HI!,CHINA)", "ChinChinChinChinChinChinChinChinChinaaaaaaaaa$");
        java.util.Locale locale8 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.lang.String str14 = locale13.getDisplayLanguage();
        java.lang.String str15 = locale11.getDisplayScript(locale13);
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale17);
        java.lang.String str19 = locale11.getDisplayCountry(locale17);
        java.lang.String str20 = locale9.getDisplayScript(locale11);
        java.util.Locale.setDefault(locale9);
        java.lang.String str22 = locale8.getDisplayVariant(locale9);
        java.util.Locale locale24 = new java.util.Locale("");
        java.lang.String str25 = locale24.getDisplayLanguage();
        java.util.Locale locale26 = java.util.Locale.CANADA;
        java.lang.String str27 = locale26.getDisplayLanguage();
        java.lang.String str28 = locale24.getDisplayScript(locale26);
        java.lang.String str29 = locale26.getDisplayVariant();
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = locale30.getDisplayCountry(locale31);
        java.lang.String str33 = locale31.getDisplayVariant();
        java.lang.String str34 = locale26.getDisplayScript(locale31);
        java.lang.String str35 = locale26.getScript();
        java.lang.String str36 = locale26.getDisplayLanguage();
        java.lang.String str37 = locale8.getDisplayLanguage(locale26);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.lowerCase("\uc911\uad6d", locale26);
        java.lang.String str39 = locale3.getDisplayLanguage(locale26);
        org.junit.Assert.assertEquals(locale3.toString(), "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxzh-cnenglh_                                                                                  HINDI (HI!,CHINA)_ChinChinChinChinChinChinChinChinChinaaaaaaaaa$");
        org.junit.Assert.assertEquals(locale8.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "anglais" + "'", str14, "anglais");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "english" + "'", str18, "english");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "cHINA" + "'", str22, "cHINA");
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "inglese" + "'", str27, "inglese");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "it");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Cina" + "'", str32, "Cina");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "inglese" + "'", str36, "inglese");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Hindi" + "'", str37, "Hindi");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\uc911\uad6d" + "'", str38, "\uc911\uad6d");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxzh-cnenglh" + "'", str39, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxzh-cnenglh");
    }

    @Test
    public void test19110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19110");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("anglais (Canada)                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: anglais(Canada)");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19111");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("C");
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "C", "h                                                gnalesenic.esenicavaj                                                I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
    }

    @Test
    public void test19112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19112");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("chinois (Chine");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "chinois (Chine" + "'", str1, "chinois (Chine");
    }

    @Test
    public void test19113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19113");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("            locale.builder             ", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19114");
        char[] charArray10 = new char[] {};
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zh_CN", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "i", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AD.AE.AF.AGchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "CHN", charArray10);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "rancese", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test19115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19115");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zh-CN");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, strMap5);
        java.lang.String[] strArray14 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<java.lang.Class<?>> wildcardClassList17 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList15);
        java.lang.String str18 = java.util.Locale.lookupTag(languageRangeList6, (java.util.Collection<java.lang.String>) strList15);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList6, "                 a                  ");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList6, "China");
        java.lang.Class[] classArray24 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray24);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray24);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray24);
        java.lang.String[] strArray31 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".", "HI");
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray31);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray32);
        boolean boolean35 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray33, false);
        int int36 = languageRangeList6.lastIndexOf((java.lang.Object) boolean35);
        boolean boolean37 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6);
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator38 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList6.replaceAll(languageRangeUnaryOperator38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassList17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test19116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19116");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                wt                                                ", "$(JAVA", 336);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19117");
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
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, strMap17);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        boolean boolean22 = languageRangeList15.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20);
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap26 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, strMap26);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        boolean boolean31 = languageRangeList24.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList29, "hi!");
        boolean boolean34 = languageRangeList15.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29);
        boolean boolean35 = languageRangeList4.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15);
        java.util.Locale locale39 = new java.util.Locale("hi", "hi!", "cHINA");
        java.lang.String str40 = locale39.getLanguage();
        java.util.Locale locale44 = new java.util.Locale("hi", "hi!", "cHINA");
        java.lang.String str45 = locale44.getDisplayVariant();
        java.util.Locale locale46 = locale44.stripExtensions();
        java.util.Locale locale47 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale48 = java.util.Locale.getDefault();
        java.lang.String str49 = locale47.getDisplayCountry(locale48);
        java.lang.String str50 = locale47.toLanguageTag();
        java.lang.String str51 = locale47.getLanguage();
        java.util.Locale locale52 = java.util.Locale.ITALIAN;
        java.util.Locale locale54 = new java.util.Locale("");
        java.lang.String str55 = locale54.getDisplayLanguage();
        java.util.Locale locale56 = java.util.Locale.CANADA;
        java.lang.String str57 = locale56.getDisplayLanguage();
        java.lang.String str58 = locale54.getDisplayScript(locale56);
        java.util.Locale locale60 = java.util.Locale.FRANCE;
        java.lang.String str61 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale60);
        java.lang.String str62 = locale54.getDisplayCountry(locale60);
        java.lang.String str63 = locale52.getDisplayScript(locale54);
        java.util.Locale locale64 = java.util.Locale.GERMAN;
        java.lang.String str65 = locale54.getDisplayLanguage(locale64);
        java.lang.String str66 = locale47.getDisplayCountry(locale54);
        java.lang.String str67 = locale54.getCountry();
        java.util.Locale locale71 = new java.util.Locale("....english", "zhcinesese", ".");
        java.lang.String str72 = locale54.getDisplayName(locale71);
        java.lang.String str73 = locale44.getDisplayName(locale54);
        java.lang.String str74 = locale39.getDisplayScript(locale44);
        boolean boolean75 = languageRangeList15.contains((java.lang.Object) locale44);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(languageRangeSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals(locale39.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi" + "'", str40, "hi");
        org.junit.Assert.assertEquals(locale44.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "cHINA" + "'", str45, "cHINA");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "it");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Cina" + "'", str49, "Cina");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "zh-CN" + "'", str50, "zh-CN");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "zh" + "'", str51, "zh");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "it");
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "inglese" + "'", str57, "inglese");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "english" + "'", str61, "english");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "de");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "China" + "'", str66, "China");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals(locale71.toString(), "....english_ZHCINESESE_.");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Hindi (HI!,cHINA)" + "'", str73, "Hindi (HI!,cHINA)");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test19118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19118");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliIlish)", 6, 13);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...iIlish ..." + "'", str3, "...iIlish ...");
    }

    @Test
    public void test19119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19119");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("it", "ANIHC");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("FR-CA", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
    }

    @Test
    public void test19120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19120");
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
        java.lang.Object[] objArray18 = languageRangeList13.toArray();
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator19 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList13.replaceAll(languageRangeUnaryOperator19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test19121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19121");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("ssalC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ssalC" + "'", str1, "ssalC");
    }

    @Test
    public void test19122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19122");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("XXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXX");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "XXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXX" + "'", str1, "XXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXX");
    }

    @Test
    public void test19123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19123");
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
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray7);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray12);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test19124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19124");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("short");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19125");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("AF.AE", "INGLESE", "fCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAArar NCCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAArars");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test19126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19126");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("xxxxxxxxxxxxafxxxxxxxxxxxxx", "CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]HI!CLASS[]", 186);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19127");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaa" + "'", str2, "aaaaaaaaaaa");
    }

    @Test
    public void test19128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19128");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray1);
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray7);
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray7);
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray11);
        boolean boolean14 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray11, true);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray11);
        java.lang.Class[] classArray17 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray17);
        java.lang.Class<?> wildcardClass20 = null;
        java.lang.Class[] classArray22 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray23 = (java.lang.Class<?>[]) classArray22;
        wildcardClassArray23[0] = wildcardClass20;
        boolean boolean27 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray19, wildcardClassArray23, false);
        java.lang.Class[] classArray29 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray29);
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray19, (java.lang.Class<?>[]) classArray29);
        java.lang.Class[] classArray34 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray34);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray34);
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray39);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray39);
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray39, "zh-CN");
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, (java.lang.Class<?>[]) classArray39);
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray19, wildcardClassArray37, false);
        boolean boolean49 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray19, false);
        java.lang.Class[] classArray51 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray51);
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray51);
        java.lang.Class[] classArray57 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray58 = (java.lang.Class<?>[]) classArray57;
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray57);
        java.lang.String str60 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray57);
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray51, (java.lang.Class<?>[]) classArray57);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray57);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray62);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray62);
        boolean boolean65 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray19, wildcardClassArray64);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test19129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19129");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("cn (italianojajajajajajajajajajajajajaj)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cn (italianojajajajajajajajajajajajajaj)" + "'", str1, "cn (italianojajajajajajajajajajajajajaj)");
    }

    @Test
    public void test19130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19130");
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
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream38 = languageRangeList13.parallelStream();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap39 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList40 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, strMap39);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor41 = languageRangeList13.listIterator();
        java.util.Locale.LanguageRange languageRange43 = new java.util.Locale.LanguageRange("Canada");
        boolean boolean44 = languageRangeList13.add(languageRange43);
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap49 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList50 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, strMap49);
        int int51 = languageRangeList47.size();
        java.util.Locale.LanguageRange languageRange53 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange55 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange57 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray58 = new java.util.Locale.LanguageRange[] { languageRange53, languageRange55, languageRange57 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList59 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59, languageRangeArray58);
        boolean boolean61 = languageRangeList47.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator62 = languageRangeList47.spliterator();
        languageRangeList47.clear();
        int int64 = languageRangeList47.size();
        java.lang.Object[] objArray65 = languageRangeList47.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean66 = languageRangeList13.addAll((-1), (java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 1");
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
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "inglese" + "'", str21, "inglese");
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
        org.junit.Assert.assertNotNull(languageRangeStream38);
        org.junit.Assert.assertNotNull(languageRangeList40);
        org.junit.Assert.assertNotNull(languageRangeItor41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(languageRangeList50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(languageRangeSpliterator62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
    }

    @Test
    public void test19131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19131");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                    ", '$', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                    " + "'", str3, "                    ");
    }

    @Test
    public void test19132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19132");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("Cina", "zho", 10);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("zh-cnenglh", strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "  cn    ", 530, 31);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test19133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19133");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("String[]", '$');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 698, 11);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test19134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19134");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("zH", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19135");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "...e.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugernge...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19136");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("liIlish", "ahi!hi!_                 A                 ", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19137");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("LOCALE.LANGUAGERANGE", "CINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LOCALE.LANGUAGERANGE" + "'", str2, "LOCALE.LANGUAGERANGE");
    }

    @Test
    public void test19138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19138");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)" + "'", str1, "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
    }

    @Test
    public void test19139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19139");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("###en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist#####", "Z......................");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19140");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ithi!lihi!no                                                                                        ", "EnglCNsCN");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19141");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "twn", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "IA", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "EN_CA", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "cl                                   java.util.stream", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19142");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI", "STI-F");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19143");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("ngl");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19144");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ch", "liahIitaliahIitaliahIitaliahIital..");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19145");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("fran\347ais(France)", "ARRAYLIST", "raaaaaaaaaaaaaaaaaaaingleseaaaaaaaaaaaaaaaaaaaaglAs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais(France)" + "'", str3, "fran\347ais(France)");
    }

    @Test
    public void test19146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19146");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("ZH-tw", "Locale.Builder");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test19147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19147");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "zh-cn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19148");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale locale7 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setRegion("       HI!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region:        HI! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "china_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "china_CN");
    }

    @Test
    public void test19149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19149");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator5 = languageRangeList1.spliterator();
        languageRangeList1.clear();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor7 = languageRangeList1.listIterator();
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor7, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor7, "NWTSNWTLGNE");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor7, "A#A#A#A#A#");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor7, "$$$$$$$$$$$$$xxxxxxxxinglese (canada)xxxxxxxx$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        // The following exception was thrown during execution in test generation
        try {
            languageRangeItor7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeSpliterator5);
        org.junit.Assert.assertNotNull(languageRangeItor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test19150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19150");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder2.setLanguage("HI");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.lang.String str9 = locale6.getDisplayCountry(locale8);
        java.util.Locale.Builder builder10 = builder5.setLocale(locale8);
        java.util.Locale.Builder builder12 = builder10.setLanguage("RGLaSa");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.setRegion("l.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: l.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cinese" + "'", str7, "cinese");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Taiwan" + "'", str9, "Taiwan");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test19151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19151");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587 (HI!,cHINcn_ITALIANOJAJAJAJAJAJAJAJAJAJAJAJAJAJ", 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19152");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "CNN                                                                                                ", (java.lang.CharSequence) "ch (JAVA.LANG)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19153");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 99, (int) '$');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19154");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                             italiahI                                              ", "cinese(Taiwan)", "...   gnalesenic.esenicavaj                                                Ih                                     ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                             .tal.ahI                                              " + "'", str3, "                                             .tal.ahI                                              ");
    }

    @Test
    public void test19155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19155");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("ocle.Bulde");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ocle" + "'", str1, "ocle");
    }

    @Test
    public void test19156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19156");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("referencepipeline.head", 107, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444referencepipeline.head4444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444referencepipeline.head4444444444444444444444444444444444444444444");
    }

    @Test
    public void test19157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19157");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliilish)", "                                        Englisch (Kanada)                                        ", 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19158");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("AD.AE.AF.AGCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", "                          a                         ", 280);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19159");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAAengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWArrayengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWALengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAist", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXZH-CNENGLH", "Nithi!li");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAAengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWArrayengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWALengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAist" + "'", str3, "ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAAengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWArrayengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWALengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAist");
    }

    @Test
    public void test19160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19160");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean9 = languageRangeList7.remove((java.lang.Object) "English");
        boolean boolean10 = languageRangeList1.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, strMap14);
        java.lang.String[] strArray23 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<java.lang.Class<?>> wildcardClassList26 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList24);
        java.lang.String str27 = java.util.Locale.lookupTag(languageRangeList15, (java.util.Collection<java.lang.String>) strList24);
        java.util.List<java.lang.Class<?>> wildcardClassList28 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList24);
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList24);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap33 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList34 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, strMap33);
        int int35 = languageRangeList31.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean39 = languageRangeList37.remove((java.lang.Object) "English");
        boolean boolean40 = languageRangeList31.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37);
        java.lang.String[] strArray45 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray48 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray49 = org.apache.commons.lang3.StringUtils.stripAll(strArray48);
        java.lang.String[] strArray50 = org.apache.commons.lang3.StringUtils.stripAll(strArray49);
        java.lang.String str51 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray45, strArray49);
        boolean boolean52 = languageRangeList31.equals((java.lang.Object) strArray49);
        boolean boolean53 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList56 = languageRangeList1.subList(88, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClassList26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(wildcardClassList28);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(languageRangeList34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(languageRangeList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str51, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test19161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19161");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("nenenenenene", (double) 528);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=528.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19162");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                  hI   Taiwan                  hI   ", "arraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########", 51);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  hI   Taiwan                  hI   " + "'", str3, "                  hI   Taiwan                  hI   ");
    }

    @Test
    public void test19163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19163");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                gnalesenic.esenicavaj                                                ", 22, "china_CN                             ese(Taiwan");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                gnalesenic.esenicavaj                                                " + "'", str3, "                                                gnalesenic.esenicavaj                                                ");
    }

    @Test
    public void test19164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19164");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              fr                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test19165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19165");
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
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor33, "twn");
        languageRangeItor33.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange37 = languageRangeItor33.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test19166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19166");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("fr-CA", strMap1);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("hi");
        int int6 = languageRangeList4.indexOf((java.lang.Object) '4');
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        int int12 = languageRangeList8.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean16 = languageRangeList14.remove((java.lang.Object) "English");
        boolean boolean17 = languageRangeList8.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap21 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList22 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, strMap21);
        java.lang.String[] strArray30 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.util.List<java.lang.Class<?>> wildcardClassList33 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList31);
        java.lang.String str34 = java.util.Locale.lookupTag(languageRangeList22, (java.util.Collection<java.lang.String>) strList31);
        java.util.List<java.lang.Class<?>> wildcardClassList35 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList31);
        java.util.List<java.lang.String> strList36 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList31);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap38 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList39 = java.util.Locale.LanguageRange.parse("Cina", strMap38);
        java.lang.String[] strArray43 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.Locale.FilteringMode filteringMode46 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags(languageRangeList39, (java.util.Collection<java.lang.String>) strList44, filteringMode46);
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strList31, filteringMode46);
        java.util.List<java.lang.Class<?>> wildcardClassList49 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(strList48);
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList48);
        java.util.Locale locale54 = new java.util.Locale("hi", "hi!", "cHINA");
        java.lang.String str55 = locale54.getDisplayScript();
        java.util.Set<java.lang.String> strSet56 = locale54.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet56);
        java.util.Locale locale61 = new java.util.Locale("CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "en_CA", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        java.util.Locale locale62 = java.util.Locale.ITALIAN;
        java.util.Locale locale64 = new java.util.Locale("");
        java.lang.String str65 = locale64.getDisplayLanguage();
        java.util.Locale locale66 = java.util.Locale.CANADA;
        java.lang.String str67 = locale66.getDisplayLanguage();
        java.lang.String str68 = locale64.getDisplayScript(locale66);
        java.util.Locale locale70 = java.util.Locale.FRANCE;
        java.lang.String str71 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale70);
        java.lang.String str72 = locale64.getDisplayCountry(locale70);
        java.lang.String str73 = locale62.getDisplayScript(locale64);
        java.util.Locale locale74 = java.util.Locale.GERMAN;
        java.lang.String str75 = locale64.getDisplayLanguage(locale74);
        java.util.Locale locale78 = new java.util.Locale("");
        java.lang.String str79 = locale78.getDisplayLanguage();
        java.util.Locale locale80 = java.util.Locale.CANADA;
        java.lang.String str81 = locale80.getDisplayLanguage();
        java.lang.String str82 = locale78.getDisplayScript(locale80);
        java.lang.String str83 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale78);
        java.lang.String str84 = locale78.getDisplayScript();
        java.lang.String str85 = locale74.getDisplayLanguage(locale78);
        java.util.Set<java.lang.String> strSet86 = locale78.getUnicodeLocaleAttributes();
        java.lang.String str87 = locale61.getDisplayCountry(locale78);
        java.util.Locale locale89 = new java.util.Locale("");
        java.lang.String str90 = locale89.getDisplayVariant();
        java.lang.String str91 = locale78.getDisplayScript(locale89);
        boolean boolean92 = languageRangeList2.contains((java.lang.Object) locale89);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(languageRangeList22);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClassList33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(wildcardClassList35);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(languageRangeList39);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + filteringMode46 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode46.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(wildcardClassList49);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertEquals(locale54.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertEquals(locale61.toString(), "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa_EN_CA_ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "it");
        org.junit.Assert.assertEquals(locale64.toString(), "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "inglese" + "'", str67, "inglese");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "english" + "'", str71, "english");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "de");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals(locale78.toString(), "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "inglese" + "'", str81, "inglese");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "a" + "'", str83, "a");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "German" + "'", str85, "German");
        org.junit.Assert.assertNotNull(strSet86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "EN_CA" + "'", str87, "EN_CA");
        org.junit.Assert.assertEquals(locale89.toString(), "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test19167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19167");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("j", "Ci_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j" + "'", str2, "j");
    }

    @Test
    public void test19168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19168");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("chinEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19169");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder4 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setUnicodeLocaleKeyword("en_CA", "\u82f1\u6587\u52a0\u62ff\u5927)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: en_CA [at index 0]");
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
    public void test19170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19170");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("                                                                                            ##_#A", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ##_#A");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19171");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("ng                                                      a.lava                                                      j", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ng                                                      a.lava                                                      j" + "'", str2, "ng                                                      a.lava                                                      j");
    }

    @Test
    public void test19172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19172");
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
        java.util.Locale locale80 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str81 = locale80.getDisplayLanguage();
        java.util.Locale locale82 = java.util.Locale.getDefault();
        java.lang.String str83 = locale80.getDisplayCountry(locale82);
        java.util.Locale locale84 = java.util.Locale.TAIWAN;
        java.lang.String str85 = locale84.getVariant();
        java.lang.String str86 = locale80.getDisplayName(locale84);
        java.util.Locale locale87 = locale80.stripExtensions();
        java.util.Locale.setDefault(category78, locale87);
        java.util.Locale locale89 = java.util.Locale.getDefault(category78);
        java.util.Locale locale90 = java.util.Locale.getDefault(category78);
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
        org.junit.Assert.assertEquals(locale80.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "cinese" + "'", str81, "cinese");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "it");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Taiwan" + "'", str83, "Taiwan");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
// flaky:         org.junit.Assert.assertEquals("'" + str86 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str86, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "zh_TW");
    }

    @Test
    public void test19173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19173");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za....", '$', '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za...." + "'", str3, "ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za....");
    }

    @Test
    public void test19174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19174");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Cina", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("Cina", strMap4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList5, strMap6);
        boolean boolean8 = languageRangeList2.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                 a                 ", "n       a", 10);
        int int13 = languageRangeList5.indexOf((java.lang.Object) strArray12);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, strMap17);
        int int19 = languageRangeList15.size();
        java.lang.Class[] classArray21 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray22 = (java.lang.Class<?>[]) classArray21;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray21);
        boolean boolean24 = languageRangeList15.equals((java.lang.Object) wildcardClassArray23);
        boolean boolean25 = languageRangeList15.isEmpty();
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        char[][] charArray30 = new char[][] { charArray26, charArray27, charArray28, charArray29 };
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        char[][] charArray35 = new char[][] { charArray31, charArray32, charArray33, charArray34 };
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        char[][] charArray40 = new char[][] { charArray36, charArray37, charArray38, charArray39 };
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        char[][] charArray45 = new char[][] { charArray41, charArray42, charArray43, charArray44 };
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        char[][] charArray50 = new char[][] { charArray46, charArray47, charArray48, charArray49 };
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        char[][] charArray55 = new char[][] { charArray51, charArray52, charArray53, charArray54 };
        char[][][] charArray56 = new char[][][] { charArray30, charArray35, charArray40, charArray45, charArray50, charArray55 };
        char[][][] charArray57 = languageRangeList15.toArray(charArray56);
        int int58 = languageRangeList15.size();
        java.util.Locale.LanguageRange languageRange60 = new java.util.Locale.LanguageRange("CA");
        int int61 = languageRangeList15.indexOf((java.lang.Object) languageRange60);
        boolean boolean62 = languageRangeList5.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange64 = languageRangeList5.get(551);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 551, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[]");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[]");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[]");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[]");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[]");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[]");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[]");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[]");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[]");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[]");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[]");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[]");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[]");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[]");
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[]");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[]");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test19175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19175");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("Locale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLocale.FilteringModeLoc                                        Ih                                     ...");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Locale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocale/FilteringModeLocIh///");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19176");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliilish)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19177");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindi", "java.uil");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindi" + "'", str2, "hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindi");
    }

    @Test
    public void test19178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19178");
        java.util.Locale locale1 = new java.util.Locale("I");
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale1.toLanguageTag();
        java.util.Locale.setDefault(locale1);
        java.lang.String str5 = locale1.getVariant();
        java.util.Locale locale6 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.lang.String str8 = locale6.getDisplayCountry(locale7);
        java.lang.String str9 = locale1.getDisplayScript(locale7);
        java.util.Locale locale11 = new java.util.Locale("!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        java.lang.String str12 = locale7.getDisplayLanguage(locale11);
        java.lang.String str13 = locale7.getCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "i");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "China" + "'", str8, "China");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals(locale11.toString(), "!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "i" + "'", str12, "i");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test19179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19179");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("ita", 209, 280);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19180");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AN                 a                 AN   ", "z...", "ItaliItaliItaliItaliItaliItaliItaliItaliItali");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test19181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19181");
        char[] charArray12 = new char[] { '#', '#', ' ' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("China", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ANIHC      ", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("CHINA", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587          ", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Cina", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("Chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "zh_ZH                                                                                                                   ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test19182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19182");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("xxxxxxxxinglese (Canada)xxxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxxxxxinglese (canada)xxxxxxxx" + "'", str1, "xxxxxxxxinglese (canada)xxxxxxxx");
    }

    @Test
    public void test19183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19183");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("ENGLISH", "                                               javacinese.cineselang                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19184");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("zxxxxxxxxxxxxxxxxxxx");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ArrayList", "locale.builder", (-1));
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("\u82f1\u6587\u7f8e\u570b)", strArray2, strArray8);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zxxxxxxxxxxxxxxxxxxx" + "'", str4, "zxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str10, "\u82f1\u6587\u7f8e\u570b)");
    }

    @Test
    public void test19185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19185");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn     ", 'u', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn     " + "'", str3, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn     ");
    }

    @Test
    public void test19186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19186");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Italien", 'x');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '$');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italien" + "'", str4, "Italien");
    }

    @Test
    public void test19187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19187");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        int int3 = languageRangeList1.indexOf((java.lang.Object) '4');
        java.lang.Object obj4 = null;
        int int5 = languageRangeList1.indexOf(obj4);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream6 = languageRangeList1.stream();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(languageRangeStream6);
    }

    @Test
    public void test19188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19188");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("ENENENENENENENENENEN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ENENENENENENENENENEN" + "'", str1, "ENENENENENENENENENEN");
    }

    @Test
    public void test19189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19189");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("Hindi (HI!,cHINA                                                                                                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Hindi(HI!,cHINA");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19190");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("java.uHAR[].............................................................................................il", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19191");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "......44444444EnglTWNsTWN44444444......");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi! (                 A                 )", "JAVA.LANG", 13);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("wt_hz", strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray9);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Short", strArray9);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayLis");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test19192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19192");
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
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, strMap22);
        int int24 = languageRangeList20.size();
        java.util.Locale.LanguageRange languageRange26 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange28 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange30 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] { languageRange26, languageRange28, languageRange30 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        boolean boolean34 = languageRangeList20.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator35 = languageRangeList32.spliterator();
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap39 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList40 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, strMap39);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        boolean boolean44 = languageRangeList37.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42);
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList42, "hi!");
        int int47 = languageRangeList42.size();
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList42, '4');
        boolean boolean50 = languageRangeList32.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42);
        java.util.Locale.LanguageRange[] languageRangeArray51 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList52 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52, languageRangeArray51);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap54 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList55 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, strMap54);
        int int56 = languageRangeList52.size();
        java.util.Locale.LanguageRange languageRange58 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange60 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange62 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray63 = new java.util.Locale.LanguageRange[] { languageRange58, languageRange60, languageRange62 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList64 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64, languageRangeArray63);
        boolean boolean66 = languageRangeList52.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64);
        java.util.Locale locale69 = new java.util.Locale("");
        java.lang.String str70 = locale69.getDisplayLanguage();
        java.util.Locale locale71 = java.util.Locale.CANADA;
        java.lang.String str72 = locale71.getDisplayLanguage();
        java.lang.String str73 = locale69.getDisplayScript(locale71);
        java.lang.String str74 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale69);
        java.lang.String str75 = locale69.getDisplayScript();
        java.util.Set<java.lang.String> strSet76 = locale69.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode77 = null;
        java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, (java.util.Collection<java.lang.String>) strSet76, filteringMode77);
        java.util.List<java.lang.String> strList79 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.lang.String>) strList78);
        java.util.List<java.lang.String> strList80 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList78);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor81 = languageRangeList1.listIterator();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Locale.LanguageRange" + "'", str12, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(languageRangeSpliterator35);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(languageRangeList40);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(languageRangeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(languageRangeList55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals(locale69.toString(), "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "English" + "'", str72, "English");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "a" + "'", str74, "a");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(strSet76);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertNotNull(languageRangeItor81);
    }

    @Test
    public void test19193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19193");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587" + "'", str1, "\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587");
    }

    @Test
    public void test19194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19194");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("FR");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S", locale2);
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.ENGLISH;
        java.util.Locale.setDefault(category4, locale5);
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.util.Locale locale9 = java.util.Locale.TAIWAN;
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.upperCase("", locale9);
        java.lang.String str11 = locale7.getDisplayVariant(locale9);
        java.util.Locale.setDefault(category4, locale9);
        java.util.Locale locale13 = java.util.Locale.getDefault(category4);
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale.Builder builder16 = builder14.clearExtensions();
        java.util.Locale.Builder builder18 = builder14.removeUnicodeLocaleAttribute("English");
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale19.getDisplayCountry(locale20);
        java.lang.String str22 = locale19.toLanguageTag();
        java.lang.String str23 = locale19.getCountry();
        java.lang.String str24 = locale19.getISO3Country();
        java.util.Locale locale26 = new java.util.Locale("");
        java.lang.String str27 = locale26.getDisplayVariant();
        java.lang.String str28 = locale19.getDisplayLanguage(locale26);
        java.lang.String str29 = locale26.getLanguage();
        java.util.Set<java.lang.Character> charSet30 = locale26.getExtensionKeys();
        java.lang.String str31 = locale26.getVariant();
        java.util.Locale.Builder builder32 = builder18.setLocale(locale26);
        java.lang.String str34 = locale26.getExtension('x');
        java.util.Locale locale35 = java.util.Locale.CANADA;
        boolean boolean36 = locale35.hasExtensions();
        java.util.Locale locale37 = java.util.Locale.ITALIAN;
        java.lang.String str38 = locale35.getDisplayScript(locale37);
        java.lang.String str40 = locale35.getExtension('a');
        boolean boolean41 = locale35.hasExtensions();
        java.util.Locale locale42 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.String> strSet43 = locale42.getUnicodeLocaleAttributes();
        java.lang.String str44 = locale42.getISO3Country();
        java.lang.String str45 = locale35.getDisplayCountry(locale42);
        java.lang.String str46 = locale26.getDisplayName(locale42);
        java.util.Locale.setDefault(category4, locale42);
        java.lang.String str48 = locale2.getDisplayScript(locale42);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "englhi!string[]string[]sshi!string[]string[]s" + "'", str3, "englhi!string[]string[]sshi!string[]string[]s");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "i");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "China" + "'", str21, "China");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "CN" + "'", str23, "CN");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "CHN" + "'", str24, "CHN");
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Chinese" + "'", str28, "Chinese");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charSet30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "it");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "it");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Canada" + "'", str45, "Canada");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test19195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19195");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 317);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=317.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19196");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.lang.String str3 = locale0.toLanguageTag();
        java.lang.String str4 = locale0.getLanguage();
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
        java.lang.String str19 = locale0.getDisplayCountry(locale7);
        java.util.Locale locale21 = new java.util.Locale("");
        java.util.Locale locale22 = java.util.Locale.CANADA;
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleAttributes();
        java.lang.String str24 = locale21.getDisplayLanguage(locale22);
        java.lang.String str25 = locale0.getDisplayCountry(locale22);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray28 = languageRangeList27.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator29 = languageRangeList27.spliterator();
        java.util.Locale.Builder builder30 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder31 = builder30.clearExtensions();
        java.util.Locale.Builder builder33 = builder31.setLanguageTag("zh-CN");
        java.util.Locale locale34 = builder31.build();
        boolean boolean35 = languageRangeList27.remove((java.lang.Object) locale34);
        java.util.Locale locale38 = new java.util.Locale("CHN", "hi!");
        java.lang.String str39 = locale34.getDisplayLanguage(locale38);
        java.util.Locale locale41 = java.util.Locale.CANADA;
        java.lang.String str42 = locale41.toLanguageTag();
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.upperCase("hi!", locale41);
        java.util.Locale locale45 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet46 = locale45.getExtensionKeys();
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.lowerCase("String[]", locale45);
        java.lang.String str48 = locale45.getVariant();
        java.lang.String str49 = locale41.getDisplayVariant(locale45);
        java.lang.String str50 = locale38.getDisplayLanguage(locale45);
        java.lang.String str51 = locale22.getDisplayVariant(locale45);
        java.util.Locale locale55 = new java.util.Locale("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish", "IA", "zh_CN");
        java.util.Locale locale58 = new java.util.Locale("zho", "US");
        java.util.Locale locale59 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str60 = locale58.getDisplayVariant(locale59);
        java.lang.String str61 = locale55.getDisplayName(locale59);
        java.lang.String str62 = locale59.toLanguageTag();
        java.lang.String str63 = locale59.getDisplayLanguage();
        java.lang.String str64 = locale59.getDisplayScript();
        java.lang.String str65 = locale59.getVariant();
        java.lang.String str66 = locale22.getDisplayName(locale59);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str68 = locale22.getUnicodeLocaleType("ChinChinChinChinChinChinChinChinChinaaaaaaa$ChinChinChinChinChinChinChinChinChinaaaaaaaaa$ChinChinChinChinChinChinChinChinChinaaaaaaafr-FRSTI-FChinChinChinChinChinChinChinChinChinaaaaaaaaa$ChinChinChinChinChinChinChinChinChinaaaaaaaaa$ChinChinChinChinChinChinChinChinChinaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ChinChinChinChinChinChinChinChinChinaaaaaaa$ChinChinChinChinChinChinChinChinChinaaaaaaaaa$ChinChinChinChinChinChinChinChinChinaaaaaaafr-FRSTI-FChinChinChinChinChinChinChinChinChinaaaaaaaaa$ChinChinChinChinChinChinChinChinChinaaaaaaaaa$ChinChinChinChinChinChinChinChinChinaaaaaaaaa");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "inglese" + "'", str10, "inglese");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "english" + "'", str14, "english");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "China" + "'", str19, "China");
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "China" + "'", str25, "China");
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(languageRangeSpliterator29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals(locale38.toString(), "chn_HI!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Chinese" + "'", str39, "Chinese");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "en-CA" + "'", str42, "en-CA");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "HI!" + "'", str43, "HI!");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "string[]" + "'", str47, "string[]");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\u5951\u52aa\u514b\u6587" + "'", str50, "\u5951\u52aa\u514b\u6587");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals(locale55.toString(), "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish_IA_zh_CN");
        org.junit.Assert.assertEquals(locale58.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (IA,zh,CN)" + "'", str61, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (IA,zh,CN)");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "fr-CA" + "'", str62, "fr-CA");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "francese" + "'", str63, "francese");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "anglais (Canada)" + "'", str66, "anglais (Canada)");
    }

    @Test
    public void test19197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19197");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("################################################################################################################lang", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXANIC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################################################################################################lang" + "'", str2, "################################################################################################################lang");
    }

    @Test
    public void test19198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19198");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh_CN" + "'", str1, "zh_CN");
    }

    @Test
    public void test19199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19199");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter(" L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]" + "'", str2, " L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]");
    }

    @Test
    public void test19200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19200");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("anihc", "                                                                                              Germn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anihc" + "'", str2, "anihc");
    }

    @Test
    public void test19201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19201");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxx", "hindihindihindihin");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxx" + "'", str2, "italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxx");
    }

    @Test
    public void test19202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19202");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("[]", "    Z");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
    }

    @Test
    public void test19203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19203");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("anAnAnAnAnAnxxxxxxxxinglese (Canada)xxxxxxxx", "ArrayList", 350);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19204");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Engl....englishs....englis", 'a', 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Engl....englishs....englis" + "'", str3, "Engl....englishs....englis");
    }

    @Test
    public void test19205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19205");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("englTWNsTWN", "", 99);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19206");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("#...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#..." + "'", str1, "#...");
    }

    @Test
    public void test19207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19207");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        boolean boolean8 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6);
        int int9 = languageRangeList1.size();
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, strMap13);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        boolean boolean18 = languageRangeList11.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, strMap22);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        boolean boolean27 = languageRangeList20.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList25, "hi!");
        boolean boolean30 = languageRangeList11.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.parse("Chinese");
        boolean boolean33 = languageRangeList25.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream34 = languageRangeList32.stream();
        boolean boolean35 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = languageRangeList32.subList(9, 26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 26");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(languageRangeStream34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test19208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19208");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("zh-cnenglish (LOCALE.LANGUAGERANGE)", "                            AHI!HI!                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19209");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("ava . lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ava . lang" + "'", str1, "ava . lang");
    }

    @Test
    public void test19210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19210");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "aaaaaaadnu");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: aaaaaaadnu");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19211");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "CINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "zh_Z");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test19212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Local", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Local" + "'", str2, "Local");
    }

    @Test
    public void test19213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19213");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean3 = languageRangeList1.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale8);
        java.util.Locale locale10 = java.util.Locale.US;
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale13 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = locale13.getDisplayCountry(locale14);
        java.lang.String str16 = locale13.toLanguageTag();
        java.util.Locale locale17 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.lang.String str19 = locale17.getDisplayCountry(locale18);
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str22 = locale20.getDisplayCountry(locale21);
        java.util.Locale locale26 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale27 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale27.getDisplayCountry(locale28);
        java.util.Locale locale31 = new java.util.Locale("");
        java.lang.String str32 = locale31.getDisplayVariant();
        java.util.Locale locale33 = java.util.Locale.KOREAN;
        java.util.Locale locale35 = new java.util.Locale("");
        java.util.Locale locale36 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray37 = new java.util.Locale[] { locale8, locale10, locale11, locale12, locale13, locale18, locale20, locale26, locale28, locale31, locale33, locale35, locale36 };
        java.util.ArrayList<java.util.Locale> localeList38 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList38, localeArray37);
        java.util.List<java.util.Locale> localeList40 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.List<java.util.Locale> localeList41 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.Locale.LanguageRange[] languageRangeArray42 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList43 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43, languageRangeArray42);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, strMap45);
        int int47 = languageRangeList43.size();
        java.util.Locale.LanguageRange languageRange49 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange51 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange53 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] { languageRange49, languageRange51, languageRange53 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        boolean boolean57 = languageRangeList43.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55);
        boolean boolean58 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43);
        java.lang.String str60 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) boolean58, "Ci_a");
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "english" + "'", str9, "english");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "i");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "China" + "'", str15, "China");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh-CN" + "'", str16, "zh-CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "i");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "China" + "'", str19, "China");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "i");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "China" + "'", str22, "China");
        org.junit.Assert.assertEquals(locale26.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "i");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "China" + "'", str29, "China");
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko");
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(localeList40);
        org.junit.Assert.assertNotNull(localeList41);
        org.junit.Assert.assertNotNull(languageRangeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(languageRangeList46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Boolean" + "'", str60, "Boolean");
    }

    @Test
    public void test19214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19214");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\u65e5\u6587", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19215");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("java.util.stream", "anihc               en_ca");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.util.stream" + "'", str2, "java.util.stream");
    }

    @Test
    public void test19216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19216");
        java.util.Locale locale1 = new java.util.Locale("latiarfatilatiarfatilatiarfatilatiar");
        org.junit.Assert.assertEquals(locale1.toString(), "latiarfatilatiarfatilatiarfatilatiar");
    }

    @Test
    public void test19217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19217");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                            en_CA", "zh_CN");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("chn_HI!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test19218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19218");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Locale.Builder[]stringstringstri", "xxxxxxxx)adanaC( eselgnixxxxxxxx");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test19219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19219");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                             .HI.!.HI.!.HI.!.HI.!.HI.!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".HI.!.HI.!.HI.!.HI.!.HI.!" + "'", str1, ".HI.!.HI.!.HI.!.HI.!.HI.!");
    }

    @Test
    public void test19220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19220");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fduuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "EN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19221");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u4e2d\u56fd\u8a9e", "\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliIlish)", 27);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test19222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19222");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("englhi!string[]string[]sshi!string[]string[]s");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.lang.String str3 = locale1.getScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19223");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("...                            avaj                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=...avaj");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19224");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("Collections.EmptySet");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Collections" + "'", str1, "Collections");
    }

    @Test
    public void test19225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19225");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator5 = languageRangeList1.spliterator();
        languageRangeList1.clear();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor7 = languageRangeList1.listIterator();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor8 = languageRangeList1.listIterator();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor9 = languageRangeList1.listIterator();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor9, "ShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShort");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor9, ".Cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx..");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor9, "zhcinesese$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeSpliterator5);
        org.junit.Assert.assertNotNull(languageRangeItor7);
        org.junit.Assert.assertNotNull(languageRangeItor8);
        org.junit.Assert.assertNotNull(languageRangeItor9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test19226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19226");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("zu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zu" + "'", str1, "zu");
    }

    @Test
    public void test19227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19227");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "\u4e2d\u56fd", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: cnn??");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19228");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaia", ")xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaia" + "'", str2, "aiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaiaaiaiaiaiaiaiaiaiaia");
    }

    @Test
    public void test19229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19229");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\u6cd5\u6587\u6cd5\u570b)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u6cd5\u6587\u6cd5\u570b)" + "'", str1, "\u6cd5\u6587\u6cd5\u570b)");
    }

    @Test
    public void test19230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19230");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("z", "CA", (int) '#');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "fra");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "z" + "'", str6, "z");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "z" + "'", str7, "z");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "z" + "'", str9, "z");
    }

    @Test
    public void test19231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19231");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("         HI!HI!HI!HI!HI!HI          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test19232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19232");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "-CA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19233");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("....english_ZHCINESESE_.", "I###################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "....english_ZHCINESESE_." + "'", str2, "....english_ZHCINESESE_.");
    }

    @Test
    public void test19234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19234");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliilish)", 4, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliilish)" + "'", str3, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliilish)");
    }

    @Test
    public void test19235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19235");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 107, 211);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19236");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                         " + "'", str1, "                         ");
    }

    @Test
    public void test19237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19237");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hindi (HI!,cHINA)", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("HArrayList", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                      java.lang                                                      ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test19238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19238");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                             HI!HI!HI!HI!HI!                    nglish  Hindi (HI!,cHINA                    nglish  Hind", 94, 350);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                             HI!HI!HI!HI!HI!                    nglish  Hindi (HI!,cHINA                    nglish  Hind" + "'", str3, "                             HI!HI!HI!HI!HI!                    nglish  Hindi (HI!,cHINA                    nglish  Hind");
    }

    @Test
    public void test19239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19239");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Italienisch", "ngl");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19240");
        java.util.Locale locale1 = new java.util.Locale("cINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "cinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacina");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "cinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacina");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "cinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacina");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "cinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacina");
    }

    @Test
    public void test19241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19241");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("CHN", strMap1);
        languageRangeList2.clear();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale8);
        java.util.Locale locale10 = java.util.Locale.US;
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale13 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = locale13.getDisplayCountry(locale14);
        java.lang.String str16 = locale13.toLanguageTag();
        java.util.Locale locale17 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.lang.String str19 = locale17.getDisplayCountry(locale18);
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str22 = locale20.getDisplayCountry(locale21);
        java.util.Locale locale26 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale27 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale27.getDisplayCountry(locale28);
        java.util.Locale locale31 = new java.util.Locale("");
        java.lang.String str32 = locale31.getDisplayVariant();
        java.util.Locale locale33 = java.util.Locale.KOREAN;
        java.util.Locale locale35 = new java.util.Locale("");
        java.util.Locale locale36 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray37 = new java.util.Locale[] { locale8, locale10, locale11, locale12, locale13, locale18, locale20, locale26, locale28, locale31, locale33, locale35, locale36 };
        java.util.ArrayList<java.util.Locale> localeList38 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList38, localeArray37);
        java.util.List<java.util.Locale> localeList40 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList38);
        java.lang.String[] strArray48 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        java.util.List<java.lang.Class<?>> wildcardClassList51 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList49);
        java.util.Locale.FilteringMode filteringMode52 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList49, filteringMode52);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream54 = languageRangeList5.parallelStream();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap55 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList56 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap55);
        boolean boolean57 = languageRangeList2.contains((java.lang.Object) languageRangeList56);
        java.lang.Object[] objArray58 = languageRangeList2.toArray();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "english" + "'", str9, "english");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "i");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "China" + "'", str15, "China");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh-CN" + "'", str16, "zh-CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "i");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "China" + "'", str19, "China");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "i");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "China" + "'", str22, "China");
        org.junit.Assert.assertEquals(locale26.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "i");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "China" + "'", str29, "China");
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko");
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(localeList40);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(wildcardClassList51);
        org.junit.Assert.assertTrue("'" + filteringMode52 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode52.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(languageRangeStream54);
        org.junit.Assert.assertNotNull(languageRangeList56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
    }

    @Test
    public void test19242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19242");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "cinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecines");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecines" + "'", str1, "cinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecines");
    }

    @Test
    public void test19243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19243");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("ChinChinChinChinChinChinChinChinChinaaaaaaaaa$ChinChinChinChinChinChinChinChinChinaaaaaaaaa$ChinChinChinChinChinChinChinChinChinaaaaaaafr-FRSTI-FChinChinChinChinChinChinChinChinChinaaaaaaaaa$ChinChinChinChinChinChinChinChinChinaaaaaaaaa$ChinChinChinChinChinChinChinChinChinaaaaaaa", 52, 350);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19244");
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
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream26 = languageRangeList1.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap30 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList31 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, strMap30);
        java.lang.String[] strArray39 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.util.List<java.lang.Class<?>> wildcardClassList42 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList40);
        java.lang.String str43 = java.util.Locale.lookupTag(languageRangeList31, (java.util.Collection<java.lang.String>) strList40);
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap47 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList48 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, strMap47);
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        boolean boolean52 = languageRangeList45.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream53 = languageRangeList50.stream();
        boolean boolean54 = languageRangeList31.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50);
        java.util.Locale.LanguageRange languageRange56 = new java.util.Locale.LanguageRange("English");
        java.lang.String str57 = languageRange56.getRange();
        boolean boolean58 = languageRangeList31.add(languageRange56);
        double double59 = languageRange56.getWeight();
        double double60 = languageRange56.getWeight();
        java.lang.String str61 = languageRange56.getRange();
        boolean boolean62 = languageRangeList1.add(languageRange56);
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
        org.junit.Assert.assertNotNull(languageRangeStream26);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(languageRangeList31);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClassList42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(languageRangeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(languageRangeList48);
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(languageRangeStream53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "english" + "'", str57, "english");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 1.0d + "'", double59 == 1.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "english" + "'", str61, "english");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test19245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19245");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!haCOL", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!haCOL" + "'", str2, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!haCOL");
    }

    @Test
    public void test19246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19246");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              fr                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", "china_cn        Ci_a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test19247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19247");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("string", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  string   " + "'", str2, "  string   ");
    }

    @Test
    public void test19248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19248");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("nengli", "enghI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nengli" + "'", str2, "nengli");
    }

    @Test
    public void test19249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19249");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class[] classArray10 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray10);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray10);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray10);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        java.lang.Class[] classArray17 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray17);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray17);
        java.lang.String str22 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray20, "Chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray20);
        boolean boolean24 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray20);
        boolean boolean25 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray15);
        java.lang.Class[] classArray27 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray27);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray27);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray27);
        java.lang.Class[] classArray33 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray33);
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray33);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray33);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray37);
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray31, wildcardClassArray37, true);
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray37);
        java.lang.Class[] classArray43 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray44 = (java.lang.Class<?>[]) classArray43;
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray43);
        java.lang.Class<?> wildcardClass46 = null;
        java.lang.Class[] classArray48 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray49 = (java.lang.Class<?>[]) classArray48;
        wildcardClassArray49[0] = wildcardClass46;
        boolean boolean53 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray49, false);
        java.lang.Class[] classArray55 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray55);
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray45, (java.lang.Class<?>[]) classArray55);
        java.lang.Class[] classArray60 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray61 = (java.lang.Class<?>[]) classArray60;
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray60);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray60);
        java.lang.Class[] classArray65 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray66 = (java.lang.Class<?>[]) classArray65;
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray65);
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray65);
        java.lang.String str70 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray65, "zh-CN");
        boolean boolean71 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray63, (java.lang.Class<?>[]) classArray65);
        boolean boolean73 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray63, false);
        boolean boolean75 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, wildcardClassArray45, false);
        boolean boolean77 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray41, false);
        java.lang.String[] strArray80 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                      java.lang                                                      ", "Cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        java.lang.Class<?>[] wildcardClassArray81 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray80);
        java.lang.Class<?>[] wildcardClassArray82 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray81);
        java.lang.Class<?>[] wildcardClassArray83 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray81);
        boolean boolean84 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, wildcardClassArray81);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang" + "'", str22, "java.lang");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(classArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(classArray65);
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(wildcardClassArray81);
        org.junit.Assert.assertNotNull(wildcardClassArray82);
        org.junit.Assert.assertNotNull(wildcardClassArray83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test19250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19250");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray2);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray2);
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray5, "Chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray9, "", 10, 0);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray9);
        boolean boolean15 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray0, wildcardClassArray9);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang" + "'", str7, "java.lang");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test19251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19251");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("    z", "         cnncnncnnlocale.Buildercnncnncnnc         ", 18);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19252");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.setRegion("zh");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.addUnicodeLocaleAttribute("CAN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setLanguage("ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayLisTRING[]ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayLisTRING[]ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayLisTRING[]ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayLisTRING[]ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayLisTRING[]ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayLis");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayLisTRING[]ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayLisTRING[]ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayLisTRING[]ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayLisTRING[]ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayLisTRING[]ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayLis [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test19253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19253");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19254");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test19255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19255");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("nawiaT( eseengls$$$$$$$$$nawiaT( es");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19256");
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
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean32 = languageRangeList30.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange languageRange34 = languageRangeList30.get(0);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor35 = languageRangeList30.listIterator();
        java.util.Locale.LanguageRange languageRange36 = languageRangeItor35.next();
        boolean boolean37 = languageRangeList11.add(languageRange36);
        boolean boolean39 = languageRange36.equals((java.lang.Object) "ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.z");
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
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(languageRange34);
        org.junit.Assert.assertNotNull(languageRangeItor35);
        org.junit.Assert.assertNotNull(languageRange36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test19257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19257");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fduuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "ch (JAVA.LANG)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19258");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Collections.EmptySet");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=collections.emptyset");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19259");
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
        boolean boolean15 = locale1.hasExtensions();
        java.lang.String str16 = locale1.getCountry();
        java.util.Locale locale17 = locale1.stripExtensions();
        java.lang.String str18 = locale17.getISO3Country();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test19260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19260");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList1.listIterator();
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) languageRangeList1, "....english");
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, strMap12);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor14 = languageRangeList13.listIterator();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale23);
        java.util.Locale locale25 = java.util.Locale.US;
        java.util.Locale locale26 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale27 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale28 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.lang.String str30 = locale28.getDisplayCountry(locale29);
        java.lang.String str31 = locale28.toLanguageTag();
        java.util.Locale locale32 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale33 = java.util.Locale.getDefault();
        java.lang.String str34 = locale32.getDisplayCountry(locale33);
        java.util.Locale locale35 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = locale35.getDisplayCountry(locale36);
        java.util.Locale locale41 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale42 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.lang.String str44 = locale42.getDisplayCountry(locale43);
        java.util.Locale locale46 = new java.util.Locale("");
        java.lang.String str47 = locale46.getDisplayVariant();
        java.util.Locale locale48 = java.util.Locale.KOREAN;
        java.util.Locale locale50 = new java.util.Locale("");
        java.util.Locale locale51 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray52 = new java.util.Locale[] { locale23, locale25, locale26, locale27, locale28, locale33, locale35, locale41, locale43, locale46, locale48, locale50, locale51 };
        java.util.ArrayList<java.util.Locale> localeList53 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList53, localeArray52);
        java.util.List<java.util.Locale> localeList55 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList53);
        java.lang.String[] strArray63 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        java.util.List<java.lang.Class<?>> wildcardClassList66 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList64);
        java.util.Locale.FilteringMode filteringMode67 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList64, filteringMode67);
        java.util.List<java.lang.String> strList69 = java.util.Locale.filterTags(languageRangeList13, (java.util.Collection<java.lang.String>) strList17, filteringMode67);
        java.util.Locale.LanguageRange[] languageRangeArray70 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList71 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71, languageRangeArray70);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap73 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList74 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList71, strMap73);
        int int75 = languageRangeList71.size();
        boolean boolean76 = languageRangeList13.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap77 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList78 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList13, strMap77);
        boolean boolean79 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList78);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap80 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList81 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap80);
        boolean boolean82 = languageRangeList1.isEmpty();
        boolean boolean83 = languageRangeList1.isEmpty();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ArrayList" + "'", str8, "ArrayList");
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeItor14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "english" + "'", str24, "english");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "i");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "China" + "'", str30, "China");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zh-CN" + "'", str31, "zh-CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "i");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "China" + "'", str34, "China");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "i");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "China" + "'", str37, "China");
        org.junit.Assert.assertEquals(locale41.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "i");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "China" + "'", str44, "China");
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "ko");
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(localeList55);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(wildcardClassList66);
        org.junit.Assert.assertTrue("'" + filteringMode67 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode67.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(languageRangeArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(languageRangeList74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(languageRangeList78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(languageRangeList81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test19261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19261");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("util");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray4 = languageRangeList3.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray7 = languageRangeList6.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator8 = languageRangeList6.spliterator();
        boolean boolean9 = languageRangeList3.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor10 = languageRangeList3.iterator();
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList3, '$');
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap16 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, strMap16);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.parse("Cina", strMap19);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap21 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList22 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList20, strMap21);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean26 = languageRangeList24.remove((java.lang.Object) "English");
        boolean boolean28 = languageRangeList24.remove((java.lang.Object) 1);
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Locale locale33 = java.util.Locale.FRANCE;
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale33);
        java.util.Locale locale35 = java.util.Locale.US;
        java.util.Locale locale36 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale37 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale38 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale38.getDisplayCountry(locale39);
        java.lang.String str41 = locale38.toLanguageTag();
        java.util.Locale locale42 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.lang.String str44 = locale42.getDisplayCountry(locale43);
        java.util.Locale locale45 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale46 = java.util.Locale.getDefault();
        java.lang.String str47 = locale45.getDisplayCountry(locale46);
        java.util.Locale locale51 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale52 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.lang.String str54 = locale52.getDisplayCountry(locale53);
        java.util.Locale locale56 = new java.util.Locale("");
        java.lang.String str57 = locale56.getDisplayVariant();
        java.util.Locale locale58 = java.util.Locale.KOREAN;
        java.util.Locale locale60 = new java.util.Locale("");
        java.util.Locale locale61 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray62 = new java.util.Locale[] { locale33, locale35, locale36, locale37, locale38, locale43, locale45, locale51, locale53, locale56, locale58, locale60, locale61 };
        java.util.ArrayList<java.util.Locale> localeList63 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList63, localeArray62);
        java.util.List<java.util.Locale> localeList65 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.util.Locale>) localeList63);
        java.util.Locale locale66 = java.util.Locale.lookup(languageRangeList24, (java.util.Collection<java.util.Locale>) localeList63);
        java.util.List<java.util.Locale> localeList67 = java.util.Locale.filter(languageRangeList22, (java.util.Collection<java.util.Locale>) localeList63);
        java.util.Locale.FilteringMode filteringMode68 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList69 = java.util.Locale.filter(languageRangeList17, (java.util.Collection<java.util.Locale>) localeList67, filteringMode68);
        boolean boolean70 = languageRangeList3.remove((java.lang.Object) localeList69);
        java.util.List<java.util.Locale> localeList71 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList69);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(languageRangeSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(languageRangeItor10);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(languageRangeList22);
        org.junit.Assert.assertNotNull(languageRangeList24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "english" + "'", str34, "english");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "i");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "China" + "'", str40, "China");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "zh-CN" + "'", str41, "zh-CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "i");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "China" + "'", str44, "China");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "i");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "China" + "'", str47, "China");
        org.junit.Assert.assertEquals(locale51.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "i");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "China" + "'", str54, "China");
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "ko");
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(localeList65);
        org.junit.Assert.assertNull(locale66);
        org.junit.Assert.assertNotNull(localeList67);
        org.junit.Assert.assertTrue("'" + filteringMode68 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode68.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(localeList71);
    }

    @Test
    public void test19262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19262");
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
        java.lang.Object[] objArray18 = languageRangeList13.toArray();
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap23 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, strMap23);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream25 = languageRangeList21.stream();
        boolean boolean26 = languageRangeList21.isEmpty();
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList21, '#');
        boolean boolean29 = languageRangeList13.addAll(0, (java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = languageRangeList13.subList((int) (short) 0, 336);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 336");
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
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(languageRangeList24);
        org.junit.Assert.assertNotNull(languageRangeStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test19263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19263");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HINDI", "Engl                                                          zh_C                                                          s                                                          zh_C                                                          ", 27, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HINDIEngl                                                          zh_C                                                          s                                                          zh_C                                                          " + "'", str4, "HINDIEngl                                                          zh_C                                                          s                                                          zh_C                                                          ");
    }

    @Test
    public void test19264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19264");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale locale4 = builder2.build();
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale6.getLanguage();
        java.lang.String str8 = locale6.getLanguage();
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.lang.String str14 = locale13.getDisplayLanguage();
        java.lang.String str15 = locale11.getDisplayScript(locale13);
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale17);
        java.lang.String str19 = locale11.getDisplayCountry(locale17);
        java.lang.String str20 = locale9.getDisplayScript(locale11);
        java.util.Locale.setDefault(locale9);
        java.util.Locale locale25 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale26 = java.util.Locale.ITALIAN;
        java.util.Locale locale28 = new java.util.Locale("");
        java.lang.String str29 = locale28.getDisplayLanguage();
        java.util.Locale locale30 = java.util.Locale.CANADA;
        java.lang.String str31 = locale30.getDisplayLanguage();
        java.lang.String str32 = locale28.getDisplayScript(locale30);
        java.util.Locale locale34 = java.util.Locale.FRANCE;
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale34);
        java.lang.String str36 = locale28.getDisplayCountry(locale34);
        java.lang.String str37 = locale26.getDisplayScript(locale28);
        java.util.Locale.setDefault(locale26);
        java.lang.String str39 = locale25.getDisplayVariant(locale26);
        java.lang.String str40 = locale9.getDisplayLanguage(locale26);
        java.lang.String str41 = locale6.getDisplayLanguage(locale26);
        java.util.Locale locale42 = locale26.stripExtensions();
        java.util.Locale locale43 = java.util.Locale.ITALIAN;
        java.util.Locale locale45 = new java.util.Locale("");
        java.lang.String str46 = locale45.getDisplayLanguage();
        java.util.Locale locale47 = java.util.Locale.CANADA;
        java.lang.String str48 = locale47.getDisplayLanguage();
        java.lang.String str49 = locale45.getDisplayScript(locale47);
        java.util.Locale locale51 = java.util.Locale.FRANCE;
        java.lang.String str52 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale51);
        java.lang.String str53 = locale45.getDisplayCountry(locale51);
        java.lang.String str54 = locale43.getDisplayScript(locale45);
        java.util.Locale locale55 = java.util.Locale.GERMAN;
        java.lang.String str56 = locale45.getDisplayLanguage(locale55);
        java.util.Locale locale59 = new java.util.Locale("");
        java.lang.String str60 = locale59.getDisplayLanguage();
        java.util.Locale locale61 = java.util.Locale.CANADA;
        java.lang.String str62 = locale61.getDisplayLanguage();
        java.lang.String str63 = locale59.getDisplayScript(locale61);
        java.lang.String str64 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale59);
        java.lang.String str65 = locale59.getDisplayScript();
        java.lang.String str66 = locale55.getDisplayLanguage(locale59);
        java.lang.String str67 = locale26.getDisplayName(locale59);
        java.lang.String str68 = locale26.getDisplayCountry();
        java.lang.String str69 = locale4.getDisplayLanguage(locale26);
        java.lang.String[] strArray72 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "francese");
        boolean boolean73 = locale4.equals((java.lang.Object) "francese");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "it" + "'", str7, "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "it" + "'", str8, "it");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "inglese" + "'", str14, "inglese");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "english" + "'", str18, "english");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale25.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it");
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "inglese" + "'", str31, "inglese");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "english" + "'", str35, "english");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "cHINA" + "'", str39, "cHINA");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "italiano" + "'", str40, "italiano");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "italiano" + "'", str41, "italiano");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "it");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "it");
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "inglese" + "'", str48, "inglese");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "english" + "'", str52, "english");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "de");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "inglese" + "'", str62, "inglese");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "a" + "'", str64, "a");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "German" + "'", str66, "German");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Italian" + "'", str67, "Italian");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test19265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19265");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("l.avajstring[]string[]string[");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "l.avajstring[]string[]string[" + "'", str1, "l.avajstring[]string[]string[");
    }

    @Test
    public void test19266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19266");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\uc911\uad6d", "                      #a#a#a#a#a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19267");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayName();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("String[]", locale4);
        java.lang.String str7 = locale0.getDisplayScript(locale4);
        java.lang.String str8 = locale4.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cinese (Cina)" + "'", str1, "cinese (Cina)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "string[]" + "'", str6, "string[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cina" + "'", str8, "Cina");
    }

    @Test
    public void test19268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19268");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("", locale5);
        java.lang.String str7 = locale3.getDisplayVariant(locale5);
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale9 = java.util.Locale.JAPANESE;
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.lang.String str14 = locale13.getDisplayLanguage();
        java.lang.String str15 = locale11.getDisplayScript(locale13);
        java.lang.String str16 = locale13.getDisplayVariant();
        java.util.Locale locale17 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.lang.String str19 = locale17.getDisplayCountry(locale18);
        java.lang.String str20 = locale18.getDisplayVariant();
        java.lang.String str21 = locale13.getDisplayScript(locale18);
        java.lang.String str22 = locale13.getScript();
        java.lang.String str23 = locale9.getDisplayVariant(locale13);
        java.util.Locale locale24 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str25 = locale24.getDisplayLanguage();
        java.util.Locale locale26 = java.util.Locale.getDefault();
        java.lang.String str27 = locale24.getDisplayCountry(locale26);
        java.util.Locale locale28 = java.util.Locale.TAIWAN;
        java.lang.String str29 = locale28.getVariant();
        java.lang.String str30 = locale24.getDisplayName(locale28);
        java.util.Locale locale31 = locale24.stripExtensions();
        java.lang.String str32 = locale9.getDisplayName(locale31);
        java.util.Locale.setDefault(category0, locale9);
        java.util.Locale locale35 = java.util.Locale.forLanguageTag("FR");
        java.util.Locale.setDefault(category0, locale35);
        java.util.Set<java.lang.Character> charSet37 = locale35.getExtensionKeys();
        java.util.Set<java.lang.Character> charSet38 = locale35.getExtensionKeys();
        java.lang.String str39 = locale35.getISO3Country();
        java.util.Set<java.lang.Character> charSet40 = locale35.getExtensionKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ja");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u82f1\u6587" + "'", str14, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Cina" + "'", str19, "Cina");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u4e2d\u6587" + "'", str25, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Taiwan" + "'", str27, "Taiwan");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str30, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u65e5\u6587" + "'", str32, "\u65e5\u6587");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr");
        org.junit.Assert.assertNotNull(charSet37);
        org.junit.Assert.assertNotNull(charSet38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charSet40);
    }

    @Test
    public void test19269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19269");
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
        java.util.Locale locale16 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        boolean boolean18 = locale16.hasExtensions();
        java.lang.String str19 = locale16.getVariant();
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.upperCase("String", locale16);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.lowerCase("chinChinChinChinChiChinChinChinChinC", locale16);
        java.util.Set<java.lang.String> strSet22 = locale16.getUnicodeLocaleAttributes();
        java.lang.String str23 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet22);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream24 = languageRangeList2.parallelStream();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(languageRangeStream12);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "STRING" + "'", str20, "STRING");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chinchinchinchinchichinchinchinchinc" + "'", str21, "chinchinchinchinchichinchinchinchinc");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(languageRangeStream24);
    }

    @Test
    public void test19270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19270");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "ChinChinChinChinChinChinChinChinChinaaaaaaaaa$ChinChinChinChinChinChinChinChinChinaaaaaaaaa$ChinChinChinChinChinChinChinChinChinaaaaaaafr-FRSTI-FChinChinChinChinChinChinChinChinChinaaaaaaaaa$ChinChinChinChinChinChinChinChinChinaaaaaaaaa$ChinChinChinChinChinChinChinChinChinaaaaaaa", (java.lang.CharSequence) "chinchinchinchinchinchinchinchinchinaaaaaaaaa#");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "ChinChinChinChinChinChinChinChinChinaaaaaaaaa$ChinChinChinChinChinChinChinChinChinaaaaaaaaa$ChinChinChinChinChinChinChinChinChinaaaaaaafr-FRSTI-FChinChinChinChinChinChinChinChinChinaaaaaaaaa$ChinChinChinChinChinChinChinChinChinaaaaaaaaa$ChinChinChinChinChinChinChinChinChinaaaaaaa" + "'", charSequence2, "ChinChinChinChinChinChinChinChinChinaaaaaaaaa$ChinChinChinChinChinChinChinChinChinaaaaaaaaa$ChinChinChinChinChinChinChinChinChinaaaaaaafr-FRSTI-FChinChinChinChinChinChinChinChinChinaaaaaaaaa$ChinChinChinChinChinChinChinChinChinaaaaaaaaa$ChinChinChinChinChinChinChinChinChinaaaaaaa");
    }

    @Test
    public void test19271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19271");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("A][gnirts", ' ');
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A][gnirts" + "'", str4, "A][gnirts");
    }

    @Test
    public void test19272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19272");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "HINDI(hi!,China)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19273");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\u5fb7\u6587", "FRA)))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19274");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("zhcines", "#########################English", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19275");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str1, "\u4e2d\u6587\u53f0\u7063)");
    }

    @Test
    public void test19276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19276");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("     Chine");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chine" + "'", str1, "Chine");
    }

    @Test
    public void test19277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19277");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream3 = languageRangeList1.parallelStream();
        languageRangeList1.clear();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator5 = languageRangeList1.spliterator();
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "zho", (int) 'u', (int) (short) 0);
        boolean boolean14 = languageRangeList1.remove((java.lang.Object) "zho");
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, strMap18);
        int int20 = languageRangeList16.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList22 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean24 = languageRangeList22.remove((java.lang.Object) "English");
        boolean boolean25 = languageRangeList16.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22);
        boolean boolean26 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, strMap27);
        java.util.Locale locale29 = java.util.Locale.ITALIAN;
        java.util.Locale locale31 = new java.util.Locale("");
        java.lang.String str32 = locale31.getDisplayLanguage();
        java.util.Locale locale33 = java.util.Locale.CANADA;
        java.lang.String str34 = locale33.getDisplayLanguage();
        java.lang.String str35 = locale31.getDisplayScript(locale33);
        java.util.Locale locale37 = java.util.Locale.FRANCE;
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale37);
        java.lang.String str39 = locale31.getDisplayCountry(locale37);
        java.lang.String str40 = locale29.getDisplayScript(locale31);
        java.util.Locale locale41 = java.util.Locale.GERMAN;
        java.lang.String str42 = locale31.getDisplayLanguage(locale41);
        java.util.Locale locale45 = new java.util.Locale("");
        java.lang.String str46 = locale45.getDisplayLanguage();
        java.util.Locale locale47 = java.util.Locale.CANADA;
        java.lang.String str48 = locale47.getDisplayLanguage();
        java.lang.String str49 = locale45.getDisplayScript(locale47);
        java.lang.String str50 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale45);
        java.lang.String str51 = locale45.getDisplayScript();
        java.lang.String str52 = locale41.getDisplayLanguage(locale45);
        java.lang.String str53 = locale41.getCountry();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList55 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray56 = languageRangeList55.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList58 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray59 = languageRangeList58.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator60 = languageRangeList58.spliterator();
        boolean boolean61 = languageRangeList55.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList58);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor62 = languageRangeList55.iterator();
        java.util.Locale.Builder builder63 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder64 = builder63.clearExtensions();
        java.util.Locale.Builder builder66 = builder64.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder68 = builder66.setLanguage("it");
        boolean boolean69 = languageRangeList55.remove((java.lang.Object) builder68);
        java.util.Locale.Builder builder71 = builder68.setLanguageTag("CINESE");
        java.util.Locale locale73 = java.util.Locale.forLanguageTag("HI");
        java.util.Locale.Builder builder74 = builder68.setLocale(locale73);
        java.lang.String str75 = locale41.getDisplayVariant(locale73);
        java.util.Set<java.lang.String> strSet76 = locale73.getUnicodeLocaleAttributes();
        java.lang.String str77 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strSet76);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeStream3);
        org.junit.Assert.assertNotNull(languageRangeSpliterator5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(languageRangeList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "it");
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "anglais" + "'", str34, "anglais");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "english" + "'", str38, "english");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "de");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "anglais" + "'", str48, "anglais");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "a" + "'", str50, "a");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "German" + "'", str52, "German");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(languageRangeList55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(languageRangeList58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(languageRangeSpliterator60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(languageRangeItor62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "hi");
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(strSet76);
        org.junit.Assert.assertNull(str77);
    }

    @Test
    public void test19278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19278");
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
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor30 = languageRangeList13.listIterator();
        java.lang.Object[] objArray31 = languageRangeList13.toArray();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor32 = languageRangeList13.listIterator();
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList13, '$');
        java.util.Locale locale35 = java.util.Locale.CANADA;
        java.lang.String str36 = locale35.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet37 = locale35.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList38 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strSet37);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "anglais" + "'", str21, "anglais");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "a" + "'", str23, "a");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(languageRangeItor30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(languageRangeItor32);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "anglais" + "'", str36, "anglais");
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(strList38);
    }

    @Test
    public void test19279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19279");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#.FilteringMode", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#.FilteringMode");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19280");
        char[] charArray8 = new char[] { '#', '#', ' ' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "CN", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                 a                 ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                tw                                                ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19281");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("AN       english4444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AN       english444444444444444444444444444" + "'", str1, "AN       english444444444444444444444444444");
    }

    @Test
    public void test19282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19282");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "java");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19283");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19284");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.setLanguage("Engls");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale locale10 = java.util.Locale.PRC;
        java.lang.String str11 = locale10.getDisplayName();
        boolean boolean12 = locale10.hasExtensions();
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet15 = locale14.getExtensionKeys();
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.lowerCase("String[]", locale14);
        java.lang.String str17 = locale10.getDisplayScript(locale14);
        java.util.Locale locale18 = locale10.stripExtensions();
        java.util.Locale.Builder builder19 = builder9.setLocale(locale10);
        java.lang.String str21 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) builder19, "cinese (Cina)");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chinois (Chine)" + "'", str11, "chinois (Chine)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "string[]" + "'", str16, "string[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.util" + "'", str21, "java.util");
    }

    @Test
    public void test19285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19285");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("$$$$");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19286");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("Anzh_TWAnzh_TWAnzh_TWAnzh_TWAnen-ca", 279);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19287");
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
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor19 = languageRangeList16.listIterator();
        java.util.Locale.LanguageRange languageRange20 = languageRangeItor19.next();
        java.util.Locale.LanguageRange languageRange21 = languageRangeItor19.next();
        java.lang.String str22 = languageRange21.getRange();
        java.lang.String str23 = languageRange21.getRange();
        java.lang.String str24 = languageRange21.getRange();
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
        org.junit.Assert.assertNotNull(languageRange20);
        org.junit.Assert.assertNotNull(languageRange21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "english" + "'", str22, "english");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "english" + "'", str23, "english");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "english" + "'", str24, "english");
    }

    @Test
    public void test19288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19288");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("esesenichz");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=esesenichz");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19289");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("java.util.stream", "xxx", "!HI!HI!HI!HI!HI!HENGLISH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.util.stream" + "'", str3, "java.util.stream");
    }

    @Test
    public void test19290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19290");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "aaabaeafakamanarasavayazbabebgbhbibmbnbobrbscacechcocrcscucvcydadedvdzeeeleneoeseteufafffifjfofrfygagdglgngugvhahehihohrhthuhyhziaidieigiiikinioisitiuiwjajijvkakgkikjkkklkmknkokrkskukvkwkylalblglilnloltlulvmgmhmimkmlmnmomrmsmtmynanbndnengnlnnnonrnvnyocojomorospapiplpsptqurmrnrorurwsascsdsesgsiskslsmsnsosqsrssstsusvswtatetgthtitktltntotrtstttwtyugukuruzvevivowawoxhyiyozazhzu", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: aaabaeafakamanarasavayazbabebgbhbibmbnbobrbscacechcocrcscucvcydadedvdzeeeleneoeseteufafffifjfofrfygagdglgngugvhahehihohrhthuhyhziaidieigiiikinioisitiuiwjajijvkakgkikjkkklkmknkokrkskukvkwkylalblglilnloltlulvmgmhmimkmlmnmomrmsmtmynanbndnengnlnnnonrnvnyocojomorospapiplpsptqurmrnrorurwsascsdsesgsiskslsmsnsosqsrssstsusvswtatetgthtitktltntotrtstttwtyugukuruzvevivowawoxhyiyozazhzu");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19291");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxx", (double) 107);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=107.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19292");
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
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.split("english", '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray16);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray16);
        java.lang.Object[] objArray19 = languageRangeList11.toArray((java.lang.Object[]) strArray16);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".", "HI");
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.stripAll(strArray22, "French (France)");
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray22);
        boolean boolean26 = languageRangeList11.contains((java.lang.Object) wildcardClassArray25);
        java.lang.Class[] classArray28 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray28);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray28);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray28);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray32);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray32);
        boolean boolean36 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray25, wildcardClassArray34, true);
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
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "english" + "'", str17, "english");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "english" + "'", str18, "english");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[null]");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test19293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19293");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "$$$", "h                                                gnalesenic.esenicavaj                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test19294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19294");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u6e7e\u53f0\u8a9e\u56fd\u4e2d" + "'", str1, "\u6e7e\u53f0\u8a9e\u56fd\u4e2d");
    }

    @Test
    public void test19295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19295");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("esenicavaj                                                ", (double) 822);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=822.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19296");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("redliub.elacol", "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engl", "$English (Canada)(JAVA.LANG)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "redliub.elacol" + "'", str3, "redliub.elacol");
    }

    @Test
    public void test19297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19297");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHind", "       Locale.Category", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19298");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean3 = languageRangeList1.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale8);
        java.util.Locale locale10 = java.util.Locale.US;
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale13 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = locale13.getDisplayCountry(locale14);
        java.lang.String str16 = locale13.toLanguageTag();
        java.util.Locale locale17 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.lang.String str19 = locale17.getDisplayCountry(locale18);
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str22 = locale20.getDisplayCountry(locale21);
        java.util.Locale locale26 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale27 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale27.getDisplayCountry(locale28);
        java.util.Locale locale31 = new java.util.Locale("");
        java.lang.String str32 = locale31.getDisplayVariant();
        java.util.Locale locale33 = java.util.Locale.KOREAN;
        java.util.Locale locale35 = new java.util.Locale("");
        java.util.Locale locale36 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray37 = new java.util.Locale[] { locale8, locale10, locale11, locale12, locale13, locale18, locale20, locale26, locale28, locale31, locale33, locale35, locale36 };
        java.util.ArrayList<java.util.Locale> localeList38 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList38, localeArray37);
        java.util.List<java.util.Locale> localeList40 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.List<java.util.Locale> localeList41 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.Locale.LanguageRange[] languageRangeArray42 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList43 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43, languageRangeArray42);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, strMap45);
        int int47 = languageRangeList43.size();
        java.util.Locale.LanguageRange languageRange49 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange51 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange53 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] { languageRange49, languageRange51, languageRange53 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        boolean boolean57 = languageRangeList43.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55);
        boolean boolean58 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap59 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList60 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, strMap59);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap62 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList63 = java.util.Locale.LanguageRange.parse("Cina", strMap62);
        java.util.Locale.LanguageRange languageRange65 = new java.util.Locale.LanguageRange("English");
        java.lang.String str67 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange65, "");
        java.lang.String str68 = languageRange65.getRange();
        boolean boolean69 = languageRangeList63.add(languageRange65);
        boolean boolean70 = languageRangeList43.add(languageRange65);
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator71 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList43.replaceAll(languageRangeUnaryOperator71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "english" + "'", str9, "english");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cina" + "'", str15, "Cina");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh-CN" + "'", str16, "zh-CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Cina" + "'", str19, "Cina");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cina" + "'", str22, "Cina");
        org.junit.Assert.assertEquals(locale26.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "it");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Cina" + "'", str29, "Cina");
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko");
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(localeList40);
        org.junit.Assert.assertNotNull(localeList41);
        org.junit.Assert.assertNotNull(languageRangeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(languageRangeList46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(languageRangeList60);
        org.junit.Assert.assertNotNull(languageRangeList63);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Locale.LanguageRange" + "'", str67, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "english" + "'", str68, "english");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test19299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19299");
        java.util.Locale locale3 = new java.util.Locale("zh-CNenglish", "Locale.LanguageRange", "");
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale5 = locale3.stripExtensions();
        java.util.Set<java.lang.String> strSet6 = locale3.getUnicodeLocaleKeys();
        java.lang.String str7 = locale3.getVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test19300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19300");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("ANIHC");
        java.util.Locale locale7 = builder3.build();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("An");
        java.util.Locale.Builder builder10 = builder3.setLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder3.setLanguage("#########################English                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: #########################English                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "anihc");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "an");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test19301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19301");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("elacoL", '.');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 24, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 24");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19302");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("IA", "nglais");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19303");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniC");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test19304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587", 209);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19305");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder2.setLanguage("HI");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setScript("                                              italiahi                                              t                                              italiahi                                              l                                              italiahi                                                                                            italiahi                                                                                            italiahi                                              o");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script:                                               italiahi                                              t                                              italiahi                                              l                                              italiahi                                                                                            italiahi                                                                                            italiahi                                              o [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test19306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19306");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("ANIHC");
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        java.util.Locale.Builder builder8 = builder3.clearExtensions();
        java.lang.Class<?> wildcardClass9 = builder3.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test19307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19307");
        java.util.Locale locale4 = new java.util.Locale("zh-CNenglish", "Locale.LanguageRange", "");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("                  HI                   ", locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                  HI                   " + "'", str5, "                  HI                   ");
    }

    @Test
    public void test19308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19308");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale locale4 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleKeys();
        java.lang.String str6 = locale4.getDisplayName();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder11 = builder7.setLocale(locale9);
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder11.addUnicodeLocaleAttribute("engliIlish");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: engliIlish [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test19309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19309");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\u7fa9\u5927\u5229");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19310");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Locale.Builder", "esecnarf");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test19311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19311");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                        f   ch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fch" + "'", str1, "fch");
    }

    @Test
    public void test19312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19312");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("NENENENENENENENENENE", 52, 34);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NENENENENENENENENENE" + "'", str3, "NENENENENENENENENENE");
    }

    @Test
    public void test19313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19313");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAH", "enghI", "nwtsnwtlgne", 528);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAH" + "'", str4, "..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAH");
    }

    @Test
    public void test19314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19314");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "slgneslgneslgnefran\347ais (canada)slgneslgneslgnes");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19315");
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
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList13, "zh");
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor30 = languageRangeList13.iterator();
        java.lang.Object[] objArray31 = languageRangeList13.toArray();
        java.lang.String str33 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) languageRangeList13, "fran\347ais (France)");
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor34 = languageRangeList13.listIterator();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap35 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList36 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, strMap35);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "English" + "'", str21, "English");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "a" + "'", str23, "a");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(languageRangeItor30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ArrayList" + "'", str33, "ArrayList");
        org.junit.Assert.assertNotNull(languageRangeItor34);
        org.junit.Assert.assertNotNull(languageRangeList36);
    }

    @Test
    public void test19316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19316");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("CHN     ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19317");
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strMap4);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream6 = languageRangeList2.stream();
        boolean boolean7 = languageRangeList2.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, strMap11);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor13 = languageRangeList12.listIterator();
        boolean boolean14 = languageRangeList2.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split("english", '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray17);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray17);
        java.lang.Object[] objArray20 = languageRangeList12.toArray((java.lang.Object[]) strArray17);
        int int21 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray17);
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "english" + "'", str18, "english");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "english" + "'", str19, "english");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[null]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test19318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19318");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ahi!hiCinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) 'x', "HInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ahi!hiCinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "ahi!hiCinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test19319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19319");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\u4e2d", "Cnxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d" + "'", str2, "\u4e2d");
    }

    @Test
    public void test19320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19320");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("zh_c", "HI!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test19321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19321");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Local", "HArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLi", "zh-cnenglish (LOCALE.LANGUAGERANGE)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nocnl" + "'", str3, "nocnl");
    }

    @Test
    public void test19322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19322");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "ANIHCANIHC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19323");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\u82f1\u8a9e...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e...XXXXXFRENCH(FRANCE)XXXXXXXXXX...XXXXXFRENCH(FRANCE)XXXXXXXXXX.." + "'", str1, "\u82f1\u8a9e...XXXXXFRENCH(FRANCE)XXXXXXXXXX...XXXXXFRENCH(FRANCE)XXXXXXXXXX..");
    }

    @Test
    public void test19324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19324");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("ESECNARF", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ESECNARF" + "'", str2, "ESECNARF");
    }

    @Test
    public void test19325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19325");
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
        languageRangeList1.clear();
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "javacinese.cineselang");
        int int25 = languageRangeList1.lastIndexOf((java.lang.Object) "java . lang");
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap29 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, strMap29);
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        boolean boolean34 = languageRangeList27.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32);
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap38 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList39 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, strMap38);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        boolean boolean43 = languageRangeList36.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41);
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList41, "hi!");
        boolean boolean46 = languageRangeList27.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList48 = java.util.Locale.LanguageRange.parse("Chinese");
        boolean boolean49 = languageRangeList41.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48);
        java.lang.String[] strArray51 = org.apache.commons.lang3.StringUtils.split("allemand");
        boolean boolean52 = languageRangeList41.remove((java.lang.Object) strArray51);
        java.util.Locale.LanguageRange[] languageRangeArray53 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList54 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList54, languageRangeArray53);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap56 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList57 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList54, strMap56);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream58 = languageRangeList54.stream();
        boolean boolean59 = languageRangeList54.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray60 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList61 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61, languageRangeArray60);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap63 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList64 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList61, strMap63);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor65 = languageRangeList64.listIterator();
        boolean boolean66 = languageRangeList54.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64);
        java.lang.String str68 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) languageRangeList64, "Chinese");
        java.lang.String[] strArray72 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Chin", "english");
        boolean boolean73 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                    ", strArray72);
        boolean boolean74 = languageRangeList64.equals((java.lang.Object) strArray72);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream75 = languageRangeList64.parallelStream();
        boolean boolean77 = languageRangeList64.remove((java.lang.Object) "A");
        boolean boolean79 = languageRangeList64.equals((java.lang.Object) "ENG");
        boolean boolean80 = languageRangeList41.contains((java.lang.Object) languageRangeList64);
        int int81 = languageRangeList64.size();
        boolean boolean82 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(languageRangeList39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(languageRangeList48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(languageRangeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(languageRangeList57);
        org.junit.Assert.assertNotNull(languageRangeStream58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(languageRangeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(languageRangeList64);
        org.junit.Assert.assertNotNull(languageRangeItor65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "java.util" + "'", str68, "java.util");
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(languageRangeStream75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test19326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19326");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("EnglTWNsTWN", '$');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19327");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\u672c\u65e5", "...   gnalesenic.esenicavaj                                                Ih                                     ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19328");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ad.fr_CAzw                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", "zh_c");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19329");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) builder3, "CHNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.util.Locale.Builder builder8 = builder3.setLanguageTag("CN");
        java.util.Locale.Category category9 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale10 = java.util.Locale.getDefault(category9);
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.lang.String str13 = locale11.getDisplayScript();
        java.util.Locale.setDefault(category9, locale11);
        java.util.Locale locale15 = java.util.Locale.getDefault(category9);
        java.lang.String str16 = locale15.getDisplayVariant();
        java.util.Locale.Builder builder17 = builder8.setLocale(locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = locale15.getUnicodeLocaleType("italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxx");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxx");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Locale.Builder" + "'", str6, "Locale.Builder");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category9.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test19330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19330");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...istfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayL...", 47);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19331");
        java.util.Locale locale1 = new java.util.Locale("chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale3);
        java.util.Locale.setDefault(locale3);
        java.lang.String str6 = locale3.getCountry();
        java.lang.String str7 = locale1.getDisplayVariant(locale3);
        java.util.Locale locale8 = locale1.stripExtensions();
        java.lang.String str9 = locale8.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "english" + "'", str4, "english");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FR" + "'", str6, "FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str9, "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test19332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19332");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("I!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!" + "'", str2, "I!");
    }

    @Test
    public void test19333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19333");
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
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator16 = languageRangeList13.spliterator();
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, strMap20);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        boolean boolean25 = languageRangeList18.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList23, "hi!");
        int int28 = languageRangeList23.size();
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList23, '4');
        boolean boolean31 = languageRangeList13.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23);
        java.util.Locale.Builder builder32 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder33 = builder32.clearExtensions();
        java.util.Locale.Builder builder35 = builder33.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder37 = builder35.setLanguage("it");
        java.util.Locale locale38 = builder37.build();
        java.util.Locale locale39 = builder37.build();
        java.util.Locale.Builder builder41 = builder37.setRegion("");
        int int42 = languageRangeList23.indexOf((java.lang.Object) "");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeSpliterator16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "it_CN");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it_CN");
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test19334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19334");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                    ", "A");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "$");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "ANIHC               EN_ca                                                                 ", 10, 248);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test19335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19335");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("redliuB.elacoL                            ", (double) 94);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=94.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19336");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.lang.String str11 = locale8.getDisplayCountry(locale10);
        java.util.Locale locale12 = java.util.Locale.TAIWAN;
        java.lang.String str13 = locale12.getVariant();
        java.lang.String str14 = locale8.getDisplayName(locale12);
        java.util.Locale.Builder builder15 = builder7.setLocale(locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder7.setLanguage("                                                                                                                                                                                                              xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn44444");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language:                                                                                                                                                                                                               xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn44444 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "china_CN");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chinois" + "'", str9, "chinois");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Taiwan" + "'", str11, "Taiwan");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str14, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test19337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19337");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("##Italian");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test19338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19338");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXCHN     ", 6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19339");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.lang.String str5 = locale1.getDisplayScript(locale3);
        java.lang.String str6 = locale3.getDisplayVariant();
        java.util.Locale locale7 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.lang.String str9 = locale7.getDisplayCountry(locale8);
        java.lang.String str10 = locale8.getDisplayVariant();
        java.lang.String str11 = locale3.getDisplayScript(locale8);
        java.util.Locale locale12 = java.util.Locale.CANADA;
        boolean boolean13 = locale12.hasExtensions();
        java.lang.String str14 = locale8.getDisplayName(locale12);
        java.util.Locale locale15 = locale12.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = locale15.getUnicodeLocaleType("ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za....");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za....");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anglais" + "'", str4, "anglais");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chine" + "'", str9, "Chine");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "French (France)" + "'", str14, "French (France)");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_CA");
    }

    @Test
    public void test19340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19340");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale6);
        java.util.Locale locale8 = java.util.Locale.US;
        java.util.Locale locale9 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale11 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.lang.String str13 = locale11.getDisplayCountry(locale12);
        java.lang.String str14 = locale11.toLanguageTag();
        java.util.Locale locale15 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.lang.String str17 = locale15.getDisplayCountry(locale16);
        java.util.Locale locale18 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.lang.String str20 = locale18.getDisplayCountry(locale19);
        java.util.Locale locale24 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale25 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale26 = java.util.Locale.getDefault();
        java.lang.String str27 = locale25.getDisplayCountry(locale26);
        java.util.Locale locale29 = new java.util.Locale("");
        java.lang.String str30 = locale29.getDisplayVariant();
        java.util.Locale locale31 = java.util.Locale.KOREAN;
        java.util.Locale locale33 = new java.util.Locale("");
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray35 = new java.util.Locale[] { locale6, locale8, locale9, locale10, locale11, locale16, locale18, locale24, locale26, locale29, locale31, locale33, locale34 };
        java.util.ArrayList<java.util.Locale> localeList36 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList36, localeArray35);
        java.util.List<java.util.Locale> localeList38 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList36);
        java.util.List<java.util.Locale> localeList39 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream40 = languageRangeList1.parallelStream();
        boolean boolean42 = languageRangeList1.remove((java.lang.Object) "francese");
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator43 = languageRangeList1.spliterator();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor44 = languageRangeList1.listIterator();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "english" + "'", str7, "english");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chine" + "'", str13, "Chine");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-CN" + "'", str14, "zh-CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Chine" + "'", str17, "Chine");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Chine" + "'", str20, "Chine");
        org.junit.Assert.assertEquals(locale24.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Chine" + "'", str27, "Chine");
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko");
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(localeList38);
        org.junit.Assert.assertNotNull(localeList39);
        org.junit.Assert.assertNotNull(languageRangeStream40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(languageRangeSpliterator43);
        org.junit.Assert.assertNotNull(languageRangeItor44);
    }

    @Test
    public void test19341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19341");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("REFERENCEPIPELINE.HEAD", "hI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI", "                                     France");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test19342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19342");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ANIHC      ", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
        boolean boolean8 = languageRangeList7.isEmpty();
        boolean boolean9 = languageRangeList2.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        int int10 = languageRangeList2.size();
        java.util.Collection<java.util.Locale.LanguageRange> languageRangeCollection11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = languageRangeList2.addAll(languageRangeCollection11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test19343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19343");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\u6cd5\u6587");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "italiaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitacan               ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587" + "'", str3, "\u6cd5\u6587");
    }

    @Test
    public void test19344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19344");
        java.util.Locale locale3 = new java.util.Locale("zh-CNenglish", "Locale.LanguageRange", "");
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale8 = new java.util.Locale("hi", "hi!", "cHINA");
        java.lang.String str9 = locale8.getDisplayVariant();
        java.util.Locale locale10 = locale8.stripExtensions();
        java.util.Locale locale14 = new java.util.Locale("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish", "IA", "zh_CN");
        java.util.Locale locale17 = new java.util.Locale("zho", "US");
        java.util.Locale locale18 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str19 = locale17.getDisplayVariant(locale18);
        java.lang.String str20 = locale14.getDisplayName(locale18);
        java.lang.String str21 = locale18.toLanguageTag();
        java.lang.String str22 = locale10.getDisplayCountry(locale18);
        java.lang.String str24 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) locale18, "################################################################################");
        java.lang.String str25 = locale3.getDisplayVariant(locale18);
        java.lang.String str27 = locale3.getExtension('u');
        java.lang.String str28 = locale3.getLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertEquals(locale8.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "cHINA" + "'", str9, "cHINA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals(locale14.toString(), "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish_IA_zh_CN");
        org.junit.Assert.assertEquals(locale17.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (IA,zh,CN)" + "'", str20, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (IA,zh,CN)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "fr-CA" + "'", str21, "fr-CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HI!" + "'", str22, "HI!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.util" + "'", str24, "java.util");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "zh-cnenglish" + "'", str28, "zh-cnenglish");
    }

    @Test
    public void test19345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19345");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
    }

    @Test
    public void test19346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19346");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("               class java.lang.String               ", "                                               javacinese.cineselang                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               class java.lang.String               " + "'", str2, "               class java.lang.String               ");
    }

    @Test
    public void test19347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19347");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                          a                         ", "Anzh_TWAnzh_TWAnzh_TWAnzh_TWAnen-ca");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          a                         " + "'", str2, "                          a                         ");
    }

    @Test
    public void test19348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19348");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("ZW", "D U ", (int) (short) 10, 528);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ZWD U " + "'", str4, "ZWD U ");
    }

    @Test
    public void test19349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19349");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("                                                                                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19350");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("REFERENCEPIPELINE.HEAD                        list###########", "ahi!hiCinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19351");
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
        java.lang.Class[] classArray34 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray34);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray34);
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray39);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray39);
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray39, "zh-CN");
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, (java.lang.Class<?>[]) classArray39);
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray37, false);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
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
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
    }

    @Test
    public void test19352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19352");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("AHI!HI!", 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHI!HI!" + "'", str2, "AHI!HI!");
    }

    @Test
    public void test19353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19353");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#", 94);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#" + "'", str2, "a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#");
    }

    @Test
    public void test19354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19354");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AN                 a                 AN  ", (java.lang.CharSequence) "cinese (Cina)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
    }

    @Test
    public void test19355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19355");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("Z", ".][gnirts.", "\u0939\u093f\u0902\u0926\u0940 (HI!,cHINA)              ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test19356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19356");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "             AN       A", "               class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.Str                      hArrayList");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19357");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale.Builder builder7 = builder3.setScript("anih");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test19358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19358");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchnxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchnxxxxxxxxxxxxxxxxxxxxxxxxxnglais");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchnxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchnxxxxxxxxxxxxxxxxxxxxxxxxxnglais");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19359");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("zh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglish", (int) (short) 1, 16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-cnenglishc..." + "'", str3, "zh-cnenglishc...");
    }

    @Test
    public void test19360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19360");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("                                                                                   hindi (hi!,china)");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hindi(hi!,china)");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19361");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaahrrylist", "Ci_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test19362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19362");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean3 = languageRangeList1.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale8);
        java.util.Locale locale10 = java.util.Locale.US;
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale13 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = locale13.getDisplayCountry(locale14);
        java.lang.String str16 = locale13.toLanguageTag();
        java.util.Locale locale17 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.lang.String str19 = locale17.getDisplayCountry(locale18);
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str22 = locale20.getDisplayCountry(locale21);
        java.util.Locale locale26 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale27 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale27.getDisplayCountry(locale28);
        java.util.Locale locale31 = new java.util.Locale("");
        java.lang.String str32 = locale31.getDisplayVariant();
        java.util.Locale locale33 = java.util.Locale.KOREAN;
        java.util.Locale locale35 = new java.util.Locale("");
        java.util.Locale locale36 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray37 = new java.util.Locale[] { locale8, locale10, locale11, locale12, locale13, locale18, locale20, locale26, locale28, locale31, locale33, locale35, locale36 };
        java.util.ArrayList<java.util.Locale> localeList38 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList38, localeArray37);
        java.util.List<java.util.Locale> localeList40 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.List<java.util.Locale> localeList41 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator42 = languageRangeList1.spliterator();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap43 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList44 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap43);
        java.lang.Object[] objArray45 = languageRangeList1.toArray();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "english" + "'", str9, "english");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "China" + "'", str15, "China");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh-CN" + "'", str16, "zh-CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "China" + "'", str19, "China");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "China" + "'", str22, "China");
        org.junit.Assert.assertEquals(locale26.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "China" + "'", str29, "China");
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko");
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(localeList40);
        org.junit.Assert.assertNotNull(localeList41);
        org.junit.Assert.assertNotNull(languageRangeSpliterator42);
        org.junit.Assert.assertNotNull(languageRangeList44);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test19363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19363");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("rg  cn    United Kingdom  cn    United Kingd", "chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 22);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19364");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("I!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!H" + "'", str1, "I!H");
    }

    @Test
    public void test19365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19365");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19366");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("glish  hieNdi (hi!,eNhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "glish  hieNdi (hi!,eNhi" + "'", str1, "glish  hieNdi (hi!,eNhi");
    }

    @Test
    public void test19367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19367");
        java.util.Locale locale2 = new java.util.Locale("...X.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN...", "italiano");
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Locale locale4 = locale2.stripExtensions();
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) locale4, "\u5357\u97d3");
        org.junit.Assert.assertEquals(locale2.toString(), "...x.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn..._ITALIANO");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "...x.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn..._ITALIANO");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.util" + "'", str6, "java.util");
    }

    @Test
    public void test19368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19368");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("xxxxxxxxxxxxxxxxxxxxxxxTRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]xxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxTRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]xxxxxxxxxxxxxxxxxxxxxxx" + "'", str1, "xxxxxxxxxxxxxxxxxxxxxxxTRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]xxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test19369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19369");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("rance)Itali", "slgne");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rance)Itali" + "'", str2, "rance)Itali");
    }

    @Test
    public void test19370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19370");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "zho", (int) 'u', (int) (short) 0);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concatWith("INA................................................................................................", (java.lang.Object[]) strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "English" + "'", str10, "English");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "English" + "'", str11, "English");
    }

    @Test
    public void test19371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19371");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("china-CN", "String");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "china-CN" + "'", str2, "china-CN");
    }

    @Test
    public void test19372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19372");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("lang (ITHI!LIHI!NO,xxx)", "$$$$");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19373");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                  cinese", 42, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".........                  cinese........." + "'", str3, ".........                  cinese.........");
    }

    @Test
    public void test19374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19374");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...", "A#A#A#A#A#", 5);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19375");
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
        java.lang.String str13 = locale2.getCountry();
        java.lang.String str14 = locale2.getLanguage();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap16 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.parse("cHINA", strMap16);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("CN");
        java.util.Locale locale20 = java.util.Locale.CANADA;
        boolean boolean21 = locale20.hasExtensions();
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.lang.String str23 = locale20.getDisplayScript(locale22);
        java.lang.String str24 = locale19.getDisplayCountry(locale20);
        java.lang.String str25 = locale20.getISO3Language();
        int int26 = languageRangeList17.indexOf((java.lang.Object) locale20);
        java.lang.String str27 = locale2.getDisplayName(locale20);
        java.lang.String str28 = locale2.getDisplayVariant();
        java.util.Locale locale29 = java.util.Locale.KOREAN;
        java.lang.String str30 = locale2.getDisplayCountry(locale29);
        java.lang.String str31 = locale29.getISO3Language();
        java.lang.String str32 = locale29.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u82f1\u8a9e" + "'", str5, "\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "english" + "'", str9, "english");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "cn");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "eng" + "'", str25, "eng");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "kor" + "'", str31, "kor");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ko" + "'", str32, "ko");
    }

    @Test
    public void test19376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19376");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Cina", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("Cina", strMap4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList5, strMap6);
        boolean boolean8 = languageRangeList2.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, "italiano");
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test19377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19377");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween(".BL.BM.BN..._italiano", "lang)", "GNAL.AVAJSTRING[]STRING[]STRING[]");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test19378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19378");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("allemand", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
    }

    @Test
    public void test19379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19379");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("englCNsCNxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "englCNsCNxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str1, "englCNsCNxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test19380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19380");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("rg  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test19381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19381");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("ANIHC");
        java.util.Locale locale7 = builder3.build();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale locale10 = builder8.build();
        java.util.Locale locale11 = builder8.build();
        java.lang.String str13 = locale11.getExtension('a');
        java.lang.String str14 = locale7.getDisplayName(locale11);
        java.util.Set<java.lang.String> strSet15 = locale11.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "anihc");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "anihc" + "'", str14, "anihc");
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test19382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19382");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean3 = languageRangeList1.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale8);
        java.util.Locale locale10 = java.util.Locale.US;
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale13 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = locale13.getDisplayCountry(locale14);
        java.lang.String str16 = locale13.toLanguageTag();
        java.util.Locale locale17 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.lang.String str19 = locale17.getDisplayCountry(locale18);
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str22 = locale20.getDisplayCountry(locale21);
        java.util.Locale locale26 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale27 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale27.getDisplayCountry(locale28);
        java.util.Locale locale31 = new java.util.Locale("");
        java.lang.String str32 = locale31.getDisplayVariant();
        java.util.Locale locale33 = java.util.Locale.KOREAN;
        java.util.Locale locale35 = new java.util.Locale("");
        java.util.Locale locale36 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray37 = new java.util.Locale[] { locale8, locale10, locale11, locale12, locale13, locale18, locale20, locale26, locale28, locale31, locale33, locale35, locale36 };
        java.util.ArrayList<java.util.Locale> localeList38 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList38, localeArray37);
        java.util.List<java.util.Locale> localeList40 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.List<java.util.Locale> localeList41 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.Locale.LanguageRange[] languageRangeArray42 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList43 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43, languageRangeArray42);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, strMap45);
        int int47 = languageRangeList43.size();
        java.util.Locale.LanguageRange languageRange49 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange51 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange53 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] { languageRange49, languageRange51, languageRange53 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        boolean boolean57 = languageRangeList43.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55);
        boolean boolean58 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream59 = languageRangeList43.parallelStream();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor60 = languageRangeList43.listIterator();
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap64 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList65 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, strMap64);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator66 = languageRangeList62.spliterator();
        languageRangeList62.clear();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor68 = languageRangeList62.listIterator();
        boolean boolean69 = languageRangeList43.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62);
        java.util.Locale locale71 = new java.util.Locale("\u4e2d\u6587");
        int int72 = languageRangeList62.indexOf((java.lang.Object) locale71);
        boolean boolean73 = languageRangeList62.isEmpty();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "english" + "'", str9, "english");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str15, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh-CN" + "'", str16, "zh-CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str19, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str22, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals(locale26.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str29, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko");
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(localeList40);
        org.junit.Assert.assertNotNull(localeList41);
        org.junit.Assert.assertNotNull(languageRangeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(languageRangeList46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(languageRangeStream59);
        org.junit.Assert.assertNotNull(languageRangeItor60);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(languageRangeList65);
        org.junit.Assert.assertNotNull(languageRangeSpliterator66);
        org.junit.Assert.assertNotNull(languageRangeItor68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals(locale71.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test19383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19383");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx (GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI,us)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx(GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG..." + "'", str1, "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx(GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG...");
    }

    @Test
    public void test19384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19384");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("anglais (Canada)                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                    )adanaC( sialgna" + "'", str1, "                                                                                    )adanaC( sialgna");
    }

    @Test
    public void test19385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19385");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.lang.String str14 = locale13.getDisplayLanguage();
        java.lang.String str15 = locale11.getDisplayScript(locale13);
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale17);
        java.lang.String str19 = locale11.getDisplayCountry(locale17);
        java.lang.String str20 = locale9.getDisplayScript(locale11);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.upperCase("China", locale9);
        java.util.Locale locale23 = java.util.Locale.TAIWAN;
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.upperCase("", locale23);
        java.lang.String str25 = locale23.getISO3Country();
        java.util.Set<java.lang.Character> charSet26 = locale23.getExtensionKeys();
        java.util.Locale locale27 = locale23.stripExtensions();
        java.lang.String str28 = locale9.getDisplayLanguage(locale23);
        java.util.Locale.Builder builder29 = builder7.setLocale(locale9);
        java.lang.String str30 = locale9.getScript();
        java.util.Set<java.lang.String> strSet31 = locale9.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u82f1\u8a9e" + "'", str14, "\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "english" + "'", str18, "english");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CHINA" + "'", str21, "CHINA");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "TWN" + "'", str25, "TWN");
        org.junit.Assert.assertNotNull(charSet26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str28, "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test19386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19386");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("COLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTI", "...xxxxx", "INA................................................................................................", 350);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTI" + "'", str4, "COLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTICOLLECTI");
    }

    @Test
    public void test19387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19387");
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
        languageRangeList1.clear();
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "javacinese.cineselang");
        java.util.RandomAccess[][] randomAccessArray24 = new java.util.RandomAccess[][] {};
        java.util.RandomAccess[][] randomAccessArray25 = languageRangeList1.toArray(randomAccessArray24);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) randomAccessArray25);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(randomAccessArray24);
        org.junit.Assert.assertNotNull(randomAccessArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test19388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19388");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("anihc               en_ca", "N...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anihc               en_ca" + "'", str2, "anihc               en_ca");
    }

    @Test
    public void test19389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19389");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean3 = languageRangeList1.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale8);
        java.util.Locale locale10 = java.util.Locale.US;
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale13 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = locale13.getDisplayCountry(locale14);
        java.lang.String str16 = locale13.toLanguageTag();
        java.util.Locale locale17 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.lang.String str19 = locale17.getDisplayCountry(locale18);
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str22 = locale20.getDisplayCountry(locale21);
        java.util.Locale locale26 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale27 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale27.getDisplayCountry(locale28);
        java.util.Locale locale31 = new java.util.Locale("");
        java.lang.String str32 = locale31.getDisplayVariant();
        java.util.Locale locale33 = java.util.Locale.KOREAN;
        java.util.Locale locale35 = new java.util.Locale("");
        java.util.Locale locale36 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray37 = new java.util.Locale[] { locale8, locale10, locale11, locale12, locale13, locale18, locale20, locale26, locale28, locale31, locale33, locale35, locale36 };
        java.util.ArrayList<java.util.Locale> localeList38 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList38, localeArray37);
        java.util.List<java.util.Locale> localeList40 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.List<java.util.Locale> localeList41 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.Locale.LanguageRange[] languageRangeArray42 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList43 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43, languageRangeArray42);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, strMap45);
        int int47 = languageRangeList43.size();
        java.util.Locale.LanguageRange languageRange49 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange51 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange53 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] { languageRange49, languageRange51, languageRange53 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        boolean boolean57 = languageRangeList43.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55);
        boolean boolean58 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream59 = languageRangeList43.parallelStream();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor60 = languageRangeList43.listIterator();
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap64 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList65 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, strMap64);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator66 = languageRangeList62.spliterator();
        languageRangeList62.clear();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor68 = languageRangeList62.listIterator();
        boolean boolean69 = languageRangeList43.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62);
        java.util.Locale locale71 = new java.util.Locale("\u4e2d\u6587");
        int int72 = languageRangeList62.indexOf((java.lang.Object) locale71);
        java.lang.Object[] objArray73 = languageRangeList62.toArray();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "english" + "'", str9, "english");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str15, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh-CN" + "'", str16, "zh-CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str19, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str22, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals(locale26.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str29, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko");
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(localeList40);
        org.junit.Assert.assertNotNull(localeList41);
        org.junit.Assert.assertNotNull(languageRangeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(languageRangeList46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(languageRangeStream59);
        org.junit.Assert.assertNotNull(languageRangeItor60);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(languageRangeList65);
        org.junit.Assert.assertNotNull(languageRangeSpliterator66);
        org.junit.Assert.assertNotNull(languageRangeItor68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals(locale71.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[]");
    }

    @Test
    public void test19390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19390");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.setLanguageTag("ANIHC");
        java.util.Locale locale8 = builder4.build();
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale locale11 = builder9.build();
        java.util.Locale locale12 = builder9.build();
        java.lang.String str14 = locale12.getExtension('a');
        java.lang.String str15 = locale8.getDisplayName(locale12);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.lowerCase("HindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindi", locale8);
        java.lang.String str17 = locale8.getCountry();
        java.util.Set<java.lang.String> strSet18 = locale8.getUnicodeLocaleKeys();
        java.lang.String str19 = locale8.getDisplayVariant();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "anihc");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "anihc" + "'", str15, "anihc");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindi" + "'", str16, "hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindi");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test19391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19391");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("COLLECTI");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19392");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("slgnE", "#####################################Germn");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test19393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19393");
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
        java.util.Locale.Builder builder19 = null; // flaky: builder5.setLocale(locale15);
        java.util.Locale.Builder builder20 = null; // flaky: builder19.clearExtensions();
        java.util.Locale.Builder builder21 = null; // flaky: builder19.clearExtensions();
        java.util.Locale locale22 = null; // flaky: builder21.build();
        java.util.Locale.Builder builder24 = null; // flaky: builder21.setLanguageTag("COLLECTI");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder26 = null; // flaky: builder24.removeUnicodeLocaleAttribute("CHINOIS(CHINE");
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: CHINOIS(CHINE [at index 0]");
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u82f1\u6587" + "'", str11, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
// flaky:         org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u570b" + "'", str16, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertNotNull(builder19);
// flaky:         org.junit.Assert.assertNotNull(builder20);
// flaky:         org.junit.Assert.assertNotNull(builder21);
// flaky:         org.junit.Assert.assertNotNull(locale22);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test19394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19394");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...                ", ' ', 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...xxxxxxxxxxxxxxxx" + "'", str3, "...xxxxxxxxxxxxxxxx");
    }

    @Test
    public void test19395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19395");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engl");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engl" + "'", str1, "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engl");
    }

    @Test
    public void test19396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19396");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("china");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19397");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("CHINOIS (CHINE)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", "                                                          zh_c                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHINOIS (CHINE)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str2, "CHINOIS (CHINE)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test19398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19398");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray4, "Chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray8, "", 10, 0);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray8);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray8);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
    }

    @Test
    public void test19399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19399");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("lgloccoldoco!,Acola", "...ccccc");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19400");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("chinois(chine)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "$$$$$");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19401");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("jAPA", 0, 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19402");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "itafraita", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19403");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ese(Taiwan");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ese(Taiwan" + "'", str2, "ese(Taiwan");
    }

    @Test
    public void test19404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19404");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("slgne", "String[]", "           ZXXXXXXXXXXXXXXXXXXX");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test19405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19405");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("CHN", strMap1);
        languageRangeList2.clear();
        boolean boolean4 = languageRangeList2.isEmpty();
        boolean boolean5 = languageRangeList2.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, strMap9);
        int int11 = languageRangeList7.size();
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray13);
        boolean boolean16 = languageRangeList7.equals((java.lang.Object) wildcardClassArray15);
        int int18 = languageRangeList7.indexOf((java.lang.Object) (short) 100);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.parse("hi");
        int int22 = languageRangeList20.indexOf((java.lang.Object) '4');
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap26 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, strMap26);
        int int28 = languageRangeList24.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean32 = languageRangeList30.remove((java.lang.Object) "English");
        boolean boolean33 = languageRangeList24.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, strMap37);
        java.lang.String[] strArray46 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        java.util.List<java.lang.Class<?>> wildcardClassList49 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList47);
        java.lang.String str50 = java.util.Locale.lookupTag(languageRangeList38, (java.util.Collection<java.lang.String>) strList47);
        java.util.List<java.lang.Class<?>> wildcardClassList51 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList47);
        java.util.List<java.lang.String> strList52 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.lang.String>) strList47);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap54 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList55 = java.util.Locale.LanguageRange.parse("Cina", strMap54);
        java.lang.String[] strArray59 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.util.Locale.FilteringMode filteringMode62 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags(languageRangeList55, (java.util.Collection<java.lang.String>) strList60, filteringMode62);
        java.util.List<java.lang.String> strList64 = java.util.Locale.filterTags(languageRangeList20, (java.util.Collection<java.lang.String>) strList47, filteringMode62);
        java.util.List<java.lang.Class<?>> wildcardClassList65 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(strList64);
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList64);
        boolean boolean67 = languageRangeList2.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        int int68 = languageRangeList7.size();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap70 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList71 = java.util.Locale.LanguageRange.parse("CHINA", strMap70);
        boolean boolean72 = languageRangeList7.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClassList49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(wildcardClassList51);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(languageRangeList55);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + filteringMode62 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode62.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(wildcardClassList65);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(languageRangeList71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test19406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19406");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 746);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19407");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                           CINACI                                            ", 3, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                        CINACI                                            " + "'", str3, "                                        CINACI                                            ");
    }

    @Test
    public void test19408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19408");
        java.util.Locale locale3 = new java.util.Locale("xxxhi!xxxx", "Hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindi", "ENGLIILISHESE (TAIWANESE (TAIWANESE (TAIWANESE (TAIWANESE (TAIWANESE (TAIWANESE (TAIWANESE (TAIWA");
        org.junit.Assert.assertEquals(locale3.toString(), "xxxhi!xxxx_HINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDI_ENGLIILISHESE (TAIWANESE (TAIWANESE (TAIWANESE (TAIWANESE (TAIWANESE (TAIWANESE (TAIWANESE (TAIWA");
    }

    @Test
    public void test19409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19409");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test19410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19410");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "in");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "in" + "'", str1, "in");
    }

    @Test
    public void test19411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19411");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("A   ", 19, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A   " + "'", str3, "A   ");
    }

    @Test
    public void test19412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19412");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("Local", 259);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                               Local                                                                                                                               " + "'", str2, "                                                                                                                               Local                                                                                                                               ");
    }

    @Test
    public void test19413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19413");
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
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator33 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList7.replaceAll(languageRangeUnaryOperator33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test19414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19414");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("h                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                I", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19415");
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
        java.lang.String[] strArray48 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray51 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray52 = org.apache.commons.lang3.StringUtils.stripAll(strArray51);
        java.lang.String[] strArray53 = org.apache.commons.lang3.StringUtils.stripAll(strArray52);
        java.lang.String str54 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray48, strArray52);
        int int55 = languageRangeList1.indexOf((java.lang.Object) strArray48);
        boolean boolean57 = languageRangeList1.equals((java.lang.Object) 100L);
        java.util.Locale locale58 = java.util.Locale.ITALIAN;
        java.util.Locale locale60 = new java.util.Locale("");
        java.lang.String str61 = locale60.getDisplayLanguage();
        java.util.Locale locale62 = java.util.Locale.CANADA;
        java.lang.String str63 = locale62.getDisplayLanguage();
        java.lang.String str64 = locale60.getDisplayScript(locale62);
        java.util.Locale locale66 = java.util.Locale.FRANCE;
        java.lang.String str67 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale66);
        java.lang.String str68 = locale60.getDisplayCountry(locale66);
        java.lang.String str69 = locale58.getDisplayScript(locale60);
        java.lang.String str70 = locale60.getDisplayCountry();
        java.lang.String str71 = locale60.getDisplayLanguage();
        java.util.Locale locale72 = java.util.Locale.PRC;
        java.lang.String str73 = locale60.getDisplayScript(locale72);
        boolean boolean74 = languageRangeList1.equals((java.lang.Object) locale72);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor75 = languageRangeList1.iterator();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor76 = languageRangeList1.listIterator();
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
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u570b" + "'", str17, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh-CN" + "'", str18, "zh-CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u4e2d\u570b" + "'", str21, "\u4e2d\u570b");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u4e2d\u570b" + "'", str24, "\u4e2d\u570b");
        org.junit.Assert.assertEquals(locale28.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u4e2d\u570b" + "'", str31, "\u4e2d\u570b");
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
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str54, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "it");
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\u82f1\u6587" + "'", str63, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "english" + "'", str67, "english");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(languageRangeItor75);
        org.junit.Assert.assertNotNull(languageRangeItor76);
    }

    @Test
    public void test19416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19416");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim(".english");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".english" + "'", str1, ".english");
    }

    @Test
    public void test19417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19417");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("#########################       HI!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################       HI!" + "'", str2, "#########################       HI!");
    }

    @Test
    public void test19418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19418");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19419");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("collections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptyset", "class java.lang.String");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19420");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList1.listIterator();
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) languageRangeList1, "....english");
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, strMap12);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor14 = languageRangeList13.listIterator();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale23);
        java.util.Locale locale25 = java.util.Locale.US;
        java.util.Locale locale26 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale27 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale28 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.lang.String str30 = locale28.getDisplayCountry(locale29);
        java.lang.String str31 = locale28.toLanguageTag();
        java.util.Locale locale32 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale33 = java.util.Locale.getDefault();
        java.lang.String str34 = locale32.getDisplayCountry(locale33);
        java.util.Locale locale35 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = locale35.getDisplayCountry(locale36);
        java.util.Locale locale41 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale42 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.lang.String str44 = locale42.getDisplayCountry(locale43);
        java.util.Locale locale46 = new java.util.Locale("");
        java.lang.String str47 = locale46.getDisplayVariant();
        java.util.Locale locale48 = java.util.Locale.KOREAN;
        java.util.Locale locale50 = new java.util.Locale("");
        java.util.Locale locale51 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray52 = new java.util.Locale[] { locale23, locale25, locale26, locale27, locale28, locale33, locale35, locale41, locale43, locale46, locale48, locale50, locale51 };
        java.util.ArrayList<java.util.Locale> localeList53 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList53, localeArray52);
        java.util.List<java.util.Locale> localeList55 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList53);
        java.lang.String[] strArray63 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        java.util.List<java.lang.Class<?>> wildcardClassList66 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList64);
        java.util.Locale.FilteringMode filteringMode67 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList64, filteringMode67);
        java.util.List<java.lang.String> strList69 = java.util.Locale.filterTags(languageRangeList13, (java.util.Collection<java.lang.String>) strList17, filteringMode67);
        java.util.Locale.LanguageRange[] languageRangeArray70 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList71 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71, languageRangeArray70);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap73 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList74 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList71, strMap73);
        int int75 = languageRangeList71.size();
        boolean boolean76 = languageRangeList13.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap77 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList78 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList13, strMap77);
        boolean boolean79 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList78);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap80 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList81 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap80);
        int int82 = languageRangeList81.size();
        java.lang.String str84 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList81, "eNGLxxxxENGLISHSxxxxENGLISH");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ArrayList" + "'", str8, "ArrayList");
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeItor14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "english" + "'", str24, "english");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale29);
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u4e2d\u570b" + "'", str30, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zh-CN" + "'", str31, "zh-CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u4e2d\u570b" + "'", str34, "\u4e2d\u570b");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u570b" + "'", str37, "\u4e2d\u570b");
        org.junit.Assert.assertEquals(locale41.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
// flaky:         org.junit.Assert.assertEquals(locale43.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\u4e2d\u570b" + "'", str44, "\u4e2d\u570b");
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "ko");
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(localeList55);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(wildcardClassList66);
        org.junit.Assert.assertTrue("'" + filteringMode67 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode67.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(languageRangeArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(languageRangeList74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(languageRangeList78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(languageRangeList81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
    }

    @Test
    public void test19421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19421");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("               class java.lang.String               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class java.lang.String" + "'", str1, "class java.lang.String");
    }

    @Test
    public void test19422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19422");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("EnglGermnsGermn", "HindiHindiHindiHin");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EnglGermnsGermn" + "'", str2, "EnglGermnsGermn");
    }

    @Test
    public void test19423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19423");
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zh_CN", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AD.AE.AF.AGchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "cinese (Cina)", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587", charArray9);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAI", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test19424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19424");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("ANIHCEN_ca");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anihcen_CA" + "'", str1, "anihcen_CA");
    }

    @Test
    public void test19425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19425");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\u5927\u62ff\u52a0\u6587\u82f1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19426");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                         ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test19427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19427");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale locale7 = builder3.build();
        java.util.Locale.Builder builder9 = builder3.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setVariant("   ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant:     [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "china_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "china_CN");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test19428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19428");
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("                 a                  ", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) ".", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "de", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("EN", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "xxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxxxxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxxxxxxxxxxxxxxxxJelacoL", charArray9);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "xxANIHCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test19429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19429");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("l.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$######################", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "l.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str3, "l.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test19430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19430");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("HINDI (HI!,CHINA", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test19431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19431");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("esecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinese", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=esecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinese");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19432");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder4 = builder1.clearExtensions();
        java.util.Locale.Builder builder6 = builder1.setVariant("");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test19433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19433");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "eng");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: eng");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19434");
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.lang.String str3 = locale1.getDisplayCountry(locale2);
        java.lang.String str4 = locale1.toLanguageTag();
        java.lang.String str5 = locale1.getLanguage();
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.util.Locale locale8 = new java.util.Locale("");
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = locale10.getDisplayLanguage();
        java.lang.String str12 = locale8.getDisplayScript(locale10);
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale14);
        java.lang.String str16 = locale8.getDisplayCountry(locale14);
        java.lang.String str17 = locale6.getDisplayScript(locale8);
        java.util.Locale locale18 = java.util.Locale.GERMAN;
        java.lang.String str19 = locale8.getDisplayLanguage(locale18);
        java.lang.String str20 = locale1.getDisplayCountry(locale8);
        java.lang.String str21 = locale8.getCountry();
        java.util.Locale locale25 = new java.util.Locale("....english", "zhcinesese", ".");
        java.lang.String str26 = locale8.getDisplayName(locale25);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean30 = languageRangeList28.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange languageRange32 = languageRangeList28.get(0);
        java.util.Locale locale33 = java.util.Locale.JAPANESE;
        java.util.Locale locale35 = new java.util.Locale("");
        java.lang.String str36 = locale35.getDisplayLanguage();
        java.util.Locale locale37 = java.util.Locale.CANADA;
        java.lang.String str38 = locale37.getDisplayLanguage();
        java.lang.String str39 = locale35.getDisplayScript(locale37);
        java.lang.String str40 = locale37.getDisplayVariant();
        java.util.Locale locale41 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.lang.String str43 = locale41.getDisplayCountry(locale42);
        java.lang.String str44 = locale42.getDisplayVariant();
        java.lang.String str45 = locale37.getDisplayScript(locale42);
        java.lang.String str46 = locale37.getScript();
        java.lang.String str47 = locale33.getDisplayVariant(locale37);
        java.util.Locale locale48 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str49 = locale48.getDisplayLanguage();
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.lang.String str51 = locale48.getDisplayCountry(locale50);
        java.util.Locale locale52 = java.util.Locale.TAIWAN;
        java.lang.String str53 = locale52.getVariant();
        java.lang.String str54 = locale48.getDisplayName(locale52);
        java.util.Locale locale55 = locale48.stripExtensions();
        java.lang.String str56 = locale33.getDisplayName(locale55);
        boolean boolean57 = languageRangeList28.equals((java.lang.Object) locale33);
        java.lang.String str58 = locale25.getDisplayName(locale33);
        java.lang.String str59 = locale25.getCountry();
        java.util.Set<java.lang.String> strSet60 = locale25.getUnicodeLocaleAttributes();
        java.lang.String str61 = org.apache.commons.lang3.StringUtils.lowerCase("", locale25);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u570b" + "'", str3, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u82f1\u6587" + "'", str11, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "english" + "'", str15, "english");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "China" + "'", str20, "China");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals(locale25.toString(), "....english_ZHCINESESE_.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(languageRange32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ja");
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\u82f1\u6587" + "'", str38, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
// flaky:         org.junit.Assert.assertEquals(locale42.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u4e2d\u570b" + "'", str43, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\u4e2d\u6587" + "'", str49, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\u53f0\u7063" + "'", str51, "\u53f0\u7063");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str54, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\u65e5\u6587" + "'", str56, "\u65e5\u6587");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "....english (ZHCINESESE,.)" + "'", str58, "....english (ZHCINESESE,.)");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "ZHCINESESE" + "'", str59, "ZHCINESESE");
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test19435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19435");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("EnglCNsCN", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EnglCNsCN" + "'", str2, "EnglCNsCN");
    }

    @Test
    public void test19436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19436");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("ENGLISH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 HSILGNE" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 HSILGNE");
    }

    @Test
    public void test19437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19437");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder6 = builder4.setLanguage("it");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale9 = java.util.Locale.TAIWAN;
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.upperCase("", locale9);
        java.lang.String str11 = locale9.getDisplayScript();
        java.lang.String str12 = locale7.getDisplayLanguage(locale9);
        boolean boolean13 = locale9.hasExtensions();
        java.lang.String str14 = locale9.getLanguage();
        java.lang.String str15 = locale9.getDisplayCountry();
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.lowerCase("slgneslgneslgnefran\347ais (canada)slgneslgneslgnes", locale9);
        java.lang.String str17 = locale9.getISO3Language();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str12, "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh" + "'", str14, "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u53f0\u7063" + "'", str15, "\u53f0\u7063");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "slgneslgneslgnefran\347ais (canada)slgneslgneslgnes" + "'", str16, "slgneslgneslgnefran\347ais (canada)slgneslgneslgnes");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zho" + "'", str17, "zho");
    }

    @Test
    public void test19438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19438");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName(obj0, "lngugernge.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.locle");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lngugernge.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.locle" + "'", str2, "lngugernge.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.locle");
    }

    @Test
    public void test19439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19439");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("INGLESEU", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "ChineChineChineChineChineChineChiChinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChineChineChineChineChineChineChin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "INGLESEU" + "'", str3, "INGLESEU");
    }

    @Test
    public void test19440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 107);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19441");
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "C", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "italianojajajajajajajajajajajajajaj", charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "WZ.MZ.AZ.TY.EY.SW.FW.UV.NV.IV.GV.EV.CV.AV.ZU.YU.SU.MU.GU.AU.ZT.WT.VT.TT.RT.OT.NT.MT.LT.KT.JT.HT.GT.FT.DT.CT.ZS.YS.XS.VS.TS.SS.RS.OS.NS.MS.LS.KS.JS.IS.HS.GS.ES.DS.CS.BS.AS.WR.UR.SR.OR.ER.AQ.YP.WP.TP.SP.RP.NP.MP.LP.KP.HP.GP.FP.EP.AP.MO.ZN.UN.RN.PN.ON.LN.IN.GN.FN.EN.CN.AN.ZM.YM.XM.WM.VM.UM.TM.SM.RM.QM.PM.OM.NM.MM.LM.KM.HM.GM.FM.EM.DM.CM.AM.YL.VL.UL.TL.SL.RL.KL.IL.CL.BL.AL.ZK.YK.WK.RK.PK.NK.MK.IK.HK.GK.EK.PJ.OJ.MJ.EJ.TI.SI.RI.QI.OI.NI.MI.LI.EI.DI.UH.TH.RH.NH.MH.KH.YG.WG.UG.TG.SG.RG.QG.PG.NG.MG.LG.IG.HG.GG.FG.EG.DG.BG.AG.RF.OF.MF.KF.JF.IF.TE.SE.RE.HE.GE.EE.CE.ZD.OD.MD.KD.JD.ED.ZC.YC.XC.WC.VC.UC.RC.OC.NC.MC.LC.KC.IC.HC.GC.FC.DC.CC.AC.ZB.YB.WB.VB.TB.SB.RB.QB.OB.NB.MB.LB.JB.IB.HB.GB.FB.EB.DB.BB.AB.ZA.XA.WA.UA.TA.SA.RA.QA.OA.NA.MA.LA.IA.GA.FA.EA.DA", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "engliIlishenglcinese(Cina)", charArray9);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#a", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test19442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19442");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "ahi!hi! (                 A               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19443");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Local", "nglais", 120);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19444");
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
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray19 = languageRangeList18.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator20 = languageRangeList18.spliterator();
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder22 = builder21.clearExtensions();
        java.util.Locale.Builder builder24 = builder22.setLanguageTag("zh-CN");
        java.util.Locale locale25 = builder22.build();
        boolean boolean26 = languageRangeList18.remove((java.lang.Object) locale25);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.parse("hi");
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Locale locale33 = java.util.Locale.FRANCE;
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale33);
        java.util.Locale locale35 = java.util.Locale.US;
        java.util.Locale locale36 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale37 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale38 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale38.getDisplayCountry(locale39);
        java.lang.String str41 = locale38.toLanguageTag();
        java.util.Locale locale42 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.lang.String str44 = locale42.getDisplayCountry(locale43);
        java.util.Locale locale45 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale46 = java.util.Locale.getDefault();
        java.lang.String str47 = locale45.getDisplayCountry(locale46);
        java.util.Locale locale51 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale52 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.lang.String str54 = locale52.getDisplayCountry(locale53);
        java.util.Locale locale56 = new java.util.Locale("");
        java.lang.String str57 = locale56.getDisplayVariant();
        java.util.Locale locale58 = java.util.Locale.KOREAN;
        java.util.Locale locale60 = new java.util.Locale("");
        java.util.Locale locale61 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray62 = new java.util.Locale[] { locale33, locale35, locale36, locale37, locale38, locale43, locale45, locale51, locale53, locale56, locale58, locale60, locale61 };
        java.util.ArrayList<java.util.Locale> localeList63 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList63, localeArray62);
        java.util.List<java.util.Locale> localeList65 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.util.Locale>) localeList63);
        java.lang.String[] strArray73 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        java.util.List<java.lang.Class<?>> wildcardClassList76 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList74);
        java.util.Locale.FilteringMode filteringMode77 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.lang.String>) strList74, filteringMode77);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator79 = languageRangeList30.spliterator();
        boolean boolean80 = languageRangeList28.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30);
        boolean boolean81 = languageRangeList18.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator82 = languageRangeList18.spliterator();
        boolean boolean83 = languageRangeList2.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18);
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
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(languageRangeSpliterator20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "english" + "'", str34, "english");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u4e2d\u570b" + "'", str40, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "zh-CN" + "'", str41, "zh-CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
// flaky:         org.junit.Assert.assertEquals(locale43.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\u4e2d\u570b" + "'", str44, "\u4e2d\u570b");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale46);
// flaky:         org.junit.Assert.assertEquals(locale46.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\u4e2d\u570b" + "'", str47, "\u4e2d\u570b");
        org.junit.Assert.assertEquals(locale51.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale53);
// flaky:         org.junit.Assert.assertEquals(locale53.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\u4e2d\u570b" + "'", str54, "\u4e2d\u570b");
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "ko");
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(localeList65);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(wildcardClassList76);
        org.junit.Assert.assertTrue("'" + filteringMode77 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode77.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNotNull(languageRangeSpliterator79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(languageRangeSpliterator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test19445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19445");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("GNAL.AVAJ", "GGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGL");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19446");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("l", "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 45);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19447");
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
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray13);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray17);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray18);
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
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
    }

    @Test
    public void test19448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19448");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.lang.String str3 = locale1.getDisplayVariant();
        java.lang.String str5 = locale1.getExtension('a');
        java.lang.String str6 = null; // flaky: locale1.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u570b" + "'", str2, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TWN" + "'", str6, "TWN");
    }

    @Test
    public void test19449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19449");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("anihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihc", "eN", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihc" + "'", str3, "anihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihc");
    }

    @Test
    public void test19450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19450");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Integer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Integer" + "'", str1, "Integer");
    }

    @Test
    public void test19451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19451");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HArrayLi", (int) (byte) 0, 93);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HArrayLi" + "'", str3, "HArrayLi");
    }

    @Test
    public void test19452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19452");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder2.setLanguage("HI");
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder6 = builder4.setLocale(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale5.getDisplayLanguage();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr-FR" + "'", str7, "fr-FR");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u6cd5\u6587" + "'", str8, "\u6cd5\u6587");
    }

    @Test
    public void test19453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19453");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "TWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWhi!italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19454");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("Chine", "hindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19455");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, "cinese (Taiwan)");
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor5 = languageRangeList2.listIterator();
        java.util.Locale.LanguageRange languageRange6 = languageRangeItor5.next();
        java.lang.String str7 = languageRange6.getRange();
        java.util.Locale locale8 = java.util.Locale.JAPANESE;
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("", locale10);
        java.lang.String str12 = locale8.getDisplayVariant(locale10);
        java.util.Set<java.lang.Character> charSet13 = locale10.getExtensionKeys();
        java.util.Set<java.lang.String> strSet14 = locale10.getUnicodeLocaleAttributes();
        boolean boolean15 = locale10.hasExtensions();
        boolean boolean16 = languageRange6.equals((java.lang.Object) locale10);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeItor5);
        org.junit.Assert.assertNotNull(languageRange6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "it" + "'", str7, "it");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ja");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test19456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19456");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("HArrayList", "f   c ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HArrayList" + "'", str2, "HArrayList");
    }

    @Test
    public void test19457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19457");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\u4e2d\u6587\u53f0\u7063", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587\u53f0\u7063" + "'", str2, "\u4e2d\u6587\u53f0\u7063");
    }

    @Test
    public void test19458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19458");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("ch", "CHN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19459");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                        jAPA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19460");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "zhcines############################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19461");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                Hin                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hin" + "'", str1, "Hin");
    }

    @Test
    public void test19462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19462");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("tuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "\u4e2d\u56fdAD.AE.AFxxxxxxxxxxxxxxxxxxxxxxxxx", 24);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test19463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19463");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("slgneslgneslgnefran\347ais (canada)slgneslgneslgnes", "string", 745);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "slgneslgneslgnefran\347ais (canada)slgneslgneslgnes" + "'", str3, "slgneslgneslgnefran\347ais (canada)slgneslgneslgnes");
    }

    @Test
    public void test19464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19464");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("en", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en" + "'", str2, "en");
    }

    @Test
    public void test19465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19465");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaahrrylist");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19466");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                    nawiazh-cnnawia", "CollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollecti");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test19467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19467");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean3 = languageRangeList1.remove((java.lang.Object) "English");
        boolean boolean5 = languageRangeList1.remove((java.lang.Object) 1);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray8 = languageRangeList7.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream9 = languageRangeList7.parallelStream();
        languageRangeList7.clear();
        boolean boolean11 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, strMap15);
        int int17 = languageRangeList13.size();
        java.util.Locale.LanguageRange languageRange19 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange21 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange23 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] { languageRange19, languageRange21, languageRange23 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        boolean boolean27 = languageRangeList13.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator28 = languageRangeList13.spliterator();
        boolean boolean29 = languageRangeList7.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator30 = languageRangeList13.spliterator();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream31 = languageRangeList13.parallelStream();
        boolean boolean32 = languageRangeList13.isEmpty();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(languageRangeStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(languageRangeSpliterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(languageRangeSpliterator30);
        org.junit.Assert.assertNotNull(languageRangeStream31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test19468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19468");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("...ccccc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...ccccc" + "'", str1, "...ccccc");
    }

    @Test
    public void test19469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19469");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean3 = languageRangeList1.remove((java.lang.Object) "English");
        boolean boolean5 = languageRangeList1.remove((java.lang.Object) 1);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray8 = languageRangeList7.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream9 = languageRangeList7.parallelStream();
        languageRangeList7.clear();
        boolean boolean11 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor12 = languageRangeList7.iterator();
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("EN_ca");
        boolean boolean15 = languageRangeList7.contains((java.lang.Object) strArray14);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, strMap20);
        int int22 = languageRangeList18.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean26 = languageRangeList24.remove((java.lang.Object) "English");
        boolean boolean27 = languageRangeList18.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap31 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, strMap31);
        int int33 = languageRangeList29.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor34 = languageRangeList29.listIterator();
        java.util.Locale.LanguageRange languageRange36 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange38 = new java.util.Locale.LanguageRange("English");
        java.lang.String str40 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange38, "");
        java.util.Locale.LanguageRange languageRange42 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] { languageRange36, languageRange38, languageRange42 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        boolean boolean46 = languageRangeList29.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor47 = languageRangeList44.listIterator();
        java.util.Locale.LanguageRange languageRange48 = languageRangeItor47.next();
        java.util.Locale.LanguageRange languageRange49 = languageRangeItor47.next();
        boolean boolean50 = languageRangeList18.add(languageRange49);
        double double51 = languageRange49.getWeight();
        double double52 = languageRange49.getWeight();
        double double53 = languageRange49.getWeight();
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList7.add((int) (byte) 100, languageRange49);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(languageRangeStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(languageRangeItor12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(languageRangeList24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor34);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Locale.LanguageRange" + "'", str40, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(languageRangeItor47);
        org.junit.Assert.assertNotNull(languageRange48);
        org.junit.Assert.assertNotNull(languageRange49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
    }

    @Test
    public void test19470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19470");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', 92, 43);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test19471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19471");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder6 = builder4.setLanguage("it");
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.util.Locale locale11 = java.util.Locale.CANADA;
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.lang.String str13 = locale9.getDisplayScript(locale11);
        java.lang.String str14 = locale11.getDisplayVariant();
        java.util.Locale locale15 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.lang.String str17 = locale15.getDisplayCountry(locale16);
        java.lang.String str18 = locale16.getDisplayVariant();
        java.lang.String str19 = locale11.getDisplayScript(locale16);
        java.util.Locale.Builder builder20 = null; // flaky: builder6.setLocale(locale16);
        java.util.Locale.Builder builder21 = null; // flaky: builder20.clearExtensions();
        java.util.Locale.Builder builder22 = null; // flaky: builder20.clearExtensions();
        java.util.Locale locale23 = null; // flaky: builder22.build();
        java.lang.String str24 = null; // flaky: org.apache.commons.lang3.StringUtils.upperCase("JAVA.LANG", locale23);
        java.util.Locale locale25 = java.util.Locale.JAPANESE;
        java.util.Locale locale27 = new java.util.Locale("");
        java.lang.String str28 = locale27.getDisplayLanguage();
        java.util.Locale locale29 = java.util.Locale.CANADA;
        java.lang.String str30 = locale29.getDisplayLanguage();
        java.lang.String str31 = locale27.getDisplayScript(locale29);
        java.lang.String str32 = locale29.getDisplayVariant();
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = locale33.getDisplayCountry(locale34);
        java.lang.String str36 = locale34.getDisplayVariant();
        java.lang.String str37 = locale29.getDisplayScript(locale34);
        java.lang.String str38 = locale29.getScript();
        java.lang.String str39 = locale25.getDisplayVariant(locale29);
        java.lang.String str40 = null; // flaky: locale23.getDisplayCountry(locale25);
        java.util.Set<java.lang.String> strSet41 = null; // flaky: locale23.getUnicodeLocaleAttributes();
        java.lang.String str42 = null; // flaky: locale23.getDisplayName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u82f1\u6587" + "'", str12, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u570b" + "'", str17, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
// flaky:         org.junit.Assert.assertNotNull(builder20);
// flaky:         org.junit.Assert.assertNotNull(builder21);
// flaky:         org.junit.Assert.assertNotNull(builder22);
// flaky:         org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JAVA.LANG" + "'", str24, "JAVA.LANG");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ja");
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u82f1\u6587" + "'", str30, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u4e2d\u570b" + "'", str35, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u53f0\u6e7e" + "'", str40, "\u53f0\u6e7e");
// flaky:         org.junit.Assert.assertNotNull(strSet41);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str42, "\u4e2d\u6587\u53f0\u7063)");
    }

    @Test
    public void test19472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19472");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("italiano (CI_A)", "             AN       A", 252);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19473");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("         ZH_TW          ", "italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital..");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19474");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("xxxxxxxxxxxxafxxxxxxxxxxxxx", "ANIHCANIHC");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19475");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("Locale.Builder[]", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          chinEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Locale.Builder[]" + "'", str2, "Locale.Builder[]");
    }

    @Test
    public void test19476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19476");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                          N       A                                           ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                          N       A                                           " + "'", str2, "                                          N       A                                           ");
    }

    @Test
    public void test19477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19477");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("             AN       A             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AN       A" + "'", str1, "AN       A");
    }

    @Test
    public void test19478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19478");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream5 = languageRangeList1.stream();
        boolean boolean6 = languageRangeList1.isEmpty();
        languageRangeList1.clear();
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("it");
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("ESE (tAIWAN", strArray10);
        boolean boolean12 = languageRangeList1.contains((java.lang.Object) strArray10);
        java.lang.Object[] objArray13 = languageRangeList1.toArray();
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList1.replaceAll(languageRangeUnaryOperator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
    }

    @Test
    public void test19479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19479");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("nglish");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nglish" + "'", str1, "nglish");
    }

    @Test
    public void test19480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19480");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "undaaaaaaaH                                 ", (java.lang.CharSequence) "ENGHI");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "undaaaaaaaH                                 " + "'", charSequence2, "undaaaaaaaH                                 ");
    }

    @Test
    public void test19481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19481");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("t", "...ggggggggItaliano...gggggggggHI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19482");
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
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.parse("hi");
        int int26 = languageRangeList24.indexOf((java.lang.Object) '4');
        languageRangeList24.clear();
        java.util.Locale.LanguageRange languageRange29 = new java.util.Locale.LanguageRange("English");
        java.lang.String str30 = languageRange29.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] { languageRange29 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean37 = languageRangeList35.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.util.Locale locale42 = java.util.Locale.FRANCE;
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale42);
        java.util.Locale locale44 = java.util.Locale.US;
        java.util.Locale locale45 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale46 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale47 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale48 = java.util.Locale.getDefault();
        java.lang.String str49 = locale47.getDisplayCountry(locale48);
        java.lang.String str50 = locale47.toLanguageTag();
        java.util.Locale locale51 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.lang.String str53 = locale51.getDisplayCountry(locale52);
        java.util.Locale locale54 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale55 = java.util.Locale.getDefault();
        java.lang.String str56 = locale54.getDisplayCountry(locale55);
        java.util.Locale locale60 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale61 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale62 = java.util.Locale.getDefault();
        java.lang.String str63 = locale61.getDisplayCountry(locale62);
        java.util.Locale locale65 = new java.util.Locale("");
        java.lang.String str66 = locale65.getDisplayVariant();
        java.util.Locale locale67 = java.util.Locale.KOREAN;
        java.util.Locale locale69 = new java.util.Locale("");
        java.util.Locale locale70 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray71 = new java.util.Locale[] { locale42, locale44, locale45, locale46, locale47, locale52, locale54, locale60, locale62, locale65, locale67, locale69, locale70 };
        java.util.ArrayList<java.util.Locale> localeList72 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList72, localeArray71);
        java.util.List<java.util.Locale> localeList74 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.util.Locale>) localeList72);
        java.util.List<java.util.Locale> localeList75 = java.util.Locale.filter(languageRangeList35, (java.util.Collection<java.util.Locale>) localeList72);
        java.util.Locale locale76 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.util.Locale>) localeList75);
        boolean boolean77 = languageRangeList24.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32);
        int int78 = languageRangeList24.size();
        java.util.Locale locale82 = new java.util.Locale("zho", "US");
        java.util.Locale locale83 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str84 = locale82.getDisplayVariant(locale83);
        java.lang.String str85 = locale83.getVariant();
        java.lang.String str86 = org.apache.commons.lang3.StringUtils.upperCase("AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", locale83);
        java.lang.String str87 = locale83.getDisplayScript();
        java.util.Locale.setDefault(locale83);
        java.lang.String str89 = locale83.getDisplayName();
        java.lang.String str90 = locale83.getDisplayLanguage();
        int int91 = languageRangeList24.lastIndexOf((java.lang.Object) locale83);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream92 = languageRangeList24.parallelStream();
        boolean boolean93 = languageRangeList11.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor94 = languageRangeList24.listIterator();
        java.lang.String str96 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor94, "                                        Ih                                     ...");
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
        org.junit.Assert.assertNotNull(languageRangeList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "english" + "'", str30, "english");
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(languageRangeList35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(languageRangeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "english" + "'", str43, "english");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale48);
// flaky:         org.junit.Assert.assertEquals(locale48.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\u4e2d\u570b" + "'", str49, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "zh-CN" + "'", str50, "zh-CN");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\u4e2d\u570b" + "'", str53, "\u4e2d\u570b");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale55);
// flaky:         org.junit.Assert.assertEquals(locale55.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\u4e2d\u570b" + "'", str56, "\u4e2d\u570b");
        org.junit.Assert.assertEquals(locale60.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale62);
// flaky:         org.junit.Assert.assertEquals(locale62.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\u4e2d\u570b" + "'", str63, "\u4e2d\u570b");
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "ko");
        org.junit.Assert.assertEquals(locale69.toString(), "");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(localeList74);
        org.junit.Assert.assertNotNull(localeList75);
        org.junit.Assert.assertNull(locale76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertEquals(locale82.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW" + "'", str86, "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "fran\347ais (Canada)" + "'", str89, "fran\347ais (Canada)");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "fran\347ais" + "'", str90, "fran\347ais");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertNotNull(languageRangeStream92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(languageRangeItor94);
    }

    @Test
    public void test19483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19483");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("                                 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19484");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) locale0, "zh-CNenglis");
        java.lang.String str4 = locale0.getLanguage();
        java.lang.String str5 = locale0.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale0.getExtension('$');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: $");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.util" + "'", str3, "java.util");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "anglais (Canada)" + "'", str5, "anglais (Canada)");
    }

    @Test
    public void test19485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19485");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("                 a                  ", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "i", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test19486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19486");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\u82f1\u8a9e...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx.", 27, 234);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u8a9e...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx." + "'", str3, "\u82f1\u8a9e...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx.");
    }

    @Test
    public void test19487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19487");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliIlish)", (int) '$');
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u5730\u533aengliIlish)" + "'", str2, "\u5730\u533aengliIlish)");
    }

    @Test
    public void test19488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19488");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder2.setLanguage("HI");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.lang.String str9 = locale6.getDisplayCountry(locale8);
        java.util.Locale.Builder builder10 = builder5.setLocale(locale8);
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale locale12 = builder10.build();
        java.lang.String str13 = locale12.getVariant();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chinois" + "'", str7, "chinois");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Taiwan" + "'", str9, "Taiwan");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test19489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19489");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("tRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRIAD.AE", "          xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchnxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchnxxxxxxxxxxxxxxxxxxxxxxxxxnglais");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRIAD.AE" + "'", str2, "tRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRIAD.AE");
    }

    @Test
    public void test19490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19490");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "....................................................................................................", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu       HI!uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19491");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...                                     hI                                                javacinese.cineselang   ...", "i!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19492");
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
        java.util.List<java.lang.Class<?>> wildcardClassList33 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(strList32);
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
        org.junit.Assert.assertNotNull(wildcardClassList33);
    }

    @Test
    public void test19493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19493");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("Francese", "aiaiaiaiaiaiaiaiai");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19494");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19495");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 44, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                            " + "'", str3, "                                            ");
    }

    @Test
    public void test19496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19496");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("$(JAVA", "...X.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19497");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("fr", "\u4e2d\u56fd", 3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...gggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....eng...", "c");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("Cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", strArray5, strArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny("cina", strArray10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str11, "Cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test19498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19498");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital.italiahIitaliahIitaliahIitalixxxxxxxitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital.italiahIitaliahIitaliahIitalia", "TW", 46);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19499");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Hi!hi! (", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi! (" + "'", str2, "Hi!hi! (");
    }

    @Test
    public void test19500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19500");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "ciCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "\u53f0\u7063                             ");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u7063\u7063\u7063\u7063\u7063\u7063\u7063\u7063\u7063\u7063\u7063!" + "'", str3, "\u7063\u7063\u7063\u7063\u7063\u7063\u7063\u7063\u7063\u7063\u7063!");
    }
}
