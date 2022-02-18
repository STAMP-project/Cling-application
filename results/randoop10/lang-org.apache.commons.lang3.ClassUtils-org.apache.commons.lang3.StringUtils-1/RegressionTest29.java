import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29 {

    public static boolean debug = false;

    @Test
    public void test14501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14501");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("ese (Taiwanese (Taiwanese (Taiwanese (Taiwan", 44, 48);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test14502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14502");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("          xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchnxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchnxxxxxxxxxxxxxxxxxxxxxxxxxnglais", "French");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test14503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14503");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                          zh_c                                                          ", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn", 44);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test14504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14504");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale.Builder builder8 = builder3.setExtension('a', "zh_CN");
        java.util.Locale locale9 = builder8.build();
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "china_CN_#a-zh-cn");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test14505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14505");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14506");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("nglish  Hindi (HI!,cHINA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nglish  hindi (hi!,china" + "'", str1, "nglish  hindi (hi!,china");
    }

    @Test
    public void test14507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14507");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("AN                 a                 AN  ", (double) 93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=93.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14508");
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
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor76 = languageRangeList1.iterator();
        java.util.Locale.LanguageRange languageRange77 = languageRangeItor76.next();
        boolean boolean78 = languageRangeItor76.hasNext();
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
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cina" + "'", str17, "Cina");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh-CN" + "'", str18, "zh-CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cina" + "'", str21, "Cina");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Cina" + "'", str24, "Cina");
        org.junit.Assert.assertEquals(locale28.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Cina" + "'", str31, "Cina");
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
        org.junit.Assert.assertNotNull(languageRange77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test14509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14509");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\u6587\u5fb7");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test14510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14510");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e" + "'", str1, "\u82f1\u8a9e");
    }

    @Test
    public void test14511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14511");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\u4e2d\u56fd\u8a9e", "YT.ZA.ZM.Z", 4);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test14512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14512");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("englCNsCN");
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale1.getVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test14513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14513");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063)", "d u ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14514");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("xxxxxxx", "t           hindi(HI!,cHINA)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14515");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("ese (Taiwan$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ese(Taiwan........................................................................................." + "'", str1, "ese(Taiwan.........................................................................................");
    }

    @Test
    public void test14516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("ArrsyList", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Arrsy..." + "'", str2, "Arrsy...");
    }

    @Test
    public void test14517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14517");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("Japanese", "cinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecines");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test14518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14518");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "ananananananananananaCINAanananananananananana");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test14519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14519");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("....english", "ssalc");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14520");
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
        java.util.Collection<java.lang.String> strCollection27 = null;
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags(languageRangeList11, strCollection27);
        languageRangeList11.clear();
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList11, 'u');
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
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test14521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14521");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("a#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#a" + "'", str1, "#a");
    }

    @Test
    public void test14522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14522");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#########################English", 97, "\u5fb7\u6587\u5fb7\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587" + "'", str3, "\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587");
    }

    @Test
    public void test14523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14523");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("cNn");
        double double2 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test14524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14524");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("it                                           it          AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa", "CHN", "BUILDER");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it                                           it          AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa" + "'", str3, "it                                           it          AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa");
    }

    @Test
    public void test14525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14525");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("e!e(tiiwine!ehsilgnenc-hze!e(tiiwine!e(");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: e!e(tiiwine!ehsilgnenc-hze!e(tiiwine!e(");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14526");
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
        java.lang.String[] strArray38 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("acol");
        boolean boolean39 = languageRangeList1.contains((java.lang.Object) "acol");
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
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chine" + "'", str11, "Chine");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh-CN" + "'", str12, "zh-CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Chine" + "'", str15, "Chine");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Chine" + "'", str18, "Chine");
        org.junit.Assert.assertEquals(locale22.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Chine" + "'", str25, "Chine");
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
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test14527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14527");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.lang.String str3 = locale0.toLanguageTag();
        java.lang.String str4 = locale0.getCountry();
        java.lang.String str5 = locale0.getISO3Country();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getDisplayVariant();
        java.lang.String str9 = locale0.getDisplayLanguage(locale7);
        java.util.Locale locale10 = locale7.stripExtensions();
        boolean boolean11 = locale10.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = locale10.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chine" + "'", str2, "Chine");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CN" + "'", str4, "CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CHN" + "'", str5, "CHN");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chinese" + "'", str9, "Chinese");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test14528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14528");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444444444444444444444", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444444444444444444444" + "'", str2, "HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test14529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14529");
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
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor35 = languageRangeList34.listIterator();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.util.Locale locale44 = java.util.Locale.FRANCE;
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale44);
        java.util.Locale locale46 = java.util.Locale.US;
        java.util.Locale locale47 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale48 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale49 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.lang.String str51 = locale49.getDisplayCountry(locale50);
        java.lang.String str52 = locale49.toLanguageTag();
        java.util.Locale locale53 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale54 = java.util.Locale.getDefault();
        java.lang.String str55 = locale53.getDisplayCountry(locale54);
        java.util.Locale locale56 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale57 = java.util.Locale.getDefault();
        java.lang.String str58 = locale56.getDisplayCountry(locale57);
        java.util.Locale locale62 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale63 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale64 = java.util.Locale.getDefault();
        java.lang.String str65 = locale63.getDisplayCountry(locale64);
        java.util.Locale locale67 = new java.util.Locale("");
        java.lang.String str68 = locale67.getDisplayVariant();
        java.util.Locale locale69 = java.util.Locale.KOREAN;
        java.util.Locale locale71 = new java.util.Locale("");
        java.util.Locale locale72 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray73 = new java.util.Locale[] { locale44, locale46, locale47, locale48, locale49, locale54, locale56, locale62, locale64, locale67, locale69, locale71, locale72 };
        java.util.ArrayList<java.util.Locale> localeList74 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList74, localeArray73);
        java.util.List<java.util.Locale> localeList76 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList74);
        java.lang.String[] strArray84 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        java.util.List<java.lang.Class<?>> wildcardClassList87 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList85);
        java.util.Locale.FilteringMode filteringMode88 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList89 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList85, filteringMode88);
        java.util.List<java.lang.String> strList90 = java.util.Locale.filterTags(languageRangeList34, (java.util.Collection<java.lang.String>) strList38, filteringMode88);
        boolean boolean91 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor92 = languageRangeList34.iterator();
        boolean boolean93 = languageRangeItor92.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange94 = languageRangeItor92.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
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
        org.junit.Assert.assertNotNull(languageRangeItor35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "english" + "'", str45, "english");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Chine" + "'", str51, "Chine");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "zh-CN" + "'", str52, "zh-CN");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale54);
// flaky:         org.junit.Assert.assertEquals(locale54.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Chine" + "'", str55, "Chine");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale57);
// flaky:         org.junit.Assert.assertEquals(locale57.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Chine" + "'", str58, "Chine");
        org.junit.Assert.assertEquals(locale62.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale64);
// flaky:         org.junit.Assert.assertEquals(locale64.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Chine" + "'", str65, "Chine");
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "ko");
        org.junit.Assert.assertEquals(locale71.toString(), "");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(localeList76);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClassList87);
        org.junit.Assert.assertTrue("'" + filteringMode88 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode88.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList89);
        org.junit.Assert.assertNotNull(strList90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(languageRangeItor92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test14530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14530");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("AD.FR_CAZW", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14531");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("COLLECTI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "COLLECTI" + "'", str1, "COLLECTI");
    }

    @Test
    public void test14532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14532");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "Ci_a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14533");
        java.util.Locale locale1 = new java.util.Locale("I");
        java.util.Locale locale2 = locale1.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale2.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for i");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "i");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "i");
    }

    @Test
    public void test14534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14534");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "Ci_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14535");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap39 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList40 = java.util.Locale.LanguageRange.parse("Cina", strMap39);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap41 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList42 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList40, strMap41);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList44 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean46 = languageRangeList44.remove((java.lang.Object) "English");
        boolean boolean48 = languageRangeList44.remove((java.lang.Object) 1);
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.util.Locale locale53 = java.util.Locale.FRANCE;
        java.lang.String str54 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale53);
        java.util.Locale locale55 = java.util.Locale.US;
        java.util.Locale locale56 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale57 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale58 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale59 = java.util.Locale.getDefault();
        java.lang.String str60 = locale58.getDisplayCountry(locale59);
        java.lang.String str61 = locale58.toLanguageTag();
        java.util.Locale locale62 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale63 = java.util.Locale.getDefault();
        java.lang.String str64 = locale62.getDisplayCountry(locale63);
        java.util.Locale locale65 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale66 = java.util.Locale.getDefault();
        java.lang.String str67 = locale65.getDisplayCountry(locale66);
        java.util.Locale locale71 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale72 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale73 = java.util.Locale.getDefault();
        java.lang.String str74 = locale72.getDisplayCountry(locale73);
        java.util.Locale locale76 = new java.util.Locale("");
        java.lang.String str77 = locale76.getDisplayVariant();
        java.util.Locale locale78 = java.util.Locale.KOREAN;
        java.util.Locale locale80 = new java.util.Locale("");
        java.util.Locale locale81 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray82 = new java.util.Locale[] { locale53, locale55, locale56, locale57, locale58, locale63, locale65, locale71, locale73, locale76, locale78, locale80, locale81 };
        java.util.ArrayList<java.util.Locale> localeList83 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList83, localeArray82);
        java.util.List<java.util.Locale> localeList85 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.util.Locale>) localeList83);
        java.util.Locale locale86 = java.util.Locale.lookup(languageRangeList44, (java.util.Collection<java.util.Locale>) localeList83);
        java.util.List<java.util.Locale> localeList87 = java.util.Locale.filter(languageRangeList42, (java.util.Collection<java.util.Locale>) localeList83);
        java.util.List<java.util.Locale> localeList88 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.util.Locale>) localeList87);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap89 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList90 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, strMap89);
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
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "anglais" + "'", str21, "anglais");
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
        org.junit.Assert.assertNotNull(languageRangeList40);
        org.junit.Assert.assertNotNull(languageRangeList42);
        org.junit.Assert.assertNotNull(languageRangeList44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "english" + "'", str54, "english");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale59);
// flaky:         org.junit.Assert.assertEquals(locale59.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Chine" + "'", str60, "Chine");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "zh-CN" + "'", str61, "zh-CN");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale63);
// flaky:         org.junit.Assert.assertEquals(locale63.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Chine" + "'", str64, "Chine");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale66);
// flaky:         org.junit.Assert.assertEquals(locale66.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Chine" + "'", str67, "Chine");
        org.junit.Assert.assertEquals(locale71.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale73);
