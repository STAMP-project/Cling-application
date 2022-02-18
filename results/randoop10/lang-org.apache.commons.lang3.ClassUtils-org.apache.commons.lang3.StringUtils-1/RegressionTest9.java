import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test04501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04501");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "US");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04502");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("chinChinChinChinChiChinChinChinChinC", '.');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "zho", (int) 'u', (int) (short) 0);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("can", strArray3, strArray12);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "can" + "'", str14, "can");
    }

    @Test
    public void test04503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04503");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "CHN     ", (java.lang.CharSequence) "italien");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test04504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04504");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("ese (Taiwan$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test04505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04505");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("ususususususususususususususususususus", "xxxxxxxxinglese (Canada)xxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04506");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("isangl", (int) 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04507");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("GNE", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GNE" + "'", str3, "GNE");
    }

    @Test
    public void test04508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04508");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahI", "                                ese(Taiwan", (int) (byte) 0);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "hi!", (int) (byte) 0);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("China", strArray9);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "a", (int) '4', (int) ' ');
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "twn");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("zh-cn", strArray4, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test04509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04509");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str1, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test04510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04510");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("TWN", "CHN", "\u4e2d\u56fd\u8a9e", 93);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "TWN" + "'", str4, "TWN");
    }

    @Test
    public void test04511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04511");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator3 = languageRangeList1.spliterator();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("zh-CN");
        java.util.Locale locale8 = builder5.build();
        boolean boolean9 = languageRangeList1.remove((java.lang.Object) locale8);
        java.util.Locale.setDefault(locale8);
        java.util.Locale locale11 = java.util.Locale.CANADA;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleAttributes();
        java.lang.String str13 = locale8.getDisplayVariant(locale11);
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        java.util.Locale.Builder builder18 = builder16.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder20 = builder18.setLanguage("CHINA");
        java.util.Locale locale21 = builder18.build();
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleKeys();
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.lowerCase("Zxxxxxxxxxxxxxxxxxxx", locale21);
        java.lang.String str24 = locale21.getDisplayLanguage();
        java.lang.String str25 = locale8.getDisplayScript(locale21);
        java.lang.String str26 = locale21.getDisplayCountry();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeSpliterator3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_CA");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "china_CN");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zxxxxxxxxxxxxxxxxxxx" + "'", str23, "zxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "china" + "'", str24, "china");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u56fd" + "'", str26, "\u4e2d\u56fd");
    }

    @Test
    public void test04512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04512");
        java.util.Locale locale3 = new java.util.Locale("zho", "US");
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.lang.String str6 = locale4.getVariant();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHN     ", locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale4.getUnicodeLocaleType("esecnarF");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: esecnarF");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn     " + "'", str7, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn     ");
    }

    @Test
    public void test04513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04513");
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
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream68 = languageRangeList3.parallelStream();
        java.lang.Object[] objArray69 = languageRangeList3.toArray();
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor70 = languageRangeList3.iterator();
        java.lang.String str72 = org.apache.commons.lang3.StringUtils.join(languageRangeItor70, '.');
        java.lang.String str74 = org.apache.commons.lang3.StringUtils.join(languageRangeItor70, 'a');
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
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\u4e2d\u56fd" + "'", str39, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "zh-CN" + "'", str40, "zh-CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u4e2d\u56fd" + "'", str43, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\u4e2d\u56fd" + "'", str46, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale50.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\u4e2d\u56fd" + "'", str53, "\u4e2d\u56fd");
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
        org.junit.Assert.assertNotNull(languageRangeStream68);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(languageRangeItor70);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
    }

    @Test
    public void test04514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04514");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaa$", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaa$" + "'", str2, "aaaaaaaaa$");
    }

    @Test
    public void test04515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04515");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("rance)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rance)" + "'", str1, "rance)");
    }

    @Test
    public void test04516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("ANIHC                                                                                               ", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ANIHC                                                                                               " + "'", str2, "ANIHC                                                                                               ");
    }

    @Test
    public void test04517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04517");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("iiiiiiiiiiiiiiiiiiiiiiiArrayList", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiArrayList" + "'", str3, "iiiiiiiiiiiiiiiiiiiiiiiArrayList");
    }

    @Test
    public void test04518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04518");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "en_", "und");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04519");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("z", "CA", (int) '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test04520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04520");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("xxxhi!xxxxxxxhi", "DE ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04521");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                ese(Taiwan");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test04522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04522");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hindi (HI!,cHINA)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hindi(HI!,cHINA)" + "'", str1, "hindi(HI!,cHINA)");
    }

    @Test
    public void test04523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04523");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("lang                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lang" + "'", str1, "lang");
    }

    @Test
    public void test04524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04524");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CN" + "'", str1, "CN");
    }

    @Test
    public void test04525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04525");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("en-CASTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN", "################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04526");
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
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray12);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray12);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray14);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray15, 'a');
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04527");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("\u82f1\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u6587\u52a0\u62ff\u5927)" + "'", str1, "\u82f1\u6587\u52a0\u62ff\u5927)");
    }

    @Test
    public void test04528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04528");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("                                                                                                   .", (double) 33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=33.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04529");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\u4e2d\u6587\u4e2d\u56fd)", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04530");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                javacinese.cineselang                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                gnalesenic.esenicavaj                                                " + "'", str1, "                                                gnalesenic.esenicavaj                                                ");
    }

    @Test
    public void test04531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04531");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("jpn", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jpn" + "'", str2, "jpn");
    }

    @Test
    public void test04532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04532");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("##############################################", 350, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##############################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "##############################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test04533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04533");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("in", "cn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "in" + "'", str2, "in");
    }

    @Test
    public void test04534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04534");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("Cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "aiaiaiaiaiaiaiaiaia");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aiaiaiaiaiaiaiaiaia" + "'", str2, "aiaiaiaiaiaiaiaiaia");
    }

    @Test
    public void test04535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04535");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("xxxhi!xxxxxxxhi", "AN                 a                 AN", "                 A                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxhi!xxxxxxxhi" + "'", str3, "xxxhi!xxxxxxxhi");
    }

    @Test
    public void test04536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04536");
        java.util.Locale locale1 = java.util.Locale.TAIWAN;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("", locale1);
        java.lang.String str3 = locale1.getISO3Country();
        java.util.Set<java.lang.Character> charSet4 = locale1.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale1.getExtension('.');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TWN" + "'", str3, "TWN");
        org.junit.Assert.assertNotNull(charSet4);
    }

    @Test
    public void test04537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04537");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "ARRAYLIST");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04538");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGL" + "'", str1, "GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGL");
    }

    @Test
    public void test04539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("LANG                                                      ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LANG                                                      " + "'", str2, "LANG                                                      ");
    }

    @Test
    public void test04540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04540");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.setLanguage("Engls");
        java.util.Locale locale10 = new java.util.Locale("");
        java.lang.String str11 = locale10.getDisplayLanguage();
        java.util.Locale locale12 = java.util.Locale.CANADA;
        java.lang.String str13 = locale12.getDisplayLanguage();
        java.lang.String str14 = locale10.getDisplayScript(locale12);
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.util.Locale locale17 = new java.util.Locale("");
        java.lang.String str18 = locale17.getDisplayLanguage();
        java.util.Locale locale19 = java.util.Locale.CANADA;
        java.lang.String str20 = locale19.getDisplayLanguage();
        java.lang.String str21 = locale17.getDisplayScript(locale19);
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale23);
        java.lang.String str25 = locale17.getDisplayCountry(locale23);
        java.lang.String str26 = locale15.getDisplayScript(locale17);
        java.lang.String str27 = locale17.getDisplayCountry();
        java.lang.String str28 = locale17.getDisplayLanguage();
        java.util.Locale locale29 = java.util.Locale.PRC;
        java.lang.String str30 = locale17.getDisplayScript(locale29);
        java.lang.String str31 = locale12.getDisplayCountry(locale17);
        java.util.Locale.Builder builder32 = builder8.setLocale(locale12);
        java.lang.String str33 = locale12.getVariant();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u82f1\u6587" + "'", str13, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u82f1\u6587" + "'", str20, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "english" + "'", str24, "english");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Canada" + "'", str31, "Canada");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test04541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04541");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("xxxhi!xxxx", "ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayList", 7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxhi!xxxx" + "'", str3, "xxxhi!xxxx");
    }

    @Test
    public void test04542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04542");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("Hindi (HI!,cHINA)", "WZ.MZ.AZ.TY.EY.SW.FW.UV.NV.IV.GV.EV.CV.AV.ZU.YU.SU.MU.GU.AU.ZT.WT.VT.TT.RT.OT.NT.MT.LT.KT.JT.HT.GT.FT.DT.CT.ZS.YS.XS.VS.TS.SS.RS.OS.NS.MS.LS.KS.JS.IS.HS.GS.ES.DS.CS.BS.AS.WR.UR.SR.OR.ER.AQ.YP.WP.TP.SP.RP.NP.MP.LP.KP.HP.GP.FP.EP.AP.MO.ZN.UN.RN.PN.ON.LN.IN.GN.FN.EN.CN.AN.ZM.YM.XM.WM.VM.UM.TM.SM.RM.QM.PM.OM.NM.MM.LM.KM.HM.GM.FM.EM.DM.CM.AM.YL.VL.UL.TL.SL.RL.KL.IL.CL.BL.AL.ZK.YK.WK.RK.PK.NK.MK.IK.HK.GK.EK.PJ.OJ.MJ.EJ.TI.SI.RI.QI.OI.NI.MI.LI.EI.DI.UH.TH.RH.NH.MH.KH.YG.WG.UG.TG.SG.RG.QG.PG.NG.MG.LG.IG.HG.GG.FG.EG.DG.BG.AG.RF.OF.MF.KF.JF.IF.TE.SE.RE.HE.GE.EE.CE.ZD.OD.MD.KD.JD.ED.ZC.YC.XC.WC.VC.UC.RC.OC.NC.MC.LC.KC.IC.HC.GC.FC.DC.CC.AC.ZB.YB.WB.VB.TB.SB.RB.QB.OB.NB.MB.LB.JB.IB.HB.GB.FB.EB.DB.BB.AB.ZA.XA.WA.UA.TA.SA.RA.QA.OA.NA.MA.LA.IA.GA.FA.EA.DA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04543");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLIS", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04544");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder4 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder1.setRegion("inglese (Canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: inglese (Canada) [at index 0]");
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
    public void test04545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04545");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("engls", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04546");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("....english", "Japaneseuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04547");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("tsiLyarrAH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test04548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04548");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04549");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn", (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04550");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("Locale", 42, 93);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04551");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("hina");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hina" + "'", str1, "hina");
    }

    @Test
    public void test04552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04552");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "STI-F");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04553");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxx" + "'", str1, "italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxx");
    }

    @Test
    public void test04554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04554");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("zh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglish", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04555");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "An", (java.lang.CharSequence) "acol");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "An" + "'", charSequence2, "An");
    }

    @Test
    public void test04556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04556");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\u4e2d\u6587 (ZH)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test04557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04557");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("twn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "twn" + "'", str1, "twn");
    }

    @Test
    public void test04558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04558");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("h", "CHNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test04559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04559");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("anihc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anih" + "'", str1, "anih");
    }

    @Test
    public void test04560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04560");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("US", "hI");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04561");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("Canada", "xxxxxxxxxxFrench(France)xxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04562");
        java.lang.Iterable<java.util.Locale.LanguageRange> languageRangeIterable0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(languageRangeIterable0, "ita");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04563");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Chin", "english");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                    ", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "zh_CN");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04564");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\u53f0\u7063", "a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#", "arraylist###########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u53f0\u7063" + "'", str3, "\u53f0\u7063");
    }

    @Test
    public void test04565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04565");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                redliuB.elacoL", "A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04566");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("zh_C");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test04567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04567");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("CN", "Cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N" + "'", str2, "N");
    }

    @Test
    public void test04568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04568");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]", "ANIHCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]" + "'", str2, "TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]");
    }

    @Test
    public void test04569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04569");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder0.setRegion("AI");
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "AI", "redliuB.elacoL");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "String" + "'", str6, "String");
    }

    @Test
    public void test04570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04570");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("EnglCNsCN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: EnglCNsCN");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
    }

    @Test
    public void test04571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04571");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "ANIHC                                                                                               ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04572");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("rance)Itali", "CAN", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04573");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ocle.Bulde", 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04574");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("English");
        java.util.Locale.Builder builder6 = builder4.setLanguage("nglese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setScript("\u4e2d\u6587\u4e2d\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test04575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04575");
        java.util.Locale locale3 = new java.util.Locale("zh-CNenglish", "Locale.LanguageRange", "");
        java.util.Locale.setDefault(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale3.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
    }

    @Test
    public void test04576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04576");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "ANIHC   ENGLTWNSTWN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04577");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd(".....ZHCINESESE", "LANGUAGERANGE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".....ZHCINESES" + "'", str2, ".....ZHCINESES");
    }

    @Test
    public void test04578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04578");
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
        java.util.List<java.util.Locale.LanguageRange> languageRangeList22 = java.util.Locale.LanguageRange.parse("Chinese");
        boolean boolean23 = languageRangeList15.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22);
        java.lang.Object[] objArray24 = languageRangeList22.toArray();
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
        org.junit.Assert.assertNotNull(languageRangeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test04579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04579");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("ESE (tAIWAN", "\u5317\u5370\u5ea6\u6587 (HI!,cHINA)", "inglese (Canada)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ESE (tAIWAN" + "'", str3, "ESE (tAIWAN");
    }

    @Test
    public void test04580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04580");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "Canada");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04581");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("ssalC", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssalC" + "'", str2, "ssalC");
    }

    @Test
    public void test04582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04582");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("       hi!", 42, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxxxxxxxxxxxxxx       hi!xxxxxxxxxxxxxxxx" + "'", str3, "xxxxxxxxxxxxxxxx       hi!xxxxxxxxxxxxxxxx");
    }

    @Test
    public void test04583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04583");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) ".Cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04584");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("c", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               c                " + "'", str2, "               c                ");
    }

    @Test
    public void test04585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04585");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder2.setLanguage("HI");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.addUnicodeLocaleAttribute("ARRAYLIS");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setScript("xxxhi!xxxx");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: xxxhi!xxxx [at index 0]");
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
    public void test04586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04586");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Ci_a", "an       a");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04587");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayList");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayList [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test04588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04588");
        java.lang.String[] strArray4 = new java.lang.String[] { "class java.lang.Stringclass java.lang.Stringclass java.lang.String", "                                redliuB.elacoL", "string", "collecti" };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test04589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04589");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("zhcines", "ANIHC      xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", 8);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04590");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "ITALIEN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04591");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("CINESE", "cinese (Taiwan)", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04592");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ANIHC      ", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
        boolean boolean8 = languageRangeList7.isEmpty();
        boolean boolean9 = languageRangeList2.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.parse("cHINA", strMap11);
        boolean boolean13 = languageRangeList7.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor14 = languageRangeList12.iterator();
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
        java.lang.String str76 = java.util.Locale.lookupTag(languageRangeList12, (java.util.Collection<java.lang.String>) strList23);
        java.util.Collection<java.util.Locale.LanguageRange> languageRangeCollection78 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean79 = languageRangeList12.addAll(6, languageRangeCollection78);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(languageRangeItor14);
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
// flaky:         org.junit.Assert.assertEquals(locale35.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Cina" + "'", str36, "Cina");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "zh-CN" + "'", str37, "zh-CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Cina" + "'", str40, "Cina");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
// flaky:         org.junit.Assert.assertEquals(locale42.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Cina" + "'", str43, "Cina");
        org.junit.Assert.assertEquals(locale47.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale49);
// flaky:         org.junit.Assert.assertEquals(locale49.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Cina" + "'", str50, "Cina");
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
        org.junit.Assert.assertNull(str76);
    }

    @Test
    public void test04593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04593");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "#######################################################################################", 6);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test04594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04594");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList43 = languageRangeList40.subList(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
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
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "inglese" + "'", str21, "inglese");
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
    }

    @Test
    public void test04595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04595");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("             AN       A             ", "af");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             AN       A             " + "'", str2, "             AN       A             ");
    }

    @Test
    public void test04596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04596");
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
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray12);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray13);
        java.lang.Class[] classArray17 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray17);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray17);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray17);
        java.lang.Class[] classArray23 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray23);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray23);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray23);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray27);
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, wildcardClassArray27, true);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.concatWith("iiiiiiiiiiiiiiiiiiiiiiiArrayList", (java.lang.Object[]) wildcardClassArray21);
        boolean boolean33 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray21, true);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        java.lang.Class[] classArray36 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray36);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray36);
        java.lang.Class[] classArray41 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray42 = (java.lang.Class<?>[]) classArray41;
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray41);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray41);
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray41, "zh-CN");
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, (java.lang.Class<?>[]) classArray41);
        java.lang.Class[] classArray49 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray50 = (java.lang.Class<?>[]) classArray49;
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray49);
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray49);
        java.lang.Class[] classArray55 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray55);
        java.lang.String str58 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray55);
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray49, (java.lang.Class<?>[]) classArray55);
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, (java.lang.Class<?>[]) classArray55, true);
        java.lang.Class[] classArray63 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray64 = (java.lang.Class<?>[]) classArray63;
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray63);
        java.lang.Class<?> wildcardClass66 = null;
        java.lang.Class[] classArray68 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray69 = (java.lang.Class<?>[]) classArray68;
        wildcardClassArray69[0] = wildcardClass66;
        boolean boolean73 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray65, wildcardClassArray69, false);
        java.lang.Class[] classArray75 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray76 = (java.lang.Class<?>[]) classArray75;
        java.lang.Class<?>[] wildcardClassArray77 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray75);
        boolean boolean78 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray65, (java.lang.Class<?>[]) classArray75);
        java.lang.Class[] classArray80 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray81 = (java.lang.Class<?>[]) classArray80;
        java.lang.Class<?>[] wildcardClassArray82 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray80);
        java.lang.Class<?>[] wildcardClassArray83 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray80);
        java.lang.Class[] classArray85 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray86 = (java.lang.Class<?>[]) classArray85;
        java.lang.Class<?>[] wildcardClassArray87 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray85);
        java.lang.Class<?>[] wildcardClassArray88 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray85);
        java.lang.String str90 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray85, "zh-CN");
        boolean boolean91 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray83, (java.lang.Class<?>[]) classArray85);
        boolean boolean93 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray65, wildcardClassArray83, false);
        java.lang.Class<?>[] wildcardClassArray94 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray65);
        java.lang.Class<?>[] wildcardClassArray95 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray65);
        boolean boolean96 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray55, wildcardClassArray65);
        boolean boolean98 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, (java.lang.Class<?>[]) classArray55, true);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(classArray63);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertNotNull(classArray68);
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(classArray75);
        org.junit.Assert.assertNotNull(wildcardClassArray76);
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(classArray80);
        org.junit.Assert.assertNotNull(wildcardClassArray81);
        org.junit.Assert.assertNotNull(wildcardClassArray82);
        org.junit.Assert.assertNotNull(wildcardClassArray83);
        org.junit.Assert.assertNotNull(classArray85);
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertNotNull(wildcardClassArray87);
        org.junit.Assert.assertNotNull(wildcardClassArray88);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray94);
        org.junit.Assert.assertNotNull(wildcardClassArray95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test04597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04597");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("slgne", "Locale.LanguageRang");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "slgne" + "'", str2, "slgne");
    }

    @Test
    public void test04598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04598");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
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
        java.util.Locale locale21 = locale1.stripExtensions();
        java.lang.String str22 = locale0.getDisplayName(locale1);
        java.lang.String str23 = locale1.getLanguage();
        java.lang.String str24 = locale1.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cina" + "'", str3, "Cina");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "inglese" + "'", str11, "inglese");
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
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u6cd5\u6587" + "'", str22, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zh" + "'", str23, "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "cinese" + "'", str24, "cinese");
    }

    @Test
    public void test04599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04599");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CTWzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-C", "Chinesisch (China)");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04600");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("twn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "tw" + "'", str1, "tw");
    }

    @Test
    public void test04601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04601");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ja", "char[]", 4);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04602");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test04603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04603");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("ListfraHAr");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=listfrahar");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04604");
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
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap58 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList59 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, strMap58);
        int int60 = languageRangeList56.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList62 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean64 = languageRangeList62.remove((java.lang.Object) "English");
        boolean boolean65 = languageRangeList56.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62);
        java.util.Locale.LanguageRange languageRange67 = new java.util.Locale.LanguageRange("English");
        java.lang.String str68 = languageRange67.getRange();
        boolean boolean69 = languageRangeList62.add(languageRange67);
        languageRangeList31.add(0, languageRange67);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap72 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList73 = java.util.Locale.LanguageRange.parse("english", strMap72);
        int int74 = languageRangeList31.lastIndexOf((java.lang.Object) languageRangeList73);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream75 = languageRangeList73.parallelStream();
        java.lang.String str77 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList73, 'a');
        java.util.Collection[] collectionArray79 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.Locale.LanguageRange>[] languageRangeCollectionArray80 = (java.util.Collection<java.util.Locale.LanguageRange>[]) collectionArray79;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.util.Locale.LanguageRange>[] languageRangeCollectionArray81 = languageRangeList73.toArray(languageRangeCollectionArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
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
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(languageRangeList59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(languageRangeList62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "english" + "'", str68, "english");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(languageRangeList73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(languageRangeStream75);
        org.junit.Assert.assertNotNull(collectionArray79);
        org.junit.Assert.assertNotNull(languageRangeCollectionArray80);
    }

    @Test
    public void test04605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04605");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Ci_a", "aiaiaiaiaiaiaiaiaia");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04606");
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
        java.lang.String str74 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor72, "Chin");
        boolean boolean75 = languageRangeList7.equals((java.lang.Object) languageRangeItor72);
        boolean boolean76 = languageRangeList7.isEmpty();
        java.lang.String[] strArray84 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        java.util.List<java.lang.Class<?>> wildcardClassList87 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList85);
        java.util.List<java.lang.Class<?>> wildcardClassList88 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList85);
        java.util.List<java.lang.Class<?>> wildcardClassList89 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList85);
        boolean boolean90 = languageRangeList7.equals((java.lang.Object) wildcardClassList89);
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
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Cina" + "'", str32, "Cina");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zh-CN" + "'", str33, "zh-CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale35);
// flaky:         org.junit.Assert.assertEquals(locale35.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Cina" + "'", str36, "Cina");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Cina" + "'", str39, "Cina");
        org.junit.Assert.assertEquals(locale43.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
// flaky:         org.junit.Assert.assertEquals(locale45.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Cina" + "'", str46, "Cina");
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
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClassList87);
        org.junit.Assert.assertNotNull(wildcardClassList88);
        org.junit.Assert.assertNotNull(wildcardClassList89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test04607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04607");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("CINA", 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04608");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04609");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("French");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "French" + "'", str1, "French");
    }

    @Test
    public void test04610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04610");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("Chin", "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chin" + "'", str2, "Chin");
    }

    @Test
    public void test04611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04611");
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
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray7, "h");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray7, "ahi!hi!", (int) (byte) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test04612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04612");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "Chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04613");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("GNAL.AVAJSTRING[]STRING[]STRING[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GNAL.AVAJSTRING[]STRING[]STRING[" + "'", str1, "GNAL.AVAJSTRING[]STRING[]STRING[");
    }

    @Test
    public void test04614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04614");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("deu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "deu" + "'", str1, "deu");
    }

    @Test
    public void test04615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04615");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder6.setRegion("ja");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale locale10 = builder9.build();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = locale10.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for JA");
        } catch (java.util.MissingResourceException e) {
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
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_JA");
    }

    @Test
    public void test04616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04616");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("                 a                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test04617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04617");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator3 = languageRangeList1.spliterator();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("zh-CN");
        java.util.Locale locale8 = builder5.build();
        boolean boolean9 = languageRangeList1.remove((java.lang.Object) locale8);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.parse("hi");
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale16);
        java.util.Locale locale18 = java.util.Locale.US;
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale21 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = locale21.getDisplayCountry(locale22);
        java.lang.String str24 = locale21.toLanguageTag();
        java.util.Locale locale25 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale26 = java.util.Locale.getDefault();
        java.lang.String str27 = locale25.getDisplayCountry(locale26);
        java.util.Locale locale28 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.lang.String str30 = locale28.getDisplayCountry(locale29);
        java.util.Locale locale34 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale35 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = locale35.getDisplayCountry(locale36);
        java.util.Locale locale39 = new java.util.Locale("");
        java.lang.String str40 = locale39.getDisplayVariant();
        java.util.Locale locale41 = java.util.Locale.KOREAN;
        java.util.Locale locale43 = new java.util.Locale("");
        java.util.Locale locale44 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray45 = new java.util.Locale[] { locale16, locale18, locale19, locale20, locale21, locale26, locale28, locale34, locale36, locale39, locale41, locale43, locale44 };
        java.util.ArrayList<java.util.Locale> localeList46 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList46, localeArray45);
        java.util.List<java.util.Locale> localeList48 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.util.Locale>) localeList46);
        java.lang.String[] strArray56 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        java.util.List<java.lang.Class<?>> wildcardClassList59 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList57);
        java.util.Locale.FilteringMode filteringMode60 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList61 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList57, filteringMode60);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator62 = languageRangeList13.spliterator();
        boolean boolean63 = languageRangeList11.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        boolean boolean64 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor66 = languageRangeList13.listIterator(350);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 350");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "english" + "'", str17, "english");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Cina" + "'", str23, "Cina");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "zh-CN" + "'", str24, "zh-CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale26);