// flaky:         org.junit.Assert.assertEquals(locale73.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Chine" + "'", str74, "Chine");
        org.junit.Assert.assertEquals(locale76.toString(), "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "ko");
        org.junit.Assert.assertEquals(locale80.toString(), "");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(localeList85);
        org.junit.Assert.assertNull(locale86);
        org.junit.Assert.assertNotNull(localeList87);
        org.junit.Assert.assertNotNull(localeList88);
        org.junit.Assert.assertNotNull(languageRangeList90);
    }

    @Test
    public void test14536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14536");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("an", "                                                tw                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14537");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "REFERENCEPIPELINE.HEAD                        ", "ithi!lihi!no                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14538");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("##Italian");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##ITALIAN" + "'", str1, "##ITALIAN");
    }

    @Test
    public void test14539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14539");
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
        java.util.Locale.Builder builder22 = builder20.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder25 = builder20.setUnicodeLocaleKeyword("INGLESE (CANADA)", "TALIAHi");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: INGLESE (CANADA) [at index 0]");
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "anglais" + "'", str11, "anglais");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
// flaky:         org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chine" + "'", str16, "Chine");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test14540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14540");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\u4e2d\u6587\u4e2d\u56fd)", "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14541");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                         ", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14542");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Collections.EmptySetitaCollections.EmptySetitaCollections.EmptySetitaCollections.EmptySet", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=collections.emptysetitacollections.emptysetitacollections.emptysetitacollections.emptyset");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14543");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                                   $", 33, 18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  " + "'", str3, "                  ");
    }

    @Test
    public void test14544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14544");
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
        boolean boolean31 = languageRangeList13.isEmpty();
        boolean boolean32 = languageRangeList13.isEmpty();
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
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "anglais" + "'", str21, "anglais");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "a" + "'", str23, "a");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(languageRangeStream30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test14545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14545");
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
        java.lang.String str17 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray14, "ita");
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class[] classArray22 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray23 = (java.lang.Class<?>[]) classArray22;
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray22);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray22);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray22);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray26);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray26, ' ');
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray26);
        java.lang.Class[] classArray32 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray32);
        java.lang.Class<?> wildcardClass35 = null;
        java.lang.Class[] classArray37 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        wildcardClassArray38[0] = wildcardClass35;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray34, wildcardClassArray38, false);
        java.lang.Class[] classArray44 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray45 = (java.lang.Class<?>[]) classArray44;
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray44);
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray34, (java.lang.Class<?>[]) classArray44);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray34);
        boolean boolean50 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray34, true);
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray26);
        java.util.Locale.LanguageRange[] languageRangeArray52 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList53 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53, languageRangeArray52);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap55 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList56 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, strMap55);
        int int57 = languageRangeList53.size();
        java.lang.Class[] classArray59 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray60 = (java.lang.Class<?>[]) classArray59;
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray59);
        boolean boolean62 = languageRangeList53.equals((java.lang.Object) wildcardClassArray61);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray61);
        boolean boolean64 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray61);
        boolean boolean66 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, wildcardClassArray61, true);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Class[]" + "'", str17, "Class[]");
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(classArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertNotNull(languageRangeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(languageRangeList56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(classArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test14546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14546");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                      hArrayList");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hArrayList" + "'", str1, "hArrayList");
    }

    @Test
    public void test14547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14547");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Chi..");
        java.lang.String str2 = locale1.getVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test14548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14548");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ANIHC", "");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test14549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14549");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor18 = languageRangeList14.listIterator(117);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 117");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Locale.LanguageRange" + "'", str6, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "english" + "'", str7, "english");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeStream15);
        org.junit.Assert.assertNotNull(languageRangeStream16);
    }

    @Test
    public void test14550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14550");
        java.util.Locale locale2 = new java.util.Locale("ese (Taiwan", "hindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindi");
        org.junit.Assert.assertEquals(locale2.toString(), "ese (taiwan_HINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDIHINDI");
    }

    @Test
    public void test14551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("XXXXXXXXXXXXXXJAPANESEXXXXXXXXXXXXXX", "ithi!lihi!no");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XXXXXXXXXXXXXXJAPANESEXXXXXXXXXXXXXX" + "'", str2, "XXXXXXXXXXXXXXJAPANESEXXXXXXXXXXXXXX");
    }

    @Test
    public void test14552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14552");
        java.util.Locale locale4 = new java.util.Locale("hi", "hi!", "cHINA");
        java.lang.String str5 = locale4.getLanguage();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("CINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA", locale4);
        java.lang.String str7 = locale4.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet8 = locale4.getExtensionKeys();
        java.util.Set<java.lang.String> strSet9 = locale4.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale4.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi" + "'", str5, "hi");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA" + "'", str6, "CINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hindi" + "'", str7, "hindi");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test14553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14553");
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
        java.util.Locale.Builder builder34 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder35 = builder34.clearExtensions();
        java.util.Locale locale36 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder37 = builder35.setLocale(locale36);
        java.util.Locale.Builder builder39 = builder35.setRegion("zh");
        java.util.Locale.Builder builder40 = builder39.clear();
        java.util.Locale.Builder builder41 = builder40.clearExtensions();
        java.util.Locale.Builder builder43 = builder40.addUnicodeLocaleAttribute("CAN");
        java.util.Locale locale44 = java.util.Locale.CHINESE;
        java.util.Locale locale45 = java.util.Locale.JAPANESE;
        java.util.Locale locale47 = java.util.Locale.TAIWAN;
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.upperCase("", locale47);
        java.lang.String str49 = locale45.getDisplayVariant(locale47);
        java.util.Set<java.lang.Character> charSet50 = locale47.getExtensionKeys();
        java.util.Set<java.lang.String> strSet51 = locale47.getUnicodeLocaleAttributes();
        java.util.Locale locale54 = new java.util.Locale("ahi!hi!", "                 a                 ");
        java.lang.String str55 = locale47.getDisplayScript(locale54);
        java.lang.String str56 = locale44.getDisplayName(locale47);
        java.util.Locale.Builder builder57 = builder40.setLocale(locale44);
        java.lang.String str58 = locale9.getDisplayVariant(locale44);
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
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Chine" + "'", str19, "Chine");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u4e2d\u6587" + "'", str25, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale26);
// flaky:         org.junit.Assert.assertEquals(locale26.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Taiwan" + "'", str27, "Taiwan");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str30, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u65e5\u6587" + "'", str32, "\u65e5\u6587");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "ja");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(charSet50);
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertEquals(locale54.toString(), "ahi!hi!_                 A                 ");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\u4e2d\u6587" + "'", str56, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test14554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14554");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Collecti", "      444444444444444444444444444444444      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14555");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\u82f1\u6587\u7f8e\u570b)");
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test14556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14556");
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
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor38 = languageRangeList1.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange39 = languageRangeItor38.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
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
        org.junit.Assert.assertNotNull(languageRangeItor38);
    }

    @Test
    public void test14557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14557");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("acoL");
        java.lang.Class<?>[] wildcardClassArray2 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class java.lang.Stringclass java.lang.String" + "'", str3, "class java.lang.Stringclass java.lang.String");
    }

    @Test
    public void test14558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14558");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("anglais (Canada");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test14559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14559");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("ahi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi!hi" + "'", str1, "ahi!hi");
    }

    @Test
    public void test14560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14560");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("NHC", 27, "ChinChinChinChinChinChinChinChinChinaaaaaaaaa.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ChinChinChinNHCChinChinChin" + "'", str3, "ChinChinChinNHCChinChinChin");
    }

    @Test
    public void test14561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14561");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        boolean boolean8 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6);
        languageRangeList1.clear();
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
        java.util.List<java.util.Locale> localeList47 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList46);
        int int48 = languageRangeList1.size();
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap52 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList53 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, strMap52);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator54 = languageRangeList50.spliterator();
        boolean boolean55 = languageRangeList50.isEmpty();
        java.lang.Object[] objArray56 = languageRangeList50.toArray();
        java.lang.String str57 = org.apache.commons.lang3.StringUtils.concat(objArray56);
        boolean boolean58 = languageRangeList1.remove((java.lang.Object) objArray56);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
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
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Chine" + "'", str21, "Chine");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Chine" + "'", str25, "Chine");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Chine" + "'", str28, "Chine");
        org.junit.Assert.assertEquals(locale32.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Chine" + "'", str35, "Chine");
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
        org.junit.Assert.assertNotNull(localeList47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(languageRangeList53);
        org.junit.Assert.assertNotNull(languageRangeSpliterator54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[]");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test14562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14562");
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
        java.lang.String[] strArray72 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        java.util.List<java.lang.Class<?>> wildcardClassList75 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList73);
        java.util.Locale.FilteringMode filteringMode76 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList73, filteringMode76);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator78 = languageRangeList29.spliterator();
        java.lang.String str80 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) languageRangeList29, "Locale.LanguageRange");
        boolean boolean81 = languageRangeList23.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29);
        languageRangeList23.clear();
        java.lang.String[] strArray85 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("en_CA", "");
        boolean boolean86 = languageRangeList23.equals((java.lang.Object) "en_CA");
        languageRangeList23.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange89 = languageRangeList23.remove(27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 27, Size: 0");
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
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Chine" + "'", str39, "Chine");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "zh-CN" + "'", str40, "zh-CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
// flaky:         org.junit.Assert.assertEquals(locale42.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Chine" + "'", str43, "Chine");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
// flaky:         org.junit.Assert.assertEquals(locale45.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Chine" + "'", str46, "Chine");
        org.junit.Assert.assertEquals(locale50.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Chine" + "'", str53, "Chine");
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
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(wildcardClassList75);
        org.junit.Assert.assertTrue("'" + filteringMode76 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode76.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(languageRangeSpliterator78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "ArrayList" + "'", str80, "ArrayList");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test14563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14563");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HSILIILGNExxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HSILIILGNExxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str1, "HSILIILGNExxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test14564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14564");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("deu", "i##################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14565");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("en-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-ca", " L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14566");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("lang)", "", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test14567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14567");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray5);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?> wildcardClass11 = null;
        java.lang.Class[] classArray13 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        wildcardClassArray14[0] = wildcardClass11;
        boolean boolean18 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray10);
        java.lang.Class[] classArray21 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray22 = (java.lang.Class<?>[]) classArray21;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray21);
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray21);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray21);
        java.lang.Class[] classArray27 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray27);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray27);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray27);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray31);
        boolean boolean34 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray25, wildcardClassArray31, true);
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray25);
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray35, true);
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray39);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray39);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray39);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray39);
        java.lang.Class[] classArray46 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray47 = (java.lang.Class<?>[]) classArray46;
        boolean boolean49 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray39, (java.lang.Class<?>[]) classArray46, true);
        boolean boolean50 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, (java.lang.Class<?>[]) classArray46);
        boolean boolean51 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray10);
        java.lang.String[] strArray56 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String str60 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray56, "zho", (int) 'u', (int) (short) 0);
        int int61 = org.apache.commons.lang3.StringUtils.indexOfAny("CHINOIS (CHINE)", strArray56);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray56);
        java.lang.String[] strArray64 = org.apache.commons.lang3.StringUtils.splitByCharacterType("english");
        java.lang.String[] strArray66 = org.apache.commons.lang3.StringUtils.stripAll(strArray64, "java.lang (CHINES)");
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray64);
        java.lang.Class<?>[] wildcardClassArray68 = null;
        boolean boolean69 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray67, wildcardClassArray68);
        boolean boolean71 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray62, wildcardClassArray67, true);
        boolean boolean72 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray62);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test14568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14568");
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
        java.util.Locale.setDefault(locale2);
        java.lang.String str33 = locale2.getScript();
        java.lang.Class<?> wildcardClass34 = locale2.getClass();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u82f1\u8a9e" + "'", str5, "\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chine" + "'", str12, "Chine");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh-CN" + "'", str13, "zh-CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh" + "'", str14, "zh");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u82f1\u8a9e" + "'", str20, "\u82f1\u8a9e");
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test14569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14569");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(" ud ", "       HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14570");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindi", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxUSxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14571");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Engl....englishs....englis", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14572");
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
        java.lang.String str49 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) builder47, "TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRIAD.AE.AF.A");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder51 = builder47.setVariant("   JAJAJAJAJAJAJAJAJAJAJAJAJAJ)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant:    JAJAJAJAJAJAJAJAJAJAJAJAJAJ) [at index 0]");
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
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "hi");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "hi");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "java.util" + "'", str49, "java.util");
    }

    @Test
    public void test14573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14573");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("fran\347ais (France)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fran\347ais(France)" + "'", str1, "fran\347ais(France)");
    }

    @Test
    public void test14574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14574");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("ANIHC$      $xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "Z");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14575");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Italien", 'x');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test14576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14576");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "##############acoL###############", (java.lang.CharSequence) "                                                      java.lang                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 116 + "'", int2 == 116);
    }

    @Test
    public void test14577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14577");
        java.util.Locale locale3 = new java.util.Locale("hindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHind", "locale.builder", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihind_LOCALE.BUILDER_ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LOCALE.BUILDER" + "'", str5, "LOCALE.BUILDER");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihind_LOCALE.BUILDER_ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish" + "'", str6, "hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihind_LOCALE.BUILDER_ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish");
    }

    @Test
    public void test14578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14578");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder9 = builder5.setLanguageTag("KOR");
        java.util.Locale.Builder builder10 = builder9.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test14579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14579");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ZHCINESESuEn", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ZHCINESESuEn");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14580");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray4, "Chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClassArray8);
    }

    @Test
    public void test14581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14581");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("$$$C...$$$", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindi", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14582");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
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
        java.lang.String str15 = locale5.getDisplayCountry();
        java.lang.String str16 = locale5.getDisplayLanguage();
        java.util.Locale.setDefault(category0, locale5);
        java.lang.String str18 = locale5.getDisplayName();
        java.util.Locale locale21 = new java.util.Locale("$");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.upperCase("EnglTWNsTWN", locale21);
        java.util.Set<java.lang.String> strSet23 = locale21.getUnicodeLocaleAttributes();
        boolean boolean24 = locale5.equals((java.lang.Object) locale21);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "English" + "'", str8, "English");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "english" + "'", str12, "english");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals(locale21.toString(), "$");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ENGLTWNSTWN" + "'", str22, "ENGLTWNSTWN");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test14583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14583");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("          ...", (double) 47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=47.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14584");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("......");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=......");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14585");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("AN       english");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AN       englis" + "'", str1, "AN       englis");
    }

    @Test
    public void test14586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14586");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("GBR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GBR" + "'", str1, "GBR");
    }

    @Test
    public void test14587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063)", "LOCALE#LANGUAGERANGE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063)" + "'", str2, "\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063)");
    }

    @Test
    public void test14588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14588");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("RGLaSa", "\u6cd5\u6cd5\u6587\u6587ST");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RGLaSa" + "'", str2, "RGLaSa");
    }

    @Test
    public void test14589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14589");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hI!HI!HI!HI!HI!Hzh_Z!ZH_TWHI!HI!HI!HI!HI!Hzh_Z!H", "NWTSNWTLGNE", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14590");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("tuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "\u4e2d\u56fdAD.AE.AFxxxxxxxxxxxxxxxxxxxxxxxxx", 24);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4le.Builder[]aLoc", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "tuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str5, "tuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test14591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14591");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Cina", strMap1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Engls");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        boolean boolean6 = languageRangeList2.contains((java.lang.Object) strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("en-CASTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN", "undaaaaaaa", 117);
        int int11 = languageRangeList2.lastIndexOf((java.lang.Object) "en-CASTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN");
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Engls" + "'", str5, "Engls");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test14592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14592");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, '#', 52, 13);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test14593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14593");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("arraylist##########");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=arraylist##########");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14594");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("inglese (canada)_FR_FR_$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "inglese (canada)_FR_FR_$" + "'", str1, "inglese (canada)_FR_FR_$");
    }

    @Test
    public void test14595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14595");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "\u4e2d\u56fd\u8a9e (ZH)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u56fd\u8a9e (ZH)" + "'", str1, "\u4e2d\u56fd\u8a9e (ZH)");
    }

    @Test
    public void test14596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14596");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setRegion("iai");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: iai [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test14597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14597");
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
        java.util.Set<java.lang.Character> charSet15 = locale2.getExtensionKeys();
        java.lang.String str16 = locale2.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940" + "'", str5, "\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "english" + "'", str9, "english");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test14598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14598");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("ArrayList.ListItrArrayList.ListItrArrayList.ListItrArrayList.ListItrArrayList.ListIfran\347ais (France)", "Locale.Builder[]", 24, (int) '4');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ArrayList.ListItrArrayLiLocale.Builder[]rrayList.ListItrArrayList.ListIfran\347ais (France)" + "'", str4, "ArrayList.ListItrArrayLiLocale.Builder[]rrayList.ListItrArrayList.ListIfran\347ais (France)");
    }

    @Test
    public void test14599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14599");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("zhcines", (int) 'u', "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                       zhcines                                                       " + "'", str3, "                                                       zhcines                                                       ");
    }

    @Test
    public void test14600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14600");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("arraylist###########", '.');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "fr-FRSTI-F");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arraylist###########" + "'", str4, "arraylist###########");
    }

    @Test
    public void test14601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14601");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder4 = builder1.clearExtensions();
        java.util.Locale.Builder builder6 = builder1.setVariant("");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder8 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder6.setVariant("                                                                                              German");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant:                                                                                               German [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test14602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14602");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ANIHC      ", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test14603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14603");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.util.Locale locale5 = new java.util.Locale("");
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.lang.String str9 = locale5.getDisplayScript(locale7);
        java.lang.String str10 = locale7.getDisplayVariant();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("", locale7);
        java.lang.String str12 = locale7.getLanguage();
        java.lang.String str13 = locale1.getDisplayScript(locale7);
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale locale16 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder17 = builder15.setLocale(locale16);
        java.lang.String str18 = locale1.getDisplayName(locale16);
        java.util.Locale.Category category19 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale20 = java.util.Locale.getDefault(category19);
        java.util.Locale locale21 = java.util.Locale.getDefault(category19);
        java.util.Locale locale22 = java.util.Locale.FRENCH;
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str24 = locale23.getDisplayLanguage();
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale23.getDisplayCountry(locale25);
        java.util.Locale locale27 = java.util.Locale.TAIWAN;
        java.lang.String str28 = locale27.getVariant();
        java.lang.String str29 = locale23.getDisplayName(locale27);
        java.lang.String str30 = locale22.getDisplayScript(locale23);
        java.util.Locale.setDefault(category19, locale23);
        java.util.Locale locale34 = java.util.Locale.forLanguageTag("twn");
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.upperCase("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", locale34);
        java.lang.String str36 = locale34.getVariant();
        java.util.Locale.setDefault(category19, locale34);
        java.lang.String str38 = locale34.getDisplayCountry();
        java.lang.String str39 = locale1.getDisplayName(locale34);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940" + "'", str8, "\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en" + "'", str12, "en");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str18, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category19.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Chinese" + "'", str24, "Chinese");
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Taiwan" + "'", str26, "Taiwan");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str29, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "twn");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str35, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Chinese (China)" + "'", str39, "Chinese (China)");
    }

    @Test
    public void test14604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14604");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("gsslesesac.esesacsvsj", 530);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gsslesesac.esesacsvsj" + "'", str2, "gsslesesac.esesacsvsj");
    }

    @Test
    public void test14605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14605");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("locle.lngugernge", "\u0939\u093f\u0902\u0926\u0940");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14606");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587                                                                                                                                                                          ", 19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14607");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("en-ca", "##ITALIAN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14608");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("            HI!HI!HI!HI!HI!HI            ", "A   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14609");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("inglese");
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("ingleseu");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test14610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14610");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "english");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", (int) (byte) -1);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("en", strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                 a                  ", strArray4, strArray10);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray20);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.stripAll(strArray21);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray17, strArray21);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEach("fraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayList", strArray4, strArray17);
        java.lang.String str26 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) str24, "444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANIHc");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str5, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                 a                  " + "'", str12, "                 a                  ");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str23, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "fraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayList" + "'", str24, "fraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayList");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "String" + "'", str26, "String");
    }

    @Test
    public void test14611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14611");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("rglAsA", "ese (Taiwan$$$$$$$$$slgneese (Taiwan");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test14612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14612");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("slgnEslgnEslgnEfran\347axsx(Canada)slgnEslgnEslgnEs", "ololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololol");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test14613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14613");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "ions.EmptySet");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test14614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14614");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "AN                 a                 AN   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14615");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("har[].............................................................................................", 41, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "har[]............................................................................................." + "'", str3, "har[].............................................................................................");
    }

    @Test
    public void test14616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14616");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hina");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn", 34, 279);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test14617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14617");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                         a                          ", (int) (byte) 1, "undaaaaaaaH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                         a                          " + "'", str3, "                         a                          ");
    }

    @Test
    public void test14618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14618");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("ingleseuingleseuingleseuinjava.lang", "RGLaSa", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test14619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14619");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                ", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                " + "'", str2, "                                                ");
    }

    @Test
    public void test14620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14620");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale locale3 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setLanguageTag("An                             ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: An                              [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
    }

    @Test
    public void test14621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14621");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "                                        f   ch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test14622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14622");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str1, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test14623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14623");
        java.util.Locale locale3 = new java.util.Locale("rance)Itali", "ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw", "ENENENENENENENENENEN");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale5 = locale4.stripExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "rance)itali_AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW_ENENENENENENENENENEN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "rance)itali_AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW_ENENENENENENENENENEN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "rance)itali_AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW_ENENENENENENENENENEN");
    }

    @Test
    public void test14624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14624");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("us", "IIIIIIIIIIIIIIIIIIIIIIISTRINGIIIIIIIIIIIIIIIIIIIIIII", "AN       english");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us" + "'", str3, "us");
    }

    @Test
    public void test14625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14625");
        java.util.Locale locale3 = new java.util.Locale("JAVA.LANG", "Chines");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("ad.fr_CAzw", locale3);
        java.lang.String str5 = locale3.getDisplayCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "java.lang_CHINES");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AD.FR_CAZW" + "'", str4, "AD.FR_CAZW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CHINES" + "'", str5, "CHINES");
    }

    @Test
    public void test14626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14626");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("FR");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("de", locale2);
        java.lang.String str4 = locale2.getLanguage();
        java.lang.String str5 = locale2.getISO3Language();
        java.lang.Object obj6 = locale2.clone();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "de" + "'", str3, "de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr" + "'", str4, "fr");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fra" + "'", str5, "fra");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "fr");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "fr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "fr");
    }

    @Test
    public void test14627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14627");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayList", "\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587 (HI!,cHINcn_ITALIANOJAJAJAJAJAJAJAJAJAJAJAJAJAJ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14628");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hindiHindiHinclass java.lang.StringhindiHindiHin", "US");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14629");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("                 a                  ", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) ".", charArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                           GERMN", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test14630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14630");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale locale4 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleKeys();
        java.lang.String str6 = locale4.getDisplayName();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setLanguageTag("boolean");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test14631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14631");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("ANIHC");
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) builder3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder3.setRegion("......");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ...... [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Locale.Builder" + "'", str9, "Locale.Builder");
    }

    @Test
    public void test14632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14632");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                ese(Taiwan", "\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliIlish)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14633");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.removeUnicodeLocaleAttribute("ananananananananananaCINAanananananananananana");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ananananananananananaCINAanananananananananana [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test14634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14634");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale.setDefault(locale0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test14635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14635");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("         ZH_TW          ", "                                                                                                            undaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaH                                                                                                             ", 649);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14636");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("NATSILYARRANA", "\u5fb7\u6587\u5fb7\u56fd\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NATSILYARRANA" + "'", str2, "NATSILYARRANA");
    }

    @Test
    public void test14637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14637");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("\u4e2d\u6587", "aCOL", "HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test14638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14638");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ANIHCANIHC", "\u4e2d\u6587 (ZH)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14639");
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
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator78 = languageRangeList73.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor80 = languageRangeList73.listIterator(107);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 107");
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
        org.junit.Assert.assertNotNull(languageRangeSpliterator78);
    }

    @Test
    public void test14640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14640");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test14641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14641");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$xxxxxxxxinglese (Canada)xxxxxxxx$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$$xxxxxxxxinglese (Canada)xxxxxxxx$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, "$$$$$$$$$$$$$xxxxxxxxinglese (Canada)xxxxxxxx$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test14642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14642");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("EnglANIHC      sANIHC      ", (int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14643");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Z", 23, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Z......................" + "'", str3, "Z......................");
    }

    @Test
    public void test14644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14644");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                redliuB.elacoL", "                                   ", 46, 39);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                redliuB                                   " + "'", str4, "                                redliuB                                   ");
    }

    @Test
    public void test14645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14645");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap59 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList60 = java.util.Locale.LanguageRange.parse("Cina", strMap59);
        java.lang.String[] strArray64 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        java.util.Locale.FilteringMode filteringMode67 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags(languageRangeList60, (java.util.Collection<java.lang.String>) strList65, filteringMode67);
        java.util.List<java.lang.String> strList69 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList68);
        java.lang.String str71 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) languageRangeList1, "CINA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor72 = languageRangeList1.listIterator();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream73 = languageRangeList1.stream();
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
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str54, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(languageRangeList60);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + filteringMode67 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode67.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "java.util" + "'", str71, "java.util");
        org.junit.Assert.assertNotNull(languageRangeItor72);
        org.junit.Assert.assertNotNull(languageRangeStream73);
    }

    @Test
    public void test14646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14646");
        char[] charArray12 = new char[] { '#', '#', ' ' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("China", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...X.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN...", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "chi...", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("#####it_CN", charArray12);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "cnn                                                                                                ", charArray12);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "zu", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test14647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14647");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "An                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test14648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14648");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("acol", "nglish", 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("nawiazh-cnnawia", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14649");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("                                                                                            en_CA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=en_ca");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14650");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                              italiahi                                              ", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              italiahi                                              " + "'", str2, "                                              italiahi                                              ");
    }

    @Test
    public void test14651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14651");
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
        java.util.Locale.LanguageRange languageRange30 = new java.util.Locale.LanguageRange("English");
        java.lang.String str32 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange30, "");
        java.util.Locale.LanguageRange languageRange34 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange36 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] { languageRange30, languageRange34, languageRange36 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor40 = languageRangeList38.listIterator();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator41 = languageRangeList38.spliterator();
        boolean boolean42 = languageRangeList6.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38);
        java.lang.Object obj43 = null;
        boolean boolean44 = languageRangeList38.remove(obj43);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor45 = languageRangeList38.listIterator();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Locale.LanguageRange" + "'", str32, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(languageRangeItor40);
        org.junit.Assert.assertNotNull(languageRangeSpliterator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(languageRangeItor45);
    }

    @Test
    public void test14652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14652");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14653");
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
        java.lang.Class[] classArray15 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray16 = (java.lang.Class<?>[]) classArray15;
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray15);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray15);
        java.lang.Class[] classArray20 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray20);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray20);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray20, "zh-CN");
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, (java.lang.Class<?>[]) classArray20);
        java.lang.Class[] classArray28 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray28);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray28);
        java.lang.Class[] classArray34 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray34);
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray34);
        boolean boolean38 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray28, (java.lang.Class<?>[]) classArray34);
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, (java.lang.Class<?>[]) classArray34, true);
        java.lang.Class[] classArray42 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray42);
        java.lang.Class<?> wildcardClass45 = null;
        java.lang.Class[] classArray47 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray48 = (java.lang.Class<?>[]) classArray47;
        wildcardClassArray48[0] = wildcardClass45;
        boolean boolean52 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray44, wildcardClassArray48, false);
        java.lang.Class[] classArray54 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray55 = (java.lang.Class<?>[]) classArray54;
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray54);
        boolean boolean57 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray44, (java.lang.Class<?>[]) classArray54);
        java.lang.Class[] classArray59 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray60 = (java.lang.Class<?>[]) classArray59;
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray59);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray59);
        java.lang.Class[] classArray64 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray65 = (java.lang.Class<?>[]) classArray64;
        java.lang.Class<?>[] wildcardClassArray66 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray64);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray64);
        java.lang.String str69 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray64, "zh-CN");
        boolean boolean70 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray62, (java.lang.Class<?>[]) classArray64);
        boolean boolean72 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray44, wildcardClassArray62, false);
        java.lang.Class<?>[] wildcardClassArray73 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray44);
        java.lang.Class<?>[] wildcardClassArray74 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray44);
        boolean boolean75 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray34, wildcardClassArray44);
        java.lang.Class[] classArray77 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray78 = (java.lang.Class<?>[]) classArray77;
        java.lang.Class<?>[] wildcardClassArray79 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray77);
        java.lang.Class<?> wildcardClass80 = null;
        java.lang.Class[] classArray82 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray83 = (java.lang.Class<?>[]) classArray82;
        wildcardClassArray83[0] = wildcardClass80;
        boolean boolean87 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray79, wildcardClassArray83, false);
        java.lang.Class<?>[] wildcardClassArray88 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray79);
        boolean boolean90 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray34, wildcardClassArray88, false);
        boolean boolean92 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray12, wildcardClassArray88, true);
        java.lang.String str94 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray12, "ArrayList.ListItrArrayLiLocale.Builder[]rrayList.ListItrArrayList.ListIfran\347ais (France)");
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
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(classArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(classArray64);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertNotNull(wildcardClassArray74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(classArray77);
        org.junit.Assert.assertNotNull(wildcardClassArray78);
        org.junit.Assert.assertNotNull(wildcardClassArray79);
        org.junit.Assert.assertNotNull(classArray82);
        org.junit.Assert.assertNotNull(wildcardClassArray83);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
    }

    @Test
    public void test14654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14654");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, '#');
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList2.listIterator(1);
        java.lang.Object[] objArray7 = languageRangeList2.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("hi");
        int int11 = languageRangeList9.indexOf((java.lang.Object) '4');
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, strMap15);
        int int17 = languageRangeList13.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor18 = languageRangeList13.listIterator();
        java.util.Locale.LanguageRange languageRange20 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange22 = new java.util.Locale.LanguageRange("English");
        java.lang.String str24 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange22, "");
        java.util.Locale.LanguageRange languageRange26 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] { languageRange20, languageRange22, languageRange26 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        boolean boolean30 = languageRangeList13.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28);
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap34 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, strMap34);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor36 = languageRangeList35.listIterator();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.util.Locale locale45 = java.util.Locale.FRANCE;
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale45);
        java.util.Locale locale47 = java.util.Locale.US;
        java.util.Locale locale48 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale49 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale50 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale51 = java.util.Locale.getDefault();
        java.lang.String str52 = locale50.getDisplayCountry(locale51);
        java.lang.String str53 = locale50.toLanguageTag();
        java.util.Locale locale54 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale55 = java.util.Locale.getDefault();
        java.lang.String str56 = locale54.getDisplayCountry(locale55);
        java.util.Locale locale57 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale58 = java.util.Locale.getDefault();
        java.lang.String str59 = locale57.getDisplayCountry(locale58);
        java.util.Locale locale63 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale64 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale65 = java.util.Locale.getDefault();
        java.lang.String str66 = locale64.getDisplayCountry(locale65);
        java.util.Locale locale68 = new java.util.Locale("");
        java.lang.String str69 = locale68.getDisplayVariant();
        java.util.Locale locale70 = java.util.Locale.KOREAN;
        java.util.Locale locale72 = new java.util.Locale("");
        java.util.Locale locale73 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray74 = new java.util.Locale[] { locale45, locale47, locale48, locale49, locale50, locale55, locale57, locale63, locale65, locale68, locale70, locale72, locale73 };
        java.util.ArrayList<java.util.Locale> localeList75 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList75, localeArray74);
        java.util.List<java.util.Locale> localeList77 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.util.Locale>) localeList75);
        java.lang.String[] strArray85 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList86 = new java.util.ArrayList<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList86, strArray85);
        java.util.List<java.lang.Class<?>> wildcardClassList88 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList86);
        java.util.Locale.FilteringMode filteringMode89 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList90 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.lang.String>) strList86, filteringMode89);
        java.util.List<java.lang.String> strList91 = java.util.Locale.filterTags(languageRangeList35, (java.util.Collection<java.lang.String>) strList39, filteringMode89);
        boolean boolean92 = languageRangeList13.remove((java.lang.Object) strList91);
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags(languageRangeList9, (java.util.Collection<java.lang.String>) strList91);
        java.lang.String str94 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strList91);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Locale.LanguageRange" + "'", str24, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(languageRangeList35);
        org.junit.Assert.assertNotNull(languageRangeItor36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "english" + "'", str46, "english");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale51);