// flaky:         org.junit.Assert.assertEquals(locale26.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Cina" + "'", str27, "Cina");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale29);
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Cina" + "'", str30, "Cina");
        org.junit.Assert.assertEquals(locale34.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Cina" + "'", str37, "Cina");
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ko");
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(localeList48);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(wildcardClassList59);
        org.junit.Assert.assertTrue("'" + filteringMode60 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode60.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(languageRangeSpliterator62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test04618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04618");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("AHI!HI!", 45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHI!HI!                                      " + "'", str2, "AHI!HI!                                      ");
    }

    @Test
    public void test04619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04619");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGL" + "'", str1, "GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGL");
    }

    @Test
    public void test04620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04620");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ia", "                                                                                                   $");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("nglese", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test04621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04621");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHi", 31, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHi" + "'", str3, "..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHi");
    }

    @Test
    public void test04622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04622");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "ita");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04623");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("An", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "An                              " + "'", str2, "An                              ");
    }

    @Test
    public void test04624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04624");
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
        java.util.List<java.util.Locale.LanguageRange> languageRangeList80 = java.util.Locale.LanguageRange.parse("cn");
        java.lang.String str82 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList80, '$');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean83 = languageRangeList1.addAll(9, (java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList80);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9, Size: 0");
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
        org.junit.Assert.assertNotNull(languageRangeList80);
    }

    @Test
    public void test04625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn     ", "ese (Taiwan");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch" + "'", str2, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch");
    }

    @Test
    public void test04626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04626");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("zh_tw_CHINCHINCHINCHINCHICHINCHINCHINCHINC", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_tw_CHINCHINCHINCHINCHICHINCHINCHINCHINC" + "'", str2, "zh_tw_CHINCHINCHINCHINCHICHINCHINCHINCHINC");
    }

    @Test
    public void test04627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04627");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList4 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strSet2, filteringMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test04628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04628");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "cinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinese");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04629");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u4e2d\u56fd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=  ??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04630");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("char[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "char[]" + "'", str1, "char[]");
    }

    @Test
    public void test04631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04631");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.util.Locale.LanguageRange languageRange3 = new java.util.Locale.LanguageRange("cn");
        boolean boolean4 = languageRangeList1.add(languageRange3);
        int int6 = languageRangeList1.indexOf((java.lang.Object) "xxxxxxxxinglese (Canada)xxxxxxxx");
        int int7 = languageRangeList1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange9 = languageRangeList1.get(27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 27, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test04632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04632");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguage("hI");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setVariant("inglese (Canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: inglese (Canada) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test04633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04633");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\u4e2d\u6587\u4e2d\u570b)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 45, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u6587\u4e2d\u570b)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "\u4e2d\u6587\u4e2d\u570b)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04634");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.lang.String str4 = locale2.getDisplayScript();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.lang.String str8 = locale7.getDisplayName();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chinois" + "'", str3, "chinois");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str8, "\u4e2d\u6587\u53f0\u7063)");
    }

    @Test
    public void test04635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04635");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "\u4e2d\u570b");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04636");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("engliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "engliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWA" + "'", str1, "engliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWA");
    }

    @Test
    public void test04637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04637");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\u4e2d\u56fd", "englCNsCN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd" + "'", str2, "\u4e2d\u56fd");
    }

    @Test
    public void test04638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04638");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi", "iiiiiiiiiiiiiiiiiiiiiiiArrayList");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test04639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04639");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("acoL", "Canada");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "acoL" + "'", str2, "acoL");
    }

    @Test
    public void test04640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04640");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "CN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04641");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(".....ZHCINESESE", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".....ZHCINESESE" + "'", str3, ".....ZHCINESESE");
    }

    @Test
    public void test04642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04642");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("twn");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", locale2);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("Collecti");
        java.util.Locale locale6 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.lang.String str8 = locale6.getDisplayCountry(locale7);
        java.lang.String str9 = locale6.toLanguageTag();
        java.lang.String str10 = locale6.getLanguage();
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.util.Locale locale13 = new java.util.Locale("");
        java.lang.String str14 = locale13.getDisplayLanguage();
        java.util.Locale locale15 = java.util.Locale.CANADA;
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.lang.String str17 = locale13.getDisplayScript(locale15);
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale19);
        java.lang.String str21 = locale13.getDisplayCountry(locale19);
        java.lang.String str22 = locale11.getDisplayScript(locale13);
        java.util.Locale locale23 = java.util.Locale.GERMAN;
        java.lang.String str24 = locale13.getDisplayLanguage(locale23);
        java.lang.String str25 = locale6.getDisplayCountry(locale13);
        java.lang.String str26 = locale13.getCountry();
        java.util.Locale locale30 = new java.util.Locale("....english", "zhcinesese", ".");
        java.lang.String str31 = locale13.getDisplayName(locale30);
        java.lang.String str32 = locale13.getDisplayName();
        java.lang.String str33 = locale5.getDisplayLanguage(locale13);
        boolean boolean34 = locale2.equals((java.lang.Object) str33);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "twn");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str3, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "collecti");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chine" + "'", str8, "Chine");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh-CN" + "'", str9, "zh-CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh" + "'", str10, "zh");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u82f1\u6587" + "'", str16, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "english" + "'", str20, "english");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "China" + "'", str25, "China");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals(locale30.toString(), "....english_ZHCINESESE_.");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "collecti" + "'", str33, "collecti");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test04643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04643");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGL", "frazh-CNenglis", "h");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04644");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("CINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04645");
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
        java.util.Locale locale20 = new java.util.Locale("zho", "US");
        java.util.Locale locale21 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str22 = locale20.getDisplayVariant(locale21);
        java.lang.String str23 = locale21.getLanguage();
        java.util.Locale.setDefault(category0, locale21);
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
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chine" + "'", str13, "Chine");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale16);
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale20.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "fr" + "'", str23, "fr");
    }

    @Test
    public void test04646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04646");
        java.util.Locale locale3 = new java.util.Locale("hi", "hi!", "cHINA");
        java.lang.String str4 = locale3.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for HI!");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi" + "'", str4, "hi");
    }

    @Test
    public void test04647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04647");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u5fb7\u6587\u5fb7\u56fd)" + "'", str1, "\u5fb7\u6587\u5fb7\u56fd)");
    }

    @Test
    public void test04648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04648");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay(" ud  ", "AN                 a                 AN   ", 5, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AN                 a                 AN   " + "'", str4, "AN                 a                 AN   ");
    }

    @Test
    public void test04649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04649");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("fr", "\u4e2d\u6587\u53f0\u7063)", 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("undaaaaaaaHindi (HI!,cHINAHindi (HI", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test04650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04650");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("arraylist###########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arraylist###########" + "'", str1, "arraylist###########");
    }

    @Test
    public void test04651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04651");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("I!H", "                 A                 ", "xxxhi!xxxx");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!H" + "'", str3, "I!H");
    }

    @Test
    public void test04652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04652");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("ususususususususususususususususususus");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ususususususususususususususususususus" + "'", str1, "ususususususususususususususususususus");
    }

    @Test
    public void test04653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04653");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.z");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04654");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                  HI                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 39 + "'", int1 == 39);
    }

    @Test
    public void test04655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04655");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("chinois (Chine", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chinois (Chine   " + "'", str2, "chinois (Chine   ");
    }

    @Test
    public void test04656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04656");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "engliIlish", "zh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test04657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04657");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi", "chinChinChinChinChiChinChinChinChinC", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
    }

    @Test
    public void test04658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04658");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("ArrayL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ArrayL" + "'", str1, "ArrayL");
    }

    @Test
    public void test04659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04659");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\u4e2d\u56fd", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04660");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("    z", "\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    z" + "'", str2, "    z");
    }

    @Test
    public void test04661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04661");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("STI-F", "uuuuuuuuuuuuuuuuuuuuIthi!lihi!no");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "STI-F" + "'", str2, "STI-F");
    }

    @Test
    public void test04662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04662");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5...", "\u5317\u5370\u5ea6\u6587 (HI!,cHINA)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04663");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "loca");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04664");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "HArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayList");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04665");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.lang.String str3 = locale0.toLanguageTag();
        boolean boolean4 = locale0.hasExtensions();
        java.lang.String str5 = locale0.getDisplayCountry();
        java.util.Set<java.lang.String> strSet6 = locale0.getUnicodeLocaleKeys();
        java.lang.String str7 = locale0.getScript();
        java.lang.String str8 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "China" + "'", str5, "China");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test04666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04666");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hindi (HI!,cHINA)", "xxxhi!xxxx");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04667");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("ANIHCzhcinesesexxxxx", 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04668");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$" + "'", str1, "$");
    }

    @Test
    public void test04669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04669");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("CHINOIS (CHINE)", "frazh-CNenglis");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04670");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("TW", "eng");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04671");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator5 = languageRangeList1.spliterator();
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, strMap9);
        int int11 = languageRangeList7.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean15 = languageRangeList13.remove((java.lang.Object) "English");
        boolean boolean16 = languageRangeList7.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, strMap20);
        java.lang.String[] strArray29 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.List<java.lang.Class<?>> wildcardClassList32 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList30);
        java.lang.String str33 = java.util.Locale.lookupTag(languageRangeList21, (java.util.Collection<java.lang.String>) strList30);
        java.util.List<java.lang.Class<?>> wildcardClassList34 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList30);
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList30);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap39 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList40 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, strMap39);
        int int41 = languageRangeList37.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList43 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean45 = languageRangeList43.remove((java.lang.Object) "English");
        boolean boolean46 = languageRangeList37.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43);
        java.lang.String[] strArray51 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray54 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray55 = org.apache.commons.lang3.StringUtils.stripAll(strArray54);
        java.lang.String[] strArray56 = org.apache.commons.lang3.StringUtils.stripAll(strArray55);
        java.lang.String str57 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray51, strArray55);
        boolean boolean58 = languageRangeList37.equals((java.lang.Object) strArray55);
        boolean boolean59 = languageRangeList7.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37);
        boolean boolean60 = languageRangeList1.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor61 = languageRangeList7.listIterator();
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor62 = languageRangeList7.iterator();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor63 = languageRangeList7.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            languageRangeItor63.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeSpliterator5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClassList32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(wildcardClassList34);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(languageRangeList40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(languageRangeList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str57, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(languageRangeItor61);
        org.junit.Assert.assertNotNull(languageRangeItor62);
        org.junit.Assert.assertNotNull(languageRangeItor63);
    }

    @Test
    public void test04672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04672");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("ChinChinChinChinChinChinChinChinChinaaaaaaaaa#", "LANG                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04673");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("ANIHC      xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "hI", 15, (int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ANIHC      xxxxhIxxx" + "'", str4, "ANIHC      xxxxhIxxx");
    }

    @Test
    public void test04674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04674");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("zxxxxxxxxxxxxxxxxxxx", (int) '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zxxxxxxxxxxxxxxxxxxx" + "'", str2, "zxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test04675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04675");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                ese(Taiwan", "...ggggggggItaliano...ggggggggg", 35);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04676");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "FR");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: FR");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04677");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("CN", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CN" + "'", str2, "CN");
    }

    @Test
    public void test04678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04678");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04679");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("chinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachina", "#######################################################################################", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04680");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "Taiwan");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04681");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setRegion("zh-CNenglis");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: zh-CNenglis [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test04682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04682");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\u4e2d\u6587\u4e2d\u570b)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04683");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder2.setLanguage("HI");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.removeUnicodeLocaleAttribute("Class[]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Class[] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test04684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04684");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "GNE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04685");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "d");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04686");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                 a                  ", "ed");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04687");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                     ARRAYLIST", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                     ARRAYLIST" + "'", str2, "                                     ARRAYLIST");
    }

    @Test
    public void test04688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04688");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("EN_ca", (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04689");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("tring[]", 0, 16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tring[]" + "'", str3, "tring[]");
    }

    @Test
    public void test04690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04690");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\u82f1\u6587");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04691");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\u65e5\u6587");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04692");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Ci_a");
        boolean boolean2 = locale1.hasExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04693");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaCharacteraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaCharacteraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaCharacteraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04694");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("C", (int) (byte) 1, 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04695");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                gnalesenic.esenicavaj                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gnalesenic.esenicavaj" + "'", str1, "gnalesenic.esenicavaj");
    }

    @Test
    public void test04696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04696");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("anih", "xxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxx");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04697");
        java.lang.Object[] objArray0 = null;
        java.lang.Class<?>[] wildcardClassArray1 = org.apache.commons.lang3.ClassUtils.toClass(objArray0);
        org.junit.Assert.assertNull(wildcardClassArray1);
    }

    @Test
    public void test04698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04698");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "Engls", (int) (byte) 1);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("Cina", "zho", 10);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ANIHC", strArray5, strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                   $", strArray9);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "A", 99, (int) '4');
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ANIHC" + "'", str10, "ANIHC");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test04699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04699");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hina", "ArrayList###########", (int) '$');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04700");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a#a#a#a#a#" + "'", str2, "a#a#a#a#a#");
    }

    @Test
    public void test04701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04701");
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
        java.util.Locale.LanguageRange[] languageRangeArray68 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList69 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList69, languageRangeArray68);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap71 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList72 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList69, strMap71);
        int int73 = languageRangeList69.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList75 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean77 = languageRangeList75.remove((java.lang.Object) "English");
        boolean boolean78 = languageRangeList69.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList75);
        boolean boolean79 = languageRangeList3.remove((java.lang.Object) languageRangeList75);
        java.util.Locale locale80 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet81 = locale80.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode82 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags(languageRangeList3, (java.util.Collection<java.lang.String>) strSet81, filteringMode82);
        java.util.Locale.LanguageRange languageRange85 = new java.util.Locale.LanguageRange("a");
        boolean boolean86 = languageRangeList3.add(languageRange85);
        double double87 = languageRange85.getWeight();
        java.lang.String str88 = languageRange85.getRange();
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
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "China" + "'", str39, "China");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "zh-CN" + "'", str40, "zh-CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
// flaky:         org.junit.Assert.assertEquals(locale42.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "China" + "'", str43, "China");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
// flaky:         org.junit.Assert.assertEquals(locale45.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "China" + "'", str46, "China");
        org.junit.Assert.assertEquals(locale50.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "China" + "'", str53, "China");
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
        org.junit.Assert.assertNotNull(languageRangeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(languageRangeList72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(languageRangeList75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertTrue("'" + filteringMode82 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode82.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 1.0d + "'", double87 == 1.0d);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "a" + "'", str88, "a");
    }

    @Test
    public void test04702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04702");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                    nglish  Hindi (HI!,cHINA)", "\u4e2d\u6587", "javacinese.cineselang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                    nglish  Hindi (HI!,cHINA)" + "'", str3, "                    nglish  Hindi (HI!,cHINA)");
    }

    @Test
    public void test04703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04703");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  China   ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test04704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04704");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        java.util.Locale.Builder builder8 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder3.setRegion(" ud  ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region:  ud   [at index 0]");
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
    }

    @Test
    public void test04705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04705");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean3 = languageRangeList1.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange languageRange5 = languageRangeList1.get(0);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList1.listIterator();
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRangeList1, "AN       a");
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder12 = builder10.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder14 = builder12.setLanguage("CHINA");
        java.util.Locale locale15 = builder12.build();
        java.util.Locale.Builder builder16 = builder12.clearExtensions();
        java.util.Locale.Builder builder17 = builder12.clear();
        boolean boolean18 = languageRangeList1.contains((java.lang.Object) builder17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor20 = languageRangeList1.listIterator(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRange5);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ArrayList" + "'", str8, "ArrayList");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "china_CN");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test04706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04706");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "##############################################################################################################################################################################################################################################################################################################################################################", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ##############################################################################################################################################################################################################################################################################################################################################################");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04707");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("cHINA", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange6 = languageRangeList2.remove(33);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 33, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
    }

    @Test
    public void test04708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04708");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("Character", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Character" + "'", str2, "Character");
    }

    @Test
    public void test04709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04709");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayList", "AN                 a                 AN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04710");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder2.setLanguage("HI");
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder6 = builder4.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setRegion("Francese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Francese [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test04711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04711");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "                    nglish  Hindi (HI!,cHINA)", "                 A                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04712");
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
        java.util.List<java.util.Locale.LanguageRange> languageRangeList55 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray56 = languageRangeList55.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList58 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray59 = languageRangeList58.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator60 = languageRangeList58.spliterator();
        boolean boolean61 = languageRangeList55.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList58);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor62 = languageRangeList55.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean63 = languageRangeList2.addAll(3, (java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
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
        org.junit.Assert.assertNotNull(languageRangeList55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(languageRangeList58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(languageRangeSpliterator60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(languageRangeItor62);
    }

    @Test
    public void test04713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04713");
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
        java.util.List<java.util.Locale.LanguageRange> languageRangeList22 = java.util.Locale.LanguageRange.parse("Chinese");
        boolean boolean23 = languageRangeList15.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, strMap27);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor29 = languageRangeList25.iterator();
        java.util.Locale locale32 = new java.util.Locale("");
        java.lang.String str33 = locale32.getDisplayLanguage();
        java.util.Locale locale34 = java.util.Locale.CANADA;
        java.lang.String str35 = locale34.getDisplayLanguage();
        java.lang.String str36 = locale32.getDisplayScript(locale34);
        java.lang.String str37 = locale34.getDisplayVariant();
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.upperCase("", locale34);
        java.lang.String str39 = locale34.getLanguage();
        boolean boolean40 = languageRangeList25.equals((java.lang.Object) locale34);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList42 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray43 = languageRangeList42.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream44 = languageRangeList42.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap48 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList49 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, strMap48);
        java.util.Locale.LanguageRange[] languageRangeArray50 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList51 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList51, languageRangeArray50);
        boolean boolean53 = languageRangeList46.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList51);
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap57 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList58 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, strMap57);
        java.util.Locale.LanguageRange[] languageRangeArray59 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList60 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList60, languageRangeArray59);
        boolean boolean62 = languageRangeList55.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList60);
        java.lang.String str64 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList60, "hi!");
        boolean boolean65 = languageRangeList46.remove((java.lang.Object) languageRangeList60);
        boolean boolean66 = languageRangeList42.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList60);
        boolean boolean67 = languageRangeList25.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList60);
        boolean boolean68 = languageRangeList15.remove((java.lang.Object) languageRangeList60);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream69 = languageRangeList60.parallelStream();
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
        org.junit.Assert.assertNotNull(languageRangeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertNotNull(languageRangeItor29);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940" + "'", str35, "\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "en" + "'", str39, "en");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(languageRangeList42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(languageRangeStream44);
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(languageRangeList49);
        org.junit.Assert.assertNotNull(languageRangeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(languageRangeList58);
        org.junit.Assert.assertNotNull(languageRangeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(languageRangeStream69);
    }

    @Test
    public void test04714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04714");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("arraylist###########", (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04715");
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
        java.lang.String str20 = locale7.getCountry();
        java.util.Locale locale24 = new java.util.Locale("....english", "zhcinesese", ".");
        java.lang.String str25 = locale7.getDisplayName(locale24);
        java.lang.Object obj26 = null;
        boolean boolean27 = locale7.equals(obj26);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940" + "'", str10, "\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale24.toString(), "....english_ZHCINESESE_.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test04716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04716");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Locale locale6 = new java.util.Locale("");
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.lang.String str10 = locale6.getDisplayScript(locale8);
        int int11 = languageRangeList1.indexOf((java.lang.Object) locale6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, 'x');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange15 = languageRangeList1.get((int) '.');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 46, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940" + "'", str9, "\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test04717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04717");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("xxxxxxxxinglese (Canada)xxxxxxxx", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04718");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("Cina", "inglenglese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "inglenglese" + "'", str2, "inglenglese");
    }

    @Test
    public void test04719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04719");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("frazh-CNenglis", 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04720");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHNAAAAA", "FR_CA", "AD.AE.AF.AGchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", 7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHNAAAAA" + "'", str4, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHNAAAAA");
    }

    @Test
    public void test04721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04721");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                              Germn", "####################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              Germn" + "'", str2, "                                                                                              Germn");
    }

    @Test
    public void test04722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04722");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("Locale.Builder", ".Cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Locale.Builder" + "'", str2, "Locale.Builder");
    }

    @Test
    public void test04723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04723");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHi" + "'", str2, "..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHi");
    }

    @Test
    public void test04724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04724");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str1, "\u4e2d\u6587\u53f0\u7063)");
    }

    @Test
    public void test04725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04725");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("xxxxxxxxxxFrench(France)xxxxxxxxxx", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04726");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayList", "cNn");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04727");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange81 = languageRangeList1.get(31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 31, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "China" + "'", str30, "China");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zh-CN" + "'", str31, "zh-CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "China" + "'", str34, "China");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "China" + "'", str37, "China");
        org.junit.Assert.assertEquals(locale41.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
// flaky:         org.junit.Assert.assertEquals(locale43.toString(), "italiahi__Locale.Builder");
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
    }

    @Test
    public void test04728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04728");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("util", "ArrayList");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04729");
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.lang.String str6 = locale2.getDisplayScript(locale4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale2);
        java.lang.String str8 = locale2.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("fr_CA");
        java.lang.String str11 = locale2.getDisplayName(locale10);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940" + "'", str5, "\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test04730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04730");
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
        java.lang.String str17 = locale14.toString();
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
    public void test04731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04731");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("RRAYLIS");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: RRAYLIS");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04732");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\u4e2d\u6587 (ZH)", 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04733");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("anihc", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04734");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "xxxxxxxxxxxxxxxx       hi!xxxxxxxxxxxxxxxx", (java.lang.CharSequence) "sTI-F");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04735");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u82f1\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04736");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean9 = languageRangeList7.remove((java.lang.Object) "English");
        boolean boolean10 = languageRangeList1.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray18);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray19);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray15, strArray19);
        boolean boolean22 = languageRangeList1.equals((java.lang.Object) strArray19);
        java.util.Locale locale25 = new java.util.Locale("");
        java.lang.String str26 = locale25.getDisplayLanguage();
        java.util.Locale locale27 = java.util.Locale.CANADA;
        java.lang.String str28 = locale27.getDisplayLanguage();
        java.lang.String str29 = locale25.getDisplayScript(locale27);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale25);
        java.lang.String str31 = locale25.getDisplayScript();
        java.util.Set<java.lang.String> strSet32 = locale25.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet32);
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
        java.util.List<java.util.Locale.LanguageRange> languageRangeList52 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean54 = languageRangeList52.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.util.Locale locale59 = java.util.Locale.FRANCE;
        java.lang.String str60 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale59);
        java.util.Locale locale61 = java.util.Locale.US;
        java.util.Locale locale62 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale63 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale64 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale65 = java.util.Locale.getDefault();
        java.lang.String str66 = locale64.getDisplayCountry(locale65);
        java.lang.String str67 = locale64.toLanguageTag();
        java.util.Locale locale68 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale69 = java.util.Locale.getDefault();
        java.lang.String str70 = locale68.getDisplayCountry(locale69);
        java.util.Locale locale71 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale72 = java.util.Locale.getDefault();
        java.lang.String str73 = locale71.getDisplayCountry(locale72);
        java.util.Locale locale77 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale78 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale79 = java.util.Locale.getDefault();
        java.lang.String str80 = locale78.getDisplayCountry(locale79);
        java.util.Locale locale82 = new java.util.Locale("");
        java.lang.String str83 = locale82.getDisplayVariant();
        java.util.Locale locale84 = java.util.Locale.KOREAN;
        java.util.Locale locale86 = new java.util.Locale("");
        java.util.Locale locale87 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray88 = new java.util.Locale[] { locale59, locale61, locale62, locale63, locale64, locale69, locale71, locale77, locale79, locale82, locale84, locale86, locale87 };
        java.util.ArrayList<java.util.Locale> localeList89 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList89, localeArray88);
        java.util.List<java.util.Locale> localeList91 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.util.Locale>) localeList89);
        java.util.List<java.util.Locale> localeList92 = java.util.Locale.filter(languageRangeList52, (java.util.Collection<java.util.Locale>) localeList89);
        java.util.List<java.util.Locale> localeList93 = java.util.Locale.filter(languageRangeList38, (java.util.Collection<java.util.Locale>) localeList92);
        java.util.Locale.FilteringMode filteringMode94 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList95 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList92, filteringMode94);
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator96 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList1.replaceAll(languageRangeUnaryOperator96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str21, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940" + "'", str28, "\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "a" + "'", str30, "a");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClassList49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(languageRangeList52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "english" + "'", str60, "english");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale65);
// flaky:         org.junit.Assert.assertEquals(locale65.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "China" + "'", str66, "China");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "zh-CN" + "'", str67, "zh-CN");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale69);
// flaky:         org.junit.Assert.assertEquals(locale69.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "China" + "'", str70, "China");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale72);
// flaky:         org.junit.Assert.assertEquals(locale72.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "China" + "'", str73, "China");
        org.junit.Assert.assertEquals(locale77.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale79);
// flaky:         org.junit.Assert.assertEquals(locale79.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "China" + "'", str80, "China");
        org.junit.Assert.assertEquals(locale82.toString(), "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "ko");
        org.junit.Assert.assertEquals(locale86.toString(), "");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(localeList91);
        org.junit.Assert.assertNotNull(localeList92);
        org.junit.Assert.assertNotNull(localeList93);
        org.junit.Assert.assertTrue("'" + filteringMode94 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode94.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList95);
    }

    @Test
    public void test04737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04737");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor5 = languageRangeList1.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = languageRangeList1.subList(0, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 39");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeItor5);
    }

    @Test
    public void test04738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04738");
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
        java.util.Locale locale19 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Taiwan" + "'", str7, "Taiwan");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str10, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "twn");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str16, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "twn");
    }

    @Test
    public void test04739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04739");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.z");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04740");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHN     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04741");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("esesenichz", "ng                                                      a.lava                                                      j");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "esesenichz" + "'", str2, "esesenichz");
    }

    @Test
    public void test04742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04742");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("HI", strMap1);
        java.util.Collection<java.util.Locale> localeCollection3 = null;
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap7);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream9 = languageRangeList5.stream();
        boolean boolean10 = languageRangeList5.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, strMap14);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor16 = languageRangeList15.listIterator();
        boolean boolean17 = languageRangeList5.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.parse("Cina", strMap19);
        java.lang.String[] strArray24 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.Locale.FilteringMode filteringMode27 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags(languageRangeList20, (java.util.Collection<java.lang.String>) strList25, filteringMode27);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap30 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList31 = java.util.Locale.LanguageRange.parse("Cina", strMap30);
        java.lang.String[] strArray35 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.Locale.FilteringMode filteringMode38 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags(languageRangeList31, (java.util.Collection<java.lang.String>) strList36, filteringMode38);
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags(languageRangeList15, (java.util.Collection<java.lang.String>) strList25, filteringMode38);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList41 = java.util.Locale.filter(languageRangeList2, localeCollection3, filteringMode38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(languageRangeStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(languageRangeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + filteringMode27 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode27.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(languageRangeList31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + filteringMode38 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode38.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strList40);
    }

    @Test
    public void test04743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04743");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd", "zh-cn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" + "'", str2, "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
    }

    @Test
    public void test04744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04744");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("REFERENCEPIPELINE.HEAD", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=referencepipeline.head");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04745");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayList", (java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiArrayList");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayList" + "'", charSequence2, "ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayList");
    }

    @Test
    public void test04746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04746");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList1.listIterator();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor6, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange9 = languageRangeItor6.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test04747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04747");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04748");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish", "c");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish" + "'", str2, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish");
    }

    @Test
    public void test04749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04749");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniC", 42, "it                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCit    " + "'", str3, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCit    ");
    }

    @Test
    public void test04750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04750");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI!", "RGLaSa", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04751");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("fran\347ais", "\u4e2d\u56fd\u8a9e", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04752");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\u82f1\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04753");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) builder3, "CHNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.util.Locale.Builder builder8 = builder3.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder3.setExtension(' ', "ng                                                      a.lava                                                      j");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Locale.Builder" + "'", str6, "Locale.Builder");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test04754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04754");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("z", 16, "cINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cINACINzcINACINA" + "'", str3, "cINACINzcINACINA");
    }

    @Test
    public void test04755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04755");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("ENENENENENENENENENEN", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ENENENENENENENENENEN" + "'", str2, "ENENENENENENENENENEN");
    }

    @Test
    public void test04756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04756");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHi", "", 7);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04757");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("44444444EnglTWNsTWN44444444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444EnglTWNsTWN44444444" + "'", str2, "44444444EnglTWNsTWN44444444");
    }

    @Test
    public void test04758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04758");
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.lang.String str6 = locale2.getDisplayScript(locale4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale2);
        java.lang.String str8 = locale2.getISO3Country();
        java.lang.String str9 = locale2.getDisplayCountry();
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = locale10.getDisplayCountry(locale11);
        java.lang.String str13 = locale10.toLanguageTag();
        boolean boolean14 = locale10.hasExtensions();
        java.lang.String str15 = locale10.getDisplayCountry();
        java.util.Set<java.lang.String> strSet16 = locale10.getUnicodeLocaleKeys();
        java.lang.String str17 = locale10.getScript();
        java.util.Locale locale18 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale18.getDisplayCountry(locale20);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap25 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList26 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, strMap25);
        java.lang.String[] strArray34 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.util.List<java.lang.Class<?>> wildcardClassList37 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList35);
        java.lang.String str38 = java.util.Locale.lookupTag(languageRangeList26, (java.util.Collection<java.lang.String>) strList35);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList40 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean42 = languageRangeList40.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.util.Locale locale47 = java.util.Locale.FRANCE;
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale47);
        java.util.Locale locale49 = java.util.Locale.US;
        java.util.Locale locale50 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale51 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale52 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.lang.String str54 = locale52.getDisplayCountry(locale53);
        java.lang.String str55 = locale52.toLanguageTag();
        java.util.Locale locale56 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale57 = java.util.Locale.getDefault();
        java.lang.String str58 = locale56.getDisplayCountry(locale57);
        java.util.Locale locale59 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale60 = java.util.Locale.getDefault();
        java.lang.String str61 = locale59.getDisplayCountry(locale60);
        java.util.Locale locale65 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale66 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale67 = java.util.Locale.getDefault();
        java.lang.String str68 = locale66.getDisplayCountry(locale67);
        java.util.Locale locale70 = new java.util.Locale("");
        java.lang.String str71 = locale70.getDisplayVariant();
        java.util.Locale locale72 = java.util.Locale.KOREAN;
        java.util.Locale locale74 = new java.util.Locale("");
        java.util.Locale locale75 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray76 = new java.util.Locale[] { locale47, locale49, locale50, locale51, locale52, locale57, locale59, locale65, locale67, locale70, locale72, locale74, locale75 };
        java.util.ArrayList<java.util.Locale> localeList77 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList77, localeArray76);
        java.util.List<java.util.Locale> localeList79 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.util.Locale>) localeList77);
        java.util.List<java.util.Locale> localeList80 = java.util.Locale.filter(languageRangeList40, (java.util.Collection<java.util.Locale>) localeList77);
        java.util.List<java.util.Locale> localeList81 = java.util.Locale.filter(languageRangeList26, (java.util.Collection<java.util.Locale>) localeList80);
        java.util.Locale.LanguageRange[] languageRangeArray82 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList83 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList83, languageRangeArray82);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap85 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList86 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList83, strMap85);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator87 = languageRangeList83.spliterator();
        languageRangeList83.clear();
        boolean boolean89 = languageRangeList26.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList83);
        java.util.Locale locale93 = new java.util.Locale("hi", "hi!", "cHINA");
        java.lang.String str94 = locale93.getDisplayVariant();
        java.util.Locale locale95 = locale93.stripExtensions();
        int int96 = languageRangeList26.lastIndexOf((java.lang.Object) locale93);
        java.lang.String str97 = locale18.getDisplayCountry(locale93);
        java.lang.String str98 = locale10.getDisplayVariant(locale93);
        java.lang.String str99 = locale2.getDisplayLanguage(locale93);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u82f1\u6587" + "'", str5, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "China" + "'", str12, "China");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh-CN" + "'", str13, "zh-CN");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u570b" + "'", str15, "\u4e2d\u570b");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u4e2d\u6587" + "'", str19, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Taiwan" + "'", str21, "Taiwan");
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(languageRangeList26);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClassList37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(languageRangeList40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "english" + "'", str48, "english");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale53);
// flaky:         org.junit.Assert.assertEquals(locale53.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "China" + "'", str54, "China");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "zh-CN" + "'", str55, "zh-CN");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale57);
// flaky:         org.junit.Assert.assertEquals(locale57.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "China" + "'", str58, "China");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale60);
// flaky:         org.junit.Assert.assertEquals(locale60.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "China" + "'", str61, "China");
        org.junit.Assert.assertEquals(locale65.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale67);