// flaky:         org.junit.Assert.assertEquals(locale51.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Chine" + "'", str52, "Chine");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "zh-CN" + "'", str53, "zh-CN");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale55);
// flaky:         org.junit.Assert.assertEquals(locale55.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Chine" + "'", str56, "Chine");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale58);
// flaky:         org.junit.Assert.assertEquals(locale58.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Chine" + "'", str59, "Chine");
        org.junit.Assert.assertEquals(locale63.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale65);
// flaky:         org.junit.Assert.assertEquals(locale65.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Chine" + "'", str66, "Chine");
        org.junit.Assert.assertEquals(locale68.toString(), "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "ko");
        org.junit.Assert.assertEquals(locale72.toString(), "");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(localeList77);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(wildcardClassList88);
        org.junit.Assert.assertTrue("'" + filteringMode89 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode89.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList90);
        org.junit.Assert.assertNotNull(strList91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(strList93);
        org.junit.Assert.assertNull(str94);
    }

    @Test
    public void test14655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14655");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "undaaaaaaah", (java.lang.CharSequence) "italianojajajajajajajajajajajajajaj");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14656");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.setRegion("zh");
        java.util.Locale locale6 = builder1.build();
        java.util.Locale locale7 = java.util.Locale.CANADA;
        boolean boolean8 = locale7.hasExtensions();
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str10 = locale7.getDisplayScript(locale9);
        java.util.Set<java.lang.String> strSet11 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale7.getVariant();
        java.lang.String str13 = locale6.getDisplayCountry(locale7);
        java.util.Locale.setDefault(locale6);
        java.lang.String str15 = locale6.getISO3Language();
        java.lang.String str16 = locale6.getVariant();
        java.util.Locale.setDefault(locale6);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_ZH");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ZH" + "'", str13, "ZH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zho" + "'", str15, "zho");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test14657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14657");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\u65e5\u6587", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u65e5\u6587" + "'", str2, "\u65e5\u6587");
    }

    @Test
    public void test14658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14658");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "ENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14659");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder26 = builder10.removeUnicodeLocaleAttribute("n");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: n [at index 0]");
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
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u82f1\u6587" + "'", str17, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "english" + "'", str21, "english");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test14660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14660");
        java.util.Locale locale2 = new java.util.Locale("ita", "string");
        org.junit.Assert.assertEquals(locale2.toString(), "ita_STRING");
    }

    @Test
    public void test14661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14661");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("\u4e2d\u56fd\u8a9e (ZH)", "  en_   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14662");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("cinese (Cina)", "en_CA");
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) strArray2, "italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital..");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
    }

    @Test
    public void test14663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14663");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u65e5\u6587\u65e5\u65e5\u65e5 (HI!,cHINA", '$');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test14664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14664");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\u4e2d\u6587\u4e2d\u56fd)", 7);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587 (" + "'", str2, "\u4e2d\u6587 (");
    }

    @Test
    public void test14665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14665");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "j");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test14666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14666");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("inglese (Canada)                                                                                       ese(Taiwan                                                                                       ese(Taiwan                                                                                       ese(Taiwan                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                           nawiaT(ese                                                                                       nawiaT(ese                                                                                       nawiaT(ese                                                                                       )adanaC( eselgni" + "'", str1, "                                           nawiaT(ese                                                                                       nawiaT(ese                                                                                       nawiaT(ese                                                                                       )adanaC( eselgni");
    }

    @Test
    public void test14667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14667");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("ZH)", "444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANIHc");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test14668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14668");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("a", "cHINA");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("LOCALE.LANGUAGERANGE", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("zhcinesese", strArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("builder", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test14669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14669");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "Collecti");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14670");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("...NCNCNCNCNCNCNCNCNCNCARRAYLIST", 745, 34);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test14671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14671");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("..", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test14672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14672");
        java.util.Locale locale2 = new java.util.Locale("zh-CNnglese", "Chin");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale2.toString(), "zh-cnnglese_CHIN");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test14673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14673");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14674");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) builder3, "CHNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.util.Locale.Builder builder8 = builder3.setLanguageTag("CN");
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("CHN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder8.setUnicodeLocaleKeyword("ENGLHI!STRING[]STRING[]SSHI!STRING[]STRING[]S", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHNAAAAA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ENGLHI!STRING[]STRING[]SSHI!STRING[]STRING[]S [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Locale.Builder" + "'", str6, "Locale.Builder");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test14675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14675");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "Collecti");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14676");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase(" zH  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " ZH  " + "'", str1, " ZH  ");
    }

    @Test
    public void test14677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14677");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.lang.String str3 = locale0.toLanguageTag();
        boolean boolean4 = locale0.hasExtensions();
        java.lang.String str5 = locale0.getDisplayCountry();
        java.util.Set<java.lang.String> strSet6 = locale0.getUnicodeLocaleKeys();
        java.lang.String str7 = locale0.getScript();
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.lang.String str10 = locale8.getDisplayCountry(locale9);
        java.lang.String str11 = locale8.toLanguageTag();
        java.lang.String str12 = locale8.getLanguage();
        java.util.Locale locale13 = java.util.Locale.ITALIAN;
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.lang.String str18 = locale17.getDisplayLanguage();
        java.lang.String str19 = locale15.getDisplayScript(locale17);
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale21);
        java.lang.String str23 = locale15.getDisplayCountry(locale21);
        java.lang.String str24 = locale13.getDisplayScript(locale15);
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.lang.String str26 = locale15.getDisplayLanguage(locale25);
        java.lang.String str27 = locale8.getDisplayCountry(locale15);
        java.lang.String str28 = locale15.getCountry();
        java.util.Locale locale32 = new java.util.Locale("....english", "zhcinesese", ".");
        java.lang.String str33 = locale15.getDisplayName(locale32);
        java.lang.String str34 = locale15.getDisplayName();
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet37 = locale35.getUnicodeLocaleAttributes();
        java.lang.String str38 = locale15.getDisplayLanguage(locale35);
        java.lang.String str39 = locale0.getDisplayCountry(locale35);
        java.lang.String str40 = locale0.getISO3Language();
        java.lang.String str41 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd" + "'", str2, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u56fd" + "'", str10, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-CN" + "'", str11, "zh-CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh" + "'", str12, "zh");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u82f1\u6587" + "'", str18, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "english" + "'", str22, "english");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "China" + "'", str27, "China");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals(locale32.toString(), "....english_ZHCINESESE_.");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\uc911\uad6d" + "'", str39, "\uc911\uad6d");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "zho" + "'", str40, "zho");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test14678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14678");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI" + "'", str1, "GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI");
    }

    @Test
    public void test14679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14679");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("laEg                                                      ", "CHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "laEg                                                      " + "'", str3, "laEg                                                      ");
    }

    @Test
    public void test14680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14680");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("DE       ", "rance)Itali");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14681");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("redliuB.elacoL                            ", "NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLIS", 12);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test14682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14682");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("BUILDER,ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish)", (int) (byte) 1, "NHC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "BUILDER,ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish)" + "'", str3, "BUILDER,ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish)");
    }

    @Test
    public void test14683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14683");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(" Italian  ", "", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test14684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14684");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("Chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "Chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test14685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14685");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "tRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRIAD.AE.AF");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test14686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14686");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "zho", (-1));
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("....english", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test14687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14687");
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
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor68 = languageRangeList61.iterator();
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator69 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList61.replaceAll(languageRangeUnaryOperator69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals(locale31.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u4e2d\u56fd" + "'", str32, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zh-CN" + "'", str33, "zh-CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u56fd" + "'", str36, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\u4e2d\u56fd" + "'", str39, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale43.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\u4e2d\u56fd" + "'", str46, "\u4e2d\u56fd");
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
        org.junit.Assert.assertNotNull(languageRangeItor68);
    }

    @Test
    public void test14688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14688");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.setLanguage("Engls");
        java.lang.Class<?> wildcardClass9 = builder5.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14689");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("REFERENCEPIPELINE.HEAD                        list###########                                 ", "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "REFERENCEPIPELINE.HEAD                        list###########                                 " + "'", str2, "REFERENCEPIPELINE.HEAD                        list###########                                 ");
    }

    @Test
    public void test14690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14690");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder0.setRegion("AI");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test14691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14691");
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
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream11 = languageRangeList2.stream();
        java.lang.Class<?> wildcardClass12 = languageRangeList2.getClass();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeSpliterator10);
        org.junit.Assert.assertNotNull(languageRangeStream11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14692");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("...NCNCNCNCNCNCNCNCNCNCARRAYLIST", "iiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayList", "..italiahiit_cn..italiahiit_cn..italiahiit_cn..italiahi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...NCNCNCNCNCNCNCNCNCNCARRAYLIST" + "'", str3, "...NCNCNCNCNCNCNCNCNCNCARRAYLIST");
    }

    @Test
    public void test14693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14693");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("INGLESE (CANADA)", "hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihind (LOCALE.BUILDER,ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14694");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("EN_cauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test14695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14695");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "undaaaaaaa", 45);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("ZHCINESESuEn", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test14696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14696");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("itaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaita", 27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14697");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                              Germn", "#########################English", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               fr");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test14698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14698");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.lang.String str4 = locale2.getDisplayScript();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.util.Locale locale8 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.lang.String str11 = locale8.getDisplayCountry(locale10);
        java.util.Locale locale12 = java.util.Locale.TAIWAN;
        java.lang.String str13 = locale12.getVariant();
        java.lang.String str14 = locale8.getDisplayName(locale12);
        java.lang.String str15 = locale7.getDisplayScript(locale8);
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale locale17 = java.util.Locale.getDefault(category0);
        java.util.Locale locale18 = java.util.Locale.getDefault(category0);
        java.util.Locale locale19 = java.util.Locale.getDefault(category0);
        java.util.Locale locale20 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = locale20.getDisplayCountry(locale22);
        java.util.Locale locale24 = java.util.Locale.TAIWAN;
        java.lang.String str25 = locale24.getVariant();
        java.lang.String str26 = locale20.getDisplayName(locale24);
        java.util.Locale locale27 = locale24.stripExtensions();
        java.util.Locale.setDefault(locale24);
        java.lang.String str29 = locale24.getDisplayVariant();
        java.util.Locale.setDefault(category0, locale24);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u6587" + "'", str3, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u6587" + "'", str9, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str11, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str14, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chinois" + "'", str21, "chinois");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str23, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str26, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test14699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14699");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                Zxxxxxxxxxxxxxxxx", 350, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14700");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("               fr_ca               ", "zhcinesese$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test14701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14701");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("..ITALIAHi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iHAILATI.." + "'", str1, "iHAILATI..");
    }

    @Test
    public void test14702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14702");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5...", ".....zhcinesese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5..." + "'", str2, "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5...");
    }

    @Test
    public void test14703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14703");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("...                                     hI                                                javacinese.cineselang   ...", "I!Hchizh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                     hI                                                javacinese.cineselang   ..." + "'", str2, "...                                     hI                                                javacinese.cineselang   ...");
    }

    @Test
    public void test14704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14704");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Z", "CINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        java.lang.String[] strArray4 = null;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("\u4e2d\u6587 (ZH)", strArray3, strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587 (ZH)" + "'", str5, "\u4e2d\u6587 (ZH)");
    }

    @Test
    public void test14705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14705");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI4444444444444444444444444444444444444444444444444444444444444", "N...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI4444444444444444444444444444444444444444444444444444444444444" + "'", str2, "HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI4444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test14706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14706");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("nglais", "englTWNsTWN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14707");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean3 = languageRangeList1.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange languageRange5 = languageRangeList1.get(0);
        languageRangeList1.clear();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.parse("cnn");
        boolean boolean9 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8);
        java.util.Locale.LanguageRange languageRange12 = new java.util.Locale.LanguageRange("English");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange13 = languageRangeList8.set((int) (short) 1, languageRange12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRange5);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test14708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14708");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("..................chinois (Chine)", "", "\u6cd5\u6587\u6cd5\u570b)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..................chinois (Chine)" + "'", str3, "..................chinois (Chine)");
    }

    @Test
    public void test14709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14709");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("it                                           it          AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa", "TALIAHi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "it                                           it          AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa" + "'", str2, "it                                           it          AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa");
    }

    @Test
    public void test14710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14710");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "tRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRIAD.AE", (java.lang.CharSequence) "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14711");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ESE (tAIWAN", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hindiHindiHinclass java.lang.StringhindiHindiHin", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\u82f1\u6587\u52a0\u62ff\u5927)", charArray7);
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
    public void test14712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14712");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("ZHCINESESEaaaaaa", "HI!HI!HI!HI!HI!HI", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14713");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "N...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "n..." + "'", str1, "n...");
    }

    @Test
    public void test14714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14714");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn     ", (java.lang.CharSequence) "ARRAYLIST");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn     " + "'", charSequence2, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn     ");
    }

    @Test
    public void test14715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14715");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("CN");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.lang.String str3 = locale1.getDisplayCountry();
        boolean boolean4 = locale1.hasExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "cn");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test14716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14716");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("  China   ");
        java.lang.Class<?>[] wildcardClassArray2 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray2, "", 36, 35);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test14717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14717");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                              Germn", "ZH-tw");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              Germn" + "'", str2, "                                                                                              Germn");
    }

    @Test
    public void test14718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14718");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("chinois (Chine", "zh-cnenglh");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "nawiazh-cnnawia", 12, 252);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test14719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14719");
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.util.Locale locale4 = new java.util.Locale("");
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.lang.String str8 = locale4.getDisplayScript(locale6);
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale10);
        java.lang.String str12 = locale4.getDisplayCountry(locale10);
        java.lang.String str13 = locale2.getDisplayScript(locale4);
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.lang.String str15 = locale4.getDisplayLanguage(locale14);
        java.util.Locale locale18 = new java.util.Locale("");
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.util.Locale locale20 = java.util.Locale.CANADA;
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.lang.String str22 = locale18.getDisplayScript(locale20);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale18);
        java.lang.String str24 = locale18.getDisplayScript();
        java.lang.String str25 = locale14.getDisplayLanguage(locale18);
        java.util.Set<java.lang.String> strSet26 = locale14.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category1, locale14);
        java.util.Locale.Category category28 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale29 = java.util.Locale.getDefault(category28);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str31 = locale30.getDisplayLanguage();
        java.lang.String str32 = locale30.getDisplayScript();
        java.util.Locale.setDefault(category28, locale30);
        java.util.Locale.setDefault(category1, locale30);
        java.util.Locale locale36 = new java.util.Locale("I");
        java.lang.String str37 = locale36.getDisplayCountry();
        java.lang.String str38 = locale36.toLanguageTag();
        java.util.Locale.setDefault(locale36);
        java.lang.String str40 = locale36.getVariant();
        java.util.Locale.setDefault(category1, locale36);
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                     ArrayList", locale36);
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u82f1\u6587" + "'", str7, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "english" + "'", str11, "english");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u82f1\u6587" + "'", str21, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "a" + "'", str23, "a");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "German" + "'", str25, "German");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + category28 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category28.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u4e2d\u6587" + "'", str31, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals(locale36.toString(), "i");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "und" + "'", str38, "und");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "                                                                                     arraylist" + "'", str42, "                                                                                     arraylist");
    }

    @Test
    public void test14720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14720");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxxx", "#########################English                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14721");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("CAN", "                                                                                                                                                                                                                                                          en-CASTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN", 42);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'x');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CAN" + "'", str5, "CAN");
    }

    @Test
    public void test14722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14722");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                          EN-CASTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN", 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14723");
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
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator18 = languageRangeList13.spliterator();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeSpliterator18);
    }

    @Test
    public void test14724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14724");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, '#');
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("Cina", strMap8);
        java.lang.String[] strArray13 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.Locale.FilteringMode filteringMode16 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList17 = java.util.Locale.filterTags(languageRangeList9, (java.util.Collection<java.lang.String>) strList14, filteringMode16);
        boolean boolean18 = languageRangeList2.contains((java.lang.Object) strList14);
        java.util.Locale.LanguageRange languageRange20 = new java.util.Locale.LanguageRange("English");
        java.lang.String str21 = languageRange20.getRange();
        boolean boolean22 = languageRangeList2.add(languageRange20);
        java.lang.String str24 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) boolean22, "                                redliuB");
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + filteringMode16 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode16.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "english" + "'", str21, "english");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang" + "'", str24, "java.lang");
    }

    @Test
    public void test14725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14725");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "hi!", (int) (byte) 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("China", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "a", (int) '4', (int) ' ');
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "twn");
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray12);
        java.lang.Class[] classArray15 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray16 = (java.lang.Class<?>[]) classArray15;
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray15);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray15);
        java.lang.Class[] classArray21 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray22 = (java.lang.Class<?>[]) classArray21;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray21);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray21);
        boolean boolean25 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray15, (java.lang.Class<?>[]) classArray21);
        java.lang.Class[] classArray27 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray27);
        java.lang.Class<?> wildcardClass30 = null;
        java.lang.Class[] classArray32 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass30;
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray29, wildcardClassArray33, false);
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray39);
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray29, (java.lang.Class<?>[]) classArray39);
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray15, (java.lang.Class<?>[]) classArray39);
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray15, '#');
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
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray59);
        java.lang.String str64 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray59, "zh-CN");
        java.lang.String str68 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray59, ' ', 100, 0);
        boolean boolean70 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray53, (java.lang.Class<?>[]) classArray59, false);
        boolean boolean71 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray15, wildcardClassArray53);
        boolean boolean73 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray12, wildcardClassArray53, false);
        java.lang.Class<?>[] wildcardClassArray74 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray53);
        java.lang.Class<?>[] wildcardClassArray75 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray53);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class java.lang.Stringclass java.lang.Stringclass java.lang.String" + "'", str13, "class java.lang.Stringclass java.lang.Stringclass java.lang.String");
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(classArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray74);
        org.junit.Assert.assertNotNull(wildcardClassArray75);
    }

    @Test
    public void test14726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14726");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Engls");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String str5 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "engls" + "'", str2, "engls");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "engls" + "'", str4, "engls");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "engls" + "'", str5, "engls");
    }

    @Test
    public void test14727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14727");
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("String[]", locale1);
        java.lang.String str4 = locale1.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale1.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "string[]" + "'", str3, "string[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test14728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14728");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("liIlish", 52, "ChinesHin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ChinesHinChinesHinChinesHinChinesHinChinesHinliIlish" + "'", str3, "ChinesHinChinesHinChinesHinChinesHinChinesHinliIlish");
    }

    @Test
    public void test14729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14729");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("latiarfatilatiarfatilatiarfatilatiarfatilatiarfatilatiarfatilatiarfatilatiarfatilatiarfatilatiarfati", 2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14730");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("lang)", 747);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                   lang)                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                   lang)                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test14731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14731");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "ChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "ChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test14732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14732");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                wt                                                ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14733");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor5 = languageRangeList1.listIterator();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor5, "\u5fb7\u6587");
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) languageRangeItor5, "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccngls");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeItor5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ArrayList.ListItr" + "'", str9, "ArrayList.ListItr");
    }

    @Test
    public void test14734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14734");
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
        java.util.Locale locale59 = java.util.Locale.CANADA;
        java.util.Set<java.lang.Character> charSet60 = locale59.getExtensionKeys();
        boolean boolean61 = languageRangeList1.contains((java.lang.Object) locale59);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap62 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList63 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap62);
        org.apache.commons.lang3.ClassUtils classUtils64 = new org.apache.commons.lang3.ClassUtils();
        org.apache.commons.lang3.ClassUtils classUtils65 = new org.apache.commons.lang3.ClassUtils();
        org.apache.commons.lang3.ClassUtils[] classUtilsArray66 = new org.apache.commons.lang3.ClassUtils[] { classUtils64, classUtils65 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ClassUtils[] classUtilsArray67 = languageRangeList1.toArray(classUtilsArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
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
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_CA");
        org.junit.Assert.assertNotNull(charSet60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(languageRangeList63);
        org.junit.Assert.assertNotNull(classUtilsArray66);
    }

    @Test
    public void test14735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14735");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "BUILDER");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14736");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setVariant("china_cn                             ese(taiwan");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: china_cn                             ese(taiwan [at index 6]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test14737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14737");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("lang                                                      ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lang                                                      " + "'", str2, "lang                                                      ");
    }

    @Test
    public void test14738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14738");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihind (LOCALE.BUILDER,ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish)", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihind (LOCALE.BUILDER,ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish)" + "'", str2, "hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihind (LOCALE.BUILDER,ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish)");
    }

    @Test
    public void test14739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14739");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "Collecti");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14740");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("l", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa              !ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14741");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi! (                 A                 )", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test14742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14742");
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
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream11 = languageRangeList6.parallelStream();
        java.lang.Object[] objArray12 = languageRangeList6.toArray();
        java.lang.Object[] objArray13 = languageRangeList6.toArray();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap16 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.parse("Cina", strMap16);
        java.util.Locale.LanguageRange languageRange19 = new java.util.Locale.LanguageRange("English");
        java.lang.String str21 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange19, "");
        java.lang.String str22 = languageRange19.getRange();
        boolean boolean23 = languageRangeList17.add(languageRange19);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList17, 'x');
        boolean boolean27 = languageRangeList17.contains((java.lang.Object) "Chine");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap28 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList17, strMap28);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor30 = languageRangeList17.iterator();
        java.util.Locale.LanguageRange languageRange31 = languageRangeItor30.next();
        java.lang.String str32 = languageRange31.getRange();
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList6.add(1, languageRange31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(languageRangeStream11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Locale.LanguageRange" + "'", str21, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "english" + "'", str22, "english");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(languageRangeList29);
        org.junit.Assert.assertNotNull(languageRangeItor30);
        org.junit.Assert.assertNotNull(languageRange31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "cina" + "'", str32, "cina");
    }

    @Test
    public void test14743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14743");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("DE       ", (int) (byte) 0, 13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DE       " + "'", str3, "DE       ");
    }

    @Test
    public void test14744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14744");
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
        languageRangeList4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange19 = languageRangeList4.remove((int) '$');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 36, Size: 0");
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
    }

    @Test
    public void test14745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14745");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("44444444444444444444laEg                                                      444444444444444444444", "\u4e2d\u6587\u53f0\u7063)", "...X.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN...", 350);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444laEg                                                      444444444444444444444" + "'", str4, "44444444444444444444laEg                                                      444444444444444444444");
    }

    @Test
    public void test14746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14746");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean9 = languageRangeList7.remove((java.lang.Object) "English");
        boolean boolean10 = languageRangeList1.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        int int11 = languageRangeList7.size();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange13 = languageRangeList7.get(36);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 36, Size: 1");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test14747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14747");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("java.lang (CHINES)", "                                                                                                                                                                                                                                                          en-CASTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14748");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\u30d2\u30f3\u30c7\u30a3\u30fc\u8a9e (HI!,cHINA)", "e!e(Tiiwin                                                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14749");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("\u5357\u97d3\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fdAD");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u5357\u97d3\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fdAD" + "'", str1, "\u5357\u97d3\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fdAD");
    }

    @Test
    public void test14750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14750");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("fr", "\u4e2d\u6587\u53f0\u7063)", 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hindi (HI!,cHINA)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test14751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14751");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\u4e2d\u6587\u4e2d\u570b)", "nch(France)xxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test14752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14752");
        java.util.Locale locale1 = java.util.Locale.TAIWAN;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("", locale1);
        java.lang.String str3 = locale1.getISO3Country();
        java.lang.String str5 = locale1.getExtension('x');
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TWN" + "'", str3, "TWN");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test14753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14753");
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
        java.util.Locale locale59 = java.util.Locale.CANADA;
        java.util.Set<java.lang.Character> charSet60 = locale59.getExtensionKeys();
        boolean boolean61 = languageRangeList1.contains((java.lang.Object) locale59);
        java.util.Set<java.lang.String> strSet62 = locale59.getUnicodeLocaleKeys();
        java.lang.String str63 = locale59.getLanguage();
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
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_CA");
        org.junit.Assert.assertNotNull(charSet60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "en" + "'", str63, "en");
    }

    @Test
    public void test14754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14754");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "in", "hsilgnE#########################");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test14755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14755");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("zaachi...zaa.", 745, 47);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zaachi...zaa." + "'", str3, "zaachi...zaa.");
    }

    @Test
    public void test14756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14756");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".....", "cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 46);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaadnu", strArray1, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '4', 21, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaadnu" + "'", str6, "aaaaaaadnu");
    }

    @Test
    public void test14757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14757");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch", 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str4, "AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test14758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14758");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("undaaaaaaaH", "ZHCINES", 350);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14759");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "44444444EnglTWNsTWN44444444", (java.lang.CharSequence) "###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14760");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("i", "ChinesHinChinesHinChinesHinChinesHinChinesHinliIlish");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test14761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14761");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                zH                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                zH                " + "'", str1, "                zH                ");
    }

    @Test
    public void test14762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14762");
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
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator16 = languageRangeList1.spliterator();
        languageRangeList1.clear();
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor18 = languageRangeList1.iterator();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator19 = languageRangeList1.spliterator();
        languageRangeList1.clear();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeSpliterator16);
        org.junit.Assert.assertNotNull(languageRangeItor18);
        org.junit.Assert.assertNotNull(languageRangeSpliterator19);
    }

    @Test
    public void test14763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14763");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Collections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetI!HI!HI!HENGLISH", "\u4e2d\u56fdAD.AE.AF", 46);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test14764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14764");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("zhcines", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator5 = languageRangeList2.spliterator();
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
        java.util.List<java.lang.Class<?>> wildcardClassList36 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList30);
        java.util.List<java.lang.Class<?>> wildcardClassList37 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList30);
        java.util.List<java.lang.Class<?>> wildcardClassList38 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList30);
        java.util.List<java.lang.Class<?>> wildcardClassList39 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList30);
        java.lang.String str40 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strList30);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange42 = languageRangeList2.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
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
        org.junit.Assert.assertNotNull(wildcardClassList36);
        org.junit.Assert.assertNotNull(wildcardClassList37);
        org.junit.Assert.assertNotNull(wildcardClassList38);
        org.junit.Assert.assertNotNull(wildcardClassList39);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test14765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14765");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("iaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaia", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: iaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaia");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14766");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "fraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayList");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test14767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14767");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("fraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayList");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayList" + "'", str1, "fraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayList");
    }

    @Test
    public void test14768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14768");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("italiano", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italiano" + "'", str3, "italiano");
    }

    @Test
    public void test14769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14769");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FR" + "'", str1, "FR");
    }

    @Test
    public void test14770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14770");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "       hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test14771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14771");
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
        java.util.Locale locale18 = java.util.Locale.JAPANESE;
        java.util.Locale locale20 = new java.util.Locale("");
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.util.Locale locale22 = java.util.Locale.CANADA;
        java.lang.String str23 = locale22.getDisplayLanguage();
        java.lang.String str24 = locale20.getDisplayScript(locale22);
        java.lang.String str25 = locale22.getDisplayVariant();
        java.util.Locale locale26 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale26.getDisplayCountry(locale27);
        java.lang.String str29 = locale27.getDisplayVariant();
        java.lang.String str30 = locale22.getDisplayScript(locale27);
        java.lang.String str31 = locale22.getScript();
        java.lang.String str32 = locale18.getDisplayVariant(locale22);
        java.util.Set<java.lang.String> strSet33 = locale18.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category0, locale18);
        java.util.Locale locale35 = java.util.Locale.getDefault(category0);
        java.lang.String str36 = locale35.getISO3Country();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English" + "'", str6, "English");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "i");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "China" + "'", str13, "China");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "i");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "i");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ja");
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "English" + "'", str23, "English");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "i");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "China" + "'", str28, "China");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test14772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14772");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\u5370\u5ea6\u6587");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u5370\u5ea6\u6587" + "'", str1, "\u5370\u5ea6\u6587");
    }

    @Test
    public void test14773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14773");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hI", (java.lang.CharSequence) "\u7063\u53f0\u6587\u4e2d");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hI" + "'", charSequence2, "hI");
    }

    @Test
    public void test14774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14774");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("liIlish", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test14775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14775");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("CHINOIS (CHINE)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "xxANIHCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "n...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test14776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14776");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale2.getUnicodeLocaleType("CHINOIS(CHINE)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: CHINOIS(CHINE)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test14777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14777");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test14778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14778");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("english");
        java.util.Locale locale8 = builder7.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setScript("\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587                                                                                                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script:                                                                                                                                                                           L?? (??)??                                                                                                                                                                           [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "english");
    }

    @Test
    public void test14779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14779");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5...4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14780");
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
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor19, '$');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange22 = languageRangeItor19.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
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
        org.junit.Assert.assertNotNull(languageRangeItor19);
    }

    @Test
    public void test14781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14781");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("         fr-FR         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr-FR" + "'", str1, "fr-FR");
    }

    @Test
    public void test14782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14782");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("eNGLIILISH", "italienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalien");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eNGLIILISH" + "'", str2, "eNGLIILISH");
    }

    @Test
    public void test14783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14783");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("can", "\u4e2d\u6587", 36);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("ArrayList", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("ANIHC      ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test14784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14784");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("GNAL.AVAJ", 46, "Italian (Italy)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GNAL.AVAJItalian (Italy)Italian (Italy)Italian" + "'", str3, "GNAL.AVAJItalian (Italy)Italian (Italy)Italian");
    }

    @Test
    public void test14785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14785");
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
        java.lang.String str11 = locale10.getDisplayName();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese (JA)" + "'", str11, "Chinese (JA)");
    }

    @Test
    public void test14786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14786");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("cINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA", "aa.ab.ae.af.ak.am.an.ar.as.av.ay.az.ba.be.bg.bh.bi.bm.bn.bo.br.bs.ca.ce.ch.co.cr.cs.cu.cv.cy.da.de.dv.dz.ee.el.en.eo.es.et.eu.fa.ff.fi.fj.fo.fr.fy.ga.gd.gl.gn.gu.gv.ha.he.hi.ho.hr.ht.hu.hy.hz.ia.id.ie.ig.ii.ik.in.io.is.it.iu.iw.ja.ji.jv.ka.kg.ki.kj.kk.kl.km.kn.ko.kr.ks.ku.kv.kw.ky.la.lb.lg.li.ln.lo.lt.lu.lv.mg.mh.mi.mk.ml.mn.mo.mr.ms.mt.my.na.nb.nd.ne.ng.nl.nn.no.nr.nv.ny.oc.oj.om.or.os.pa.pi.pl.ps.pt.qu.rm.rn.ro.ru.rw.sa.sc.sd.se.sg.si.sk.sl.sm.sn.so.sq.sr.ss.st.su.sv.sw.ta.te.tg.th.ti.tk.tl.tn.to.tr.ts.tt.tw.ty.ug.uk.ur.uz.ve.vi.vo.wa.wo.xh.yi.yo.za.zh.zu", (int) '#');
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("ZH_TW", strArray5);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("EnglTWNsTWN", "....english", (int) (short) 0);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("hi", "iiiiiiiiiiiiiiiiiiiiiiiArrayList");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("english", strArray12, strArray15);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\u4e2d\u6587");
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray19, "engliIlishenglcinese (Cina)");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("china (China)", strArray15, strArray19);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaCharacteraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray5, strArray15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "english" + "'", str16, "english");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "cCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina (CCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina)" + "'", str22, "cCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina (CCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaCharacteraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str23, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaCharacteraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test14787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14787");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "            )ANIHc,!IH(idni");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            )ANIHc,!IH(idni" + "'", str1, "            )ANIHc,!IH(idni");
    }

    @Test
    public void test14788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14788");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                   .");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".                                                                                                   " + "'", str1, ".                                                                                                   ");
    }

    @Test
    public void test14789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14789");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "        ", "t                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test14790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14790");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("nch(France)xxxxxxxxxx", "                                ese(Taiwan", 186);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nch(France)xxxxxxxxxx" + "'", str3, "nch(France)xxxxxxxxxx");
    }

    @Test
    public void test14791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14791");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("cines");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cines" + "'", str1, "cines");
    }

    @Test
    public void test14792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14792");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\u56fd\u4e2d\u6587\u4e2d   ", "AD.AE.AF.A", 117, 990);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u56fd\u4e2d\u6587\u4e2d   AD.AE.AF.A" + "'", str4, "\u56fd\u4e2d\u6587\u4e2d   AD.AE.AF.A");
    }

    @Test
    public void test14793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14793");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("undaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaH", "rance)Italiuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "ahpanesexxxxxxxxxxxxxxah");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaH" + "'", str3, "undaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaH");
    }

    @Test
    public void test14794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14794");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ENGLTWNSTWN", "\u0939\u093f\u0902\u0926\u0940", 15);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test14795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14795");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ita");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ita");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14796");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ZHCINESESuEn", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test14797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14797");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "undaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test14798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14798");
        java.util.Locale locale2 = new java.util.Locale("zho", "US");
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getLanguage();
        java.lang.String str6 = locale3.toLanguageTag();
        java.util.Set<java.lang.String> strSet7 = locale3.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr-CA" + "'", str6, "fr-CA");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test14799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14799");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str1, "\u82f1\u6587\u7f8e\u570b)");
    }

    @Test
    public void test14800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14800");
        java.util.Locale locale3 = new java.util.Locale("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "germn", "cnn");
        org.junit.Assert.assertEquals(locale3.toString(), "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h_GERMN_cnn");
    }

    @Test
    public void test14801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14801");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("EN-CASTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EN-CASTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN" + "'", str1, "EN-CASTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN");
    }

    @Test
    public void test14802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14802");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.setRegion("zh");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setVariant("itaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaita");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: itaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaita [at index 0]");
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
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test14803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14803");
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
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray13);
        java.lang.Class<?> wildcardClass16 = null;
        java.lang.Class[] classArray18 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        wildcardClassArray19[0] = wildcardClass16;
        boolean boolean23 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray19, false);
        java.lang.Class[] classArray25 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray25);
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, (java.lang.Class<?>[]) classArray25);
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray1, (java.lang.Class<?>[]) classArray25);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray25);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray25);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray31);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray32);
        java.lang.String str35 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray33, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Englisch (Kanada)$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Class[]" + "'", str35, "Class[]");
    }

    @Test
    public void test14804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14804");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("IIIIIIIIIIIIIIIIIIIIIIISTRINGIIIIIIIIIIIIIIIIIIIIIII", "                                                                                                                                                                                                                                                          EN-CASTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14805");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("cines");
    }

    @Test
    public void test14806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14806");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14807");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("EN_CAEN_CA_EN_CAA", "china-CN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14808");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("english", "zaachi...zaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "english" + "'", str2, "english");
    }

    @Test
    public void test14809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14809");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("################################################################################################################lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test14810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14810");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AI", "zhcinesese", 42);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test14811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14811");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "cinaxxxxxcNn", "T");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14812");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("XXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXX");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test14813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14813");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("fraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayList", "HARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLIST", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayList" + "'", str3, "fraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayList");
    }

    @Test
    public void test14814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14814");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "acoLncncncn", "hi-cHINA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14815");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "I##################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14816");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engl" + "'", str1, "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engl");
    }

    @Test
    public void test14817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14817");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 10, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test14818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14818");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("                                                tw                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test14819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14819");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...X.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN..._italiano", "english");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14820");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "cncn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test14821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14821");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("fr-CA", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream8 = languageRangeList4.stream();
        boolean boolean9 = languageRangeList4.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, strMap13);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor15 = languageRangeList14.listIterator();
        boolean boolean16 = languageRangeList4.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14);
        java.lang.String str18 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) languageRangeList14, "Chinese");
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Chin", "english");
        boolean boolean23 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                    ", strArray22);
        boolean boolean24 = languageRangeList14.equals((java.lang.Object) strArray22);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream25 = languageRangeList14.parallelStream();
        boolean boolean27 = languageRangeList14.remove((java.lang.Object) "A");
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap31 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, strMap31);
        int int33 = languageRangeList29.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean37 = languageRangeList35.remove((java.lang.Object) "English");
        boolean boolean38 = languageRangeList29.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35);
        java.util.Locale.LanguageRange languageRange40 = new java.util.Locale.LanguageRange("English");
        java.lang.String str41 = languageRange40.getRange();
        boolean boolean42 = languageRangeList35.add(languageRange40);
        double double43 = languageRange40.getWeight();
        boolean boolean44 = languageRangeList14.add(languageRange40);
        boolean boolean45 = languageRangeList2.add(languageRange40);
        java.lang.Object[] objArray46 = languageRangeList2.toArray();
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator47 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList2.replaceAll(languageRangeUnaryOperator47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.util" + "'", str18, "java.util");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(languageRangeStream25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(languageRangeList35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "english" + "'", str41, "english");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test14822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14822");
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Locale locale2 = java.util.Locale.JAPANESE;
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("", locale4);
        java.lang.String str6 = locale2.getDisplayVariant(locale4);
        java.util.Set<java.lang.Character> charSet7 = locale4.getExtensionKeys();
        java.util.Set<java.lang.String> strSet8 = locale4.getUnicodeLocaleAttributes();
        java.util.Locale locale11 = new java.util.Locale("ahi!hi!", "                 a                 ");
        java.lang.String str12 = locale4.getDisplayScript(locale11);
        java.lang.String str13 = locale1.getDisplayName(locale4);
        java.lang.String str15 = locale4.getExtension('u');
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale.Builder builder19 = builder17.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder21 = builder19.setLanguage("CHINA");
        java.util.Locale locale22 = builder19.build();
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleKeys();
        java.lang.String str24 = locale22.getDisplayCountry();
        java.lang.String str25 = locale22.getScript();
        java.util.Locale locale28 = java.util.Locale.forLanguageTag("FR");
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.lowerCase("EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S", locale28);
        java.lang.String str30 = locale22.getDisplayName(locale28);
        java.lang.String str31 = locale4.getDisplayLanguage(locale28);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.lowerCase("", locale4);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ja");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals(locale11.toString(), "ahi!hi!_                 A                 ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587" + "'", str13, "\u4e2d\u6587");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "china_CN");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "China" + "'", str24, "China");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "englhi!string[]string[]sshi!string[]string[]s" + "'", str29, "englhi!string[]string[]sshi!string[]string[]s");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "china (Chine)" + "'", str30, "china (Chine)");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "chinois" + "'", str31, "chinois");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test14823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14823");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchnxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchnxxxxxxxxxxxxxxxxxxxxxxxxxnglais", "zaa.ab.ae.af.ak.am.an.ar.as.av.ay.az.ba.be.bg.bh.bi.bm.bn.bo.br.bs.ca.ce.ch.co.cr.cs.cu.cv.cy.da.de.dv.dz.ee.el.en.eo.es.et.eu.fa.ff.fi.fj.fo.fr.fy.ga.gd.gl.gn.gu.gv.ha.he.hi.ho.hr.ht.hu.hy.hz.ia.id.ie.ig.ii.ik.in.io.is.it.iu.iw.ja.ji.jv.ka.kg.ki.kj.kk.kl.km.kn.ko.kr.ks.ku.kv.kw.ky.la.lb.lg.li.ln.lo.lt.lu.lv.mg.mh.mi.mk.ml.mn.mo.mr.ms.mt.my.na.nb.nd.ne.ng.nl.nn.no.nr.nv.ny.oc.oj.om.or.os.pa.pi.pl.ps.pt.qu.rm.rn.ro.ru.rw.sa.sc.sd.se.sg.si.sk.sl.sm.sn.so.sq.sr.ss.st.su.sv.sw.ta.te.tg.th.ti.tk.tl.tn.to.tr.ts.tt.tw.ty.ug.uk.ur.uz.ve.vi.vo.wa.wo.xh.yi.yo.za.zh.zu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14824");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    Z", "HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14825");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setUnicodeLocaleKeyword("ese (Taiwan", "\u4e2d\u6587\u4e2d\u570b)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ese (Taiwan [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test14826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14826");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("            locale.builder             ", "\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliIlish)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14827");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("ZXXXXXXXXXXXXXXXXXXX");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ZXXXXXXXXXXXXXXXXXXX" + "'", str1, "ZXXXXXXXXXXXXXXXXXXX");
    }

    @Test
    public void test14828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14828");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "inglese (Canada)", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("United State", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14829");
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
        java.lang.Object[] objArray38 = languageRangeList13.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList40 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean42 = languageRangeList40.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange languageRange44 = languageRangeList40.get(0);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor45 = languageRangeList40.listIterator();
        java.util.Locale.LanguageRange languageRange46 = languageRangeItor45.next();
        java.lang.String str47 = languageRange46.getRange();
        int int48 = languageRangeList13.indexOf((java.lang.Object) languageRange46);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor49 = languageRangeList13.iterator();
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
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(languageRangeList40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(languageRange44);
        org.junit.Assert.assertNotNull(languageRangeItor45);
        org.junit.Assert.assertNotNull(languageRange46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi" + "'", str47, "hi");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(languageRangeItor49);
    }

    @Test
    public void test14830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14830");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]", 97, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]" + "'", str3, " L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]  ! L SS[]");
    }

    @Test
    public void test14831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14831");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("boolean", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14832");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("\u5951\u52aa\u514b\u6587");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u5951\u52aa\u514b\u6587" + "'", str1, "\u5951\u52aa\u514b\u6587");
    }

    @Test
    public void test14833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14833");
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
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream80 = languageRangeList75.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange82 = languageRangeList75.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "China" + "'", str39, "China");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "zh-CN" + "'", str40, "zh-CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
// flaky:         org.junit.Assert.assertEquals(locale42.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "China" + "'", str43, "China");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
// flaky:         org.junit.Assert.assertEquals(locale45.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "China" + "'", str46, "China");
        org.junit.Assert.assertEquals(locale50.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "hi_HI!_cHINA");
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
        org.junit.Assert.assertNotNull(languageRangeStream80);
    }

    @Test
    public void test14834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14834");
        java.util.Locale locale3 = new java.util.Locale("italiahI", "rglAsA", "ZHCINESESEaaaaaa");
        java.lang.String str4 = locale3.getDisplayCountry();
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale3.getUnicodeLocaleType("ChinChinChinChinChinChinChinChinChinaaaaaaaaa$                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ChinChinChinChinChinChinChinChinChinaaaaaaaaa$                                                    ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "italiahi_RGLASA_ZHCINESESEaaaaaa");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RGLASA" + "'", str4, "RGLASA");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test14835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14835");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                 ITALIAHi                 ", "util");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14836");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English");
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange1, "");
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange5, languageRange7 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor11 = languageRangeList9.listIterator();
        languageRangeList9.clear();
        java.lang.Object[] objArray13 = languageRangeList9.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator14 = languageRangeList9.spliterator();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream15 = languageRangeList9.stream();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Locale.LanguageRange" + "'", str3, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(languageRangeItor11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(languageRangeSpliterator14);
        org.junit.Assert.assertNotNull(languageRangeStream15);
    }

    @Test
    public void test14837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14837");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test14838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14838");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.setRegion("zh");
        java.util.Locale locale6 = builder1.build();
        java.util.Locale locale7 = java.util.Locale.CANADA;
        boolean boolean8 = locale7.hasExtensions();
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str10 = locale7.getDisplayScript(locale9);
        java.util.Set<java.lang.String> strSet11 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale7.getVariant();
        java.lang.String str13 = locale6.getDisplayCountry(locale7);
        java.util.Locale.setDefault(locale6);
        java.lang.String str15 = locale6.getISO3Language();
        boolean boolean16 = locale6.hasExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_ZH");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ZH" + "'", str13, "ZH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zho" + "'", str15, "zho");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test14839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14839");
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
        java.util.Locale.LanguageRange languageRange30 = new java.util.Locale.LanguageRange("English");
        java.lang.String str32 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange30, "");
        java.util.Locale.LanguageRange languageRange34 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange36 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] { languageRange30, languageRange34, languageRange36 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor40 = languageRangeList38.listIterator();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator41 = languageRangeList38.spliterator();
        boolean boolean42 = languageRangeList6.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap43 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList44 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap43);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap45);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor47 = languageRangeList6.listIterator();
        java.lang.Object[] objArray48 = languageRangeList6.toArray();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_ZH");
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Locale.LanguageRange" + "'", str32, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(languageRangeItor40);
        org.junit.Assert.assertNotNull(languageRangeSpliterator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(languageRangeList44);
        org.junit.Assert.assertNotNull(languageRangeList46);
        org.junit.Assert.assertNotNull(languageRangeItor47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
    }

    @Test
    public void test14840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14840");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("GNAL.AVAJSTRING", 18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14841");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                    ", "zh-CN", 42);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.endsWithAny("Engls", strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!STRING[]STRING[]S", strArray7, strArray12);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u4e2d\u6587\u4e2d\u56fd)", "zh-CNnglese");
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.stripAll(strArray22);
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.stripAll(strArray22);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny("Collections.EmptySet", strArray22);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEach("\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliIlish", strArray18, strArray22);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CTWzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-", strArray12, strArray18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!STRING[]STRING[]S" + "'", str14, "HI!STRING[]STRING[]S");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliIlish" + "'", str26, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliIlish");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CTWzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-" + "'", str27, "zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CTWzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-");
    }

    @Test
    public void test14842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14842");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HINA", "#####################################################################################################################################################################################################################################################################################################################################hi!italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital..#####################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14843");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("en", "rglAsA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en" + "'", str2, "en");
    }

    @Test
    public void test14845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14845");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName(obj0, "uuuuuxxxxxxxxxxxxxxJ$p$nesexxxxxxxxxxxxxxuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuxxxxxxxxxxxxxxJ$p$nesexxxxxxxxxxxxxxuuuuu" + "'", str2, "uuuuuxxxxxxxxxxxxxxJ$p$nesexxxxxxxxxxxxxxuuuuu");
    }

    @Test
    public void test14846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14846");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                  HINDI (HI!,CHINA)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                  HINDI (HI!,CHINA)" + "'", str1, "                                                                                  HINDI (HI!,CHINA)");
    }

    @Test
    public void test14847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14847");
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
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean29 = languageRangeList27.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange languageRange31 = languageRangeList27.get(0);
        java.util.Locale locale32 = java.util.Locale.JAPANESE;
        java.util.Locale locale34 = new java.util.Locale("");
        java.lang.String str35 = locale34.getDisplayLanguage();
        java.util.Locale locale36 = java.util.Locale.CANADA;
        java.lang.String str37 = locale36.getDisplayLanguage();
        java.lang.String str38 = locale34.getDisplayScript(locale36);
        java.lang.String str39 = locale36.getDisplayVariant();
        java.util.Locale locale40 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale41 = java.util.Locale.getDefault();
        java.lang.String str42 = locale40.getDisplayCountry(locale41);
        java.lang.String str43 = locale41.getDisplayVariant();
        java.lang.String str44 = locale36.getDisplayScript(locale41);
        java.lang.String str45 = locale36.getScript();
        java.lang.String str46 = locale32.getDisplayVariant(locale36);
        java.util.Locale locale47 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str48 = locale47.getDisplayLanguage();
        java.util.Locale locale49 = java.util.Locale.getDefault();
        java.lang.String str50 = locale47.getDisplayCountry(locale49);
        java.util.Locale locale51 = java.util.Locale.TAIWAN;
        java.lang.String str52 = locale51.getVariant();
        java.lang.String str53 = locale47.getDisplayName(locale51);
        java.util.Locale locale54 = locale47.stripExtensions();
        java.lang.String str55 = locale32.getDisplayName(locale54);
        boolean boolean56 = languageRangeList27.equals((java.lang.Object) locale32);
        java.lang.String str57 = locale24.getDisplayName(locale32);
        java.lang.String str58 = locale32.getCountry();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList60 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray61 = languageRangeList60.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator62 = languageRangeList60.spliterator();
        java.util.Locale.Builder builder63 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder64 = builder63.clearExtensions();
        java.util.Locale.Builder builder66 = builder64.setLanguageTag("zh-CN");
        java.util.Locale locale67 = builder64.build();
        boolean boolean68 = languageRangeList60.remove((java.lang.Object) locale67);
        java.lang.String str69 = locale67.getDisplayName();
        java.lang.String str70 = locale67.getISO3Country();
        java.util.Locale locale71 = locale67.stripExtensions();
        java.util.Locale locale72 = java.util.Locale.ITALIAN;
        java.util.Locale locale74 = new java.util.Locale("");
        java.lang.String str75 = locale74.getDisplayLanguage();
        java.util.Locale locale76 = java.util.Locale.CANADA;
        java.lang.String str77 = locale76.getDisplayLanguage();
        java.lang.String str78 = locale74.getDisplayScript(locale76);
        java.util.Locale locale80 = java.util.Locale.FRANCE;
        java.lang.String str81 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale80);
        java.lang.String str82 = locale74.getDisplayCountry(locale80);
        java.lang.String str83 = locale72.getDisplayScript(locale74);
        java.lang.String str84 = locale71.getDisplayLanguage(locale74);
        java.util.Locale locale86 = new java.util.Locale("ArrayList###########");
        java.lang.String str87 = locale71.getDisplayLanguage(locale86);
        java.lang.String str88 = locale32.getDisplayScript(locale71);
        java.lang.String str89 = locale71.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str91 = locale71.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd" + "'", str2, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u82f1\u6587" + "'", str10, "\u82f1\u6587");
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
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(languageRange31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ja");
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u82f1\u6587" + "'", str37, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u4e2d\u56fd" + "'", str42, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\u4e2d\u6587" + "'", str48, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str50, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str53, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\u65e5\u6587" + "'", str55, "\u65e5\u6587");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "....english (ZHCINESESE,.)" + "'", str57, "....english (ZHCINESESE,.)");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(languageRangeList60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(languageRangeSpliterator62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str69, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "CHN" + "'", str70, "CHN");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "it");
        org.junit.Assert.assertEquals(locale74.toString(), "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "\u82f1\u6587" + "'", str77, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "english" + "'", str81, "english");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Chinese" + "'", str84, "Chinese");
        org.junit.Assert.assertEquals(locale86.toString(), "arraylist###########");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Chinese" + "'", str87, "Chinese");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
// flaky:         org.junit.Assert.assertEquals("'" + str89 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str89, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test14848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14848");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("germn", "CN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14849");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean3 = languageRangeList1.remove((java.lang.Object) "English");
        int int5 = languageRangeList1.indexOf((java.lang.Object) "][gnirts");
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
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor22 = languageRangeList21.listIterator();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.util.Locale locale31 = java.util.Locale.FRANCE;
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale31);
        java.util.Locale locale33 = java.util.Locale.US;
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale36 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.lang.String str38 = locale36.getDisplayCountry(locale37);
        java.lang.String str39 = locale36.toLanguageTag();
        java.util.Locale locale40 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale41 = java.util.Locale.getDefault();
        java.lang.String str42 = locale40.getDisplayCountry(locale41);
        java.util.Locale locale43 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale44 = java.util.Locale.getDefault();
        java.lang.String str45 = locale43.getDisplayCountry(locale44);
        java.util.Locale locale49 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale50 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale51 = java.util.Locale.getDefault();
        java.lang.String str52 = locale50.getDisplayCountry(locale51);
        java.util.Locale locale54 = new java.util.Locale("");
        java.lang.String str55 = locale54.getDisplayVariant();
        java.util.Locale locale56 = java.util.Locale.KOREAN;
        java.util.Locale locale58 = new java.util.Locale("");
        java.util.Locale locale59 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray60 = new java.util.Locale[] { locale31, locale33, locale34, locale35, locale36, locale41, locale43, locale49, locale51, locale54, locale56, locale58, locale59 };
        java.util.ArrayList<java.util.Locale> localeList61 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList61, localeArray60);
        java.util.List<java.util.Locale> localeList63 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.util.Locale>) localeList61);
        java.lang.String[] strArray71 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList72 = new java.util.ArrayList<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList72, strArray71);
        java.util.List<java.lang.Class<?>> wildcardClassList74 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList72);
        java.util.Locale.FilteringMode filteringMode75 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList76 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strList72, filteringMode75);
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags(languageRangeList21, (java.util.Collection<java.lang.String>) strList25, filteringMode75);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor78 = languageRangeList21.listIterator();
        java.lang.String str80 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor78, "Chin");
        boolean boolean81 = languageRangeList13.equals((java.lang.Object) languageRangeItor78);
        boolean boolean82 = languageRangeList13.isEmpty();
        boolean boolean83 = languageRangeList1.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream84 = languageRangeList1.stream();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
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
        org.junit.Assert.assertNotNull(languageRangeItor22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "english" + "'", str32, "english");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\u4e2d\u56fd" + "'", str38, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "zh-CN" + "'", str39, "zh-CN");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u4e2d\u56fd" + "'", str42, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\u4e2d\u56fd" + "'", str45, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale49.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\u4e2d\u56fd" + "'", str52, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "ko");
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(localeList63);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(wildcardClassList74);
        org.junit.Assert.assertTrue("'" + filteringMode75 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode75.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(languageRangeItor78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(languageRangeStream84);
    }

    @Test
    public void test14850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14850");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, strMap5);
        int int7 = languageRangeList3.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean11 = languageRangeList9.remove((java.lang.Object) "English");
        boolean boolean12 = languageRangeList3.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray20);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.stripAll(strArray21);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray17, strArray21);
        boolean boolean24 = languageRangeList3.equals((java.lang.Object) strArray21);
        char[] charArray34 = new char[] { '#', '#', ' ' };
        boolean boolean35 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray34);
        boolean boolean36 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray34);
        boolean boolean37 = org.apache.commons.lang3.StringUtils.containsAny("China", charArray34);
        boolean boolean38 = org.apache.commons.lang3.StringUtils.containsAny("", charArray34);
        int int39 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "LOCLE.LNGUGERNGE", charArray34);
        int int40 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray34);
        boolean boolean41 = languageRangeList3.equals((java.lang.Object) charArray34);
        int int42 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiistringiiiiiiiiiiiiiiiiiiiiiii", charArray34);
        boolean boolean43 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "friFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfricines                                                                                                                                                                                                                                                                                  friFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfri", charArray34);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str23, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[#, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test14851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14851");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.setLanguage("Engls");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder8.addUnicodeLocaleAttribute("loca");
        java.util.Locale.Builder builder13 = builder11.setScript("xxxx");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder11.setVariant("Chinesisch (China)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: Chinesisch (China) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test14852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14852");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("en_CA", (int) 'x');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14853");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("$$$$", "                                        f   ch", 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$$$$" + "'", str3, "$$$$");
    }

    @Test
    public void test14854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14854");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "I!HchinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HchinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14855");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder15.setScript("AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u56fd" + "'", str8, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test14856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14856");
        java.util.Locale locale3 = new java.util.Locale("collecti", "ChinChinChinChinChiChinChinChinChinC", "en-c...");
        org.junit.Assert.assertEquals(locale3.toString(), "collecti_CHINCHINCHINCHINCHICHINCHINCHINCHINC_en-c...");
    }

    @Test
    public void test14857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14857");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafr", "ol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14858");
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
        java.lang.Object[] objArray21 = languageRangeList15.toArray();
        java.lang.Object[] objArray22 = languageRangeList15.toArray();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap24 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.parse("Cina", strMap24);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap26 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList25, strMap26);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap31 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, strMap31);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor33 = languageRangeList32.listIterator();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
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
        java.lang.String[] strArray82 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList83 = new java.util.ArrayList<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList83, strArray82);
        java.util.List<java.lang.Class<?>> wildcardClassList85 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList83);
        java.util.Locale.FilteringMode filteringMode86 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.lang.String>) strList83, filteringMode86);
        java.util.List<java.lang.String> strList88 = java.util.Locale.filterTags(languageRangeList32, (java.util.Collection<java.lang.String>) strList36, filteringMode86);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor89 = languageRangeList32.listIterator();
        int int90 = languageRangeList32.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList92 = java.util.Locale.LanguageRange.parse("HI");
        boolean boolean93 = languageRangeList32.equals((java.lang.Object) languageRangeList92);
        boolean boolean95 = languageRangeList32.remove((java.lang.Object) "....english (ZHCINESESE,.)");
        boolean boolean96 = languageRangeList25.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32);
        boolean boolean97 = languageRangeList15.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap98 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList99 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList32, strMap98);
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
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertNotNull(languageRangeItor33);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
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
        org.junit.Assert.assertEquals(locale48.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\u4e2d\u56fd" + "'", str49, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "zh-CN" + "'", str50, "zh-CN");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\u4e2d\u56fd" + "'", str53, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\u4e2d\u56fd" + "'", str56, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale60.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\u4e2d\u56fd" + "'", str63, "\u4e2d\u56fd");
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
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(wildcardClassList85);
        org.junit.Assert.assertTrue("'" + filteringMode86 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode86.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertNotNull(strList88);
        org.junit.Assert.assertNotNull(languageRangeItor89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNotNull(languageRangeList92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertNotNull(languageRangeList99);
    }

    @Test
    public void test14859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14859");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("REFERENCEPIPELINE.HEAD                        ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test14860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14860");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\u65e5", (java.lang.CharSequence) "N       A                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14861");
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
        java.util.Locale locale18 = new java.util.Locale("zho", "US");
        java.util.Locale locale19 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str20 = locale18.getDisplayVariant(locale19);
        java.lang.String str21 = locale19.getVariant();
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.upperCase("AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", locale19);
        java.lang.String str23 = locale19.getCountry();
        java.lang.String str24 = locale1.getDisplayLanguage(locale19);
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder25.clearExtensions();
        java.util.Locale locale27 = builder25.build();
        java.lang.String str28 = locale27.getDisplayName();
        java.lang.String str29 = locale19.getDisplayVariant(locale27);
        java.util.Locale locale31 = new java.util.Locale("    cn    ");
        java.lang.String str32 = locale19.getDisplayLanguage(locale31);
        java.lang.String str33 = locale19.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u82f1\u6587" + "'", str6, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "english" + "'", str10, "english");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CHINA" + "'", str13, "CHINA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale18.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW" + "'", str22, "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "CA" + "'", str23, "CA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "italien" + "'", str24, "italien");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals(locale31.toString(), "    cn    ");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "French" + "'", str32, "French");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "CA" + "'", str33, "CA");
    }

    @Test
    public void test14862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14862");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("arraylist###########", "                                                wt                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                wt                                                " + "'", str2, "                                                wt                                                ");
    }

    @Test
    public void test14863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14863");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "china_CN                             ese(Taiwan");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14864");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ithi!lihi!no", "italiano (CI_A)", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test14865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14865");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("deu########################################", "                                                                                                   .", 746);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test14866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14866");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\u5317\u5370\u5ea6\u6587", 0, "44444444444444444444444444444444444chinChin (HI!,cHINA44444444444444444444444444444444444chinChin (HI!,cHINA44444444444444444444444444444444444chinChin (HI!,cHINA44444444444444444444444444444444444chinChin (HI!,cHINA44444444444444444444444444444444444chinChin (HI!,cHINA44444444444444444444444444444444444chinChin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u5317\u5370\u5ea6\u6587" + "'", str3, "\u5317\u5370\u5ea6\u6587");
    }

    @Test
    public void test14867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14867");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("jAPA", "zh-ZH", (int) 'u');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14868");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "COLLECTI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14869");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("java . lang", "cinese (Cina)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14870");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("fran\347ais", "HINDI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14871");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        java.util.Locale.Builder builder5 = builder1.removeUnicodeLocaleAttribute("English");
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale7);
        java.lang.String str9 = locale7.getDisplayScript();
        java.util.Set<java.lang.String> strSet10 = locale7.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder11 = builder1.setLocale(locale7);
        java.util.Locale.Builder builder12 = builder1.clear();
        java.util.Locale locale13 = builder1.build();
        java.util.Locale locale15 = java.util.Locale.GERMANY;
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.lowerCase("CINESE", locale15);
        java.lang.String str17 = locale13.getDisplayVariant(locale15);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.lowerCase("eng", locale15);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "english" + "'", str8, "english");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "cinese" + "'", str16, "cinese");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "eng" + "'", str18, "eng");
    }

    @Test
    public void test14872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14872");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("          ", "\u82f1\u6587$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14873");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test14874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14874");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("..................chinois (Chine)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..................chinois (chine)" + "'", str1, "..................chinois (chine)");
    }

    @Test
    public void test14875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14875");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("xxxxxxxxxxFrlich(Fraicl)xxxxxxxxxx", "\u4e2d\u6587\u53f0\u7063");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14876");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                    ", (java.lang.CharSequence) "Locale.Builder");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test14877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14877");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ed", "\u53f0\u6e7e\u5730\u533a", 561);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14878");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\uc911\uad6d", "FranceseFranceseFranceseFranceseFrancslgne");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14879");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "                                             italiahi                                              ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: italiahi");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14880");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHNAAAAA", "CHN", 350);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHNAAAAA" + "'", str3, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHNAAAAA");
    }

    @Test
    public void test14881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14881");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("zh_ZH                                                                                                                   ", "STRING[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14882");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder2.setLanguage("HI");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setLanguage("ARRAYLIS");
        java.util.Locale.Builder builder10 = builder9.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("enenenenenenenenenen");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: enenenenenenenenenen [at index 0]");
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
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test14883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14883");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "hsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hz");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14884");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("ITFRITL", 350);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITFRITL" + "'", str2, "ITFRITL");
    }

    @Test
    public void test14885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14885");
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
        java.lang.String str35 = locale32.getDisplayLanguage();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "zh_tw" + "'", str35, "zh_tw");
    }

    @Test
    public void test14886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14886");
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
        boolean boolean17 = languageRangeList1.equals((java.lang.Object) 117);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor18 = languageRangeList1.listIterator();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "english" + "'", str14, "english");
        org.junit.Assert.assertNotNull(strComparableArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeItor18);
    }

    @Test
    public void test14887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14887");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("CINA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CINA$$$$$$$$$$$$$$$$$$$$$$$$$..." + "'", str2, "CINA$$$$$$$$$$$$$$$$$$$$$$$$$...");
    }

    @Test
    public void test14888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14888");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFrancese", 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test14889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14889");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                   ", "REFERENCEPIPELINE.HEAD                        list###########", "Hindi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test14890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14890");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("yListayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArraiiiiiiiiiiiiiiiiiiiiiiiAr", "kor", "ANIHC      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "yListayListiiiiiiiiiiiiiiiiiiiiiiiAIIayListiiiiiiiiiiiiiiiiiiiiiiiAIIayListiiiiiiiiiiiiiiiiiiiiiiiAIIayListiiiiiiiiiiiiiiiiiiiiiiiAIIayListiiiiiiiiiiiiiiiiiiiiiiiAIIayListiiiiiiiiiiiiiiiiiiiiiiiAIIayListiiiiiiiiiiiiiiiiiiiiiiiAIIayListiiiiiiiiiiiiiiiiiiiiiiiAIIaiiiiiiiiiiiiiiiiiiiiiiiAI" + "'", str3, "yListayListiiiiiiiiiiiiiiiiiiiiiiiAIIayListiiiiiiiiiiiiiiiiiiiiiiiAIIayListiiiiiiiiiiiiiiiiiiiiiiiAIIayListiiiiiiiiiiiiiiiiiiiiiiiAIIayListiiiiiiiiiiiiiiiiiiiiiiiAIIayListiiiiiiiiiiiiiiiiiiiiiiiAIIayListiiiiiiiiiiiiiiiiiiiiiiiAIIayListiiiiiiiiiiiiiiiiiiiiiiiAIIaiiiiiiiiiiiiiiiiiiiiiiiAI");
    }

    @Test
    public void test14891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14891");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aaaaaaadnu", "cINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA", 279);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14892");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "ChinChinChinNHCChinChinChin");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14893");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("c...", 116);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14894");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("zhcines", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Locale locale8 = new java.util.Locale("hindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHind", "locale.builder", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish");
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        java.lang.String str10 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet9);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertEquals(locale8.toString(), "hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihind_LOCALE.BUILDER_ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test14895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14895");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getLanguage();
        java.lang.String str2 = locale0.getLanguage();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale0.getISO3Language();
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
        java.lang.String str17 = locale7.getDisplayCountry();
        java.lang.String str18 = locale7.getDisplayLanguage();
        java.util.Locale locale19 = locale7.stripExtensions();
        java.lang.String str20 = locale0.getDisplayCountry(locale19);
        java.lang.String str21 = locale19.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it" + "'", str1, "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "it" + "'", str2, "it");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ita" + "'", str4, "ita");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u82f1\u6587" + "'", str10, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "english" + "'", str14, "english");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test14896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14896");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("                                                                                                                                                                                                                                                          EN-CASTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test14897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14897");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("AI", "chinois ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AI" + "'", str2, "AI");
    }

    @Test
    public void test14898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14898");
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("java.uil", locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale1.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for ZH");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-ZH" + "'", str2, "zh-ZH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.uil" + "'", str5, "java.uil");
    }

    @Test
    public void test14899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("ENGLISH", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ENGLISH" + "'", str2, "ENGLISH");
    }

    @Test
    public void test14900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14900");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("CN");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale6 = new java.util.Locale("\u6cd5\u6cd5\u6587\u6587ST", "German", "FRA");
        java.lang.String str7 = locale1.getDisplayName(locale6);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "cn");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals(locale6.toString(), "\u6cd5\u6cd5\u6587\u6587st_GERMAN_FRA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cn" + "'", str7, "cn");
    }

    @Test
    public void test14901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14901");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ithi!li", "#####################################################################################################################################################################################################################################################################################################################################hi!italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital..#####################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14902");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("##Italian", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test14903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14903");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("#...", "\u4e2d\u6587\u53f0\u7063)", (int) 'u');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14904");
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.lang.String str3 = locale1.getDisplayCountry(locale2);
        java.lang.String str4 = locale1.toLanguageTag();
        java.lang.String str5 = locale1.getCountry();
        java.lang.String str6 = locale1.toLanguageTag();
        java.lang.String str7 = locale1.getISO3Country();
        java.lang.String str8 = locale1.getDisplayName();
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                           Germn", locale1);
        boolean boolean10 = locale1.hasExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CN" + "'", str5, "CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CHN" + "'", str7, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str8, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                           GERMN" + "'", str9, "                                                                                           GERMN");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test14905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14905");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!STRING[...", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14906");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = new java.util.Locale("zh_C");
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale5.getDisplayCountry(locale6);
        java.lang.String str8 = locale5.toLanguageTag();
        java.lang.String str9 = locale5.getLanguage();
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.util.Locale locale12 = new java.util.Locale("");
        java.lang.String str13 = locale12.getDisplayLanguage();
        java.util.Locale locale14 = java.util.Locale.CANADA;
        java.lang.String str15 = locale14.getDisplayLanguage();
        java.lang.String str16 = locale12.getDisplayScript(locale14);
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale18);
        java.lang.String str20 = locale12.getDisplayCountry(locale18);
        java.lang.String str21 = locale10.getDisplayScript(locale12);
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.lang.String str23 = locale12.getDisplayLanguage(locale22);
        java.lang.String str24 = locale5.getDisplayCountry(locale12);
        java.util.Locale.setDefault(category0, locale12);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_ZH");
        org.junit.Assert.assertEquals(locale3.toString(), "zh_c");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd" + "'", str7, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh-CN" + "'", str8, "zh-CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh" + "'", str9, "zh");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "English" + "'", str15, "English");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "english" + "'", str19, "english");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "China" + "'", str24, "China");
    }

    @Test
    public void test14907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14907");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ANIHC               EN_ca                                                                 ", 18, "CINA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ANIHC               EN_ca                                                                 " + "'", str3, "ANIHC               EN_ca                                                                 ");
    }

    @Test
    public void test14908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14908");
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
        java.util.Locale.LanguageRange languageRange30 = new java.util.Locale.LanguageRange("Chine");
        boolean boolean31 = languageRangeList1.add(languageRange30);
        java.util.Locale locale33 = java.util.Locale.forLanguageTag("Englisch");
        java.util.Set<java.lang.String> strSet34 = locale33.getUnicodeLocaleKeys();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList36 = java.util.Locale.LanguageRange.parse("hi");
        int int38 = languageRangeList36.indexOf((java.lang.Object) '4');
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap42 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList43 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, strMap42);
        int int44 = languageRangeList40.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean48 = languageRangeList46.remove((java.lang.Object) "English");
        boolean boolean49 = languageRangeList40.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46);
        java.util.Locale.LanguageRange[] languageRangeArray50 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList51 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList51, languageRangeArray50);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap53 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList54 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, strMap53);
        java.lang.String[] strArray62 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        java.util.List<java.lang.Class<?>> wildcardClassList65 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList63);
        java.lang.String str66 = java.util.Locale.lookupTag(languageRangeList54, (java.util.Collection<java.lang.String>) strList63);
        java.util.List<java.lang.Class<?>> wildcardClassList67 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList63);
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList63);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap70 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList71 = java.util.Locale.LanguageRange.parse("Cina", strMap70);
        java.lang.String[] strArray75 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList76 = new java.util.ArrayList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        java.util.Locale.FilteringMode filteringMode78 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList79 = java.util.Locale.filterTags(languageRangeList71, (java.util.Collection<java.lang.String>) strList76, filteringMode78);
        java.util.List<java.lang.String> strList80 = java.util.Locale.filterTags(languageRangeList36, (java.util.Collection<java.lang.String>) strList63, filteringMode78);
        java.util.List<java.lang.String> strList81 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet34, filteringMode78);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "englisch");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(languageRangeList36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(languageRangeList43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(languageRangeList46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(languageRangeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(languageRangeList54);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(wildcardClassList65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(wildcardClassList67);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(languageRangeList71);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + filteringMode78 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode78.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertNotNull(strList81);
    }

    @Test
    public void test14909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14909");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14910");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("ithi!lihi!no", "lang)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test14911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14911");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("En");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14912");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Chinese", "tsiLyarrAH");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("Ci_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_a", strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi", "A", (int) (short) -1);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("n       a                                           ", strArray4, strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "n       a                                           " + "'", str12, "n       a                                           ");
    }

    @Test
    public void test14913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14913");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\u4e2d\u6587\u4e2d\u570b)", "ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "Engl....englishs....englis");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test14914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14914");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ChinChinChinChinChinChinChinChinChinaaaaaaaaa$                                                    ", 42, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ChinChinChinChinChinChinChinChinChinaaaaaaaaa$                                                    " + "'", str3, "ChinChinChinChinChinChinChinChinChinaaaaaaaaa$                                                    ");
    }

    @Test
    public void test14915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14915");
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
        java.lang.String str23 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRangeList1, "Chinese (China)");
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, strMap27);
        int int29 = languageRangeList25.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList31 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean33 = languageRangeList31.remove((java.lang.Object) "English");
        boolean boolean34 = languageRangeList25.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31);
        int int35 = languageRangeList31.size();
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor36 = languageRangeList31.iterator();
        java.util.Locale.Builder builder37 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder38 = builder37.clearExtensions();
        java.util.Locale locale39 = builder37.build();
        java.lang.String str40 = locale39.getDisplayName();
        java.util.Locale locale41 = null;
        java.lang.String str42 = locale39.getDisplayVariant(locale41);
        java.lang.String str43 = locale39.getDisplayVariant();
        java.lang.String str44 = locale39.getVariant();
        java.util.Set<java.lang.String> strSet45 = locale39.getUnicodeLocaleAttributes();
        java.lang.String str46 = java.util.Locale.lookupTag(languageRangeList31, (java.util.Collection<java.lang.String>) strSet45);
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet45);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor48 = languageRangeList1.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange49 = languageRangeItor48.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(languageRangeItor21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ArrayList" + "'", str23, "ArrayList");
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(languageRangeList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(languageRangeItor36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(languageRangeItor48);
    }

    @Test
    public void test14916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14916");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("#########################       HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########################       hi!" + "'", str1, "#########################       hi!");
    }

    @Test
    public void test14917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14917");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor19 = languageRangeList2.listIterator(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9");
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
    }

    @Test
    public void test14918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14918");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("YT.ZA.ZM.ZW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "YT.ZA.ZM.ZW" + "'", str1, "YT.ZA.ZM.ZW");
    }

    @Test
    public void test14919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14919");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("friFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfricines                                                                                                                                                                                                                                                                                  friFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfri");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "friFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfricines                                                                                                                                                                                                                                                                                  friFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfri" + "'", str1, "friFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfricines                                                                                                                                                                                                                                                                                  friFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfri");
    }

    @Test
    public void test14920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14920");
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
        java.lang.Class<?>[] wildcardClassArray78 = null;
        boolean boolean79 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, wildcardClassArray78);
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
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test14921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14921");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "har[].............................................................................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test14922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14922");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                 a                 ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '$');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$$$$$$$$$$$$$$$$$a$$$$$$$$$$$$$$$$$" + "'", str3, "$$$$$$$$$$$$$$$$$a$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test14923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14923");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)Character", "              javacinese.cineselang");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)Character" + "'", str2, "CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)Character");
    }

    @Test
    public void test14924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14924");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\u30c9\u30a4\u30c4\u8a9e");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test14925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("latiarfati", 561);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "latiarfati" + "'", str2, "latiarfati");
    }

    @Test
    public void test14926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14926");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.lang.String str10 = locale9.toLanguageTag();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("hi!", locale9);
        java.lang.String str13 = locale9.getExtension('a');
        java.util.Locale.Builder builder14 = builder7.setLocale(locale9);
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder15.addUnicodeLocaleAttribute("...x.z.b.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn..");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ...x.z.b.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.. [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "china_CN");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-CA" + "'", str10, "en-CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test14927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14927");
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
            java.util.Locale.Builder builder13 = builder9.setRegion("xxxxxxxxxxxxxxxxxxxxxxxxxENGLIILISH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: xxxxxxxxxxxxxxxxxxxxxxxxxENGLIILISH [at index 0]");
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
    public void test14928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14928");
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
        java.lang.String str77 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, 'x');
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
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "i");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "China" + "'", str17, "China");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh-CN" + "'", str18, "zh-CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "i");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "China" + "'", str21, "China");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "i");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "China" + "'", str24, "China");
        org.junit.Assert.assertEquals(locale28.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "i");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "China" + "'", str31, "China");
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
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "English" + "'", str63, "English");
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
    }

    @Test
    public void test14929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14929");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("china", "cn", 100);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("hindi (HI!,cHINA)", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "ngls");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "CNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLIST");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "china" + "'", str7, "china");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test14930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14930");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("GBR");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test14931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14931");
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
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream60 = languageRangeList43.parallelStream();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream61 = languageRangeList43.parallelStream();
        java.util.Collection<java.util.Locale.LanguageRange> languageRangeCollection62 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean63 = languageRangeList43.addAll(languageRangeCollection62);
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
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "i");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "China" + "'", str15, "China");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh-CN" + "'", str16, "zh-CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "i");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "China" + "'", str19, "China");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "i");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "China" + "'", str22, "China");
        org.junit.Assert.assertEquals(locale26.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "i");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "China" + "'", str29, "China");
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
        org.junit.Assert.assertNotNull(languageRangeStream60);
        org.junit.Assert.assertNotNull(languageRangeStream61);
    }

    @Test
    public void test14932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14932");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("hI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI" + "'", str1, "hI");
    }

    @Test
    public void test14933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14933");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("HI", "nwtsnwtlgne", 43);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHI" + "'", str3, "HInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHInwtsnwtlgneHI");
    }

    @Test
    public void test14934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14934");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aI", 990);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aI" + "'", str2, "aI");
    }

    @Test
    public void test14935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14935");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("                  hI   Taiwan                  hI   xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hitaiwanhixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14936");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale2);
        java.util.Locale.setDefault(locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setRegion("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaNHC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaNHC [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "english" + "'", str3, "english");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test14937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14937");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, "cinese (Taiwan)");
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor5 = languageRangeList2.listIterator();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap6);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, strMap11);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream13 = languageRangeList9.stream();
        boolean boolean14 = languageRangeList9.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, strMap18);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor20 = languageRangeList19.listIterator();
        boolean boolean21 = languageRangeList9.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19);
        java.lang.String str23 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) languageRangeList19, "Chinese");
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Chin", "english");
        boolean boolean28 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                    ", strArray27);
        boolean boolean29 = languageRangeList19.equals((java.lang.Object) strArray27);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream30 = languageRangeList19.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap34 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, strMap34);
        java.lang.String[] strArray43 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.List<java.lang.Class<?>> wildcardClassList46 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList44);
        java.lang.String str47 = java.util.Locale.lookupTag(languageRangeList35, (java.util.Collection<java.lang.String>) strList44);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList49 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean51 = languageRangeList49.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange[] languageRangeArray52 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList53 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53, languageRangeArray52);
        java.util.Locale locale56 = java.util.Locale.FRANCE;
        java.lang.String str57 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale56);
        java.util.Locale locale58 = java.util.Locale.US;
        java.util.Locale locale59 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale60 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale61 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale62 = java.util.Locale.getDefault();
        java.lang.String str63 = locale61.getDisplayCountry(locale62);
        java.lang.String str64 = locale61.toLanguageTag();
        java.util.Locale locale65 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale66 = java.util.Locale.getDefault();
        java.lang.String str67 = locale65.getDisplayCountry(locale66);
        java.util.Locale locale68 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale69 = java.util.Locale.getDefault();
        java.lang.String str70 = locale68.getDisplayCountry(locale69);
        java.util.Locale locale74 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale75 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale76 = java.util.Locale.getDefault();
        java.lang.String str77 = locale75.getDisplayCountry(locale76);
        java.util.Locale locale79 = new java.util.Locale("");
        java.lang.String str80 = locale79.getDisplayVariant();
        java.util.Locale locale81 = java.util.Locale.KOREAN;
        java.util.Locale locale83 = new java.util.Locale("");
        java.util.Locale locale84 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray85 = new java.util.Locale[] { locale56, locale58, locale59, locale60, locale61, locale66, locale68, locale74, locale76, locale79, locale81, locale83, locale84 };
        java.util.ArrayList<java.util.Locale> localeList86 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList86, localeArray85);
        java.util.List<java.util.Locale> localeList88 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, (java.util.Collection<java.util.Locale>) localeList86);
        java.util.List<java.util.Locale> localeList89 = java.util.Locale.filter(languageRangeList49, (java.util.Collection<java.util.Locale>) localeList86);
        java.util.List<java.util.Locale> localeList90 = java.util.Locale.filter(languageRangeList35, (java.util.Collection<java.util.Locale>) localeList89);
        java.util.Locale locale91 = java.util.Locale.lookup(languageRangeList19, (java.util.Collection<java.util.Locale>) localeList89);
        java.util.List<java.util.Locale> localeList92 = java.util.Locale.filter(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList89);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeItor5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertNotNull(languageRangeItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.util" + "'", str23, "java.util");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(languageRangeStream30);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(languageRangeList35);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClassList46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(languageRangeList49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(languageRangeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "english" + "'", str57, "english");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Chine" + "'", str63, "Chine");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "zh-CN" + "'", str64, "zh-CN");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Chine" + "'", str67, "Chine");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Chine" + "'", str70, "Chine");
        org.junit.Assert.assertEquals(locale74.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Chine" + "'", str77, "Chine");
        org.junit.Assert.assertEquals(locale79.toString(), "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "ko");
        org.junit.Assert.assertEquals(locale83.toString(), "");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(localeList88);
        org.junit.Assert.assertNotNull(localeList89);
        org.junit.Assert.assertNotNull(localeList90);
        org.junit.Assert.assertNull(locale91);
        org.junit.Assert.assertNotNull(localeList92);
    }

    @Test
    public void test14938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14938");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("ese(Taiwan$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "\u4e2d\u56fdAD.AE.AF.A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ese(Taiwan$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, "ese(Taiwan$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test14939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14939");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("lang", "                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lang" + "'", str2, "lang");
    }

    @Test
    public void test14940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14940");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("ArrayList.ListItrArrayList.ListItrArrayList.ListItrArrayList.ListItrArrayList.ListIfran\347ais (France)", "ESESENICHZ.....");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ArrayList.ListItrArrayList.ListItrArrayList.ListItrArrayList.ListItrArrayList.ListIfran\347ais (France)" + "'", str2, "ArrayList.ListItrArrayList.ListItrArrayList.ListItrArrayList.ListItrArrayList.ListIfran\347ais (France)");
    }

    @Test
    public void test14941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14941");
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
        java.util.List<java.lang.Class<?>> wildcardClassList50 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList45);
        java.util.List<java.lang.Class<?>> wildcardClassList51 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList45);
        java.util.List<java.lang.Class<?>> wildcardClassList52 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList45);
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
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chine" + "'", str11, "Chine");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh-CN" + "'", str12, "zh-CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Chine" + "'", str15, "Chine");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Chine" + "'", str18, "Chine");
        org.junit.Assert.assertEquals(locale22.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Chine" + "'", str25, "Chine");
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
        org.junit.Assert.assertNotNull(wildcardClassList50);
        org.junit.Assert.assertNotNull(wildcardClassList51);
        org.junit.Assert.assertNotNull(wildcardClassList52);
    }

    @Test
    public void test14942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14942");
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
        java.util.Locale.Builder builder22 = builder20.clear();
        java.util.Locale.Builder builder23 = builder20.clearExtensions();
        java.util.Locale.Builder builder25 = builder20.setVariant("rancese");
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
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test14943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14943");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihind (LOCALE.BUILDER,ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish)", "\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihind (LOCALE.BUILDER,ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish)" + "'", str2, "hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihind (LOCALE.BUILDER,ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish)");
    }

    @Test
    public void test14944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14944");
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
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap30 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList31 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, strMap30);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        boolean boolean35 = languageRangeList28.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33);
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
        boolean boolean47 = languageRangeList28.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42);
        java.lang.Object[] objArray48 = languageRangeList42.toArray();
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap52 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList53 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, strMap52);
        int int54 = languageRangeList50.size();
        java.lang.Class[] classArray56 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray57 = (java.lang.Class<?>[]) classArray56;
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray56);
        boolean boolean59 = languageRangeList50.equals((java.lang.Object) wildcardClassArray58);
        boolean boolean60 = languageRangeList50.isEmpty();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor61 = languageRangeList50.listIterator();
        boolean boolean62 = languageRangeList42.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50);
        boolean boolean63 = languageRangeList50.isEmpty();
        java.lang.String[] strArray66 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Engls", "CHINA");
        int int67 = languageRangeList50.indexOf((java.lang.Object) strArray66);
        boolean boolean68 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50);
        int int69 = languageRangeList1.size();
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
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(languageRangeList31);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(languageRangeList40);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(languageRangeList53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(languageRangeItor61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test14945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14945");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ESESENICHZ.....", "ShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShort", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14946");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "l.avajstring[]string[]string[");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test14947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14947");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "chinchinchinchinchinchinchinchinchin$$$$$$$$$#", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: chinchinchinchinchinchinchinchinchin$$$$$$$$$#");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14948");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\u30c9\u30a4\u30c4\u8a9e");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14949");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream3 = languageRangeList1.parallelStream();
        int int5 = languageRangeList1.lastIndexOf((java.lang.Object) "Short");
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList1.iterator();
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor12 = languageRangeList11.listIterator();
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap16 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, strMap16);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor18 = languageRangeList17.listIterator();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Locale locale27 = java.util.Locale.FRANCE;
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale27);
        java.util.Locale locale29 = java.util.Locale.US;
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale31 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale32 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale33 = java.util.Locale.getDefault();
        java.lang.String str34 = locale32.getDisplayCountry(locale33);
        java.lang.String str35 = locale32.toLanguageTag();
        java.util.Locale locale36 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.lang.String str38 = locale36.getDisplayCountry(locale37);
        java.util.Locale locale39 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.lang.String str41 = locale39.getDisplayCountry(locale40);
        java.util.Locale locale45 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale46 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.lang.String str48 = locale46.getDisplayCountry(locale47);
        java.util.Locale locale50 = new java.util.Locale("");
        java.lang.String str51 = locale50.getDisplayVariant();
        java.util.Locale locale52 = java.util.Locale.KOREAN;
        java.util.Locale locale54 = new java.util.Locale("");
        java.util.Locale locale55 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray56 = new java.util.Locale[] { locale27, locale29, locale30, locale31, locale32, locale37, locale39, locale45, locale47, locale50, locale52, locale54, locale55 };
        java.util.ArrayList<java.util.Locale> localeList57 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList57, localeArray56);
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.util.Locale>) localeList57);
        java.lang.String[] strArray67 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        java.util.List<java.lang.Class<?>> wildcardClassList70 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList68);
        java.util.Locale.FilteringMode filteringMode71 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList72 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.lang.String>) strList68, filteringMode71);
        java.util.List<java.lang.String> strList73 = java.util.Locale.filterTags(languageRangeList17, (java.util.Collection<java.lang.String>) strList21, filteringMode71);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor74 = languageRangeList17.listIterator();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream75 = languageRangeList17.parallelStream();
        boolean boolean76 = languageRangeList11.remove((java.lang.Object) languageRangeStream75);
        java.util.Locale.Builder builder77 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder79 = builder77.setScript("");
        boolean boolean80 = languageRangeList11.contains((java.lang.Object) "");
        boolean boolean81 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream82 = languageRangeList11.stream();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap83 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList84 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList11, strMap83);
        java.lang.Object[] objArray85 = languageRangeList84.toArray();
        java.lang.String[] strArray88 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("rglAsA", "italien");
        int int89 = languageRangeList84.indexOf((java.lang.Object) "rglAsA");
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeItor12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertNotNull(languageRangeItor18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "english" + "'", str28, "english");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Chine" + "'", str34, "Chine");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "zh-CN" + "'", str35, "zh-CN");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Chine" + "'", str38, "Chine");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Chine" + "'", str41, "Chine");
        org.junit.Assert.assertEquals(locale45.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Chine" + "'", str48, "Chine");
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ko");
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(localeList59);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(wildcardClassList70);
        org.junit.Assert.assertTrue("'" + filteringMode71 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode71.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(languageRangeItor74);
        org.junit.Assert.assertNotNull(languageRangeStream75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(languageRangeStream82);
        org.junit.Assert.assertNotNull(languageRangeList84);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray85), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray85), "[]");
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
    }

    @Test
    public void test14950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14950");
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
        int int61 = languageRangeList1.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor62 = languageRangeList1.listIterator();
        java.lang.String str64 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor62, 'a');
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
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test14951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14951");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "cCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina (CCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 211 + "'", int1 == 211);
    }

    @Test
    public void test14952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14952");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "locale.Builder");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: locale/Builder");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14953");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "RGLaSa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RGLaSa" + "'", str1, "RGLaSa");
    }

    @Test
    public void test14954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14954");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("LOCALE.BUILDEtLOCALE.BUILDElLOCALE.BUILDELOCALE.BUILDELOCALE.BUILDEo");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LOCALE.BUILDEtLOCALE.BUILDElLOCALE.BUILDELOCALE.BUILDELOCALE.BUILDEo" + "'", str1, "LOCALE.BUILDEtLOCALE.BUILDElLOCALE.BUILDELOCALE.BUILDELOCALE.BUILDEo");
    }

    @Test
    public void test14955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14955");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "zh_ZH", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: zh_ZH");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14956");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "LANGUAGERANGEAD.AE.AF.AGchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test14957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14957");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "..................chinois (chine)", "XXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXX                                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14958");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("COLLECTI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14959");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                                                                                                                                                                                                                                                                                                   lang)                                                                                                                                                                                                                                                                                                                                                                                   ", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                   lang)                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                   lang)                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test14960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14960");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale7 = builder5.build();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("esecnarF", locale7);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "esecnarf" + "'", str8, "esecnarf");
    }

    @Test
    public void test14961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14961");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ANIHCXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test14962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14962");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "anihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14963");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("zh-CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
    }

    @Test
    public void test14964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14964");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("en_CA", "Class[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test14965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14965");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("china (Chine)", 100, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuchina (Chine)" + "'", str3, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuchina (Chine)");
    }

    @Test
    public void test14966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14966");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("CN");
        java.util.Locale locale4 = new java.util.Locale("$", "java.lang");
        java.util.Locale locale9 = new java.util.Locale("Cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engli", "us");
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.util.Locale locale13 = new java.util.Locale("italiano", "Ci_a");
        java.util.Locale locale17 = new java.util.Locale("Canada", "allemand", "cHINA");
        java.lang.String str18 = locale13.getDisplayName(locale17);
        java.util.Set<java.lang.Character> charSet19 = locale13.getExtensionKeys();
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.lang.String str21 = locale13.getDisplayVariant(locale20);
        java.lang.String str22 = locale13.getScript();
        java.lang.String str23 = locale9.getDisplayCountry(locale13);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.upperCase("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish", locale9);
        java.lang.String str25 = locale4.getDisplayCountry(locale9);
        java.lang.String str26 = locale1.getDisplayScript(locale9);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "cn");
        org.junit.Assert.assertEquals(locale4.toString(), "$_JAVA.LANG");
        org.junit.Assert.assertEquals(locale9.toString(), "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI_us");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str10, "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals(locale13.toString(), "italiano_CI_A");
        org.junit.Assert.assertEquals(locale17.toString(), "canada_ALLEMAND_cHINA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "italiano (CI_A)" + "'", str18, "italiano (CI_A)");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI" + "'", str23, "GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HENGLISH" + "'", str24, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HENGLISH");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "JAVA.LANG" + "'", str25, "JAVA.LANG");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test14967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14967");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\u82f1\u6587\u7f8e\u56fd)", "javacinese.cineselang                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14968");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ZH", ".....ZHCINESES");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("FRAN\307AIS", "fr-FRSTI-F");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRAN\307AIS" + "'", str2, "FRAN\307AIS");
    }

    @Test
    public void test14970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14970");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxUSxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14971");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.setRegion("zh");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.addUnicodeLocaleAttribute("CAN");
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = locale10.getDisplayCountry(locale11);
        java.lang.String str13 = locale10.toLanguageTag();
        java.lang.String str14 = locale10.getVariant();
        java.util.Locale.Builder builder15 = builder6.setLocale(locale10);
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("CN");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.parse("hi");
        java.util.Locale.LanguageRange languageRange21 = new java.util.Locale.LanguageRange("cn");
        boolean boolean22 = languageRangeList19.add(languageRange21);
        java.util.Locale locale23 = java.util.Locale.ITALIAN;
        java.util.Locale locale25 = new java.util.Locale("");
        java.lang.String str26 = locale25.getDisplayLanguage();
        java.util.Locale locale27 = java.util.Locale.CANADA;
        java.lang.String str28 = locale27.getDisplayLanguage();
        java.lang.String str29 = locale25.getDisplayScript(locale27);
        java.util.Locale locale31 = java.util.Locale.FRANCE;
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale31);
        java.lang.String str33 = locale25.getDisplayCountry(locale31);
        java.lang.String str34 = locale23.getDisplayScript(locale25);
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.lang.String str36 = locale25.getDisplayLanguage(locale35);
        java.util.Locale locale39 = new java.util.Locale("");
        java.lang.String str40 = locale39.getDisplayLanguage();
        java.util.Locale locale41 = java.util.Locale.CANADA;
        java.lang.String str42 = locale41.getDisplayLanguage();
        java.lang.String str43 = locale39.getDisplayScript(locale41);
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale39);
        java.lang.String str45 = locale39.getDisplayScript();
        java.lang.String str46 = locale35.getDisplayLanguage(locale39);
        java.util.Set<java.lang.String> strSet47 = locale35.getUnicodeLocaleAttributes();
        boolean boolean48 = languageRangeList19.remove((java.lang.Object) locale35);
        java.lang.String str49 = locale35.getVariant();
        java.util.Locale locale50 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet51 = locale50.getExtensionKeys();
        java.util.Set<java.lang.String> strSet52 = locale50.getUnicodeLocaleAttributes();
        java.lang.String str53 = locale35.getDisplayName(locale50);
        java.lang.String str54 = locale17.getDisplayName(locale50);
        java.lang.String str55 = locale10.getDisplayVariant(locale50);
        java.lang.String str56 = locale10.getDisplayCountry();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cina" + "'", str12, "Cina");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh-CN" + "'", str13, "zh-CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "cn");
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "inglese" + "'", str28, "inglese");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "english" + "'", str32, "english");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "de");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "inglese" + "'", str42, "inglese");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "a" + "'", str44, "a");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "German" + "'", str46, "German");
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet51);
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\u5fb7\u6587" + "'", str53, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "cn" + "'", str54, "cn");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Cina" + "'", str56, "Cina");
    }

    @Test
    public void test14972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14972");
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
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hI", "ingleseu");
        boolean boolean22 = languageRangeList16.contains((java.lang.Object) "ingleseu");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap24 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.parse("ANIHC      ", strMap24);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap29 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, strMap29);
        boolean boolean31 = languageRangeList30.isEmpty();
        boolean boolean32 = languageRangeList25.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30);
        boolean boolean33 = languageRangeList16.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Locale.LanguageRange" + "'", str12, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test14973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14973");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("anglais (Canada", "chinaundaaaaaaachinaundaaaaaaachinaundaaaaaaahi-chinaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachina");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chinaundaaaaaaachinaundaaaaaaachinaundaaaaaaahi-chinaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachina" + "'", str2, "chinaundaaaaaaachinaundaaaaaaachinaundaaaaaaahi-chinaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachina");
    }

    @Test
    public void test14974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14974");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("cINACINzcINACINA", "Double");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14975");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("   ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("String", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) strArray3, "");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("languagerange", '$');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("   ", strArray3, strArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "String[]" + "'", str6, "String[]");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "languagerange" + "'", str10, "languagerange");
    }

    @Test
    public void test14976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14976");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("An");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aN" + "'", str1, "aN");
    }

    @Test
    public void test14977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14977");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "REFERENCEPIPELINE.HEAD", (java.lang.CharSequence) "HArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLiHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArrayLiHArrayLihIHArrayLihIHArrayLihIHArrayLihIHArray.....");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 742 + "'", int2 == 742);
    }

    @Test
    public void test14978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14978");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                ese(Taiwan");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                ese(Taiwan" + "'", str1, "                                ese(Taiwan");
    }

    @Test
    public void test14979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14979");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("slgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslg.......................HI.......................slgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgn", "arraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslg.......................HI.......................slgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslg" + "'", str2, "gneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslg.......................HI.......................slgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslg");
    }

    @Test
    public void test14980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14980");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test14981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14981");
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
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList4, "EnglCNsCN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange24 = languageRangeList4.remove((int) '$');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 36, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test14982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14982");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("Chinese (China)", "                    nglish  Hindi (HI!,cHINA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    nglish  Hindi (HI!,cHINA" + "'", str2, "                    nglish  Hindi (HI!,cHINA");
    }

    @Test
    public void test14983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14983");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("it-CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IT-CN" + "'", str1, "IT-CN");
    }

    @Test
    public void test14984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14984");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hI", "DE ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14985");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("Locale.Builder[]stringstringstri", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Locale.Builder[]stringstringstri" + "'", str2, "Locale.Builder[]stringstringstri");
    }

    @Test
    public void test14986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14986");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ChinChinChinChinChiChinChinChinChinC                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ChinChinChinChinChiChinChinChinChinC");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14987");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("United States", "Japanese", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14988");
        java.util.Locale locale1 = new java.util.Locale("-CA");
        org.junit.Assert.assertEquals(locale1.toString(), "-ca");
    }

    @Test
    public void test14989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14989");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("444444444][gnirts4444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 444444444][gnirts4444444444");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14990");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("anglais (Canada)", "EN_cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais (Canada)" + "'", str2, "anglais (Canada)");
    }

    @Test
    public void test14991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14991");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b)", (java.lang.CharSequence) "uuuuuxxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxxuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14992");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\u7fa9\u5927\u5229", 46);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14993");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("italie", 350);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test14994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14994");
        java.util.Locale locale2 = new java.util.Locale("......", "ANIHC               EN_ca");
        org.junit.Assert.assertEquals(locale2.toString(), "......_ANIHC               EN_CA");
    }

    @Test
    public void test14995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14995");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("ese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwan", "                                        f   ch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwan" + "'", str2, "ese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwan");
    }

    @Test
    public void test14996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14996");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("\u672c\u65e5", "hindi(HI!,cHINA)", "CN        ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test14997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14997");
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
        java.lang.String str12 = locale8.getLanguage();
        java.lang.String str13 = locale8.getScript();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr" + "'", str12, "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test14998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14998");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("ANIHC");
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("ud");
        java.util.Locale.Builder builder9 = builder6.setLocale(locale8);
        java.util.Locale locale13 = new java.util.Locale("Cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engli", "us");
        java.util.Locale locale14 = locale13.stripExtensions();
        java.util.Locale locale15 = null;
        java.lang.String str16 = locale14.getDisplayScript(locale15);
        java.lang.String str17 = locale14.getDisplayVariant();
        java.util.Locale locale19 = new java.util.Locale("");
        java.lang.String str20 = locale19.getISO3Country();
        java.util.Locale locale21 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = locale21.getDisplayCountry(locale22);
        java.lang.String str24 = locale21.getLanguage();
        java.lang.String str25 = locale21.getVariant();
        java.lang.String str26 = locale19.getDisplayLanguage(locale21);
        java.lang.String str27 = locale19.getVariant();
        java.lang.String str28 = locale14.getDisplayLanguage(locale19);
        java.util.Locale locale31 = new java.util.Locale("");
        java.lang.String str32 = locale31.getDisplayLanguage();
        java.util.Locale locale33 = java.util.Locale.CANADA;
        java.lang.String str34 = locale33.getDisplayLanguage();
        java.lang.String str35 = locale31.getDisplayScript(locale33);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale31);
        java.lang.String str37 = locale31.getDisplayScript();
        java.util.Set<java.lang.String> strSet38 = locale31.getUnicodeLocaleAttributes();
        java.util.Locale locale39 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.lang.String str41 = locale39.getDisplayCountry(locale40);
        java.lang.String str42 = locale39.toLanguageTag();
        java.lang.String str43 = locale39.getLanguage();
        java.util.Locale locale44 = java.util.Locale.ITALIAN;
        java.util.Locale locale46 = new java.util.Locale("");
        java.lang.String str47 = locale46.getDisplayLanguage();
        java.util.Locale locale48 = java.util.Locale.CANADA;
        java.lang.String str49 = locale48.getDisplayLanguage();
        java.lang.String str50 = locale46.getDisplayScript(locale48);
        java.util.Locale locale52 = java.util.Locale.FRANCE;
        java.lang.String str53 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale52);
        java.lang.String str54 = locale46.getDisplayCountry(locale52);
        java.lang.String str55 = locale44.getDisplayScript(locale46);
        java.util.Locale locale56 = java.util.Locale.GERMAN;
        java.lang.String str57 = locale46.getDisplayLanguage(locale56);
        java.lang.String str58 = locale39.getDisplayCountry(locale46);
        java.util.Locale locale59 = locale39.stripExtensions();
        java.lang.String str60 = locale31.getDisplayVariant(locale59);
        java.util.Locale.setDefault(locale31);
        java.lang.String str62 = locale31.getDisplayLanguage();
        java.lang.String str63 = locale31.toLanguageTag();
        java.lang.String str64 = locale31.getScript();
        java.lang.String str65 = locale19.getDisplayVariant(locale31);
        java.util.Locale.Builder builder66 = builder6.setLocale(locale19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder68 = builder6.setLanguage("HI!HI!HI!HI!HI!HI");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: HI!HI!HI!HI!HI!HI [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ud");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals(locale13.toString(), "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI_us");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI_us");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "us" + "'", str17, "us");
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Chine" + "'", str23, "Chine");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "zh" + "'", str24, "zh");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str28, "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "anglais" + "'", str34, "anglais");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "a" + "'", str36, "a");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Chine" + "'", str41, "Chine");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "zh-CN" + "'", str42, "zh-CN");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "zh" + "'", str43, "zh");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "it");
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "anglais" + "'", str49, "anglais");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "english" + "'", str53, "english");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "de");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "China" + "'", str58, "China");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "und" + "'", str63, "und");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(builder66);
    }

    @Test
    public void test14999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14999");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u5927\u62ff\u52a0\u6587\u82f1");
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test15000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test15000");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("C", 6, "################################################################################################################lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "C#####" + "'", str3, "C#####");
    }
}