// flaky:         org.junit.Assert.assertEquals(locale67.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "China" + "'", str68, "China");
        org.junit.Assert.assertEquals(locale70.toString(), "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "ko");
        org.junit.Assert.assertEquals(locale74.toString(), "");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(localeList79);
        org.junit.Assert.assertNotNull(localeList80);
        org.junit.Assert.assertNotNull(localeList81);
        org.junit.Assert.assertNotNull(languageRangeArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(languageRangeList86);
        org.junit.Assert.assertNotNull(languageRangeSpliterator87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals(locale93.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "cHINA" + "'", str94, "cHINA");
        org.junit.Assert.assertNotNull(locale95);
        org.junit.Assert.assertEquals(locale95.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "Taiwan" + "'", str97, "Taiwan");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "" + "'", str98, "");
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "" + "'", str99, "");
    }

    @Test
    public void test04759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04759");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04760");
        java.util.Locale locale2 = new java.util.Locale("Ithi!lihi!no", "N");
        org.junit.Assert.assertEquals(locale2.toString(), "ithi!lihi!no_N");
    }

    @Test
    public void test04761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04761");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                   $", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04762");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("java.lang", "zh_TW");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04763");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("zh_TW", 11, "I!HchinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HchinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!Hchizh_TW" + "'", str3, "I!Hchizh_TW");
    }

    @Test
    public void test04764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04764");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "German");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04765");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
    }

    @Test
    public void test04766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04766");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw" + "'", str1, "ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw");
    }

    @Test
    public void test04767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04767");
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
        boolean boolean26 = languageRangeList11.equals((java.lang.Object) "ENG");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray29 = languageRangeList28.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList31 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray32 = languageRangeList31.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator33 = languageRangeList31.spliterator();
        boolean boolean34 = languageRangeList28.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor35 = languageRangeList28.listIterator();
        boolean boolean36 = languageRangeList11.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList39 = languageRangeList28.subList((int) (byte) -1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex = -1");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(languageRangeList31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(languageRangeSpliterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(languageRangeItor35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test04768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04768");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                       Hindi                        ", (int) (short) 10, 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         " + "'", str3, "         ");
    }

    @Test
    public void test04769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04769");
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
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap24 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, strMap24);
        int int26 = languageRangeList22.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean30 = languageRangeList28.remove((java.lang.Object) "English");
        boolean boolean31 = languageRangeList22.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap35 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList36 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, strMap35);
        java.lang.String[] strArray44 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.util.List<java.lang.Class<?>> wildcardClassList47 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList45);
        java.lang.String str48 = java.util.Locale.lookupTag(languageRangeList36, (java.util.Collection<java.lang.String>) strList45);
        java.util.List<java.lang.Class<?>> wildcardClassList49 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList45);
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList45);
        java.util.List<java.lang.Class<?>> wildcardClassList51 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList45);
        java.util.List<java.lang.Class<?>> wildcardClassList52 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList45);
        java.util.Locale.FilteringMode filteringMode53 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList45, filteringMode53);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator55 = languageRangeList15.spliterator();
        boolean boolean57 = languageRangeList15.equals((java.lang.Object) "chi...");
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
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(languageRangeList36);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClassList47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(wildcardClassList49);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(wildcardClassList51);
        org.junit.Assert.assertNotNull(wildcardClassList52);
        org.junit.Assert.assertTrue("'" + filteringMode53 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode53.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(languageRangeSpliterator55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test04770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04770");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("fr_FR", "ususususususususususususususususususus", 17);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04771");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("nglese");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nglese" + "'", str1, "nglese");
    }

    @Test
    public void test04772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04772");
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
        java.lang.String str87 = locale86.getDisplayCountry();
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
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
    }

    @Test
    public void test04773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04773");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u4e2d\u6587\u53f0\u7063)");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '.');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str3, "\u4e2d\u6587\u53f0\u7063)");
    }

    @Test
    public void test04774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04774");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587" + "'", str1, "\u4e2d\u6587");
    }

    @Test
    public void test04775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04775");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("CINA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 8, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CINA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str3, "CINA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test04776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04776");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("loca");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test04777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04777");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw", "FRA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04778");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\u4e2d\u56fdAD.AE.AF", "tsiLyarrAH", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04779");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "zh-TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04780");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("ZHCINESESEaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ZHCINESESEaaaaaa" + "'", str1, "ZHCINESESEaaaaaa");
    }

    @Test
    public void test04781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04781");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("iiiiiiiiiiiiiiiiiiiiiiiArrayList", "CHINA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04782");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ahi!hi", 'u', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ahi!hi" + "'", str3, "ahi!hi");
    }

    @Test
    public void test04783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04783");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "ZHCINESESEaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test04784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04784");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "44444444EnglTWNsTWN44444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04785");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder0.build();
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale2.getDisplayVariant(locale4);
        java.lang.String str6 = locale2.getDisplayVariant();
        java.lang.String str7 = locale2.getVariant();
        java.util.Set<java.lang.String> strSet8 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str9 = locale2.getScript();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test04786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04786");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test04787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04787");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "XXXXXXXXXXFRENCH (FRANCE)XXXXXXXXXX");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04788");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("redliuB.elacoL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "elacoL" + "'", str1, "elacoL");
    }

    @Test
    public void test04789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04789");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish", "z");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04790");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "HindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04791");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder4 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder1.addUnicodeLocaleAttribute(" (HI!,cHINA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  (HI!,cHINA [at index 0]");
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
    public void test04792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04792");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("Chines", "ZHCINESESEaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04793");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "us", "undaaaaaaaHindi (HI!,cHINAHindi (HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04794");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ENGLTWNSTWN", "z");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04795");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder2.setLanguage("HI");
        java.util.Locale locale5 = builder4.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setRegion("redliuB.elacoL");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: redliuB.elacoL [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi");
    }

    @Test
    public void test04796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04796");
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
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap42 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList43 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, strMap42);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor44 = languageRangeList43.listIterator();
        char[][] charArray45 = new char[][] {};
        char[][] charArray46 = languageRangeList43.toArray(charArray45);
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charArray46, "En");
        char[][] charArray49 = languageRangeList13.toArray(charArray46);
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator50 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList13.replaceAll(languageRangeUnaryOperator50);
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
        org.junit.Assert.assertNotNull(languageRangeStream30);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(languageRange36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(languageRangeStream38);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(languageRangeList43);
        org.junit.Assert.assertNotNull(languageRangeItor44);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(charArray49);
    }

    @Test
    public void test04797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04797");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("anglais", "xxxxxxxxxxxxxxxxxxxxxxxxxENGLIILISH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais" + "'", str2, "anglais");
    }

    @Test
    public void test04798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04798");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("Italiano");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test04799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04799");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("zh_CN");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "\u4e2d\u56fdAD.AE.AFxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04800");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                redliuB.elacoL", "                                                                                                   .", "nglese");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04801");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("ese", "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04802");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("ANIHC               EN_ca                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ANIHCEN_ca" + "'", str1, "ANIHCEN_ca");
    }

    @Test
    public void test04803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04803");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange19 = languageRangeList13.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 3");
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
    }

    @Test
    public void test04804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04804");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...ggggggggItaliano...ggggggggg", "German");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test04805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04805");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("lang                                                      ", "\u4e2d\u570b");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04806");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\u4e2d\u6587\u53f0\u7063)", 747);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04807");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("GNAL.AVAJ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAJ" + "'", str1, "AVAJ");
    }

    @Test
    public void test04808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04808");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("en_CA", "AHI!HI!", 747);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04809");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0, "ArrayList");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "Chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04810");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (IA,zh,CN)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04811");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "rance)Itali");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("fran\347ais", 93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04813");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = builder0.build();
        java.util.Locale locale4 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setLanguage("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (IA,zh,CN)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (IA,zh,CN) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test04814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04814");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray5);
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
        java.lang.Class[] classArray20 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray20);
        java.lang.Class<?> wildcardClass23 = null;
        java.lang.Class[] classArray25 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        wildcardClassArray26[0] = wildcardClass23;
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray22, wildcardClassArray26, false);
        java.lang.Class[] classArray32 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray32);
        boolean boolean35 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray22, (java.lang.Class<?>[]) classArray32);
        boolean boolean36 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, (java.lang.Class<?>[]) classArray32);
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, (java.lang.Class<?>[]) classArray32);
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray5, '#');
        java.lang.Class[] classArray41 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray42 = (java.lang.Class<?>[]) classArray41;
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray41);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray41);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray41);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray41);
        boolean boolean48 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray46, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str52 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray5, '#', 10, 27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test04815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04815");
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
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.lang.String str13 = locale2.getDisplayLanguage(locale12);
        java.util.Locale locale16 = new java.util.Locale("");
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.util.Locale locale18 = java.util.Locale.CANADA;
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.lang.String str20 = locale16.getDisplayScript(locale18);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale16);
        java.lang.String str22 = locale16.getDisplayScript();
        java.lang.String str23 = locale12.getDisplayLanguage(locale16);
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("CN");
        java.lang.String str26 = locale16.getDisplayCountry(locale25);
        java.lang.String str27 = locale16.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "English" + "'", str5, "English");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "english" + "'", str9, "english");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "English" + "'", str19, "English");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a" + "'", str21, "a");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "German" + "'", str23, "German");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "cn");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test04816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04816");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Locale.LanguageRang", "fran\347ais");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04817");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("ANIH", "US", 93, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "US" + "'", str4, "US");
    }

    @Test
    public void test04818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04818");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder4 = builder1.clear();
        java.util.Locale.Builder builder5 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder1.setVariant("...ccccc");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ...ccccc [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test04819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04819");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxxx", "AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04820");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("English");
        java.util.Locale.Builder builder5 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setUnicodeLocaleKeyword("\u65e5\u6587", "                                                                                              German");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:        hi!_LOCALE#LANGUAGERANGE_?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test04821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04821");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "CINA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04822");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\u4e2d\u6587\u4e2d\u570b)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587\u4e2d\u570b)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "\u4e2d\u6587\u4e2d\u570b)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04823");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("JAVA.LANG", "              Locale               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04824");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "undaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04825");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("       HI!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04826");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("englTWNsTWN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "englTWNsTWN" + "'", str1, "englTWNsTWN");
    }

    @Test
    public void test04827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04827");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04828");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("fra");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fra" + "'", str1, "fra");
    }

    @Test
    public void test04829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04829");
        java.util.Locale locale1 = java.util.Locale.TAIWAN;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("", locale1);
        java.lang.String str3 = locale1.getISO3Country();
        boolean boolean4 = locale1.hasExtensions();
        boolean boolean5 = locale1.hasExtensions();
        java.lang.String str6 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TWN" + "'", str3, "TWN");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh_TW" + "'", str6, "zh_TW");
    }

    @Test
    public void test04830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04830");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("\u4e2d\u6587\u53f0\u7063)", "                                                                                                   .");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04831");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "ITALIAHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("engliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWA", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "engliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWA" + "'", str2, "engliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWA");
    }

    @Test
    public void test04833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04833");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\u5927\u62ff\u52a0\u6587\u82f1");
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04834");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray1, "zh-CN");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray1, ' ', 100, 0);
        java.lang.String str12 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) 0, "\u82f1\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang" + "'", str12, "java.lang");
    }

    @Test
    public void test04835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04835");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("ENG", "xxxxxxxxxxFrench(France)xxxxxxxxxx", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04836");
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
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap34 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, strMap34);
        int int36 = languageRangeList32.size();
        java.lang.Class[] classArray38 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray39 = (java.lang.Class<?>[]) classArray38;
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray38);
        boolean boolean41 = languageRangeList32.equals((java.lang.Object) wildcardClassArray40);
        boolean boolean42 = languageRangeList32.isEmpty();
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        char[][] charArray47 = new char[][] { charArray43, charArray44, charArray45, charArray46 };
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        char[][] charArray52 = new char[][] { charArray48, charArray49, charArray50, charArray51 };
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        char[][] charArray57 = new char[][] { charArray53, charArray54, charArray55, charArray56 };
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        char[][] charArray62 = new char[][] { charArray58, charArray59, charArray60, charArray61 };
        char[] charArray63 = new char[] {};
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        char[] charArray66 = new char[] {};
        char[][] charArray67 = new char[][] { charArray63, charArray64, charArray65, charArray66 };
        char[] charArray68 = new char[] {};
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        char[] charArray71 = new char[] {};
        char[][] charArray72 = new char[][] { charArray68, charArray69, charArray70, charArray71 };
        char[][][] charArray73 = new char[][][] { charArray47, charArray52, charArray57, charArray62, charArray67, charArray72 };
        char[][][] charArray74 = languageRangeList32.toArray(charArray73);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable[] cloneableArray75 = languageRangeList13.toArray((java.lang.Cloneable[]) charArray73);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "English" + "'", str21, "English");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "a" + "'", str23, "a");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(languageRangeStream30);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(languageRangeList35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(classArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[]");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[]");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[]");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[]");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[]");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[]");
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[]");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[]");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[]");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[]");
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[]");
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[]");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[]");
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[]");
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[]");
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[]");
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[]");
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray65), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray65), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray65), "[]");
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[]");
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray68), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray68), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray68), "[]");
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray69), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray69), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray69), "[]");
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray70), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray70), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray70), "[]");
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[]");
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertNotNull(charArray74);
    }

    @Test
    public void test04837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04837");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("STRING[]", "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04838");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.setLanguage("Engls");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setLanguage("\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: cHINESE?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test04839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04839");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("de", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04840");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "HArrayList");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hArrayList" + "'", str1, "hArrayList");
    }

    @Test
    public void test04841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04841");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hI");
        java.lang.String str2 = locale1.getVariant();
        java.lang.Object obj3 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "hi");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "hi");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "hi");
    }

    @Test
    public void test04842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04842");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (IA,zh,CN)", "inglenglese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (IA,zh,CN)" + "'", str2, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (IA,zh,CN)");
    }

    @Test
    public void test04843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04843");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("Chinese (China)");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04844");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("                  HI                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=                  hi                   ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04845");
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
        java.lang.Class[] classArray14 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray14);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray14);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray14);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray18, ' ');
        java.lang.Class[] classArray23 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray23);
        java.lang.Class<?> wildcardClass26 = null;
        java.lang.Class[] classArray28 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        wildcardClassArray29[0] = wildcardClass26;
        boolean boolean33 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray25, wildcardClassArray29, false);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray25);
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray34);
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray34);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray36);
        boolean boolean38 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray36);
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray12, wildcardClassArray36);
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
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test04846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04846");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concatWith("tw", objArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04847");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("isangl", 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04848");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("anih", "ususususususususususususususususususus");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anih" + "'", str2, "anih");
    }

    @Test
    public void test04849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04849");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "zh-cnenglh");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: zh-cnenglh");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04850");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh_tw" + "'", str1, "zh_tw");
    }

    @Test
    public void test04851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04851");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str2, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test04852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04852");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("zh_CN", "it");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04853");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIEN", '$');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04854");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##############################################################################################################################################################################################################################################################################################################################################################", "zhcines############################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04855");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English");
        java.lang.String str2 = languageRange1.getRange();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale4);
        java.util.Locale.setDefault(locale4);
        java.lang.String str7 = locale4.getCountry();
        boolean boolean8 = languageRange1.equals((java.lang.Object) str7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "english" + "'", str2, "english");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "english" + "'", str5, "english");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FR" + "'", str7, "FR");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04856");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("WZ.MZ.AZ.TY.EY.SW.FW.UV.NV.IV.GV.EV.CV.AV.ZU.YU.SU.MU.GU.AU.ZT.WT.VT.TT.RT.OT.NT.MT.LT.KT.JT.HT.GT.FT.DT.CT.ZS.YS.XS.VS.TS.SS.RS.OS.NS.MS.LS.KS.JS.IS.HS.GS.ES.DS.CS.BS.AS.WR.UR.SR.OR.ER.AQ.YP.WP.TP.SP.RP.NP.MP.LP.KP.HP.GP.FP.EP.AP.MO.ZN.UN.RN.PN.ON.LN.IN.GN.FN.EN.CN.AN.ZM.YM.XM.WM.VM.UM.TM.SM.RM.QM.PM.OM.NM.MM.LM.KM.HM.GM.FM.EM.DM.CM.AM.YL.VL.UL.TL.SL.RL.KL.IL.CL.BL.AL.ZK.YK.WK.RK.PK.NK.MK.IK.HK.GK.EK.PJ.OJ.MJ.EJ.TI.SI.RI.QI.OI.NI.MI.LI.EI.DI.UH.TH.RH.NH.MH.KH.YG.WG.UG.TG.SG.RG.QG.PG.NG.MG.LG.IG.HG.GG.FG.EG.DG.BG.AG.RF.OF.MF.KF.JF.IF.TE.SE.RE.HE.GE.EE.CE.ZD.OD.MD.KD.JD.ED.ZC.YC.XC.WC.VC.UC.RC.OC.NC.MC.LC.KC.IC.HC.GC.FC.DC.CC.AC.ZB.YB.WB.VB.TB.SB.RB.QB.OB.NB.MB.LB.JB.IB.HB.GB.FB.EB.DB.BB.AB.ZA.XA.WA.UA.TA.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanhcGA.FA.EA.DA", "ChinChinChinChinChiChinChinChinChinC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "WZ.MZ.AZ.TY.EY.SW.FW.UV.NV.IV.GV.EV.CV.AV.ZU.YU.SU.MU.GU.AU.ZT.WT.VT.TT.RT.OT.NT.MT.LT.KT.JT.HT.GT.FT.DT.CT.ZS.YS.XS.VS.TS.SS.RS.OS.NS.MS.LS.KS.JS.IS.HS.GS.ES.DS.CS.BS.AS.WR.UR.SR.OR.ER.AQ.YP.WP.TP.SP.RP.NP.MP.LP.KP.HP.GP.FP.EP.AP.MO.ZN.UN.RN.PN.ON.LN.IN.GN.FN.EN.CN.AN.ZM.YM.XM.WM.VM.UM.TM.SM.RM.QM.PM.OM.NM.MM.LM.KM.HM.GM.FM.EM.DM.CM.AM.YL.VL.UL.TL.SL.RL.KL.IL.CL.BL.AL.ZK.YK.WK.RK.PK.NK.MK.IK.HK.GK.EK.PJ.OJ.MJ.EJ.TI.SI.RI.QI.OI.NI.MI.LI.EI.DI.UH.TH.RH.NH.MH.KH.YG.WG.UG.TG.SG.RG.QG.PG.NG.MG.LG.IG.HG.GG.FG.EG.DG.BG.AG.RF.OF.MF.KF.JF.IF.TE.SE.RE.HE.GE.EE.CE.ZD.OD.MD.KD.JD.ED.ZC.YC.XC.WC.VC.UC.RC.OC.NC.MC.LC.KC.IC.HC.GC.FC.DC.CC.AC.ZB.YB.WB.VB.TB.SB.RB.QB.OB.NB.MB.LB.JB.IB.HB.GB.FB.EB.DB.BB.AB.ZA.XA.WA.UA.TA.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanhcGA.FA.EA.DA" + "'", str2, "WZ.MZ.AZ.TY.EY.SW.FW.UV.NV.IV.GV.EV.CV.AV.ZU.YU.SU.MU.GU.AU.ZT.WT.VT.TT.RT.OT.NT.MT.LT.KT.JT.HT.GT.FT.DT.CT.ZS.YS.XS.VS.TS.SS.RS.OS.NS.MS.LS.KS.JS.IS.HS.GS.ES.DS.CS.BS.AS.WR.UR.SR.OR.ER.AQ.YP.WP.TP.SP.RP.NP.MP.LP.KP.HP.GP.FP.EP.AP.MO.ZN.UN.RN.PN.ON.LN.IN.GN.FN.EN.CN.AN.ZM.YM.XM.WM.VM.UM.TM.SM.RM.QM.PM.OM.NM.MM.LM.KM.HM.GM.FM.EM.DM.CM.AM.YL.VL.UL.TL.SL.RL.KL.IL.CL.BL.AL.ZK.YK.WK.RK.PK.NK.MK.IK.HK.GK.EK.PJ.OJ.MJ.EJ.TI.SI.RI.QI.OI.NI.MI.LI.EI.DI.UH.TH.RH.NH.MH.KH.YG.WG.UG.TG.SG.RG.QG.PG.NG.MG.LG.IG.HG.GG.FG.EG.DG.BG.AG.RF.OF.MF.KF.JF.IF.TE.SE.RE.HE.GE.EE.CE.ZD.OD.MD.KD.JD.ED.ZC.YC.XC.WC.VC.UC.RC.OC.NC.MC.LC.KC.IC.HC.GC.FC.DC.CC.AC.ZB.YB.WB.VB.TB.SB.RB.QB.OB.NB.MB.LB.JB.IB.HB.GB.FB.EB.DB.BB.AB.ZA.XA.WA.UA.TA.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanhcGA.FA.EA.DA");
    }

    @Test
    public void test04857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04857");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("\u5927\u62ff\u52a0\u6587\u82f1");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: )???(??");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04858");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                   .", (java.lang.CharSequence) "fr-FR");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test04859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04859");
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
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.lang.String str13 = locale2.getDisplayLanguage(locale12);
        java.util.Locale locale16 = new java.util.Locale("");
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.util.Locale locale18 = java.util.Locale.CANADA;
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.lang.String str20 = locale16.getDisplayScript(locale18);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale16);
        java.lang.String str22 = locale16.getDisplayScript();
        java.lang.String str23 = locale12.getDisplayLanguage(locale16);
        java.util.Set<java.lang.String> strSet24 = locale12.getUnicodeLocaleAttributes();
        java.lang.String str25 = locale12.getCountry();
        java.util.Locale.Category category26 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale27 = java.util.Locale.ITALIAN;
        java.util.Locale locale29 = new java.util.Locale("");
        java.lang.String str30 = locale29.getDisplayLanguage();
        java.util.Locale locale31 = java.util.Locale.CANADA;
        java.lang.String str32 = locale31.getDisplayLanguage();
        java.lang.String str33 = locale29.getDisplayScript(locale31);
        java.util.Locale locale35 = java.util.Locale.FRANCE;
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale35);
        java.lang.String str37 = locale29.getDisplayCountry(locale35);
        java.lang.String str38 = locale27.getDisplayScript(locale29);
        java.util.Locale locale39 = java.util.Locale.GERMAN;
        java.lang.String str40 = locale29.getDisplayLanguage(locale39);
        java.util.Locale locale43 = new java.util.Locale("");
        java.lang.String str44 = locale43.getDisplayLanguage();
        java.util.Locale locale45 = java.util.Locale.CANADA;
        java.lang.String str46 = locale45.getDisplayLanguage();
        java.lang.String str47 = locale43.getDisplayScript(locale45);
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale43);
        java.lang.String str49 = locale43.getDisplayScript();
        java.lang.String str50 = locale39.getDisplayLanguage(locale43);
        java.util.Set<java.lang.String> strSet51 = locale39.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category26, locale39);
        java.lang.String str53 = locale39.getLanguage();
        java.lang.String str54 = locale12.getDisplayVariant(locale39);
        java.util.Locale locale58 = new java.util.Locale("hi", "hi!", "cHINA");
        java.lang.String str59 = locale58.getDisplayVariant();
        java.util.Set<java.lang.String> strSet60 = locale58.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet61 = locale58.getUnicodeLocaleKeys();
        java.lang.String str62 = locale39.getDisplayCountry(locale58);
        java.lang.String str63 = locale58.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "anglais" + "'", str5, "anglais");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "english" + "'", str9, "english");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "anglais" + "'", str19, "anglais");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a" + "'", str21, "a");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "German" + "'", str23, "German");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + category26 + "' != '" + java.util.Locale.Category.FORMAT + "'", category26.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "it");
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "anglais" + "'", str32, "anglais");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "english" + "'", str36, "english");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "de");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "anglais" + "'", str46, "anglais");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "a" + "'", str48, "a");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "German" + "'", str50, "German");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "de" + "'", str53, "de");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals(locale58.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "cHINA" + "'", str59, "cHINA");
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "HI!" + "'", str63, "HI!");
    }

    @Test
    public void test04860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04860");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\u4e2d\u56fdAD.AE.AFxxxxxxxxxxxxxxxxxxxxxxxxx", 350, '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fdAD.AE.AFxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str3, "\u4e2d\u56fdAD.AE.AFxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test04861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04861");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(".", "                                                                                                   $");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04862");
        char[] charArray8 = new char[] { '#', '#', ' ' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("China", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "LOCLE.LNGUGERNGE", charArray8);
        java.lang.String str15 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "LOCLE.LNGUGERNGE", "                                redliuB.elacoL");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang" + "'", str15, "java.lang");
    }

    @Test
    public void test04863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04863");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("...X.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN..", "       hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04864");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Italian", 9, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##Italian" + "'", str3, "##Italian");
    }

    @Test
    public void test04865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04865");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("Locale.Builder", (int) '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Locale.Builder" + "'", str2, "Locale.Builder");
    }

    @Test
    public void test04866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04866");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("jpn", "laEg                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jpn" + "'", str2, "jpn");
    }

    @Test
    public void test04867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04867");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\u82f1\u6587\u52a0\u62ff\u5927)", "\u4e2d\u6587 (ZH)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04868");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindi", "\u4e2d\u570b");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04869");
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
        java.lang.String[] strArray46 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        java.util.List<java.lang.Class<?>> wildcardClassList49 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList47);
        java.util.Locale.FilteringMode filteringMode50 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList47, filteringMode50);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator52 = languageRangeList3.spliterator();
        boolean boolean53 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3);
        java.lang.String[] strArray56 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish", "chinChinChinChinChiChinChinChinChinC");
        int int57 = languageRangeList3.lastIndexOf((java.lang.Object) "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish");
        java.lang.Object[] objArray58 = languageRangeList3.toArray();
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
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClassList49);
        org.junit.Assert.assertTrue("'" + filteringMode50 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode50.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(languageRangeSpliterator52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
    }

    @Test
    public void test04870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04870");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("englishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglish");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "englishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglish" + "'", str1, "englishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglish");
    }

    @Test
    public void test04871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04871");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName(obj0, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str2, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
    }

    @Test
    public void test04872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04872");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$xxxxxxxxinglese (Canada)xxxxxxxx$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "englhi!string[]string[]sshi!string[]string[]s");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04873");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...xxxxx", "I!Hchizh_TW", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04874");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04875");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                              German");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04876");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("ANIHC   ENGLTWNSTWN", "                                    ", "ANIHCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", (int) '.');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ANIHC   ENGLTWNSTWN" + "'", str4, "ANIHC   ENGLTWNSTWN");
    }

    @Test
    public void test04877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04877");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\u65e5\u6587", '$', 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u65e5\u6587" + "'", str3, "\u65e5\u6587");
    }

    @Test
    public void test04878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04878");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("zH", "acol");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04879");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "44444444EnglTWNsTWN44444444");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test04880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04880");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ANIHC   ENGLTWNSTWN", "ChinChinChinChinChinChinChinChinChinaaaaaaaaa$");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04881");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587          ", "und", 20);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test04882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04882");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) builder3, "CHNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.util.Locale.Builder builder8 = builder3.setLanguageTag("CN");
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("CHN");
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.util.Locale locale13 = new java.util.Locale("");
        java.lang.String str14 = locale13.getDisplayLanguage();
        java.util.Locale locale15 = java.util.Locale.CANADA;
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.lang.String str17 = locale13.getDisplayScript(locale15);
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale19);
        java.lang.String str21 = locale13.getDisplayCountry(locale19);
        java.lang.String str22 = locale11.getDisplayScript(locale13);
        java.lang.String str23 = locale13.getDisplayCountry();
        java.lang.String str24 = locale13.getDisplayLanguage();
        java.util.Locale locale25 = java.util.Locale.PRC;
        java.lang.String str26 = locale13.getDisplayScript(locale25);
        java.util.Locale.Builder builder27 = builder8.setLocale(locale25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder30 = builder8.setExtension('a', "French (France)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: French (France) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Locale.Builder" + "'", str6, "Locale.Builder");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "anglais" + "'", str16, "anglais");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "english" + "'", str20, "english");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test04883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04883");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("..ITALIAHi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..ITALIAHi" + "'", str1, "..ITALIAHi");
    }

    @Test
    public void test04884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04884");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("German", "CN", 27);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "German" + "'", str3, "German");
    }

    @Test
    public void test04885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04885");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "WZ.MZ.AZ.TY.EY.SW.FW.UV.NV.IV.GV.EV.CV.AV.ZU.YU.SU.MU.GU.AU.ZT.WT.VT.TT.RT.OT.NT.MT.LT.KT.JT.HT.GT.FT.DT.CT.ZS.YS.XS.VS.TS.SS.RS.OS.NS.MS.LS.KS.JS.IS.HS.GS.ES.DS.CS.BS.AS.WR.UR.SR.OR.ER.AQ.YP.WP.TP.SP.RP.NP.MP.LP.KP.HP.GP.FP.EP.AP.MO.ZN.UN.RN.PN.ON.LN.IN.GN.FN.EN.CN.AN.ZM.YM.XM.WM.VM.UM.TM.SM.RM.QM.PM.OM.NM.MM.LM.KM.HM.GM.FM.EM.DM.CM.AM.YL.VL.UL.TL.SL.RL.KL.IL.CL.BL.AL.ZK.YK.WK.RK.PK.NK.MK.IK.HK.GK.EK.PJ.OJ.MJ.EJ.TI.SI.RI.QI.OI.NI.MI.LI.EI.DI.UH.TH.RH.NH.MH.KH.YG.WG.UG.TG.SG.RG.QG.PG.NG.MG.LG.IG.HG.GG.FG.EG.DG.BG.AG.RF.OF.MF.KF.JF.IF.TE.SE.RE.HE.GE.EE.CE.ZD.OD.MD.KD.JD.ED.ZC.YC.XC.WC.VC.UC.RC.OC.NC.MC.LC.KC.IC.HC.GC.FC.DC.CC.AC.ZB.YB.WB.VB.TB.SB.RB.QB.OB.NB.MB.LB.JB.IB.HB.GB.FB.EB.DB.BB.AB.ZA.XA.WA.UA.TA.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanhcGA.FA.EA.DA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "WZ.MZ.AZ.TY.EY.SW.FW.UV.NV.IV.GV.EV.CV.AV.ZU.YU.SU.MU.GU.AU.ZT.WT.VT.TT.RT.OT.NT.MT.LT.KT.JT.HT.GT.FT.DT.CT.ZS.YS.XS.VS.TS.SS.RS.OS.NS.MS.LS.KS.JS.IS.HS.GS.ES.DS.CS.BS.AS.WR.UR.SR.OR.ER.AQ.YP.WP.TP.SP.RP.NP.MP.LP.KP.HP.GP.FP.EP.AP.MO.ZN.UN.RN.PN.ON.LN.IN.GN.FN.EN.CN.AN.ZM.YM.XM.WM.VM.UM.TM.SM.RM.QM.PM.OM.NM.MM.LM.KM.HM.GM.FM.EM.DM.CM.AM.YL.VL.UL.TL.SL.RL.KL.IL.CL.BL.AL.ZK.YK.WK.RK.PK.NK.MK.IK.HK.GK.EK.PJ.OJ.MJ.EJ.TI.SI.RI.QI.OI.NI.MI.LI.EI.DI.UH.TH.RH.NH.MH.KH.YG.WG.UG.TG.SG.RG.QG.PG.NG.MG.LG.IG.HG.GG.FG.EG.DG.BG.AG.RF.OF.MF.KF.JF.IF.TE.SE.RE.HE.GE.EE.CE.ZD.OD.MD.KD.JD.ED.ZC.YC.XC.WC.VC.UC.RC.OC.NC.MC.LC.KC.IC.HC.GC.FC.DC.CC.AC.ZB.YB.WB.VB.TB.SB.RB.QB.OB.NB.MB.LB.JB.IB.HB.GB.FB.EB.DB.BB.AB.ZA.XA.WA.UA.TA.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanhcGA.FA.EA.DA" + "'", str1, "WZ.MZ.AZ.TY.EY.SW.FW.UV.NV.IV.GV.EV.CV.AV.ZU.YU.SU.MU.GU.AU.ZT.WT.VT.TT.RT.OT.NT.MT.LT.KT.JT.HT.GT.FT.DT.CT.ZS.YS.XS.VS.TS.SS.RS.OS.NS.MS.LS.KS.JS.IS.HS.GS.ES.DS.CS.BS.AS.WR.UR.SR.OR.ER.AQ.YP.WP.TP.SP.RP.NP.MP.LP.KP.HP.GP.FP.EP.AP.MO.ZN.UN.RN.PN.ON.LN.IN.GN.FN.EN.CN.AN.ZM.YM.XM.WM.VM.UM.TM.SM.RM.QM.PM.OM.NM.MM.LM.KM.HM.GM.FM.EM.DM.CM.AM.YL.VL.UL.TL.SL.RL.KL.IL.CL.BL.AL.ZK.YK.WK.RK.PK.NK.MK.IK.HK.GK.EK.PJ.OJ.MJ.EJ.TI.SI.RI.QI.OI.NI.MI.LI.EI.DI.UH.TH.RH.NH.MH.KH.YG.WG.UG.TG.SG.RG.QG.PG.NG.MG.LG.IG.HG.GG.FG.EG.DG.BG.AG.RF.OF.MF.KF.JF.IF.TE.SE.RE.HE.GE.EE.CE.ZD.OD.MD.KD.JD.ED.ZC.YC.XC.WC.VC.UC.RC.OC.NC.MC.LC.KC.IC.HC.GC.FC.DC.CC.AC.ZB.YB.WB.VB.TB.SB.RB.QB.OB.NB.MB.LB.JB.IB.HB.GB.FB.EB.DB.BB.AB.ZA.XA.WA.UA.TA.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanhcGA.FA.EA.DA");
    }

    @Test
    public void test04886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04886");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("GNAL.AVAJSTRING[]STRING[]STRING[]", "china");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04887");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("locale.builde", "Italien");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04888");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder23 = builder19.setExtension('$', "af");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: $ [at index 0]");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "anglais" + "'", str11, "anglais");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chine" + "'", str16, "Chine");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
    }

    @Test
    public void test04889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04889");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.lang.String str5 = locale1.getDisplayScript(locale3);
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
        java.lang.String str18 = locale8.getDisplayCountry();
        java.lang.String str19 = locale8.getDisplayLanguage();
        java.util.Locale locale20 = java.util.Locale.PRC;
        java.lang.String str21 = locale8.getDisplayScript(locale20);
        java.lang.String str22 = locale3.getDisplayCountry(locale8);
        boolean boolean24 = locale3.equals((java.lang.Object) "CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anglais" + "'", str4, "anglais");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "anglais" + "'", str11, "anglais");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "english" + "'", str15, "english");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Canada" + "'", str22, "Canada");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test04890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04890");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("rance)Itali", (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=32.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04891");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.lang.String str5 = locale1.getDisplayScript(locale3);
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale7);
        java.lang.String str9 = locale1.getDisplayCountry(locale7);
        java.lang.String str10 = locale7.toLanguageTag();
        java.lang.String str11 = locale7.getISO3Language();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anglais" + "'", str4, "anglais");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "english" + "'", str8, "english");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fr-FR" + "'", str10, "fr-FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fra" + "'", str11, "fra");
    }

    @Test
    public void test04892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("xxxxxxxxxxFrench (France)xxxxxxxxxx", "xxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxxxxxxxxxFrench (France)xxxxxxxxxx" + "'", str2, "xxxxxxxxxxFrench (France)xxxxxxxxxx");
    }

    @Test
    public void test04893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04893");
        java.util.Locale locale3 = new java.util.Locale("zho", "US");
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.lang.String str6 = locale4.getVariant();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.upperCase("AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", locale4);
        java.lang.String str8 = locale4.getCountry();
        java.util.Locale locale9 = locale4.stripExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW" + "'", str7, "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CA" + "'", str8, "CA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
    }

    @Test
    public void test04894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04894");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ANIHC", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ANIHC" + "'", str2, "ANIHC");
    }

    @Test
    public void test04895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04895");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "chinois");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04896");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish" + "'", str1, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish");
    }

    @Test
    public void test04897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04897");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strMap4);
        int int6 = languageRangeList2.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor7 = languageRangeList2.listIterator();
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("English");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange11, "");
        java.util.Locale.LanguageRange languageRange15 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] { languageRange9, languageRange11, languageRange15 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        boolean boolean19 = languageRangeList2.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor20 = languageRangeList17.listIterator();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.parse("Cina", strMap22);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap24 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList23, strMap24);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean29 = languageRangeList27.remove((java.lang.Object) "English");
        boolean boolean31 = languageRangeList27.remove((java.lang.Object) 1);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Locale locale36 = java.util.Locale.FRANCE;
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale36);
        java.util.Locale locale38 = java.util.Locale.US;
        java.util.Locale locale39 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale40 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale41 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.lang.String str43 = locale41.getDisplayCountry(locale42);
        java.lang.String str44 = locale41.toLanguageTag();
        java.util.Locale locale45 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale46 = java.util.Locale.getDefault();
        java.lang.String str47 = locale45.getDisplayCountry(locale46);
        java.util.Locale locale48 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale49 = java.util.Locale.getDefault();
        java.lang.String str50 = locale48.getDisplayCountry(locale49);
        java.util.Locale locale54 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale55 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale56 = java.util.Locale.getDefault();
        java.lang.String str57 = locale55.getDisplayCountry(locale56);
        java.util.Locale locale59 = new java.util.Locale("");
        java.lang.String str60 = locale59.getDisplayVariant();
        java.util.Locale locale61 = java.util.Locale.KOREAN;
        java.util.Locale locale63 = new java.util.Locale("");
        java.util.Locale locale64 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray65 = new java.util.Locale[] { locale36, locale38, locale39, locale40, locale41, locale46, locale48, locale54, locale56, locale59, locale61, locale63, locale64 };
        java.util.ArrayList<java.util.Locale> localeList66 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList66, localeArray65);
        java.util.List<java.util.Locale> localeList68 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.Locale locale69 = java.util.Locale.lookup(languageRangeList27, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.List<java.util.Locale> localeList70 = java.util.Locale.filter(languageRangeList25, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.List<java.util.Locale> localeList71 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList70);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList72 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Locale.LanguageRange" + "'", str13, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(languageRangeItor20);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "english" + "'", str37, "english");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Chine" + "'", str43, "Chine");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "zh-CN" + "'", str44, "zh-CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Chine" + "'", str47, "Chine");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Chine" + "'", str50, "Chine");
        org.junit.Assert.assertEquals(locale54.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Chine" + "'", str57, "Chine");
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "ko");
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(localeList68);
        org.junit.Assert.assertNull(locale69);
        org.junit.Assert.assertNotNull(localeList70);
        org.junit.Assert.assertNotNull(localeList71);
    }

    @Test
    public void test04898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04898");
        java.lang.String[] strArray0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test04899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04899");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                                    ", (java.lang.CharSequence) "\u4e2d\u56fdAD.AE.AFxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                       ese(Taiwan", "                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                       ese(Taiwan" + "'", str2, "                                                                                       ese(Taiwan");
    }

    @Test
    public void test04901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04901");
        java.util.Locale locale3 = new java.util.Locale("Cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engli", "us");
        java.util.Locale locale4 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.lang.String str6 = locale4.getDisplayCountry(locale5);
        java.lang.String str7 = locale4.toLanguageTag();
        java.lang.String str8 = locale4.getCountry();
        java.lang.String str9 = locale4.getISO3Country();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayVariant();
        java.lang.String str13 = locale4.getDisplayLanguage(locale11);
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        java.lang.String str16 = locale14.getDisplayCountry(locale15);
        java.lang.String str17 = locale14.toLanguageTag();
        java.lang.String str18 = locale14.getLanguage();
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.util.Locale locale21 = new java.util.Locale("");
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.util.Locale locale23 = java.util.Locale.CANADA;
        java.lang.String str24 = locale23.getDisplayLanguage();
        java.lang.String str25 = locale21.getDisplayScript(locale23);
        java.util.Locale locale27 = java.util.Locale.FRANCE;
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale27);
        java.lang.String str29 = locale21.getDisplayCountry(locale27);
        java.lang.String str30 = locale19.getDisplayScript(locale21);
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.lang.String str32 = locale21.getDisplayLanguage(locale31);
        java.lang.String str33 = locale14.getDisplayCountry(locale21);
        java.lang.String str34 = locale21.getCountry();
        java.util.Locale locale38 = new java.util.Locale("....english", "zhcinesese", ".");
        java.lang.String str39 = locale21.getDisplayName(locale38);
        java.lang.String str40 = locale11.getDisplayName(locale38);
        java.lang.String str41 = locale3.getDisplayVariant(locale38);
        java.util.Locale locale45 = new java.util.Locale("undaaaaaaa", "\u4e2d\u6587\u4e2d\u570b)", "");
        java.lang.String str46 = locale38.getDisplayCountry(locale45);
        java.lang.String str47 = locale38.getLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI_us");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chine" + "'", str6, "Chine");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-CN" + "'", str7, "zh-CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CN" + "'", str8, "CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CHN" + "'", str9, "CHN");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinese" + "'", str13, "Chinese");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chine" + "'", str16, "Chine");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh-CN" + "'", str17, "zh-CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh" + "'", str18, "zh");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "anglais" + "'", str24, "anglais");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "english" + "'", str28, "english");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "China" + "'", str33, "China");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals(locale38.toString(), "....english_ZHCINESESE_.");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "us" + "'", str41, "us");
// flaky:         org.junit.Assert.assertEquals(locale45.toString(), "\u4e2d\u6587\u4e2d\u570b)");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ZHCINESESE" + "'", str46, "ZHCINESESE");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "....english" + "'", str47, "....english");
    }

    @Test
    public void test04902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04902");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("ChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "ChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04903");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("xxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxx" + "'", str1, "xxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxx");
    }

    @Test
    public void test04904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04904");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "CINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" + "'", str1, "CINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    @Test
    public void test04905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04905");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("FR", "..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04906");
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
        java.lang.String str14 = locale1.getVariant();
        java.util.Locale locale16 = new java.util.Locale("");
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.util.Locale locale18 = java.util.Locale.CANADA;
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.lang.String str20 = locale16.getDisplayScript(locale18);
        java.lang.String str21 = locale18.getDisplayVariant();
        java.util.Locale locale22 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale23 = java.util.Locale.getDefault();
        java.lang.String str24 = locale22.getDisplayCountry(locale23);
        java.lang.String str25 = locale23.getDisplayVariant();
        java.lang.String str26 = locale18.getDisplayScript(locale23);
        java.lang.String str27 = locale18.getDisplayVariant();
        java.lang.String str28 = locale1.getDisplayName(locale18);
        java.lang.String str29 = locale18.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "anglais" + "'", str6, "anglais");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "english" + "'", str10, "english");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CHINA" + "'", str13, "CHINA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "anglais" + "'", str19, "anglais");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Chine" + "'", str24, "Chine");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Italian" + "'", str28, "Italian");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "anglais (Canada)" + "'", str29, "anglais (Canada)");
    }

    @Test
    public void test04907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04907");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("china_CN", "\u56fd\u4e2d\u6587\u4e2d   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04908");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "xxxhi!xxxx");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04909");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "China");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04910");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.setRegion("zh");
        java.util.Locale locale6 = builder1.build();
        java.lang.String str7 = locale6.getScript();
        java.lang.String str8 = locale6.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale6.getUnicodeLocaleType("ANIHCEN_ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ANIHCEN_ca");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test04911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04911");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("chinchinchinchinchinchinchinchinchinaaaaaaaaa#", 16, "CNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLIST");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chinchinchinchinchinchinchinchinchinaaaaaaaaa#" + "'", str3, "chinchinchinchinchinchinchinchinchinaaaaaaaaa#");
    }

    @Test
    public void test04912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04912");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale.Builder builder8 = builder3.setExtension('a', "zh_CN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("AD.AE.AF.AGCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: AD.AE.AF.AGCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test04913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04913");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "zh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglish");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04914");
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
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor24 = languageRangeList23.listIterator();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
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
        java.util.List<java.lang.String> strList79 = java.util.Locale.filterTags(languageRangeList23, (java.util.Collection<java.lang.String>) strList27, filteringMode77);
        java.util.Locale.LanguageRange[] languageRangeArray80 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList81 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList81, languageRangeArray80);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap83 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList84 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList81, strMap83);
        int int85 = languageRangeList81.size();
        boolean boolean86 = languageRangeList23.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList81);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap87 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList88 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList23, strMap87);
        boolean boolean89 = languageRangeList16.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList88);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange91 = languageRangeList88.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
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
        org.junit.Assert.assertEquals(locale39.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Chine" + "'", str40, "Chine");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "zh-CN" + "'", str41, "zh-CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Chine" + "'", str44, "Chine");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Chine" + "'", str47, "Chine");
        org.junit.Assert.assertEquals(locale51.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Chine" + "'", str54, "Chine");
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
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertNotNull(languageRangeArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(languageRangeList84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(languageRangeList88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test04915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04915");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\u82f1\u8a9e\u30ab\u30ca\u30c0)", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u8a9e\u30ab\u30ca\u30c0)" + "'", str3, "\u82f1\u8a9e\u30ab\u30ca\u30c0)");
    }

    @Test
    public void test04916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04916");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\u4e2d\u6587", "undaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaa", "char[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u6587" + "'", str3, "\u4e2d\u6587");
    }

    @Test
    public void test04917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04917");
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zh_CN", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "i", charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AD.AE.AF.AGchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahI", charArray9);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "char[]", charArray9);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test04918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04918");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("EN", 747);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04919");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("##############################################################################################################################################################################################################################################################################################################################################################", "    z", "FRAN\307AIS");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04920");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayList", "enenenenenenenenenen", "Character", 31);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayList" + "'", str4, "ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayList");
    }

    @Test
    public void test04921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04921");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Collections.EmptySetitaCollections.EmptySetitaCollections.EmptySetitaCollections.EmptySet", "ChinChinChinChinChinChinChinChinChinaaaaaaaaa.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Collections.EmptySetitaCollections.EmptySetitaCollections.EmptySetitaCollections.EmptySet" + "'", str2, "Collections.EmptySetitaCollections.EmptySetitaCollections.EmptySetitaCollections.EmptySet");
    }

    @Test
    public void test04922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04922");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\u6cd5\u56fd");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u6cd5\u56fd" + "'", str1, "\u6cd5\u56fd");
    }

    @Test
    public void test04923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04923");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("cHIChinChinChinChinChinChinChinChinChinaaaaaaaaa#A", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chichinchinchinchinchinchinchinchinchinaaaaaaaaa#a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04924");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean9 = languageRangeList7.remove((java.lang.Object) "English");
        boolean boolean10 = languageRangeList1.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray18);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray19);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray15, strArray19);
        boolean boolean22 = languageRangeList1.equals((java.lang.Object) strArray19);
        java.util.Locale locale23 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.String> strSet24 = locale23.getUnicodeLocaleAttributes();
        java.lang.String str25 = locale23.getISO3Country();
        java.lang.String str26 = locale23.getCountry();
        boolean boolean27 = languageRangeList1.remove((java.lang.Object) str26);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str21, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test04925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04925");
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
        java.lang.String str20 = locale7.getCountry();
        java.util.Locale locale21 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.util.Locale locale23 = java.util.Locale.getDefault();
        java.lang.String str24 = locale21.getDisplayCountry(locale23);
        java.util.Locale locale25 = java.util.Locale.TAIWAN;
        java.lang.String str26 = locale25.getVariant();
        java.lang.String str27 = locale21.getDisplayName(locale25);
        java.lang.String str28 = locale7.getDisplayLanguage(locale21);
        java.lang.String str29 = locale7.getCountry();
        java.lang.String str30 = locale7.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = locale7.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chine" + "'", str2, "Chine");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "anglais" + "'", str10, "anglais");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "chinois" + "'", str22, "chinois");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Taiwan" + "'", str24, "Taiwan");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str27, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test04926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04926");
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
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor24 = languageRangeList23.listIterator();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
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
        java.util.List<java.lang.String> strList79 = java.util.Locale.filterTags(languageRangeList23, (java.util.Collection<java.lang.String>) strList27, filteringMode77);
        java.util.Locale.LanguageRange[] languageRangeArray80 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList81 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList81, languageRangeArray80);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap83 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList84 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList81, strMap83);
        int int85 = languageRangeList81.size();
        boolean boolean86 = languageRangeList23.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList81);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap87 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList88 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList23, strMap87);
        boolean boolean89 = languageRangeList16.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList88);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator90 = languageRangeList88.spliterator();
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
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
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
        org.junit.Assert.assertEquals(locale39.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Chine" + "'", str40, "Chine");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "zh-CN" + "'", str41, "zh-CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Chine" + "'", str44, "Chine");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Chine" + "'", str47, "Chine");
        org.junit.Assert.assertEquals(locale51.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Chine" + "'", str54, "Chine");
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
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertNotNull(languageRangeArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(languageRangeList84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(languageRangeList88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(languageRangeSpliterator90);
    }

    @Test
    public void test04927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04927");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("LOCALE#LANGUAGERANGE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LOCALE#LANGUAGERANGE" + "'", str1, "LOCALE#LANGUAGERANGE");
    }

    @Test
    public void test04928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04928");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder1.setScript("");
        java.util.Locale locale4 = builder1.build();
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) locale4, "JAVA.LANG");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("", locale4);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.util" + "'", str6, "java.util");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test04929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04929");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("\u56fd\u4e2d\u6587\u4e2d   ", ".....");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u56fd\u4e2d\u6587\u4e2d   " + "'", str2, "\u56fd\u4e2d\u6587\u4e2d   ");
    }

    @Test
    public void test04930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04930");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("Ja");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04931");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("\u6cd5\u6587\u6cd5\u570b)", "en", 35);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b)" + "'", str3, "\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b)");
    }

    @Test
    public void test04932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04932");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("AN                 a                 AN", "   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AN                 a                 AN" + "'", str2, "AN                 a                 AN");
    }

    @Test
    public void test04933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04933");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.lang.String str5 = locale1.getDisplayScript(locale3);
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale8 = builder6.build();
        java.lang.String str9 = locale1.getDisplayCountry(locale8);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("hi", "iiiiiiiiiiiiiiiiiiiiiiiArrayList");
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray18);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ANIHC", "");
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                    ", strArray18, strArray22);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.startsWithAny("zh-CNnglese", strArray18);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("inglese (Canada)", strArray13, strArray18);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18, "englCNsCN");
        boolean boolean28 = locale1.equals((java.lang.Object) str27);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anglais" + "'", str4, "anglais");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "                                                                                                    " + "'", str23, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "inglese (Canada)" + "'", str25, "inglese (Canada)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "a" + "'", str27, "a");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test04934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04934");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("e!e(Tiiwin", "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04935");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("ANIHCzhcinesesexxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ANIHCzhcinesesexxxxx" + "'", str1, "ANIHCzhcinesesexxxxx");
    }

    @Test
    public void test04936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04936");
        java.util.Locale locale2 = new java.util.Locale("ahi!hi!", "                 a                 ");
        java.util.Locale locale3 = locale2.stripExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "ahi!hi!_                 A                 ");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ahi!hi!_                 A                 ");
    }

    @Test
    public void test04937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04937");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("An", "an", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04938");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5...", "Itali", 3);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04939");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("lang                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lang" + "'", str1, "lang");
    }

    @Test
    public void test04940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04940");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!STRING[]STRING[]S", "af", 12);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04941");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HI!STRING[]STRING[]S", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!STRING[..." + "'", str2, "HI!STRING[...");
    }

    @Test
    public void test04942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04942");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("en_", "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en_" + "'", str2, "en_");
    }

    @Test
    public void test04943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04943");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("A][gnirts", "            locale.builder                         locale.builder                    CHINOIS (CHINE)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04944");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#" + "'", str1, "a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#");
    }

    @Test
    public void test04945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04945");
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
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean20 = languageRangeList18.remove((java.lang.Object) "English");
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
        java.util.List<java.util.Locale> localeList58 = java.util.Locale.filter(languageRangeList18, (java.util.Collection<java.util.Locale>) localeList55);
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList58);
        java.util.Locale.LanguageRange[] languageRangeArray60 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList61 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61, languageRangeArray60);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap63 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList64 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList61, strMap63);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator65 = languageRangeList61.spliterator();
        languageRangeList61.clear();
        boolean boolean67 = languageRangeList4.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61);
        java.util.Locale.LanguageRange[] languageRangeArray69 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList70 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList70, languageRangeArray69);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap72 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList73 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList70, strMap72);
        int int74 = languageRangeList70.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList76 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean78 = languageRangeList76.remove((java.lang.Object) "English");
        boolean boolean79 = languageRangeList70.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList76);
        java.util.Locale.LanguageRange languageRange81 = new java.util.Locale.LanguageRange("English");
        java.lang.String str82 = languageRange81.getRange();
        boolean boolean83 = languageRangeList76.add(languageRange81);
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList4.add(7, languageRange81);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 7, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClassList15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
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
        org.junit.Assert.assertEquals(locale31.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Chine" + "'", str32, "Chine");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zh-CN" + "'", str33, "zh-CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Chine" + "'", str36, "Chine");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Chine" + "'", str39, "Chine");
        org.junit.Assert.assertEquals(locale43.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Chine" + "'", str46, "Chine");
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
        org.junit.Assert.assertNotNull(localeList58);
        org.junit.Assert.assertNotNull(localeList59);
        org.junit.Assert.assertNotNull(languageRangeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(languageRangeList64);
        org.junit.Assert.assertNotNull(languageRangeSpliterator65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(languageRangeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(languageRangeList73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(languageRangeList76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "english" + "'", str82, "english");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test04946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04946");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder4 = builder1.clearExtensions();
        java.util.Locale.Builder builder6 = builder1.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder1.setRegion("zh-cnenglish");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: zh-cnenglish [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test04947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04947");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("xxxxxxxxxxFrench(France)xxxxxxxxxx", "jpn", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04948");
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
        java.lang.String str17 = locale14.getDisplayScript();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04949");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04950");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("EnglTWNsTWN", "....english", (int) (short) 0);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("hi", "iiiiiiiiiiiiiiiiiiiiiiiArrayList");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("english", strArray10, strArray13);
        java.lang.Comparable<java.lang.String>[] strComparableArray15 = languageRangeList1.toArray((java.lang.Comparable<java.lang.String>[]) strArray13);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("String", "LOCLE.LNGUGERNGE", (int) '$');
        boolean boolean20 = languageRangeList1.equals((java.lang.Object) '$');
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "english" + "'", str14, "english");
        org.junit.Assert.assertNotNull(strComparableArray15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test04951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04951");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hArrayList");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04952");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                           Germn", "aa.ab.ae.af.ak.am.an.ar.as.av.ay.az.ba.be.bg.bh.bi.bm.bn.bo.br.bs.ca.ce.ch.co.cr.cs.cu.cv.cy.da.de.dv.dz.ee.el.en.eo.es.et.eu.fa.ff.fi.fj.fo.fr.fy.ga.gd.gl.gn.gu.gv.ha.he.hi.ho.hr.ht.hu.hy.hz.ia.id.ie.ig.ii.ik.in.io.is.it.iu.iw.ja.ji.jv.ka.kg.ki.kj.kk.kl.km.kn.ko.kr.ks.ku.kv.kw.ky.la.lb.lg.li.ln.lo.lt.lu.lv.mg.mh.mi.mk.ml.mn.mo.mr.ms.mt.my.na.nb.nd.ne.ng.nl.nn.no.nr.nv.ny.oc.oj.om.or.os.pa.pi.pl.ps.pt.qu.rm.rn.ro.ru.rw.sa.sc.sd.se.sg.si.sk.sl.sm.sn.so.sq.sr.ss.st.su.sv.sw.ta.te.tg.th.ti.tk.tl.tn.to.tr.ts.tt.tw.ty.ug.uk.ur.uz.ve.vi.vo.wa.wo.xh.yi.yo.za.zh.zu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                           Germn" + "'", str2, "                                                                                           Germn");
    }

    @Test
    public void test04953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04953");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\u53f0\u7063", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u53f0\u7063                             " + "'", str2, "\u53f0\u7063                             ");
    }

    @Test
    public void test04954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04954");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("EN_CA", "panesexxxxxxxxxxxxxx", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04955");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("isangl", "Chin");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "isangl" + "'", str2, "isangl");
    }

    @Test
    public void test04956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04956");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxx...latiIhailatiIhailatiIhailatiIhailatiIhailatiIhailatiIhailatiIhailatiIhailatiIhailatiIhailati" + "'", str1, "xxxxx...latiIhailatiIhailatiIhailatiIhailatiIhailatiIhailatiIhailatiIhailatiIhailatiIhailatiIhailati");
    }

    @Test
    public void test04957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04957");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGL");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04958");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("RRAYLIS", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniC", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04959");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("STRING", "xxxxxxxxxxFrench(France)xxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04960");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                    ", "ANIHC      xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    " + "'", str2, "                                    ");
    }

    @Test
    public void test04961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04961");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
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
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.upperCase("China", locale7);
        java.lang.String str20 = locale7.getVariant();
        java.util.Locale locale24 = new java.util.Locale("zho", "US");
        java.util.Locale locale25 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str26 = locale24.getDisplayVariant(locale25);
        java.lang.String str27 = locale25.getVariant();
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.upperCase("AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", locale25);
        java.lang.String str29 = locale25.getCountry();
        java.lang.String str30 = locale7.getDisplayLanguage(locale25);
        java.util.Locale.Builder builder31 = builder3.setLocale(locale25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder33 = builder3.setVariant("ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "anglais" + "'", str12, "anglais");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "english" + "'", str16, "english");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CHINA" + "'", str19, "CHINA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale24.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW" + "'", str28, "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "CA" + "'", str29, "CA");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "italien" + "'", str30, "italien");
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test04962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04962");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGL", "TW", "\u4e2d\u56fd");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04963");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engli");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engli" + "'", str1, "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engli");
    }

    @Test
    public void test04964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04964");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("xxxxxxxxxxxxxxxxxxxxxxxxxENGLIILISH", "..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04965");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "can");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test04966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04966");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.lang.String str5 = locale1.getDisplayScript(locale3);
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
        java.lang.String str18 = locale8.getDisplayCountry();
        java.lang.String str19 = locale8.getDisplayLanguage();
        java.util.Locale locale20 = java.util.Locale.PRC;
        java.lang.String str21 = locale8.getDisplayScript(locale20);
        java.lang.String str22 = locale3.getDisplayCountry(locale8);
        java.util.Locale locale25 = new java.util.Locale("CHN", "hi!");
        java.lang.String str26 = locale3.getDisplayCountry(locale25);
        java.lang.String str27 = locale3.toLanguageTag();
        java.util.Locale.setDefault(locale3);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anglais" + "'", str4, "anglais");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "anglais" + "'", str11, "anglais");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "english" + "'", str15, "english");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Canada" + "'", str22, "Canada");
        org.junit.Assert.assertEquals(locale25.toString(), "chn_HI!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Canada" + "'", str26, "Canada");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "en-CA" + "'", str27, "en-CA");
    }

    @Test
    public void test04967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04967");
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.lang.String str6 = locale2.getDisplayScript(locale4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale2);
        java.lang.String str8 = locale2.getDisplayScript();
        java.util.Set<java.lang.String> strSet9 = locale2.getUnicodeLocaleAttributes();
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = locale10.getDisplayCountry(locale11);
        java.lang.String str13 = locale10.toLanguageTag();
        java.lang.String str14 = locale10.getLanguage();
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.util.Locale locale17 = new java.util.Locale("");
        java.lang.String str18 = locale17.getDisplayLanguage();
        java.util.Locale locale19 = java.util.Locale.CANADA;
        java.lang.String str20 = locale19.getDisplayLanguage();
        java.lang.String str21 = locale17.getDisplayScript(locale19);
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale23);
        java.lang.String str25 = locale17.getDisplayCountry(locale23);
        java.lang.String str26 = locale15.getDisplayScript(locale17);
        java.util.Locale locale27 = java.util.Locale.GERMAN;
        java.lang.String str28 = locale17.getDisplayLanguage(locale27);
        java.lang.String str29 = locale10.getDisplayCountry(locale17);
        java.util.Locale locale30 = locale10.stripExtensions();
        java.lang.String str31 = locale2.getDisplayVariant(locale30);
        java.lang.String str32 = locale30.toLanguageTag();
        java.lang.Class<?> wildcardClass33 = locale30.getClass();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "English" + "'", str5, "English");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "China" + "'", str12, "China");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh-CN" + "'", str13, "zh-CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh" + "'", str14, "zh");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "English" + "'", str20, "English");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "english" + "'", str24, "english");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "de");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "China" + "'", str29, "China");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "zh-CN" + "'", str32, "zh-CN");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test04968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04968");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("slgnE", "AD.AE.AF.AGCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04969");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("engliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWA", "ChinChinChinChinChinChinChinChinChinaaaaaaaaa#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04970");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("slgnE", "ANIHCzhcinesesexxxxx");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "slgnE" + "'", str2, "slgnE");
    }

    @Test
    public void test04971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04971");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("CHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "CHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test04972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04972");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("\u65e5\u6587");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u65e5\u6587" + "'", str1, "\u65e5\u6587");
    }

    @Test
    public void test04973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04973");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ITALIAHI", 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04974");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("ShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShort", 747, 46);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04975");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("zhcines############################", 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04976");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "CINA", (java.lang.CharSequence) "                    nglish  Hindi (HI!,cHINA)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void test04977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04977");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "inglese");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04978");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\u4e2d\u6587\u53f0\u7063)", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04979");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("italianojajajajajajajajajajajajajaj");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test04980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04980");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hi!", ".");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04981");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayList");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncarraylist");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04982");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("cnn", "fr_CA", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04983");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\u4e2d\u56fdAD.AE.AFxxxxxxxxxxxxxxxxxxxxxxxxx", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("inglenglese", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test04984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04984");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", 9, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW" + "'", str3, "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW");
    }

    @Test
    public void test04985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04985");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\u5fb7\u6587\u5fb7\u56fd)", "z", "German", 46);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u5fb7\u6587\u5fb7\u56fd)" + "'", str4, "\u5fb7\u6587\u5fb7\u56fd)");
    }

    @Test
    public void test04986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04986");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("             AN       A             ", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             AN       A             " + "'", str2, "             AN       A             ");
    }

    @Test
    public void test04987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04987");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("                                                                            Hindi (HI!,cHINA)");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Hindi(HI!,cHINA)");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04988");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("CHNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "String[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04989");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("acoL", 33, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##############acoL###############" + "'", str3, "##############acoL###############");
    }

    @Test
    public void test04990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04990");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("cinese (Cina)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test04991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04991");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("builder", "rglAsA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04992");
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
        java.lang.String str74 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor72, "Chin");
        boolean boolean75 = languageRangeList7.equals((java.lang.Object) languageRangeItor72);
        boolean boolean77 = languageRangeList7.equals((java.lang.Object) "ArrayList");
        java.util.Locale.LanguageRange languageRange79 = new java.util.Locale.LanguageRange("zh");
        boolean boolean80 = languageRangeList7.add(languageRange79);
        java.lang.String str82 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) boolean80, "\u6cd5\u6cd5\u6587\u6587ST");
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
        org.junit.Assert.assertEquals(locale31.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "China" + "'", str32, "China");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zh-CN" + "'", str33, "zh-CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "China" + "'", str36, "China");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "China" + "'", str39, "China");
        org.junit.Assert.assertEquals(locale43.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "China" + "'", str46, "China");
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
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "java.lang" + "'", str82, "java.lang");
    }

    @Test
    public void test04993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04993");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################################################################################" + "'", str1, "################################################################################");
    }

    @Test
    public void test04994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04994");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "RGLASA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04995");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Cina", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList4, 'a');
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList4.replaceAll(languageRangeUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
    }

    @Test
    public void test04996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04996");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("CINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA" + "'", str2, "CINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA");
    }

    @Test
    public void test04997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04997");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("laEg                                                      ", "YT.ZA.ZM.ZW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04998");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("GNE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ENG" + "'", str1, "ENG");
    }

    @Test
    public void test04999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04999");
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
        java.util.Locale.Builder builder20 = builder19.clearExtensions();
        java.util.Locale.Builder builder21 = builder20.clear();
        java.util.Locale.Builder builder23 = builder20.removeUnicodeLocaleAttribute("inglese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder25 = builder23.removeUnicodeLocaleAttribute("a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#.FilteringMode");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#.FilteringMode [at index 0]");
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
        org.junit.Assert.assertEquals(locale15.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "China" + "'", str16, "China");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test05000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test05000");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 8, "chinois (Chine   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chinois " + "'", str3, "chinois ");
    }
}
